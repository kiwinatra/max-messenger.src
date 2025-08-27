package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import kotlin.Lazy;
import kotlin.io.ConstantsKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yqf  reason: default package */
public final class yqf {
    public final /* synthetic */ Lazy a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ Lazy d;
    public final /* synthetic */ Lazy e;
    public final /* synthetic */ Lazy f;
    public final /* synthetic */ Lazy g;

    public yqf(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hj7, java.lang.Object] */
    public final void a(iq5 iq5) {
        nd ndVar = (nd) this.a.getValue();
        mi3 b2 = ((rh3) this.b.getValue()).b();
        boolean d2 = ((fn4) this.c.getValue()).d();
        ndVar.getClass();
        ? obj = new Object();
        obj.v = "NET";
        obj.w = (String) iq5.e;
        int i = iq5.d;
        if (i != 0) {
            obj.b(Integer.valueOf(i), "sent");
        }
        long j = iq5.c;
        if (j != 0) {
            obj.b(Long.valueOf(j), "respTime");
        }
        if (iq5.b) {
            obj.b(Boolean.TRUE, "error");
        }
        String str = (String) iq5.f;
        if (!cvg.A(str)) {
            obj.b(str, "value");
        }
        obj.b(Boolean.valueOf(d2), "background");
        obj.b(iq.C(b2), "conn");
        ndVar.j(obj.d());
    }

    public final long b() {
        ((fn4) this.c.getValue()).getClass();
        return SystemClock.elapsedRealtime();
    }

    public final mi3 c() {
        return ((rh3) this.b.getValue()).b();
    }

    public final void d(String str) {
        ((uta) ((m95) this.d.getValue())).c(new Exception(str), true);
    }

    public final boolean e(String str, String str2) {
        akd akd = (akd) ((wj0) ((ou8) this.g.getValue())).c;
        akd.getClass();
        int r = (int) akd.r(PmsKey.f80minstickersize, (long) 432);
        int r2 = (int) akd.r(PmsKey.f72maxstickersize, (long) ConstantsKt.MINIMUM_BLOCK_SIZE);
        int i = o5a.f;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int height = decodeFile.getHeight();
        int width = decodeFile.getWidth();
        if (height >= r && height <= r2 && width >= r && width <= r2) {
            return false;
        }
        Bitmap Z = o5a.Z(r, r2, decodeFile);
        int e2 = new ab5(str).e(1, "Orientation");
        try {
            o5a.c0(str2, Z, 100, Bitmap.CompressFormat.PNG);
            Z.recycle();
            decodeFile.recycle();
            ab5 ab5 = new ab5(str2);
            ab5.F("Orientation", String.valueOf(e2));
            ab5.B();
            return true;
        } catch (Throwable th) {
            if (Z != null) {
                Z.recycle();
            }
            decodeFile.recycle();
            throw th;
        }
    }
}
