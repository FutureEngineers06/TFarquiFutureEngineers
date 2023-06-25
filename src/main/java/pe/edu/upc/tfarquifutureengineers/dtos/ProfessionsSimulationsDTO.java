package pe.edu.upc.tfarquifutureengineers.dtos;

public class ProfessionsSimulationsDTO {
    private String nombre;

    private int simulationCount;

    public ProfessionsSimulationsDTO() {
    }

    public ProfessionsSimulationsDTO(String nombre, int simulationCount) {
        this.nombre = nombre;
        this.simulationCount = simulationCount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSimulationCount() {
        return simulationCount;
    }

    public void setSimulationCount(int simulationCount) {
        this.simulationCount = simulationCount;
    }
}
