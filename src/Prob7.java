// 자연수 뒤집어 배열로 만들기
// n이 12345이면 [5,4,3,2,1]을 리턴합니다.

class Prob7 {
    public int[] solution(long n) {
//        sol 1
//        StringBuffer temp = new StringBuffer(n + "");
//        String reverse = temp.reverse().toString();
//        int[] answer = new int[reverse.length()];
//
//        for (int i = 0; i < reverse.length(); i++) {
//            answer[i] = Integer.parseInt(reverse.charAt(i) + "");
//        }
//
//        return answer;

//        sol 2
        String temp = n + "";
        int[] answer = new int[temp.length()];
        int idx = 0;
        while (n != 0) {
            answer[idx++] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}

// String 문자열 뒤집기 - StringBuffer로 변환 후 reverse().toArray()
// String -> int - Integer.parseInt()