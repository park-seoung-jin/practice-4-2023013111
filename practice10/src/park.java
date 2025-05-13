import java.util.Scanner;

public class park { 
    public static void main(String[] args) { 
        int sum = 0; 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        for (int i = 1; i <= N; i++) { 
            if (i % 2 == 1) { 
                sum += i; 
                System.out.println("1부터 1000까지 홀수의 합: " + sum);
            }   
}
    } 
}