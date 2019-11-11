
public class Worker4 extends Worker {
	
   public Worker4(WorkManager manager){
	      this.manager = manager;
	      this.manager.attach(this);
	   }
   
	public void update() {
		
	}

}
