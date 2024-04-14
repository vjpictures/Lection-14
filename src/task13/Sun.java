package task13;

public class Sun implements CosmicBody{
    private static Sun instance;
    private Sun(){

    }
    public static Sun getInstance(){
        if(instance==null)instance=new Sun();
        return instance;
    }
}
