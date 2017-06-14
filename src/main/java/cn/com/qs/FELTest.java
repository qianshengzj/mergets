package cn.com.qs;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;

/**
 * Created by randy on 2017/6/6.
 */
public class FELTest {
    public static void main(String[] args) {
        FelEngine fel = new FelEngineImpl();
        Object result = fel.eval("5000*12+7500");
        System.out.println(result);
    }

}
