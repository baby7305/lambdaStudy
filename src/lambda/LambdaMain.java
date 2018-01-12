package lambda;

/**
 * Created by Administrator on 2018/1/12.
 */
public class LambdaMain {
	public int test(InLambda inLambda) {
		return inLambda.performed1(1, 2);
	}

	public static void main(String[] args) {
		LambdaMain lambdaMain = new LambdaMain();
		System.out.println(lambdaMain.test((x, y) -> {
			return x + y;
		}));
	}
}
