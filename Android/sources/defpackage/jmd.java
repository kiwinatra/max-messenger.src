package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jmd  reason: default package */
public final class jmd {
    public final gmd a;
    public final CharSequence b;
    public final boolean c;

    public jmd(gmd gmd, CharSequence charSequence, boolean z) {
        this.a = gmd;
        this.b = charSequence;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmd)) {
            return false;
        }
        jmd jmd = (jmd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jmd.a) && Intrinsics.areEqual((Object) this.b, (Object) jmd.b) && this.c == jmd.c;
    }

    public final int hashCode() {
        int i = 0;
        gmd gmd = this.a;
        int hashCode = (gmd != null ? gmd.hashCode() : 0) * 31;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchViewQueryTextEvent(view=");
        sb.append(this.a);
        sb.append(", queryText=");
        sb.append(this.b);
        sb.append(", isSubmitted=");
        return tr1.m(sb, this.c, ")");
    }
}
