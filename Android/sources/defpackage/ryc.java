package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ryc  reason: default package */
public final class ryc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ ryc(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b;
                if (recyclerView.G0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.E0) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.J0) {
                        recyclerView.I0 = true;
                        return;
                    } else {
                        recyclerView.s();
                        return;
                    }
                } else {
                    return;
                }
            default:
                RecyclerView recyclerView2 = this.b;
                yyc yyc = recyclerView2.Y0;
                if (yyc != null) {
                    yyc.p();
                }
                recyclerView2.w1 = false;
                return;
        }
    }
}
