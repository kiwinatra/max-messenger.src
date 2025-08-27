package defpackage;

import java.util.Arrays;

/* renamed from: l55  reason: default package */
public final class l55 {
    public final l65 a;
    public final byte[] b;

    public l55(l65 l65, byte[] bArr) {
        if (l65 == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = l65;
            this.b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l55)) {
            return false;
        }
        l55 l55 = (l55) obj;
        if (!this.a.equals(l55.a)) {
            return false;
        }
        return Arrays.equals(this.b, l55.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
