package crud.primeiro.javaweb.introducao;

public class Aula01BasicoJava {
    public static void main(String[] args) {
        // Tipos primitivos int, boolean, char, float, byte, short, long double
        int inteiro = 10;
        char caracter = 'D';
        byte guardaOitoBits = 127;
        short guardaDezesseisBits = 32767;
        long numeroGrande = 498755996;
        double flutuanteGrande = 2300.54;
        float numeroFlutuante = 32.9F;
        boolean verdadeiro = true;
        boolean falso = false;

        // Operadores aritiméticos + - * / % e atribuição =
        int soma = 40 + 30;
        float subtracao = 40 - 30;
        double divisao = 40.0 / 30;
        long multiplicacao = 40 * 30;
        short resto = 40 % 30;

        // Operadores de comparação ou relacionais == != > < >= <=
        boolean igual = 10 == 20; //false
        boolean diferente = 10 != 20; //true
        boolean maiorQUE = 10 > 20; //false
        boolean menorQUE = 10 < 20; //true
        boolean maiorIgual = 10 >= 20; //false
        boolean menorIgual = 10 <= 20; //true

        // Operadores lógicos && || !
        boolean x = 10 < 20, y = 10 <= 20;

        if (x && y)
            System.out.println("Ambas as condições são verdadeiras");
        if (x || y)
            System.out.println("Uma das condições é verdadeira");
        if (!x != x)
            System.out.println("A condição é verdadeira");

        //Estruturas de controle (condições, repetições) if, else if, else

        boolean estaChovendo = true;
        boolean estaVentadno = false;
        boolean estaNublado = true;

        if (estaChovendo && estaVentadno) {
            System.out.println("Chovendo e ventando. Guarda-chuva forte.");
        }else if (estaChovendo && !estaVentadno) {
            System.out.println("Chovendo, porém não está ventando. Guarda-chuva comum");
        }else if (estaNublado) {
            System.out.println("Nublado. Guarda-chuva por precaução");
        }else {
            System.out.println("Ensolarado. Sem guarda-chuva");
        }
    }
}
