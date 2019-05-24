package com.zhupp.ems.util;

import com.github.pagehelper.Page;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
public class PageBean<T> {

    /**
     * 当前页数
     */
    private Integer pageNo=1;
    /**
     * 每页数据量
     */
    private Integer pageSize=20;
    /**
     * 总数据量
     */
    private Long totalResult=0L;
    /**
     * 总页数
     */
    private Integer totalPage=0;
    /**
     * 分页结果
     */
    private List<T> list;

    public PageBean() {
        super();
        list = new ArrayList<>();
    }

    public PageBean(Integer pageNo, Integer pageSize, Long totalResult, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalResult = totalResult;
        this.list = list;
    }

    public PageBean(Integer pageNo, Integer pageSize,Integer totalPage, Long totalResult, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalResult = totalResult;
        this.list = list;
    }

    public PageBean(List<T> list) {
        if (list instanceof Page){
            Page page=(Page)list;
            this.pageNo=page.getPageNum()==0?1:page.getPageNum();
            this.pageSize=page.getPageSize();
            this.totalPage=page.getPages();
            this.totalResult=page.getTotal();
            this.list = page.getResult();
        } else if (list instanceof Collection) {
            this.pageNo=1;
            this.pageSize = list.size();
            this.totalPage = 1;
            this.totalResult = (long)list.size();
            this.list=list;

        }
    }

    /**
     * 计算总页数
     */

    public void completeTotalPage() {
        if (this.pageSize == 0) {
            this.totalPage=0;
        }
        if (this.totalResult % this.pageSize == 0) {
            this.totalPage=Integer.parseInt(this.totalResult.toString())/this.pageSize;
        }else {
            this.totalPage=Integer.parseInt(this.totalResult.toString())/this.pageSize+1;
        }
    }
}
