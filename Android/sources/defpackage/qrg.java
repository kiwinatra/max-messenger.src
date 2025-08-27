package defpackage;

/* renamed from: qrg  reason: default package */
public final class qrg {
    public final da6 a;
    public final String b;

    public qrg(da6 da6, String str) {
        this.a = da6;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qrg.class != obj.getClass()) {
            return false;
        }
        qrg qrg = (qrg) obj;
        da6 da6 = qrg.a;
        da6 da62 = this.a;
        if (da62 == null ? da6 != null : !da62.equals(da6)) {
            return false;
        }
        String str = qrg.b;
        String str2 = this.b;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        int i = 0;
        da6 da6 = this.a;
        int hashCode = (da6 != null ? da6.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YtFile{format=");
        sb.append(this.a);
        sb.append(", url='");
        return wj6.n(sb, this.b, "'}");
    }
}
