package com.lanou.cost.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Cost;
import com.lanou.cost.mapper.CostMapper;
import com.lanou.cost.service.CostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 2017/8/30.
 */
@Service
public class CostServiceImpl implements CostService {
    @Resource
    private CostMapper costMapper;

    public PageInfo<Cost> findAll(Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;

        PageHelper.startPage(pageNum,pageSize);

        List<Cost> list = costMapper.findAll();

        PageInfo<Cost> pageInfo = new PageInfo<Cost>(list);

        return pageInfo;
    }

    public Cost findById(Integer id) {
        return costMapper.findById(id);
    }

    public void updateCost(Cost cost) {
        costMapper.updateCost(cost);
    }

    public void deleteId(Integer id) {
        costMapper.deleteId(id);
    }

    public void insertCost(Cost cost) {
        costMapper.insertCost(cost);
    }

    public void enable(Cost cost) {
        costMapper.enable(cost);
    }
}
