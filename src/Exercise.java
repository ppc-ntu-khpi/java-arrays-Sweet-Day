//package domain;

public class Exercise {
    public static int Calculate(int[] arr){
    int len= arr.length;
    for (int i = 0; i< len; i++)
        arr[arr[i]%len] += len;
 
    int max = arr[0], result = 0;
    for (int i = 1; i < len; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            result = i;
        }
    }
    return result;
}
}
