package defpackage;

/* renamed from: kvf  reason: default package */
public final class kvf extends wl0 {
    public final /* synthetic */ lvf a;

    public kvf(lvf lvf) {
        this.a = lvf;
    }

    public final void cancel() {
        if (!this.a.y) {
            this.a.y = true;
            Runnable runnable = (Runnable) this.a.c.getAndSet((Object) null);
            if (runnable != null) {
                runnable.run();
            }
            this.a.x.lazySet((Object) null);
            if (this.a.X.getAndIncrement() == 0) {
                this.a.x.lazySet((Object) null);
                lvf lvf = this.a;
                if (!lvf.Z) {
                    lvf.b.clear();
                }
            }
        }
    }

    public final void clear() {
        this.a.b.clear();
    }

    public final void g(long j) {
        if (tye.d(j)) {
            lvf lvf = this.a;
            h88.c(lvf.Y, j);
            lvf.i();
        }
    }

    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    public final int p(int i) {
        this.a.Z = true;
        return 2;
    }

    public final Object poll() {
        return this.a.b.poll();
    }
}
