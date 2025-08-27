package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ht3  reason: default package */
public final class ht3 {
    public final i6d a;
    public final li b;
    public final mi c;
    public final mi d;
    public final mi e;
    public final mi f;
    public final mi g;
    public final mi h;

    public ht3(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 5);
        this.c = new mi(oneMeRoomDatabase, 14);
        this.d = new mi(oneMeRoomDatabase, 15);
        this.e = new mi(oneMeRoomDatabase, 16);
        this.f = new mi(oneMeRoomDatabase, 17);
        this.g = new mi(oneMeRoomDatabase, 18);
        this.h = new mi(oneMeRoomDatabase, 19);
    }

    public static void a(ht3 ht3) {
        i6d i6d = ht3.a;
        i6d.b();
        mi miVar = ht3.e;
        gf6 E = miVar.E();
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            miVar.S(E);
            i6d.b();
            mi miVar2 = ht3.h;
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

    public final void b(String str, String str2, String str3, String str4, String str5, long j) {
        i6d i6d = this.a;
        i6d.b();
        mi miVar = this.f;
        gf6 E = miVar.E();
        E.k(1, j);
        if (str == null) {
            E.X(2);
        } else {
            E.h(2, str);
        }
        if (str2 == null) {
            E.X(3);
        } else {
            E.h(3, str2);
        }
        if (str3 == null) {
            E.X(4);
        } else {
            E.h(4, str3);
        }
        if (str4 == null) {
            E.X(5);
        } else {
            E.h(5, str4);
        }
        if (str5 == null) {
            E.X(6);
        } else {
            E.h(6, str5);
        }
        try {
            i6d.c();
            E.m();
            i6d.r();
            i6d.l();
            miVar.S(E);
        } catch (Throwable th) {
            miVar.S(E);
            throw th;
        }
    }

    public final void c(um3 um3, ConcurrentHashMap concurrentHashMap) {
        long j = um3.a;
        if (um3.j != 0) {
            i6d i6d = this.a;
            i6d.b();
            mi miVar = this.g;
            gf6 E = miVar.E();
            E.k(1, j);
            try {
                i6d.c();
                E.n();
                i6d.r();
                i6d.l();
                miVar.S(E);
            } catch (Throwable th) {
                miVar.S(E);
                throw th;
            }
        } else {
            Object obj = concurrentHashMap.get(Long.valueOf(j));
            List list = um3.f;
            if (!(obj == null ? false : Intrinsics.areEqual(obj, (Object) Integer.valueOf(list.hashCode())))) {
                concurrentHashMap.remove(Long.valueOf(j));
                Regex regex = ti6.a;
                ri6 b2 = ti6.b(list);
                if (b2 != null) {
                    String c2 = hhf.c(um3.p);
                    if (cvg.A(c2)) {
                        c2 = "";
                    }
                    String k = tld.k(c2);
                    String str = null;
                    ri6 ri6 = b2.c;
                    String str2 = ri6 != null ? ri6.a : null;
                    if (ri6 != null) {
                        str = ri6.b;
                    }
                    b(k, b2.a, b2.b, str2, str, j);
                    concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                }
            }
        }
    }
}
