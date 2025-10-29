package gk1.nguyenthanhtai;

public class BaiThuoc {
    private String tenBaiThuoc;
    private String moTa;
    private int hinhAnh; // ID từ drawable

    public BaiThuoc(String tenBaiThuoc, String moTa, int hinhAnh) {
        this.tenBaiThuoc = tenBaiThuoc;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }

    public String getTenBaiThuoc() {
        return tenBaiThuoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }
}