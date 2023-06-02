public class Nguoi {
    private String hoVaTen;
    private int tuoi;
    private int namSinh;
    private String queQuan;
    public Nguoi(){}
    public Nguoi(String inputHoVaTen, int inputTuoi, int inputNamSinh, String inputQueQuan){
        hoVaTen=inputHoVaTen;
        tuoi=inputTuoi;
        namSinh=inputNamSinh;
        queQuan=inputQueQuan;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
    public void setHoVaTen(String inputHoVaten){
        hoVaTen=inputHoVaten;
    }
    public void setTuoi(int inputTuoi){
        tuoi=inputTuoi;
    }
    public void setNamSinh(int inputNamSinh){
        namSinh=inputNamSinh;
    }
    public void setQueQuan(String inputQueQuan){
        queQuan=inputQueQuan;
    }
    public void HienThiThongTinNguoi(){
        System.out.println("Ho va ten: "+getHoVaTen());
        System.out.println("Tuoi: "+getTuoi());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Que quan: "+getQueQuan());
    }
}
