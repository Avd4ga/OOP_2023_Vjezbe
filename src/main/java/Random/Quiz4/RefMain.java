package Random.Quiz4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefMain {
    public static void main(String[] args) throws Exception {

        Reflection ref = new Reflection("Avdo",20);

        Field[] classField=ref.getClass().getDeclaredFields();

        for(Field field:classField){
            if(field.getName().equals("age")){
                field.setAccessible(true);
                field.set(ref,15);
            }
        }
        System.out.println(ref.getAge());

        System.out.println("---------------------------------------------");

        Method[] classMethods=ref.getClass().getDeclaredMethods();

        for(Method method:classMethods){
            if(method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(ref);
            }
        }




    }
}
