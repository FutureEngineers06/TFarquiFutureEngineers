package pe.edu.upc.tfarquifutureengineers.dtos;

import javax.persistence.Column;

public class MembershipsDTO {

    private int idMemberships;

    private String monto_pago;

    private String beneficios;

    private String metodo_de_pago;

    public int getIdMemberships() {
        return idMemberships;
    }

    public void setIdMemberships(int idMemberships) {
        this.idMemberships = idMemberships;
    }

    public String getMonto_pago() {
        return monto_pago;
    }

    public void setMonto_pago(String monto_pago) {
        this.monto_pago = monto_pago;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getMetodo_de_pago() {
        return metodo_de_pago;
    }

    public void setMetodo_de_pago(String metodo_de_pago) {
        this.metodo_de_pago = metodo_de_pago;
    }
}
