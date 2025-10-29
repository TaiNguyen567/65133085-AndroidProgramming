package thigk2.NguyenThanhTai;

// Lớp POJO (Plain Old Java Object) để chứa dữ liệu cho mỗi item
public class HoatDong {
    private String tieuDe;
    private String thoiGian;
    private int hinhAnhDaiDien; // Dùng int để lưu ID của ảnh từ drawable (ví dụ: R.drawable.anh1)

    public HoatDong(String tieuDe, String thoiGian, int hinhAnhDaiDien) {
        this.tieuDe = tieuDe;
        this.thoiGian = thoiGian;
        this.hinhAnhDaiDien = hinhAnhDaiDien;
    }

    // Các phương thức getter
    public String getTieuDe() {
        return tieuDe;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public int getHinhAnhDaiDien() {
        return hinhAnhDaiDien;
    }
}