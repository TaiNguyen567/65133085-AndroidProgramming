package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import gk1.nguyenthanhtai.R;

public class BaiThuocDetailActivity extends AppCompatActivity {

    TextView tvTenBaiThuocDetail, tvMoTaDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_thuoc_detail);

        tvTenBaiThuocDetail = findViewById(R.id.tvTenBaiThuocDetail);
        tvMoTaDetail = findViewById(R.id.tvMoTaDetail);

        Intent intent = getIntent();
        String tenBaiThuoc = intent.getStringExtra("TEN_BAI_THUOC");
        String moTa = intent.getStringExtra("MO_TA");

        if (tenBaiThuoc != null && moTa != null) {
            tvTenBaiThuocDetail.setText(tenBaiThuoc);
            tvMoTaDetail.setText(moTa);
        } else {
            tvTenBaiThuocDetail.setText("Không nhận được dữ liệu");
            tvMoTaDetail.setText("");
        }
    }
}