package clc65.thanhtai.lamthemchuongtrinhtracnghiem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<NganHangCauHoi> dsCauHoi;
    Button nut1, nut2, nut3, nut4;
    TextView textViewcauhoi;

    // >> BƯỚC 1: Biến để theo dõi vị trí câu hỏi hiện tại
    int cauHoiHienTaiIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ View
        textViewcauhoi = findViewById(R.id.textView2);
        nut1 = findViewById(R.id.button);
        nut2 = findViewById(R.id.button2);
        nut3 = findViewById(R.id.button3);
        nut4 = findViewById(R.id.button4);

        // Khởi tạo danh sách câu hỏi
        dsCauHoi = new ArrayList<>();
        dsCauHoi.add(new NganHangCauHoi(1, "1+1", 2, 3, 4, 1));
        dsCauHoi.add(new NganHangCauHoi(2, "2+2", 4, 3, 5, 6));
        dsCauHoi.add(new NganHangCauHoi(3, "3+3", 6, 5, 7, 9));
        dsCauHoi.add(new NganHangCauHoi(5, "5 x 5", 25, 20, 30, 10));

        // Hiển thị câu hỏi đầu tiên
        hienThiCauHoi(cauHoiHienTaiIndex);

        // >> BƯỚC 3: Cập nhật OnClickListener
        View.OnClickListener answerClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button buttonDuocNhan = (Button) v;
                String dapAnDaChon = buttonDuocNhan.getText().toString();

                // Lấy đáp án đúng của câu hỏi HIỆN TẠI
                String dapAnDung = String.valueOf(dsCauHoi.get(cauHoiHienTaiIndex).getDaDung());

                if (dapAnDaChon.equals(dapAnDung)) {
                    // Nếu trả lời ĐÚNG
                    Toast.makeText(MainActivity.this, "Chính xác!", Toast.LENGTH_SHORT).show();

                    // Tăng chỉ số để chuyển sang câu tiếp theo
                    cauHoiHienTaiIndex++;

                    // Hiển thị câu hỏi mới
                    hienThiCauHoi(cauHoiHienTaiIndex);
                } else {
                    // Nếu trả lời SAI
                    Toast.makeText(MainActivity.this, "Sai rồi!", Toast.LENGTH_SHORT).show();
                }
            }
        };

        nut1.setOnClickListener(answerClickListener);
        nut2.setOnClickListener(answerClickListener);
        nut3.setOnClickListener(answerClickListener);
        nut4.setOnClickListener(answerClickListener);
    }

    // >> BƯỚC 2: Hàm để hiển thị câu hỏi dựa vào vị trí (index)
    void hienThiCauHoi(int index) {
        // >> BƯỚC 4: Kiểm tra xem đã hết câu hỏi chưa
        if (index >= dsCauHoi.size()) {
            Toast.makeText(this, "Bạn đã hoàn thành bài trắc nghiệm!", Toast.LENGTH_LONG).show();
            textViewcauhoi.setText("Chúc mừng!");
            // Vô hiệu hóa các nút bấm
            nut1.setEnabled(false);
            nut2.setEnabled(false);
            nut3.setEnabled(false);
            nut4.setEnabled(false);
            return; // Dừng hàm tại đây
        }

        // Lấy câu hỏi từ danh sách
        NganHangCauHoi cauHoiHienTai = dsCauHoi.get(index);
        textViewcauhoi.setText(cauHoiHienTai.getLoiHoi());

        // Trộn và hiển thị các đáp án
        Random rd = new Random();
        int viTriDapAnDung = rd.nextInt(4) + 1;

        switch (viTriDapAnDung) {
            case 1:
                nut1.setText(String.valueOf(cauHoiHienTai.getDaDung()));
                nut2.setText(String.valueOf(cauHoiHienTai.getSai1()));
                nut3.setText(String.valueOf(cauHoiHienTai.getSai2()));
                nut4.setText(String.valueOf(cauHoiHienTai.getSai3()));
                break;
            case 2:
                nut2.setText(String.valueOf(cauHoiHienTai.getDaDung()));
                nut1.setText(String.valueOf(cauHoiHienTai.getSai1()));
                nut3.setText(String.valueOf(cauHoiHienTai.getSai2()));
                nut4.setText(String.valueOf(cauHoiHienTai.getSai3()));
                break;
            case 3:
                nut3.setText(String.valueOf(cauHoiHienTai.getDaDung()));
                nut1.setText(String.valueOf(cauHoiHienTai.getSai1()));
                nut2.setText(String.valueOf(cauHoiHienTai.getSai2()));
                nut4.setText(String.valueOf(cauHoiHienTai.getSai3()));
                break;
            case 4:
                nut4.setText(String.valueOf(cauHoiHienTai.getDaDung()));
                nut1.setText(String.valueOf(cauHoiHienTai.getSai1()));
                nut2.setText(String.valueOf(cauHoiHienTai.getSai2()));
                nut3.setText(String.valueOf(cauHoiHienTai.getSai3()));
                break;
        }
    }
}