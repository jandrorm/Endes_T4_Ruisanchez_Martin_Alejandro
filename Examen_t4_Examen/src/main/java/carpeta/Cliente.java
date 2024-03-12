package carpeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a Clientes
 * Nombre de los clientes
 * Apellido de los clientes
 * Id de cada cliente
 */
 public class Cliente {
 private String nombre;
 private String apellido;
 private String id;
 private List<CuentaBancaria> cuentas;

    /**
     *
     * @param nombre de la clase clientes
     * @param apellido de la clase clientes
     * @param id de cada cliente
     */
 public Cliente(String nombre, String apellido, String id) {
 this.nombre = nombre;
 this.apellido = apellido;
 this.id = id;
 this.cuentas = new ArrayList<>();
 }

    /***
     *
     * @return devuelve el nombre de cada cliente
     */
 public String getNombre() {
 return nombre;
 }

    /**
     *
     * @param nombre da un nombre a un cliente
     */
 public void setNombre(String nombre) {
 this.nombre = nombre;
 }

    /**
     *
     * @return devuelve el apellido de cliente
     */
 public String getApellido() {
 return apellido;
 }

    /**
     *
     * @param apellido da el apellido al cliente
     */
 public void setApellido(String apellido) {
 this.apellido = apellido;
 }

    /**
     *
     * @return devuelve una id a un cliente
     */
 public String getId() {
 return id;
 }

    /**
     *
     * @param id da la id a cada cliente
     */
 public void setId(String id) {
 this.id = id;
 }

    /**
     *
     * @return devuelve las cuentas a los clientes
     */
 public List<CuentaBancaria> getCuentas() {
 return new ArrayList<>(cuentas);
 }

    /**
     *
     * @param cuenta agrega cada cuenta
     */
 public void agregarCuenta(CuentaBancaria cuenta) {
 cuentas.add(cuenta);
 }

    /**
     *
     * @param numeroCuenta
     * @return
     */
 public boolean cerrarCuenta(String numeroCuenta) {
 return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
 }


 @Override public String toString() {
 return "Cliente{" +
 "nombre='" + nombre + '\'' +
 ", apellido='" + apellido + '\'' +
 ", id='" + id + '\'' +
 ", cuentas=" + cuentas +
 '}';
 }
 }
