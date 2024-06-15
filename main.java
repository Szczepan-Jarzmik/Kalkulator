import java.util.Scanner;

  class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Kalkulator podstawowych działań matematycznych - dodawania, odejmowania, mnożenia oraz dzielenia");
        
        System.out.print("Podaj pierwszą liczbę: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Podaj symbol operacji arytemtycznej: +, -, *, / : ");
        char operation = scanner.next().charAt(0);
        
        System.out.print("Podaj drugą liczbę: ");
        int number2 = scanner.nextInt();

        int result;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                    validOperation = false;
                    result = 0; // wartość domyślna, gdy operacja jest nieprawidłowa
                }
                break;
            default:
                System.out.println("Nie można wykonać działania, niepoprawny symbol operacji arytmetycznej.");
                validOperation = false;
                result = 0; // wartość domyślna, gdy operacja jest nieprawidłowa
                break;
        }

        if (validOperation) {
            System.out.println("Wynik: " + result);
        }

        System.out.println("Naciśnij klawisz Enter, aby zakończyć działanie programu.");
        scanner.nextLine();
        if (scanner.nextLine().isEmpty()) {
            System.exit(0);
        }
            else {
                System.out.println("Naciśnij klawisz Enter, aby zakończyć działanie programu.");
            }
        }
       
    }

