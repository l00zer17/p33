    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char inputChar;
            System.out.println("Wpisz znak: ");

            while (true) {
                inputChar = scanner.next().charAt(0);  // Pobieranie pojedynczego znaku
                if (inputChar == 'q') {
                    System.out.println("Wpisano 'q'. Zakończono program.");
                    break;  
                }

            
                System.out.println("Wprowadzony znak: " + inputChar);
            }

            scanner.close(); 
        }
    }
