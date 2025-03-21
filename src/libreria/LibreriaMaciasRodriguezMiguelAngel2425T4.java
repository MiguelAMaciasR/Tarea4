
package libreria;
/**
 * Clase que representa una librería con gestión de libros y saldo.
 */
public class LibreriaMaciasRodriguezMiguelAngel2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    
    /**
     * Constructor sin argumentos.
     */
    public LibreriaMaciasRodriguezMiguelAngel2425T4(){}
     /**
     * Constructor con parámetros para inicializar las propiedades de la clase.
     * @param nom Nombre del libro
     * @param cantidad Cantidad de ejemplares en stock
     * @param precio Precio unitario del libro
     * @param saldo Saldo en la cuenta de la librería
     */
    public LibreriaMaciasRodriguezMiguelAngel2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería hola
    }
    
    /**
     * Obtiene el nombre del libro.
     * @return Nombre del libro
     */
    public String obtenerNombre(){
        return getNom();
    }
       /**
     * Obtiene el precio del libro.
     * @return Precio unitario del libro
     */
    public double obtenerPrecio(){
        return getPrecio();
    }
     /**
     * Obtiene la cantidad de libros en stock.
     * @return Cantidad de ejemplares disponibles
     */
    public int obtenerStock(){
        return getCantidad();
    }
      /**
     * Obtiene el saldo en la cuenta de la librería.
     * @return Saldo disponible
     */
    public double obtenerSaldo(){
        return getSaldo();
    }
     /**
     * Aumenta el saldo de la cuenta.
     * @param saldomas Cantidad a añadir al saldo
     * @throws Exception Si la cantidad es menor o igual a cero
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(getSaldo() + saldomas);
    }
        /**
     * Compra un libro, actualizando el stock y el saldo.
     * @param canti Cantidad de ejemplares a comprar
     * @throws Exception Si la cantidad es inválida o no hay suficiente saldo o stock
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (getCantidad()>=canti){
            if (getSaldo() <= getPrecio())
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }

    /**
     * Obtiene el nombre del libro.
     * @return Nombre del libro
     */
    public String getNom() {
        return nom;
    }

    /**
     * Establece el nombre del libro.
     * @param nom Nombre del libro
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

     /**
     * Obtiene la cantidad de libros en stock.
     * @return Cantidad de libros disponibles
     */
    public int getCantidad() {
        return cantidad;
    }

   
    /**
     * Establece la cantidad de libros en stock.
     * @param cantidad Nueva cantidad de libros disponibles
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio del libro.
     * @return Precio unitario del libro
     */
    public double getPrecio() {
        return precio;
    }

     /**
     * Establece el precio del libro.
     * @param precio Nuevo precio unitario del libro
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

      /**
     * Obtiene el saldo de la librería.
     * @return Saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

       /**
     * Establece el saldo de la librería.
     * @param saldo Nuevo saldo disponible
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
