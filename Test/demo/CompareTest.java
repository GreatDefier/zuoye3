package demo;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class CompareTest {
    @org.junit.Before
    public void setUp() throws Exception {
        //01.测试Compare方法

        //02.测试IsTonghuashun等一系列方法，参数列表中参数必须是按照升序排列的

    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("test finished!!!!");
    }

    @org.junit.Test
    public void compare() {
        /*
        // 1-方片-D
        // 2-黑桃-S
        // 3-红桃-H
        // 4-梅花-C
        输入:       Black: `2H 3D 5S 9C KD` White: `2C 3H 4S 8C AH`
        输出:       White wins
        输入:       Black: `2H 4S 4C 2D 4H` White: `2S 8S AS QS 3S`
        输出:       Black wins
        输入:       Black: `2H 3D 5S 9C KD` White: `2C 3H 4S 8C KH`
        输出:       Black wins
        */

        ArrayList<Pai> ceshi1 = new ArrayList<>();
        ArrayList<Pai> ceshi2 = new ArrayList<>();
        //输入:       Black: `2H 3D 5S 9C KD` White: `2C 3H 4S 8C AH`
        //输出:       White wins
        Collections.addAll(ceshi1, new Pai(3, 2), new Pai(1, 3), new Pai(2, 5), new Pai(4, 9), new Pai(1, 13));
        Collections.addAll(ceshi2, new Pai(4, 2), new Pai(3, 3), new Pai(2, 4), new Pai(4, 8), new Pai(3, 14));
        Player black = new Player("Black", ceshi1);
        Player white = new Player("White", ceshi2);
        Kanpai.kanpai(black, white);
        String ceshiresult1 = Compare.compare(black, white);
        System.out.println("\n"+ceshiresult1 + ":win");

        //清空
        black.getList().clear();
        white.getList().clear();
        ceshi1.clear();
        ceshi2.clear();

        //输入:       Black: `2H 4S 4C 2D 4H` White: `2S 8S AS QS 3S`
        //输出:       Black wins
        Collections.addAll(ceshi1, new Pai(3, 2), new Pai(2, 4), new Pai(4, 4), new Pai(1, 2), new Pai(3, 4));
        Collections.addAll(ceshi2, new Pai(2, 2), new Pai(2, 8), new Pai(2, 14), new Pai(2, 12), new Pai(2, 3));
        black.setList(ceshi1);
        white.setList(ceshi2);
        Kanpai.kanpai(black, white);
        String ceshiresult2 = Compare.compare(black, white);
        System.out.println("\n"+ceshiresult2 + ":win");

        //清空
        black.getList().clear();
        white.getList().clear();
        ceshi1.clear();
        ceshi2.clear();

        //输入:       Black: `2H 3D 5S 9C KD` White: `2C 3H 4S 8C KH`
        //输出:       Black wins
        Collections.addAll(ceshi1, new Pai(3, 2), new Pai(1, 3), new Pai(2, 5), new Pai(4, 9), new Pai(1, 13));
        Collections.addAll(ceshi2, new Pai(4, 2), new Pai(3, 3), new Pai(2, 4), new Pai(4, 8), new Pai(3, 13));
        black.setList(ceshi1);
        white.setList(ceshi2);
        Kanpai.kanpai(black, white);
        String ceshiresult3 = Compare.compare(black, white);
        System.out.println("\n"+ceshiresult3 + ":win");
    }

    @org.junit.Test
    public void isTonghuashun() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(3, 4), new Pai(3, 5), new Pai(3, 6), new Pai(3, 7), new Pai(3, 8));
        assertEquals(true,Compare.IsTonghuashun(test1));
    }

    @org.junit.Test
    public void isTiezhi() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(1, 4), new Pai(2, 4), new Pai(3, 4), new Pai(4, 4), new Pai(1, 8));
        assertEquals(true,Compare.IsTiezhi(test1));
    }

    @org.junit.Test
    public void isHulu() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(1, 4), new Pai(2, 4), new Pai(3, 6), new Pai(4, 6), new Pai(1, 6));
        assertEquals(true,Compare.IsHulu(test1));
    }

    @org.junit.Test
    public void isTonghua() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(3, 2), new Pai(3, 5), new Pai(3, 7), new Pai(3, 9), new Pai(3, 13));
        assertEquals(true,Compare.IsTonghua(test1));
    }

    @org.junit.Test
    public void isShunzi() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(1, 4), new Pai(2, 5), new Pai(3, 6), new Pai(4, 7), new Pai(3, 8));
        assertEquals(true,Compare.IsShunzi(test1));
    }

    @org.junit.Test
    public void isSantiao() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(1, 4), new Pai(2, 4), new Pai(4, 4), new Pai(3, 7), new Pai(1, 8));
        assertEquals(true,Compare.IsSantiao(test1));
    }

    @org.junit.Test
    public void isLiangdui() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(1, 5), new Pai(3, 5), new Pai(1, 8), new Pai(4, 8), new Pai(3, 12));
        assertEquals(true,Compare.IsLiangdui(test1));
    }

    @org.junit.Test
    public void isDuizi() {
        //同花顺牌
        ArrayList<Pai> test1 = new ArrayList<>();
        Collections.addAll(test1, new Pai(4, 2), new Pai(3, 5), new Pai(1, 7), new Pai(3, 7), new Pai(2, 8));
        assertEquals(true,Compare.IsDuizi(test1));
    }
}