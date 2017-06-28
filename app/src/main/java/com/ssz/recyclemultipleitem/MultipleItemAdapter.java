package com.ssz.recyclemultipleitem;

import android.content.Context;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ssz.recyclemultipleitem.enty.MultipleItem;

import java.util.List;

/**
 * Created by dell on 2017/6/28.
 */

public class MultipleItemAdapter extends BaseMultiItemQuickAdapter<MultipleItem, BaseViewHolder>{
    public MultipleItemAdapter(Context context, List data) {
        super(data);
        //自定义的多布局
        addItemType(MultipleItem.TEXT,R.layout.item_text);
        addItemType(MultipleItem.IMAGE_TEXT,R.layout.item_image_text);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultipleItem item) {

        switch(helper.getItemViewType()){
            case MultipleItem.TEXT:
                helper.setText(R.id.tv,item.getContent());
                break;
            case MultipleItem.IMAGE_TEXT:
                helper.setImageResource(R.id.imageView,R.mipmap.ic_launcher);
                helper.setText(R.id.tv,item.getContent());
                break;
        }

    }

}
