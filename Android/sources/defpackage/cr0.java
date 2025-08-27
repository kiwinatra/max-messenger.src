package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;

/* renamed from: cr0  reason: default package */
public final /* synthetic */ class cr0 implements qk3, ql4, eo1, nsb, p6f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object v;

    public /* synthetic */ cr0(long j, String str, m5 m5Var, jqg jqg) {
        this.a = 0;
        this.o = j;
        this.v = str;
        this.b = m5Var;
        this.c = jqg;
    }

    public Object a() {
        Cursor rawQuery;
        zyf zyf = (zyf) this.v;
        nbd nbd = (nbd) zyf.c;
        nbd.getClass();
        Iterable iterable = (Iterable) this.b;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + nbd.k0(iterable);
            SQLiteDatabase m = nbd.m();
            m.beginTransaction();
            try {
                m.compileStatement(str).execute();
                rawQuery = m.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    nbd.V((long) rawQuery.getInt(0), t78.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                m.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                m.setTransactionSuccessful();
                m.endTransaction();
            } catch (Throwable th) {
                m.endTransaction();
                throw th;
            }
        }
        nbd.o(new dr1(zyf.g.a() + this.o, (tc0) this.c));
        return null;
    }

    public void accept(Object obj) {
        long j = this.o;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.v;
        a32 a32 = (a32) obj;
        switch (this.a) {
            case 0:
                long j2 = a32.a;
                Pattern pattern = hhf.d;
                Pattern pattern2 = nab.a;
                ((jqg) obj3).a(new mvd(new kvd(j2, hhf.d((String) obj4, pattern), false, CollectionsKt.emptyList())));
                q5.U((m5) obj2, j);
                return;
            default:
                qk3 qk3 = (qk3) obj4;
                if (qk3 != null) {
                    qk3.accept(a32);
                }
                m5 m5Var = (m5) obj2;
                bs0.S(a32, m5Var, (jqg) obj3);
                q5.U(m5Var, j);
                return;
        }
    }

    public ScheduledFuture b(u6h u6h) {
        switch (this.a) {
            case 2:
                pl4 pl4 = (pl4) this.v;
                pl4.getClass();
                return pl4.b.schedule(new nl4(pl4, (Runnable) this.b, u6h, 1), this.o, (TimeUnit) this.c);
            default:
                pl4 pl42 = (pl4) this.v;
                pl42.getClass();
                return pl42.b.schedule(new uu0(pl42, (Callable) this.b, u6h, 1), this.o, (TimeUnit) this.c);
        }
    }

    public Object r(do1 do1) {
        zz7 zz7 = (zz7) this.v;
        hd8.N(zz7, do1);
        if (!zz7.isDone()) {
            zz7.d(new rj6(((ScheduledExecutorService) this.b).schedule(new bn5(do1, (go1) zz7), this.o, TimeUnit.MILLISECONDS), 1), ryg.j());
        }
        return "TimeoutFuture[" + zz7 + "]";
    }

    public boolean test(Object obj) {
        nsb nsb;
        AtomicLong atomicLong = (AtomicLong) this.v;
        long j = atomicLong.get();
        long nanoTime = System.nanoTime();
        if (j != 0 && Math.abs(nanoTime - j) <= ((TimeUnit) this.b).toNanos(this.o) && ((nsb = (nsb) this.c) == null || !nsb.test(obj))) {
            return false;
        }
        atomicLong.set(nanoTime);
        return true;
    }

    public /* synthetic */ cr0(go1 go1, ScheduledExecutorService scheduledExecutorService, long j) {
        this.a = 4;
        this.v = go1;
        this.b = scheduledExecutorService;
        this.c = null;
        this.o = j;
    }

    public /* synthetic */ cr0(Object obj, Object obj2, long j, Object obj3, int i) {
        this.a = i;
        this.v = obj;
        this.b = obj2;
        this.o = j;
        this.c = obj3;
    }

    public /* synthetic */ cr0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.v = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = j;
    }
}
