package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: szc  reason: default package */
public final /* synthetic */ class szc implements Runnable {
    public final /* synthetic */ RecyclerView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ Runnable v;

    public /* synthetic */ szc(RecyclerView recyclerView, int i, int i2, Runnable runnable, Runnable runnable2) {
        this.a = recyclerView;
        this.b = i;
        this.c = i2;
        this.o = runnable;
        this.v = runnable2;
    }

    public final void run() {
        kne.d(this.a, this.b + 1, this.c, this.o, this.v);
    }
}
