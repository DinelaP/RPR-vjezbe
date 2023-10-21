package ba.unsa.etf.rpr.t1;

public class Sat {
    private int sati;
    private int minute;
    private int sek;
    public Sat(int sati, int minute, int sek){
        this.postavi(sati, minute, sek);
    }
    public void postavi(int sati, int minute, int sek){
        this.sati=sati;
        this.minute=minute;
        this.sek=sek;}
        public  void sljedeci(){
        this.sek++;
        if(this.sek==60){
            this.sek=0;
            this.minute++;
        }
        if(this.minute==60){
            this.minute=0;
            this.sati++;
        }
        if(this.sati==24){
            this.sati=0;
        }
        }
        public void prethodni(){
        this.sek--;
        if(this.sek==-1){
            this.sek=59;
            this.minute--;
        }
        if(this.minute==-1){
            this.minute=59;
            this.sati--;
        }
        if(this.sati==-1){
            this.sati=23;
        }
        }
        public void pomjeri(int sek){
        if(sek>0){
            for(int i=0; i<sek; i++) {
                this.sljedeci();
            }
        }
        else{
            for(int i=0; i<-sek; i++){
                this.prethodni();
            }
        }

        }
        public int dajSate() {
            return this.sati;
        }
        public int dajMinute() {
            return this.minute;
        }
        public int dajSekunde() {
            return this.sek;
        }
        public String toString(){
        return this.sati+":"+this.minute+":"+this.sek;
        }
        public static void main(String [] arg){
        Sat s=new Sat(15,30,45);
        System.out.println(s);
        s.sljedeci();
        System.out.println(s);
        s.pomjeri(-48);
        System.out.println(s);
        s.postavi(0,0,0);
        System.out.println(s);
        }
}
