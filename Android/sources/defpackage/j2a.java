package defpackage;

import ru.ok.messages.constructor.ConstructorPopupLayout;

/* renamed from: j2a  reason: default package */
public final /* synthetic */ class j2a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2a b;

    public /* synthetic */ j2a(l2a l2a, int i) {
        this.a = i;
        this.b = l2a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y.p();
                return;
            case 1:
                ConstructorPopupLayout constructorPopupLayout = this.b.y;
                constructorPopupLayout.getClass();
                constructorPopupLayout.setHalfScreen((grb) new arb(constructorPopupLayout, 1));
                return;
            case 2:
                this.b.y.p();
                return;
            default:
                ConstructorPopupLayout constructorPopupLayout2 = this.b.y;
                constructorPopupLayout2.getClass();
                constructorPopupLayout2.setHalfScreen((grb) new arb(constructorPopupLayout2, 1));
                return;
        }
    }
}
