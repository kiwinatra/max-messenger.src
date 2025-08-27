package defpackage;

/* renamed from: iz2  reason: default package */
public final class iz2 extends dn7 implements hz2 {
    public final kz2 v;

    public iz2(qn7 qn7) {
        this.v = qn7;
    }

    public final boolean a(Throwable th) {
        qn7 qn7 = this.o;
        if (qn7 == null) {
            qn7 = null;
        }
        return qn7.D(th);
    }

    public final pm7 getParent() {
        qn7 qn7 = this.o;
        if (qn7 != null) {
            return qn7;
        }
        return null;
    }

    public final boolean h() {
        return true;
    }

    public final void i(Throwable th) {
        qn7 qn7 = this.o;
        if (qn7 == null) {
            qn7 = null;
        }
        ((qn7) this.v).z(qn7);
    }
}
