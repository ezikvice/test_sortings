/**
 * simple bubble sorting
 */
public class QuickSorter extends Sorter {

    public QuickSorter(int[] array) {
        super(array);
    }

    protected void showArr(){
        System.out.println("шаг " + moving);
        for (int r=0; r<arr.length;r++){
            System.out.printf("%4s", arr[r]);
        }
        System.out.println();
    }

    private void qSort(int[] A, int low, int high, boolean showSort) {
        int i=low;
        int j=high;
        int x=A[(low+high)/2];
        do {
            while(A[i]<x){
                ++i;
                ++moving;
                if(showSort) {
                    showArr();
                }
            }
            while(A[j]>x) {
                --j;
                ++moving;
                if(showSort) {
                    showArr();
                }
            }
            if(i<=j){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++; j--;
            }
        } while(i<=j);

        if(low<j) qSort(A,low,j, showSort);
        if(i<high) qSort(A,i,high, showSort);
    }

    @Override
    public void sort(boolean showSort) {

        qSort(arr, 0, arr.length-1, showSort);

        for( int i = 0; i<arr.length ; i++){
          System.out.print(arr[i]+" ");
        }
    }

}
