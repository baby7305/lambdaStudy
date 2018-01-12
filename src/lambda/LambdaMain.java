package lambda;

/**
 * Created by Administrator on 2018/1/12.
 */
public class LambdaMain {
	public static void main(String[] args) {
//		InLambda inLambda = () -> {
//			System.out.println("Hello lambda");
//		};
//		inLambda.performed();
		InLambda inLambda = (int x, int y) -> {
			return x + y;
		};

		System.out.println(inLambda.performed1(2, 4));
	}
}
