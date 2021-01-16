package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public  class BrenchForm {
    //private int id;

    private String name;
    private String peck;//Пакет

    private int id_pr;
    private int id_us;
    private int id_ms;
    private int id_vd;
    private int id_fil;


    public String getName() {
        return name;
    }
    public String getPeck() {
        return peck;
    }

    public int getId_pr() {
        return id_pr;
    }
    public int getId_us() {
        return id_us;
    }
    public int getId_ms() {
        return id_ms;
    }
    public int getId_vd() {
        return id_vd;
    }
    public int getId_fil() {
        return id_fil;
    }
}
