package com.lanou.cost.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Cost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dllo on 2017/8/30.
 */
public interface CostService {

    PageInfo<Cost> findAll(Integer pageNum, Integer pageSize);
    Cost findById(Integer id);
    void updateCost(Cost cost);
    void deleteId(Integer id);
    void insertCost(Cost cost);
    void enable(Cost cost);
}
