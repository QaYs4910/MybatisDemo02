package com.mashibing.mybatisdemo02.dao;

import com.mashibing.mybatisdemo02.pojo.Dept;
import com.mashibing.mybatisdemo02.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    List<Emp> queryEmp();

    List<Dept> queryDept();
}
