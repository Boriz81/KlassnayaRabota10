package consoleWriter;

public class ConsoleWriter implements Printer, Notifier{

    public void greeting() {
        Notifier.super.greeting();
    }
}
