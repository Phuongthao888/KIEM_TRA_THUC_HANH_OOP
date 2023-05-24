package Bai2;

import Bai1.GiaoDichDat;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
    private ArrayList<HoaDon> quanly;
    HoaDon hd;
    Scanner sc = new Scanner(System.in);
    
    public QuanLyHoaDon(){
        quanly = new ArrayList<>();
    }
    
    public void add(HoaDon hd){
        quanly.add(hd);
    }
    
    public void in(){
        for (HoaDon hd : quanly) {
            System.out.println(hd);
        }
    }
    public void size() {
        int hoadonVN = 0;
        int hoadonNN = 0;
        for (HoaDon hd : quanly) {
            if (hd instanceof KHVN) {
                hoadonVN++;
            }  else if (hd instanceof KHNN) {
                hoadonNN++;
            }
        }
        System.out.println("Tong so luong hoa don cua KHVN la: " + hoadonVN);
        System.out.println("Tong so luong hoa don cua KHNN la: " + hoadonNN);
    }
    public void TrungbinhHoadonKHNN(){
        int sizeKH = 0;
        double tongtien=0;
        for (HoaDon hd : quanly) {
            if(hd instanceof KHNN){
                sizeKH++;
                tongtien += hd.getDonGia();
            }
        }
        if(sizeKH > 0){
            double trungbinh = tongtien/sizeKH;
            System.out.println("Trung binh thanh tien hoa don cua khach hang nuoc ngoai la" + trungbinh);
        }else{
            System.out.println("Chua co giao dich nao");
        }
    }
}
