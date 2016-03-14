package com.wengyingjian.spider.lagou.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 公司分页返回结果
 *
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/14
 * @since 1.1
 */
public class CompanyResult implements Serializable{

    private Integer pageSize;
    private Integer start;

    private List<CompanyInfo> result;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public List<CompanyInfo> getResult() {
        return result;
    }

    public void setResult(List<CompanyInfo> result) {
        this.result = result;
    }
}
