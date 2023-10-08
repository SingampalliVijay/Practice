package practice;

public class TrainerApp {
  public static void main(String[] args)
  {
	Trainer t1=new Trainer(1234,"arun","java");
//	t1.givendata(1234,"arun","java");
//	t1.id=1234;
//	t1.name="arun";
//	t1.skills="java";
	System.out.println("name= "+t1.name+"id="+t1.id+"skills="+t1.skills);
	t1.train();
	t1.solveproblem();

  Trainer t2 = new Trainer(4567,"yash","testing");
//  t2.id =4567;
//  t2.name ="yash";
//  t2.skills="testing";
  System.out.println("id="+t2.id+"name="+t2.name+"skills="+t2.skills);
  }
}
