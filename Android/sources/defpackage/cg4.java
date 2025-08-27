package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Map;

/* renamed from: cg4  reason: default package */
public final class cg4 implements e97 {
    public final e97 a;
    public final e97 b;
    public final znb c;
    public final jf d = new jf(1, this);
    public final Map e;

    public cg4(jf jfVar, hf hfVar, znb znb, Map map) {
        this.a = jfVar;
        this.b = hfVar;
        this.c = znb;
        this.e = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = (defpackage.e97) r1.get(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.v33 a(defpackage.j55 r3, int r4, defpackage.tac r5, defpackage.c97 r6) {
        /*
            r2 = this;
            r6.getClass()
            r3.m0()
            h97 r0 = r3.c
            if (r0 == 0) goto L_0x000e
            h97 r1 = defpackage.h97.c
            if (r0 != r1) goto L_0x0023
        L_0x000e:
            java.io.InputStream r1 = r3.n()
            if (r1 == 0) goto L_0x0023
            kotlin.Lazy r0 = defpackage.i97.d
            h97 r0 = defpackage.ld8.K(r1)     // Catch:{ IOException -> 0x001d }
            r3.c = r0
            goto L_0x0023
        L_0x001d:
            r2 = move-exception
            defpackage.n54.I(r2)
            r2 = 0
            throw r2
        L_0x0023:
            java.util.Map r1 = r2.e
            if (r1 == 0) goto L_0x0034
            java.lang.Object r0 = r1.get(r0)
            e97 r0 = (defpackage.e97) r0
            if (r0 == 0) goto L_0x0034
            v33 r2 = r0.a(r3, r4, r5, r6)
            return r2
        L_0x0034:
            jf r2 = r2.d
            v33 r2 = r2.a(r3, r4, r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg4.a(j55, int, tac, c97):v33");
    }

    public final CloseableStaticBitmap b(j55 j55, c97 c97) {
        y33 a2 = this.c.a(j55, c97.a);
        try {
            a2.getClass();
            bc7 bc7 = bc7.d;
            j55.m0();
            int i = j55.o;
            j55.m0();
            CloseableStaticBitmap of = CloseableStaticBitmap.of(a2, (tac) bc7, i, j55.v);
            of.putExtra(HasExtraData.KEY_IS_ROUNDED, Boolean.FALSE);
            return of;
        } finally {
            y33.U(a2);
        }
    }
}
