package com.geek.lesson4by34;

import android.content.Intent;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Music> list = new ArrayList<>();
    private OnClickListener listener;

    public void setList(ArrayList<Music> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    void  setListener(OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView number, name, singer, time;

        public ViewHolder(View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number_tv);
            name = itemView.findViewById(R.id.nameMuz_tv);
            singer = itemView.findViewById(R.id.name_singer_tv);
            time = itemView.findViewById(R.id.time_tv);
        }

        public void onBind(Music music) {
            number.setText(String.valueOf(music.getNumber()));
            name.setText(music.getName());
            singer.setText(music.getSinger());
            time.setText(music.getTime());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick();
                }
            });
        }
    }
}
