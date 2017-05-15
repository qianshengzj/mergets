package cn.com.qs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by randy on 2017/5/12.
 */

public interface TestController {

    @RequestMapping("/test")
    @ResponseBody
     String helloWorld();
}
