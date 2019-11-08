package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.DataDictionaryMain;

public interface DataDictionaryMainMapper extends IBaseDao<DataDictionaryMain> {
    int  hiddenById(String id) throws Exception;
}