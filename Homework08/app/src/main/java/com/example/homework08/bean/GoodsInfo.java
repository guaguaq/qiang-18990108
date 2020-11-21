package com.example.homework08.bean;

import com.example.homework08.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "可爱", "透明硅胶", "毛绒翅膀", "小兔子", "奶牛", "小女孩趣味超Q萌", "可爱卡通毛绒鸭子","毛绒小熊"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "万物可爱刺绣适用11/12proMax苹果X手机壳iphone8plus软X文字7/XR",
            "透明硅胶适用于vivos7手机壳x30x20女x21x23套x27x50pro硅胶x7x9x9s网红y3y85y97y93s透明s1s6s5情侣z1z3/i/z5x潮plus",
            "亨跃 ins风秋冬毛绒翅膀适用华为mate30手机壳P40/P30女款Nova7Pro软nova6/5Pro日韩闺蜜小清新全包镜头防摔",
            "小兔子磨砂肤感适用于苹果11手机壳12推拉镜头8plus卡通可爱iphoneXR/X女款11Pro/Max创意7P透明XS防摔6sp硅胶mini",
            "奶牛磨砂肤感适用于苹果11手机壳12推拉镜头8plus卡通可爱iphoneXR/X女款11Pro/Max创意7P透明XS防摔6sp硅胶mini",
            "小女孩趣味超Q萌小女孩适用于苹果12/11手机壳XR小蛮腰mini带支架iPhone8Plus少女11ProMax卡通7可爱XS硅胶SE2软壳",
            "可爱卡通毛绒鸭子适用mate40p华为p40pro手机壳nova5pro网红p30软mate30pro防摔nova6硅胶套nova7荣耀30pro女",
            "ins自制毛绒小熊nova5pro华为nova7手机壳p40pro软壳p30/mate30/pro潮荣耀30/20/9X/pro女苹果11/苹果X手机壳"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {25, 16, 30, 21, 12, 19,23,20};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.keai_s, R.drawable.toumingguijiao_s, R.drawable.chibang_s,
            R.drawable.xiaotuzi_s, R.drawable.nainiu_s, R.drawable.nvhai_s,
            R.drawable.yazi_s,R.drawable.xiaoniong_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.keai, R.drawable.toumingguijiao, R.drawable.chibang,
            R.drawable.xiaotuzi, R.drawable.nainiu, R.drawable.nvhai,
            R.drawable.yazi,R.drawable.xiaoniong
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
