package crud.primeiro.javaweb.introducao;

public class ColecaoEnum {
    public static void main(String[] args) {
        pedirSorvete(SaboresDeSorvete.CHOCOLATE);
    }

    public static void pedirSorvete(SaboresDeSorvete sabor) {
        System.out.println("Você escolheu sabor " + sabor);
    }
}
