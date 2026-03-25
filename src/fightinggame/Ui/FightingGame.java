package fightinggame.Ui;

import fightinggame.domain.EnemyCharacter;
import fightinggame.domain.HeroCharacter;
import fightinggame.domain.User;

import java.util.ArrayList;
import java.util.Scanner;

public class FightingGame {
    public void gamestart(String username) {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("      🎮 欢迎" + username + "来到英雄之塔🎮        ");
        System.out.println("╚════════════════════════════════╝");
        //创建玩家对象
        HeroCharacter player = createHeroCharacter(username);
        //显示角色属性
        System.out.println("角色创建成功！\uD83D\uDC4C");
        System.out.println("您的初始属性为：");
        player.show();
        System.out.println("您的技能：" + player.showskill());
        //创建敌人对象
        /*初级战士  80   15   10 猛击（150%伤害）                                       |
        敏捷刺客  60   20   5  快速攻击（2次50%伤害）                                 |
        重装坦克  120  10   20 防御姿态（下回合伤害减半） buff（ boolean defendding） |
        神秘法师  70   25   8  火球术（180%伤害）*/
        ArrayList<EnemyCharacter> enemyList = new ArrayList<>();
        enemyList.add(new EnemyCharacter("哥布林战士", 80, 15, 10, "撞击"));
        enemyList.add(new EnemyCharacter("人族刺客", 60, 20, 5, "快速攻击"));
        enemyList.add(new EnemyCharacter("兽人坦克", 120, 10, 20, "防御姿态"));
        enemyList.add(new EnemyCharacter("亡灵法师", 70, 25, 8, "火球术"));

    }

    //创建英雄角色

    //参数用户名
    //返回值结果
    public HeroCharacter createHeroCharacter(String username) {
        System.out.println("创建您的角色：");
        System.out.println("您的角色名称：" + username);
        int points = 20;
        System.out.println("请分配属性点（20点）");
        System.out.println("生命值（每点加10hp）");
        System.out.println("攻击力（每点加2攻击）");
        System.out.println("防御力（每点加1防御）");
        Scanner sc = new Scanner(System.in);
        String[] attritubes = {"生命", "攻击", "防御"};
        int[] arr = new int[3];
        for (int i = 0; i < attritubes.length; i++) {
            System.out.println("加点给" + attritubes[i] + "（剩余点数：" + points + ")");
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("谁让你输负数的，给你变成0");
                input = 0;
            }
            if (input > points) {
                System.out.println("你输入的点数超过剩余点数，给你变成全部点数");
                input = points;
            }
            points -= input;
            arr[i] = input;
        }
        HeroCharacter player = new HeroCharacter(
                username,
                100 + arr[0] * 10,
                10 + arr[1] * 2,
                0 + arr[2] * 1
        );
        player.skillList.add("平A");
        player.skillList.add("自爆");
        player.skillList.add("吸血");

        return player;
    }

}
