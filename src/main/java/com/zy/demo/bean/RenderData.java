package com.zy.demo.bean;

/**
 * 要渲染的数据
 * @param <T>
 */
public class RenderData <T>{

    private T info;
    private RenderCell[] renderCells;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public RenderCell[] getRenderCells() {
        return renderCells;
    }

    public void setRenderCells(RenderCell[] renderCells) {
        this.renderCells = renderCells;
    }
}
