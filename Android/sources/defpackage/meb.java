package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: meb  reason: default package */
public final class meb implements deb, s98 {
    public final jx3 X;
    public boolean Y;
    public final Context a;
    public final sv0 b;
    public final m95 c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final CopyOnWriteArraySet x = new CopyOnWriteArraySet();
    public final AtomicInteger y;
    public final xme z;

    public meb(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, sv0 sv0, gaf gaf, m95 m95) {
        this.a = context;
        this.b = sv0;
        this.c = m95;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.y = atomicInteger;
        xme a2 = f6e.a(Integer.valueOf(atomicInteger.get()));
        this.z = a2;
        jx3 a3 = e14.a(new y95(((osa) gaf).d().f(1, "phonebook")).plus(new keb(this)));
        this.X = a3;
        d();
        ql8 ql8 = new ql8(a2, 20);
        Duration.Companion companion = Duration.Companion;
        bs0.K(new ps5(gt5.d(ql8, DurationKt.toDuration(5, DurationUnit.SECONDS)), new feb(this, (Continuation) null), 5), a3);
    }

    public static final xdb b(meb meb, xdb xdb, List list) {
        Object obj;
        meb.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) xdb.v, (Object) ((xdb) obj).v)) {
                break;
            }
        }
        return (xdb) obj;
    }

    public final void a() {
        e14.c(this.X, (CancellationException) null);
    }

    public final void c() {
        Object value;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "Phonebook", a81.m("call checkUpdates from: ", ExceptionsKt.stackTraceToString(new RuntimeException())), (Throwable) null);
        }
        xme xme = this.z;
        do {
            value = xme.getValue();
            ((Number) value).intValue();
        } while (!xme.b(value, Integer.valueOf(this.y.incrementAndGet())));
    }

    public final void d() {
        if (!((edb) ((epa) this.v.getValue()).a.getValue()).b(edb.f)) {
            z68.c("Phonebook", "subscribeOnSystemChanges: no permissions, return", new Object[0]);
        } else if (!this.Y) {
            this.Y = true;
            this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new u44(this, new Handler(Looper.getMainLooper())));
        }
    }
}
