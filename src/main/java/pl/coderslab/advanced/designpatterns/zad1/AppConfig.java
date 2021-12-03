package pl.coderslab.advanced.designpatterns.zad1;

import java.util.concurrent.TimeUnit;

public class AppConfig {

    private static AppConfig INSTANCE;

    private AppConfig(int n){
        System.out.println("AppConfig.AppConfig starting");

        try{
            TimeUnit.SECONDS.sleep(n);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("AppConfig.AppConfig finished");

    }

    public static synchronized AppConfig getInstance(){
        if(INSTANCE == null){
            INSTANCE = new AppConfig(6);
        }

        return INSTANCE;
    }

}
