package ru.ok.messages.views.fragments;

import ru.ok.messages.views.fragments.base.FrgBase;

public abstract class FrgSlideOut extends FrgBase implements vde {
    public boolean B1 = true;

    public void A1(int i) {
        if (X2() != null) {
            M1().finish();
            M1().overridePendingTransition(0, 0);
        }
    }

    public void D1() {
        hi6 h3 = h3();
        if (h3 != null) {
            this.B1 = h3.d();
            h3.b(false, true, true);
        }
    }

    public void c3(m5 m5Var) {
        this.n1 = false;
        if (!(m5Var instanceof hi6)) {
            throw new RuntimeException("Parent activity must implement FrgSlideOut.Listener interface");
        }
    }

    public boolean e1() {
        return true;
    }

    public final void h0() {
        hi6 h3 = h3();
        if (h3 != null && this.B1) {
            h3.b(true, true, false);
        }
    }

    public hi6 h3() {
        if (X2() != null) {
            return (hi6) X2();
        }
        return null;
    }
}
