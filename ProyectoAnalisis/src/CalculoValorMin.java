
public class CalculoValorMin extends Thread{
	
	private String nombreProceso;
	private int vector[];

	public CalculoValorMin(String nombreProceso, int vector[]) {
		// TODO Auto-generated constructor stub
		this.nombreProceso = nombreProceso;
		this.vector = vector;
	}
	
	public void run(){
		System.out.println("Valor máximo obtenido = "+valorMinimo());
	}
	
	//MÉTODO QUE REALIZA EL CÁLCULO DEL VALOR MÍNIMO
	public int valorMinimo(){
		int valorMinimo = 99;
		
		for(int c=0; c<vector.length; c++){
			if(vector[c] < valorMinimo){
				valorMinimo = vector[c];
			}
		}
		return valorMinimo;
	}
}
