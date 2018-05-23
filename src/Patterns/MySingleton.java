package Patterns;

public class MySingleton {
    private String x = " ";
    private  Singleton ex;

    private Singleton createOB(){
        if (this == null ){
            ex =new Singletone();
        }
        return ex;
    }
}
