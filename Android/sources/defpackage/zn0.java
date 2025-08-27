package defpackage;

/* renamed from: zn0  reason: default package */
public abstract class zn0 {
    public static final int a;
    public static final int b = 384;
    public static volatile yn0 c;

    static {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        a = ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
