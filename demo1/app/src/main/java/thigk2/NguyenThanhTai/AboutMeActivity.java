package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import thigk2.NguyenThanhTai.R; // Import R

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me); // Layout của màn hình About Me

        // Màn hình này chủ yếu hiển thị thông tin tĩnh từ file XML
        // Bạn cũng có thể set text cho các TextView tại đây

        // Ví dụ (giả sử bạn có các TextView với ID này trong layout):
        TextView tvHoTen = findViewById(R.id.textViewHoTen);
        TextView tvMSSV = findViewById(R.id.textViewMSSV);
        TextView tvLop = findViewById(R.id.textViewLop);

        tvHoTen.setText("Họ và Tên: Nguyễn Thanh Tài"); // Thay tên của bạn
        tvMSSV.setText("MSSV: [Mã số sinh viên của bạn]");
        tvLop.setText("Lớp: [Lớp của bạn]");
    }
}