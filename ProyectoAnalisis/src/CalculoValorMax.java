
public class CalculoValorMax extends Thread{
	
	private String nombreProceso;
	private int vector[];

	public CalculoValorMax(String nombreProceso, int vector[]) {
		// TODO Auto-generated constructor stub
		this.nombreProceso = nombreProceso;
		this.vector = vector;
	}
	
	public void run(){
		System.out.println("Valor máximo obtenido = "+valorMaximo());
	}
	
	//MÉTODO QUE REALIZA EL CÁLCULO DEL VALOR MÁXIMO
	public int valorMaximo(){
		int valorMaximo = 0;
		
		for(int b=0; b<vector.length; b++){
			if(vector[b] > valorMaximo){
				valorMaximo = vector[b];
			}
		}
		return valorMaximo;
	}
}
