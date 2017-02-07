package cn.crap.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/1/3.
 */
public class MyTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("---");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("---");
        }
    }

}
