import java.util.HashMap;
public class hashmappractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println("HashMap: " + map);

        // Accessing values
        int appleValue = map.get("apple");
        System.out.println("Value for 'apple': " + appleValue);

        // Checking if a key exists
        boolean hasBanana = map.containsKey("banana");
        System.out.println("Contains 'banana': " + hasBanana);

        // Removing a key-value pair
        map.remove("orange");
        System.out.println("HashMap after removing 'orange': " + map);

        // Iterating through the HashMap 3 ways
        // 1. Using entrySet()
        System.out.println("Iterating using entrySet():");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 2. Using keySet()
        System.out.println("Iterating using keySet():");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // 3. Using values()
        System.out.println("Iterating using values():");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
        //foreach loop to iterate through the HashMap
        System.out.println("Iterating using foreach loop:");
        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        //fetch any value form haspmap using key
        String keyToFetch = "banana";
        if (map.containsKey(keyToFetch)) {
            int value = map.get(keyToFetch);
            System.out.println("Fetched value for '" + keyToFetch + "': " + value);
        } else {
            System.out.println("Key '" + keyToFetch + "' not found in the HashMap.");
        }
        
    }
}
