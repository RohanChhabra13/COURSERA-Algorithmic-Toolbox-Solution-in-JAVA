import java.util.*;
public class maxpairwise{
    static void findmaxpair(int[] numbers){
        long max=0;
        long second_max=0;
        long maxp=0;

        Arrays.sort(numbers);
        max=numbers[numbers.length-1];
        second_max= numbers[numbers.length-2];
        maxp=max*second_max;
        System.out.println(maxp);
}
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int[] numbers = new int[n];
    for(int i=0;i<n;i++)
    {
        numbers[i]=sc.nextInt();
    }
    findmaxpair(numbers);
}
}