public class Conjured_tick extends GildedRose {
    public Conjured_tick(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }
    public void tick(){
        daysRemaining-=1;
        if(quality>0){
            quality-=2;
        }
        if(daysRemaining<=0 && quality>0){
            quality-=2;
        }
    }
    public int getQuality(){
        return quality;
    }
    public int getDaysRemaining(){
        return daysRemaining;
    }
}