package exemplo;

public class Variaveis {
 public static void main(String[] args) {
 /* Variáveis do tipo primitivo*/
 // Para valores inteiros temos:
 int inteiro = 10;
 long inteiroMaior = 100000L;
 
 // Para valores reais temos:
 float real = 10.0f;
 double realMaior = 30.11;
 
 // Para valores letras temos:
 char letra = 'L';
 
 // Para valores booleanos temos:
 boolean booleano = true; // ou false
 
 /* Variáveis do tipo Wrapper (classe) */
 
 // Para valores inteiro temos:
 Integer wInterio = 30;
 Long wInteiroMaior = 100000l;
 
 // Para valores reais temos:
 Float wReal = 10.0f;
 Double wRealMaior = 31.0;
 
 // Para valores texto temos:
 String wTexto = "Segunda aula de Java";
 
 // Para valores do tipo booleanos temos:
 Boolean wBooleanp = false;
 }
}


// modificadores de acesso - classe   package    subclasse  global
// + public                 sim       sim        sim       sim
// # protected              sim       sim        sim       não
// [#] default              sim       sim        não       não
// - private                sim       não        não       não