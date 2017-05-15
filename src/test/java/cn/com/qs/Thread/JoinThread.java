package cn.com.qs.Thread;

/**
 * Created by qiansheng on 2017/5/13.
 */
public class JoinThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("join thread do join");
            Thread otherThread = new Thread(new OtherThread());
            otherThread.start();
            otherThread.join();
            System.out.println("join thread done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
