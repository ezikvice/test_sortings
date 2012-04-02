/**
 * simple bubble sorting
 */
public class SimpleSorter extends Sorter {

    public SimpleSorter(int[] array){
        super(array);
    }

    protected void showArr(){
        System.out.println("шаг " + moving);
//        for (int r=0; r<arr.length;r++){
//            System.out.printf("%4s", arr[r]);
//        }
        for (int r:arr){
            System.out.printf("%4s", r);
        }

        System.out.println();
    }

    @Override
    public void sort(boolean showSort) {

        for (int i=0; i<arr.length;i++){
          for (int k=i;k<arr.length;k++){
              ++moving;
              if(arr[i]>arr[k]){
                  int t = arr[k];
                  arr[k]=arr[i];
                  arr[i]=t;
              }

               if(showSort) {
                   showArr();
               }
          }
        }

        // печатаем получившийся массив
        for( int i = 0; i<arr.length ; i++){
          System.out.printf(arr[i]+" ");
        }
    }
}
