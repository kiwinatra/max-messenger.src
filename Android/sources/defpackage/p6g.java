package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p6g  reason: default package */
public final class p6g {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();
    public final n6e c;
    public final ps5 d;

    /* JADX WARNING: type inference failed for: r0v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public p6g(Lazy lazy) {
        n6e a2 = m5a.a(1, 1, cu0.b);
        this.c = a2;
        this.d = new ps5(new kyd(new i21(a2, new kyd(((mp1) ((dp1) lazy.getValue())).K, 11), new t86(3, (Continuation) null, 3), 4), 10), new SuspendLambda(2, (Continuation<Object>) null), 5);
    }

    public final void a(View view, x8g x8g) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            iq4 iq4 = null;
            if (view.isAttachedToWindow()) {
                if (x8g != null) {
                    if (x8g.a) {
                        if (view.getMeasuredWidth() != 0) {
                            if (view.getMeasuredHeight() != 0) {
                                iq4 = new iq4(x8g.b, view.getMeasuredWidth(), view.getMeasuredHeight());
                            }
                        }
                    }
                }
            }
            if (iq4 == null) {
                boolean c2 = c(view);
                int hashCode = hashCode();
                int hashCode2 = view.hashCode();
                int size = linkedHashMap.size();
                z68.c("CallVideoDisplayLayoutUpdater", hashCode + " display layout " + hashCode2 + " is empty, skip. old value from cache was removed = " + c2 + ". total = " + size, new Object[0]);
                return;
            }
            boolean areEqual = Intrinsics.areEqual(linkedHashMap.get(view), (Object) iq4);
            n6e n6e = this.c;
            if (areEqual) {
                int hashCode3 = hashCode();
                int hashCode4 = view.hashCode();
                int size2 = linkedHashMap.size();
                z68.c("CallVideoDisplayLayoutUpdater", hashCode3 + " display layout " + hashCode4 + ", already added with params = " + iq4 + ", simple update. total = " + size2, new Object[0]);
                n6e.d(linkedHashMap);
                reentrantLock.unlock();
                return;
            }
            Map createMapBuilder = MapsKt.createMapBuilder();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), (Object) view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            createMapBuilder.putAll(linkedHashMap2);
            createMapBuilder.put(view, iq4);
            Map build = MapsKt.build(createMapBuilder);
            linkedHashMap.clear();
            linkedHashMap.putAll(build);
            int hashCode5 = hashCode();
            int hashCode6 = view.hashCode();
            int size3 = linkedHashMap.size();
            z68.c("CallVideoDisplayLayoutUpdater", hashCode5 + " add display layout " + hashCode6 + ", params = " + iq4 + ", total = " + size3, new Object[0]);
            n6e.d(build);
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        int hashCode = hashCode();
        z68.c("CallVideoDisplayLayoutUpdater", hashCode + " clear cached states", new Object[0]);
        this.b.clear();
        this.c.d(MapsKt.emptyMap());
    }

    public final boolean c(View view) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            if (!linkedHashMap.containsKey(view)) {
                reentrantLock.unlock();
                return false;
            }
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object obj = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (Intrinsics.areEqual(entry.getKey(), (Object) view)) {
                    obj = entry.getValue();
                }
                if (true ^ Intrinsics.areEqual(entry.getKey(), (Object) view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            createMapBuilder.putAll(linkedHashMap2);
            Map build = MapsKt.build(createMapBuilder);
            linkedHashMap.clear();
            linkedHashMap.putAll(build);
            this.c.d(build);
            int hashCode = hashCode();
            int hashCode2 = view.hashCode();
            int size = linkedHashMap.size();
            z68.c("CallVideoDisplayLayoutUpdater", hashCode + " remove display layout participantId=" + obj + " for " + hashCode2 + ", total = " + size, new Object[0]);
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
