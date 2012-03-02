/**
 * simple bubble sorting
 */
public class SimpleSorter extends Sorter {

    @Override
    public void sort(int[] arr) {
          for (int i=0; i<arr.length;i++){
              for (int k=i;k<arr.length;k++){
                  if(arr[i]>arr[k]){
                      int t = arr[k];
                      arr[k]=arr[i];
                      arr[i]=t;
                  }
              }
          }
          for( int i = 0; i<arr.length ; i++){
              System.out.printf(arr[i]+" ");
          }
    }
}
