package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: woa  reason: default package */
public final class woa {
    public static final Lazy g = LazyKt.lazy(new pna(17));
    public final String a;
    public final CharSequence b;
    public final voa c;
    public final bs0 d;
    public final Drawable e;
    public final Drawable f;

    public woa(String str, CharSequence charSequence, voa voa, bs0 bs0, Drawable drawable, Drawable drawable2) {
        this.a = str;
        this.b = charSequence;
        this.c = voa;
        this.d = bs0;
        this.e = drawable;
        this.f = drawable2;
    }

    public static woa a(woa woa, voa voa) {
        String str = woa.a;
        CharSequence charSequence = woa.b;
        bs0 bs0 = woa.d;
        Drawable drawable = woa.e;
        Drawable drawable2 = woa.f;
        woa.getClass();
        return new woa(str, charSequence, voa, bs0, drawable, drawable2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woa)) {
            return false;
        }
        woa woa = (woa) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) woa.a) && Intrinsics.areEqual((Object) this.b, (Object) woa.b) && this.c == woa.c && Intrinsics.areEqual((Object) this.d, (Object) woa.d) && Intrinsics.areEqual((Object) this.e, (Object) woa.e) && Intrinsics.areEqual((Object) this.f, (Object) woa.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + wj6.e(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        int i = 0;
        Drawable drawable = this.e;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            i = drawable2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "OneMeBaseTabItemModel(id=" + this.a + ", title=" + this.b + ", state=" + this.c + ", indicator=" + this.d + ", startIcon=" + this.e + ", endIcon=" + this.f + ")";
    }

    public /* synthetic */ woa(String str, String str2, voa voa, int i) {
        this(str, str2, voa, uoa.n, (Drawable) null, (Drawable) null);
    }
}
