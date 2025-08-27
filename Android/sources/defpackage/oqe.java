package defpackage;

import java.util.List;

/* renamed from: oqe  reason: default package */
public final class oqe {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;

    public oqe(nqe nqe) {
        this.a = nqe.a;
        this.b = (CharSequence) nqe.c;
        this.c = (String) nqe.d;
        this.d = (String) nqe.e;
        this.e = (List) nqe.f;
        this.f = nqe.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oqe.class != obj.getClass()) {
            return false;
        }
        oqe oqe = (oqe) obj;
        if (this.a != oqe.a || this.f != oqe.f) {
            return false;
        }
        CharSequence charSequence = oqe.b;
        CharSequence charSequence2 = this.b;
        if (charSequence2 == null ? charSequence != null : !charSequence2.equals(charSequence)) {
            return false;
        }
        String str = oqe.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = oqe.d;
        String str4 = this.d;
        if (str4 == null ? str3 == null : str4.equals(str3)) {
            return this.e.equals(oqe.e);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        int i2 = 0;
        CharSequence charSequence = this.b;
        int hashCode = (i + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((this.e.hashCode() + ((hashCode2 + i2) * 31)) * 31) + (this.f ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetShowCaseItem{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', author='");
        sb.append(this.d);
        sb.append("', stickers=");
        sb.append(this.e);
        sb.append(", added=");
        return wzf.l(sb, this.f, '}');
    }
}
