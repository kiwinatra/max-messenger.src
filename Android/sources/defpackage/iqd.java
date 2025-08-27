package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: iqd  reason: default package */
public final class iqd {
    public final String a;
    public final m58 b;
    public final boolean c;

    public iqd(String str, m58 m58, boolean z) {
        this.a = str;
        this.b = m58;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqd)) {
            return false;
        }
        iqd iqd = (iqd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) iqd.a) && Intrinsics.areEqual((Object) this.b, (Object) iqd.b) && this.c == iqd.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedFolderModel(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", editable=");
        return tr1.m(sb, this.c, ")");
    }
}
