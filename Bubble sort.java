public class Main{
    
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args){
        int arr[] = {7, 8, 3, 1, 2};
        
        
        // Bubble sort
        for(int i = 0; i < arr.length - 1; i++){    /// array.length-1  which is equaL to length-1 
             for(int j = 0; j < arr.length-i-1; j++){
                 // condition 
                 
                 if(arr[j] > arr[j+1]){
                     //swapping 
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
        }
        printArray(arr);
        
    }
    
}

//// Output
1
2
3
7
8
