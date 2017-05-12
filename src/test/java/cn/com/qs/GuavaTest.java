package cn.com.qs;

import com.google.common.eventbus.EventBus;

import java.util.Collections;

/**
 * Created by randy on 2017/5/8.
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new TestSubObject());
        eventBus.post(new TestEvent("asasdasd"));
    }
}
