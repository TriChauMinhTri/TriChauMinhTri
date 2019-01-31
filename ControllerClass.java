public class ControllerClass implements ControllerInterface{
    public boolean isRunning() {
        return running;
    }

    boolean running = true;
    public void setCurrentBest(Evolvable e){
        System.out.println(e.getCost());
    }
}
