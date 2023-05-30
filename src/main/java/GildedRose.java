import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.genetics.NPointCrossover;

import com.google.common.cache.Cache;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick(){
        switch (name) {
            case "normal":
                Normal normal = new Normal(name, quality, daysRemaining);
                normal.tick();
                quality=normal.getQuantity();
                daysRemaining=normal.getDaysRemaining();
                
                break;
            case "Aged Brie":
                Brie_tick brie_tick = new Brie_tick(name, quality, daysRemaining);
                brie_tick.tick();
                quality=brie_tick.getQuality();
                daysRemaining=brie_tick.getDaysRemaining();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                BackStage_tick backStage_tick = new BackStage_tick(name, quality, daysRemaining);
                backStage_tick.tick();
                quality=backStage_tick.getQuality();
                daysRemaining=backStage_tick.getDaysRemaining();
                break;        
            case "Sulfuras, Hand of Ragnaros":
                Sulfuars_tick sulfuars_tick = new Sulfuars_tick(name, quality, daysRemaining);
                sulfuars_tick.tick();
                break;    
            case "Conjured Item":
                Conjured_tick conjured_tick=new Conjured_tick(name, quality, daysRemaining);
                conjured_tick.tick();
                quality=conjured_tick.getQuality();
                daysRemaining=conjured_tick.getDaysRemaining();   
            default:
                break;
        }
    }

    // public void tick() {
    //     if(!StringUtils.equals(name, "Aged Brie") && !StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
    //         if(quality > 0) {
    //             if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
    //                 quality -= 1;
    //             }
    //         }
    //     } else {
    //         if(quality < 50) {
    //             quality += 1;
    //             if(StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
    //                 if(daysRemaining < 11) {
    //                     if(quality < 50) {
    //                         quality += 1;
    //                     }
    //                 }
    //                 if(daysRemaining < 6) {
    //                     if(quality < 50) {
    //                         quality += 1;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
    //         daysRemaining -= 1;
    //     }
    //     if(daysRemaining < 0) {
    //         if(!StringUtils.equals(name, "Aged Brie")) {
    //             if(!StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
    //                 if(quality > 0) {
    //                     if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
    //                         quality -=1;
    //                     }
    //                 }
    //             } else {
    //                 quality = quality - quality;
    //             }
    //         } else {
    //             if(quality < 50) {
    //                 quality += 1;
    //             }
    //         }
    //     }
    // }
}
