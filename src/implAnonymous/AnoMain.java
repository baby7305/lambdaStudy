package implAnonymous;

/**
 * Created by Administrator on 2018/1/12.
 */
public class AnoMain {
	public AnoMain() {
	}

	public static void main(String[] args) {
		InAno inAno = new InAno() {
			@Override
			public void performed() {
				System.out.println("hello FilesImpl");
			}

			@Override
			public int performed1(int x, int y) {
				System.out.println(x + y);
				return x + y;
			}
		};

		inAno.performed();
		inAno.performed1(1,2);
	}
}
