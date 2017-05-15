package cn.com.qs;

import cn.com.qs.Thread.JoinThread;
import cn.com.qs.Thread.WaitThread;
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
    @Test
    public void testWait(){
        new Thread(new WaitThread()).start();
    }
}
