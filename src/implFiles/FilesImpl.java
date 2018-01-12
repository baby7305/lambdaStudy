package implFiles;

/**
 * Created by Administrator on 2018/1/12.
 */
public class FilesImpl implements InFiles {
	@Override
	public void performed() {
		System.out.println("hello FilesImpl");
	}

	@Override
	public int performed1(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}
}
