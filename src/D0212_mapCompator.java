import java.util.*;

public class D0212_mapCompator {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 5);
        myMap.put(2, 2);
        myMap.put(3, 8);
        myMap.put(4, 1);

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(myMap.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
