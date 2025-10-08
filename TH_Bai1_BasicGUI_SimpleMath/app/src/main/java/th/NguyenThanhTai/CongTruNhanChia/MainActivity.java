package th.NguyenThanhTai.CongTruNhanChia;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//    (1). Khai báo các biến đối tượng nhằm liên kết đến các id trong file xml layout.
    EditText so1, so2;
    TextView ketQua;
    Button btnTinhToan, cong, tru, nhan, chia, btnTroLai;
    private String phepTinh = " ";
//  Hết (1).
//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  (2). link biến java voi id tuong ung.
        so1 = findViewById(R.id.edtA);
        so2 = findViewById(R.id.edtB);
        ketQua = findViewById(R.id.Ketqua);
        btnTinhToan = findViewById(R.id.Tinhtoan);
        cong = findViewById(R.id.Cong);
        tru = findViewById(R.id.Tru);
        nhan = findViewById(R.id.Nhan);
        chia = findViewById(R.id.Chia);
        btnTroLai = findViewById(R.id.Back);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phepTinh = "+";
                Toast.makeText(MainActivity.this, "Đã chọn phép cộng", Toast.LENGTH_SHORT).show();
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phepTinh = "-";
                Toast.makeText(MainActivity.this, "Đã chọn phép trừ", Toast.LENGTH_SHORT).show();
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phepTinh = "*";
                Toast.makeText(MainActivity.this, "Đã chọn phép nhân", Toast.LENGTH_SHORT).show();
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phepTinh = "/";
                Toast.makeText(MainActivity.this, "Đã chọn phép chia", Toast.LENGTH_SHORT).show();
            }
        });
        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan();
            }
        });
        btnTroLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xóa nội dung của 2 ô nhập liệu
                so1.setText("");
                so2.setText("");
                // Xóa nội dung của ô kết quả
                ketQua.setText("");
                // Reset lại phép tính đã chọn (để tránh lỗi)
                phepTinh = " ";
                // Đặt con trỏ vào ô nhập số đầu tiên
                so1.requestFocus();
                Toast.makeText(MainActivity.this, "Đã xóa", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void tinhToan(){
        if (phepTinh.isEmpty()){
            Toast.makeText(this,"Vui lòng chọn một phép tính trước", Toast.LENGTH_SHORT).show();
            return;
        }
        String strSo1 = so1.getText().toString();
        String strSo2 = so2.getText().toString();

        if (strSo1.isEmpty() || strSo2.isEmpty()){
            Toast.makeText(this, "Vui lòng nhập đầy đủ 2 số!", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            int soA = Integer.parseInt(strSo1);
            int soB = Integer.parseInt(strSo2);
            int ketquaSo = 0;
            switch (phepTinh){
                case "+":
                    ketquaSo = soA + soB;
                    break;
                case "-":
                    ketquaSo = soA - soB;
                    break;
                case "*":
                    ketquaSo = soA * soB;
                    break;
                case "/":
                    if(soB == 0){
                        Toast.makeText(this, "Không thể chia cho 0!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    ketquaSo = soA / soB;
                    break;
            }
            String strKetqua = String.valueOf(ketquaSo);
            ketQua.setText(strKetqua);
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }

}