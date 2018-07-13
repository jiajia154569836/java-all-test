package annotate.product_sql;

import lombok.Data;

@Data
@Table("t_user")
public class User {
    //定义字段属性
    @Column("id")
    private int id;
    @Column("username")
    private String username;
    @Column("nickName")
    private String nickName;
    @Column("age")
    private String age;
    @Column("city")
    private String city;

}