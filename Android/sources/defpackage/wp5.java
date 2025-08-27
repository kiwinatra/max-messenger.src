package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: wp5  reason: default package */
public final class wp5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq5 b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ zp5 o;

    public /* synthetic */ wp5(bq5 bq5, TextView textView, zp5 zp5, int i) {
        this.a = i;
        this.b = bq5;
        this.c = textView;
        this.o = zp5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                bq5 bq5 = this.b;
                boolean z = bq5.b;
                zp5 zp5 = this.o;
                TextView textView = this.c;
                if (z) {
                    u3b.a(textView, new wp5((View) textView, textView, bq5, zp5));
                    return;
                }
                textView.invalidate();
                zp5.c.set(false);
                return;
            case 1:
                bq5 bq52 = this.b;
                boolean z2 = bq52.b;
                zp5 zp52 = this.o;
                TextView textView2 = this.c;
                if (z2) {
                    u3b.a(textView2, new wp5((View) textView2, textView2, bq52, zp52));
                    return;
                }
                textView2.invalidate();
                zp52.c.set(false);
                return;
            default:
                wgf.c(this.c, this.b);
                this.o.c.set(false);
                return;
        }
    }

    public wp5(View view, TextView textView, bq5 bq5, zp5 zp5) {
        this.a = 2;
        this.c = textView;
        this.b = bq5;
        this.o = zp5;
    }
}
