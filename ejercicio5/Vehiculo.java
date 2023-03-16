package ejercicio5;

abstract class Vehiculo {
private String color;
private int ruedas;
private String modelo;

abstract void acelerar();

abstract void frenar();

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getRuedas() {
	return ruedas;
}

public void setRuedas(int ruedas) {
	this.ruedas = ruedas;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}


}
