package OopTest.interfacetest2;

public class Test {
  /*乒乓球运动员姓名，年龄，学打乒乓球，说英语
    篮球运动员姓名，年龄，学打篮球
    乒乓球教练姓名，年龄，教打乒乓球，说英语
    篮球教练  姓名，年龄，教打篮球*/
  public static void main(String[] args) {
      Ppplayer p1=new Ppplayer(18,"小王");
      System.out.println(p1.getName()+" "+p1.getAge());
      p1.study();
      p1.say();
  }


}
