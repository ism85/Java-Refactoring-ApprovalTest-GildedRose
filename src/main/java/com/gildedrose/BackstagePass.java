package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
            if (quality < 50) {
                quality += 1;

                if (sellIn < 11) {
                    if (quality < 50) {
                        quality += 1;
                    }
                }

                if (sellIn < 6) {
                    if (quality < 50) {
                        quality += 1;
                    }
                }
            }

            sellIn -= 1;

            if (sellIn < 0) {
                quality = 0;
            }
    }
}
