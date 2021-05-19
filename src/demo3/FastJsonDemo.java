package demo3;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastJsonDemo {

    public static void main(String[] args) {
        //Java对象转为JSON字符串
	    Student stu=new Student("Jason",20, Arrays.asList("Java", "Hadoop", "Python"));
        String stuJson=JSON.toJSON(stu).toString();
        System.out.println(stuJson);

        //JSON字符串转为Java对象
        String json="{\"skills\":[\"Java\",\"Hadoop\",\"Python\"],\"name\":\"Jason\",\"age\":20}";
        Student stuNew= JSON.parseObject(json, Student.class);
        System.out.println(stuNew.getName());

    }
}
