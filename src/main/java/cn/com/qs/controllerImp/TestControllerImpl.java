package cn.com.qs.controllerImp;

import cn.com.qs.controller.TestController;
import cn.com.qs.exception.TestException;
import org.springframework.stereotype.Controller;

/**
 * Created by randy on 2017/5/12.
 */
@Controller
public class TestControllerImpl implements TestController{

    public String helloWorld() throws Exception {
        throw new TestException("test");
    }
}
