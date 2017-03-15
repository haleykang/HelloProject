package march15;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNumbers = new int[6];
        Random rnd = new Random();

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = rnd.nextInt(45) + 1;

            // 중복된 값이 있으면 다시 랜덤값 구하기 위해 확인해서 index 값 줄여준다.
            for (int j = 0; j < i; j++) {
                if (lottoNumbers[i] == lottoNumbers[j]) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(lottoNumbers); // sort
        System.out.println(Arrays.toString(lottoNumbers)); // stringify & print
    }
}