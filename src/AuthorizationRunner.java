import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AuthorizationRunner {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        for (String clasz : args) {
            Class<?> aClass = Class.forName(clasz);
            Object obj = aClass.newInstance();
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                Authorization annotation = method.getAnnotation(Authorization.class);
                if(annotation != null){
                    method.invoke(obj);
                    System.out.println(">>>>>> "+annotation.message() + "\n");
                }
            }
        }
    }
}
