public class InsertionSort {
    static double [] list ={4,5,9,1,3,-15,1.5,-0.6};

    public static void insertionSort(double[] list){
        double x;
        int pos;
        for (int i = 1; i < list.length ; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]){
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
