package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class BanhAdapter extends BaseAdapter {
    private ImageButton btnAdd;
    private Context context;
    private List<Banh> dsBanh;
    private int layout;

    public BanhAdapter(Context context, List<Banh> objects, int layout){
        this.context=context;
        this.dsBanh=objects;
        this.layout=layout;
    }

    @Override
    public int getCount() {
        return dsBanh.size();
    }

    @Override
    public Object getItem(int position) {
        return dsBanh.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(layout, parent,false);
        }

        btnAdd=(ImageButton) convertView.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DatHangActivity.class);
                intent.putExtra("banh", (Serializable) dsBanh.get(position));
                context.startActivity(intent);
            }
        });

        TextView ten = (TextView) convertView.findViewById(R.id.ten);
        TextView moTa = (TextView) convertView.findViewById(R.id.moTa);
        TextView gia = (TextView) convertView.findViewById(R.id.gia);
        ImageView hinhNen = (ImageView) convertView.findViewById(R.id.hinhNen);

        ten.setText(dsBanh.get(position).getTen());
        moTa.setText(dsBanh.get(position).getMoTa());
        gia.setText(Double.toString(dsBanh.get(position).getGia()));
        hinhNen.setImageResource(dsBanh.get(position).getHinhNen());
        return convertView;
    }
}
