package designPattern.职责链模式;

public enum LoggerEnum {
//    public static int INFO = 1;
//    public static int DEBUG = 2;
//    public static int ERROR = 3;

    INFO(1),
    DEBUG(2),
    ERROR(3);

    private final int value;

    /**
     * 构造器默认也只能是private, 从而保证构造函数只能在内部使用
     */
    LoggerEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
