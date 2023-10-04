import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(String e: array) System.out.print(e+" ");
        System.out.println();
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)>list.get(j)){
                    Integer t = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,t);
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i=0; i<array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1;j<array.length; j++) {
                if (array[j]<array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for (int i=0; i<array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<array.length; j++) {
                if (array[minIndex].compareToIgnoreCase(array[j]) > 0) {
                    minIndex=j ;
                }
            }
            String temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for (int i=0; i<list.size()-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<list.size(); j++) {
                if (list.get(minIndex).compareToIgnoreCase(list.get(j)) > 0) {
                    minIndex=j;
                }
            }
            String temp=list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i,temp);
        }
        return list;

    }

}
