# Практична робота "Масиви, вирази, керування виконанням програми"
## Знайти в масиві число, яке повторюється найбільшу кількість разів
-------
**Пояснення:**

У цій програмі ми маємо два класи: ````Exercise```` та ````TestResult````.

Клас Exercise містить статичний метод ````Calculate````, який приймає масив цілих чисел та повертає ціле число - найбільш повторюване число в масиві.

Для того, щоб знайти найбільш повторюване число в масиві, ми використовуємо метод ````findMostFrequentNumber```` в класі ````Exercise````, який працює за наступним **алгоритмом**:

* Ініціалізуємо змінну ````maxCount```` нулем та змінну ````mostFrequent```` першим елементом масиву.
* Проходимо по елементам масиву та для кожного елементу обчислюємо кількість його повторень в масиві. Якщо кількість повторень поточного елементу більше, ніж максимальна кількість повторень, зберігаємо цей елемент у змінну ````mostFrequent```` та оновлюємо значення змінної ````maxCount````.
* Повертаємо найбільш повторюване число в масиві.

Клас ````TestResult```` містить метод ````main````, який створює масив цілих чисел та викликає метод ````Calculate```` класу ````Exercise```` з цим масивом, щоб знайти найбільш повторюване число в масиві. Після цього, він виводить результат на екран.

-----

Код класу **TestResult:**

```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9, 9, 9};
        
        int mostFrequent = Exercise.Calculate(arr);
        
        System.out.println("Найчастішим числом у масиві є: " + mostFrequent);
    }
}
```

Код класу **Exercise:**

```java

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
```

**Результат:**

![](https://i.ibb.co/svnkv3k/image.png)

