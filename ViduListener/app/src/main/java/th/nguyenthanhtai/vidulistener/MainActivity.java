package th.nguyenthanhtai.vidulistener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//    Khai báo các biến tương ứng với đk bên XML layout cần tương tác
    Button btnSayhi, btnSayhello;
//    Để clean code, ta tạo một hàm tìm all đk ở đây và gọi trong Oncreate
    void TimDk(){
        btnSayhi = findViewById(R.id.bSayhi);
        btnSayhello = findViewById(R.id.bSayhello);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDk();
        btnSayhi.setOnClickListener(ngheSayhi);

        // Vô danh
        btnSayhello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            }
        });
    }
//    Hữu danh
    View.OnClickListener ngheSayhi = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Hi",Toast.LENGTH_SHORT).show();
    }
};
}