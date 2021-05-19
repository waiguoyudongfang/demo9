package demo1;

import java.lang.reflect.Field;

/****
 *
 *  获取类的信息
 */
public class GetClassInfo {

    public static void main(String[] args) {
        try {
            //将类信息装载到jvm中
            Class clazz=Class.forName("demo1.UserInfo");
            //获取类信息
            Field fields1[]=clazz.getFields();//仅获取公有属性
            Field fields2[]=clazz.getDeclaredFields();//获取全部属性
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>仅获取公有属性");
            for (Field field:fields1){
                System.out.println(field.getName()+"....");
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>获取全部属性");
            for (Field field:fields2){
                System.out.println(field.getName()+"....");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
