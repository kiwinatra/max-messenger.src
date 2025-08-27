package defpackage;

/* renamed from: iaf  reason: default package */
public final class iaf implements Runnable {
    public Object a;
    public final /* synthetic */ laf b;

    public iaf(laf laf) {
        this.b = laf;
    }

    public final synchronized void run() {
        if (this.a != null) {
            this.b.getClass();
        }
    }
}
