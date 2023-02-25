package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9, 9, 9};
        
        int mostFrequent = Exercise.Calculate(arr);
        
        System.out.println("Найчастішим числом у масиві є: " + mostFrequent);
    }
}
