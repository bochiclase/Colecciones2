import java.util.*;

public class Union{
	
	private Set <Integer> union = new HashSet <Integer> ();
	
	public Union (String cadena){
		 String formateado = cadena.replace((char)('[' & ']' & ',' ), ' ' );
		 String[] s =  formateado.split("+");
		 String cad1  = s[0];
		 String cad2 = s[1];
		 for (int i = 0; i < cad1.length()-1; i++) {
				if (Character.isDigit(cad1.charAt(i))) {
					
					union.add((int)(cad1.charAt(i)));
				}
			}
		 for (int j = 0; j < cad2.length()-1; j++) {
				if (Character.isDigit(cad2.charAt(j))) {	
					union.add((int)(cad2.charAt(j))); 
	}
		 }
	
	}

	@Override
	public String toString() {
		return "Union [union=" + union + "]";
	}
		 

}


