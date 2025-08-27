package defpackage;

import android.view.View;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* renamed from: krc  reason: default package */
public final class krc extends fbf implements tsc {
    public boolean v = true;
    public Function1 w;
    public jqc x;
    public boolean y;

    public krc() {
        super((Function1) new oo9(28));
    }

    public final void g(xd9 xd9, boolean z) {
        ((pqc) Q()).setOnChipClickListener(this.w);
        jqc jqc = this.x;
        if (jqc != null) {
            ((pqc) Q()).setChipObserver(jqc);
        }
        ((pqc) Q()).setStackFromEnd(this.y);
        ((pqc) Q()).setIncoming(this.v);
        ((pqc) Q()).f(xd9, z);
        u();
    }

    public final void l(ws0 ws0, boolean z) {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            pqc pqc = (pqc) lazy.getValue();
            pqc pqc2 = (pqc) Q();
            pqc2.getClass();
            int i = 0;
            while (i < pqc2.getChildCount()) {
                int i2 = i + 1;
                View childAt = pqc2.getChildAt(i);
                if (childAt != null) {
                    nqc nqc = (nqc) childAt;
                    if (z) {
                        vs0 vs0 = ws0.a.c;
                        nqc.v = vs0.a;
                        nqc.w = vs0.b;
                        at0 at0 = ws0.b.a;
                        nqc.x = at0.a;
                        nqc.y = at0.b;
                    } else {
                        vs0 vs02 = ws0.a.c;
                        nqc.v = vs02.c;
                        nqc.w = vs02.d;
                        at0 at02 = ws0.b.a;
                        nqc.x = at02.c;
                        nqc.y = at02.d;
                    }
                    nqc.invalidate();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
    }

    public final void q(boolean z) {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            pqc pqc = (pqc) lazy.getValue();
            ((pqc) Q()).f((xd9) null, z);
        }
    }

    public final void setChipObserver(jqc jqc) {
        if (((Lazy) this.c).isInitialized()) {
            ((pqc) Q()).setChipObserver(jqc);
        } else {
            this.x = jqc;
        }
    }

    public final void setIsIncoming(boolean z) {
        this.v = z;
    }

    public final void setOnClickListener(Function1 function1) {
        this.w = function1;
    }

    public final void setStackFromEnd(boolean z) {
        this.y = z;
    }
}
