package com.lanou.cost.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Cost;
import com.lanou.cost.service.CostService;
import org.junit.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by dllo on 2017/8/30.
 */
@Controller
public class CostController {
    @Resource
    private CostService costService;


    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/fee_list")
    public String fee_list(){
        return"fee/fee_list";
    }

    @RequestMapping(value = "/feeAll")
    @ResponseBody
    public PageInfo<Cost> feeAll(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize){
        PageInfo<Cost> all = costService.findAll(pageNum,pageSize);

        return all;
    }

    @RequestMapping(value = "/fee_detail")
    public String fee_detail(@RequestParam("nameId") Integer id, HttpServletRequest request){
        request.getSession().setAttribute("nameId",id);
        return "fee/fee_detail";
    }

    @RequestMapping(value = "/fee_modi")
    public String fee_modi(@RequestParam("rdId") Integer id, HttpServletRequest request){
       System.out.println(id);
       request.getSession().setAttribute("modifyId",id);
        return "fee/fee_modi";
    }

    @RequestMapping(value = "/fee_add")
    public String fee_add(){
        return "fee/fee_add";
    }

    @RequestMapping(value = "/modify")
    @ResponseBody
    public Cost modify(HttpServletRequest request){
       Integer modifyId = (Integer) request.getSession().getAttribute("modifyId");
       return costService.findById(modifyId);
    }

    @RequestMapping(value = "/updateCost",method = RequestMethod.POST)
    public String updateCost(Cost cost){
        costService.updateCost(cost);
        return "fee/fee_list";
    }

    @RequestMapping(value = "/deleteId")
    public String deleteId(@RequestParam("deleteId") Integer id){
        costService.deleteId(id);
        return "fee/fee_list";
    }

    @RequestMapping(value = "/addCost",method = RequestMethod.POST)
    public String addCost(Cost cost){
        cost.setStatus("1");
        cost.setCreaTime(new Timestamp(new Date().getTime()));
        costService.insertCost(cost);
        return "fee/fee_list";
    }

    @RequestMapping(value = "/enable")
    public String enable(@RequestParam("enableId") Integer id){
        Cost cost = new Cost();
        cost.setId(id);
        cost.setStarTime(new Timestamp(new Date().getTime()));
        cost.setStatus("0");
        costService.enable(cost);
        return null;
    }

    @RequestMapping(value = "/detail")
    @ResponseBody
    public Cost fee_detail(HttpServletRequest request){
        Integer nameId = (Integer) request.getSession().getAttribute("nameId");
        return costService.findById(nameId);
    }

}
