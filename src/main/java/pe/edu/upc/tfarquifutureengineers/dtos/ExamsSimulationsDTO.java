package pe.edu.upc.tfarquifutureengineers.dtos;

public class ExamsSimulationsDTO {
    private String name_curso;
    private int examsCount;

    public ExamsSimulationsDTO() {
    }

    public ExamsSimulationsDTO(String name_curso, int examsCount) {
        this.name_curso = name_curso;
        this.examsCount = examsCount;
    }

    public String getName_curso() {
        return name_curso;
    }

    public void setName_curso(String name_curso) {
        this.name_curso = name_curso;
    }

    public int getExamsCount() {
        return examsCount;
    }

    public void setExamsCount(int examsCount) {
        this.examsCount = examsCount;
    }


}

