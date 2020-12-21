package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public  class ProjForm {

    //  private int PrId;

    private String PrName;
    private String PrPart;

    // private Data PrData;
   // private int ID_us;


    public String getPrName() {return PrName;}
    public String getPrPart() {return PrPart;}

}
