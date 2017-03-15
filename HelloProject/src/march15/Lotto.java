package march15;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNumbers = new int[6];
        Random rnd = new Random();

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = rnd.nextInt(45) + 1;

            // �ߺ��� ���� ������ �ٽ� ������ ���ϱ� ���� Ȯ���ؼ� index �� �ٿ��ش�.
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