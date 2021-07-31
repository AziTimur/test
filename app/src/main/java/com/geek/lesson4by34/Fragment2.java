package com.geek.lesson4by34;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class Fragment2 extends Fragment {

    private ArrayList<Music> list;
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter= new Adapter();
        getData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRecycler(view);

    }

    private void setUpRecycler(View view) {
        recyclerView=view.findViewById(R.id.main_rv);
        recyclerView.setAdapter(adapter);
        adapter.setList(list);
        adapter.setListener(new OnClickListener() {
            @Override
            public void onClick() {
                Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(in);
            }
        });
    }

    private void getData() {
        list = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            list.add(new Music(i, "Sadyrbay", "Aygulum","3:20"));

        }

    }
}