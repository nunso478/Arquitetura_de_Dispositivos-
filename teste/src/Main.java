
public class Main {

    public  static  void  main(String[] args){
        //write your code here
        int [] array = {1,2,3,4};
        incrementArrayIndex(array,1);
        System.out.println(array[1]);
    }

    private static void incrementArrayIndex(int[] value,int index) {
        value[index]++;

    }


}
