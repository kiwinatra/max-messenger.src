package defpackage;

import ru.ok.messages.constructor.ConstructorPopupLayout;

/* renamed from: gk3  reason: default package */
public final class gk3 extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ ConstructorPopupLayout i;

    public /* synthetic */ gk3(ConstructorPopupLayout constructorPopupLayout, int i2) {
        this.h = i2;
        this.i = constructorPopupLayout;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                this.i.x.setVisibility(4);
                return;
            default:
                this.i.y.setVisibility(4);
                return;
        }
    }
}
