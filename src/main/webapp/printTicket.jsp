<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: banzhenyu
  Date: 2019/11/26
  Time: 1:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        html,body{
            /*
            消除默认样式（浏览器默认有个margin）
            */
            margin: 0 0 0 0;
            padding: 0 0 0 0;
        }
        .ticket-item {
            /*最外层水平布局*/
            display: flex;
            flex-direction: row;
            background-color: rebeccapurple;
        }

        .ticket-info {
            /*左侧信息垂直布局*/
            display: flex;
            flex-direction: column;
            justify-content: flex-start;
            background-color: blueviolet;
        }

        .ticket-info-title {
            color: chartreuse;
        }
        .ticket-cells {
            /*右面每个人的条目垂直布局*/
            display: flex;
            flex-direction: column;
            background-color: aquamarine;
        }

        .cell {
            display: flex;
            min-width: 100px;
            /*右面每个人的条目里的元素垂直布局*/
            flex-direction: column;
            justify-content: flex-end;
            background-color: coral;
        }

        .cell p {
            /*右面每个人的条目里的元素的文字右侧显示*/
            background-color: chartreuse;
            text-align: end;
        }
        .smart-show {
            /*如果想隐藏非打印字段就把下面注释放开*/
            /*visibility: hidden;*/
        }
    </style>
</head>
<body>
<c:forEach var="ticketItem" items="${tickets}" varStatus="ticketStatus">
    <div class="ticket-item">
        <div class="ticket-info">
            <p><span class="smart-show ticket-info-title">姓名:</span> <span>${ticketItem.info.personName}</span></p>
            <p><span class="smart-show ticket-info-title">供应商店: </span><span>${ticketItem.info.jwRegion}</span></p>
            <p><span class="smart-show ticket-info-title">有效期: </span><span>2019</span><span class="smart-show">年</span><span>12</span><span class="smart-show">月</span></p>
            <p><span class="smart-show ticket-info-title">发证单位（盖章）: </span></p>
        </div>
        <div class="ticket-cells">
            <c:forEach var="cellItem" items="${ticketItem.renderCells}" varStatus="cellStatus">
                <jsp:include page="printCell.jsp">
                    <jsp:param name="title" value="粮油供应"/>
                    <jsp:param name="year" value="${cellItem.year}"/>
                    <jsp:param name="month" value="${cellItem.month}"/>
                    <jsp:param name="otherNo" value="${cellItem.otherNo}"/>
                    <jsp:param name="archivesNo" value="${cellItem.archivesNo}"/>
                </jsp:include>
                <br>
            </c:forEach>
        </div>
    </div>
</c:forEach>
</body>
</html>
