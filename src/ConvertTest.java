import java.util.Scanner;

 class ConvertTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Введите количество грамм: ");
            double weightGram = sc.nextDouble();  // Масса
            double weightKg = 0.001 * weightGram;
            double weightIb = 0.004536 * weightGram;
            double weightCarat = 0.2 * weightGram;

            if (weightGram != 0) {
                System.out.println("В Кг: " + weightKg + " В Футах: " + weightIb + " В Каратах: " + weightCarat);
            } else {
                System.out.println("Вы ввели (0)");
            }
        }
    }

