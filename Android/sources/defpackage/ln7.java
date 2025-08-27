package defpackage;

/* renamed from: ln7  reason: default package */
public final class ln7 extends dn7 {
    public final qn7 v;
    public final mn7 w;
    public final iz2 x;
    public final Object y;

    public ln7(qn7 qn7, mn7 mn7, iz2 iz2, Object obj) {
        this.v = qn7;
        this.w = mn7;
        this.x = iz2;
        this.y = obj;
    }

    public final boolean h() {
        return false;
    }

    public final void i(Throwable th) {
        qn7 qn7 = this.v;
        qn7.getClass();
        iz2 iz2 = this.x;
        iz2 W = qn7.W(iz2);
        mn7 mn7 = this.w;
        Object obj = this.y;
        if (W == null || !qn7.g0(mn7, W, obj)) {
            x9a x9a = mn7.a;
            x9a.getClass();
            x9a.c(new iz7(2), 2);
            iz2 W2 = qn7.W(iz2);
            if (W2 == null || !qn7.g0(mn7, W2, obj)) {
                qn7.w(qn7.G(mn7, obj));
            }
        }
    }
}
