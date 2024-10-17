
public class com {
    
    public static int findProductIndex(int[] productIDs, int targetID) {
        int left = 0;
        int right = productIDs.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           
            if (productIDs[mid] == targetID) {
                return mid;
            }

            
            if (productIDs[left] <= productIDs[mid]) {
               
                if (targetID >= productIDs[left] && targetID < productIDs[mid]) {
                    right = mid + 1;
                } else {
                    left = mid - 1;
                }
            } else {
                
                if (targetID > productIDs[mid] && targetID <= productIDs[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] productIDs = {104, 105, 106, 107, 101, 102, 103};
        int targetID = 102;
        System.out.println("Product index: " + findProductIndex(productIDs, targetID));
    }
}
