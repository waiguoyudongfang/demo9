package demo2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/****
 *
 *  获取类的信息
 */
public class GetClassInfo {

    public static void main(String[] args) throws NoSuchMethodException {
        try {
            //1.将类信息装载到jvm中
            Class clazz=Class.forName("demo2.NationalDayPS");
            //2.获取无参构造方法
            Constructor constructor=clazz.getConstructor();
            //3.使用反射实例化对象
            Object ps=constructor.newInstance();
            //4.获取打折的方法
            Method method=clazz.getMethod("promoteSales",String.class);
            //5.调用实例对象的打折方法
            Double discount = (Double) method.invoke(ps,"1");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>折扣:"+discount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
