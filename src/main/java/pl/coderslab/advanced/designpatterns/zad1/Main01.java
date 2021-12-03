package pl.coderslab.advanced.designpatterns.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
        public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            AppConfig instance = AppConfig.getInstance();
//            System.out.println(instance);
//        }

            List<Thread> threads = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                threads.add(new Thread(() -> {
                    AppConfig instance = AppConfig.getInstance();
                    System.out.println(instance);
                }));
            }

            for (Thread thread : threads) {
                thread.start();
            }
        }
    }
