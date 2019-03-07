
public class Metodo {
	public String cad1;
	public String cad2;
	
	public Metodo (String cadena) {
		 String formateado = cadena.replace((char)('[' & ']' & ',' ), ' ' );
		 String[] s =  formateado.split("-");
		 cad1  = s[0];
		 cad2 =s[1];
		 
	}

	public String getCad1() {
		return cad1;
	}

	public void setCad1(String cad1) {
		this.cad1 = cad1;
	}

	public String getCad2() {
		return cad2;
	}

	public void setCad2(String cad2) {
		this.cad2 = cad2;
	}
	
	


}
