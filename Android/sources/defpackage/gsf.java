package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gsf  reason: default package */
public class gsf extends yrf {
    public ArrayList Q0 = new ArrayList();
    public boolean R0 = true;
    public int S0;
    public boolean T0 = false;
    public int U0 = 0;

    public final void B(View view) {
        super.B(view);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).B(view);
        }
    }

    public final void C() {
        this.K0 = 0;
        fsf fsf = new fsf(this);
        for (int i = 0; i < this.Q0.size(); i++) {
            yrf yrf = (yrf) this.Q0.get(i);
            yrf.a(fsf);
            yrf.C();
            long j = yrf.K0;
            if (this.R0) {
                this.K0 = Math.max(this.K0, j);
            } else {
                long j2 = this.K0;
                yrf.L0 = j2;
                this.K0 = j2 + j;
            }
        }
    }

    public final yrf D(xrf xrf) {
        super.D(xrf);
        return this;
    }

    public final void E(View view) {
        for (int i = 0; i < this.Q0.size(); i++) {
            ((yrf) this.Q0.get(i)).E(view);
        }
        this.w.remove(view);
    }

    public final void F(View view) {
        super.F(view);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).F(view);
        }
    }

    public final void G() {
        if (this.Q0.isEmpty()) {
            O();
            o();
            return;
        }
        fsf fsf = new fsf();
        fsf.b = this;
        Iterator it = this.Q0.iterator();
        while (it.hasNext()) {
            ((yrf) it.next()).a(fsf);
        }
        this.S0 = this.Q0.size();
        if (!this.R0) {
            for (int i = 1; i < this.Q0.size(); i++) {
                ((yrf) this.Q0.get(i - 1)).a(new dk0(1, (yrf) this.Q0.get(i)));
            }
            yrf yrf = (yrf) this.Q0.get(0);
            if (yrf != null) {
                yrf.G();
                return;
            }
            return;
        }
        Iterator it2 = this.Q0.iterator();
        while (it2.hasNext()) {
            ((yrf) it2.next()).G();
        }
    }

    public final void H(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        long j5 = this.K0;
        if (this.Z != null) {
            if (j3 < 0 && j4 < 0) {
                return;
            }
            if (j3 > j5 && j4 > j5) {
                return;
            }
        }
        int i = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        boolean z = i < 0;
        int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if ((i2 >= 0 && j4 < 0) || (j3 <= j5 && j4 > j5)) {
            this.D0 = false;
            A(this, xff.b, z);
        }
        if (this.R0) {
            for (int i3 = 0; i3 < this.Q0.size(); i3++) {
                ((yrf) this.Q0.get(i3)).H(j3, j4);
            }
        } else {
            int i4 = 1;
            while (true) {
                if (i4 >= this.Q0.size()) {
                    i4 = this.Q0.size();
                    break;
                } else if (((yrf) this.Q0.get(i4)).L0 > j4) {
                    break;
                } else {
                    i4++;
                }
            }
            int i5 = i4 - 1;
            if (i >= 0) {
                while (i5 < this.Q0.size()) {
                    yrf yrf = (yrf) this.Q0.get(i5);
                    long j6 = yrf.L0;
                    int i6 = i5;
                    long j7 = j3 - j6;
                    if (j7 < 0) {
                        break;
                    }
                    yrf.H(j7, j4 - j6);
                    i5 = i6 + 1;
                }
            } else {
                while (i5 >= 0) {
                    yrf yrf2 = (yrf) this.Q0.get(i5);
                    long j8 = yrf2.L0;
                    long j9 = j3 - j8;
                    yrf2.H(j9, j4 - j8);
                    if (j9 >= 0) {
                        break;
                    }
                    i5--;
                }
            }
        }
        if (this.Z != null) {
            int i7 = (j3 > j5 ? 1 : (j3 == j5 ? 0 : -1));
            if ((i7 > 0 && j4 <= j5) || (i2 < 0 && j4 >= 0)) {
                if (i7 > 0) {
                    this.D0 = true;
                }
                A(this, xff.c, z);
            }
        }
    }

    public final void J(f6e f6e) {
        this.I0 = f6e;
        this.U0 |= 8;
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).J(f6e);
        }
    }

    public final void K(TimeInterpolator timeInterpolator) {
        this.U0 |= 1;
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((yrf) this.Q0.get(i)).K(timeInterpolator);
            }
        }
        this.o = timeInterpolator;
    }

    public final void L(ece ece) {
        super.L(ece);
        this.U0 |= 4;
        if (this.Q0 != null) {
            for (int i = 0; i < this.Q0.size(); i++) {
                ((yrf) this.Q0.get(i)).L(ece);
            }
        }
    }

    public final void M(c9e c9e) {
        this.H0 = c9e;
        this.U0 |= 2;
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).M(c9e);
        }
    }

    public final void N(long j) {
        this.b = j;
    }

    public final String P(String str) {
        String P = super.P(str);
        for (int i = 0; i < this.Q0.size(); i++) {
            StringBuilder m = g63.m(P, "\n");
            m.append(((yrf) this.Q0.get(i)).P(str + "  "));
            P = m.toString();
        }
        return P;
    }

    public final void Q(xrf xrf) {
        super.a(xrf);
    }

    /* renamed from: R */
    public final gsf b(int i) {
        for (int i2 = 0; i2 < this.Q0.size(); i2++) {
            ((yrf) this.Q0.get(i2)).b(i);
        }
        super.b(i);
        return this;
    }

    public final void S(yrf yrf) {
        this.Q0.add(yrf);
        yrf.Z = this;
        long j = this.c;
        if (j >= 0) {
            yrf.I(j);
        }
        if ((this.U0 & 1) != 0) {
            yrf.K(this.o);
        }
        if ((this.U0 & 2) != 0) {
            yrf.M(this.H0);
        }
        if ((this.U0 & 4) != 0) {
            yrf.L(this.J0);
        }
        if ((this.U0 & 8) != 0) {
            yrf.J(this.I0);
        }
    }

    public final yrf T(int i) {
        if (i < 0 || i >= this.Q0.size()) {
            return null;
        }
        return (yrf) this.Q0.get(i);
    }

    /* renamed from: U */
    public final void I(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j >= 0 && (arrayList = this.Q0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((yrf) this.Q0.get(i)).I(j);
            }
        }
    }

    public final void V(int i) {
        if (i == 0) {
            this.R0 = true;
        } else if (i == 1) {
            this.R0 = false;
        } else {
            throw new AndroidRuntimeException(wj6.h(i, "Invalid parameter for TransitionSet ordering: "));
        }
    }

    public final void c(View view) {
        for (int i = 0; i < this.Q0.size(); i++) {
            ((yrf) this.Q0.get(i)).c(view);
        }
        this.w.add(view);
    }

    public final void e() {
        super.e();
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).e();
        }
    }

    public final void f(isf isf) {
        if (y(isf.b)) {
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                yrf yrf = (yrf) it.next();
                if (yrf.y(isf.b)) {
                    yrf.f(isf);
                    isf.c.add(yrf);
                }
            }
        }
    }

    public final void h(isf isf) {
        super.h(isf);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).h(isf);
        }
    }

    public final void i(isf isf) {
        if (y(isf.b)) {
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                yrf yrf = (yrf) it.next();
                if (yrf.y(isf.b)) {
                    yrf.i(isf);
                    isf.c.add(yrf);
                }
            }
        }
    }

    /* renamed from: l */
    public final yrf clone() {
        gsf gsf = (gsf) super.clone();
        gsf.Q0 = new ArrayList();
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            yrf l = ((yrf) this.Q0.get(i)).clone();
            gsf.Q0.add(l);
            l.Z = gsf;
        }
        return gsf;
    }

    public final void n(ViewGroup viewGroup, qpg qpg, qpg qpg2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            yrf yrf = (yrf) this.Q0.get(i);
            if (j > 0 && (this.R0 || i == 0)) {
                long j2 = yrf.b;
                if (j2 > 0) {
                    yrf.N(j2 + j);
                } else {
                    yrf.N(j);
                }
            }
            yrf.n(viewGroup, qpg, qpg2, arrayList, arrayList2);
        }
    }

    public final void p(int i) {
        for (int i2 = 0; i2 < this.Q0.size(); i2++) {
            ((yrf) this.Q0.get(i2)).p(i);
        }
        super.p(i);
    }

    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((yrf) this.Q0.get(i)).q(viewGroup);
        }
    }

    public final boolean w() {
        for (int i = 0; i < this.Q0.size(); i++) {
            if (((yrf) this.Q0.get(i)).w()) {
                return true;
            }
        }
        return false;
    }
}
