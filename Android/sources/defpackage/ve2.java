package defpackage;

import java.util.List;

/* renamed from: ve2  reason: default package */
public final class ve2 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public ve2(List list, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.e = i;
        this.f = i2;
        this.d = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMediaResult{messages=");
        List list = this.a;
        sb.append(list != null ? list.size() : 0);
        sb.append(", forward=");
        sb.append(this.b);
        sb.append(", isNetworkLoading=");
        sb.append(this.c);
        sb.append(", responseCount=");
        sb.append(this.d);
        sb.append(", forwardCount=");
        sb.append(this.e);
        sb.append(", backwardCount=");
        return tr1.k(sb, this.f, '}');
    }
}
