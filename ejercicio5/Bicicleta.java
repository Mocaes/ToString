package ejercicio5;

class Bicicleta extends Vehiculo {
private String tipo;

@Override
void acelerar() {
	System.out.println("La bicicleta esta acelerando");
}
@Override
void frenar() {
	System.out.println("La bicicleta esta frenando");
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return " Tipo: " + getTipo() + ", Color: " + getColor()+ ", Tipo de ruedas:" + getRuedas() + ", Modelo: " + getModelo();
}

}
