package crud.primeiro.javaweb.introducao;

public class RepeticaoFor {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração #" + i);
        }

        //while
        int contador = 0;

        while (contador < 5) {
            System.out.println("while Iteração #" + contador);

            contador++;
        }

        //do while
        int contador2 = 0;

        do {
            System.out.println("do while Iteração #" + contador2);
            contador2++;
        }while (contador2 < 5);
    }
}
