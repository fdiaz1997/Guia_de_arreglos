package programa.de.arreglos;

import java.util.Scanner;
import java.util.Random;

public class ProgramaDeArreglos {

    public static void main(String[] args) {
        int N = 0, num = 0, cant = 0, par = 0, impar = 0, primo =0;
        int i, mayor, menor = 1000;
        int suma = 0;
        float promedio = 0;
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        System.out.println("ingrese numero de numeros");
        N = leer.nextInt();
        int[] numeros = new int[N];
        for (i = 0; i < N; i++) {
            numeros[i] = azar.nextInt(100) + 1;
            suma = suma + numeros[i];
            System.out.println("La suma de los números es:" + suma);

            promedio = suma / N;
            System.out.println("El promedio es:" + promedio);

            mayor = numeros[0];
            for (i = i; i < N; i++) {
                if (mayor < numeros[i]) {
                    mayor = numeros[i];
                }
            }
            System.out.println("El numero mayor es:" + mayor);

            menor = numeros[0];
            for (i = i; i < N; i++) {
                if (menor > numeros[i]) {
                    menor = numeros[i];
                }
            }
            System.out.println("El numero menor es:" + menor);

            System.out.println("ingrese un número");
            num = leer.nextInt();
            for (i = i; i < N; i++) {
                if (num == numeros[i]) {
                    cant++;
                    System.out.println("el numero está en la posición" + i);
                }
            }
                for (i = i; i < N; i++) {
                    if (numeros[i] % 2 == 0) {
                        par++;
                        System.out.println("los numeros pares son:"+par);
                    } else 
                        impar++;
                        System.out.println("los numeros impare son:"+impar);
                }
            for (i = i; i < N; i++){
                if (numeros[i]==2){
                    primo++;
                }else
                    if (numeros[i]==3){
                        primo++;
                    }else
                        if (numeros[i]==5){
                            primo++;
                        }else
                            if (numeros[i]==7){
                                primo++;
                            }else
                                if (numeros[i]==11){
                                    primo++;
                                }else
                                    if (numeros[i]==13){
                                        primo++;
                                    }else
                                        if (numeros[i]==17){
                                            primo++;
                                        }else
                                            if (numeros[i]==19){
                                                primo++;
                                            }else
                                                if (numeros[i]==23){
                                                    primo++;
                                                }else
                                                    if (numeros[i]==29){
                                                        primo++;
                                                    }else
                                                        if (numeros[i]==31){
                                                            primo++;
                                                        }else
                                                            if (numeros[i]==37){
                                                                primo++;
                                                            }else
                                                                if (numeros[i]==41){
                                                                    primo++;
                                                                }else
                                                                    if (numeros[i]==43){
                                                                        primo++;
                                                                    }else
                                                                        if (numeros[i]==47){
                                                                            primo++;
                                                                        }else
                                                                            if (numeros[i]==53){
                                                                                primo++;
                                                                            }else
                                                                                if (numeros[i]==59){
                                                                                    primo++;
                                                                                }else
                                                                                    if (numeros[i]==61){
                                                                                        primo++;
                                                                                    }else
                                                                                        if (numeros[i]==67){
                                                                                            primo++;
                                                                                        }else
                                                                                            if (numeros[i]==71){
                                                                                                primo++;
                                                                                            }else
                                                                                                if (numeros[i]==73){
                                                                                                    primo++;
                                                                                                }else
                                                                                                    if (numeros[i]==79){
                                                                                                        primo++;
                                                                                                    }else
                                                                                                        if (numeros[i]==83){
                                                                                                            primo++;
                                                                                                        }else
                                                                                                            if (numeros[i]==89){
                                                                                                                primo++;
                                                                                                            }else
                                                                                                                if (numeros[i]==97){
                                                                                                                    primo++;
                                                                                                                }
            System.out.println("los numeros primos son:"+primo);
            }
            }
            
            for (i = i; i < N; i++) {
                System.out.println(Math.pow(numeros[i], i));
            }
        }
    }
