package cn.com.qs.Thread;

/**
 * Created by qiansheng on 2017/5/13.
 */
public class OtherThread implements Runnable{
    @Override
    public void run() {
        System.out.println("other thread start");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
