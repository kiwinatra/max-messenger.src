package defpackage;

/* renamed from: xuc  reason: default package */
public final class xuc implements Comparable {
    public final a32 a;
    public final vk3 b;

    public xuc(a32 a32, vk3 vk3) {
        this.a = a32;
        this.b = vk3;
    }

    public final int compareTo(Object obj) {
        xuc xuc = (xuc) obj;
        a32 a32 = this.a;
        long j = a32 != null ? a32.b.Y : this.b.a.c.r;
        a32 a322 = xuc.a;
        return kne.l(a322 != null ? a322.b.Y : xuc.b.a.c.r, j);
    }
}
