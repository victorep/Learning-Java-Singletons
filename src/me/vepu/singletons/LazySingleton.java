package me.vepu.singletons;

/**
 * Created by V on 13/09/2017.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton()
    {
        System.out.println("Singleton(): Initializing Instance");
    }

    public static LazySingleton getInstance()
    {
        if (instance == null)
        {
            synchronized(LazySingleton.class)
            {
                if (instance == null)
                {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }

    private String iAmUnique;

    public String getiAmUnique() {
        return iAmUnique;
    }

    public void setiAmUnique(String iAmUnique) {
        this.iAmUnique = iAmUnique;
    }
}
