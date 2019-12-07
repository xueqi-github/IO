package listdemo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fight {
    public static void main(String[] args) {
        /**
         * 创建红方英雄并加入战场
         */
        List<Hero> red = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Hero hero = new Hero(i + 1,
                    "英雄" + Integer.toString(i + 1),
                    1,
                    (double) (new Random().nextInt(50)+50),
                    Job.values()[new Random().nextInt(Job.values().length)].toString(),
                    "红"
            );
            red.add(hero);
        }
        List<Hero> blue = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Hero hero = new Hero(i + 1,
                    "英雄" + Integer.toString(i + 1),
                    1,
                    (double) (new Random().nextInt(50)+50),
                    Job.values()[new Random().nextInt(Job.values().length)].toString(),
                    "蓝"
            );
            blue.add(hero);
        }

        BattleGround wzxg = new BattleGround(1, "王者峡谷", red, blue);
        System.out.println(wzxg);
    }
}
