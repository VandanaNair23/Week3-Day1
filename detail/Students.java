package bank.detail;

public class Students 
{
	public void getStudentInfo(int id)
	{
		id=12589;
		System.out.println("This is the Student Id: " +id);
	}

	public void getStudentInfo(int id, String name)
	{
		id=12589;
		name="Vandana";
		
		System.out.println("The student id is:"+id);
		System.out.println("The name of student is:"+name);
	}

	public void getStudentInfo(String email, double phoneNo)
	{
		email= "vandana@gmail.com";
		phoneNo=657895;
		System.out.println("the email id of the student is:"+email);
		System.out.println("Phone no of the student is:"+phoneNo);
	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(12589);
		obj.getStudentInfo(12589, "Vandana");
		obj.getStudentInfo("vandana@gmail.com", 657895);
	}
	
}
