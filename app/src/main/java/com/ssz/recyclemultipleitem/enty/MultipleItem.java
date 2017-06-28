package com.ssz.recyclemultipleitem.enty;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by dell on 2017/6/28.
 */

public class MultipleItem implements MultiItemEntity{
    public static final int TEXT=1;
    public static final int IMAGE=2;
    public static final int IMAGE_TEXT=3;
    private int itemType;
    private String content;

    public String getContent() {
        return content;
    }

    public MultipleItem(int itemType,String content){
        this.itemType=itemType;
        this.content=content;
    }
    @Override
    public int getItemType() {
        return itemType;
    }
}
