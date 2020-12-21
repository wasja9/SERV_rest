package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public  class ProjForm {

    //private int pr_id;

    private String pr_name;
    private String pr_part;

   // private int id_us;
    //private int pr_part;

    //Все get и set
    //public int getPr_id() {return pr_id;}
    //public void setPr_id(int pr_id) {this.pr_id = pr_id;}
    public String getPr_name() {return pr_name; }
   // public void setPr_name(String pr_name) { this.pr_name = pr_name; }
    public String getPr_Part() {return pr_part;}
   // public void setPr_status(String pr_status) {this.pr_status = pr_status; }
    //public int getId_us() { return id_us; }
    //public void setId_us(int id_us) { this.id_us = id_us;}
    //public int getPr_part() {return pr_part;}
    //public void setPr_part(int pr_part) { this.pr_part = pr_part;}



}
