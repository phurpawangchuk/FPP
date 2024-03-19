package A67.Lab.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Company comp =  new Company("ABC Ltd.", 200);
        Company comp1 =  new Company("ABC Ltd.", 200);
        Company comp2 =  new Company("DEF Ltd.", 200);

        System.out.println(comp.equals(comp1)); //true
        System.out.println(comp1.equals(comp2)); //false

        System.out.println("Company "+comp.hashCode());
        System.out.println("Company1 "+comp1.hashCode());
        System.out.println("Company2 "+comp2.hashCode());

        String className = comp.getClass().getSimpleName();
        System.out.println(className);

        Field[] fields = comp.getClass().getDeclaredFields();
        for(Field f: fields){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(comp, "NextGen Innvo");
            }
        }
        System.out.println(comp.getName());


        Method[] methods = comp.getClass().getDeclaredMethods();
        for(Method m: methods){
            if(m.getName().equals("setNumberOfEmployee")){
                m.setAccessible(true);
                m.invoke(comp, 3000);
            }else{
                m.setAccessible(true);
                m.invoke(comp);
            }
        }
        System.out.println("No. of employee is "+comp.getNumberOfEmployee());
    }
}
