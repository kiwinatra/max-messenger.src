package defpackage;

/* renamed from: lq6  reason: default package */
public final class lq6 {
    public volatile long a;
    public volatile long b;
    public final /* synthetic */ mq6 c;

    public lq6(mq6 mq6) {
        this.c = mq6;
    }

    @oye
    public final void onEvent(wa2 wa2) {
        if (wa2.a == this.b) {
            z68.c("mq6", "onEvent " + wa2, new Object[0]);
            this.c.d.R(this.c.c.D(this.a));
        }
    }
}
