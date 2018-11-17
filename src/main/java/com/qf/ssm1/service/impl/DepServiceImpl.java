package com.qf.ssm1.service.impl;

import com.qf.ssm1.dao.IDepDao;
import com.qf.ssm1.entity.Dept;
import com.qf.ssm1.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:SAMSUNG
 * @Time:2018/11/16 20:49
 * @Version 1.0
 */
@Service
public class DepServiceImpl implements IDepService {
    @Autowired
    private IDepDao depDao;

    @Override
    public List<Dept> queryAll() {
        return depDao.queryAll();
    }

    @Override
    public int add(Dept dept) {

        return depDao.add(dept);
    }
}
