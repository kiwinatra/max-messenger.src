package defpackage;

import kotlin.io.ConstantsKt;

/* renamed from: o3c  reason: default package */
public final class o3c extends s3c {
    public final long a;

    public o3c(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3c) && this.a == ((o3c) obj).a;
    }

    public final long getItemId() {
        return (long) ConstantsKt.DEFAULT_BLOCK_SIZE;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final int i() {
        return ConstantsKt.DEFAULT_BLOCK_SIZE;
    }

    public final String toString() {
        return wj6.m(new StringBuilder("DebugProfileInfo(id="), this.a, ")");
    }
}
