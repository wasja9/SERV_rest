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
    private Long id;
    private String value;


    public String getValue() {
        return value;
    }


    public Token(long id, String value) {

        this.id = id;
        this.value = value;

    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    //public String getValue() {
   //     return value;
   // }


}
