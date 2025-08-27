package defpackage;

/* renamed from: qm8  reason: default package */
public final class qm8 extends pm8 {
    public final /* synthetic */ sy8 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qm8(sy8 sy8) {
        super(sy8);
        this.x = sy8;
    }

    public final ly8 Q() {
        sy8 sy8 = this.x;
        mm8 mm8 = sy8.w;
        if (mm8 == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        } else if (mm8 != sy8.c) {
            return mm8.d;
        } else {
            om8 om8 = (om8) this.b;
            om8.getClass();
            return new ly8(om8.getCurrentBrowserInfo());
        }
    }
}
