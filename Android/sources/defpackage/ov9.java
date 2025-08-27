package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ov9  reason: default package */
public final class ov9 extends qm implements lcf, hdb {
    public static final /* synthetic */ int w0 = 0;
    public final List X;
    public final boolean Y;
    public final String Z;
    public final long o;
    public final long v;
    public final String v0;
    public final long w;
    public final long x;
    public final qe9 y;
    public final List z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ov9(long j, long j2, long j3, long j4, long j5, String str, String str2, qe9 qe9, List list, List list2, boolean z2) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = j5;
        this.y = qe9;
        this.z = list;
        this.X = list2;
        this.Y = z2;
        String str3 = "";
        this.Z = str == null ? str3 : str;
        this.v0 = str2 != null ? str2 : str3;
    }

    public final int b() {
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        fa9 d = rmVar.d();
        long j = this.v;
        ha9 r = d.r(j);
        rm rmVar3 = this.c;
        if (rmVar3 == null) {
            rmVar3 = null;
        }
        r62 c = rmVar3.c();
        long j2 = this.o;
        a32 G = c.G(j2);
        rm rmVar4 = this.c;
        if (rmVar4 == null) {
            rmVar4 = null;
        }
        eef e = rmVar4.e();
        idb idb = idb.TYPE_MSG_EDIT;
        long j3 = this.a;
        for (tdf tdf : e.h(j3, idb)) {
            ov9 ov9 = (ov9) tdf.f;
            if (ov9.o == j2 && ov9.v == j) {
                z68.c("ov9", "onPreExecute: later edit task found, REMOVE", new Object[0]);
                return 3;
            }
        }
        if (r == null || r.Y == qe9.DELETED || G == null || (!G.E() && !G.S())) {
            z68.c("ov9", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        }
        long j4 = this.x;
        if (j4 == 0) {
            z68.c("ov9", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        }
        String str = "onPreExecute: attaches not ready, SKIP";
        boolean z2 = this.Y;
        if (z2 && r.n(g20.c)) {
            w28 w28 = r.x0;
            List<l20> list = w28 != null ? (List) w28.b : null;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            for (l20 l20 : list) {
                if (l20.f()) {
                    x10 x10 = l20.b;
                    String str2 = str;
                    if (x10.y == 0 || !cvg.A(x10.x)) {
                        str = str2;
                    } else {
                        rm rmVar5 = this.c;
                        if (rmVar5 == null) {
                            rmVar5 = null;
                        }
                        if (rmVar5.e().j(j3).c > 20) {
                            z68.c("ov9", "onPreExecute: taskDb.failsCount > 20, REMOVE", new Object[0]);
                            c();
                            return 3;
                        }
                        rm rmVar6 = this.c;
                        if (rmVar6 == null) {
                            rmVar6 = null;
                        }
                        ((jna) rmVar6.a()).K(this.w, CollectionsKt.listOf(Long.valueOf(j4)));
                        rm rmVar7 = this.c;
                        if (rmVar7 != null) {
                            rmVar2 = rmVar7;
                        }
                        rmVar2.e().c(j3);
                        z68.c("ov9", str2, new Object[0]);
                        return 2;
                    }
                } else {
                    str = str;
                }
            }
        }
        String str3 = str;
        if (!z2 || t20.b(r)) {
            return 1;
        }
        z68.c("ov9", str3, new Object[0]);
        return 2;
    }

    public final void c() {
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.e().d(this.a);
        rm rmVar3 = this.c;
        if (rmVar3 == null) {
            rmVar3 = null;
        }
        ha9 r = rmVar3.d().r(this.v);
        if (r != null) {
            rm rmVar4 = this.c;
            if (rmVar4 == null) {
                rmVar4 = null;
            }
            rmVar4.d().z(r, oa9.SENT);
            rm rmVar5 = this.c;
            if (rmVar5 != null) {
                rmVar2 = rmVar5;
            }
            ((sz4) rmVar2.H.getValue()).a(this.v, this.o, this.v0, this.X, this.y, this.z, this.Y);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m20] */
    public final byte[] d() {
        Tasks.MsgEdit msgEdit = new Tasks.MsgEdit();
        msgEdit.requestId = this.a;
        msgEdit.chatId = this.o;
        msgEdit.messageId = this.v;
        msgEdit.chatServerId = this.w;
        msgEdit.messageServerId = this.x;
        msgEdit.text = this.Z;
        msgEdit.oldText = this.v0;
        msgEdit.oldStatus = this.y.a;
        msgEdit.editAttaches = this.Y;
        List list = this.z;
        if (list != null) {
            ? obj = new Object();
            obj.a = list;
            msgEdit.oldAttaches = b.f(obj.c());
        }
        List list2 = this.X;
        if (list2 != null) {
            msgEdit.oldElements = ua9.c(list2);
        }
        return ad9.toByteArray(msgEdit);
    }

    public final void e(ibf ibf) {
        b89 b89;
        pv9 pv9 = (pv9) ibf;
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        fa9 d = rmVar.d();
        long j = this.v;
        ha9 r = d.r(j);
        if (r != null && r.Y != qe9.DELETED && (b89 = pv9.c) != null) {
            rm rmVar3 = this.c;
            if (rmVar3 == null) {
                rmVar3 = null;
            }
            fa9 d2 = rmVar3.d();
            ((OneMeRoomDatabase) ((a74) d2.a).c.a.m()).p(new e6d(1, new gg2(2, d2, b89, r, this)));
            rm rmVar4 = this.c;
            if (rmVar4 == null) {
                rmVar4 = null;
            }
            r62 c = rmVar4.c();
            long j2 = this.o;
            a32 G = c.G(j2);
            if (r.S0.b() && G != null && G.b.j == j) {
                rm rmVar5 = this.c;
                if (rmVar5 == null) {
                    rmVar5 = null;
                }
                rmVar5.c().A(j2);
            }
            rm rmVar6 = this.c;
            if (rmVar6 != null) {
                rmVar2 = rmVar6;
            }
            rmVar2.b().c(new twf(0, this.o, r.b));
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fbf g() {
        /*
            r13 = this;
            rm r0 = r13.c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r0 = r1
        L_0x0007:
            r62 r0 = r0.c()
            long r2 = r13.o
            a32 r0 = r0.G(r2)
            rm r2 = r13.c
            if (r2 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            fa9 r2 = r2.d()
            long r3 = r13.v
            ha9 r2 = r2.r(r3)
            if (r0 == 0) goto L_0x0053
            if (r2 != 0) goto L_0x0026
            goto L_0x0053
        L_0x0026:
            boolean r3 = r13.Y
            if (r3 == 0) goto L_0x0039
            w28 r3 = r2.x0
            a00 r3 = defpackage.qe8.f(r3)
            if (r3 != 0) goto L_0x0037
            a00 r3 = new a00
            r3.<init>()
        L_0x0037:
            r10 = r3
            goto L_0x003a
        L_0x0039:
            r10 = r1
        L_0x003a:
            java.util.List r3 = r2.P0
            if (r3 == 0) goto L_0x0042
            java.util.ArrayList r1 = defpackage.qe8.v(r3)
        L_0x0042:
            r11 = r1
            np2 r1 = new np2
            m72 r0 = r0.b
            long r5 = r0.a
            cl4 r12 = r2.R0
            long r7 = r13.x
            java.lang.String r9 = r13.Z
            r4 = r1
            r4.<init>(r5, r7, r9, r10, r11, r12)
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov9.g():fbf");
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_EDIT;
    }

    public final void h(qaf qaf) {
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        ha9 r = rmVar.d().r(this.v);
        if (r != null && r.Y != qe9.DELETED) {
            if (!m58.A(qaf.b)) {
                if (Intrinsics.areEqual((Object) "attachment.not.ready", (Object) qaf.b)) {
                    rm rmVar3 = this.c;
                    if (rmVar3 == null) {
                        rmVar3 = null;
                    }
                    ((t20) rmVar3.F.getValue()).c(r);
                } else {
                    c();
                    rm rmVar4 = this.c;
                    if (rmVar4 == null) {
                        rmVar4 = null;
                    }
                    rmVar4.b().c(new hj0(this.a, qaf));
                }
            }
            rm rmVar5 = this.c;
            if (rmVar5 != null) {
                rmVar2 = rmVar5;
            }
            rmVar2.b().c(new twf(0, this.o, r.b));
        }
    }
}
