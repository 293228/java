package Student;

public class Graduate extends Student{
	private String subject;
	private String adviser;
	public Graduate() {
		super();
		subject="δ֪";
		adviser="δ֪";
	}
	
	public Graduate(String Subject,String Adviser) {
		super();
		subject=Subject;
		adviser=Adviser;
	}
	
	public Graduate(int ID,String Name,String Sex,String DateOfBirth,String Subject,String Adviser) {
		super(ID,Name,Sex,DateOfBirth);
		Subject=subject;
		Adviser=adviser;
	}
	
	public String toString() {
		return "רҵ��"+subject+"   ��ʦ��"+adviser;
	}

}
