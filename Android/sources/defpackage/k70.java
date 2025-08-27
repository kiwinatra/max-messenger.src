package defpackage;

/* renamed from: k70  reason: default package */
public final /* synthetic */ class k70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k70(m70 m70, boolean z, int i) {
        this.a = i;
        this.b = m70;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                m70 m70 = this.b;
                int y = tr1.y(m70.g);
                if (y == 0) {
                    m70.b.set((Object) null);
                    m70.c.set(false);
                    m70.g = 2;
                    m70.a.execute(new k70(m70, this.c, 1));
                    m70.d();
                    return;
                } else if (y == 2) {
                    throw new AssertionError("AudioSource is released");
                } else {
                    return;
                }
            default:
                m70 m702 = this.b;
                int y2 = tr1.y(m702.g);
                if (y2 == 0 || y2 == 1) {
                    boolean z = m702.r;
                    boolean z2 = this.c;
                    if (z != z2) {
                        m702.r = z2;
                        if (m702.g == 2) {
                            m702.a();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (y2 == 2) {
                    throw new AssertionError("AudioSource is released");
                } else {
                    return;
                }
        }
    }
}
