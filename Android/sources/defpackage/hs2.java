package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: hs2  reason: default package */
public final class hs2 {
    public final i6d a;
    public final gs2 b;
    public wy2 c;
    public final mi d;
    public final mi e;
    public final mi f;
    public final mi g;
    public final mi h;

    public hs2(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new gs2(this, oneMeRoomDatabase, 0);
        this.d = new mi(oneMeRoomDatabase, 8);
        this.e = new mi(oneMeRoomDatabase, 9);
        this.f = new mi(oneMeRoomDatabase, 10);
        this.g = new mi(oneMeRoomDatabase, 11);
        this.h = new mi(oneMeRoomDatabase, 12);
    }

    public static void b(hs2 hs2) {
        i6d i6d = hs2.a;
        i6d.b();
        mi miVar = hs2.e;
        gf6 E = miVar.E();
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            miVar.S(E);
            i6d.b();
            mi miVar2 = hs2.h;
            gf6 E2 = miVar2.E();
            try {
                i6d.c();
                E2.n();
                i6d.r();
                i6d.l();
                miVar2.S(E2);
            } catch (Throwable th) {
                miVar2.S(E2);
                throw th;
            }
        } catch (Throwable th2) {
            miVar.S(E);
            throw th2;
        }
    }

    public static void c(hs2 hs2, long j) {
        i6d i6d = hs2.a;
        i6d.b();
        mi miVar = hs2.d;
        gf6 E = miVar.E();
        E.k(1, j);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            miVar.S(E);
            i6d.b();
            mi miVar2 = hs2.g;
            gf6 E2 = miVar2.E();
            E2.k(1, j);
            try {
                i6d.c();
                E2.n();
                i6d.r();
                i6d.l();
                miVar2.S(E2);
            } catch (Throwable th) {
                miVar2.S(E2);
                throw th;
            }
        } catch (Throwable th2) {
            miVar.S(E);
            throw th2;
        }
    }

    public final synchronized wy2 a() {
        try {
            if (this.c == null) {
                this.c = (wy2) this.a.l.get(wy2.class);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    /* JADX INFO: finally extract failed */
    public final long d(n82 n82, ConcurrentHashMap concurrentHashMap) {
        ri6 a2;
        i6d i6d = this.a;
        i6d.b();
        i6d.c();
        try {
            long d0 = this.b.d0(n82);
            i6d.r();
            i6d.l();
            Object obj = concurrentHashMap.get(Long.valueOf(d0));
            m72 m72 = n82.c;
            boolean z = false;
            if (!(obj == null ? false : Intrinsics.areEqual(obj, (Object) m72.g))) {
                concurrentHashMap.remove(Long.valueOf(d0));
                String str = m72.g;
                if (str != null) {
                    if (str.length() == 0) {
                        z = true;
                    }
                    String str2 = null;
                    if (z) {
                        str = null;
                    }
                    if (!(str == null || (a2 = ti6.a(str)) == null)) {
                        ri6 ri6 = a2.c;
                        String str3 = ri6 != null ? ri6.a : null;
                        if (ri6 != null) {
                            str2 = ri6.b;
                        }
                        i6d.b();
                        mi miVar = this.f;
                        gf6 E = miVar.E();
                        E.k(1, d0);
                        String str4 = a2.a;
                        if (str4 == null) {
                            E.X(2);
                        } else {
                            E.h(2, str4);
                        }
                        String str5 = a2.b;
                        if (str5 == null) {
                            E.X(3);
                        } else {
                            E.h(3, str5);
                        }
                        if (str3 == null) {
                            E.X(4);
                        } else {
                            E.h(4, str3);
                        }
                        if (str2 == null) {
                            E.X(5);
                        } else {
                            E.h(5, str2);
                        }
                        E.k(6, n82.e);
                        try {
                            i6d.c();
                            E.m();
                            i6d.r();
                            i6d.l();
                            miVar.S(E);
                            String str6 = m72.g;
                            if (str6 != null) {
                                concurrentHashMap.put(Long.valueOf(d0), str6);
                            }
                            z68.c(hs2.class.getName(), "update_fts_title_chat for #" + d0, new Object[0]);
                        } catch (Throwable th) {
                            miVar.S(E);
                            throw th;
                        }
                    }
                }
            }
            return d0;
        } catch (Throwable th2) {
            i6d.l();
            throw th2;
        }
    }

    public final long e(long j) {
        d7d a2 = d7d.a(1, "SELECT id FROM chats WHERE server_id = ?");
        a2.k(1, j);
        i6d i6d = this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.o();
        }
    }
}
