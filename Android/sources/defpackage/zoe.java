package defpackage;

/* renamed from: zoe  reason: default package */
public final /* synthetic */ class zoe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpe b;

    public /* synthetic */ zoe(cpe cpe, int i) {
        this.a = i;
        this.b = cpe;
    }

    public final void run() {
        int width;
        int width2;
        switch (this.a) {
            case 0:
                cpe cpe = this.b;
                int tabCount = cpe.L0.getTabCount() - 1;
                if (tabCount > 0 && (width = cpe.L0.getWidth()) != 0 && (width2 = cpe.O0.getWidth()) != 0 && cpe.L0.getChildCount() != 0 && cpe.L0.getChildAt(0) != null) {
                    int i = width - width2;
                    int i2 = 0;
                    for (int i3 = 0; i3 < tabCount; i3++) {
                        o8f h = cpe.L0.h(i3);
                        if (h != null && (i2 = i2 + h.h.getMeasuredWidth()) > i) {
                            cpe.N0.setVisibility(0);
                            return;
                        }
                    }
                    cpe.N0.setVisibility(8);
                    return;
                }
                return;
            default:
                this.b.M0.setPageTransformer((ybg) null);
                return;
        }
    }
}
