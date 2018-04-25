package cn.weizhis.common.component;

import java.util.List;

/**
 * Created by minlee on 2018/3/17.
 */
public class Page<T> {
    private Integer currentPage = 1;
    private Integer rowNum = 10;
    private Integer total;
    private List<T> data;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
