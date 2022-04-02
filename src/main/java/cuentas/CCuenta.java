package cuentas;

/**
 *
 * @author Jesús Alfonso Porto Bujía
 */
public class CCuenta {

/** Atributos de la clase cuenta
     *
     * 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Getter para obtener el nombre del cliente
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Setter para modificar el nombre del cliente
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Getter para obtener el número de cuenta
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Setter para modificar el número de cuenta
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Getter para obtener el saldo
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** Setter para modificar el saldo
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Getter para obtener el tipo de interés
     *
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Setter para modificar el tipo de interés
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /** Constructor vacío
     *
     */
    public CCuenta()
    {
    }

    /** Constructor con parámetros para iniciar todas las propiedades de la clase
     *
     * @param nom Nombre del cliente 
     * @param cue Número de cuenta 
     * @param sal Saldo 
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Método que devuelve el saldo disponible
     *
     * @return saldo disponible
     */
    public double estado()
    {
        return saldo;
    }

    /** Método para ingresar saldo en la cuenta
     *
     * @param cantidad Dinero a ingresar
     * @throws Exception Controla que no se introduzca cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /** Método para retirar saldo en la cuenta
     *
     * @param cantidad Dinero a retirar
     * @throws Exception Controla que no se introduzca cantidades negativas y que haya  suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
