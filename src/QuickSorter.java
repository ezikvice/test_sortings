/**
 * simple bubble sorting
 */
public class QuickSorter extends Sorter {

    private void qSort(int[] A, int low, int high) {
        int i=low;
        int j=high;
        int x=A[(low+high)/2];
        do {
            while(A[i]<x) ++i;
            while(A[j]>x) --j;
            if(i<=j){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++; j--;
            }
        } while(i<=j);

        if(low<j) qSort(A,low,j);
        if(i<high) qSort(A,i,high);
    }

    @Override
    public void sort(int[] arr) {

        qSort(arr, 0, arr.length-1);

        for( int i = 0; i<arr.length ; i++){
          System.out.print(arr[i]+" ");
        }
    }

}
