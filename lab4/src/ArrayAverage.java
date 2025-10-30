public class ArrayAverage {
    
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5}; 
        Integer[] arr2 = {1, 2, null, 4, 5}; 
        
        calculateAverage(arr1);
        calculateAverage(arr2);
    }
    
    public static void calculateAverage(Integer[] arr) {
        int sum = 0;
        try {
            
            for (int i = 0; i <= arr.length-1; i++) { 
                sum += arr[i];
            }
            double average = (double) sum / arr.length;
            System.out.println("Среднее арифметическое: " + average);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива - " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Значение не является числом - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка - " + e.getMessage());
        }
    }
}