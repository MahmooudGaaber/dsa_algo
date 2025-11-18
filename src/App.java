public class App {


    // * code of Linear Search
    static void doLinearSearch(int[] dataArray, int target){
        // * Loop to go throw all items on List
       for (int i = 0 ; i < dataArray.length ; i ++ ){
           // * checked the data if found and print it and stop app then
            if (dataArray[i] == target) {
                System.out.println("Found It" + i);
                return;
            }
            // * checked the data if Not found
            else {
                System.out.println("Not Found It");
                return;
            }
        }
    }

    // * code of Binary Search
    static void doBinarySearch(int[] dataArray, int target){
        int start = 0;
        int end = dataArray.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (target == dataArray[mid]){
                System.out.println("Data Find In Index : " + mid);
                return;
            }
            else if (target > dataArray[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println("Data Not Exist");
    }
    
    public static void main(String[] args) throws Exception {

        // ? initialize array for testing
        int[] linearData = new int[]{1, 2, 3, 4, 5};


        // ? Call Linear Search Method
         doLinearSearch(linearData,2);

         // ? call Binary search Method
        doBinarySearch(linearData,9);

    }


            

}
