import java.util.Arrays;

public class BinarySearch {

    private BinarySearch(){ }

    public static void main(String[] args) {

    }

    public static int indexOf(int [] temp, int key){
        int low = 0;
        int high = temp.length - 1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            if (key < temp[middle]) high = middle - 1;
            else if (key > temp[middle]) low = middle + 1;
            else return middle;
        }
        return -1;
    }

    @Deprecated
    public static int rank(int key, int[] temp){
        return indexOf(temp, key);
    }
}
