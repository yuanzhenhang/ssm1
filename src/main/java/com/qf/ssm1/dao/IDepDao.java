package com.qf.ssm1.dao;

import com.qf.ssm1.entity.Dept;

import java.util.List;

/**
 * @Author:SAMSUNG
 * @Time:2018/11/16 20:49
 * @Version 1.0
 */

public interface IDepDao {
    List<Dept> queryAll();
}
