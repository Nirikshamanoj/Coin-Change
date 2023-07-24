import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int findMinCoin(int[] A, int amount,int n) {
        int sum=0;
        Arrays.sort(A);
        int count=0;
        int number=n-1;
        while (sum!=amount && number>=0) {
            if (sum + A[number] <= amount) {
                sum += A[number];
                count++;
            } else
                number--;
        }
        if(sum==amount)
        {
            return count;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int amount = scanner.nextInt();
        int sum = findMinCoin(A,amount,n);
        System.out.println(sum);
    }
}
