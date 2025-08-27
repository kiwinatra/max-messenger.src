package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: hm5  reason: default package */
public final class hm5 {
    public static final /* synthetic */ KProperty[] f;
    public static final String g;
    public final Context a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final Lazy e = LazyKt.lazy(new qr3(26));

    static {
        Class<hm5> cls = hm5.class;
        f = new KProperty[]{wj6.p(cls, "fileSystem", "getFileSystem()Lru/ok/tamtam/FileSystem;", 0), wj6.p(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), wj6.p(cls, "dispatcher", "getDispatcher()Lru/ok/tamtam/coroutines/IoDispatcher;", 0), wj6.p(cls, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0)};
        g = cls.getName();
    }

    public hm5(Context context, hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = context;
        this.b = hs7;
        this.c = hs72;
        this.d = hs73;
    }

    public final void a(File file, boolean z) {
        if (file == null) {
            z68.p(g, "file is null!");
            return;
        }
        KProperty kProperty = f[2];
        ev0.v((d14) this.e.getValue(), ((hl7) this.c.get()).a.plus(caa.a), (f14) null, new gm5(file, this, z, (Continuation) null), 2);
    }

    public final void b(File file) {
        try {
            KProperty kProperty = f[3];
            akd akd = (akd) ((bud) this.d.get());
            akd.getClass();
            long j = (long) 1024;
            a(file, ((long) ((int) akd.r(PmsKey.f64maxdownloadedsizefornotifykb, j))) < RangesKt.coerceAtLeast(file.length(), 0) / j);
        } catch (Throwable th) {
            z68.f(g, "notifyWithForegroundCheckAndSize fail!", th);
        }
    }
}
