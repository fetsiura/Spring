package pl.jaro.beans;

import pl.jaro.MessageService;

public class EmailService implements MessageService {
    @Override
    public void send() {
        System.out.println("sending email");
    }
}
