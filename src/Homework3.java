import java.util.Arrays;

public class Homework3
{
        public static void main(String[] args)
    {

        System.out.println("Task 1.");

        int[] array = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        System.out.println(Arrays.toString(array));
        changeZeroesAndOnes(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Task 2.");
        int[] secondArray = new int[100];

        System.out.println(Arrays.toString(secondArray));
        fillArrayWithSequence(secondArray);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("Task 3.");
        int[] thirdArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(thirdArray));
        doubleNumbersLessThanSixIn(thirdArray);
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("Task 4.");

        int[][] square = new int[10][10];
        System.out.println("With zeroes");
        printSquare(square);

        fillDiagonalsWithOnes(square);
        System.out.println("With ones.");
        printSquare(square);

        System.out.println("Task 5.");

        int initialValue = 10;
        int size = 5;

        int[] fourthArray = getNewArrayWith(initialValue, size);
        System.out.println(Arrays.toString(fourthArray));


    }

    public static void printSquare(int[][] inputSquare)
    {
        for (int i = 0; i < inputSquare.length; i++)
        {
            System.out.println(Arrays.toString(inputSquare[i]));
        }
    }

    public static void changeZeroesAndOnes(int[] inputArray)
    {

                for (int i = 0; i < inputArray.length; i++)
        {

            inputArray[i] = 1 - inputArray[i];
        }
    }

        public static void fillArrayWithSequence(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (i + 1);
        }
    }


    static void doubleNumbersLessThanSixIn(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) // пройти по нему циклом
        {

            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

        public static void fillDiagonalsWithOnes(int[][] square)
    {

        for (int i = 0; i < square.length; i++)
        {

            square[i][i] = 1;

            square[i][square[i].length - 1 - i] = 1;
        }
    }

    public static int[] getNewArrayWith(int initialValue, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = initialValue;
        }
        return result;
    }

    public static void leftShift(int[] inputArray)
    {
        int buffer = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[0];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[j - 1] = inputArray[j];
        }

        inputArray[inputArray.length - 2] = buffer;
    }
}