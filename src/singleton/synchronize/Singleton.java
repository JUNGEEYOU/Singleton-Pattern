package singleton.synchronize;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){   //synchronized: 한 스레드 메소드가 끝나기 전까지 다른 스레드는 기다림
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
