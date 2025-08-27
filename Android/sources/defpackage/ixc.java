package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ixc  reason: default package */
public final class ixc implements kxc {
    public final long a;
    public final byte[] b;

    public ixc(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixc)) {
            return false;
        }
        ixc ixc = (ixc) obj;
        return this.a == ixc.a && Intrinsics.areEqual((Object) this.b, (Object) ixc.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "AudioMsg(duration=" + this.a + ", wave=" + arrays + ")";
    }
}
