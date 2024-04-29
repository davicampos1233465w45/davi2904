package condicional;

public class davi29042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double num, quad, cubo, raiz;

        System.out.print("Digite um numero: ");
        num = scanner.nextDouble();

        while (num > 0) {
            quad = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);

            System.out.printf("Numero: %.2f\n", num);
            System.out.printf("Quadrado: %.2f\n", quad);
            System.out.printf("Cubo: %.2f\n", cubo);
            System.out.printf("Raiz quadrada: %.2f\n", raiz);

            System.out.print("Enter a number: ");
            num = scanner.nextDouble();
        }
    }
}