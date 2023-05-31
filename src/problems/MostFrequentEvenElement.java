package problems;

import java.util.*;

public class MostFrequentEvenElement {
    public static int mostFrequentEven(int[] nums) {

        int[] array = Arrays.stream(nums).filter(i -> i % 2 == 0).toArray();

        if (array.length == 0) return -1;

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!integerMap.containsKey(array[i])) {
                integerMap.put(array[i], 1);
            } else {
                integerMap.put(array[i],integerMap.get(array[i])+1);
            }
        }

        int maxValue = Collections.max(integerMap.values());

        List<Integer> outputList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : integerMap.entrySet())
        {
            if(entry.getValue() == maxValue) outputList.add(entry.getKey());
        }

        return Collections.min(outputList);
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290}));
    }
}
