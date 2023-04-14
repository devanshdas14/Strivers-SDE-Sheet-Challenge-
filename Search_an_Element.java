public class Search_an_Element {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        Solution obj = new Solution();
        System.out.print(obj.Search(a, 6));

    }
}

class Solution {

    int Search(int[] arr, int Key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Key) {
                return i;
            }
        }
        return -1;

    }

}