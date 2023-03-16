package ejercicio7;

 class Sobremesa extends Ordenadores{
private int medidas;
private String caja;
public int getMedidas() {
	return medidas;
}
public void setMedidas(int medidas) {
	this.medidas = medidas;
}
public String getCaja() {
	return caja;
}
public void setCaja(String caja) {
	this.caja = caja;
}

@Override
public String toString() {
	return "Medidas: " + getMedidas()+ "Caja: " + getCaja() + ", CPU: " + getCpu() + ", Precio: " + getPrecio();
}
}
