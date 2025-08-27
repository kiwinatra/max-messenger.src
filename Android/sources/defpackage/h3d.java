package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: h3d  reason: default package */
public final class h3d implements g3d {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final synchronized void a(qa7 qa7, String str, boolean z) {
        if (bg5.a.a(2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            bg5.i("time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(uptimeMillis), str, Long.valueOf(sx6.b(uptimeMillis, (Long) this.b.remove(str))));
        }
    }

    public final synchronized void b(qa7 qa7, Object obj, String str, boolean z) {
        if (bg5.a.a(2)) {
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            Boolean valueOf2 = Boolean.valueOf(z);
            cg5 cg5 = bg5.a;
            if (cg5.a(2)) {
                String.format((Locale) null, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", new Object[]{valueOf, str, obj, valueOf2});
                cg5.getClass();
            }
            this.b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public final synchronized void c(qa7 qa7, String str, Throwable th, boolean z) {
        if (bg5.a.a(5)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            bg5.o("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(uptimeMillis), str, Long.valueOf(sx6.b(uptimeMillis, (Long) this.b.remove(str))), th.toString());
        }
    }

    public final synchronized void d(String str, String str2) {
        if (bg5.a.a(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.a.put(create, Long.valueOf(uptimeMillis));
            bg5.i("time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(uptimeMillis), str, str2);
        }
    }

    public final synchronized void e(String str, String str2) {
        if (bg5.a.a(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            bg5.j("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(uptimeMillis), str, str2, Long.valueOf(sx6.b(uptimeMillis, (Long) this.a.remove(create))), null);
        }
    }

    public final synchronized void f(String str, String str2, boolean z) {
        if (bg5.a.a(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            bg5.j("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(uptimeMillis), str, str2, Long.valueOf(sx6.b(uptimeMillis, (Long) this.a.remove(create))), Boolean.valueOf(z));
        }
    }

    public final synchronized void g(String str) {
        if (bg5.a.a(2)) {
            Pair create = Pair.create(str, "NetworkFetchProducer");
            bg5.j("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(SystemClock.uptimeMillis()), str, "NetworkFetchProducer", "intermediate_result", Long.valueOf(sx6.b(SystemClock.uptimeMillis(), (Long) this.a.get(create))));
        }
    }

    public final boolean h(String str) {
        return bg5.e(2);
    }

    public final synchronized void i(String str, String str2, Map map) {
        if (bg5.a.a(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            bg5.j("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(uptimeMillis), str, str2, Long.valueOf(sx6.b(uptimeMillis, (Long) this.a.remove(create))), map);
        }
    }

    public final synchronized void j(String str, String str2, Throwable th, Map map) {
        if (bg5.a.a(5)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            Object[] objArr = {Long.valueOf(uptimeMillis), str, str2, Long.valueOf(sx6.b(uptimeMillis, (Long) this.a.remove(create))), map, th.toString()};
            cg5 cg5 = bg5.a;
            if (cg5.a(5)) {
                String.format((Locale) null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArr);
                cg5.getClass();
                Log.getStackTraceString(th);
            }
        }
    }

    public final synchronized void k(String str) {
        if (bg5.a.a(2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            bg5.i("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(uptimeMillis), str, Long.valueOf(sx6.b(uptimeMillis, (Long) this.b.remove(str))));
        }
    }
}
