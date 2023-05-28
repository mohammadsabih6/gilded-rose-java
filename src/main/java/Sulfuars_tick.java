public class Sulfuars_tick extends GildedRose {

    public Sulfuars_tick(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }
    public void tick(){
    }

    public int getQuantity(){
        return quality;
    }
    public int getDaysRemaining(){
        return daysRemaining;
    }
}
