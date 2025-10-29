package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import thigk2.NguyenThanhTai.R; // Import R

public class ChucNang2Activity extends AppCompatActivity {

    EditText edtDiemGK, edtDiemCK;
    Button btnTinhTB;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang_2); // Layout của Chức năng 2

        // Ánh xạ View
        edtDiemGK = findViewById(R.id.editTextDiemGK); // Giả sử ID của EditText
        edtDiemCK = findViewById(R.id.editTextDiemCK); // Giả sử ID của EditText
        btnTinhTB = findViewById(R.id.buttonTinhTB); // Giả sử ID của Button
        tvKetQua = findViewById(R.id.textViewKetQua); // Giả sử ID của TextView

        // Xử lý sự kiện
        btnTinhTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhDiemTrungBinh();
            }
        });
    }

    private void tinhDiemTrungBinh() {
        String strDiemGK = edtDiemGK.getText().toString();
        String strDiemCK = edtDiemCK.getText().toString();

        // Kiểm tra đầu vào rỗng
        if (strDiemGK.isEmpty() || strDiemCK.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ điểm", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Chuyển đổi sang số
            double diemGK = Double.parseDouble(strDiemGK);
            double diemCK = Double.parseDouble(strDiemCK);

            // Tính điểm trung bình (50% GK, 50% CK)
            double diemTB = (diemGK * 0.5) + (diemCK * 0.5);

            // Hiển thị kết quả lên TextView
            String ketQua = "Điểm Giữa Kỳ (50%): " + diemGK + "\n";
            ketQua += "Điểm Cuối Kỳ (50%): " + diemCK + "\n";
            ketQua += "-------------------------------------\n";
            ketQua += "Điểm Trung Bình: " + String.format("%.2f", diemTB); // Làm tròn 2 chữ số

            tvKetQua.setText(ketQua);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Điểm nhập không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}