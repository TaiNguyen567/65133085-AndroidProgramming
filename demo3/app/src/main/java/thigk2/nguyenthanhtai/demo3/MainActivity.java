package thigk2.nguyenthanhtai.demo3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import thigk2.nguyenthanhtai.demo3.R;

public class MainActivity extends AppCompatActivity {

    Button btnCN2, btnCN3, btnCN4, btnAboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCN2 = findViewById(R.id.buttonChucNang2);
        btnCN3 = findViewById(R.id.buttonChucNang3);
        btnCN4 = findViewById(R.id.buttonChucNang4);
        btnAboutMe = findViewById(R.id.buttonAboutMe);

        btnCN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChucNang2Activity.class);
                startActivity(intent);
            }
        });

        btnCN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChucNang3Activity.class);
                startActivity(intent);
            }
        });

        btnCN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChucNang4Activity.class);
                startActivity(intent);
            }
        });

        btnAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intent);
            }
        });
    }
}