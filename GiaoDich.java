package TH4;

public class GiaoDich {
    private String MaGiaoDich;
    private String NgayGiaoDich;
    private double DonGia;
    private double DienTich;
    private double ThanhTien;

    public GiaoDich() {
    }

    public GiaoDich(String MaGiaoDich, String NgayGiaoDich, double DonGia, double DienTich, double ThanhTien) {
        this.MaGiaoDich = MaGiaoDich;
        this.NgayGiaoDich = NgayGiaoDich;
        this.DonGia = DonGia;
        this.DienTich = DienTich;
        this.ThanhTien = ThanhTien;
    }

    public String getMaGiaoDich() {
        return MaGiaoDich;
    }

    public void setMaGiaoDich(String MaGiaoDich) {
        this.MaGiaoDich = MaGiaoDich;
    }

    public String getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(String NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public void ThanhTien(){
        System.out.println("Chua biet loai giao dich la gi");
    }
    
    @Override
    public String toString() {
        return "GiaoDich{" + "MaGiaoDich=" + MaGiaoDich + ", NgayGiaoDich=" + NgayGiaoDich + ", DonGia=" + DonGia + ", DienTich=" + DienTich + ", ThanhTien=" + ThanhTien + '}';
    }
    
}
