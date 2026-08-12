import java.util.HashSet;
public class hashsetpractice {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);
        //check the hashcode generated for the hashset
        System.out.println("Hashcode of hashset is: " + hashSet.hashCode());

        System.out.println("Size of hashset is: " + hashSet.size());
        //hashcode of individual elements
        for(Integer element : hashSet){
            System.out.println("Hashcode of element " + element + " is: " + element.hashCode());
        }

        //printing elements inside the hashset in hashset order
        System.out.println("Elements inside the hashset are: "+hashSet);

        //hashset functions
        if(hashSet.contains(1)){
            System.out.println("Hashset contains 1");
        } else {
            System.out.println("Hashset does not contain 1");
        }
        //hashset 2
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(3);
        System.out.println("Hashset 2 is: " + hashSet2);
        //union of hashset and hashset2
        hashSet.addAll(hashSet2);
        System.out.println("Union of hashset and hashset2 is: " + hashSet);
        //intersection of hashset and hashset2
        hashSet.retainAll(hashSet2);
        System.out.println("Intersection of hashset and hashset2 is: " + hashSet);
        //difference of hashset and hashset2
        hashSet.removeAll(hashSet2);
        System.out.println("Difference of hashset and hashset2 is: " + hashSet);
        //clear the hashset
        //hashSet.clear();
        //System.out.println("Hashset after clearing is: " + hashSet);

        //hashset to array
        Integer[] array = new Integer[hashSet.size()];
        hashSet.toArray(array);
        System.out.println("Hashset to array is: ");
        for(Integer element : array){
            System.out.println(element);    }
    }
}
