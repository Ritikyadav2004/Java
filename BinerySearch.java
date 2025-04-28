public class BinerySearch {
    int search(int arr[], int l, int h, int key) {

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == key) {
                return mid;

            }

           else if (arr[mid] < key) {
                l = mid + 1;

            } else {
                h = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 23, 43, 55, 67 };
        BinerySearch m1 = new BinerySearch();
        int key = m1.search(arr, 0, arr.length-1, 617);
        if(key==-1)
        {
            System.out.println("Elemnt NOt Found:");
        }
        else
        System.out.println();
    }

}
