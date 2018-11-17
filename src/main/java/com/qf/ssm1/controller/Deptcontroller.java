package com.qf.ssm1.controller;

import com.qf.ssm1.entity.Dept;
import com.qf.ssm1.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:SAMSUNG
 * @Time:2018/11/16 20:47
 * @Version 1.0
 */
@Controller
@RequestMapping("dep")
public class Deptcontroller {
    @Autowired
    private IDepService depService;

    @RequestMapping("list")
    public String list(Model model) {
        List<Dept> deps = depService.queryAll();
        model.addAttribute("deps", deps);
        return "deplist";
    }

    @RequestMapping("toAdd")
    public String toAdd() {

        return "depadd";
    }


}
