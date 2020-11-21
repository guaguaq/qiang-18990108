package com.example.homework08.bean;

import com.example.homework08.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = { R.drawable.keai, R.drawable.toumingguijiao, R.drawable.chibang,
            R.drawable.xiaotuzi, R.drawable.nainiu, R.drawable.nvhai,
            R.drawable.yazi,R.drawable.xiaoniong};
    private static String[] nameArray = { "可爱", "透明硅胶", "毛绒翅膀", "小兔子", "奶牛", "小女孩趣味超Q萌", "可爱卡通毛绒鸭子","毛绒小熊"};
    private static String[] descArray = {
            "万物可爱刺绣适用11/12proMax苹果X手机壳iphone8plus软X文字7/XR",
            "透明硅胶适用于vivos7手机壳x30x20女x21x23套x27x50pro硅胶x7x9x9s网红y3y85y97y93s透明s1s6s5情侣z1z3/i/z5x潮plus",
            "亨跃 ins风秋冬毛绒翅膀适用华为mate30手机壳P40/P30女款Nova7Pro软nova6/5Pro日韩闺蜜小清新全包镜头防摔",
            "小兔子磨砂肤感适用于苹果11手机壳12推拉镜头8plus卡通可爱iphoneXR/X女款11Pro/Max创意7P透明XS防摔6sp硅胶mini",
            "奶牛磨砂肤感适用于苹果11手机壳12推拉镜头8plus卡通可爱iphoneXR/X女款11Pro/Max创意7P透明XS防摔6sp硅胶mini",
            "小女孩趣味超Q萌小女孩适用于苹果12/11手机壳XR小蛮腰mini带支架iPhone8Plus少女11ProMax卡通7可爱XS硅胶SE2软壳",
            "可爱卡通毛绒鸭子适用mate40p华为p40pro手机壳nova5pro网红p30软mate30pro防摔nova6硅胶套nova7荣耀30pro女",
            "ins自制毛绒小熊nova5pro华为nova7手机壳p40pro软壳p30/mate30/pro潮荣耀30/20/9X/pro女苹果11/苹果X手机壳"

    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
