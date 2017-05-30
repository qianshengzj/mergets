package cn.com.qs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by qiansheng on 2017/5/27.
 */

//https://pc.cnaidai.com/webpc/activity/exp/timemapService.cgi?date=1
public class AIDaiOrder {
    public static void main(String[] args) throws IOException {
        OkHttpClient mOkHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)//设置超时时间
                .readTimeout(10, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(10, TimeUnit.SECONDS)//设置写入超时时间
                .build();
        int allCount = 1000;
        File sourceFile=new File("source-1000.day");
        for (int ri = 0; ri < allCount; ri++) {

            Request request = new Request.Builder()
                    .url("https://pc.cnaidai.com/webpc/activity/exp/timemapService.cgi?date="+ri)
                    .build();
            Call call = mOkHttpClient.newCall(request);
            Response resp = call.execute();
            FileUtils.write(sourceFile,resp.body().string()+"\n",true);
            System.out.println("line "+ri);
        }
    }
    @Test
    public void handleAidaiData() throws IOException {
        File source=new File("source-1000.day");
        String line=null;
        File formater=new File("format.file");
        BufferedReader br =new BufferedReader(new FileReader(source));
        while((line=br.readLine())!=null){
            JSONObject jsonObject=JSON.parseObject(line);
            String time=jsonObject.getString("currentTime");
            JSONArray arr=jsonObject.getJSONArray("hourMap");
            FileUtils.write(formater,String.format("%s,%d\n",time,count(arr)),true);
        }

    }

    private int count(JSONArray arr) {
        int sum=0;
        for(int ri=0;ri<arr.size();ri++){
            sum+=arr.getInteger(ri);
        }
        return sum;
    }
}
