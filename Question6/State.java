// Accomplished with much assistance from this Geeks for Geeks guide.
// https://www.geeksforgeeks.org/state-design-pattern/
import java.util.Scanner;
interface TrafficState
{
    public void status(StatusContext ctx);
}

class StatusContext
{
    private TrafficState currentState;
    public StatusContext()
    {
        currentState = new Unknown();
    }
    public void setState(TrafficState state)
    {
        currentState = state;
    }
    public void alert()
    {
        currentState.status(this);
    }
}

class Unknown implements TrafficState
{
    @Override
    public void status(StatusContext ctx)
    {
         System.out.println("Current status unknown.");
    }
}

class Busy implements TrafficState
{
    @Override
    public void status(StatusContext ctx)
    { 
        System.out.println("Your current status is busy.");
    }
}

class Available implements TrafficState
{
    @Override
    public void status(StatusContext ctx)
    {
        System.out.println("Your current status is available.");
    }
}

class StatePattern
{
    public static void main(String[] args)
    {
        StatusContext stateContext = new StatusContext();
        while (true) {
        stateContext.alert();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Transition to which state? busy, available, quit");
        String transition = scanner.nextLine();
        if (transition.equals("busy")) {
        	stateContext.setState(new Busy());
        }
        else if (transition.equals("available")) {
        	stateContext.setState(new Available());
        }
        else if (transition.equals("quit")) {
        	break;
        }
        
        }
    }

}