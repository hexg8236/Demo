package com.newhand.service.impl;

import com.newhand.service.ResourceService;

import java.util.*;

/**
 * @ClassName ResourceServiceImpl
 * @Author hexg8
 * @Date 2024/1/8 16:30
 * @Version 1.0
 * @Description TODO
 **/
public class ResourceServiceImpl implements ResourceService {
    private String[] array;

    private List<String> list;

    private Set<String> set;

    private Map<String, String> map;

    private Properties properties;

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "ResourceServiceImpl{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
