public class Normal extends GildedRose {

    public Normal(String name, int quality, int daysRemaining){
        super(name, quality,daysRemaining);
    }   

    public void tick(){
        daysRemaining -=1;
        if(quality>0){
            quality-=1;
        }
        if(daysRemaining<=0){
            quality-=1;
        }
    }

    public int getQuantity(){
        return quality;
    }
    public int getDaysRemaining(){
        return daysRemaining;
    }
    
}
