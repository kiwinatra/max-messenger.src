package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* renamed from: xof  reason: default package */
public final class xof {
    public final String a;
    public final xe8 b;
    public volatile boolean c;
    public final Context d;
    public final Lazy e;
    public final Lazy f;
    public final ni0 g = new ni0(22);
    public final g93 h;
    public final f7a i;
    public final xga j;
    public final lq8 k;

    public xof(Context context, String str, xe8 xe8) {
        this.a = str;
        this.b = xe8;
        this.d = context.getApplicationContext();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.e = LazyKt.lazy(lazyThreadSafetyMode, new wof(this, 1));
        this.f = LazyKt.lazy(lazyThreadSafetyMode, new wof(this, 0));
        this.h = new g93(context, str);
        this.i = new f7a(context, str);
        this.j = new xga(str);
        this.k = new lq8(context, str);
    }

    public final zof a() {
        return (zof) this.e.getValue();
    }

    public final void b(String str, String str2) {
        if (!this.c) {
            ni0 ni0 = this.g;
            ni0.getClass();
            String take = StringsKt.take(str, 31);
            String take2 = StringsKt.take(str2, 31);
            synchronized (((ConcurrentHashMap) ni0.c)) {
                try {
                    String str3 = (String) ((ConcurrentHashMap) ni0.c).remove(take);
                    if (take2 != null) {
                        ((ConcurrentHashMap) ni0.c).put(take, take2);
                        if (str3 == null && ((ConcurrentHashMap) ni0.c).size() > ni0.b) {
                            ((ConcurrentHashMap) ni0.c).entrySet().iterator().remove();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
