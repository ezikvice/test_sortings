/**
 * Created by IntelliJ IDEA.
 * User: dmitry
 * Date: 01.03.12
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public abstract class Sorter {
    private int[] arr;   // работаем с этим внутренним массивом
    public int current; // текущий элемент, который будем сравнивать
    public int comp_with; // элемент, с которым сравниваем

    int moving;    // количество сделанных шагов (сравнений + перестановок)

    /**
     *  в конструкторе копируем внешний массив во внутренний
     * @param array  внешний массив
     */
    public Sorter(int[] array){
        arr = new int[array.length];
        System.arraycopy(array, 0, arr, 0, array.length);
    }

    /**
     *  выводим массив (во время каждого шага сортировки)
     *
     *  TODO: сделать return arr, т.е. просто возвращать наш массив и текущие элементы
     */
    protected abstract void showArr();

    /**
     * сортируем массив
     * @param showSort - флаг, показывающий,надо ли выводить массив во время сортировки
     */
    abstract public void sort (boolean showSort);


}

