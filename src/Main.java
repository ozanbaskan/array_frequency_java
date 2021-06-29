import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {32,3,1,2,5,3,3,1,2,4,5,4,90};
        int length = arr.length;
        int[] frequency = new int[length];
        int[] uniques = new int[length];

        for (int i = 0; i < length; i++)
        {
            if (isHas(uniques, arr[i]))
            {
                frequency[getIndexOf(arr, arr[i])]++;
            }
            else
            {
                uniques[getIndexOf(arr, arr[i])] = arr[i];
                frequency[getIndexOf(arr, arr[i])]++;
            }
        }

        System.out.print("Dizi: " + Arrays.toString(arr) + "\n");
        System.out.println("Tekrar Sayıları");
        printFrequencies(frequency,uniques);


    }

    static boolean isHas(int[] a, int n)
    {
        for (int i = 0; i <a.length;i++)
        {
            if (a[i] == n) return true;
        }
        return false;
    }

    static int getIndexOf(int[] a, int n)
    {
        for (int i = 0; i <a.length;i++)
        {
            if (a[i] == n) return i;
        }
        return -1;
    }

    static void printFrequencies(int[] freq, int[] numbers)
    {
        for (int i = 0; i < freq.length;i++)
        {
            if (freq[i] != 0)
            {
                System.out.println(numbers[i] + " sayısı " + freq[i] + " kere tekrar edildi.");
            }
        }
    }
}


