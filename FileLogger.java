package Homework7;

import java.util.logging.*;

public class FileLogger{

    private Logger logger = Logger.getLogger("Calculator Logger");

    public void setFileHandler(String fileNameLog){
        this.logger.setUseParentHandlers(false);
        try{
            FileHandler fh = new FileHandler(fileNameLog, true);
            this.logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
        } catch(Exception e) {
            System.out.println("Ошибка работы с файлом.");
            System.out.println(e.getMessage());
        }
    }

    public void log(String message) {
        logger.info(message);
    }
}
