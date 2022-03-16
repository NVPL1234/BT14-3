package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DatHangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dathang);
        ImageView imageView= (ImageView) findViewById(R.id.hinh);
        TextView tvTen=(TextView) findViewById(R.id.tenBanh);
        TextView tvMoTa=(TextView) findViewById(R.id.moTaBanh);
        TextView tvGia=(TextView) findViewById(R.id.giaBanh);
        Banh banh = (Banh) getIntent().getSerializableExtra("banh");
        imageView.setImageResource(banh.getHinhNen());
        tvTen.setText(banh.getTen());
        tvMoTa.setText(banh.getMoTa());
        tvGia.setText(Double.toString(banh.getGia()));
    }
}