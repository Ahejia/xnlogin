package com.example.manager.until;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.manager.pojo.ApplicationResource;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aa{

public static JSONArray listToTree(JSONArray arr, String id, String pid, String child){
        JSONArray r = new JSONArray();
        JSONObject hash = new JSONObject();
        //将数组转为Object的形式，key为数组中的id
        for(int i=0;i<arr.size();i++){
        JSONObject json = (JSONObject) arr.get(i);
        hash.put(json.getString(id), json);
        }
        //遍历结果集
        for(int j=0;j<arr.size();j++){
        //单条记录
        JSONObject aVal = (JSONObject) arr.get(j);
        //在hash中取出key为单条记录中pid的值
        JSONObject hashVP = (JSONObject) hash.get(aVal.get(pid).toString());
        //如果记录的pid存在，则说明它有父节点，将她添加到孩子节点的集合中
        if(hashVP!=null){
        //检查是否有child属性
        if(hashVP.get(child)!=null){
        JSONArray ch = (JSONArray) hashVP.get(child);
        ch.add(aVal);
        hashVP.put(child, ch);
        }else{
        JSONArray ch = new JSONArray();
        ch.add(aVal);
        hashVP.put(child, ch);
        }
        }else{
        r.add(aVal);
        }
        }
        return r;
        }

    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
                   Map<String, Object> map = new HashMap<String, Object>();
                   Class<?> clazz = obj.getClass();
                   System.out.println(clazz);
                   for (Field field : clazz.getDeclaredFields()) {
                   field.setAccessible(true);
                   String fieldName = field.getName();
                   Object value = field.get(obj);
                   map.put(fieldName, value);
}
return map;
    }

public static void main(String[] args){
        List<Map<String, Object>> data=new ArrayList<>();

    ApplicationResource applicationResource1=new ApplicationResource();
    applicationResource1.setId("1");
    applicationResource1.setFatherId("0");

    ApplicationResource applicationResource2=new ApplicationResource();
    applicationResource2.setId("2");
    applicationResource2.setFatherId("1");
    ApplicationResource applicationResource3=new ApplicationResource();
    applicationResource3.setId("3");
    applicationResource3.setFatherId("2");
    applicationResource3.setName("未亡人是");
    ApplicationResource applicationResource4=new ApplicationResource();
    applicationResource4.setId("4");
    applicationResource4.setFatherId("2");
    applicationResource4.setName("未亡人是1");

    List<ApplicationResource> listMap =new ArrayList<ApplicationResource>();
    listMap.add(applicationResource1);
    listMap.add(applicationResource2);
    listMap.add(applicationResource3);
    listMap.add(applicationResource4);

        for (ApplicationResource a:listMap){
            try {
                data.add(aa.objectToMap(a));
            }catch (Exception e){

            }

        }
//        System.out.println(JSON.toJSONString(data));
        JSONArray result=listToTree(JSONArray.parseArray(JSON.toJSONString(data)),"id","fatherId","children");
        System.out.println(JSON.toJSONString(result));
        }
        }
