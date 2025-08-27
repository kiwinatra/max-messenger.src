package defpackage;

/* renamed from: id8  reason: default package */
public final /* synthetic */ class id8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd8 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ id8(jd8 jd8, Object obj, int i) {
        this.a = i;
        this.b = jd8;
        this.c = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                id8.super.c(this.c);
                return;
            case 1:
                jd8 jd8 = this.b;
                jd8.getClass();
                try {
                    id8.super.d(this.c);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                jd8 jd82 = this.b;
                jd82.getClass();
                try {
                    id8.super.f(this.c);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
