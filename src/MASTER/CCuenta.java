package MASTER;
/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones de ingreso y retiro.
 *
 * @author Jorge Alegre
 * @version 1.0
 */

 public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Constructor por Defecto
 */
    public CCuenta() {
    }


/**
 *
 * @param nom Nombre del titular
 * @param cue Nombre de la cuenta
 * @param sal Saldo inicial
 * @param tipo Tipo de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo) {

        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * @return Saldo de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
