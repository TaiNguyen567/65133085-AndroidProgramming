package thigk2.nguyenthanhtai.demo3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import thigk2.nguyenthanhtai.demo3.R;

public class ChucNang3Activity extends AppCompatActivity {

    ListView lvNhanhCaChMang;
    // Dữ liệu theo đề bài
    String[] dsBaiHat = {
            "Tiến về Sài Gòn",
            "Giải phóng Miền Nam",
            "Đất nước trọn niềm vui",
            "Bài ca thống nhất",
            "Mùa xuân trên thành phố HCM"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        lvNhanhCaChMang = findViewById(R.id.listViewNhanhCaChMang);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsBaiHat
        );

        lvNhanhCaChMang.setAdapter(adapter);

        // Xử lý sự kiện click
        lvNhanhCaChMang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tenBaiHat = dsBaiHat[position];

                // 1. Hiển thị Toast (Yêu cầu 1.0đ)
                Toast.makeText(ChucNang3Activity.this, tenBaiHat, Toast.LENGTH_SHORT).show();

                // 2. Chuyển nội dung sang Item3Activity (Yêu cầu 0.5đ)
                Intent intent = new Intent(ChucNang3Activity.this, Item3Activity.class);
                intent.putExtra("TEN_BAI_HAT", tenBaiHat); // Gửi dữ liệu đi
                startActivity(intent);
            }
        });
    }
}