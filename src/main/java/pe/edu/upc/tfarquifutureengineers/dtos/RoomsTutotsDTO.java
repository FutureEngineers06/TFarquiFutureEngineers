package pe.edu.upc.tfarquifutureengineers.dtos;

public class RoomsTutotsDTO {
    private String nombre_completo;
    private int roomsCount;

    public RoomsTutotsDTO() {
    }

    public RoomsTutotsDTO(String nombre_completo, int roomsCount) {
        this.nombre_completo = nombre_completo;
        this.roomsCount = roomsCount;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }
}
