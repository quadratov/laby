import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final String LOG_FILE = "errors.txt";
    private static void log(String text){
        try {
            Files.write(Paths.get(LOG_FILE), text.getBytes());
        }
        catch (IOException e) {
            System.err.println("ошибка логирования");
        }
    }
   
    public static double divideNumbers(double a, double b) throws CustomDivisionException {
        if (b == 0) {
            throw new CustomDivisionException("деление на 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try { 
            divideNumbers(1, 0);
        }
        catch (CustomDivisionException e) {
            log(e.getMessage());
        }
    }
}
