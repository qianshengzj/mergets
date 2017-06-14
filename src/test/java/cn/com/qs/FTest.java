package cn.com.qs;

import cn.com.qs.iml.TestAnnotationIml;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiansheng on 2017/5/31.
 */
class newMap implements TestAnnotationIml{

    @Override
    public void test() {

    }
}

public class FTest {

    public static void main(String[] args) {
        List<TestAnnotationIml> map = new ArrayList<TestAnnotationIml>();
        map.add(new newMap());
    }
}
