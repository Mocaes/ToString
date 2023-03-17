package abstractandinterface;

public class Nevera extends Producto{
    private String color;

    public Nevera (String nombre, String descripcion, double precio, String color) {
        super(nombre, descripcion, precio);
        this.color = color;
    }


    @Override
    public void MostrarInformacion() {
        System.out.println("El nombre es "+getNombre());
        System.out.println("La descripción es "+getDescripcion());
        System.out.println("El precio es "+getPrecio());
        System.out.println("El color es "+color);
    }

}
