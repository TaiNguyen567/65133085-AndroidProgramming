package thigk2.nguyenthanhtai.demo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import thigk2.nguyenthanhtai.demo3.R;

public class ChucNang4Activity extends AppCompatActivity {

    RecyclerView rvHoatDongKyNiem;
    HoatDongAdapter adapter;
    List<HoatDong> listHoatDong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang4);

        rvHoatDongKyNiem = findViewById(R.id.rvHoatDongKyNiem);
        listHoatDong = new ArrayList<>();

        // Tạo dữ liệu mẫu
        taoDuLieuMau();

        // Khởi tạo Adapter
        adapter = new HoatDongAdapter(this, listHoatDong);

        // Cài đặt LayoutManager
        rvHoatDongKyNiem.setLayoutManager(new LinearLayoutManager(this));

        // Gán Adapter
        rvHoatDongKyNiem.setAdapter(adapter);

        // Xử lý sự kiện click
        adapter.setOnItemClickListener(new HoatDongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(HoatDong hoatDong) {
                // 1. Hiển thị Toast (Yêu cầu 1.5đ)
                Toast.makeText(ChucNang4Activity.this, hoatDong.getTieuDe(), Toast.LENGTH_SHORT).show();

                // 2. Chuyển nội dung sang Item4Activity (Yêu cầu 0.5đ)
                Intent intent = new Intent(ChucNang4Activity.this, Item4Activity.class);
                intent.putExtra("TIEU_DE", hoatDong.getTieuDe());
                intent.putExtra("THOI_GIAN", hoatDong.getThoiGian());
                startActivity(intent);
            }
        });
    }

    private void taoDuLieuMau() {
        // !!! QUAN TRỌNG: Bạn phải thêm các ảnh hd1, hd2, hd3... vào thư mục res/drawable
        listHoatDong.add(new HoatDong("Tiêu đề hoạt động 1", "Thời gian: 01/05/2025", R.drawable.hd1));
        listHoatDong.add(new HoatDong("Tiêu đề hoạt động 2", "Thời gian: 02/05/2025", R.drawable.hd2));
        listHoatDong.add(new HoatDong("Tiêu đề hoạt động 3", "Thời gian: 03/05/2025", R.drawable.hd3));
        listHoatDong.add(new HoatDong("Triển lãm ảnh 30/4", "Thời gian: 04/05/2025", R.drawable.hd4));
        listHoatDong.add(new HoatDong("Giao lưu nhân chứng lịch sử", "Thời gian: 05/05/2025", R.drawable.hd5));
    }
}