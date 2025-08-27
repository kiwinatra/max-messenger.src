package com.my.tracker.ads;

public final class AdEventBuilder {
    final int a;
    final int b;
    final double c;
    final String d;
    String e;
    String f;
    String g;
    String h;

    private AdEventBuilder(int i, int i2, double d2, String str) {
        this.a = i;
        this.b = i2;
        this.c = d2;
        this.d = str;
    }

    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, (String) null);
    }

    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, (String) null);
    }

    public static AdEventBuilder newRevenueBuilder(int i, double d2, String str) {
        return new AdEventBuilder(19, i, d2, str);
    }

    public AdEvent build() {
        return new AdEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.e = str;
        return this;
    }
}
