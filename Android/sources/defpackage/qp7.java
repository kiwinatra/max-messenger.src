package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;

/* renamed from: qp7  reason: default package */
public final class qp7 extends up7 {
    public final qp7 c;
    public final eud d;
    public qp7 e;
    public String f;
    public int g;
    public int h;

    public qp7(qp7 qp7, eud eud, int i, int i2, int i3) {
        this.c = qp7;
        this.d = eud;
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.b = -1;
    }

    public final String a() {
        return this.f;
    }

    public final qp7 f(int i, int i2) {
        qp7 qp7 = this.e;
        eud eud = null;
        if (qp7 == null) {
            eud eud2 = this.d;
            if (eud2 != null) {
                eud = new eud(eud2.c);
            }
            qp7 = new qp7(this, eud, 1, i, i2);
            this.e = qp7;
        } else {
            qp7.a = 1;
            qp7.b = -1;
            qp7.g = i;
            qp7.h = i2;
            qp7.f = null;
            eud eud3 = qp7.d;
            if (eud3 != null) {
                eud3.b = null;
                eud3.o = null;
                eud3.v = null;
            }
        }
        return qp7;
    }

    public final qp7 g(int i, int i2) {
        qp7 qp7 = this.e;
        eud eud = null;
        if (qp7 == null) {
            eud eud2 = this.d;
            if (eud2 != null) {
                eud = new eud(eud2.c);
            }
            qp7 qp72 = new qp7(this, eud, 2, i, i2);
            this.e = qp72;
            return qp72;
        }
        qp7.a = 2;
        qp7.b = -1;
        qp7.g = i;
        qp7.h = i2;
        qp7.f = null;
        eud eud3 = qp7.d;
        if (eud3 != null) {
            eud3.b = null;
            eud3.o = null;
            eud3.v = null;
        }
        return qp7;
    }

    public final void h(String str) {
        this.f = str;
        eud eud = this.d;
        if (eud != null && eud.r(str)) {
            Object obj = eud.c;
            throw new StreamReadException(obj instanceof pp7 ? (pp7) obj : null, wj6.k("Duplicate field '", str, "'"));
        }
    }
}
