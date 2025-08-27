package defpackage;

/* renamed from: tdg  reason: default package */
public final class tdg implements ng4 {
    public final /* synthetic */ udg a;

    public tdg(udg udg) {
        this.a = udg;
    }

    public final void onStart(jv7 jv7) {
        z68.c("udg", "onStart, owner=" + jv7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
        if (!this.a.k) {
            this.a.k = true;
            if (this.a.l) {
                this.a.b();
            }
        }
    }

    public final void onStop(jv7 jv7) {
        z68.c("udg", "onStop, owner=" + jv7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
        if (this.a.k) {
            this.a.k = false;
            this.a.a();
        }
    }
}
