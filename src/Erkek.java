import java.util.Date;

public class Erkek extends Personel{
    private String ad;
    private String soyad;
    private int dogumtarihi;
    public Erkek(String ad,String soyad, int dogumtarihi)
    {
        this.ad=getAd();
        this.soyad=getSoyad();
        this.dogumtarihi=getDogumtarihi();
    }
    @Override
    void emeklilikHesapla() {
        Date d=new Date();
        int year=d.getYear();
        if(year-dogumtarihi >= 65)
            System.out.println(ad + " " + soyad + " isimli personel emekli olmuştur.");
        else
            System.out.println(ad + " " + soyad + " isimli personel henüz emekli olmamıştır.");
    }
}
