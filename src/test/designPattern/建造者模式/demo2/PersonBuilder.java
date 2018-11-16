package designPattern.建造者模式.demo2;

public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();//组装
}

