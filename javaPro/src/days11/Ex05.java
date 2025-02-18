package days11;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) throws IOException {
        /*
         * 한 반에 10명인 학생의 성적 관리
         ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
         1. 이름, 국,영,수 입력
         2. 총,평, 등 계산 처리
         3. 모든 학생 정보를 출력..
         조건) 등수 처리하는 메서드를 만드세요.
         조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
         조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.
         */

        String name;
        int kor, eng, mat, tot, rank;
        double avg;

        final int STUDENT_COUNT = 10;
        
        String[] names = new String[STUDENT_COUNT];
        int[] kors = new int[STUDENT_COUNT];
        int[] engs = new int[STUDENT_COUNT];
        int[] mats = new int[STUDENT_COUNT];
        int[] tots = new int[STUDENT_COUNT];
        int[] ranks = new int[STUDENT_COUNT];
        double[] avgs = new double[STUDENT_COUNT];

        int cnt = 0; // 입력받은 학생 수
        char con = 'y';

        Scanner scanner = new Scanner(System.in);

        do {
            // 배열 크기 체크 및 자동 증가
            if (cnt >= names.length) {
                // 배열 크기 증가
                names = resizeArray(names);
                kors = resizeArray(kors);
                engs = resizeArray(engs);
                mats = resizeArray(mats);
                tots = resizeArray(tots);
                avgs = resizeArray(avgs);
                ranks = resizeArray(ranks);
            }

            // 한 학생의 정보를 입력
            System.out.printf("[%d번] 학생 이름,국어,영어,수학 입력 ? ", cnt + 1);
            name = getName(); // 랜덤 이름 생성
            kor = getScore(); // 국어 점수 생성
            eng = getScore(); // 영어 점수 생성
            mat = getScore(); // 수학 점수 생성

            tot = kor + eng + mat;
            avg = (double) tot / 3;
            rank = 1;

            // 각 배열에 요소로 추가 (각 배열의 index ==> cnt 처리)
            names[cnt] = name;
            kors[cnt] = kor;
            engs[cnt] = eng;
            mats[cnt] = mat;
            tots[cnt] = tot;
            avgs[cnt] = avg;
            ranks[cnt] = rank;

            // 입력받은 학생수 1증가
            cnt++;

            // 학생정보 출력
            System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
            for (int i = 0; i < cnt; i++) {
                System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
                        i + 1,
                        names[i],
                        kors[i], engs[i], mats[i], tots[i],
                        avgs[i], ranks[i]);
            }

            // 입력 계속 여부 체크
            System.out.print("> 학생 입력 계속 ? ");
            con = (char) System.in.read();
            System.in.skip(System.in.available()); // 13, 10
        } while (Character.toUpperCase(con) == 'Y');

        // 등수 처리
        calculateRanks(names, kors, engs, mats, tots, avgs, ranks, cnt);

        // 최종 출력
        System.out.println("\n==== 최종 성적표 ====");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
        for (int i = 0; i < cnt; i++) {
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
                    names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
        }

    } // main

    public static String getName() {
        // '가' ~ '힣' (3글자 이름 생성)
        char[] nameArr = new char[3];
        Random rnd = new Random();
        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
        }
        return new String(nameArr);
    }

    public static int getScore() {
        return (int) (Math.random() * 101); // 0 ~ 100
    }

    // 배열 크기 자동 증가
    public static String[] resizeArray(String[] arr) {
        String[] newArr = new String[arr.length + 3];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static int[] resizeArray(int[] arr) {
        int[] newArr = new int[arr.length + 3];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static double[] resizeArray(double[] arr) {
        double[] newArr = new double[arr.length + 3];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    // 등수 계산 메서드
    public static void calculateRanks(String[] names, int[] kors, int[] engs, int[] mats,
                                      int[] tots, double[] avgs, int[] ranks, int cnt) {
        for (int i = 0; i < cnt; i++) {
            ranks[i] = 1; // 기본 등수 1
            for (int j = 0; j < cnt; j++) {
                if (tots[i] < tots[j]) {
                    ranks[i]++; // i보다 더 높은 점수를 가진 학생이 있으면 등수 증가
                }
            }
        }
    }

} // class
