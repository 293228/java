package Student;

public class Student {
	private int id;
	private String name;
	private String sex;
	private String dateOfBirth;
	public Student(){
		id=0;
		name="δ֪";
		sex="δ֪";
		dateOfBirth="00000000";
		}
	
	public Student(int ID,String Name,String Sex,String DateOfBirth) {
		id=ID;
		name=Name;
		sex=Sex;
		dateOfBirth=DateOfBirth;
	}
	
	public String toString() {
		return "ѧ��:"+id+"   ����:"+name+"   �Ա�:"+sex+"   ��������:"+dateOfBirth;
	}
	
	public static void main(String[] args) {
		Student stu=new Student(12345,"�","��","20011001");
		Student stu1=new Graduate("��ѧ","����");
		System.out.println(stu);
		System.out.println(stu1);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
