package abstractandinterface;

public class Main {
    public static void main(String[] args) {
        Libro anillos = new Libro("El señor de los Anillos", "Un Libro ÉPICO de fantasía. Escrito por el inigualable Tolkien", 14.99, "JRR Tolkien");
        Producto producto = new Producto("SSD 500GB","Almacenamiento épico",69.99) {
            @Override
            public void MostrarInformacion() {
                System.out.println("El nombre es "+getNombre());
                System.out.println("La descripción es "+getDescripcion());
                System.out.println("El precio es "+getPrecio());
            }
        };
        Nevera neveron = new Nevera("Épica Nevera Bosch", "Like a Bosch", 299.99, "Metálico");

        anillos.MostrarInformacion();
        producto.MostrarInformacion();
        neveron.MostrarInformacion();
    }
}
