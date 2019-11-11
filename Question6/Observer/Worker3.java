
public class Worker3 extends Worker {
	
   public Worker3(WorkManager manager){
	      this.manager = manager;
	      this.manager.attach(this);
	   }
   
	public void update() {
		
	}

}
