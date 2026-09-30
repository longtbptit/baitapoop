public class Student {
    private static int counter = 0;
    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;
    private String email;
    private String sdt;
    public Student(String name, double diemCC, double diemGK, double diemCK) {
        counter++;
        this.mssv = String.format("B21DCCN%03d", counter);
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }
    public static int getTotalStudents() {
        return counter;
    }
    public Student capNhatEmail(String email) {
        this.email = email;
        return this;
    }
    public Student capNhatSdt(String sdt) {
        this.sdt = sdt;
        return this;
    }
    public String getMssv() { return mssv; }
    public String getName() { return name; }
    public double getDiemCC() { return diemCC; }
    public double getDiemGK() { return diemGK; }
    public double getDiemCK() { return diemCK; }
    public void setDiemCC(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diemCC = diem;
        } else {
            System.out.println("Lỗi: Điểm CC của " + this.name + " phải từ 0-10. Giữ nguyên!");
        }
    }
    public void setDiemGK(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diemGK = diem;
        } else {
            System.out.println("Lỗi: Điểm GK của " + this.name + " phải từ 0-10. Giữ nguyên!");
        }
    }
    public void setDiemCK(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diemCK = diem;
        } else {
            System.out.println("Lỗi: Điểm CK của " + this.name + " phải từ 0-10. Giữ nguyên!");
        }
    }
    public double diemTrungBinh() {
        return this.diemCC * 0.1 + this.diemGK * 0.3 + this.diemCK * 0.6;
    }
}