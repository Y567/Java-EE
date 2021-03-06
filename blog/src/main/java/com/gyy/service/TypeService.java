package com.gyy.service;

import com.gyy.pojo.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {
    //保存一个分类
    Type saveType(Type type);

    //查询一个分类
    Type getType(Long id);

    //列表分页
    Page<Type> listType(Pageable pageable);

    //列表分页
    List<Type> listType();

    //列表分页
    List<Type> listTypeTop(Integer size);

    //更新分类
    Type updateType(Long id,Type type);

    //删除一个分类
    void deleteType(Long id);

    //根据名字查询一个分类
    Type getTypeByName(String name);
}
