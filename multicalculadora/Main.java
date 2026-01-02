// Multicalculadora
// Open-ended school project (2022), written at age 17
// Console-based multi-function calculator with a text menu (in Spanish)

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
    int z=0;
while (z==0){ //Creamos un bucle while para poder repetir el programa
System.out.println("    _________________________________________________________________________________________________________");
System.out.println("");
System.out.println("    | Esto es una multicalculadora, a continuación, introduzca por teclado el programa que quiere efectuar |");
System.out.println("    _________________________________________________________________________________________________________");
System.out.println("");
System.out.println("");
System.out.println("    Pulse 1 para calcular el determinante de una matriz ");
System.out.println("");
System.out.println("    Pulse 2 para calcular (dentro de una serie de números) el mayor, el menor, la suma de todos, su media, y su moda");
System.out.println("");
System.out.println("    Pulse 3 para calcular un factorial");
System.out.println("");
System.out.println("    Pulse 4 para calcular un sumatorio");
System.out.println("");
System.out.println("    Pulse 5 para calcular una potencia (un número elevado a otro)");
System.out.println("");
System.out.println("    Pulse 6 para descomponer un número en factores primos");
System.out.println("");
System.out.println("    Pulse 7 para calcular suma, resta, producto y división de dos números");
System.out.println("");
System.out.println("");

Scanner sc = new Scanner(System.in);
int w= sc.nextInt ();

String wString;
        switch (w) {
            case 1:{
                int n=0;
       		int[][] matriz = new int[3][3];
       		
  System.out.println("A continuación le vamos a pedir los valores que quiere darle a los elementos de la matriz.");   
  System.out.println("Vaya introduciéndolos de izquierda a derecha y de arriba a abajo."); 
  System.out.println("Es decir, primero el elemento 1.1, luego el 1.2, luego el 1.3, luego el 2.1, etc."); 
for (int i=0; i<= 2; i++){
    for (int j=0; j<= 2; j++){
    
             System.out.println("Introduzca un número entero: ");
             n = sc.nextInt();
           			matriz[i][j]=n;
}
}
for (int i=0; i<= 2; i++){
    for (int j=0; j<= 2; j++){
             System.out.print(" "+matriz[i][j]+" ");
    }
    System.out.println();
}
//Calculamos determinante
int suma1= (matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[1][0]*matriz[2][1]*matriz[0][2]);
int suma2= (matriz[0][2]*matriz[1][1]*matriz[2][0])+(matriz[0][0]*matriz[2][1]*matriz[1][2])+(matriz[0][1]*matriz[1][0]*matriz[2][2]);
int determinante= suma1-suma2;
System.out.println("El determinante de tu matriz es: "+determinante);    
           break;
           }
            case 2:{
                    int n=0;
       		int L=0;
       		int repeticiones=0;
       		int moda=0;
       		int maxrepeticiones=0;
            int mayor=0;
            int menor=0;
            double suma=0;
            double media=0;
       		System.out.println("Inserte la cantidad de números que va a introducir al programa: ");
       		L = sc.nextInt();

       		int[] serie = new int[L];
for (int i=0; i<= (L-1); i++){
             System.out.println("Introduzca un número entero: ");
             n = sc.nextInt();
             if (i==0){
             mayor = n;
             menor = n;
             }
           			serie[i]=n;
           			if (n>mayor)mayor = n;
                    if (n<menor)menor = n;
                    suma = (suma+n);

}

for (int j=0; j<L; j++){
             repeticiones=0; 
            for (int k=0; k<L; k++){
                if (serie[j]==serie[k]) repeticiones++;
                if (repeticiones>maxrepeticiones){
                    moda=serie[j];
                    maxrepeticiones=repeticiones;
                }
}
   
}
media = (suma/L);
System.out.println("El número mayor es "+ mayor);
System.out.println("El número menor es "+ menor);
System.out.println("La suma de los números es "+ suma);
System.out.println("La media de los números es "+ media); 
System.out.println("La moda es "+moda+" y se repite "+maxrepeticiones+" veces");
            break;
                
            }
             case 3:{
               int n=0;
int factorial=0;

System.out.println("Introduzca el número del cual quiere averiguar el factorial: ");
n = sc.nextInt();

factorial=fact(n);
System.out.println("El factorial de "+n+" es: "+factorial);     
            break;
                
            }
             case 4:{
                     System.out.println ("Introduce un numero para hacer su sumatorio");
        int n = sc.nextInt ();
        int sumatorio=0;
        System.out.println ("El sumatorio de " + n + " es: " + sumatorio(n));
   
            break;
                
            }
             case 5:{
                  double n;
	double m;
	double resultado = 1;
	System.out.println("Introduzca 2 numeros para calcular una potencia.");
	System.out.println("El primer número será la base y el segundo el exponente.");
	System.out.println(".............................................................................");
	System.out.println("Introduzca el primer número: ");
             n = sc.nextDouble();
    System.out.println("Introduzca el segundo número: ");
             m = sc.nextDouble();   
             
   for (int i=1; i<=m; i++){
       resultado= resultado*n;
   }
    
    System.out.println("El resultado es: " + resultado);  
            break;
                
            }
             case 6:{
               int n;

System.out.println("Introduzca un número entero: ");

n = sc.nextInt();

System.out.print( n + "= ");
for(int i=2; i<=n; i++){
    while(n%i==0){
        n=n/i;
       System.out.print(i + "*");
      
    }
}
 System.out.print("1");
            break;
                
            }
             case 7:{
                double n;
	double m;
	System.out.println("Introduzca 2 numeros para calcular su suma, diferencia, producto y división. ");
	System.out.println("(El primer número resta y divide al segundo.)");
	System.out.println(".............................................................................");
	System.out.println("Introduzca el primer número: ");
             n = sc.nextDouble();
    System.out.println("Introduzca el segundo número: ");
             m = sc.nextDouble();   
    double suma = n+m;         
    double resta = n-m;
    double multiplicacion = n*m;
    double division = n/m;
    
    System.out.println("La suma es: " + suma);
    System.out.println("La diferencia es: " + resta);
    System.out.println("El producto es: " + multiplicacion);
    System.out.println("La división es: " + division);
    
            break;
                
            }
        }
        System.out.println("");
    System.out.println("Si quiere volver a realizar un cálculo pulse 0, y si quiere salir del programa pulse 1.");
    z = sc.nextInt();    
}
}
    
public static int fact (int x){
    int resultado=1;
     for (int i=x; i>0; i--)
	    {
           resultado=resultado*i;
	    }

	    return resultado; 
	    }
public static int sumatorio(int n){
	    int sumatorio = 0;
	    for(int i=1; i<=n; i++){
	        sumatorio = sumatorio + i ;
	    }
	    return sumatorio;
	}

}












