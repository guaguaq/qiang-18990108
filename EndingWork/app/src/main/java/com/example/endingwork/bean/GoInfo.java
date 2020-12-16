package com.example.endingwork.bean;

import com.example.endingwork.R;

import java.util.ArrayList;

public class GoInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "运动", "便利店",
            "百货", "在学习", "查一查", "干饭", "看电影咯", "有好货呦"};

    public static ArrayList<GoInfo> getDefaultGrid() {
        ArrayList<GoInfo> gridArray = new ArrayList<GoInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }



    private static int[] stagImageArray = {R.drawable.p1, R.drawable.p2, R.drawable.p3
            , R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7
            , R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11
            , R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15
            , R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19
            , R.drawable.p20, R.drawable.p21, R.drawable.p22, R.drawable.p23};
    private static String[] stagTitleArray = {"冲呀", "看一看", "哇哦", "啦啦啦", "坐在月亮", "喔~~哈",
            "抓住咯", "起飞", "钓星星", "桃桃", "漫游星球", "兔几", "太阳", "星球",
            "旺旺", "下雪咯", "可乐", "嘿嘿嘿", "圣诞", "嘻嘻", "嘻嘻", "好运", "喔喔"};

    public static ArrayList<GoInfo> getDefaultStag() {
        ArrayList<GoInfo> stagArray = new ArrayList<GoInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }





}
