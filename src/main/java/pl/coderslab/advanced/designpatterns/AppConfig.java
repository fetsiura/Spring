package pl.coderslab.advanced.designpatterns;

import java.util.concurrent.TimeUnit;

public class AppConfig {

    private static AppConfig INSTANCE;

    private AppConfig(int n) {
        System.out.println("AppConfig.AppConfig Startuję");
        try {
            TimeUnit.SECONDS.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("AppConfig.AppConfig Kończę");
    }

    public static synchronized AppConfig getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AppConfig(6);
        }
        return INSTANCE;
    }
}
