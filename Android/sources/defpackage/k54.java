package defpackage;

/* renamed from: k54  reason: default package */
public final class k54 extends b59 {
    public final void D(s4e s4e, float f, float f2) {
        s4e.d(c44.DEFAULT_ASPECT_RATIO, f2 * f, 180.0f, 90.0f);
        double d = (double) f2;
        double d2 = (double) f;
        s4e.c((float) (Math.sin(Math.toRadians((double) 90.0f)) * d * d2), (float) (Math.sin(Math.toRadians((double) c44.DEFAULT_ASPECT_RATIO)) * d * d2));
    }
}
