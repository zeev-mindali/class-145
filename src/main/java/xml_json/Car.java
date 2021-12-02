package xml_json;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Car {
    private int id;
    private int mispar_rechev;
    private int tozeret_cd;
    private String sug_degem;
    private String tozeret_nm;
    private int degem_cd;
    private double degem_nm;
    private String ramat_gimur;
    private int ramat_eivzur_betihuty;
    private int kvutzat_zihum;
    private int shnat_yitzur;
    private String degem_manoa;
    private Date mivchan_acharon_dt;
    private Date tokef_dt;
    private String baalut;
    private String misgeret;
    private int tzeva_cd;
    private String tzeva_rechev;
    private String zmig_kidmi;
    private String zmig_ahori;
    private String sug_delek_nm;
    private int horaat_rishum;
    private String moed_aliya_lakvish;
    private String kinuy_mishari;
    private double rank;

}
