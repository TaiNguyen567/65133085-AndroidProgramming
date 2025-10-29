package thigk2.NguyenThanhTai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import thigk2.NguyenThanhTai.HoatDong; // Import Model
import thigk2.NguyenThanhTai.HoatDongAdapter; // Import Adapter
import thigk2.NguyenThanhTai.R; // Import R
// Giả sử Item4Activity cũng nằm trong package này
import thigk2.NguyenThanhTai.Item4Activity;

public class ChucNang4Activity extends AppCompatActivity {

    RecyclerView rvHoatDong;
    HoatDongAdapter adapter;
    List<HoatDong> listHoatDong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang_4); // Layout của Chức năng 4

        rvHoatDong = findViewById(R.id.recyclerViewHoatDong); // Giả sử ID

        // Khởi tạo danh sách
        listHoatDong = new ArrayList<>();
        taoDuLieuMau(); // Hàm tạo dữ liệu mẫu

        // Khởi tạo Adapter
        adapter = new HoatDongAdapter(this, listHoatDong);

        // Cài đặt LayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvHoatDong.setLayoutManager(layoutManager);

        // Gán Adapter cho RecyclerView (yêu cầu 1.5đ)
        rvHoatDong.setAdapter(adapter);

        // Xử lý sự kiện click (yêu cầu 0.5đ)
        adapter.setOnItemClickListener(new HoatDongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(HoatDong hoatDong) {
                // Chuyển nội dung sang Item4Activity
                Intent intent = new Intent(ChucNang4Activity.this, Item4Activity.class);

                // Đóng gói dữ liệu (ví dụ: gửi tiêu đề và thời gian)
                intent.putExtra("TIEU_DE_HOAT_DONG", hoatDong.getTieuDe());
                intent.putExtra("THOI_GIAN_HOAT_DONG", hoatDong.getThoiGian());

                startActivity(intent);
            }
        });
    }

    // Hàm tạo dữ liệu mẫu cho RecyclerView
    private void taoDuLieuMau() {
        // Bạn cần thêm các file ảnh (ví dụ: hd1.png, hd2.png) vào thư mục res/drawable
        // Chú ý: R.drawable.hd1 sẽ được tham chiếu từ package của bạn
        listHoatDong.add(new HoatDong("Tiêu đề hoạt động 1", "Thời gian: 8:00 - 10:00", R.drawable.hd1));
        listHoatDong.add(new HoatDong("Tiêu đề hoạt động 2", "Thời gian: 10:00 - 12:00", R.drawable.hd2));
        listHoatDong.add(new HoatDong("Tiêu đề hoạt động 3", "Thời gian: 14:00 - 16:00", R.drawable.hd3));
        listHoatDong.add(new HoatDong("Hoạt động tình nguyện", "Thời gian: Cả ngày Chủ Nhật", R.drawable.hd4));
        listHoatDong.add(new HoatDong("Hội thảo chuyên đề", "Thời gian: 19:00 - 21:00 Tối T4", R.drawable.hd5));
    }
}