import java.util.Arrays;

public class HW_M02_06 {
//      6. Write a Java program to answer about the statistical information such as arithmetic mean, median, mode, and standard
//      deviation of an integer data set. The data set should be defined as an integer array. For example: int[] data =
//      {206,430,73,30,293,322,42,36,447,229}

    public static void main(String[] args) {

        int[] arr = {206, 430, 73, 293, 30, 322, 42, 36, 447, 229};

        System.out.println("Statistical Information for " + Arrays.toString(arr) + " is:");
        System.out.println("========================");
        System.out.println("Arithmetic mean: " + getMean(arr));
        System.out.println("Median: " + getMedian(arr));
        System.out.println("Mode: " + getMode(arr));
        System.out.println("Standard deviation:" + getStandartDeiation(arr));

    }

    public static double getMean(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (sum / a.length);
    }

    public static double getMedian(int[] a) {
        Arrays.sort(a);
        int middle = a.length / 2;

        if (a.length % 2 == 1) {
            return a[middle];
        } else {
            return (a[middle - 1] + a[middle]) / 2.0;
        }
    }

    static double getMode(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();

        int t = max + 1;
        int[] count = new int[t];
        for (int i = 0; i < t; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        // mode is the index with maximum count
        int mode = 0;
        int k = count[0];
        for (int i = 1; i < t; i++) {
            if (count[i] > k) {
                k = count[i];
                mode = i;
            }
        }

        return mode;
    }

    public static double getStandartDeiation(int[] a) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = a.length;

        for (int num : a) {
            sum += num;
        }

        double mean = sum / length;

        for (int num : a) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }

}