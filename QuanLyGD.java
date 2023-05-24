package TH4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlykhoGD {
    private ArrayList<GiaoDich> qlgd = new ArrayList<GiaoDich>();
    Scanner sc = new Scanner(System.in);
    GiaoDich gd; 

    public QuanlykhoGD(){
        qlgd = new ArrayList<>();
    }
    
    public void addGD(GiaoDich gd){
        qlgd.add(gd);
    }
    
    public void inGD(){
        for (GiaoDich gd : qlgd) {
            System.out.println(gd);
        }
    }
    
   public void size() {
        int sizenha = 0;
        int sizedat = 0;
        for (GiaoDich gd : qlgd) {
            if (gd instanceof GiaoDichNha) {
                sizenha++;
            } else if (gd instanceof GiaoDichDat) {
                sizedat++;
            }
        }
        System.out.println("Tong so luong giao dich nha la: " + sizenha);
        System.out.println("Tong so luong giao dich dat la: " + sizedat);
    }
    
    public void thanhtienTB(){
        int sizedat = 0;
        double thanhtien=0;
        for (GiaoDich gd : qlgd) {
            if(gd instanceof GiaoDichDat){
                sizedat++;
                thanhtien += gd.getDonGia() * gd.getDienTich();
            }
        }
        if(sizedat > 0){
            double trungbinhthanhtien = thanhtien/sizedat;
            System.out.println("Trung binh thanh tienla" + trungbinhthanhtien);
        }else{
            System.out.println("Chua co giao dich nao");
        }
    }
}
