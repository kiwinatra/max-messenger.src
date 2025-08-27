package defpackage;

import android.os.SystemClock;

/* renamed from: kk0  reason: default package */
public final class kk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mk0 b;

    public /* synthetic */ kk0(mk0 mk0, int i) {
        this.a = i;
        this.b = mk0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                mk0 mk0 = this.b;
                if (mk0.o > 0) {
                    SystemClock.uptimeMillis();
                }
                mk0.setVisibility(0);
                return;
            default:
                mk0 mk02 = this.b;
                ((av4) mk02.getCurrentDrawable()).d(false, false, true);
                if ((mk02.getProgressDrawable() == null || !mk02.getProgressDrawable().isVisible()) && (mk02.getIndeterminateDrawable() == null || !mk02.getIndeterminateDrawable().isVisible())) {
                    mk02.setVisibility(4);
                }
                mk02.getClass();
                return;
        }
    }
}
