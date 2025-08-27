package defpackage;

/* renamed from: z44  reason: default package */
public final class z44 extends ww1 {
    public final y35 o;
    public final float v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z44(y35 y35, float f) {
        super(3, y35, Float.valueOf(f));
        vzg.n(y35, "bitmapDescriptor must not be null");
        if (f > c44.DEFAULT_ASPECT_RATIO) {
            this.o = y35;
            this.v = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    public final String toString() {
        StringBuilder p = tr1.p("[CustomCap: bitmapDescriptor=", String.valueOf(this.o), " refWidth=");
        p.append(this.v);
        p.append("]");
        return p.toString();
    }
}
