package ejercicio14;

public class Notas {

	public static void main(String[] args) {
		NotasAsignaturas notas = new NotasAsignaturas();
		notas.setNotaEntornoDesarrollo(7);
		notas.setNotaProgramacion(8);
		notas.setNotaSistemasInformaticos(6);
		notas.setNotaBaseDatos(6);
		notas.setNotaLenguajeMarcas(7);
		
		System.out.println(notas.toString());

	}

}
