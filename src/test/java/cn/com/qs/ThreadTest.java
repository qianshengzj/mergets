package cn.com.qs;

import cn.com.qs.Thread.JoinThread;
import org.junit.Test;

/**
 * Created by qiansheng on 2017/5/13.
 */
public class ThreadTest {

    @Test
    public void testJoin() throws InterruptedException {
        new Thread(new JoinThread()).start();
        Thread.sleep(100000);
    }
}
