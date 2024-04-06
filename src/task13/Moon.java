package task13;

public class Moon implements CosmicBody{
    private static Moon instance;
    private Moon(){

    }
    public static Moon getInstance(){
        if(instance==null)instance=new Moon();
        return instance;
    }
}
