public class Brie_tick extends GildedRose {
    public Brie_tick(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }
    
    public void tick() {
        daysRemaining -= 1;
        
        if(quality<50){
            quality=quality+1;
        }
        // if(daysRemaining<0){
        //     quality=quality+1;
        // }
    }
    
    public int getQuality() {
        return quality;
    }
    
    public int getDaysRemaining() {
        return daysRemaining;
    }
}
