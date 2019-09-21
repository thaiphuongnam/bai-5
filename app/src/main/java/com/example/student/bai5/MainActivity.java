package com.example.student.bai5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextTenKH, editTextSoLuongSach;
    Button buttonTinhTien, buttonTiep, buttonThongKe;
    TextView textViewTongTien, textViewTongKH, textViewTongKhachVip, textViewTongDoanhThu;
    CheckBox checkBoxKhachVip;
    BanSach banSach = new BanSach(0, 0 ,0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTenKH = findViewById(R.id.editTextTenKH);
        editTextSoLuongSach = findViewById(R.id.editTextSoLuongSach);
        buttonTinhTien = findViewById(R.id.buttonTInhTien);
        buttonTiep = findViewById(R.id.buttonTiep);
        buttonThongKe = findViewById(R.id.buttonThongKe);
        textViewTongDoanhThu = findViewById(R.id.textViewTongDoanhThu);
        textViewTongTien = findViewById(R.id.textViewTongTien);
        textViewTongKH = findViewById(R.id.textViewTongKH);
        textViewTongKhachVip = findViewById(R.id.textViewTongKhachVip);
        checkBoxKhachVip = findViewById(R.id.checkBoxKhachVip);

        buttonTinhTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soSach = Integer.parseInt(editTextSoLuongSach.getText().toString());
                boolean isVip = checkBoxKhachVip.isChecked();
                double tongTien = banSach.tinhTien(soSach, isVip);

                double tongDoanhThu = banSach.getTongDoanhThu();
                int tongKH = banSach.getTongKhachHang();
                int tongKhachVip = banSach.getTongKhachVip();

                banSach.setTongDoanhThu(tongDoanhThu + tongTien);
                banSach.setTongKhachHang(tongKH + 1);

                if (isVip)
                    banSach.setTongKhachVip(tongKhachVip + 1);

                textViewTongTien.setText(String.valueOf(tongTien));
            }
        });

        buttonThongKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTongKH.setText(String.valueOf(banSach.getTongKhachHang()));
                textViewTongKhachVip.setText(String.valueOf(banSach.getTongKhachVip()));
                textViewTongDoanhThu.setText(String.valueOf(banSach.getTongDoanhThu()));
            }
        });

        buttonTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextTenKH.setText("");
                editTextSoLuongSach.setText("");
                checkBoxKhachVip.setChecked(false);
            }
        });
    }
}
