package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3g  reason: default package */
public final class g3g implements f9g {
    public final String a;
    public final long b;
    public final n7g c;
    public final ipb o;
    public final g4g v;
    public final WeakReference w;
    public final tb8 x;

    public g3g(String str, long j, n7g n7g, ipb ipb, g4g g4g, WeakReference weakReference, tb8 tb8) {
        this.a = str;
        this.b = j;
        this.c = n7g;
        this.o = ipb;
        this.v = g4g;
        this.w = weakReference;
        this.x = tb8;
    }

    public final int B() {
        return this.v.getHeight();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3g)) {
            return false;
        }
        g3g g3g = (g3g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g3g.a) && this.b == g3g.b && Intrinsics.areEqual((Object) this.c, (Object) g3g.c) && Intrinsics.areEqual((Object) this.o, (Object) g3g.o) && Intrinsics.areEqual((Object) this.v, (Object) g3g.v) && Intrinsics.areEqual((Object) this.w, (Object) g3g.w) && Intrinsics.areEqual((Object) this.x, (Object) g3g.x);
    }

    public final void f() {
        this.v.getClass();
    }

    public final int hashCode() {
        int i = wzf.i(this.a.hashCode() * 31, 31, this.b);
        int hashCode = this.o.hashCode();
        int hashCode2 = this.v.hashCode();
        int hashCode3 = this.w.hashCode();
        return this.x.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.c.hashCode() + i) * 31)) * 31)) * 31)) * 31);
    }

    public final void j(Surface surface) {
        String name = g3g.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            long j = this.b;
            String str = this.a;
            boolean a2 = this.c.a();
            StringBuilder k = i2a.k("Player autoplay. Surface created, \n                            |msgId:", j, ", \n                            |attachId:", str);
            k.append("\n                            |playing:");
            k.append(a2);
            a67.d(w78, name, StringsKt__IndentKt.trimMargin$default(k.toString(), (String) null, 1, (Object) null), (Throwable) null);
        }
        this.c.L0(surface);
    }

    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = g3g.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            long j = this.b;
            String str = this.a;
            boolean a2 = this.c.a();
            int g = this.x.g();
            StringBuilder k = i2a.k("Player autoplay. Surface destroyed, \n                            |msgId:", j, ", \n                            |attachId:", str);
            k.append("\n                            |playing:");
            k.append(a2);
            k.append("\n                            |states:");
            k.append(g);
            a67.d(w78, name, StringsKt__IndentKt.trimMargin$default(k.toString(), (String) null, 1, (Object) null), (Throwable) null);
        }
        this.o.a(this.c);
        this.c.M0();
        i9g i9g = (i9g) this.w.get();
        if (i9g != null) {
            i9g.a();
        }
        this.x.e(this.a);
    }

    public final int p() {
        return this.v.getWidth();
    }

    public final String toString() {
        return "PlayingState(attachId=" + this.a + ", messageId=" + this.b + ", player=" + this.c + ", playerHolder=" + this.o + ", videoContent=" + this.v + ", weakViewRef=" + this.w + ", states=" + this.x + ")";
    }
}
