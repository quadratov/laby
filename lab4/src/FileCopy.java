import java.io.*;

public class FileCopy {
    
    public static void copyFile(String sourcePath, String destPath) {
        FileInputStream source = null;
        FileOutputStream destination = null;
        
        try {
            source = new FileInputStream(sourcePath);
            destination = new FileOutputStream(destPath);
            
            System.out.println("Файлы успешно открыты");
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = source.read(buffer)) > 0) {
                destination.write(buffer, 0, length);
            }
            
            System.out.println("Файл успешно скопирован");
            
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Ошибка безопасности: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        } finally {

            try {
                if (source != null) {
                    source.close();
                    System.out.println("Исходный файл закрыт");
                }
                if (destination != null) {
                    destination.close();
                    System.out.println("Файл назначения закрыт");
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
    
        copyFile("source.txt", "destination.txt");
    }
}