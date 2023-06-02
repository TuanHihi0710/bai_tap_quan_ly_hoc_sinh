import java.util.ArrayList;
import java.util.List;

public class QuanLyHocSinh {
    private List<HocSinh> danhSachHocSinh;
    QuanLyHocSinh(){
        danhSachHocSinh= new ArrayList<>();
    }
    public void ThemThongTinHocSinh(String inputHoVaTen, int inputTuoi, int inputNamSinh, String inputQueQuan, String inputLop, String inputKhoaHoc, String inputKyHoc){
        HocSinh hocSinh = new HocSinh(inputHoVaTen,inputTuoi,inputNamSinh,inputQueQuan,inputLop,inputKhoaHoc,inputKyHoc);
        danhSachHocSinh.add(hocSinh);
    }
    public void XuatThongTinHocSinh(){
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            danhSachHocSinh.get(i).HienThiThongTinHocSinh();
        }
    }
    public void XuatThongTinHocSinhSinhNam1985(int inputNamSinh){
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            if (danhSachHocSinh.get(i).getNamSinh() == inputNamSinh);
            danhSachHocSinh.get(i).HienThiThongTinHocSinh();
        }
    }
    public int XuatThongTinHocSinhSinhNam1985VaQueThaiNguyen(int inputNamSinh,String inputQueQuan){
        int count = 0;
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            if (danhSachHocSinh.get(i).getNamSinh() == inputNamSinh &&danhSachHocSinh.get(i).getQueQuan().equals(inputQueQuan)){
                danhSachHocSinh.get(i).HienThiThongTinHocSinh();
                count++;
            }
        }
        return count;
    }
}
