package main;

import java.util.List;
import java.util.stream.Collectors;

public class MathHelper {

    public Integer sum(List<Integer> numbers){
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public Double average(List<Integer> numbers){
        return numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
    }

    public double variance(List<Integer> numbers) {

        double average = average(numbers);
        double sum = 0;

        for (int number:numbers) {
            sum += Math.pow(number - average,2);
        }

        return sum/(numbers.size()-1);
    }



}
