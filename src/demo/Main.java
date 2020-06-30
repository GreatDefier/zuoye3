package demo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //01.构建纸牌集合
        //花色：
        // 1-方片-D
        // 2-黑桃-S
        // 3-红桃-H
        // 4-梅花-C
        //数字： 2-14  "2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, A"
        //2-2
        //3-3
        //...
        //T-10
        //J-11
        //Q-12
        //K-13
        //A-14
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> color = new ArrayList<Integer>();
        ArrayList<Pai> poker = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            color.add(i);
        }
        for (int i = 2; i <= 14; i++) {
            num.add(i);
        }
        for (int i : color) {
            for (int j : num) {
                poker.add(new Pai(i, j));
            }
        }

        //02.洗牌
        Collections.shuffle(poker);

        //03.构建角色（姓名，牌池） 发牌
        Player player1 = new Player("Black", new ArrayList<Pai>());
        Player player2 = new Player("White", new ArrayList<Pai>());

        Fapai.fapai(player1, player2, poker);

        //04.看牌
        Kanpai.kanpai(player1, player2);

        //05.比较大小
        String result = Compare.compare(player1, player2);

        //06.输出结果
        System.out.println("\n" + result + ":wins");
    }


}
