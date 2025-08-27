package defpackage;

import android.widget.TextView;

/* renamed from: yp5  reason: default package */
public final class yp5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ yp5(TextView textView, Runnable runnable, int i) {
        this.a = i;
        this.b = textView;
        this.c = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.removeCallbacks(this.c);
                return;
            default:
                this.b.removeCallbacks(this.c);
                return;
        }
    }
}
