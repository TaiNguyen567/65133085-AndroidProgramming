package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import thigk2.NguyenThanhTai.R; // Import R

public class Item4Activity extends AppCompatActivity {

    TextView tvTieuDe, tvThoiGian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Dùng layout activity_item_4.xml
        setContentView(R.layout.activity_item_4);

        tvTieuDe = findViewById(R.id.textViewItem4TieuDe); // Ánh xạ TextView
        tvThoiGian = findViewById(R.id.textViewItem4ThoiGian); // Ánh xạ TextView

        // Lấy Intent đã được gửi từ ChucNang4Activity
        Intent intent = getIntent();

        // Lấy dữ liệu ra khỏi Intent
        String tieuDe = intent.getStringExtra("TIEU_DE_HOAT_ĐONG");
        String thoiGian = intent.getStringExtra("THOI_GIAN_HOAT_ĐONG");

        // Hiển thị dữ liệu lên TextView
        if (tieuDe != null) {
            tvTieuDe.setText(tieuDe);
        } else {
            tvTieuDe.setText("Không có tiêu đề");
        }

        if (thoiGian != null) {
            tvThoiGian.setText(thoiGian);
        } else {
            tvThoiGian.setText("Không có thời gian");
        }
    }
}