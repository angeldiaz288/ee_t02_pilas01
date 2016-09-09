import java.util.*;
/**
 *
 * @author Angel Jair Díaz Hernández
 */
public class Pila {
	String[] pila;
	Integer tope;
	Integer tam;
	
	public Pila(Integer tama){
		pila=new String[tama];
		tope=-1;
		tam=(tama-1);
	}
	
	public void push(String dato){
		if(tope<tam){
			tope++;
			pila[tope]=dato;
		}else{
			System.out.println("Desbordamiento");
		}
	}
	
	public String pop(){
		String resultado="";
		if(tope>-1){
			resultado=pila[tope];
			pila[tope]=null;
			tope--;
		}else{
			System.out.println("Subesbordamiento");
		}
		return resultado;
	}
	
	public String peek(){
		String resultado="";
		if(tope>-1){
			resultado=pila[tope];
		}else{
			resultado = "Subdesbordamiento";
		}
		return resultado;
	}
}
