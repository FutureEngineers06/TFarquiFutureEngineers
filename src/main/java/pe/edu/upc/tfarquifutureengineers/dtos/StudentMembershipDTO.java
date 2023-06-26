package pe.edu.upc.tfarquifutureengineers.dtos;

public class StudentMembershipDTO {

    private String beneficios;
    private int studentCount;

    public StudentMembershipDTO() {
    }

    public StudentMembershipDTO(String beneficios, int studentCount) {
        this.beneficios = beneficios;
        this.studentCount = studentCount;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}
