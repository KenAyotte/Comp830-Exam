
public class Worker2 extends Worker {
	
   public Worker2(WorkManager manager){
	      this.manager = manager;
	      this.manager.attach(this);
	   }
	   
	public void update() {
		
	}

}
