package practice;

public class StudentApp {
	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println("---> Before Initialising");
		System.out.println("Id= "+s1.Id+", Name ="+s1.Name+", Cgpa ="+s1.Cgpa);
		s1.Id=374;
		s1.Name="Vijay";
		s1.Cgpa=7.2;
		System.out.println("---> After Initialising");
		System.out.println("Id= "+s1.Id+", Name ="+s1.Name+", Cgpa ="+s1.Cgpa);
		System.out.println("--->Behaviours<---");
		s1.study();
		s1.markAttendence();
	}

}
