import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 4 để chọn Menu:");
                System.out.println("1: Nhập thông tin hoc sinh");
                System.out.println("2: Xuat thong tin hoc sinh");
                System.out.println("3: Hiển thị ra màn hình tất cả những học sinh sinh năm 1985");
                System.out.println("4: Cho biết có bao nhiêu học sinh sinh năm 1985 và có quê ở Thái Nguyên");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhập thông tin hoc sinh");
                    System.out.println("Nhap vao ho va ten");
                    Scanner scHoVaTen = new Scanner(System.in);
                    String inputHoVaTen = scHoVaTen.nextLine();
                    System.out.println("Nhap vao tuoi");
                    Scanner scTuoi = new Scanner(System.in);
                    int inputTuoi = scTuoi.nextInt();
                    System.out.println("Nhap vao nam sinh");
                    Scanner scNamSinh = new Scanner(System.in);
                    int inputNamSinh = scNamSinh.nextInt();
                    System.out.println("Nhap vao que quan");
                    Scanner scQueQuan = new Scanner(System.in);
                    String inputQueQuan = scQueQuan.nextLine();
                    System.out.println("Nhap vao lop hoc");
                    Scanner scLop = new Scanner(System.in);
                    String inputLop = scLop.nextLine();
                    System.out.println("Nhap vao khoa hoc");
                    Scanner scKhoaHoc = new Scanner(System.in);
                    String inputKhoaHoc = scKhoaHoc.nextLine();
                    System.out.println("Nhap vao ky hoc");
                    Scanner scKyHoc = new Scanner(System.in);
                    String inputKyHoc = scKyHoc.nextLine();
                    quanLyHocSinh.ThemThongTinHocSinh(inputHoVaTen,inputTuoi,inputNamSinh,inputQueQuan,inputLop,inputKhoaHoc,inputKyHoc);
                } else if (nhap == 2) {
                    System.out.println("Xuat thong tin hoc sinh");
                    quanLyHocSinh.XuatThongTinHocSinh();
                } else if (nhap == 3) {
                    System.out.println("Hiển thị ra màn hình tất cả những học sinh sinh năm 1985");
                    System.out.println("Nhap vao nam sinh");
                    Scanner scNamSinh = new Scanner(System.in);
                    int inputNamSinh = scNamSinh.nextInt();
                    quanLyHocSinh.XuatThongTinHocSinhSinhNam1985(inputNamSinh);
                } else if (nhap == 4) {
                    System.out.println("Cho biết có bao nhiêu học sinh sinh năm 1985 và có quê ở Thái Nguyên");
                    System.out.println("Nhap vao nam sinh");
                    Scanner scNamSinh = new Scanner(System.in);
                    int inputNamSinh = scNamSinh.nextInt();
                    System.out.println("Nhap vao que quan");
                    Scanner scQueQuan = new Scanner(System.in);
                    String inputQueQuan = scQueQuan.nextLine();
                    quanLyHocSinh.XuatThongTinHocSinhSinhNam1985VaQueThaiNguyen(inputNamSinh, inputQueQuan);
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 5);
    }
}