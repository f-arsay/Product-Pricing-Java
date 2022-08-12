/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaClass;

/**
 *
 * @author Fatma
 */
public class MahsulObject {

   
    int id;
    String urun_adi;
    int urun_kodu;
    float protein;
    float hektolitre;
    float filizlenmis_tane;
    int kalite_kodu;
    float fiyat;

    @Override
    public String toString() {
        return String.valueOf(id)+" Ürün adı:"+urun_adi+" Ürün kodu:"+urun_kodu+" Protein:"+protein+" Hektolitre:"+hektolitre+
                                  " Filizlenmiş tane:"+filizlenmis_tane +" Kalite kodu:"+kalite_kodu+" Fiyat:"+fiyat; 
    }

    
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public int getUrun_kodu() {
        return urun_kodu;
    }

    public void setUrun_kodu(int urun_kodu) {
        this.urun_kodu = urun_kodu;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getHektolitre() {
        return hektolitre;
    }

    public void setHektolitre(float hektolitre) {
        this.hektolitre = hektolitre;
    }

    public float getFilizlenmis_tane() {
        return filizlenmis_tane;
    }

    public void setFilizlenmis_tane(float filizlenmis_tane) {
        this.filizlenmis_tane = filizlenmis_tane;
    }

    public int getKalite_kodu() {
        return kalite_kodu;
    }

    public void setKalite_kodu(int kalite_kodu) {
        this.kalite_kodu = kalite_kodu;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }
    
}
