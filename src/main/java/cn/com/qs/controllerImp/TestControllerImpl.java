package cn.com.qs.controllerImp;

import cn.com.qs.controller.TestController;
import org.springframework.stereotype.Controller;

/**
 * Created by randy on 2017/5/12.
 */
@Controller
public class TestControllerImpl implements TestController{

    public String helloWorld(){
        return "test";
    }
}
