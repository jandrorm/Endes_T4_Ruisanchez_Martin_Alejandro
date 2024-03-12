package carpeta;


/**
 * Clase que representa a las cuentas
 * numeros de cuentas
 * saldod e cada cuenta
 * propietarios de cada cuenta
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    /**
     *
     * @param numeroCuenta de cada cliente
     * @param saldo de cada cuenta
     * @param propietario de cada cuenta
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     *
     * @return devuelve el numero de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     *
     * @param numeroCuenta da el numero de cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     *
     * @return devuelve el saldo de cada cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo da el saldo de cada cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return devuelve el propietario de cada cuenta
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario da el propietario de cada cuenta
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @param cantidad que se puede depositar en cada cuenta
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     *
     * @param cantidad  que se puede retirar
     * @return cantidad si es menor que el saldo
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}