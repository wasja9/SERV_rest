package ALL.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "uses_all")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@OneToMany – указывает на связь один ко многим. Применяется с другой стороны от сущности с @ManyToOne
    //mappedBy – обратная сторона связи сущности. Поле под этим атрибутом не сохраняется как часть исходной сущности в базе данных, но будет доступна по запросу. (см. ниже @JoinColumn)
    //mappedBy указывает, что сущность на этой стороне является обратной связью, а владелец находится в" другой " сущности. Это также означает, что вы можете получить доступ к другой таблице из класса, который вы аннотировали с помощью " mappedBy "(полностью двунаправленный отношение.)
    @OneToMany(mappedBy = "user")
    List<Token> tokens;
    //@OneToMany(mappedBy = "user")
    //List<Projects> Projects;

    private String login;
    private String hashPassword;

    private String firstName;
    private String lastName;

//Интерфейс Enumeration – определяет методы, с помощью которых вы можете перечислить (получить по одному) элементы в коллекции объектов.
    @Enumerated(value = EnumType.STRING)
    private role role;
    @Enumerated(value = EnumType.STRING)
    private state state;

   // public static User from(UserForm form) {
   //     return User.builder()
   //             .firstName(form.getFirstName())
   //             .lastName(form.getLastName())
   //             .build();
   // }

    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getHashPassword() {
        return hashPassword;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {
        return lastName;
    }
    public ALL.models.role getRole() {
        return role;
    }
    public ALL.models.state getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setRole(ALL.models.role role) {
        this.role = role;
    }
    public void setState(ALL.models.state state) {
        this.state = state;
    }

    public User(String login, String hashPassword, String firstName, String lastName, ALL.models.role role, ALL.models.state state) {

        this.login = login;
        this.hashPassword = hashPassword;

        this.firstName = firstName;
        this.lastName = lastName;

        this.role = role;
        this.state = state;

    }
    public User(int id, String login) {
        this.id = id;
        this.login = login;
    }



}