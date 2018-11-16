package designPattern.职责链模式;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(LoggerEnum.ERROR.getValue());
        AbstractLogger fileLogger = new FileLogger(LoggerEnum.DEBUG.getValue());
        AbstractLogger consoleLogger = new ConsoleLogger(LoggerEnum.INFO.getValue());

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(LoggerEnum.INFO.getValue(), "This is an information.");

        loggerChain.logMessage(LoggerEnum.DEBUG.getValue(), "This is an debug level information.");

        loggerChain.logMessage(LoggerEnum.ERROR.getValue(), "This is an error information.");
    }
}
