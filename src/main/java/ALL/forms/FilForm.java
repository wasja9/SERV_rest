package ALL.forms;
import lombok.Data;

/**
 * Created by wasja on 24.01.2021.
 */
@Data
public class FilForm {
   // private int id;
    private byte[] file;

    private int idus;
    private int idpr;
    private int idbr;

    public byte[] getFile() {
        return file;
    }
    public int getIdus() {
        return idus;
    }
    public int getIdpr() {
        return idpr;
    }
    public int getIdbr() {
        return idbr;
    }

}
