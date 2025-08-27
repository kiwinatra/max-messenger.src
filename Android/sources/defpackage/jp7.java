package defpackage;

/* renamed from: jp7  reason: default package */
public abstract class jp7 extends pp6 {
    public static final int[] z = t22.h;
    public final o67 o;
    public int[] v;
    public final int w;
    public atd x;
    public final boolean y;

    public jp7(o67 o67, int i) {
        this.a = i;
        this.c = new yp7(0, (yp7) null, hp7.STRICT_DUPLICATE_DETECTION.a(i) ? new eud((Object) this) : null);
        this.b = hp7.WRITE_NUMBERS_AS_STRINGS.a(i);
        this.v = z;
        this.x = sh4.a;
        this.o = o67;
        if (hp7.ESCAPE_NON_ASCII.a(i)) {
            this.w = 127;
        }
        this.y = !hp7.QUOTE_FIELD_NAMES.a(i);
    }
}
