package ALL.forms;
import lombok.Data;

@Data
public class VidForm {
    private int id;

    private String path;
    private byte[] video;

    private int idus;
    private int idpr;
    private int idbr;

    public int getId() {return id; }
    public String getPath() { return path;  }
    public byte[] getVideo() {return video;    }
    public int getIdus() {return idus;  }
    public int getIdpr() { return idpr; }
    public int getIdbr() { return idbr; }

}
