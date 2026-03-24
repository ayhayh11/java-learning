package apistring.arraylistdemo;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        //1.添加数据
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        //public void add(int index,E element)
        s.add(3,"qqq");
        System.out.println(s);
       /* //2.删除 数据
        s.remove(0);
        //根据索引删除，返回值是删除的元素
        System.out.println(s);
        //boolean remove(Object o)
        s.remove("qqq");
        System.out.println(s);*/
        //3.修改数据
       /* String  res = s.set(0, "zzz");
        System.out.println(res);*/
        //4.查询数据
        String s1 = s.get(0);
        System.out.println(s1);
        for (int i = 0; i < s.size(); i++) {
            String s2 = s.get(i);
            System.out.println(s2);
        }
        System.out.println(s);

    }
}
