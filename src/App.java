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
    
    public static void main(String[] args) throws Exception {

        // ? Call Linear Search Method
        int[] linearData = new int[]{1, 2, 3, 4, 5};
        doLinearSearch(linearData,2);


    }


            

}
