package implFiles;

/**
 * Created by Administrator on 2018/1/12.
 */
public class FileMain {

	public FileMain() {
	}

	public void test(InFiles inFiles) {
		inFiles.performed();
		inFiles.performed1(1, 2);
	}

	public static void main(String[] args) {
		FileMain fileMain = new FileMain();
		FilesImpl files = new FilesImpl();
		fileMain.test(files);
	}
}
