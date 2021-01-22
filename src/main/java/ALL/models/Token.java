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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getId() { return id; }
    public String getValue() { return value; }
    public User getUser() { return user; }


    public Token(int id, String value) {this.id = id;this.value = value;}

    public Token( String value, User user) {this.value = value; this.user = user;}

    //public String getValue() {
   //     return value;
   // }


}
