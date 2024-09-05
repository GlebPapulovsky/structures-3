package ru.netology;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.time.LocalDateTime;
import java.util.Date;

class ConsoleLogger implements Logger {
    private StringBuilder history;


    public ConsoleLogger(){
        this.history=new StringBuilder();

    }

    private void writeHistory(String msg) {
        this.history.append(LocalDateTime.now() +" -- "+msg+"\n");
    }
    private void ConsoleOutput(){
        System.out.println(history.toString());
    }
    @Override
    public void log(String msg) {
        writeHistory(msg);
    }
    @Override
    public void out(){
        ConsoleOutput();
    }
}

