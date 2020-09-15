package jdk8.source.learn.java;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author HALOXIAO
 * @since 2020-09-15 20:32
 **/
public class LinkedHashMapLearn {

    public static void main(String[] args) {
        //        LinkedHashMap根据写入顺序排序
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            linkedHashMap.put(String.valueOf(i), String.valueOf(i));
        }
        linkedHashMap.values().forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        System.out.println("HashMap排序");
        //        这里演示的是HashMap的乱序
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put(String.valueOf(i), String.valueOf(i));
        }
        hashMap.values().forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        System.out.println("LinkedHashMap根据访问顺序排序：");
        //        LinkedHashMap根据访问顺序排序
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(16, 0.75f, true);
        for (int i = 0; i < 100; i++) {
            linkedHashMap2.put(String.valueOf(i), String.valueOf(i));
        }
        linkedHashMap2.get("50");
        linkedHashMap2.get("1");
        linkedHashMap2.get("2");
        linkedHashMap2.values().forEach(System.out::println);
    }
}
