package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: jz5  reason: default package */
public final class jz5 implements lz7 {
    public final ngf a;
    public final boolean b;
    public final int c;

    public /* synthetic */ jz5(mgf mgf, boolean z) {
        this(mgf, z, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5)) {
            return false;
        }
        jz5 jz5 = (jz5) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jz5.a) && this.b == jz5.b && this.c == jz5.c;
    }

    public final long getItemId() {
        return LongCompanionObject.MAX_VALUE;
    }

    public final int hashCode() {
        ngf ngf = this.a;
        return Integer.hashCode(this.c) + g63.e((ngf == null ? 0 : ngf.hashCode()) * 31, 31, this.b);
    }

    public final int i() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditNameInputItem(defaultValue=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", nameLengthLimit=");
        return wj6.l(sb, this.c, ")");
    }

    public jz5(ngf ngf, boolean z, int i) {
        this.a = ngf;
        this.b = z;
        this.c = i;
    }
}
