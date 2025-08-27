package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: go9  reason: default package */
public final class go9 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public go9(long j, long j2, long j3, List list, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go9)) {
            return false;
        }
        go9 go9 = (go9) obj;
        return this.a == go9.a && this.b == go9.b && this.c == go9.c && Intrinsics.areEqual((Object) this.d, (Object) go9.d) && this.e == go9.e && this.f == go9.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + g63.e(rae.i(this.d, wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesListWidgetArgs(chatId=");
        sb.append(this.a);
        sb.append(", loadMark=");
        sb.append(this.b);
        sb.append(", loadMessageId=");
        sb.append(this.c);
        sb.append(", highlights=");
        sb.append(this.d);
        sb.append(", shouldHighlightMessage=");
        sb.append(this.e);
        sb.append(", shouldSkipUnreadDecoration=");
        return tr1.m(sb, this.f, ")");
    }
}
