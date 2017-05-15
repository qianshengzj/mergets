package cn.com.qs.Thread;

import cn.com.qs.StaticLockTest;

/**
 * Created by qiansheng on 2017/5/13.
 */
public class WaitThread implements Runnable {
    @Override
    public void run() {
        new Thread(new OtherThread2()).start();
        StaticLockTest.LockPrintf("wait thread start");
    }
}
