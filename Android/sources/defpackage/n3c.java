package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n3c  reason: default package */
public final class n3c extends s3c {
    public final CharSequence a;
    public final ngf b;

    public n3c(CharSequence charSequence, igf igf) {
        this.a = charSequence;
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3c)) {
            return false;
        }
        n3c n3c = (n3c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) n3c.a) && Intrinsics.areEqual((Object) this.b, (Object) n3c.b);
    }

    public final long getItemId() {
        return (long) 65536;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngf ngf = this.b;
        return hashCode + (ngf == null ? 0 : ngf.hashCode());
    }

    public final int i() {
        return 65536;
    }

    public final String toString() {
        return "ContactDescription(text=" + this.a + ", title=" + this.b + ")";
    }
}
