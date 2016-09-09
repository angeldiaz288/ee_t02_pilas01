/**
 *  Autor: Díaz Hernández Angel Jair
 */
public class Ejecutar {

	public static void main(String[] args) {
		Ejecutar e = new Ejecutar();
		e.Deci(3,"{[()]}","{[(])}","{{[[(())]]}}");
	}
	
	public void Deci(Integer a, String ar){
		if(a!=ar.length()){
			System.out.println("Introduce el número válido");
		}else{
			String f;
			boolean bandera;
			if(Rest(n, cadena)){
				for(int i=0; i<n; i++){
					if(cadena.length()%2==0){
						Pila pila = new Pila(cadena[i].length());
						int j=0;
						bandera=true;
						while(bandera){
							if(cadena[i].charAt(j)=='{' || cadena[i].charAt(j)=='[' || cadena[i].charAt(j)=='('){
								pila.push(cadena[i].charAt(j)+"");
							}else{
								f=pila.pop()+cadena[i].charAt(j);
								if(f.equals("[]") || f.equals("()") || f.equals("{}")){
									bandera=true;
								}else{
									System.out.println("No");
									break;
								}
							}
							if(pila.peek().equals("Subdesordenamiento")){
								bandera=false;
								System.out.println("Sí");
							}
							j++;
						}
						
						}else{
							System.out.println("No");
						}
					}
				}else{
					System.out.println("Valores fuera de rango");
				}
			}
	}
		
			
		
		public boolean Rest(Integer n, String ar){
			boolean re=true;
			if(n>=1 && n<=(10*10*10)){
				for(int i=0; i<n; i++){
					if(ar[i].length()>=1 && ar[i].length()<=(10*10*10)){
					re=true;
				}else{
					re=false;
					break;
				}
			}
			}else{
				re=false;
			}
			return re;
		}
}
