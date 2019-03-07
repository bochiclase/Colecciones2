import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersecion {

	private List <Integer> inter = new ArrayList <Integer>();
	private char [] array1;
	private char [] array2;
	
	public Intersecion(String cadena){
	
		 
		 String formateado = cadena.replace((char)('[' & ']' & ',' ), ' ' );
		 String[] s =  formateado.split("*");
		 String cad1  = s[0];
		 String cad2 = s[1];
		 for (int i = 0; i < cad1.length()-1; i++) {
				if (Character.isDigit(cad1.charAt(i))) {
					  array1 [i]= cad1.charAt(i);
				}
			}
		 for (int j = 0; j < cad2.length()-1; j++) {
				if (Character.isDigit(cad2.charAt(j))) {	
					char array2 [] = new char [j];
					array2 [j] = cad1.charAt(j);				 
	}
		 }
		 
		 for (int a =0; a<cad1.length() -1; a++) {
				for (int b=0; b<a; b++) {
					if(array1[a] == array2[b]) {
						inter.add((int)(array1[a]));
					}
						
					}
				}
		 
		 
		 
		 
		 
	
	}

	public List<Integer> getInter() {
		return inter;
	}

	public void setInter(List<Integer> inter) {
		this.inter = inter;
	}

	@Override
	public String toString() {
		return "Intersecion [inter=" + inter + ", array1=" + Arrays.toString(array1) + ", array2="
				+ Arrays.toString(array2) + "]";
	}
	
	
}
