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
			System.out.println(x + y);
			return x + y;
		};
		inLambda.performed1(2, 4);
	}
}
