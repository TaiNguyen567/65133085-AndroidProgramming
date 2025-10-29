package thigk2.nguyenthanhtai.demo3;

public class HoatDong {
    private String tieuDe;
    private String thoiGian;
    private int hinhAnh;

    public HoatDong(String tieuDe, String thoiGian, int hinhAnh) {
        this.tieuDe = tieuDe;
        this.thoiGian = thoiGian;
        this.hinhAnh = hinhAnh;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }
}