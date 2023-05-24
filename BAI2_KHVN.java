package Bai2;

public class KHVN extends HoaDon{
    private String DoiTuongKH;
    private int DinhMuc;

    public KHVN() {
    }

    public KHVN(String DoiTuongKH, int DinhMuc) {
        this.DoiTuongKH = DoiTuongKH;
        this.DinhMuc = DinhMuc;
    }

    public KHVN(String DoiTuongKH, int DinhMuc, String MaKH, String HoTen, String NgayRaHoaDon, int SoLuong, double DonGia) {
        super(MaKH, HoTen, NgayRaHoaDon, SoLuong, DonGia);
        this.DoiTuongKH = DoiTuongKH;
        this.DinhMuc = DinhMuc;
    }

    public String getDoiTuongKH() {
        return DoiTuongKH;
    }

    public void setDoiTuongKH(String DoiTuongKH) {
        this.DoiTuongKH = DoiTuongKH;
    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int DinhMuc) {
        this.DinhMuc = DinhMuc;
    }

    @Override
    public String toString() {
        return super.toString() + "KHVN{" + "DoiTuongKH=" + DoiTuongKH + ", DinhMuc=" + DinhMuc + '}';
    }

   
}
