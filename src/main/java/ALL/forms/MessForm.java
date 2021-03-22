package ALL.forms;
import lombok.Data;

@Data
public class MessForm {
    private int id;

    private String messege;

    private int idus;
    private int idpr;
    private int idbr;

    public int getId() {return id; }
    public String getMessege() {return messege; }
    public int getIdus() {return idus;  }
    public int getIdpr() { return idpr; }
    public int getIdbr() { return idbr; }

}
