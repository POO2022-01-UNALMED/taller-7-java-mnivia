package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenaza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenaza;
		this.interpretacion=interpretacion;
		// TODO Auto-generated constructor stub
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		int sol=0;
		sol=this.getPaginas()*palabrasPagina;
		return sol;
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return this.interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
