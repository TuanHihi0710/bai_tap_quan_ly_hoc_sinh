public class HocSinh extends Nguoi{
    private String lop;
    private String khoaHoc;
    private String kyHoc;
    public HocSinh() {
    }
    public HocSinh(String inputHoVaTen, int inputTuoi, int inputNamSinh, String inputQueQuan, String inputLop, String inputKhoaHoc, String inputKyHoc){
        super(inputHoVaTen,inputTuoi,inputNamSinh,inputQueQuan);
        lop=inputLop;
        khoaHoc=inputKhoaHoc;
        kyHoc=inputKyHoc;
    }

    public String getLop() {
        return lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public String getKyHoc() {
        return kyHoc;
    }
    public void setLop(String inputLop){
        lop=inputLop;
    }
    public void setKhoaHoc(String inputKhoaHoc){
        khoaHoc=inputKhoaHoc;
    }
    public void setKyHoc(String inputKyHoc){
        kyHoc=inputKyHoc;
    }
    public void HienThiThongTinHocSinh(){
        System.out.println("Ho va ten: "+getHoVaTen());
        System.out.println("Tuoi: "+getTuoi());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Que quan: "+getQueQuan());
        System.out.println("Lop: "+getLop());
        System.out.println("Khoa hoc: "+getKhoaHoc());
        System.out.println("Ky hoc: "+getKyHoc());
    }
}
