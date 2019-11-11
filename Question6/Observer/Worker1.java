
public class Worker1 extends Worker {

   public Worker1(WorkManager manager){
	      this.manager = manager;
	      this.manager.attach(this);
	   }

	public void update() {
		
	}

}
