package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1 7 19 37 61
 * 1 2 3  4  5
 *
 *  2-7=>2칸
 *  8-19=>3칸
 *  20-37=>4칸
 *  1 7 19 39 61
 *  계차수열을 이용하면 풀리는 문제
 */
public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 100000; i++) {
            if(n<=1+3*(i*i)-3*i){
                System.out.println(i);
                break;
            }
        }
    }
}
