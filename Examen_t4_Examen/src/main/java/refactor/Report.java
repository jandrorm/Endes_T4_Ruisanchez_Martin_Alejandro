package refactor;
/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
public class Report {

    void printReport() {
        // imprimir título
        private void printtitle(){
            System.out.println("Título del Reporte");
        }
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...


        // imprimir conclusion
        private void printconclusion(){
            System.out.println("Conclusión del Reporte");

        }
    }



