package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import gk1.nguyenthanhtai.R;

public class GioiThieuActivity extends AppCompatActivity {

    TextView tvHoTen, tvMSSV, tvLop, tvNganh, tvEmail, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioi_thieu); // Dùng layout đã làm đẹp

        tvHoTen = findViewById(R.id.textViewHoTen);
        tvMSSV = findViewById(R.id.textViewMSSV);
        tvLop = findViewById(R.id.textViewLop);
        tvNganh = findViewById(R.id.textViewNganh);
        tvEmail = findViewById(R.id.textViewEmail);
        tvPhone = findViewById(R.id.textViewPhone);

        // Set thông tin
        tvHoTen.setText("Nguyễn Thành Tài");
        tvMSSV.setText("MSSV: 65133085");
        tvLop.setText("Lớp: 65CNTT-CLC");
        tvNganh.setText("Ngành: Công nghệ thông tin");
        tvEmail.setText("Email: tai.nt.65cntt@ntu.edu.vn");
        tvPhone.setText("SĐT: 0123 456 789"); // Thay SĐT của bạn
    }
}