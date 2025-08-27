package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n8e  reason: default package */
public final class n8e implements dk9 {
    public final long a;
    public final String b;
    public final dw0 c;
    public final xv0 d;
    public final ngf e;
    public final ngf f;
    public final List g;

    public n8e(long j, String str, dw0 dw0, xv0 xv0, igf igf, igf igf2, List list) {
        this.a = j;
        this.b = str;
        this.c = dw0;
        this.d = xv0;
        this.e = igf;
        this.f = igf2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8e)) {
            return false;
        }
        n8e n8e = (n8e) obj;
        return this.a == n8e.a && Intrinsics.areEqual((Object) this.b, (Object) n8e.b) && Intrinsics.areEqual((Object) this.c, (Object) n8e.c) && Intrinsics.areEqual((Object) this.d, (Object) n8e.d) && Intrinsics.areEqual((Object) this.e, (Object) n8e.e) && Intrinsics.areEqual((Object) this.f, (Object) n8e.f) && Intrinsics.areEqual((Object) this.g, (Object) n8e.g);
    }

    public final int hashCode() {
        int g2 = i2a.g((this.d.hashCode() + ((this.c.hashCode() + g63.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        ngf ngf = this.f;
        return this.g.hashCode() + ((g2 + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowShareContactForBotConfirmation(messageId=");
        sb.append(this.a);
        sb.append(", keyboardId=");
        sb.append(this.b);
        sb.append(", buttonPosition=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", buttons=");
        return tr1.l(sb, this.g, ")");
    }
}
