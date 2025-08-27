package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: tjb  reason: default package */
public final /* synthetic */ class tjb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ tjb(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a0();
                return;
            case 1:
                this.b.a0();
                return;
            default:
                this.b.a0();
                return;
        }
    }
}
