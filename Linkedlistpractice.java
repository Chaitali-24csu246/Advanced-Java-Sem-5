import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Linkedlistpractice {
    public static void main(String[] args) {
        //creation default
        LinkedList<String> list1 = new LinkedList<String>();
        LinkedList<String> list2= new LinkedList();
        //adding
        list1.add("java");
        list1.add("python");
        System.out.println("list1: "+list1);
        //adding at index
        list1.add(1,"c++");
        System.out.println("list1 after adding at index: "+list1);

        //removing
        list1.remove("python");
        System.out.println("list1 after removing: "+list1);
        //remove by index
        list1.remove(0);
        System.out.println("list1 after removing by index: "+list1);

        //creating od type integer
        //Collection classes only work with wrapper classes not primitive data types
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        //LinkedList<int> list4 = new LinkedList(); //this will give error because int is primitive data
        
        //replacing
        list1.set(0,"javascript");
        System.out.println("list1 after replacing: "+list1);

        // check if something is there, boolean value is returned
        list1.contains("javascript");
        System.out.println("list1 contains javascript: "+list1.contains("javascript"));

        //shifting to similar existing liat
        list2.addAll(list1);
        System.out.println("list2 after adding all from list1: "+list2);

        //remove all
        list1.clear();
        System.out.println("list1 after clearing: "+list1);

        //checking size
        System.out.println("size of list2: "+list2.size());

        //iterate using for each
        for(String s: list2){
            System.out.println(s);
        }

       //Indexof
       System.out.println("Index of javascript in list2: "+list2.indexOf("javascript"));
       //checking if empty
         System.out.println("is list1 empty: "+list1.isEmpty());

        list1.addFirst("jello");
        //using iterator
        for(String s: list1){
            System.out.println(s);
        }
        for(String s: list1){
            //list.add("hi");//concurrent modification exception will be thrown because we are trying to modify the list while iterating over it
        }
        //solution iterators
        Iterator<String> it = list1.iterator();//creates virtual cursor over the position 
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove(); //removes the element from the list
        }
        //getfirst getlast 
        System.out.println("first element: "+list1.getFirst());
        System.out.println("last element: "+list1.getLast());
        System.out.println("list1 after setting first and last: "+list1);
    list1.add("hi");
        list1.add("hello");

        //list iterator
        ListIterator<String> lit = list1.listIterator();
    
        while(lit.hasNext()){
            lit.add("1");
            System.out.println(lit.next());
            
        }
        System.out.println("list1 after adding hi using list iterator: "+list1);
        //set lust iterator to the start of the list
        lit = list1.listIterator();
        while(lit.hasNext()){
            
            System.out.println(lit.next());
            lit.add("2");
            
        }
        System.out.println("list1 after adding hi using list iterator: "+list1);
//reading right to left
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
