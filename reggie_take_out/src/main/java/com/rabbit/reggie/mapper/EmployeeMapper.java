package com.rabbit.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbit.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
