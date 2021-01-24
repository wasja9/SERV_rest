package ALL.forms;
import lombok.Data;

/**
 * Created by wasja on 24.01.2021.
 */
@Data
public class FilForm {
   // private int id;
    private byte[] file;

    private int id_us;
    private int id_pr;
    private int id_br;

    public byte[] getFile() {
        return file;
    }
    public int getId_us() {
        return id_us;
    }
    public int getId_pr() {
        return id_pr;
    }
    public int getId_br() {
        return id_br;
    }

}
