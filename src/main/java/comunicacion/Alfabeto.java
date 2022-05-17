package comunicacion;
import java.util.*;

public class Alfabeto extends Pictograma{
	
	private  String [] letras ;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
		// TODO Auto-generated constructor stub
	}
	
		
	
	public String[] getLetras() {
		return letras;
	}



	public void setLetras(String[] letras) {
		this.letras = letras;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

		

	public int cantidadLetras() {
		return letras.length;
	}
	

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String solucion ="";
		for(String letra: letras) {
			solucion += letra + ", ";			
		}
		return solucion;
	}
	
	
	

}
