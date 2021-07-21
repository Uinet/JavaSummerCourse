import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemCounter {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = Stream.of(4,5,-6,4,5,3,4,2,4,5,7).collect(Collectors.toCollection(ArrayList::new));
        ItemCounter itemCounter = new ItemCounter();
        itemCounter.itemCountMap(arrayList).entrySet().forEach(System.out::println);
    }

    public <E> Map<E,Integer> itemCountMap(List<E> list){
        Map<E,Integer> map = new TreeMap<>();
        for (E key:list) {
            map.put(key, map.containsKey(key) ? map.get(key) + 1: 1);
        }
        return map;
    }
}
