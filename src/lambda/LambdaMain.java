package lambda;

/**
 * Created by Administrator on 2018/1/12.
 */
public class LambdaMain {
	public int test(InLambda inLambda) {
		return inLambda.performed1(1, 2);
	}

	public static void main(String[] args) {
		LambdaMain lambdaMain=new LambdaMain();
		InLambda inLambda = (int x, int y) -> {
			return x + y;
		};
		System.out.println(lambdaMain.test(inLambda));
	}
}
