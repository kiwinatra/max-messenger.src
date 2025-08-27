package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ek4  reason: default package */
public final /* synthetic */ class ek4 implements Callable {
    public final /* synthetic */ fk4 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ rx0 c;
    public final /* synthetic */ m53 o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ gy0 w;
    public final /* synthetic */ Executor x;
    public final /* synthetic */ w5g y;

    public /* synthetic */ ek4(fk4 fk4, Context context, rx0 rx0, m53 m53, boolean z, gy0 gy0, Executor executor, w5g w5g) {
        this.a = fk4;
        this.b = context;
        this.c = rx0;
        this.o = m53;
        this.v = z;
        this.w = gy0;
        this.x = executor;
        this.y = w5g;
    }

    public final Object call() {
        Pair pair;
        fk4 fk4 = this.a;
        fk4.getClass();
        int i = gk4.s;
        EGLDisplay H = ld8.H();
        m53 m53 = this.o;
        int[] iArr = m53.g(m53) ? ld8.o : ld8.c;
        int i2 = v0g.a;
        yr6 yr6 = fk4.c;
        if (i2 < 29) {
            EGLContext h = yr6.h(H, 2, iArr);
            pair = Pair.create(h, yr6.r(h, H));
        } else {
            try {
                EGLContext h2 = yr6.h(H, 3, iArr);
                pair = Pair.create(h2, yr6.r(h2, H));
            } catch (GlUtil$GlException unused) {
                EGLContext h3 = yr6.h(H, 2, iArr);
                pair = Pair.create(h3, yr6.r(h3, H));
            }
        }
        k53 a2 = m53.a();
        a2.c = 1;
        a2.d = null;
        m53 m532 = new m53(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
        boolean g = m53.g(m53);
        int i3 = fk4.a;
        m53 m533 = (!g && i3 != 2) ? m53 : m532;
        w5g w5g = this.y;
        Objects.requireNonNull(w5g);
        ak4 ak4 = new ak4(w5g, 0);
        boolean z = fk4.g;
        Context context = this.b;
        gy0 gy0 = this.w;
        Executor executor = this.x;
        th7 th7 = new th7(context, m533, yr6, gy0, executor, ak4, i3, fk4.b, z, fk4.h);
        rx0 rx0 = this.c;
        hs6 hs6 = fk4.e;
        int i4 = fk4.f;
        boolean z2 = this.v;
        Executor executor2 = executor;
        return new gk4(context, yr6, H, th7, gy0, w5g, executor2, new vo5(context, H, (EGLContext) pair.first, (EGLSurface) pair.second, rx0, m53, gy0, executor2, w5g, hs6, i4, i3, z2), z2, m53);
    }
}
