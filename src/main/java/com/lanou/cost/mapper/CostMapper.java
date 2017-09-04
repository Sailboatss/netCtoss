package com.lanou.cost.mapper;

import com.lanou.bean.Cost;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 2017/8/30.
 */
@Repository
public interface CostMapper {

    List<Cost> findAll();

    Cost findById(@Param("id") Integer id);

    void updateCost(Cost cost);

    void deleteId(@Param("id") Integer id);

    void insertCost(Cost cost);

    void enable(Cost cost);
}
