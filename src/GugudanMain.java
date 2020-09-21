
public class GugudanMain {

	public static void main(String[] args) {
			for(int i = 2; i < 10; i++) {
				int[] result = GugudanMethod.calculate(i);
				GugudanMethod.print(result);
			}
	}

}
				// 여기는 구구단 프로그램을 '실행' 시켜주는 메인 메소드이다. 구구단 로직 실행 메소드는 GugudanMethod에 있음