import java.io.*;
import java.util.*;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;

public class Book {
    /**
     * @param args
     */

    /* File */
    private static String filename = "src/main/books2.csv";
    private static File file = new File(filename);

    /* Data */
    private static String data;

    /* Testing BookList */
    private static List<String> BookList;

    /* ArrayList List Declaration */
    private static ArrayList<String> arraylist = new ArrayList<String>();

    /* Linked List Declaration */
    private static LinkedList<String> linkedlist = new LinkedList<String>();

    /* Search list */
    public static void searchList(String arg)
    {
        if (arraylist.isEmpty()) {
            System.out.println("Search using linkedList");
            for (String element : linkedlist){
                if (element.contains(arg)){
                    System.out.println(element);
                }
            }
        } else {
            System.out.println("Search using arraylist");
            for (String element : arraylist){
                if (element.contains(arg)){
                    System.out.println(element);
                }
            }
        }

    }

    /* Sort list */
    public static void sortList(String arg)
    {
        // TODO

        /*
        linkedlist.sort(element);
        System.out.println("Sorted string array in ascending order: ");

        linkedlist.sort(element, Collections.reverseOrder());

         */
    }

    /* Get Data */
    public static void getListData(boolean isArrayList, boolean isLinkedList)
    {
        try {
            Scanner scanner = new Scanner(file); //parsing a CSV file into Scanner class constructor
            while(scanner.hasNext()) { //returns a boolean value
                data = scanner.nextLine(); //find and returns the next complete row from this scanner
                // System.out.println(data);

                if (isArrayList) {
                    getArrayList(data);
                } else {
                    getLinkedList(data);
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* LinkedList */
    public static void getLinkedList(String data)
    {

        // --- LinkedList Code STARTS ---
        linkedlist.add(data); // add to linkedlist
        System.out.println("Linked List: " + linkedlist); // print out linkedlist

        // --- Iterating LinkedList ---
//        Iterator<String> iterator = linkedlist.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // --- LinkedList Code ENDS ---
    }

    /* ArrayList */
    public static void getArrayList(String data)
    {
        // --- ArrayList Code STARTS ---

        arraylist.add(data); // add to arraylist
        System.out.println("Array List: " + arraylist); // print out arrayList

        // --- Iterating ArrayList ---
//            for(String str: arraylist) {
//                System.out.println(str);
//            }

        // --- ArrayList Code ENDS ---
    }

    public static void main(String[] args) throws Exception
    {

        /* get csv data - Add or Remove comment to use the arrayList or linkedList as needed */
        getListData(true, false); // using arrayList
//        getListData(false, true); // using linkedList

        /* Add or Remove comment to use the functions as needed */

        /* search - pass in arg to search for */
        searchList("43902348");

        /* sort - pass in arg to sort for */
        // sortList();
    }
}
