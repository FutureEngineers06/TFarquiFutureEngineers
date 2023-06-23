package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="memberships")
public class Memberships {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMemberships;

    @Column(name="montoMembership", length=60, nullable = false)
    private String monto_pago;

    @Column(name="beneficios", length = 100, nullable = false)
    private String beneficios;

    @Column(name="metodoPago", length=50, nullable = false)
    private String metodo_de_pago;

    public Memberships() {
    }

    public Memberships(int idMembership, String monto_pago, String beneficios, String metodo_de_pago) {
        this.idMemberships = idMembership;
        this.monto_pago = monto_pago;
        this.beneficios = beneficios;
        this.metodo_de_pago = metodo_de_pago;
    }

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
