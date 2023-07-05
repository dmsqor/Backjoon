import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max_x = -10000, min_x = 10000;// 좌표는 -10,000 이상 10,000 이하의 정수이므로 임시 입력값이 최고값 or 최소값인 경우 방지
		int max_y = -10000, min_y = 10000;
		int result;
		
		for(int i = 0; i<n; i++) {// 옥구술을 감싸는 직사각형의 밑면, 높이 찾기
			int x = input.nextInt();
			int y = input.nextInt();
			if(x > max_x) {
				max_x = x;
			}
			if(x < min_x) {
				min_x = x;
			}
			if(y > max_y) {
				max_y = y;
			}
			if(y < min_y) {
				min_y = y;
			}
		}
		
		if(n == 1) {
			result = 0;// n==1일때 직사각형을 만들 수 없으므로
		}else {
			result = (max_x-min_x)*(max_y-min_y);
		}
		System.out.println(result);
		input.close();
	}
}
