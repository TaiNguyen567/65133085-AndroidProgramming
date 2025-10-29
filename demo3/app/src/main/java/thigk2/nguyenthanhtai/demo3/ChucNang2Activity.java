package thigk2.nguyenthanhtai.demo3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import thigk2.nguyenthanhtai.demo3.R;

public class ChucNang2Activity extends AppCompatActivity {

    EditText edtThang, edtNam;
    Button btnKiemTra;
    TextView tvKetQuaQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2); // Dùng layout quiz

        edtThang = findViewById(R.id.edtThang);
        edtNam = findViewById(R.id.edtNam);
        btnKiemTra = findViewById(R.id.btnKiemTra);
        tvKetQuaQuiz = findViewById(R.id.tvKetQuaQuiz);

        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiemTraDapAn();
            }
        });
    }

    private void kiemTraDapAn() {
        String thang = edtThang.getText().toString().trim();
        String nam = edtNam.getText().toString().trim();

        if (thang.isEmpty() || nam.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ Tháng và Năm", Toast.LENGTH_SHORT).show();
            return;
        }

        // Đáp án đúng: Tháng 4, Năm 1975
        if (thang.equals("4") && nam.equals("1975")) {
            tvKetQuaQuiz.setText("Chính xác!\nChiến dịch Hồ Chí Minh toàn thắng vào 30/4/1975.");
            tvKetQuaQuiz.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        } else {
            tvKetQuaQuiz.setText("Sai!\nĐáp án đúng là Tháng 4 và Năm 1975.");
            tvKetQuaQuiz.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        }
    }
}