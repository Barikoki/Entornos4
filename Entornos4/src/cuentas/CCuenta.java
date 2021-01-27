package cuentas;

/**
 * Esta es la clase principal.
 * @author Raul Torralbo
 *
 */
public class CCuenta {
/**
* @param nom Nombre del cliente.
* @param cue Numero de cuenta.
* @param sal Cantidad de saldo.
* @param tipo Tipo de interes.
*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

  
    public CCuenta()
    {
    }

    /**
     * Metodo constructor de la clase principal.
     * @param nom Nombre del cliente.
     * @param cue Numero de cuenta.
     * @param sal Cantidad de saldo.
     * @param tipo Tipo de interes.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Metodo para comprobar el saldo actual.
     * @return Devuelve el saldo actual.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo que comprueba si el parametros cantidad no es negativo y lo suma al saldo.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Salta cuando la cantidad ingresada es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo que comprueba si el parametro cantidad no es negativo o la cantidad a retirar es mayor que el saldo actual. Seguidamente lo suma al saldo. 
     * @param cantidad 
     * @throws Exception Salta cuando la cantidad a retirar es negativa o la cantidad a retirar es mayor que el saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Metodo que nos devuelve el nombre del cliente
     * @return Devuelve el nombre del cliente
     */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo que establece el nombre del cliente
	 * @param nombre Nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo que devuelve el numero de cuenta
	 * @return Devuelve el numero de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Metodo que establece el numero de cuenta
	 * @param cuenta Numero de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Metodo que devuelve el saldo actual
	 * @return Devuelve el saldo actual
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Metodo que establece el saldo actual
	 * @param saldo Cantidad de saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Metodo que devuelve el tipo de interes
	 * @return Devuelve el tipo de interes
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Metodo que establece el tipo de interes
	 * @param tipoInteres Tipo de interes
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
