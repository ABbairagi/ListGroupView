package com.example.listgroupview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class UserAdapter extends ArrayAdapter<GroupClass> {

    public UserAdapter(Context context, ArrayList<GroupClass> resource) {
        super(context, 0,resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item,parent,false);

        GroupClass item=getItem(position);

        TextView title = convertView.findViewById(R.id.title);
        title.setText(item.getTitle());

        TextView desc = convertView.findViewById(R.id.description);
        desc.setText(item.getDesc());

        ImageView imageView = convertView.findViewById(R.id.image_view);
        imageView.setImageResource(item.getImage_res());

        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.custom_animation);
        convertView.startAnimation(animation);

        return super.getView(position, convertView, parent);
    }
}
