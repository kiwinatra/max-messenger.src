package defpackage;

/* renamed from: co2  reason: default package */
public final class co2 implements eo2 {
    public final int a;
    public final Integer b;
    public final Integer c;

    public co2(int i, Integer num, Integer num2, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        num2 = (i2 & 4) != 0 ? null : num2;
        this.a = i;
        this.b = num;
        this.c = num2;
    }
}
