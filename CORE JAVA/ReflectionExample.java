import java.lang.reflect.Method;

public class ReflectionExample {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
    
    public static void main(String[] args) throws Exception {
        Class<?> clazz = ReflectionExample.class;
        Object instance = clazz.getDeclaredConstructor().newInstance();
        for (Method method : clazz.getDeclaredMethods()){
            System.out.println("Method: " + method.getName());
            if (method.getName().equals("greet")) {
                method.invoke(instance, "World");
            }
        }
    }
}