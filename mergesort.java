import java.util.Scanner;


public class mergesort {
        
      
   
   public static void mergeSort(int []tempArray,int left,int right){
            if(left == right){
                return;
            }else{
                int mid = (left+right)/2;
                mergeSort(tempArray, left, mid);
                mergeSort(tempArray, mid+1, right);
                merge(tempArray,left,mid+1,right);
            }
        }

      public static void merge(int []tempArray,int lowerIndex,int higer,int upper){
            int temp=0;
            int lower = lowerIndex;
            int midIndex = higer-1;
            int totalItems = upper-lower+1;
            while(lowerIndex <= midIndex && higer <= upper){
                if(arr1[lower] < arr1[higer]){
                    tempArray[temp++] = arr1[lower++];
                }else{
                    tempArray[temp++] = arr1[higer++];
                }
            }

            while(lowerIndex <= midIndex){
                tempArray[temp++] = arr1[lowerIndex++];
            }

            while(higer <= upper){
                tempArray[temp++] = arr1[higer++];
            }

            for(int i=0;i<totalItems;i++){
                arr1[lower+i] = tempArray[i];
            }
        }
      	private static int []arr1;

        public static void main(String[] args) {
        	//input
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the size of the array");
        	int max = sc.nextInt();
        	sc.close();
        	int []array = new int[max];
        	double item = 0;
            for(int i=0;i<max;i++)
            {
              item = (Math.random());
                array[i] = (int)item;
            }
        
            for(int i : array){
                System.out.print(i+" ");
            }
            // sorting
            int []tempArray = new int[arr1.length];
            mergeSort(tempArray,0,arr1.length-1);
            for(int i : tempArray){
                System.out.print(i+" ");
            }
      
        }

    }