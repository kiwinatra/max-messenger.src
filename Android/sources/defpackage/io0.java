package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io0  reason: default package */
public final class io0 implements qx0 {
    public final String a;
    public final v3d b;
    public final f8d c;
    public final c97 d;
    public final qx0 e;
    public final String f;
    public Object g;
    public final int h;

    public io0(String str, v3d v3d, f8d f8d, c97 c97, qx0 qx0, String str2) {
        this.a = str;
        this.b = v3d;
        this.c = f8d;
        this.d = c97;
        this.e = qx0;
        this.f = str2;
        this.h = ((((c97.hashCode() + ((f8d.hashCode() + (((str.hashCode() * 31) + (v3d != null ? v3d.hashCode() : 0)) * 31)) * 31)) * 31) + (qx0 != null ? qx0.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    public final boolean a(Uri uri) {
        return StringsKt__StringsKt.contains$default((CharSequence) this.a, (CharSequence) uri.toString(), false, 2, (Object) null);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) io0.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        io0 io0 = (io0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) io0.a) && Intrinsics.areEqual((Object) this.b, (Object) io0.b) && Intrinsics.areEqual((Object) this.c, (Object) io0.c) && Intrinsics.areEqual((Object) this.d, (Object) io0.d) && Intrinsics.areEqual((Object) this.e, (Object) io0.e) && Intrinsics.areEqual((Object) this.f, (Object) io0.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
