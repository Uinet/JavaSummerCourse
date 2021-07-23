import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,-4,0,4,2,3,-2,3,0,-10};
        int number = 10;

        double average = Arrays.stream(array).average().orElse(.0);
        //double average = Arrays.stream(array).summaryStatistics().getAverage();
        long countEqualsZero = Arrays.stream(array).filter(a -> a == 0).count();
        long countGreaterZero = Arrays.stream(array).filter(a -> a > 0).count();
        //List<Integer> changedList = Arrays.stream(array).map(a -> a * number).boxed().collect(Collectors.toList());
        int [] changedArray =  Arrays.stream(array).map(a -> a * number).toArray();
        //int min = Arrays.stream(array).summaryStatistics().getMin();
        //int min = Arrays.stream(array).min().getAsInt();
        int min = Arrays.stream(array).reduce(Integer.MAX_VALUE, Math::min);
        int minNumberIndex = IntStream.range(0,array.length).filter(index -> array[index] == min).findFirst().orElse(-1);

        System.out.println("Average: " + average);
        System.out.println("The number of elements that are equal to zero: " + countEqualsZero);
        System.out.println("The number of elements that are greater than zero: " + countGreaterZero);
        System.out.println("Array times " + number + ": " + Arrays.toString(changedArray));
        System.out.println("Min number: " + min + " min number index: " + minNumberIndex);

    }
}
