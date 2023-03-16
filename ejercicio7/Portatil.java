package ejercicio7;

 class Portatil extends Ordenadores {
	private int Pantalla;
	private int Bateria;
	
	public int getPantalla() {
		return Pantalla;
	}
	public void setPantalla(int pantalla) {
		Pantalla = pantalla;
	}
	public int getBateria() {
		return Bateria;
	}
	public void setBateria(int bateria) {
		Bateria = bateria;
	}
	@Override
	public String toString() {
		return "Pantalla: " + getPantalla()+ "Bateria: " + getBateria() + ", CPU: " + getCpu() + ", Precio: " + getPrecio();
	}


}
