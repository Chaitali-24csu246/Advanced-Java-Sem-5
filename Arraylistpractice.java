import java.util.ArrayList;
public class Arraylistpractice {
    public static void main(String[] args) {
        //creation default
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2= new ArrayList();
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
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        //ArrayList<int> list4 = new ArrayList(); //this will give error because int is primitive data
        
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

        //creating a copy
        ArrayList<String> list4 = new ArrayList<String>(list2);

       //Indexof
       System.out.println("Index of javascript in list2: "+list2.indexOf("javascript"));
       //checking if empty
         System.out.println("is list1 empty: "+list1.isEmpty());

         //ensure capacity(minimum capacity of the arraylist)
            list2.ensureCapacity(20);
    //creating arraylist with size 
        ArrayList<String> list5 = new ArrayList<String>(10);
        System.out.println("list5: "+list5);
        //size
        System.out.println("size of list5: "+list5.size());
        //remove all from list 5
        list5.removeAll(list5);
        System.out.println("list5 after removing all: "+list5);
        //size
        System.out.println("size of list5 after removing all: "+list5.size());

        //explore other methods
        //list2.trimToSize(); //trims the capacity to the current size
        //list2.get(0); //returns element at specified index
        //list2.set(0, "new value"); //replaces element at specified index

    }
}