package defpackage;

/* renamed from: qz7  reason: default package */
public final class qz7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz7 b;

    public /* synthetic */ qz7(sz7 sz7, int i) {
        this.a = i;
        this.b = sz7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ax4 ax4 = this.b.c;
                if (ax4 != null) {
                    ax4.setListSelectionHidden(true);
                    ax4.requestLayout();
                    return;
                }
                return;
            default:
                sz7 sz7 = this.b;
                ax4 ax42 = sz7.c;
                if (ax42 != null && ax42.isAttachedToWindow() && sz7.c.getCount() > sz7.c.getChildCount() && sz7.c.getChildCount() <= sz7.v0) {
                    sz7.I0.setInputMethodMode(2);
                    sz7.b();
                    return;
                }
                return;
        }
    }
}
