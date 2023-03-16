package ejercicio4;

public class Prueba {

	public static void main(String[] args) {
		suma suma1=new suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.println(suma1.toString());
		resta resta1=new resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.println(resta1.toString());
	}

}
