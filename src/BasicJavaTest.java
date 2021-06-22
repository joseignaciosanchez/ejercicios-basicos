import java.util.ArrayList;

public class BasicJavaTest {

	public static void main(String[] args) {
		
		BasicJava javaBasico = new BasicJava();
		
		//javaBasico.imprimirNumeros(255);		
		
		//javaBasico.imprimirImpares(255);
		
		//javaBasico.imprimirSuma(255);
		
		//int[] array = {1,3,5,7,9,13};
		//javaBasico.recorrerArray(array);
		
		//int[] array = {-3,-5,-7};
		//javaBasico.numMayor(array);
		
		//int[] array = {2,10,3};
		//javaBasico.obtenerProm(array);
		
		//ArrayList<Integer> y = new ArrayList<Integer>();
		//System.out.println(javaBasico.arrayNumImpares(y,255));
		
		//int[] array = {1,3,5,7};
		//int y = 3;
		//System.out.println(javaBasico.cantNumMayorY(array,y));
		
		//int[] array = {1,5,10,-2};
		//ArrayList<Integer> arrayAux = new ArrayList<Integer>();
		//System.out.println(javaBasico.valorCuadrado(array,arrayAux));
		
		//int[] array = {1,5,10,-2};
		//ArrayList<Integer> arrayAux = new ArrayList<Integer>();
		//System.out.println(javaBasico.reemplazarNumNeg(array,arrayAux));
		
		//int[] array = {1,5,10,-2};
		//ArrayList<Integer> arrayAux = new ArrayList<Integer>();
		//System.out.println(javaBasico.maxMinProm(array,arrayAux));
		
		int[] array = {1,5,10,7,-2};
		ArrayList<Integer> arrayAux = new ArrayList<Integer>();
		System.out.println(javaBasico.cambValArray(array,arrayAux));
	}

}
