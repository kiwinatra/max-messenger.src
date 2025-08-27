package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ts3  reason: default package */
public final class ts3 extends qm implements lcf, hdb {
    public final long o;
    public final int v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public ts3(int i, long j, long j2, String str, String str2, String str3, String str4) {
        super(j);
        this.o = j2;
        this.v = i;
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
    }

    public final byte[] d() {
        Tasks.ContactUpdate contactUpdate = new Tasks.ContactUpdate();
        contactUpdate.requestId = this.a;
        contactUpdate.contactId = this.o;
        String str = this.w;
        if (str != null) {
            contactUpdate.oldName = str;
        }
        String str2 = this.x;
        if (str2 != null) {
            contactUpdate.oldLastName = str2;
        }
        String str3 = this.y;
        if (str3 != null) {
            contactUpdate.newName = str3;
        }
        String str4 = this.z;
        if (str4 != null) {
            contactUpdate.lastName = str4;
        }
        contactUpdate.action = g63.a(this.v);
        return ad9.toByteArray(contactUpdate);
    }

    public final void e(ibf ibf) {
        us3 us3 = (us3) ibf;
        if (us3.c != null) {
            m().D(CollectionsKt.listOf(us3.c));
            ((jna) i()).y(CollectionsKt.listOf(Long.valueOf(us3.c.a)));
        }
        r62 l = l();
        long j = this.o;
        a32 K = l.K(j);
        if (K != null) {
            int y2 = tr1.y(this.v);
            long j2 = K.a;
            if (y2 != 0) {
                m72 m72 = K.b;
                if (y2 == 1) {
                    l().m(j, k72.a);
                    ((jna) i()).l(m72.a);
                    k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j2)), true, false, (bl4) null, (zub) null, 124));
                } else if (y2 == 2 || y2 == 3 || y2 == 4) {
                    ((jna) i()).l(m72.a);
                    k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j2)), true, false, (bl4) null, (zub) null, 124));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                l().m(j, k72.o);
                k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j2)), true, false, (bl4) null, (zub) null, 124));
            }
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 11);
        np2.p(this.o, "contactId");
        int i = this.v;
        if (i != 0) {
            np2.t("action", g63.a(i));
        }
        String str = this.y;
        if (!cvg.A(str)) {
            np2.t("firstName", str);
        }
        String str2 = this.z;
        if (cvg.D(str2)) {
            np2.t("lastName", str2);
        }
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CONTACT_UPDATE;
    }

    public final void h(qaf qaf) {
        boolean A = m58.A(qaf.b);
        long j = this.a;
        if (!A) {
            int y2 = tr1.y(this.v);
            long j2 = this.o;
            if (y2 == 0) {
                km3 m = m();
                m.getClass();
                z68.c("km3", "undo block, id = " + j2, new Object[0]);
                m.g(j2, (sm3) null);
                ((uu3) m.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
                m.g.c(new zu3(j2));
            } else if (y2 == 1) {
                km3 m2 = m();
                m2.getClass();
                z68.c("km3", "undo unblock, id = " + j2, new Object[0]);
                m2.g(j2, sm3.a);
                ((uu3) m2.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
                m2.g.c(new zu3(j2));
            } else if (y2 == 2) {
                km3 m3 = m();
                m3.getClass();
                z68.c("km3", "undo remove, id = " + j2, new Object[0]);
                m3.h(j2, tm3.a, (sm3) null);
                m3.A(j2, false);
                ((uu3) m3.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
                m3.g.c(new zu3(j2));
            } else if (y2 == 3) {
                km3 m4 = m();
                m4.getClass();
                z68.c("km3", "undo add, id = " + j2, new Object[0]);
                m4.h(j2, tm3.b, (sm3) null);
                ((uu3) m4.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
                m4.g.c(new zu3(j2));
            } else if (y2 == 4) {
                km3 m5 = m();
                m5.getClass();
                Long valueOf = Long.valueOf(j2);
                String str = this.w;
                String str2 = this.x;
                z68.c("km3", "undo rename, id = %d => %s %s", valueOf, str, str2);
                m5.e(j2, new im3(str, str2, 0));
                zu3 zu3 = new zu3(j2);
                sv0 sv0 = m5.g;
                sv0.c(zu3);
                ((uu3) m5.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
                sv0.c(new zu3(j2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual((Object) "not.found", (Object) qaf.b)) {
                m().w(j2);
            }
            s().d(j);
        }
        k().c(new hj0(j, qaf));
    }
}
