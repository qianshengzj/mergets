package cn.com.qs;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * Created by randy on 2017/5/8.
 */
public class TestSubObject {
    @Subscribe public void subscript(TestEvent e) throws Exception {
        throw  new Exception("test");
//        System.out.printf(e.getMsg());
    }
    @Subscribe public void subscript2(TestEvent event){
        System.out.printf(event.toString());
    }
}
