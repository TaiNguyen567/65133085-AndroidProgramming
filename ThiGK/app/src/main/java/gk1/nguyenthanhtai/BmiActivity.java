package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import gk1.nguyenthanhtai.R;

public class BmiActivity extends AppCompatActivity {

    EditText edtCanNang, edtChieuCao;
    Button btnTinhBMI;
    TextView tvKetQuaBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        edtCanNang = findViewById(R.id.edtCanNang);
        edtChieuCao = findViewById(R.id.edtChieuCao);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        tvKetQuaBMI = findViewById(R.id.tvKetQuaBMI);

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhBMI();
            }
        });
    }

    private void tinhBMI() {
        String strCanNang = edtCanNang.getText().toString();
        String strChieuCao = edtChieuCao.getText().toString();

        if (strCanNang.isEmpty() || strChieuCao.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ cân nặng và chiều cao", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double canNang = Double.parseDouble(strCanNang);
            // Giả sử chiều cao nhập vào là mét (ví dụ: 1.75)
            double chieuCao = Double.parseDouble(strChieuCao);

            if (chieuCao <= 0) {
                Toast.makeText(this, "Chiều cao phải lớn hơn 0", Toast.LENGTH_SHORT).show();
                return;
            }

            // Công thức BMI = Cân nặng (kg) / (Chiều cao (m) * Chiều cao (m))
            double bmi = canNang / (chieuCao * chieuCao);
            String ketLuan = "";

            if (bmi < 18.5) {
                ketLuan = "Dưới chuẩn (Gầy)";
            } else if (bmi < 24.9) {
                ketLuan = "Bình thường";
            } else if (bmi < 29.9) {
                ketLuan = "Thừa cân";
            } else {
                ketLuan = "Béo phì";
            }

            tvKetQuaBMI.setText(String.format("Chỉ số BMI của bạn là: %.2f\nKết luận: %s", bmi, ketLuan));

            if (bmi < 18.5) {
                tvKetQuaBMI.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
            } else if (bmi < 24.9) {
                tvKetQuaBMI.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            } else {
                tvKetQuaBMI.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            }


        } catch (NumberFormatException e) {
            Toast.makeText(this, "Dữ liệu nhập không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}