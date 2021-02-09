package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public  class ProjForm {

    //  private int PrId;

    private String name;
    //private String part;
    // private Data PrData;
    private int id_us;

    public String getName() {
        return name;
    }
   // public String getPart() {
   //     return part;
   // }
    public int getId_us() {
        return id_us;
    }
}
