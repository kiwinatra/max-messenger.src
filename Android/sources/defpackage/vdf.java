package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vdf  reason: default package */
public final class vdf {
    public final long a;
    public final idb b;
    public final gef c;
    public final int d;
    public final long e;
    public final int f;
    public final byte[] g;
    public final long h;

    public vdf(long j, idb idb, gef gef, int i, long j2, int i2, byte[] bArr, long j3) {
        this.a = j;
        this.b = idb;
        this.c = gef;
        this.d = i;
        this.e = j2;
        this.f = i2;
        this.g = bArr;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdf)) {
            return false;
        }
        vdf vdf = (vdf) obj;
        return this.a == vdf.a && this.b == vdf.b && this.c == vdf.c && this.d == vdf.d && this.e == vdf.e && this.f == vdf.f && Intrinsics.areEqual((Object) this.g, (Object) vdf.g) && this.h == vdf.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int h2 = rae.h(this.f, wzf.i(rae.h(this.d, (hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31);
        return Long.hashCode(this.h) + ((Arrays.hashCode(this.g) + h2) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("TaskEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", failsCount=");
        sb.append(this.d);
        sb.append(", dependsRequestId=");
        sb.append(this.e);
        sb.append(", dependencyType=");
        sb.append(this.f);
        sb.append(", data=");
        sb.append(arrays);
        sb.append(", createdTime=");
        return wj6.m(sb, this.h, ")");
    }
}
