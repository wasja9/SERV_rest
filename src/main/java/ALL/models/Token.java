package ALL.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 25.04.2018
 * Token
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Token {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String value;
    //@ManyToOne – указывает на связь многие к одному.
    //mappedBy – mappedBy указывает, что сущность на этой стороне является обратной связью, а владелец находится в" другой " сущности. Это также означает, что вы можете получить доступ к другой таблице из класса, который вы аннотировали с помощью " mappedBy "(полностью двунаправленный отношение.)
    // @JoinColumn аннотации, указывает, что этот объект является владелец отношения (то есть: соответствующая таблица имеет столбец с внешним ключом к таблице, на которую ссылаются)
    //@JoinTable – указывает на связь с таблицей
    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public int getId() { return id; }
    public String getValue() { return value; }
    public User getUser() { return user; }

    public Token(int id, String value) {this.id = id;this.value = value;}
    public Token( String value, User user) {this.value = value; this.user = user;}


}
