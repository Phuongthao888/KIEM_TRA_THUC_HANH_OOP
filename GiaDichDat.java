package TH4;

public class GiaoDichDat extends GiaoDich{
    private String LoaiDat;

    public GiaoDichDat(String LoaiDat, String MaGiaoDich, String NgayGiaoDich, double DonGia, double DienTich, double ThanhTien) {
        super(MaGiaoDich, NgayGiaoDich, DonGia, DienTich, ThanhTien);
        this.LoaiDat = LoaiDat;
    }

    public String getLoaiDat() {
        return LoaiDat;
    }

    public void setLoaiDat(String LoaiDat) {
        this.LoaiDat = LoaiDat;
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichDat{" + "LoaiDat=" + LoaiDat + '}';
    }
    
    @Override
    public void ThanhTien(){
        double thanhtien;
        if (LoaiDat == "A"){
           thanhtien = getDienTich() * getDonGia() * 1.5;
        }else{
           thanhtien = getDienTich() * getDonGia();
        }
    }
}
