package defpackage;

/* renamed from: z4h  reason: default package */
public abstract class z4h implements Runnable {
    public final qdf a;

    public z4h() {
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

    public z4h(qdf qdf) {
        this.a = qdf;
    }
}
