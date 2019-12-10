
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        /**
         *初始化对象
         */
        School slg = new School(1,"陕西理工大学","汉中");

        List<Student> list=new ArrayList<>();
        Student niu = new Student(1, "牛力露", 22, true);
        Student jack = new Student(2, "杰克", 22, false);
        Student tom = new Student(3, "汤姆", 23, true);
        list.add(niu);
        list.add(jack);
        list.add(tom);
        Department wyb = new Department(1, "文艺部",list);

        /**
         * 写周报
         */

        Random random = new Random();

        int j=0;
        for (int i = 0; i <20 ; i++) {
            int temp=random.nextInt(10);
            if (temp>=7){
                j+=1;
                String path="C:\\Users\\my-pc\\Desktop\\reportor\\"+j+".txt";
                //创建周报对象
                Student person=list.get(random.nextInt(list.size()));
                Reportor reportor = new Reportor(j,slg.getName(),wyb.getName(),
                        person.getName(),path,"走班宣传");
                reportor.writeReports(reportor.toString());
            }
        }

    }

}
