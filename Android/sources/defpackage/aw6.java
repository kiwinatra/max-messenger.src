package defpackage;

/* renamed from: aw6  reason: default package */
public final /* synthetic */ class aw6 implements pq4 {
    public final /* synthetic */ bw6 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ aw6(bw6 bw6, Runnable runnable) {
        this.a = bw6;
        this.b = runnable;
    }

    public final void dispose() {
        this.a.b.removeCallbacks(this.b);
    }
}
