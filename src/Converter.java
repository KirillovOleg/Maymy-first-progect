import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Необходимо написать программу конвертер физических величин.
        //Масса: кг<->грамм<->фунт(lb)<->карат в любую сторону
        //Длина (расстояние): метр<->миля<->ярд<->фут в любую сторону

        Scanner scan = new Scanner(System.in);
        String vvod = "Введите исходное значение:";
        String nonCorrect = "Вы сделали не корректный выбор";
        System.out.println("Выберите, что переводить: Масса (1) или Длина (2)");
        int vibor = scan.nextInt();
        if (vibor == 1) {
            System.out.println("Вы выбрали перевод масс");
            System.out.println("Выберите, начальный тип массы: Кг (1), Грамм (2), Фунт (3), Карат (4)");
            int i = scan.nextInt();
            if (i == 1) {
                System.out.println(vvod);
                ConvertWeight coWt = new ConvertWeight();
                coWt.conW();                // Вызываем метод

            } else if (i == 2) {
                System.out.println(vvod);

            } else if (i == 3) {
                System.out.println(vvod);
            } else if (i == 4) {
                System.out.println(vvod);
            } else {
                System.out.println(nonCorrect);
            }

        } else if (vibor == 2) {
            System.out.println("Вы выбрали перевод длин");
            System.out.println("Выберите начальный тип длины: Метр (1), Миля (2), Ярд (3), Фут (4)");
            int i = scan.nextInt();
            if (i == 1) {
                System.out.println(vvod);
            } else if (i == 2) {
                System.out.println(vvod);
            } else if (i == 3) {
                System.out.println(vvod);
            } else if (i == 4) {
                System.out.println(vvod);
            } else {
                System.out.println(nonCorrect);
            }
        } else {
            System.out.println(nonCorrect);
        }
    }

}

class ConvertWeight {
    Scanner sc = new Scanner(System.in);
    private double weightGram = sc.nextDouble();  // Масса
    private final double weightKg = 0.001 * weightGram;
    private final double weightIb = 0.004536 * weightGram;
    private final double weightCarat = 0.2 * weightGram;
    public void setWeightGram(double weightGram) {
        this.weightGram = weightGram;

            /*if(weightGram !=0) {
        System.out.println("В Кг: " + weightKg + " В Футах: " + weightIb + " В Каратах: " + weightCarat);
    } else {
                System.out.println("Вы ввели (0)");
            }*/

    }
    void conW(){
            double weightGram = sc.nextDouble();
            if(weightGram !=0) {
                System.out.println("В Кг: " + weightKg + " В Футах: " + weightIb + " В Каратах: " + weightCarat);
            } else {
                System.out.println("Вы ввели (0)");
            }
        }


    public double getWeightGram(){
//        if(weightGram !=0) {
//            System.out.println("В Кг: " + weightKg + " В Футах: " + weightIb + " В Каратах: " + weightCarat);
//        } else {
//            System.out.println("Вы ввели (0)");
//        }
        return weightGram;
    }
}

