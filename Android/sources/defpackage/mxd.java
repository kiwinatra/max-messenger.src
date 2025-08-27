package defpackage;

/* renamed from: mxd  reason: default package */
public final class mxd {
    public final xcf a;

    public mxd(ycf ycf) {
        xcf xcf = ycf instanceof xcf ? (xcf) ycf : null;
        this.a = xcf == null ? new xcf(ycf) : xcf;
    }

    public final Thread a(String str, Runnable runnable) {
        return this.a.a(str).newThread(runnable);
    }
}
