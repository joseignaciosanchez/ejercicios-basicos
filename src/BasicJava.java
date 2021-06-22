import java.util.ArrayList;

public class BasicJava {

	//Imprimir 1 - 255
	public void imprimirNumeros(int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
	
	//Imprimir los Números Impares Entre 1 - 255
	public void imprimirImpares(int num) {
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0){
				System.out.println(i);
            }
		}
	}
	
	//Imprimir la Suma
	public void imprimirSuma(int num) {
		int sum = 0;
		for(int i = 0; i <= num; i++){									
			sum += i;
			System.out.println("Nuevo número: "+i+ " Suma: "+sum);		
		}
	}
	
	//Recorrer un Arreglo
	public void recorrerArray(int[] array) {
		for(int i = 0; i < array.length; i++){											
			System.out.println(array[i]);
		}		
	}

	//Encontrar el Máximo
	public void numMayor(int[] array) {
		int mayorHastaAhora = array[0];
		for (int i = 0; i < array.length; i++) {			
	        if(array[i] > mayorHastaAhora){		
	            mayorHastaAhora = array[i];	
	        }		
	    }				
		System.out.println(mayorHastaAhora);
	}

	//Obtener el Promedio
	public void obtenerProm(int[] array) {
		int sum = 0;
	    for(int i = 0; i < array.length; i++){
	        sum += array[i];        
	    }    
	    int promedio = sum / array.length;
	    System.out.println(promedio);
	}

	//Arreglo con Números Impares
	public ArrayList<Integer> arrayNumImpares(ArrayList<Integer> y, int num) {
		for(int i = 1; i <= num; i++){
	        if(i % 2 == 1){     
	        	y.add(i);
	        }
	    }
	    return y;
	}
	
	//Mayor que Y
	public int cantNumMayorY(int[] array, int y) {
		int cantNum = 0;	
	    for (int i = 0; i < array.length; i++) {			
	        if(array[i] > y){		        	
	        	cantNum++;            
	        }		        
	    }			
	return cantNum;
	}

	//Valores al Cuadrado
	public ArrayList<Integer> valorCuadrado(int[] array, ArrayList<Integer> arrayAux) {
		for(int i = 0; i < array.length; i++){
	        array[i] = array[i]*array[i];
	        arrayAux.add(array[i]);
	    } 	    		
		return arrayAux;
	}

	//Eliminar Números Negativos
	public ArrayList<Integer> reemplazarNumNeg(int[] array, ArrayList<Integer> arrayAux) {
		for(int i = 0; i < array.length; i++){
	        if(array[i] < 0){
	        	array[i] = 0;	        	
	        }
	        arrayAux.add(array[i]);
	    } 
		return arrayAux;
	}

	//Mínimo, Máximo y Promedio
	public ArrayList<Integer> maxMinProm(int[] array, ArrayList<Integer> arrayAux) {
		int valorMax = array[0];			
	    int valorMin = array[0];
	    int sum = 0;
	    int promedio = 0;
	    for (int i = 0; i < array.length; i++) {			
	        if(array[i] > valorMax){		
	            valorMax = array[i];	          
	        }		
	    }						
	    for (int i = 0; i < array.length; i++) {			
	        if(array[i] < valorMin){		
	            valorMin = array[i];	          
	        }		
	    }			
	    for(int i = 0; i < array.length; i++){
	        sum += array[i];        
	    }    
	    promedio = sum / array.length;
	    arrayAux.add(valorMax);
	    arrayAux.add(valorMin);
	    arrayAux.add(promedio);
	    return arrayAux;
	}

	//Cambiando los Valores del Arreglo
	public ArrayList<Integer> cambValArray(int[] array, ArrayList<Integer> arrayAux) {
		for (int i = 0; i < array.length; i++) {			
			arrayAux.add(array[i]);
		}
		arrayAux.add(0);
		arrayAux.remove(0);
		return arrayAux;
	}
	

}
