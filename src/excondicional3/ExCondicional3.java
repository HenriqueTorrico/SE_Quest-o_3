package excondicional3;
    import java.util.Scanner;
public class ExCondicional3 {

    public static void main(String[] args) {
        Scanner Num = new Scanner (System.in);
        System.out.println("Digite o primeiro número");
        double a = Num.nextDouble();
        System.out.println("Digite o segundo número");
        double b = Num.nextDouble();
        System.out.println("Digite o terceiro número");
        double c = Num.nextDouble();
        if ((a + b > c) || (a + c > b) || (b + c > a))
            if ((a == b) && (a == c) && (b == c))
                System.out.println("Triângulo Equilátero");
            else
                if ((a != b) && (a != c) && (b != c))
                    System.out.println("Trinângulo Escaleno");
                else
                    if ((a ==b) || (a != c) || (b == c))
                        System.out.println("Triângulo Isósceles");
        else
            System.out.println("Os valores não formam um triângulo");
    }    
}
