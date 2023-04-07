//create a test class to create an object of type Job
public class testJob{
	public static void main(String [] args){
		System.out.println("Hello world");
		Job myjob = new Job ("mem001", 1);

		System.out.println("The memory address is :: " + myjob.getMemory());
	}
}