package clc65.thanhtai.vidulamviecsqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    Cursor resultSet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Tạo cơ sở dữ liệu
        db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
//        Tạo bảng book
//        String sqlTaoBang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY, BookName text, Page integer, Price float, Description text )";
//        String sqlXoaBang = "DROP TABLE IF EXISTS BOOKS";
//        db.execSQL(sqlTaoBang);
//        db.execSQL(sqlXoaBang);
//
//        String sqlThem1 = "INSERT INTO BOOKS VALUES(1, 'Toán', 100, 88, 'Sách về Toán')";
//        String sqlThem2 = "INSERT INTO BOOKS VALUES(2, 'Văn', 100, 80, 'Sách về Văn')";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);

//        Truy vấn dữ liệu
        String sqlSelectAll = "SELECT * FROM BOOKS";
        Cursor cursor = db.rawQuery(sqlSelectAll, null);
        while (true) {
//            Lấy dữ liệu của dòng/bản ghi hiện tại, trỏ bởi resultSet
            int maSach = resultSet.getInt(0);
            String tenSach = resultSet.getString(1);
            int soTrang = resultSet.getInt(2);
            float donGia = resultSet.getFloat(3);
            String moTa = resultSet.getString(4);
//          Gói vào 1 đối tượng
//          Thêm vào 1 biến danh sách

//          Di chuyển đến bản ghi tiếp theo
            resultSet.moveToNext();
            if (resultSet.moveToNext() == false) break;
        }

        db.close();

//        Hiện lên ListView
        ListView listView = findViewById(R.id.TenSach);


    }
}