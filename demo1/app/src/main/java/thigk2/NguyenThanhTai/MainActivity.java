package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

// Import các Activity khác trong cùng package
import thigk2.NguyenThanhTai.ChucNang2Activity;
import thigk2.NguyenThanhTai.ChucNang3Activity;
import thigk2.NguyenThanhTai.ChucNang4Activity;
import thigk2.NguyenThanhTai.AboutMeActivity;
import thigk2.NguyenThanhTai.R; // Giả sử R nằm trong package này

public class MainActivity extends AppCompatActivity {

    Button btnCN2, btnCN3, btnCN4, btnAboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Layout của màn hình chính

        // Ánh xạ View
        btnCN2 = findViewById(R.id.buttonChucNang2); // Giả sử ID của các button
        btnCN3 = findViewById(R.id.buttonChucNang3);
        btnCN4 = findViewById(R.id.buttonChucNang4);
        btnAboutMe = findViewById(R.id.buttonAboutMe);

        // Xử lý sự kiện click cho Chức năng 2
        btnCN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChucNang2Activity.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện click cho Chức năng 3
        btnCN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChucNang3Activity.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện click cho Chức năng 4
        btnCN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChucNang4Activity.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện click cho About Me
        btnAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intent);
            }
        });
    }
}