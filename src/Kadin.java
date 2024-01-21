import java.util.Date;

public class Kadin extends Personel{
    private String ad;
    private String soyad;
    private int dogumtarihi;
    public Kadin()
    {
        this.ad=getAd();
        this.soyad=getSoyad();
        this.dogumtarihi=getDogumtarihi();
    }
    @Override
    void emeklilikHesapla() {
        Date d=new Date();
        int year=d.getYear();
        if(year-dogumtarihi >= 60)
            System.out.println(ad + " " + soyad + " isimli personel emekli olmuştur.");
        else
            System.out.println(ad + " " + soyad + " isimli personel henüz emekli olmamıştır.");
    }
}
