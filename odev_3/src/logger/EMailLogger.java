package logger;

public class EMailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("EMail gonderildi : "+data);
    }
}
