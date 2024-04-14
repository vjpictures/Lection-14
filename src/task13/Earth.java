package task13;

public class Earth implements CosmicBody {
    private static Earth instance;
    private Earth(){

    }
    public static Earth getInstance(){
        if(instance==null)instance=new Earth();
        return instance;
    }
}
