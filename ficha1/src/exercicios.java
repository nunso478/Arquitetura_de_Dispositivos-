public class exercicios {
    public static void main(final String[] arguments) {

        System.out.println("hello world!");
        float perimeter = calculatorRectongPerimeter(2,2 );
        System.out.println("Result perimeter: "+perimeter);
        float pavingstone = calculatorPavingstone(2,2,4);
        System.out.println("Result pavingstone: "+ pavingstone);
        System.out.println("Result Celsius: "+ calculatorFarenheit(32));
        System.out.println("Result total seconds: " + calculatorhourminutesecond(2,2,0));
        int[] array = {2,4,7,9};
        int max = getMax(array);
        int min = getMin(array);
        float avg = getAvarage(array);
        System.out.println("Result total max: " + max);
        System.out.println("Result total min: " + min);
        System.out.println("Result total avg: " + avg);
    }

   private static float getAvarage(int[] array) {
       float  avg = 0;
       for (int i = 0; i < array.length;i++) {
           avg += array[i];
       }
       return avg / array.length;

    };

    private static int getMin(int[] array) {
        int min = 0;
        for (int i = 0; i< array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    };

    private static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i< array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    };

    public static float calculatorRectongPerimeter(float width,float height){
        float perimeter = (width* 2) + (height * 2);
        return perimeter;
    };
    public static float calculatorPavingstone(float width,float height,float length){
        float pavingstone = length * width * height ;
        return pavingstone;
    }
    public static float calculatorFarenheit(float Farenheit){
        float Celsius =(Farenheit-32)*5/9;
        return Celsius;
    }
    public static float calculatorhourminutesecond(float hour,float minute,float second){
        float total = hour * 3600 + minute * 60 + second;
        return total;
    }


}
