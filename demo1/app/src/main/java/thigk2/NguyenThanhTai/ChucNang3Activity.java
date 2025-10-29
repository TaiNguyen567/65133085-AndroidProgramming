package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import thigk2.NguyenThanhTai.R; // Import R
// Giả sử Item3Activity cũng nằm trong package này
import thigk2.NguyenThanhTai.Item3Activity;

public class ChucNang3Activity extends AppCompatActivity {

    ListView lvMonHoc;
    // Dữ liệu mẫu dựa trên hình ảnh
    String[] dsMonHoc = {
            "Tin học đại cương",
            "Lập trình Java",
            "Phát triển Ứng dụng web",
            "Khai phá dữ liệu lớn",
            "Kinh tế chính trị Mác-Lênin",
            "Quản trị mạng",
            "An toàn thông tin"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang_3); // Layout của Chức năng 3

        lvMonHoc = findViewById(R.id.listViewMonHoc); // Giả sử ID của ListView

        // Tạo Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Sử dụng layout item có sẵn của Android
                dsMonHoc
        );

        // Gán Adapter cho ListView
        lvMonHoc.setAdapter(adapter);

        // Xử lý sự kiện click item (yêu cầu 1.0đ)
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy nội dung của item được click
                String tenMonHoc = dsMonHoc[position];

                // Chuyển nội dung sang Item3Activity (yêu cầu 0.5đ)
                Intent intent = new Intent(ChucNang3Activity.this, Item3Activity.class);

                // Đóng gói dữ liệu (tên môn học) vào Intent
                intent.putExtra("TEN_MON_HOC", tenMonHoc);

                startActivity(intent);
            }
        });
    }
}