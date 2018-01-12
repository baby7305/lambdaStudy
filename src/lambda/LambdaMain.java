package lambda;

/**
 * Created by Administrator on 2018/1/12.
 */
public class LambdaMain {
	public void test(InLambda inLambda){
		inLambda.performed();

	}
	public static void main(String[] args) {
		LambdaMain lambdaMain=new LambdaMain();
		InLambda inLambda = () -> {
			System.out.println("Hello lambda");
		};
		lambdaMain.test(inLambda);
	}
}
