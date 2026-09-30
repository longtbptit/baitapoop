import java.util.ArrayList;
import java.util.List;
public class Classroom {
    private String tenLop;
    private List<Student> danhSach;
    public Classroom(String tenLop) {
        this.tenLop = tenLop;
        this.danhSach = new ArrayList<>();
    }
    public void addStudent(Student s) {
        for (Student st : danhSach) {
            if (st.getMssv().equals(s.getMssv())) {
                throw new IllegalArgumentException("Từ chối thêm: MSSV " + s.getMssv() + " đã tồn tại trong lớp!");
            }
        }
        danhSach.add(s);
    }
    public String xepLoai(Student s) {
        double dtb = s.diemTrungBinh();
        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
    public void inBangDiem() {
        System.out.println("\n=== BẢNG ĐIỂM LỚP " + this.tenLop + " ===");
        for (Student s : danhSach) {
            System.out.printf("- %s | %s | ĐTB: %.2f | Xếp loại: %s\n",
                    s.getMssv(), s.getName(), s.diemTrungBinh(), xepLoai(s));
        }
        System.out.println(">> Sĩ số lớp: " + danhSach.size());
        System.out.println("===================================");
    }
}