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

        // Ánh xạ các nút theo ID mới
        btnBMI = findViewById(R.id.buttonBMI);
        btnMonAn = findViewById(R.id.buttonMonAn);
        btnBaiThuoc = findViewById(R.id.buttonBaiThuoc);
        btnGioiThieu = findViewById(R.id.buttonGioiThieu);

        // Chuyển sang BmiActivity
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(intent);
            }
        });

        // Chuyển sang MonAnActivity
        btnMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonAnActivity.class);
                startActivity(intent);
            }
        });

        // Chuyển sang BaiThuocActivity
        btnBaiThuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiThuocActivity.class);
                startActivity(intent);
            }
        });

        // Chuyển sang GioiThieuActivity
        btnGioiThieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GioiThieuActivity.class);
                startActivity(intent);
            }
        });
    }
}