package cn.com.qs.Thread;

import cn.com.qs.StaticLockTest;

/**
 * Created by qiansheng on 2017/5/13.
 */
public class OtherThread2 implements Runnable{

    @Override
    public void run() {

        StaticLockTest.LockPrintf("other thread print");
    }
}
