package TH4;

public class GiaoDichNha extends GiaoDich{
    private String LoaiNha;
    private String DiaChi;

    public GiaoDichNha(String LoaiNha, String DiaChi, String MaGiaoDich, String NgayGiaoDich, double DonGia, double DienTich, double ThanhTien) {
        super(MaGiaoDich, NgayGiaoDich, DonGia, DienTich, ThanhTien);
        this.LoaiNha = LoaiNha;
        this.DiaChi = DiaChi;
    }

    public String getLoaiNha() {
        return LoaiNha;
    }

    public void setLoaiNha(String LoaiNha) {
        this.LoaiNha = LoaiNha;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    public void ThanhTien(){
        double thanhtien;
        if(LoaiNha.equals("Cao cap")){
            thanhtien = getDienTich() * getDonGia();
        }else{
            thanhtien = getDienTich() * getDonGia() * 0.9;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichNha{" + "LoaiNha=" + LoaiNha + ", DiaChi=" + DiaChi + '}';
    }
    
}
