package com.company;

import java.util.*;

class UngVien{
    public String hoten;
    public int namsinh;
    public String gioitinh;
    public float chieucao;
    public float cannang;
    public String quequan;
    public String chuyennganh;
    public float diemTB;
}

public class Main {

    public static void main(String[] args) {
        String[] attributes = new String[]{"hoten","namsinh","gioitinh","chieucao","cannang","quequan","chuyennganh","diemtb"};

        Scanner input = new Scanner(System.in);

        List<Map<String,String>> list = new ArrayList<Map<String,String>>();

        for (int i = 0; i < 4; i++) {
            System.out.println(String.format("Moi nhap ung vien so %d: ",i + 1));

            Map<String,String> uv = new HashMap<String,String>();

            for (int j = 0; j < attributes.length; j++) {
                String attribute = attributes[j];
                System.out.println(String.format("Nhap %s: ",attribute));
                String s = input.nextLine();
                uv.put(attribute,s);
            }

            list.add(uv);
        }

        for (Map<String, String> stringStringMap : list) {
            for (Map.Entry<String,String> entry : stringStringMap.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        input.close();
    }

//    public static UngVien nhapUngVien(int i){
//        Scanner input = new Scanner(System.in);
//        UngVien ungVien = new UngVien();
//        System.out.println(String.format("Moi nhap ung vien so %d: ",i));
//        System.out.println("Nhap ho ten: ");
//        ungVien.hoten = input.nextLine();
//
//        System.out.println("Nhap nam sinh: ");
//        ungVien.namsinh = input.nextInt();
//
//        System.out.println("Nhap gioi tinh: ");
//        ungVien.gioitinh = input.nextLine();
//
//        System.out.println("Nhap chieu cao: ");
//        ungVien.chieucao = input.nextFloat();
//
//        System.out.println("Nhap can nang: ");
//        ungVien.cannang = input.nextFloat();
//
//        System.out.println("Nhap que quan: ");
//        ungVien.quequan = input.nextLine();
//
//        System.out.println("Nhap chuyen nganh: ");
//        ungVien.chuyennganh = input.nextLine();
//
//        System.out.println("Nhap diem TB: ");
//        ungVien.diemTB = input.nextFloat();
//
//        return ungVien;
//    }
//
//    public static void xuatUngVien(UngVien ungVien,int i){
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//        System.out.println("Ung vien so: " + i);
//
//    }
}
