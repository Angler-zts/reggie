package com.rabbit.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbit.reggie.entity.Category;
import com.rabbit.reggie.mapper.CategoryMapper;
import com.rabbit.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
