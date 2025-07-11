
public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }


    public DynamicArray(int capacity) {
        this.array = new Object[capacity];
        this.capacity = capacity;
    }

    public void add(Object data) {

        if(size >= capacity) {
            grow();
        }

        array[size] = data;
        size++;

    }

    public void insert(int index, Object data) {
        if(size >= capacity) {
            grow();
        }
        for(int i = size; i > index; i--) {
            array[i] = array[i - 1]; // Shift elements to the right
        }
        array[index] = data; // Insert the new element
        size++;
    }

    public void delete(Object data) {
        
        for(int i = 0; i < size; i++) {
            if(array[i] == data){
                for(int j = 0; j < size - i - 1; j++) {
                    array[i + j] = array[i + j + 1]; // Shift elements to the left
                }
                array[size - 1] = null;
                size--;
                if(size <=(int) (capacity / 3)) {
                    shrink();
                }
            }
        }
    }

    public int search(Object data) {
        return -1; // Placeholder for search logic
    }

    private void grow() {
        // Logic to grow the array when needed
    }

    private void shrink() {
        // Logic to shrink the array when needed
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        
        String string = "";

        for(int i = 0; i < capacity; i++) { // Iterate through the entire capacity
        // for(int i = 0; i < size; i++) { // Iterate only through the filled elements
            string += array[i] + ", ";
        }

        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]"; // Remove trailing comma and space
        }else{
            string = "[]"; // Return empty array representation
        }

        return string;
    }

    


}
