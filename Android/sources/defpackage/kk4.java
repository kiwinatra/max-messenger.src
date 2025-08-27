package defpackage;

/* renamed from: kk4  reason: default package */
public final /* synthetic */ class kk4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk4 b;

    public /* synthetic */ kk4(lk4 lk4, int i) {
        this.a = i;
        this.b = lk4;
    }

    public final void run() {
        int i = this.a;
        lk4 lk4 = this.b;
        switch (i) {
            case 0:
                lk4.getClass();
                try {
                    lk4.e.get();
                    lk4.m.decrementAndGet();
                    lk4.l.get();
                    lk4.toString();
                    return;
                } catch (Exception e) {
                    lk4.toString();
                    synchronized (lk4.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{lk4, Boolean.valueOf(lk4.c), Integer.valueOf(lk4.b)}), e);
                    }
                }
            case 1:
                lk4.a();
                return;
            default:
                lk4.b();
                return;
        }
    }

    public /* synthetic */ kk4(lk4 lk4, String str) {
        this.a = 0;
        this.b = lk4;
    }
}
