public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("Lan", 8, 7.5, 9);
        sv1.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");
        Student sv2 = new Student("Long", 6, 6.5, 7);
        Student sv3 = new Student("Nam", 4, 5, 4);
        System.out.println("MSSV của Lan: " + sv1.getMssv());
        System.out.println("Tổng số sinh viên đã tạo: " + Student.getTotalStudents());
        System.out.println("\n--- Thử Set điểm GK không hợp lệ cho Long ---");
        sv2.setDiemGK(-1);
        sv2.setDiemGK(11);
        System.out.println("Điểm GK của Long hiện tại (vẫn giữ giá trị cũ): " + sv2.getDiemGK());
        Classroom lopPTIT = new Classroom("Lập trình Java");
        lopPTIT.addStudent(sv1);
        lopPTIT.addStudent(sv2);
        lopPTIT.addStudent(sv3);
        lopPTIT.inBangDiem();
        System.out.println("\n--- Thử thêm sinh viên trùng MSSV ---");
        try {
            lopPTIT.addStudent(sv1);
        } catch (IllegalArgumentException e) {
            System.out.println("Bắt được ngoại lệ: " + e.getMessage());
        }

        System.out.println("\n>> Chương trình vẫn tiếp tục chạy thành công sau khi bắt lỗi!");
    }
}