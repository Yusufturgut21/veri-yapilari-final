public class Nod {
    String isim;
    Nod sonraki=null;
    Nod onceki=null;
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public Nod getSonraki() {
        return sonraki;
    }
    public void setSonraki(Nod sonraki) {
        this.sonraki = sonraki;
    }
    public Nod getOnceki() {
        return onceki;
    }
    public void setOnceki(Nod onceki) {
        this.onceki = onceki;
    }
}