package ALL.forms;
import lombok.Data;

@Data
public class VidForm {
   // private int id;
    private byte[] video;

    private int idus;
    private int idpr;
    private int idbr;

    public byte[] getVideo() {
        return video;
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
