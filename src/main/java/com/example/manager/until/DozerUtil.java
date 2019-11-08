package com.example.manager.until;

import org.dozer.DozerBeanMapper;
import org.dozer.util.MappingValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hj
 * @Description
 * @Date 11:30 2019/11/7
 * @return
**/
public final class DozerUtil {

    private static DozerBeanMapper dozerMapper = new DozerBeanMapper();

    public static List one2List(final List source, Class destinationClass) {
        List desList = new ArrayList<>();
        if (source == null){
            return desList;
        }
        MappingValidator.validateMappingRequest(source, destinationClass);
        for (Object src : source) {
            Object des = dozerMapper.map(src, destinationClass);
            desList.add(des);
        }
        return desList;
    }

    public static <T> T one2one(final Object source, Class<T> destinationClass) {
        if (source == null) {
            return null;
        }
        MappingValidator.validateMappingRequest(source, destinationClass);
        return dozerMapper.map(source, destinationClass);
    }

}