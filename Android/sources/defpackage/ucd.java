package defpackage;

import android.graphics.Bitmap;
import android.os.Environment;
import kotlin.Result;

/* renamed from: ucd  reason: default package */
public final class ucd extends ri0 {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ kw1 b;
    public final /* synthetic */ vcd c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public ucd(i0 i0Var, lw1 lw1, vcd vcd, boolean z, boolean z2) {
        this.a = i0Var;
        this.b = lw1;
        this.c = vcd;
        this.d = z;
        this.e = z2;
    }

    public final void d() {
        kw1 kw1 = this.b;
        if (kw1.isActive()) {
            kw1.q(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    public final void e(i0 i0Var) {
        this.b.resumeWith(Result.m23constructorimpl((Object) null));
    }

    public final void g(Bitmap bitmap) {
        String str;
        boolean h = this.a.h();
        kw1 kw1 = this.b;
        if (!h) {
            kw1.resumeWith(Result.m23constructorimpl((Object) null));
        } else if (bitmap == null) {
            kw1.resumeWith(Result.m23constructorimpl((Object) null));
        } else {
            vcd vcd = this.c;
            boolean z = this.d;
            if (z) {
                StringBuilder o = tr1.o(vcd.c.a.getCacheDir().getPath());
                o.append(jab.b);
                str = o.toString();
            } else {
                vcd.getClass();
                str = Environment.DIRECTORY_PICTURES;
            }
            kw1.resumeWith(Result.m23constructorimpl(vcd.c(new to0(str, bitmap), this.e, z)));
        }
    }
}
