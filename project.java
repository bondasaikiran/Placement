package kiran;
class ParentProject{
	   ParentProject () {                                                     //PARENT CLASS CONSTRUCTOR
		System.out.println(" THIS IS A PARENT CLASSS CONSTRUCTOR");	
	}
}
class ChildProject extends ParentProject{
	
	 ChildProject(){	   //CHILD CLASS CONSTRUCTOR
	 }
}




public class project {

	public static void main(String[] args) {
		ChildProject cp=new ChildProject();	     // CREATING AN OBJECT FOR CHILD CLASS

	}

}
