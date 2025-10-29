package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

import gk1.nguyenthanhtai.R;

public class BaiThuocActivity extends AppCompatActivity {

    RecyclerView rvBaiThuoc;
    BaiThuocAdapter adapter;
    List<BaiThuoc> listBaiThuoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bai_thuoc);

        rvBaiThuoc = findViewById(R.id.rvBaiThuoc);
        listBaiThuoc = new ArrayList<>();

        taoDuLieuMau();

        adapter = new BaiThuocAdapter(this, listBaiThuoc);
        rvBaiThuoc.setLayoutManager(new LinearLayoutManager(this));
        rvBaiThuoc.setAdapter(adapter);

        adapter.setOnItemClickListener(new BaiThuocAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaiThuoc baiThuoc) {
                Toast.makeText(BaiThuocActivity.this, baiThuoc.getTenBaiThuoc(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(BaiThuocActivity.this, BaiThuocDetailActivity.class);
                intent.putExtra("TEN_BAI_THUOC", baiThuoc.getTenBaiThuoc());
                intent.putExtra("MO_TA", baiThuoc.getMoTa());
                startActivity(intent);
            }
        });
    }

    private void taoDuLieuMau() {
        listBaiThuoc.add(new BaiThuoc("Trà gừng", "Giúp trị cảm lạnh, hỗ trợ tiêu hóa", R.drawable.img_1));
        listBaiThuoc.add(new BaiThuoc("Tỏi ngâm mật ong", "Trị ho, tăng cường đề kháng", R.drawable.img_1));
        listBaiThuoc.add(new BaiThuoc("Lá tía tô", "Giải cảm, trị sốt", R.drawable.img_1));
        listBaiThuoc.add(new BaiThuoc("Nghệ và mật ong", "Hỗ trợ dạ dày", R.drawable.img_1));
    }
}