package clc65.thanhtai.vidulistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView dsname;
    ArrayList<String> lstName = new ArrayList<String>();
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lstName);
    void Timten(){
        dsname = findViewById(R.id.dsName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timten();


//        chuẩn bị dữ liệu hiển thị
//    Khai báo
//        ArrayList<String> lstName = new ArrayList<String>();
//    lấy dữ liệu đưa vào listname
        lstName = getData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lstName);
        dsname.setAdapter(adapter);
        dsname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Xử lí việc chọn item ở đây
//                biến position lưu vị trí item được chọn
//                (4.1). Lấy giá trị của phần tử được chọn
//                  Cách 1. Lấy gián tiếp qua adapter
                String ten = adapter.getItem(position).toString();
//                  Cách 2. Lấy trực tiếp từ biến chứa danh sách
                String ten2 = adapter.getItem(position);
                String thongbao = "Bạn đã chọn " + ten;
                Toast.makeText(MainActivity.this, thongbao, Toast.LENGTH_SHORT).show();
            }
        });
    }
    ArrayList<String> getData(){
        //    code đọc dữ liệu và cất vào biến tạm, trước khi return
        ArrayList<String> lstTam = new ArrayList<String>();
//    code ở đây
//    bài này, ta hardcore, ta fake dữ liệu tại đây cho nhanh
        lstTam.add("Nguyễn Văn A");
        lstTam.add("Nguyễn Văn B");
        lstTam.add("Nguyễn Văn C");
        return lstTam;
    }


}
