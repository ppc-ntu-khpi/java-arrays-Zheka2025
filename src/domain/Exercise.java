package domain;

public class Exercise {
    private static int findMostFrequentNumber(int[] arr) {
        int maxCount = 0;
        int mostFrequent = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        
        return mostFrequent;
    }

    public static int Calculate(int[] arr) {
        return findMostFrequentNumber(arr);
    }
}
