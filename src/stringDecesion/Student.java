package stringDecesion;

public class Student {
	int sID;
	String sName;
	Student(int sID,String sName){
		this.sID=sID;
		this.sName=sName;
	}
	public String toString() {
		return "Student ID "+ sID + " Student Name "+sName;
	}

}
