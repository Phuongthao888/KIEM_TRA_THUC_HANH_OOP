package Bai2;

public class KHNN extends HoaDon{
    private String QuocTich;

    public KHNN() {
    }

    public KHNN(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public KHNN(String QuocTich, String MaKH, String HoTen, String NgayRaHoaDon, int SoLuong, double DonGia) {
        super(MaKH, HoTen, NgayRaHoaDon, SoLuong, DonGia);
        this.QuocTich = QuocTich;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    @Override
    public String toString() {
        return super.toString() + "KHNN{" + "QuocTich=" + QuocTich + '}';
    }
    
}
