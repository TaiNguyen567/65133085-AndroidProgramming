package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import gk1.nguyenthanhtai.R;

public class MonAnActivity extends AppCompatActivity {

    ListView lvMonAn;
    String[] dsMonAn = {
            "Món ăn 1",
            "Món ăn 2",
            "Món ăn 3",
            "Món ăn 4",
            "Món ăn 5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        lvMonAn = findViewById(R.id.listViewMonAn);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsMonAn
        );

        lvMonAn.setAdapter(adapter);

        lvMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tenMonAn = dsMonAn[position];
                Toast.makeText(MonAnActivity.this, tenMonAn, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MonAnActivity.this, MonAnDetailActivity.class);
                intent.putExtra("TEN_MON_AN", tenMonAn);
                startActivity(intent);
            }
        });
    }
}