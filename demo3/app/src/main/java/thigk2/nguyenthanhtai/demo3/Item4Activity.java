package thigk2.nguyenthanhtai.demo3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import thigk2.nguyenthanhtai.demo3.R;

public class Item4Activity extends AppCompatActivity {

    TextView tvItem4Detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        tvItem4Detail = findViewById(R.id.tvItem4Detail);

        Intent intent = getIntent();
        String tieuDe = intent.getStringExtra("TIEU_DE");
        String thoiGian = intent.getStringExtra("THOI_GIAN");

        if (tieuDe != null && thoiGian != null) {
            tvItem4Detail.setText("Hoạt động:\n" + tieuDe + "\n\nThời gian:\n" + thoiGian);
        } else {
            tvItem4Detail.setText("Không nhận được dữ liệu");
        }
    }
}