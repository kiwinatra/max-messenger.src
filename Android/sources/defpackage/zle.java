package defpackage;

/* renamed from: zle  reason: default package */
public final class zle extends ac6 {
    public final /* synthetic */ snd b;
    public final /* synthetic */ jz2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zle(jz2 jz2, snd snd, snd snd2) {
        super(snd);
        this.c = jz2;
        this.b = snd2;
    }

    public final qnd e(long j) {
        qnd e = this.b.e(j);
        wnd wnd = e.a;
        long j2 = wnd.a;
        long j3 = wnd.b;
        long j4 = this.c.b;
        wnd wnd2 = new wnd(j2, j3 + j4);
        wnd wnd3 = e.b;
        return new qnd(wnd2, new wnd(wnd3.a, wnd3.b + j4));
    }
}
