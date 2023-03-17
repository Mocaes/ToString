package abstractandinterface;

public class Libro extends Producto {
    private String autor;

    public Libro (String nombre, String descripcion, Double precio, String autor) {
        super(nombre, descripcion, precio);
        this.autor=autor;
    }

    @Override
    public void MostrarInformacion() {
        System.out.println("El nombre es "+getNombre());
        System.out.println("La descripción es "+getDescripcion());
        System.out.println("El precio es "+getPrecio());
        System.out.println("El autor es "+autor);

    }
}
