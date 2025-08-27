package defpackage;

import java.util.List;

/* renamed from: lmd  reason: default package */
public final class lmd {
    public final ekd a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final long g;
    public final int h;
    public final boolean i;
    public final long j;
    public final List k;
    public final List l;
    public final String m;
    public final List n;

    public lmd(kmd kmd) {
        this.a = kmd.a;
        this.b = kmd.b;
        this.c = kmd.c;
        this.d = kmd.d;
        this.e = kmd.e;
        this.f = kmd.f;
        this.g = kmd.g;
        this.i = kmd.i;
        this.h = kmd.h;
        this.j = kmd.j;
        this.k = kmd.k;
        this.l = kmd.l;
        this.m = kmd.m;
        this.n = kmd.n;
    }

    public final String toString() {
        int o = kv0.o(this.d);
        int o2 = kv0.o(this.e);
        int o3 = kv0.o(this.k);
        int o4 = kv0.o(this.l);
        int o5 = kv0.o(this.n);
        StringBuilder sb = new StringBuilder("Section{type=");
        sb.append(this.a);
        sb.append(", id='");
        sb.append(this.b);
        sb.append("', title='");
        sb.append(this.c);
        sb.append("', stickers=");
        sb.append(o);
        sb.append(", stickerSets=");
        sb.append(o2);
        sb.append(", marker=");
        sb.append(this.g);
        sb.append(", totalCount=");
        sb.append(this.h);
        sb.append(", collapsed=");
        sb.append(this.i);
        sb.append(", updateTime=");
        sb.append(this.j);
        sb.append(", recentEmojiList=");
        sb.append(o3);
        sb.append(", recentsList=");
        sb.append(o4);
        sb.append(", animojiSets=");
        sb.append(o5);
        sb.append(", mode='");
        return wj6.n(sb, this.m, "'}");
    }
}
