package th.nguyenthanhtai.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtChieuCao, edtCanNang, edtKetQuaBMI;
    Button btnTinhToan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtChieuCao = findViewById(R.id.editTextText);
        edtCanNang = findViewById(R.id.editTextText2);
        edtKetQuaBMI = findViewById(R.id.editTextText3);
        btnTinhToan = findViewById(R.id.button);

        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strChieuCao = edtChieuCao.getText().toString();
                String strCanNang = edtCanNang.getText().toString();

                if (strChieuCao.isEmpty() || strCanNang.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    float chieuCaoCm = Float.parseFloat(strChieuCao);
                    float canNang = Float.parseFloat(strCanNang);

                    float chieuCaoM = chieuCaoCm / 100.0f;

                    if (chieuCaoM == 0) {
                        Toast.makeText(MainActivity.this, "Chiều cao phải khác 0!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    float bmi = canNang / (chieuCaoM * chieuCaoM);

                    String strBMI = String.format("%.1f", bmi);

                    edtKetQuaBMI.setText(strBMI);

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}