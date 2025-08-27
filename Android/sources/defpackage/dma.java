package defpackage;

/* renamed from: dma  reason: default package */
public final class dma implements zu7, jw1 {
    public final ju7 a;
    public final xla b;
    public ema c;
    public final /* synthetic */ fma o;

    public dma(fma fma, ju7 ju7, xla xla) {
        this.o = fma;
        this.a = ju7;
        this.b = xla;
        ju7.a(this);
    }

    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        ema ema = this.c;
        if (ema != null) {
            ema.cancel();
        }
        this.c = null;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        if (hu7 == hu7.ON_START) {
            this.c = this.o.b(this.b);
        } else if (hu7 == hu7.ON_STOP) {
            ema ema = this.c;
            if (ema != null) {
                ema.cancel();
            }
        } else if (hu7 == hu7.ON_DESTROY) {
            cancel();
        }
    }
}
