package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
            if (quality < 50) {
                quality += 1;
            }

            sellIn -= 1;

            if (sellIn < 0) {
                if (quality < 50) {
                    quality += 1;
                }
            }
    }
}
