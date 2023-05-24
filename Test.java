package TH4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanlykhoGD qlgd = new QuanlykhoGD();
        GiaoDichDat gddat;
        GiaoDichNha gdnha;
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Menu");
            System.out.println("1. them giao dich");
            System.out.println("2. in danh sach giao dich");
            System.out.println("3. so luong cua tung loai gia dich");
            System.out.println("4. thanh tien trung binh cua giao dich dat");
            System.out.println("0. thoat chuong trinh");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    sc.nextLine(); 
                    System.out.println("Nhap loai giao dich");
                    System.out.println("1. Giao dich dat");
                    System.out.println("2. giao dich nha");
                    System.out.println("lua chon: ");
                    int LoaiGD = sc.nextInt(); sc.nextLine();
                    
                    sc.nextLine();
                    System.out.println("Ma giao dich: "); String MaGiaDich = sc.nextLine();
                    
                    System.out.println("ngay giao dich vi du: a/b/c"); String NgayGiaoDich = sc.nextLine();
                    
                    System.out.println("Don gia: "); double DonGia = sc.nextDouble();
                    
                    System.out.println("dien tich: "); double DienTich = sc.nextDouble();
                    
                    if(LoaiGD == 1){
                        System.out.println("Nhap loai dat, chi co 3 loai dat ");
                        System.out.println("A, B, C"); sc.nextLine();
                        System.out.print("Nhap loai: ");
                        String LoaiDat = sc.nextLine();
                        gddat= new GiaoDichDat(LoaiDat, MaGiaDich, NgayGiaoDich, DonGia, DienTich, DienTich);
                        qlgd.addGD(gddat);
                    }else if(LoaiGD == 2 ){
                        sc.nextLine(); System.out.println("Nhap loai nha");
                        System.out.println("Cao cap hoac Thuong");
                        System.out.println("loai nao: ");
                        String LoaiNha = sc.nextLine();
                        System.out.println("dia chi giao dich nha: "); String DiaChi = sc.nextLine();
                        gdnha = new GiaoDichNha(LoaiNha, DiaChi, MaGiaDich, NgayGiaoDich, DonGia, DienTich, DienTich);
                        qlgd.addGD(gdnha);
                    }else{
                        System.out.println("chi co 2 loai giao dich 1 va 2");
                        System.out.println("Vui long chon lai giao dich");
                    }
                    break;
                case 2:
                    System.out.println("=== Danh sach cac giao dich ===");
                    qlgd.inGD();
                    System.out.println("===");
                    break;
                case 3:
                    qlgd.size();
                    break;
                case 4:
                    qlgd.thanhtienTB();
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
