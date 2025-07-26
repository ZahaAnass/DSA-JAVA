import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        // Hash table = A data structure that maps unique keys to values ex. <Integer, String>
        //              Each key-value pair is known as an Entry
        //              Fast insertion, lookup, and deletion of key-value pairs
        //              Not ideal for small data sets but great with large data sets

        // Hashing = Takes a key and computes a, integer (fomula will vary based on key & data type)
        //           In a Hashtable, we use tha hash % capacity to calculate an index number

        //           key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more Entries
        //          can store multiple Entries in case of a collision (linked similarly a LinkedList)

        // collision = hash function generates the same index for more than one key 
        //             less collision = more efficiency

        // Runtime complexity = Best Case O(1)
        //                      Average Case O(1)
        //                      Worst Case O(n)


        Hashtable<Integer, String> IntegerTable = new Hashtable<>(10);
        Hashtable<String, String> StringTable = new Hashtable<>(10);

        IntegerTable.put(100, "SpongeBob");
        IntegerTable.put(123, "Patrick");
        IntegerTable.put(321, "Squidward");
        IntegerTable.put(555, "Sandy");
        IntegerTable.put(777, "Mr. Krabs");

        StringTable.put("100", "SpongeBob");
        StringTable.put("123", "Patrick");
        StringTable.put("321", "Squidward");
        StringTable.put("555", "Sandy");
        StringTable.put("777", "Mr. Krabs");

        IntegerTable.remove(777); // removing Mr. Krabs

        System.out.println("Hash Table for Integer Keys:");
        for(Integer key : IntegerTable.keySet()) {
            System.out.println( key.hashCode() % 10 + "\t" + "Key: " + key + ", Value: " + IntegerTable.get(key));
        }

        System.out.println("\nHash Table for String Keys:");
        for(String key : StringTable.keySet()) {
            System.out.println( key.hashCode() % 10 + "\t" + "Key: " + key + ", Value: " + StringTable.get(key));
        }
        
    }
}