package cn.com.qs;

import cn.com.qs.iml.TestAnnotationIml;
import springfox.documentation.swagger.annotations.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * Created by randy on 2017/5/18.
 */
public class TestAnnotation implements TestAnnotationIml {


    @Override
    public void test() {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = TestAnnotation.class.getMethod("test");
        Annotation[] annotation = method.getAnnotations();

        Class<?> clss = method.getDeclaringClass();
        Class<?>[] faces = clss.getInterfaces();
        for (Class<?> face : faces) {
            System.out.println(face.getName());
        }
//        Class<?>[] interfaces = TestAnnotation.class.getInterfaces();
//        for(Class<?> interfaceObj:interfaces){
//            Annotation[] anns = interfaceObj.getAnnotations();
//            for (Annotation ann:anns){
//                System.out.println(ann.toString());
//            }
//        }
//        Annotation[] annotations = method.getDeclaredAnnotations();
//        for (Annotation annotation:annotations){
//            System.out.println(annotation.toString());
//        }
    }
}
