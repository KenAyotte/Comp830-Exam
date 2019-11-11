import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	
   private List<Worker> workers = new ArrayList<Worker>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Worker worker){
      worker.add(worker);		
   }

   public void notifyAllObservers(){
      for (Worker worker : worker) {
         worker.update();
      }
   } 	
}
