package com.my.tracker.personalize;

public final class PersonalizeItem {
    public final double discountPrice;
    public final int discountValue;
    public final String payload;
    public final double price;
    public final String sku;
    public final int value;

    public PersonalizeItem(String str, String str2, double d, double d2, int i, int i2) {
        this.sku = str;
        this.payload = str2;
        this.price = d;
        this.discountPrice = d2;
        this.value = i;
        this.discountValue = i2;
    }
}
