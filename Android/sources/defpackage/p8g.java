package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: p8g  reason: default package */
public final class p8g {
    public final h5g a = new Object();
    public final Context b;
    public final ys7 c;
    public final rh3 d;
    public final kbf e;
    public final lfd f;
    public final ltb g;
    public final rl h;
    public final gcf i;
    public final nh3 j;
    public final sv0 k;
    public final ln5 l;
    public final int m;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h5g] */
    public p8g(Context context, rh3 rh3, ys7 ys7, jbf jbf, ltb ltb, rl rlVar, gcf gcf, nh3 nh3, sv0 sv0, ln5 ln5) {
        this.b = context;
        this.d = rh3;
        this.c = ys7;
        kbf kbf = (kbf) jbf;
        this.f = kbf.a();
        this.e = kbf;
        this.g = ltb;
        this.h = rlVar;
        this.i = gcf;
        this.j = nh3;
        this.k = sv0;
        this.l = ln5;
        this.m = 30;
    }

    public final boolean a(Throwable th) {
        int i2 = th instanceof FetcherException ? ((FetcherException) th).a : 0;
        if (i2 == 1 || i2 == 7 || i2 == 6 || i2 == 9) {
            return true;
        }
        return !this.d.e();
    }

    public final String b(l20 l20) {
        long j2;
        boolean Y = ld8.Y(l20);
        if (l20.i()) {
            j2 = l20.d.a;
        } else {
            if (Y) {
                j2 = 0;
            }
            return null;
        }
        String str = l20.r;
        if (cvg.A(str)) {
            return null;
        }
        if (cjf.o(new File(str))) {
            return str;
        }
        if (j2 == 0) {
            return null;
        }
        File t = ((po5) this.l).t(j2);
        if (cjf.o(t)) {
            return t.getAbsolutePath();
        }
        return null;
    }

    public final wbe c(l20 l20, long j2, long j3) {
        l20 l202 = l20;
        z68.c("VideoRipper", "getVideoContent chatServerId=%d, messageServerId=%d", Long.valueOf(j2), Long.valueOf(j3));
        k20 k20 = ld8.Y(l20) ? l202.j.d.d : l202.d;
        sh8 sh8 = new sh8(0, new o8g(this, k20, l202));
        k20 k202 = ld8.Y(l20) ? l202.j.d.d : l202.d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        lfd a2 = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        return new hb3(1, sh8, new tbe(new tbe(new cde(new wbe(new mka(1, new ml4(this, l20, j2, j3, k202, 2)), new hxf(17), 0), (long) this.m, timeUnit, a2), new o8g(this, l202, k202), 3), new hzf(7, this, k202), 1)).i(new jrf(10, (Object) k20));
    }
}
