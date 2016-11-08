package com.example.a13.androidsystemicon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 13 on 2016/11/8.
 */

public class MyBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<Item> arrayList;

    MyBaseAdapter(Context context,ArrayList<Item> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.item_layout,viewGroup,false);
            holder.image_left= (ImageView) view.findViewById(R.id.image_left);
            holder.image_right= (ImageView) view.findViewById(R.id.image_right);
            holder.text_left= (TextView) view.findViewById(R.id.text_left);
            holder.text_right= (TextView) view.findViewById(R.id.text_right);
            view.setTag(holder);
        }
        else{
            holder= (ViewHolder) view.getTag();
        }
        holder.image_left.setImageResource(arrayList.get(i).getImage_left());
        holder.image_right.setImageResource(arrayList.get(i).getImage_right());
        holder.text_left.setText(arrayList.get(i).getText_left());
        holder.text_right.setText(arrayList.get(i).getText_right());
        return view;
    }
}

class ViewHolder{
    ImageView image_left,image_right;
    TextView text_left,text_right;
}
