package com.zy.demo.servlet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zy.demo.bean.GrainCardPrintBO;
import com.zy.demo.bean.RenderCell;
import com.zy.demo.bean.RenderData;
import com.zy.demo.utils.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "OutServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        // 做好判断防止传入非法字符
        int monthCount = Integer.parseInt(request.getParameter("monthCount"));
        int startYear = Integer.parseInt(request.getParameter("startYear"));
        int startMonth = Integer.parseInt(request.getParameter("startMonth"));

        // 模拟数据
        String rowsString = FileUtils.readFileContent(this.getServletContext().getRealPath("asstes/data.json"));
        List<GrainCardPrintBO> grainCardPrintBOList = new Gson().fromJson(rowsString, new TypeToken<List<GrainCardPrintBO>>() {
        }.getType());

        // 所有人的小票列表
        List<RenderData> tickets = new ArrayList();
        int rowLen = grainCardPrintBOList.size();
        for (int i = 0; i < rowLen; i++) {
            RenderData renderData = new RenderData<GrainCardPrintBO>();
            GrainCardPrintBO grainCardPrintBO = grainCardPrintBOList.get(i);
            renderData.setInfo(grainCardPrintBO);
            // 准备当前行的几个月的数据
            RenderCell[] renderCellArray = new RenderCell[monthCount];
            for (int j = 0; j < monthCount; j++) {
                RenderCell renderCell = new RenderCell();
                int yearMonth[] = getYearMonth(startYear,startMonth,monthCount,j);
                renderCell.setYear(yearMonth[0]);
                renderCell.setMonth(yearMonth[1]);
                renderCell.setOtherNo("8888 8888");
                renderCell.setArchivesNo(grainCardPrintBO.getArchivesNo());
                renderCellArray[j] = renderCell;
            }
            renderData.setRenderCells(renderCellArray);
            tickets.add(renderData);
        }
        System.out.println(new Gson().toJson(tickets, new TypeToken<List<GrainCardPrintBO>>() {
        }.getType()));
        request.setAttribute("tickets", tickets); // 数据列表
        request.getRequestDispatcher("printTicket.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * 计算当前年份和月份
     * @param year 开始年
     * @param month 开始月
     * @param monthCount 开始年月累加的月份，位置从0开始
     * @param counter  开始年月累加月份时的计数器
     * @return 数组1为年,数组2位月
     */
    public int[] getYearMonth(int year , int month, int monthCount, int counter) {
        // 初始值
        int currentYear = 0;
        int currentMonth = 0;
        // 开始月是11月，总打印月数为3个月，年份往后滚动一年并计算出月份
        // 开始月是12月，总打印月数为2个月，年份往后滚动一年并计算出月份
        if (month == 11 && monthCount > 2 && counter > 1 || month == 12 && monthCount > 1 && counter > 0) {
            currentYear = year + 1;
            currentMonth = (month + counter) - 12; // 新年正月
        } else {
            // 月份不溢出时的正常情况
            currentYear = year;
            currentMonth = month + counter;
        }
        return new int[]{currentYear,currentMonth};
    }
}
