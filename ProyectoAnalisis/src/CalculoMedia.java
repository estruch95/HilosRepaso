
public class CalculoMedia extends Thread{
	
	private String nombreProceso;
	private int vector[];

	public CalculoMedia(String nombreProceso, int vector[]) {
		// TODO Auto-generated constructor stub
		this.nombreProceso = nombreProceso;
		this.vector = vector;
	}
	
	public void run(){
		System.out.println("Media obtenida = "+calculoMedia());
	}
	
	//MÉTODO QUE REALIZA EL CÁLCULO DE LA MEDIA 
	public int calculoMedia(){
		int totalSuma = 0;
		int totalMedia = 0;
		
		for(int a=0; a<vector.length; a++){
			totalSuma += vector[a];
		}
		totalMedia = (totalSuma/vector.length);
		return totalMedia;
	}
}
