package com.example.a13.androidsystemicon;

/**
 * Created by 13 on 2016/11/8.
 */

public class Item {
    private int image_left;
    private int image_right;
    private String text_left;
    private String text_right;
    Item(int image_left,String text_left,int image_right,String text_right){
        this.image_left=image_left;
        this.image_right=image_right;
        this.text_left=text_left;
        this.text_right=text_right;
    }

    public int getImage_left() {
        return image_left;
    }

    public int getImage_right() {
        return image_right;
    }

    public String getText_left() {
        return text_left;
    }

    public String getText_right() {
        return text_right;
    }
}
