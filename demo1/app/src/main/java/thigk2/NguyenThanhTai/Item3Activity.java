package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import thigk2.NguyenThanhTai.R; // Import R

public class Item3Activity extends AppCompatActivity {

    TextView tvTenMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Dùng layout activity_item_3.xml
        setContentView(R.layout.activity_item_3);

        tvTenMonHoc = findViewById(R.id.textViewItem3Detail); // Ánh xạ TextView

        // Lấy Intent đã được gửi từ ChucNang3Activity
        Intent intent = getIntent();

        // Lấy dữ liệu tên môn học ra khỏi Intent
        String tenMonHoc = intent.getStringExtra("TEN_MON_HOC");

        // Hiển thị dữ liệu lên TextView
        if (tenMonHoc != null) {
            tvTenMonHoc.setText("Bạn đã chọn môn: \n" + tenMonHoc);
        } else {
            tvTenMonHoc.setText("Không nhận được dữ liệu");
        }
    }
}