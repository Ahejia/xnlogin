package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.DataDictionaryInfo;

import java.util.List;

public interface DataDictionaryInfoMapper extends IBaseDao<DataDictionaryInfo> {
    int  hiddenById(String id) throws Exception;

    List<DataDictionaryInfo> getByFatherId(String id) throws Exception;
}