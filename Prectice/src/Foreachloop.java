public class Foreachloop {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        for(int i : arr){
            System.out.println(i);
        }

        System.out.println();

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
