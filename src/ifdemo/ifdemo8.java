package ifdemo;

public class ifdemo8 {
  /*  阶梯电费计算
    0-100度，0.5元/度
    101-200度，1元/度
    200以上，1.5元/度
    输出usage表示用电量输出cost表示电费。*/
  public static void main(String[] args) {
      double usage=407.5;
      double cost=0;
      if(usage>0){
          if(usage<=100){
              cost=usage*0.5;
          } else if (usage<=200) {
              cost=(usage-100)*1+50;
          }
          else{
              cost=(usage-200)*1.5+150;
          }

          System.out.println("使用度为："+usage);
          System.out.println("电费为："+cost);
      }
      else {
          System.out.println("使用度必须大于0");
      }
  }
}
