public class Insertion {
    public static void Sort(int arr[]){
        for (int i = 1; i < arr.length; i++){   // start from 1
            int curr = arr[i];
            int prev = i - 1;

            // योग्य जागा शोधण्यासाठी घटक हलवतोय
            while (prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // घटक योग्य जागी ठेवतो
            arr[prev + 1] = curr;
        }
    }

    public static void Printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {4, 3, 2, 1};
        
        Sort(arr);
        Printarr(arr);
    }
}
