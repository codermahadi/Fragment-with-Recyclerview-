package com.example.mahadi.frgmtandrcycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mahadi on 3/11/2018.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    Context context;
    List<Contact> contactList;

    public RecycleViewAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.name.setText(contactList.get(position).getName());
        holder.phone_num.setText(contactList.get(position).getPhn());
        holder.imageView.setImageResource(contactList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView phone_num;
        ImageView imageView;


        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name_contact);
            phone_num = (TextView) itemView.findViewById(R.id.ph_number);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
