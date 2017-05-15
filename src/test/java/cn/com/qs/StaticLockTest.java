package cn.com.qs;

/**
 * Created by qiansheng on 2017/5/13.
 */
public class StaticLockTest {
    public synchronized static void LockPrintf(String str){
        System.out.println(str);
    }
}
