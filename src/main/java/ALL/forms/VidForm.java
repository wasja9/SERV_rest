package ALL.forms;
import lombok.Data;

@Data
public class VidForm {
   // private int id;
    private byte[] video;

    private int id_us;
    private int id_pr;
    private int id_br;

    public byte[] getVideo() {
        return video;
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
