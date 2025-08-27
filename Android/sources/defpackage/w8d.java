package defpackage;

/* renamed from: w8d  reason: default package */
public final class w8d extends b59 {
    public final void D(s4e s4e, float f, float f2) {
        s4e.d(c44.DEFAULT_ASPECT_RATIO, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        o4e o4e = new o4e(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, f3, f3);
        o4e.f = 180.0f;
        o4e.g = 90.0f;
        s4e.g.add(o4e);
        m4e m4e = new m4e(o4e);
        s4e.a(180.0f);
        s4e.h.add(m4e);
        s4e.e = 270.0f;
        float f4 = (c44.DEFAULT_ASPECT_RATIO + f3) * 0.5f;
        float f5 = (f3 - c44.DEFAULT_ASPECT_RATIO) / 2.0f;
        double d = (double) 270.0f;
        s4e.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        s4e.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
