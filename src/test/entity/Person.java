package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    String name;
    int age;

    public boolean equals(Object obj) {
        //多态的弊端是无法使用子类特有的属性和行为，所以得向下转型
        Person p1 = (Person) obj;//将Object向下转型为Person
        //return this.name.equals(p1 .name) && this.age == p1 .age;
        return this.name.equals(p1 .name) ;

    }



}
