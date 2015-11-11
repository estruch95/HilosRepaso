
public class Main {

	public static void main(String[] args) {
		//VECTOR DE 100 ENTEROS REALES
		int vectorDatos[] = new int[100];
		
		//RELLENO DE DICHO VECTOR CON NÚMEROS ALEATORIOS DE 0 A 100
		for(int z=0; z<vectorDatos.length; z++){
			int numAleatorio = (int) Math.floor(Math.random()*100);
			vectorDatos[z] = numAleatorio;
			//System.out.println(vectorDatos[z]);
		}
		
		//CREACIÓN DE DIFERENTES THREADS
		CalculoMedia procesoMedia;
		CalculoValorMax procesoVmax;
		CalculoValorMin procesoVmin;
		
		//DECLARACIÓN Y PUESTA EN MARCHA DE DICHOS THREADS
		System.out.println("Datos = "+vectorDatos.length);
		procesoMedia = new CalculoMedia("Media", vectorDatos);
		procesoMedia.start();
		procesoVmax = new CalculoValorMax("ValorMax", vectorDatos);
		procesoVmax.start();
		procesoVmin = new CalculoValorMin("ValorMin", vectorDatos);
		procesoVmin.start();
		
	}
}
