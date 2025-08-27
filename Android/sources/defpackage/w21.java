package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* renamed from: w21  reason: default package */
public final class w21 implements v21 {
    public ko1 a;
    public final Context b;
    public final hn4 c;
    public final cq d;
    public final nd e;
    public final Lazy f;

    public w21(Context context, hn4 hn4, cq cqVar, ltb ltb, nd ndVar, Lazy lazy) {
        new AtomicBoolean();
        new Handler(Looper.getMainLooper(), (Handler.Callback) null);
        this.b = context;
        this.d = cqVar;
        this.e = ndVar;
        this.f = lazy;
        new qae(0);
        this.c = hn4;
        hq hqVar = ltb.c;
    }
}
