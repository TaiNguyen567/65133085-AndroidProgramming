package thigk2.nguyenthanhtai.demo3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import thigk2.nguyenthanhtai.demo3.R;

public class Item3Activity extends AppCompatActivity {

    TextView tvItem3Detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        tvItem3Detail = findViewById(R.id.tvItem3Detail);

        // Nhận dữ liệu
        Intent intent = getIntent();
        String tenBaiHat = intent.getStringExtra("TEN_BAI_HAT");

        if (tenBaiHat != null) {
            tvItem3Detail.setText("Bạn đã chọn bài hát:\n" + tenBaiHat);
        } else {
            tvItem3Detail.setText("Không nhận được dữ liệu");
        }
    }
}