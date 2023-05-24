package Bai2;

public class HoaDon {
    private String MaKH;
    private String HoTen;
    private String NgayRaHoaDon;
    private int SoLuong;
    private double DonGia;

    public HoaDon() {
    }

    public HoaDon(String MaKH, String HoTen, String NgayRaHoaDon, int SoLuong, double DonGia) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.NgayRaHoaDon = NgayRaHoaDon;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgayRaHoaDon() {
        return NgayRaHoaDon;
    }

    public void setNgayRaHoaDon(String NgayRaHoaDon) {
        this.NgayRaHoaDon = NgayRaHoaDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaKH=" + MaKH + ", HoTen=" + HoTen + ", NgayRaHoaDon=" + NgayRaHoaDon + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
}
