package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import gk1.nguyenthanhtai.R;

public class MainActivity extends AppCompatActivity {

    Button btnBMI, btnMonAn, btnBaiThuoc, btnGioiThieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnBMI = findViewById(R.id.buttonBMI);
        btnMonAn = findViewById(R.id.buttonMonAn);
        btnBaiThuoc = findViewById(R.id.buttonBaiThuoc);
        btnGioiThieu = findViewById(R.id.buttonGioiThieu);


        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(intent);
            }
        });


        btnMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonAnActivity.class);
                startActivity(intent);
            }
        });


        btnBaiThuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiThuocActivity.class);
                startActivity(intent);
            }
        });


        btnGioiThieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GioiThieuActivity.class);
                startActivity(intent);
            }
        });


    }
}