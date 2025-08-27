package defpackage;

/* renamed from: a6h  reason: default package */
public abstract class a6h implements Runnable {
    public final qdf a;

    public a6h() {
        this.a = null;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            qdf qdf = this.a;
            if (qdf != null) {
                qdf.c(e);
            }
        }
    }

    public a6h(qdf qdf) {
        this.a = qdf;
    }
}
