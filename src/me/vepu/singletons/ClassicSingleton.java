package me.vepu.singletons;

/**
 * Created by V on 13/09/2017.
 */
public class ClassicSingleton {

    private static  ClassicSingleton instance = null;

    protected ClassicSingleton(){

        //This is here only to defeat instantiation.
    }

    public static synchronized ClassicSingleton getInstance(){
        if (instance==null){
            instance = new ClassicSingleton();

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
