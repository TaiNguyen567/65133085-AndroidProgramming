package thigk2.nguyenthanhtai.demo3;
// (Gói này là của bạn, hãy giữ nguyên)

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
// import android.widget.ImageView; // Bạn có thể thêm nếu muốn thay đổi ảnh động

import thigk2.nguyenthanhtai.demo3.R;

public class AboutMeActivity extends AppCompatActivity {

    // Khai báo tất cả các View
    TextView tvHoTen, tvMSSV, tvLop, tvNganh, tvEmail, tvPhone;
    // ImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        // Ánh xạ các View từ layout
        tvHoTen = findViewById(R.id.textViewHoTen);
        tvMSSV = findViewById(R.id.textViewMSSV);
        tvLop = findViewById(R.id.textViewLop);
        tvNganh = findViewById(R.id.textViewNganh);
        tvEmail = findViewById(R.id.textViewEmail);
        tvPhone = findViewById(R.id.textViewPhone);
        // imgAvatar = findViewById(R.id.imgAvatar); // Dùng nếu bạn cần set ảnh từ code

        // Set text cho các View
        // (Bạn có thể để text cứng trong XML hoặc set ở đây đều được)
        tvHoTen.setText("Nguyễn Thanh Tài");
        tvMSSV.setText("MSSV: 65133085");
        tvLop.setText("Lớp: 65CNTT-CLC");
        tvNganh.setText("Ngành: Công nghệ thông tin");
        tvEmail.setText("Email: tai.nt.65cntt@ntu.edu.vn");
        tvPhone.setText("SĐT: 0123 456 789"); // Thay SĐT của bạn
    }
}