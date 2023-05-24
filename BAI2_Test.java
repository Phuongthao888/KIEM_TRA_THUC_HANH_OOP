package Bai2;

import Bai1.GiaoDichDat;
import Bai1.GiaoDichNha;
import Bai1.QuanlykhoGD;
import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();
        KHVN vn;
        KHNN nn;
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Menu");
            System.out.println("1. them hoa don");
            System.out.println("2. in danh sach hoa don");
            System.out.println("3. so luong cua tung loai khach hang");
            System.out.println("4. thanh tien trung binh cua hoa don khach hang nuoc ngoai");
            System.out.println("0. thoat chuong trinh");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    sc.nextLine(); 
                    System.out.println("Nhap loai khach hang");
                    System.out.println("1. Khach hang viet nam");
                    System.out.println("2. Khach hang nuoc ngoai");
                    System.out.print("lua chon: ");
                    int LoaiKH = sc.nextInt(); sc.nextLine();
                    
                    sc.nextLine();
                    System.out.print("Nhap ma khach hang: "); String MaKH = sc.nextLine();
                    
                    System.out.print("Nhap ho ten: "); String HoTen = sc.nextLine();
                    
                    System.out.print("Nhap ngay ra hoa don: "); String NgayRaHoaDon = sc.nextLine();
                    
                    System.out.print("Nhap so luong: "); int SoLuong = sc.nextInt();
                    
                    System.out.print("Nhap don gia: "); double DonGia = sc.nextDouble();
                    if(LoaiKH == 1){
                        sc.nextLine();
                        System.out.print("Nhap doi tuong khach hang: "); String DoiTuongKH = sc.nextLine();
                        System.out.print("Nhap dinh muc: "); int DinhMuc = sc.nextInt();
                        vn = new KHVN(DoiTuongKH, DinhMuc, MaKH, HoTen, NgayRaHoaDon, SoLuong, DonGia);
                        qlhd.add(vn);
                    }else if(LoaiKH == 2 ){
                        sc.nextLine(); System.out.print("Nhap quoc tich: "); String QuocTich = sc.nextLine();
                        nn = new KHNN(QuocTich, MaKH, HoTen, NgayRaHoaDon, SoLuong, DonGia);
                        qlhd.add(nn);
                    }else{
                        System.out.println("chi co 2 loai khach hang la khach hang VietNam va Nuoc Ngoai");
                        System.out.println("Vui long chon lai giao dich");
                    }
                    break;
                case 2:
                    System.out.println("=== Danh sach cac giao dich ===");
                    qlhd.in();
                    System.out.println("===");
                    break;
                case 3:
                    qlhd.size();
                    break;
                case 4:
                    qlhd.TrungbinhHoadonKHNN();
                    break;
                default:
                    if(menu!=0){
                    System.out.println("\n==================");
                    System.out.println("nhap sai, chuc nang khong ton tai");
                    System.out.println("==================");
                    }else{
                    System.out.println("Da thoat");
                    }
                }
        }while(menu!=0);
    }
}
