package ejercicio5;

class Coche extends Vehiculo{
@Override
	public String toString() {
		return " Cilindrada: " + getCilindrada() + ", Color: " + getColor()+ ", Tipo de ruedas:" + getRuedas() + ", Modelo: " + getModelo();
	}

private int cilindrada;
@Override
void acelerar() {
	System.out.println("El coche esta acelerando");
}
@Override
void frenar() {
	System.out.println("El coche esta frenando");
	
}
public int getCilindrada() {
	return cilindrada;
}

public void setCilindrada(int cilindrada) {
	this.cilindrada = cilindrada;
}
	
}
