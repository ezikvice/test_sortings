/**
 * Created by IntelliJ IDEA.
 * User: dmitry
 * Date: 01.03.12
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public abstract class Sorter {
    int current; // текущий элемент, который будем сравнивать
    int comp_with; // элемент, с которым сравниваем

    abstract public void sort (int[] arr);
    public void showArray(int[] arr){

    }

}

