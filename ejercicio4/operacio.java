
package ejercicio4;
import java.util.Scanner;
public abstract class operacio {
	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;
	
	public operacio() {
		teclado=new Scanner (System.in);
	}
	public void cargar1() {
	System.out.print("Ingrese el primer valor:");
	valor1=teclado.nextInt();
	}
	public void cargar2() {
		System.out.print("Ingrese el segundo valor:");
		valor2=teclado.nextInt();
	}
	public abstract void operar();
	
	@Override
	public String toString() {
		return "El resultado de la operacion es:" + resultado;
	}
}
