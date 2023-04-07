//we need to have a construct in java to represent a job, every job has memory allocation (an ID)
public class Job{
		//these are the instance variables of the object, these are used to give state to the object
		private String memory;
		private int jobID;
		//this is our contructor, we need this to be able to create an instance of our object
		public Job(String memory, int id){
			this.memory = memory;
			this.jobID = id;
		}
		//we would like to be able to update the meomry and id, so we need need a mutator(setter method)
		public void setMemory(String memory){
			this.memory = memory;
		}
		//we would like to change the ID of the job
		public void setID(int JobID){
		 	this.jobID = jobID;
		}
		//we would like to have accessor methods to gain access to the value of the instance variables
		public String getMemory(){
			return memory;
		}
		public int getID(){
			return jobID;
		}
		//this will be the end of the Job object
}
