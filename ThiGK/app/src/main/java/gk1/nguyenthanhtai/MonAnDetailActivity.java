package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import gk1.nguyenthanhtai.R;

public class MonAnDetailActivity extends AppCompatActivity {

    TextView tvMonAnDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an_detail);

        tvMonAnDetail = findViewById(R.id.tvMonAnDetail);

        // Nhận dữ liệu
        Intent intent = getIntent();
        String tenMonAn = intent.getStringExtra("TEN_MON_AN");

        if (tenMonAn != null) {
            tvMonAnDetail.setText("Bạn đã chọn món:\n" + tenMonAn);
        } else {
            tvMonAnDetail.setText("Không nhận được dữ liệu");
        }
    }
}