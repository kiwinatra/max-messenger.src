package defpackage;

/* renamed from: wc0  reason: default package */
public final class wc0 {
    public final String a;
    public final int b;
    public final sa0 c;

    public wc0(String str, int i, sa0 sa0) {
        this.a = str;
        this.b = i;
        this.c = sa0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wc0)) {
            return false;
        }
        wc0 wc0 = (wc0) obj;
        if (this.a.equals(wc0.a) && this.b == wc0.b) {
            sa0 sa0 = wc0.c;
            sa0 sa02 = this.c;
            if (sa02 == null) {
                if (sa0 == null) {
                    return true;
                }
            } else if (sa02.equals(sa0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        sa0 sa0 = this.c;
        return (sa0 == null ? 0 : sa0.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
