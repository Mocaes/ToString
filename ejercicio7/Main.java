package ejercicio7;

public class Main {

	public static void main(String[] args) {
		Portatil portatilMsi= new Portatil();
		System.out.println("Portatil");
		portatilMsi.setCpu("Intel");
		portatilMsi.setBateria(5000);
		portatilMsi.setPantalla(1200);
		portatilMsi.setPrecio(1200);
		System.out.println(portatilMsi.toString());
		
		System.out.println();
		Sobremesa sobremesa= new Sobremesa();
		System.out.println("Sobremesa");
		sobremesa.setCpu("AMD");
		sobremesa.setCaja("Noxus");
		sobremesa.setMedidas(25);
		sobremesa.setPrecio(1200);
		System.out.println(sobremesa.toString());
		
	}
	
}
