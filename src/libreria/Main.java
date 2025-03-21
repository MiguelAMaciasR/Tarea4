
package libreria;
/**
 * Clase principal para ejecutar la gestión de la librería.
 */
public class Main {
  
    public static void main(String[] args) {
        LibreriaMaciasRodriguezMiguelAngel2425T4 miLibreriaMaciasRodriguezMiguelAngel2425T4;//
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaMaciasRodriguezMiguelAngel2425T4 = new LibreriaMaciasRodriguezMiguelAngel2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteMaciasRodriguezMiguelAngel(miLibreriaMaciasRodriguezMiguelAngel2425T4);
        
        saldoActual = miLibreriaMaciasRodriguezMiguelAngel2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaMaciasRodriguezMiguelAngel2425T4.obtenerNombre();
        stock = miLibreriaMaciasRodriguezMiguelAngel2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        aniadeIngresoMaciasRodriguezMiguelAngel(miLibreriaMaciasRodriguezMiguelAngel2425T4, "Libro vendido");
    }
       /**
     * Añade un ingreso al saldo de la librería.
     * @param miLibreria Instancia de la librería
     * @param concepto Concepto del ingreso
     */
    private static void aniadeIngresoMaciasRodriguezMiguelAngel(LibreriaMaciasRodriguezMiguelAngel2425T4 miLibreriaMaciasRodriguezMiguelAngel2425T4, String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaMaciasRodriguezMiguelAngel2425T4.aumentarSaldo(ingreso);
            saldoActual = miLibreriaMaciasRodriguezMiguelAngel2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
     /**
     * Realiza la compra de un libro.
     * @param miLibreria Instancia de la librería
     */
    private static void compraQuijoteMaciasRodriguezMiguelAngel(LibreriaMaciasRodriguezMiguelAngel2425T4 miLibreriaMaciasRodriguezMiguelAngel2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaMaciasRodriguezMiguelAngel2425T4.obtenerPrecio();
            saldoActual = miLibreriaMaciasRodriguezMiguelAngel2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaMaciasRodriguezMiguelAngel2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
