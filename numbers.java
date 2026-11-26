import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NumbersExercise {
    public static void main(String[] args) {
        // 1. Print every number between 20 and 100 (inclusive) that is divisible by 3.
        //    Expected: 21, 24, 27 ... 99 (27 numbers)


        // 2. Find the class average of the following test scores, rounded to one decimal place.
        //    Expected: 85.4
        int[] scores = {88, 84, 100, 92, 70, 76, 76, 84, 86, 98};


       System.out.printf("numbers: %s", IntStream.range(20, 100)
        .boxed()
        .filter(n->n%3 == 0)
        .collect(Collectors.toList()))
        ;

        int sum =  Arrays.stream(scores).sum();
        int length = scores.length;
        double result = (double)sum/(double)length;
        System.out.printf("result:%.1f", Math.round(result*10)/10.0);

    }
}
