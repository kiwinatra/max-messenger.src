package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: z6d  reason: default package */
public final class z6d {
    public final j6d a;
    public final bjd b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e = LazyKt.lazy(new ifb(17, this));

    public z6d(j6d j6d, bjd bjd, Lazy lazy, Lazy lazy2) {
        this.a = j6d;
        this.b = bjd;
        this.c = lazy;
        this.d = lazy2;
    }

    public static ga9 m(ya9 ya9) {
        ga9 ga9 = new ga9();
        ga9.a = ya9.a;
        ga9.b = ya9.b;
        ga9.c = ya9.c;
        ga9.d = ya9.d;
        ga9.e = ya9.e;
        ga9.f = ya9.f;
        ga9.g = ya9.g;
        ga9.h = ya9.x;
        ga9.i = ya9.h;
        ga9.j = ya9.i;
        ga9.k = ya9.j;
        ga9.l = ya9.k;
        ga9.m = ya9.l;
        ga9.n = ya9.m;
        ga9.o = ya9.n;
        ga9.p = ya9.p;
        ga9.q = ya9.s;
        ga9.s = ya9.t;
        ga9.t = ya9.u;
        ga9.y = ya9.w;
        ga9.x = ya9.v;
        ga9.u = ya9.o;
        ga9.v = ya9.z;
        ga9.w = ya9.A;
        ga9.I = ya9.J;
        ga9.A = ya9.y;
        ga9.B = ya9.B;
        ga9.C = ya9.C;
        ga9.D = ya9.D;
        ga9.E = ya9.E;
        ga9.F = ya9.F;
        ga9.G = ya9.G;
        return ga9;
    }

    public final int a(long j, long j2, bl4 bl4) {
        int i;
        int ordinal = bl4.ordinal();
        if (ordinal == 0) {
            aj9 d2 = d();
            i6d i6d = d2.a;
            i6d.b();
            uf9 uf9 = d2.q;
            gf6 E = uf9.E();
            E.k(1, j);
            E.k(2, j2);
            try {
                i6d.c();
                i = E.n();
                i6d.r();
                i6d.l();
                uf9.S(E);
            } catch (Throwable th) {
                uf9.S(E);
                throw th;
            }
        } else if (ordinal == 1) {
            aj9 d3 = d();
            i6d i6d2 = d3.a;
            i6d2.b();
            uf9 uf92 = d3.r;
            gf6 E2 = uf92.E();
            E2.k(1, j);
            E2.k(2, j2);
            try {
                i6d2.c();
                i = E2.n();
                i6d2.r();
                i6d2.l();
                uf92.S(E2);
            } catch (Throwable th2) {
                uf92.S(E2);
                throw th2;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return i;
    }

    public final ha9 b(ya9 ya9) {
        Boolean bool;
        l20 I;
        q10 q10;
        ga9 m = m(ya9);
        long j = ya9.q;
        cl4 cl4 = null;
        if (j > 0) {
            ya9 c2 = d().c(j);
            m.r = c2 != null ? b(c2) : null;
        }
        w28 w28 = ya9.m;
        long j2 = (w28 == null || (I = w28.I(g20.b)) == null || (q10 = I.c) == null) ? 0 : q10.m;
        if (j2 > 0) {
            ya9 c3 = d().c(j2);
            m.z = c3 != null ? b(c3) : null;
        }
        Long l = ya9.H;
        if (!(l == null || (bool = ya9.I) == null)) {
            cl4 = new cl4(l.longValue(), bool.booleanValue());
        }
        m.H = cl4;
        return m.a();
    }

    public final gaf c() {
        return (gaf) this.c.getValue();
    }

    public final aj9 d() {
        return (aj9) this.e.getValue();
    }

    public final long e(long j, long j2, b89 b89) {
        return ((Number) ((OneMeRoomDatabase) this.a.m()).p(new p6d(this, j, b89, j2))).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(long r90, long r92, defpackage.b89 r94, boolean r95) {
        /*
            r89 = this;
            r0 = r89
            r14 = r90
            r11 = r94
            aj9 r1 = r89.d()
            long r2 = r11.a
            java.lang.Long r1 = r1.i(r14, r2)
            r8 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0016
            r9 = r8
            goto L_0x0017
        L_0x0016:
            r9 = r12
        L_0x0017:
            long r1 = r11.w
            r16 = 0
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r10 = 0
            if (r3 == 0) goto L_0x0066
            long r3 = r11.o
            int r3 = (r92 > r3 ? 1 : (r92 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            aj9 r3 = r89.d()
            r3.getClass()
            java.lang.String r4 = "SELECT id FROM messages WHERE chat_id = ? AND cid = ?"
            r5 = 2
            d7d r4 = defpackage.d7d.a(r5, r4)
            r4.k(r8, r14)
            r4.k(r5, r1)
            i6d r1 = r3.a
            r1.b()
            android.database.Cursor r1 = r1.o(r4, r10)
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x004f
            boolean r2 = r1.isNull(r12)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0051
        L_0x004f:
            r2 = r10
            goto L_0x005c
        L_0x0051:
            long r2 = r1.getLong(r12)     // Catch:{ all -> 0x005a }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r0 = move-exception
            goto L_0x0068
        L_0x005c:
            r1.close()
            r4.o()
            if (r2 == 0) goto L_0x0066
            r13 = r8
            goto L_0x006f
        L_0x0066:
            r13 = r12
            goto L_0x006f
        L_0x0068:
            r1.close()
            r4.o()
            throw r0
        L_0x006f:
            lc9 r7 = r11.z
            if (r7 == 0) goto L_0x0087
            b89 r6 = r7.c
            r18 = 1
            r1 = r89
            r2 = r90
            r4 = r92
            r10 = r7
            r7 = r18
            long r1 = r1.f(r2, r4, r6, r7)
            r20 = r1
            goto L_0x008a
        L_0x0087:
            r10 = r7
            r20 = r16
        L_0x008a:
            a00 r1 = r11.y
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a4
            java.lang.Object r2 = r1.get(r12)
            boolean r2 = r2 instanceof defpackage.ox3
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r1 = r1.get(r12)
            ox3 r1 = (defpackage.ox3) r1
            b89 r1 = r1.y0
            r7 = r1
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            if (r7 == 0) goto L_0x00be
            r18 = 1
            r1 = r89
            r2 = r90
            r4 = r92
            r6 = r7
            r12 = r7
            r7 = r18
            long r1 = r1.f(r2, r4, r6, r7)
            long r3 = r12.a
            r25 = r1
            r27 = r3
            goto L_0x00c2
        L_0x00be:
            r25 = r16
            r27 = r25
        L_0x00c2:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r9 != 0) goto L_0x01d0
            if (r13 != 0) goto L_0x01d0
            oa9 r37 = defpackage.oa9.SENT
            h6 r1 = new h6
            r2 = 6
            r1.<init>(r2, r12)
            if (r10 == 0) goto L_0x00f0
            int r2 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            r2 = 3
            int r3 = r10.a
            if (r3 != r2) goto L_0x00f0
            b89 r1 = r10.c
            a00 r2 = r1.y
            bjd r3 = r0.b
            r4 = 0
            r6 = 0
            r8 = 0
            w28 r1 = defpackage.qe8.h(r2, r3, r4, r6, r8)
        L_0x00ed:
            r38 = r1
            goto L_0x00ff
        L_0x00f0:
            a00 r2 = r11.y
            bjd r3 = r0.b
            r23 = r2
            r24 = r3
            r29 = r1
            w28 r1 = defpackage.qe8.h(r23, r24, r25, r27, r29)
            goto L_0x00ed
        L_0x00ff:
            re9 r1 = r11.v
            qe9 r10 = defpackage.qe8.q(r1)
            r8 = 0
            r1 = r89
            r2 = r90
            r4 = r94
            r5 = r20
            r7 = r95
            id9 r13 = r1.i(r2, r4, r5, r7, r8, r10)
            int r40 = defpackage.qe8.c(r38)
            pe9 r1 = r11.Y
            if (r1 == 0) goto L_0x0122
            int r2 = r1.a
            r41 = r2
            goto L_0x0124
        L_0x0122:
            r41 = 0
        L_0x0124:
            if (r1 == 0) goto L_0x012b
            int r1 = r1.b
            r52 = r1
            goto L_0x012d
        L_0x012b:
            r52 = 0
        L_0x012d:
            ya9 r10 = new ya9
            r1 = r10
            java.lang.Long r2 = r13.x
            r50 = r2
            java.lang.Boolean r2 = r13.y
            r51 = r2
            long r2 = r13.a
            long r4 = r13.b
            long r6 = r13.c
            long r8 = r13.e
            r92 = r10
            long r10 = r13.f
            r0 = r92
            long r14 = r13.g
            r53 = r12
            r0 = r13
            r12 = r14
            java.lang.String r14 = r0.h
            qe9 r15 = r0.q
            r16 = r15
            r17 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            int r15 = r0.k
            r24 = r15
            r93 = r1
            r94 = r2
            long r1 = r0.l
            r25 = r1
            boolean r1 = r0.m
            r27 = r1
            long r1 = r0.n
            r28 = r1
            java.lang.String r1 = r0.o
            r30 = r1
            java.lang.String r1 = r0.p
            r31 = r1
            r32 = 0
            r34 = 0
            int r1 = r0.r
            r36 = r1
            int r1 = r0.s
            r39 = r1
            long r1 = r0.t
            r42 = r1
            int r1 = r0.u
            r44 = r1
            int r1 = r0.v
            r45 = r1
            long r1 = r0.w
            r46 = r1
            java.util.List r1 = r0.i
            r48 = r1
            xd9 r0 = r0.j
            r49 = r0
            r15 = r37
            r21 = r38
            r22 = r40
            r37 = r90
            r40 = r41
            r41 = r52
            r1 = r93
            r2 = r94
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r34, r36, r37, r39, r40, r41, r42, r44, r45, r46, r48, r49, r50, r51)
            aj9 r0 = r89.d()
            r1 = r92
            long r0 = r0.f(r1)
            java.util.Iterator r2 = r53.iterator()
        L_0x01bb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01cf
            java.lang.Object r3 = r2.next()
            v5b r3 = (defpackage.v5b) r3
            r10 = r89
            r14 = r90
            r10.g(r3, r14)
            goto L_0x01bb
        L_0x01cf:
            return r0
        L_0x01d0:
            r10 = r0
            if (r9 == 0) goto L_0x01e1
            r1 = r89
            r2 = r90
            r4 = r20
            r6 = r94
            r7 = r95
            r1.p(r2, r4, r6, r7)
            goto L_0x01f1
        L_0x01e1:
            if (r13 == 0) goto L_0x01f1
            cd4 r0 = defpackage.oa9.b
            r6 = 0
            r1 = r89
            r2 = r94
            r3 = r90
            r5 = r95
            r1.o(r2, r3, r5, r6)
        L_0x01f1:
            aj9 r0 = r89.d()
            long r1 = r11.a
            ya9 r0 = r0.b(r14, r1)
            if (r0 == 0) goto L_0x0202
            ha9 r0 = r10.b(r0)
            goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            if (r0 == 0) goto L_0x0225
            ra2 r1 = new ra2
            r1.<init>(r10, r14, r8)
            a00 r2 = r11.y
            bjd r3 = r10.b
            r23 = r2
            r24 = r3
            r29 = r1
            w28 r1 = defpackage.qe8.h(r23, r24, r25, r27, r29)
            ca9 r2 = new ca9
            r3 = r95
            r2.<init>((defpackage.ha9) r0, (defpackage.w28) r1, (boolean) r3)
            long r0 = r0.b
            r10.n(r0, r2)
            return r0
        L_0x0225:
            aj9 r0 = r89.d()
            r0.getClass()
            java.lang.String r3 = "SELECT * FROM messages WHERE server_id = ?"
            d7d r3 = defpackage.d7d.a(r8, r3)
            r3.k(r8, r1)
            i6d r1 = r0.a
            r1.b()
            r2 = 0
            android.database.Cursor r1 = r1.o(r3, r2)
            java.lang.String r4 = "id"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x04fc }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x04fc }
            java.lang.String r6 = "time"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x04fc }
            java.lang.String r7 = "update_time"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x04fc }
            java.lang.String r9 = "sender"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x04fc }
            java.lang.String r10 = "cid"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x04fc }
            java.lang.String r11 = "text"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x04fc }
            java.lang.String r12 = "delivery_status"
            int r12 = defpackage.kne.u(r1, r12)     // Catch:{ all -> 0x04fc }
            java.lang.String r13 = "status"
            int r13 = defpackage.kne.u(r1, r13)     // Catch:{ all -> 0x04fc }
            java.lang.String r14 = "time_local"
            int r14 = defpackage.kne.u(r1, r14)     // Catch:{ all -> 0x04fc }
            java.lang.String r15 = "error"
            int r15 = defpackage.kne.u(r1, r15)     // Catch:{ all -> 0x04fc }
            java.lang.String r2 = "localized_error"
            int r2 = defpackage.kne.u(r1, r2)     // Catch:{ all -> 0x04fc }
            java.lang.String r8 = "attaches"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x04fc }
            r89 = r3
            java.lang.String r3 = "media_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r90 = r3
            java.lang.String r3 = "detect_share"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r91 = r3
            java.lang.String r3 = "msg_link_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r92 = r3
            java.lang.String r3 = "msg_link_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r93 = r3
            java.lang.String r3 = "inserted_from_msg_link"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r94 = r3
            java.lang.String r3 = "msg_link_chat_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r95 = r3
            java.lang.String r3 = "msg_link_chat_name"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r20 = r3
            java.lang.String r3 = "msg_link_chat_link"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r21 = r3
            java.lang.String r3 = "msg_link_out_chat_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r23 = r3
            java.lang.String r3 = "msg_link_out_msg_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r24 = r3
            java.lang.String r3 = "type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r25 = r3
            java.lang.String r3 = "chat_id"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r26 = r3
            java.lang.String r3 = "ttl"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r27 = r3
            java.lang.String r3 = "channel_views"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r28 = r3
            java.lang.String r3 = "channel_forwards"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r29 = r3
            java.lang.String r3 = "view_time"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r30 = r3
            java.lang.String r3 = "zoom"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r31 = r3
            java.lang.String r3 = "options"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r32 = r3
            java.lang.String r3 = "live_until"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r33 = r3
            java.lang.String r3 = "elements"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r34 = r3
            java.lang.String r3 = "reactions"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r35 = r3
            java.lang.String r3 = "delayed_attrs_time_to_fire"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            r36 = r3
            java.lang.String r3 = "delayed_attrs_notify_sender"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x04ec }
            boolean r37 = r1.moveToFirst()     // Catch:{ all -> 0x04ec }
            if (r37 == 0) goto L_0x04ee
            long r39 = r1.getLong(r4)     // Catch:{ all -> 0x04ec }
            long r41 = r1.getLong(r5)     // Catch:{ all -> 0x04ec }
            long r43 = r1.getLong(r6)     // Catch:{ all -> 0x04ec }
            long r45 = r1.getLong(r7)     // Catch:{ all -> 0x04ec }
            long r47 = r1.getLong(r9)     // Catch:{ all -> 0x04ec }
            long r49 = r1.getLong(r10)     // Catch:{ all -> 0x04ec }
            boolean r4 = r1.isNull(r11)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x036c
            r51 = 0
            goto L_0x0372
        L_0x036c:
            java.lang.String r4 = r1.getString(r11)     // Catch:{ all -> 0x04ec }
            r51 = r4
        L_0x0372:
            int r4 = r1.getInt(r12)     // Catch:{ all -> 0x04ec }
            hp9 r5 = r0.a()     // Catch:{ all -> 0x04ec }
            r5.getClass()     // Catch:{ all -> 0x04ec }
            cd4 r5 = defpackage.oa9.b     // Catch:{ all -> 0x04ec }
            r5.getClass()     // Catch:{ all -> 0x04ec }
            oa9 r52 = defpackage.cd4.n(r4)     // Catch:{ all -> 0x04ec }
            int r4 = r1.getInt(r13)     // Catch:{ all -> 0x04ec }
            hp9 r5 = r0.a()     // Catch:{ all -> 0x04ec }
            r5.getClass()     // Catch:{ all -> 0x04ec }
            sq6 r5 = defpackage.qe9.b     // Catch:{ all -> 0x04ec }
            r5.getClass()     // Catch:{ all -> 0x04ec }
            qe9 r53 = defpackage.sq6.D(r4)     // Catch:{ all -> 0x04ec }
            long r54 = r1.getLong(r14)     // Catch:{ all -> 0x04ec }
            boolean r4 = r1.isNull(r15)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x03a7
            r56 = 0
            goto L_0x03ad
        L_0x03a7:
            java.lang.String r4 = r1.getString(r15)     // Catch:{ all -> 0x04ec }
            r56 = r4
        L_0x03ad:
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x03b6
            r57 = 0
            goto L_0x03bc
        L_0x03b6:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04ec }
            r57 = r2
        L_0x03bc:
            boolean r2 = r1.isNull(r8)     // Catch:{ all -> 0x04ec }
            if (r2 == 0) goto L_0x03c4
            r2 = 0
            goto L_0x03c8
        L_0x03c4:
            byte[] r2 = r1.getBlob(r8)     // Catch:{ all -> 0x04ec }
        L_0x03c8:
            hp9 r4 = r0.a()     // Catch:{ all -> 0x04ec }
            r4.getClass()     // Catch:{ all -> 0x04ec }
            w28 r58 = defpackage.qe8.b(r2)     // Catch:{ all -> 0x04ec }
            r2 = r90
            int r59 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r91
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            if (r2 == 0) goto L_0x03e6
            r2 = r92
            r60 = 1
            goto L_0x03ea
        L_0x03e6:
            r2 = r92
            r60 = 0
        L_0x03ea:
            int r61 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r93
            long r62 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r94
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            if (r2 == 0) goto L_0x0401
            r2 = r95
            r64 = 1
            goto L_0x0405
        L_0x0401:
            r2 = r95
            r64 = 0
        L_0x0405:
            long r65 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r20
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x0416
            r2 = r21
            r67 = 0
            goto L_0x041e
        L_0x0416:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04ec }
            r67 = r2
            r2 = r21
        L_0x041e:
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x0429
            r2 = r23
            r68 = 0
            goto L_0x0431
        L_0x0429:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04ec }
            r68 = r2
            r2 = r23
        L_0x0431:
            long r69 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r24
            long r71 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r25
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            hp9 r4 = r0.a()     // Catch:{ all -> 0x04ec }
            r4.getClass()     // Catch:{ all -> 0x04ec }
            int r73 = defpackage.wj6.c(r2)     // Catch:{ all -> 0x04ec }
            r2 = r26
            long r74 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r27
            int r76 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r28
            int r77 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r29
            int r78 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r30
            long r79 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r31
            int r81 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r32
            int r82 = r1.getInt(r2)     // Catch:{ all -> 0x04ec }
            r2 = r33
            long r83 = r1.getLong(r2)     // Catch:{ all -> 0x04ec }
            r2 = r34
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x0486
            r2 = 0
            goto L_0x048a
        L_0x0486:
            byte[] r2 = r1.getBlob(r2)     // Catch:{ all -> 0x04ec }
        L_0x048a:
            hp9 r4 = r0.a()     // Catch:{ all -> 0x04ec }
            r4.getClass()     // Catch:{ all -> 0x04ec }
            java.util.List r85 = defpackage.hp9.a(r2)     // Catch:{ all -> 0x04ec }
            r2 = r35
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04ec }
            if (r4 == 0) goto L_0x049f
            r2 = 0
            goto L_0x04a3
        L_0x049f:
            byte[] r2 = r1.getBlob(r2)     // Catch:{ all -> 0x04ec }
        L_0x04a3:
            hp9 r0 = r0.a()     // Catch:{ all -> 0x04ec }
            xd9 r86 = r0.b(r2)     // Catch:{ all -> 0x04ec }
            r0 = r36
            boolean r2 = r1.isNull(r0)     // Catch:{ all -> 0x04ec }
            if (r2 == 0) goto L_0x04b6
            r87 = 0
            goto L_0x04c0
        L_0x04b6:
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04ec }
            r87 = r0
        L_0x04c0:
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x04c8
            r0 = 0
            goto L_0x04d0
        L_0x04c8:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x04ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04ec }
        L_0x04d0:
            if (r0 != 0) goto L_0x04d5
            r88 = 0
            goto L_0x04e4
        L_0x04d5:
            int r0 = r0.intValue()     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x04dd
            r8 = 1
            goto L_0x04de
        L_0x04dd:
            r8 = 0
        L_0x04de:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04ec }
            r88 = r10
        L_0x04e4:
            ya9 r10 = new ya9     // Catch:{ all -> 0x04ec }
            r38 = r10
            r38.<init>(r39, r41, r43, r45, r47, r49, r51, r52, r53, r54, r56, r57, r58, r59, r60, r61, r62, r64, r65, r67, r68, r69, r71, r73, r74, r76, r77, r78, r79, r81, r82, r83, r85, r86, r87, r88)     // Catch:{ all -> 0x04ec }
            goto L_0x04ef
        L_0x04ec:
            r0 = move-exception
            goto L_0x04ff
        L_0x04ee:
            r10 = 0
        L_0x04ef:
            r1.close()
            r89.o()
            if (r10 == 0) goto L_0x04fb
            long r0 = r10.a
            r16 = r0
        L_0x04fb:
            return r16
        L_0x04fc:
            r0 = move-exception
            r89 = r3
        L_0x04ff:
            r1.close()
            r89.o()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6d.f(long, long, b89, boolean):long");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m20] */
    public final void g(v5b v5b, long j) {
        v5b v5b2 = v5b;
        long j2 = v5b2.a;
        w28 c2 = new Object().c();
        bk3 bk3 = bl4.o;
        List emptyList = CollectionsKt.emptyList();
        int c3 = qe8.c(c2);
        ya9 ya9 = new ya9(0, 0, 0, 0, 0, j2, v5b2.b, oa9.SENDING, qe9.ACTIVE, 0, (String) null, (String) null, c2, c3, v5b2.e, 0, 0, false, 0, (String) null, (String) null, 0, 0, 1, j, v5b2.f, 0, 0, 0, 0, 0, 0, emptyList, (xd9) null, (Long) null, (Boolean) null);
        d().f(ya9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        r11 = r11.I;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.ya9 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.t6d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            t6d r0 = (defpackage.t6d) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            t6d r0 = new t6d
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r6) goto L_0x0043
            if (r2 != r5) goto L_0x003b
            ga9 r10 = r0.o
            ga9 r11 = r0.c
            java.lang.Object r1 = r0.b
            ga9 r1 = (defpackage.ga9) r1
            java.lang.Object r0 = r0.a
            ya9 r0 = (defpackage.ya9) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b1
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0043:
            ga9 r10 = r0.o
            ga9 r11 = r0.c
            java.lang.Object r2 = r0.b
            ya9 r2 = (defpackage.ya9) r2
            java.lang.Object r6 = r0.a
            z6d r6 = (defpackage.z6d) r6
            kotlin.ResultKt.throwOnFailure(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x0077
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r12)
            ga9 r12 = m(r11)
            long r7 = r11.q
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007f
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.o = r12
            r0.x = r6
            java.lang.Object r2 = r10.k(r7, r0)
            if (r2 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r10
            r10 = r12
        L_0x0077:
            ha9 r2 = (defpackage.ha9) r2
            r10.r = r2
            r2 = r12
            r12 = r10
            r10 = r6
            goto L_0x0080
        L_0x007f:
            r2 = r12
        L_0x0080:
            r10.getClass()
            w28 r6 = r11.m
            if (r6 == 0) goto L_0x0096
            g20 r7 = defpackage.g20.b
            l20 r6 = r6.I(r7)
            if (r6 == 0) goto L_0x0096
            q10 r6 = r6.c
            if (r6 == 0) goto L_0x0096
            long r6 = r6.m
            goto L_0x0097
        L_0x0096:
            r6 = r3
        L_0x0097:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b8
            r0.a = r11
            r0.b = r2
            r0.c = r12
            r0.o = r12
            r0.x = r5
            java.lang.Object r10 = r10.k(r6, r0)
            if (r10 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r0 = r11
            r11 = r12
            r1 = r2
            r12 = r10
            r10 = r11
        L_0x00b1:
            ha9 r12 = (defpackage.ha9) r12
            r10.z = r12
            r12 = r11
            r11 = r0
            r2 = r1
        L_0x00b8:
            java.lang.Long r10 = r11.H
            if (r10 == 0) goto L_0x00ce
            java.lang.Boolean r11 = r11.I
            if (r11 == 0) goto L_0x00ce
            cl4 r0 = new cl4
            long r3 = r10.longValue()
            boolean r10 = r11.booleanValue()
            r0.<init>(r3, r10)
            goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            r12.H = r0
            ha9 r10 = r2.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6d.h(ya9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.id9 i(long r44, defpackage.b89 r46, long r47, boolean r49, long r50, defpackage.qe9 r52) {
        /*
            r43 = this;
            r0 = r46
            lc9 r1 = r0.z
            r2 = 3
            r3 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0021
            int r6 = (r47 > r3 ? 1 : (r47 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0021
            int r6 = r1.a
            if (r6 != r2) goto L_0x0021
            b89 r6 = r1.c
            java.lang.String r7 = r6.x
            java.util.List r6 = r6.A0
            java.util.ArrayList r6 = defpackage.qe8.u(r6)
            r22 = r6
            r21 = r7
            goto L_0x0039
        L_0x0021:
            java.lang.String r6 = r0.x
            if (r6 == 0) goto L_0x002e
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r6)
            java.lang.String r6 = r6.toString()
            goto L_0x002f
        L_0x002e:
            r6 = r5
        L_0x002f:
            java.util.List r7 = r0.A0
            java.util.ArrayList r7 = defpackage.qe8.u(r7)
            r21 = r6
            r22 = r7
        L_0x0039:
            r6 = 2
            r7 = 1
            mf9 r8 = r0.X
            if (r8 != 0) goto L_0x0042
        L_0x003f:
            r33 = r6
            goto L_0x0058
        L_0x0042:
            int r8 = r8.ordinal()
            if (r8 == r7) goto L_0x003f
            if (r8 == r6) goto L_0x0053
            r9 = 4
            if (r8 == r2) goto L_0x0056
            if (r8 == r9) goto L_0x0052
            r33 = r7
            goto L_0x0058
        L_0x0052:
            r2 = 5
        L_0x0053:
            r33 = r2
            goto L_0x0058
        L_0x0056:
            r33 = r9
        L_0x0058:
            if (r52 != 0) goto L_0x0063
            re9 r2 = r0.v
            qe9 r2 = defpackage.qe8.q(r2)
            r32 = r2
            goto L_0x0065
        L_0x0063:
            r32 = r52
        L_0x0065:
            ud9 r8 = r0.C0
            if (r8 == 0) goto L_0x00ba
            r9 = r43
            kotlin.Lazy r9 = r9.d
            java.lang.Object r9 = r9.getValue()
            yd9 r9 = (defpackage.yd9) r9
            java.util.List r10 = r8.a
            int r11 = r10.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r11 <= 0) goto L_0x00b6
            r13 = 0
        L_0x0081:
            if (r13 >= r11) goto L_0x00a4
            java.lang.Object r14 = r10.get(r13)
            pd9 r14 = (defpackage.pd9) r14
            nd9 r14 = r14.a
            wd9 r15 = new wd9
            qqc r14 = r9.d(r14)
            java.lang.Object r16 = r10.get(r13)
            r2 = r16
            pd9 r2 = (defpackage.pd9) r2
            int r2 = r2.b
            r15.<init>(r14, r2)
            r12.add(r15)
            int r13 = r13 + 1
            goto L_0x0081
        L_0x00a4:
            xd9 r2 = new xd9
            nd9 r10 = r8.c
            if (r10 != 0) goto L_0x00ac
            r9 = r5
            goto L_0x00b0
        L_0x00ac:
            qqc r9 = r9.d(r10)
        L_0x00b0:
            int r8 = r8.b
            r2.<init>(r12, r8, r9)
            goto L_0x00b7
        L_0x00b6:
            r2 = r5
        L_0x00b7:
            r23 = r2
            goto L_0x00bc
        L_0x00ba:
            r23 = r5
        L_0x00bc:
            if (r1 == 0) goto L_0x00c1
            int r2 = r1.a
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 != 0) goto L_0x00c7
        L_0x00c4:
            r24 = 0
            goto L_0x00d5
        L_0x00c7:
            int r2 = defpackage.tr1.y(r2)
            if (r2 == r7) goto L_0x00d3
            if (r2 == r6) goto L_0x00d0
            goto L_0x00c4
        L_0x00d0:
            r24 = r6
            goto L_0x00d5
        L_0x00d3:
            r24 = r7
        L_0x00d5:
            if (r1 == 0) goto L_0x00d9
            long r3 = r1.b
        L_0x00d9:
            r28 = r3
            if (r1 == 0) goto L_0x00e2
            java.lang.String r2 = r1.o
            r30 = r2
            goto L_0x00e4
        L_0x00e2:
            r30 = r5
        L_0x00e4:
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = r1.v
            r31 = r1
            goto L_0x00ed
        L_0x00eb:
            r31 = r5
        L_0x00ed:
            cl4 r1 = r0.B0
            if (r1 == 0) goto L_0x00fa
            long r2 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r41 = r2
            goto L_0x00fc
        L_0x00fa:
            r41 = r5
        L_0x00fc:
            if (r1 == 0) goto L_0x0104
            boolean r1 = r1.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L_0x0104:
            r42 = r5
            id9 r1 = new id9
            r6 = r1
            int r2 = r0.x0
            r38 = r2
            long r2 = r0.y0
            r39 = r2
            long r9 = r0.a
            long r11 = r0.b
            long r2 = r0.c
            r15 = r2
            long r2 = r0.o
            r17 = r2
            long r2 = r0.w
            r19 = r2
            int r2 = r0.Z
            r34 = r2
            long r2 = r0.v0
            r35 = r2
            int r0 = r0.w0
            r37 = r0
            r7 = r50
            r13 = r44
            r25 = r47
            r27 = r49
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r41, r42)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6d.i(long, b89, long, boolean, long, qe9):id9");
    }

    public final Object j(long j, long j2, Continuation continuation) {
        return ev0.I(((osa) c()).b(), new w6d(this, j, j2, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.y6d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            y6d r0 = (defpackage.y6d) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            y6d r0 = new y6d
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x003a
            if (r2 == r3) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0075
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            z6d r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0065
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r8)
            aj9 r8 = r5.d()
            r0.a = r5
            r0.o = r3
            r8.getClass()
            java.lang.String r2 = "SELECT * FROM messages WHERE id = ?"
            d7d r2 = defpackage.d7d.a(r3, r2)
            r2.k(r3, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            yi9 r7 = new yi9
            r3 = 0
            r7.<init>(r8, r2, r3)
            i6d r8 = r8.a
            java.lang.Object r8 = defpackage.i8b.q(r8, r6, r7, r0)
            if (r8 != r1) goto L_0x0065
            return r1
        L_0x0065:
            ya9 r8 = (defpackage.ya9) r8
            r6 = 0
            if (r8 == 0) goto L_0x0078
            r0.a = r6
            r0.o = r4
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r8
            ha9 r6 = (defpackage.ha9) r6
        L_0x0078:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6d.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList l(long j, long j2, Set set, Integer num, boolean z) {
        ArrayList<ya9> arrayList;
        d7d d7d;
        String str;
        int i;
        boolean z2;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        String str4;
        String str5;
        d7d d7d2;
        String str6;
        int i8;
        boolean z3;
        int i9;
        String str7;
        int i10;
        String str8;
        int i11;
        int i12;
        int i13;
        byte[] bArr2;
        Long l2;
        int i14;
        Boolean bool2;
        String str9;
        String str10;
        long j3 = j2;
        aj9 d2 = d();
        List<Long> list = CollectionsKt.toList(CollectionsKt.listOf(Long.valueOf(j)));
        int intValue = num != null ? num.intValue() : IntCompanionObject.MAX_VALUE;
        i6d i6d = d2.a;
        String str11 = "delayed_attrs_notify_sender";
        String str12 = "delayed_attrs_time_to_fire";
        String str13 = "reactions";
        String str14 = "elements";
        String str15 = "live_until";
        String str16 = "options";
        String str17 = "zoom";
        String str18 = "view_time";
        String str19 = "channel_forwards";
        String str20 = "channel_views";
        String str21 = "ttl";
        String str22 = "chat_id";
        String str23 = "type";
        String str24 = "msg_link_out_msg_id";
        String str25 = "msg_link_out_chat_id";
        String str26 = "msg_link_chat_link";
        String str27 = "msg_link_chat_name";
        String str28 = "msg_link_chat_id";
        String str29 = "inserted_from_msg_link";
        String str30 = "msg_link_id";
        String str31 = "msg_link_type";
        String str32 = "detect_share";
        String str33 = "media_type";
        String str34 = "update_time";
        String str35 = "attaches";
        String str36 = "time";
        String str37 = "localized_error";
        String str38 = "error";
        String str39 = "time_local";
        String str40 = "status";
        String str41 = "delivery_status";
        if (z) {
            sq6 sq6 = qe9.b;
            String str42 = "text";
            StringBuilder o = tr1.o("SELECT * FROM messages WHERE chat_id in (");
            String str43 = "cid";
            int size = list.size();
            n79.c(o, size);
            o.append(") AND media_type in (");
            int size2 = set.size();
            n79.c(o, size2);
            String str44 = "sender";
            o.append(") AND time <= ");
            o.append("?");
            o.append(" AND inserted_from_msg_link = 0 AND status <> ");
            int i15 = size + 3 + size2;
            d7d a2 = d7d.a(i15, rae.q(o, "?", " ORDER BY time DESC LIMIT ", "?"));
            int i16 = 1;
            for (Long l3 : list) {
                if (l3 == null) {
                    a2.X(i16);
                    str9 = str34;
                    str10 = str36;
                } else {
                    str9 = str34;
                    str10 = str36;
                    a2.k(i16, l3.longValue());
                }
                i16++;
                str34 = str9;
                str36 = str10;
            }
            String str45 = str34;
            String str46 = str36;
            int i17 = size + 1;
            Iterator it = set.iterator();
            int i18 = i17;
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                if (num2 == null) {
                    a2.X(i18);
                } else {
                    a2.k(i18, (long) num2.intValue());
                }
                i18++;
            }
            a2.k(i17 + size2, j3);
            d2.a().getClass();
            a2.k(size + 2 + size2, (long) 10);
            a2.k(i15, (long) intValue);
            i6d.b();
            Cursor o2 = i6d.o(a2, (CancellationSignal) null);
            try {
                int u = kne.u(o2, "id");
                int u2 = kne.u(o2, "server_id");
                int u3 = kne.u(o2, str46);
                int u4 = kne.u(o2, str45);
                int u5 = kne.u(o2, str44);
                int u6 = kne.u(o2, str43);
                int u7 = kne.u(o2, str42);
                int u8 = kne.u(o2, str41);
                int u9 = kne.u(o2, str40);
                int u10 = kne.u(o2, str39);
                int u11 = kne.u(o2, str38);
                int u12 = kne.u(o2, str37);
                int u13 = kne.u(o2, str35);
                d7d2 = a2;
                try {
                    int u14 = kne.u(o2, str33);
                    int u15 = kne.u(o2, str32);
                    int u16 = kne.u(o2, str31);
                    int u17 = kne.u(o2, str30);
                    int u18 = kne.u(o2, str29);
                    int u19 = kne.u(o2, str28);
                    int u20 = kne.u(o2, str27);
                    int u21 = kne.u(o2, str26);
                    int u22 = kne.u(o2, str25);
                    int u23 = kne.u(o2, str24);
                    int u24 = kne.u(o2, str23);
                    int u25 = kne.u(o2, str22);
                    int u26 = kne.u(o2, str21);
                    int u27 = kne.u(o2, str20);
                    int u28 = kne.u(o2, str19);
                    int u29 = kne.u(o2, str18);
                    int u30 = kne.u(o2, str17);
                    int u31 = kne.u(o2, str16);
                    int u32 = kne.u(o2, str15);
                    int u33 = kne.u(o2, str14);
                    int u34 = kne.u(o2, str13);
                    int u35 = kne.u(o2, str12);
                    int u36 = kne.u(o2, str11);
                    int i19 = u13;
                    arrayList = new ArrayList<>(o2.getCount());
                    while (o2.moveToNext()) {
                        long j4 = o2.getLong(u);
                        long j5 = o2.getLong(u2);
                        long j6 = o2.getLong(u3);
                        long j7 = o2.getLong(u4);
                        long j8 = o2.getLong(u5);
                        long j9 = o2.getLong(u6);
                        String string = o2.isNull(u7) ? null : o2.getString(u7);
                        int i20 = o2.getInt(u8);
                        d2.a().getClass();
                        oa9.b.getClass();
                        oa9 n = cd4.n(i20);
                        int i21 = o2.getInt(u9);
                        d2.a().getClass();
                        qe9.b.getClass();
                        qe9 D = sq6.D(i21);
                        long j10 = o2.getLong(u10);
                        String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                        if (o2.isNull(u12)) {
                            i8 = i19;
                            str6 = null;
                        } else {
                            str6 = o2.getString(u12);
                            i8 = i19;
                        }
                        byte[] blob = o2.isNull(i8) ? null : o2.getBlob(i8);
                        d2.a().getClass();
                        w28 b2 = qe8.b(blob);
                        int i22 = u;
                        int i23 = u14;
                        int i24 = o2.getInt(i23);
                        u14 = i23;
                        int i25 = u15;
                        u15 = i25;
                        boolean z4 = o2.getInt(i25) != 0;
                        int i26 = u16;
                        int i27 = o2.getInt(i26);
                        u16 = i26;
                        int i28 = u17;
                        long j11 = o2.getLong(i28);
                        u17 = i28;
                        int i29 = u18;
                        if (o2.getInt(i29) != 0) {
                            u18 = i29;
                            i9 = u19;
                            z3 = true;
                        } else {
                            u18 = i29;
                            i9 = u19;
                            z3 = false;
                        }
                        long j12 = o2.getLong(i9);
                        u19 = i9;
                        int i30 = u20;
                        if (o2.isNull(i30)) {
                            u20 = i30;
                            i10 = u21;
                            str7 = null;
                        } else {
                            str7 = o2.getString(i30);
                            u20 = i30;
                            i10 = u21;
                        }
                        if (o2.isNull(i10)) {
                            u21 = i10;
                            i11 = u22;
                            str8 = null;
                        } else {
                            str8 = o2.getString(i10);
                            u21 = i10;
                            i11 = u22;
                        }
                        long j13 = o2.getLong(i11);
                        u22 = i11;
                        int i31 = u23;
                        long j14 = o2.getLong(i31);
                        u23 = i31;
                        int i32 = u24;
                        int i33 = o2.getInt(i32);
                        d2.a().getClass();
                        int c2 = wj6.c(i33);
                        u24 = i32;
                        int i34 = u25;
                        long j15 = o2.getLong(i34);
                        u25 = i34;
                        int i35 = u26;
                        int i36 = o2.getInt(i35);
                        u26 = i35;
                        int i37 = u27;
                        int i38 = o2.getInt(i37);
                        u27 = i37;
                        int i39 = u28;
                        int i40 = o2.getInt(i39);
                        u28 = i39;
                        int i41 = u29;
                        long j16 = o2.getLong(i41);
                        u29 = i41;
                        int i42 = u30;
                        int i43 = o2.getInt(i42);
                        u30 = i42;
                        int i44 = u31;
                        int i45 = o2.getInt(i44);
                        u31 = i44;
                        int i46 = u32;
                        long j17 = o2.getLong(i46);
                        u32 = i46;
                        int i47 = u33;
                        byte[] blob2 = o2.isNull(i47) ? null : o2.getBlob(i47);
                        d2.a().getClass();
                        List a3 = hp9.a(blob2);
                        u33 = i47;
                        int i48 = u34;
                        if (o2.isNull(i48)) {
                            i12 = i48;
                            i13 = u2;
                            bArr2 = null;
                        } else {
                            i12 = i48;
                            bArr2 = o2.getBlob(i48);
                            i13 = u2;
                        }
                        xd9 b3 = d2.a().b(bArr2);
                        int i49 = u35;
                        if (o2.isNull(i49)) {
                            i14 = u36;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o2.getLong(i49));
                            i14 = u36;
                        }
                        Integer valueOf = o2.isNull(i14) ? null : Integer.valueOf(o2.getInt(i14));
                        if (valueOf == null) {
                            u35 = i49;
                            bool2 = null;
                        } else {
                            u35 = i49;
                            bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList.add(new ya9(j4, j5, j6, j7, j8, j9, string, n, D, j10, string2, str6, b2, i24, z4, i27, j11, z3, j12, str7, str8, j13, j14, c2, j15, i36, i38, i40, j16, i43, i45, j17, a3, b3, l2, bool2));
                        u36 = i14;
                        u2 = i13;
                        u = i22;
                        u34 = i12;
                        i19 = i8;
                    }
                    o2.close();
                    d7d2.o();
                } catch (Throwable th) {
                    th = th;
                    o2.close();
                    d7d2.o();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                d7d2 = a2;
                o2.close();
                d7d2.o();
                throw th;
            }
        } else {
            String str47 = str36;
            String str48 = str34;
            sq6 sq62 = qe9.b;
            String str49 = "text";
            StringBuilder o3 = tr1.o("SELECT * FROM messages WHERE chat_id in (");
            String str50 = "cid";
            int size3 = list.size();
            n79.c(o3, size3);
            o3.append(") AND media_type in (");
            int size4 = set.size();
            n79.c(o3, size4);
            String str51 = "sender";
            o3.append(") AND time >= ");
            o3.append("?");
            o3.append(" AND inserted_from_msg_link = 0 AND status <> ");
            int i50 = size3 + 3 + size4;
            d7d a4 = d7d.a(i50, rae.q(o3, "?", " ORDER BY time ASC LIMIT ", "?"));
            int i51 = 1;
            for (Long l4 : list) {
                if (l4 == null) {
                    a4.X(i51);
                    str4 = str47;
                    str5 = str48;
                } else {
                    str4 = str47;
                    str5 = str48;
                    a4.k(i51, l4.longValue());
                }
                i51++;
                str48 = str5;
                str47 = str4;
            }
            String str52 = str47;
            String str53 = str48;
            int i52 = size3 + 1;
            Iterator it2 = set.iterator();
            int i53 = i52;
            while (it2.hasNext()) {
                Integer num3 = (Integer) it2.next();
                if (num3 == null) {
                    a4.X(i53);
                } else {
                    a4.k(i53, (long) num3.intValue());
                }
                i53++;
            }
            a4.k(i52 + size4, j3);
            d2.a().getClass();
            a4.k(size3 + 2 + size4, (long) 10);
            a4.k(i50, (long) intValue);
            i6d.b();
            Cursor o4 = i6d.o(a4, (CancellationSignal) null);
            try {
                int u37 = kne.u(o4, "id");
                int u38 = kne.u(o4, "server_id");
                int u39 = kne.u(o4, str52);
                int u40 = kne.u(o4, str53);
                int u41 = kne.u(o4, str51);
                int u42 = kne.u(o4, str50);
                int u43 = kne.u(o4, str49);
                int u44 = kne.u(o4, str41);
                int u45 = kne.u(o4, str40);
                int u46 = kne.u(o4, str39);
                int u47 = kne.u(o4, str38);
                int u48 = kne.u(o4, str37);
                int u49 = kne.u(o4, str35);
                d7d = a4;
                try {
                    int u50 = kne.u(o4, str33);
                    int u51 = kne.u(o4, str32);
                    int u52 = kne.u(o4, str31);
                    int u53 = kne.u(o4, str30);
                    int u54 = kne.u(o4, str29);
                    int u55 = kne.u(o4, str28);
                    int u56 = kne.u(o4, str27);
                    int u57 = kne.u(o4, str26);
                    int u58 = kne.u(o4, str25);
                    int u59 = kne.u(o4, str24);
                    int u60 = kne.u(o4, str23);
                    int u61 = kne.u(o4, str22);
                    int u62 = kne.u(o4, str21);
                    int u63 = kne.u(o4, str20);
                    int u64 = kne.u(o4, str19);
                    int u65 = kne.u(o4, str18);
                    int u66 = kne.u(o4, str17);
                    int u67 = kne.u(o4, str16);
                    int u68 = kne.u(o4, str15);
                    int u69 = kne.u(o4, str14);
                    int u70 = kne.u(o4, str13);
                    int u71 = kne.u(o4, str12);
                    int u72 = kne.u(o4, str11);
                    int i54 = u49;
                    arrayList = new ArrayList<>(o4.getCount());
                    while (o4.moveToNext()) {
                        long j18 = o4.getLong(u37);
                        long j19 = o4.getLong(u38);
                        long j20 = o4.getLong(u39);
                        long j21 = o4.getLong(u40);
                        long j22 = o4.getLong(u41);
                        long j23 = o4.getLong(u42);
                        String string3 = o4.isNull(u43) ? null : o4.getString(u43);
                        int i55 = o4.getInt(u44);
                        d2.a().getClass();
                        oa9.b.getClass();
                        oa9 n2 = cd4.n(i55);
                        int i56 = o4.getInt(u45);
                        d2.a().getClass();
                        qe9.b.getClass();
                        qe9 D2 = sq6.D(i56);
                        long j24 = o4.getLong(u46);
                        String string4 = o4.isNull(u47) ? null : o4.getString(u47);
                        if (o4.isNull(u48)) {
                            i = i54;
                            str = null;
                        } else {
                            str = o4.getString(u48);
                            i = i54;
                        }
                        byte[] blob3 = o4.isNull(i) ? null : o4.getBlob(i);
                        d2.a().getClass();
                        w28 b4 = qe8.b(blob3);
                        int i57 = u48;
                        int i58 = u50;
                        int i59 = o4.getInt(i58);
                        u50 = i58;
                        int i60 = u51;
                        u51 = i60;
                        boolean z5 = o4.getInt(i60) != 0;
                        int i61 = u52;
                        int i62 = o4.getInt(i61);
                        u52 = i61;
                        int i63 = u53;
                        long j25 = o4.getLong(i63);
                        u53 = i63;
                        int i64 = u54;
                        if (o4.getInt(i64) != 0) {
                            u54 = i64;
                            i2 = u55;
                            z2 = true;
                        } else {
                            u54 = i64;
                            i2 = u55;
                            z2 = false;
                        }
                        long j26 = o4.getLong(i2);
                        u55 = i2;
                        int i65 = u56;
                        if (o4.isNull(i65)) {
                            u56 = i65;
                            i3 = u57;
                            str2 = null;
                        } else {
                            str2 = o4.getString(i65);
                            u56 = i65;
                            i3 = u57;
                        }
                        if (o4.isNull(i3)) {
                            u57 = i3;
                            i4 = u58;
                            str3 = null;
                        } else {
                            str3 = o4.getString(i3);
                            u57 = i3;
                            i4 = u58;
                        }
                        long j27 = o4.getLong(i4);
                        u58 = i4;
                        int i66 = u59;
                        long j28 = o4.getLong(i66);
                        u59 = i66;
                        int i67 = u60;
                        int i68 = o4.getInt(i67);
                        d2.a().getClass();
                        int c3 = wj6.c(i68);
                        u60 = i67;
                        int i69 = u61;
                        long j29 = o4.getLong(i69);
                        u61 = i69;
                        int i70 = u62;
                        int i71 = o4.getInt(i70);
                        u62 = i70;
                        int i72 = u63;
                        int i73 = o4.getInt(i72);
                        u63 = i72;
                        int i74 = u64;
                        int i75 = o4.getInt(i74);
                        u64 = i74;
                        int i76 = u65;
                        long j30 = o4.getLong(i76);
                        u65 = i76;
                        int i77 = u66;
                        int i78 = o4.getInt(i77);
                        u66 = i77;
                        int i79 = u67;
                        int i80 = o4.getInt(i79);
                        u67 = i79;
                        int i81 = u68;
                        long j31 = o4.getLong(i81);
                        u68 = i81;
                        int i82 = u69;
                        byte[] blob4 = o4.isNull(i82) ? null : o4.getBlob(i82);
                        d2.a().getClass();
                        List a5 = hp9.a(blob4);
                        u69 = i82;
                        int i83 = u70;
                        if (o4.isNull(i83)) {
                            i5 = i83;
                            i6 = u37;
                            bArr = null;
                        } else {
                            i5 = i83;
                            bArr = o4.getBlob(i83);
                            i6 = u37;
                        }
                        xd9 b5 = d2.a().b(bArr);
                        int i84 = u71;
                        if (o4.isNull(i84)) {
                            i7 = u72;
                            l = null;
                        } else {
                            l = Long.valueOf(o4.getLong(i84));
                            i7 = u72;
                        }
                        Integer valueOf2 = o4.isNull(i7) ? null : Integer.valueOf(o4.getInt(i7));
                        if (valueOf2 == null) {
                            u71 = i84;
                            bool = null;
                        } else {
                            u71 = i84;
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new ya9(j18, j19, j20, j21, j22, j23, string3, n2, D2, j24, string4, str, b4, i59, z5, i62, j25, z2, j26, str2, str3, j27, j28, c3, j29, i71, i73, i75, j30, i78, i80, j31, a5, b5, l, bool));
                        u72 = i7;
                        u37 = i6;
                        u48 = i57;
                        u70 = i5;
                        i54 = i;
                    }
                    o4.close();
                    d7d.o();
                } catch (Throwable th3) {
                    th = th3;
                    o4.close();
                    d7d.o();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                d7d = a4;
                o4.close();
                d7d.o();
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ya9 b6 : arrayList) {
            arrayList2.add(b(b6));
        }
        return arrayList2;
    }

    public final void n(long j, qk3 qk3) {
        try {
            ((Number) ((OneMeRoomDatabase) this.a.m()).p(new qj6(this, j, qk3))).intValue();
        } catch (Throwable th) {
            z68.f("RoomMessagesDatabase", "Can't update attach", th);
        }
    }

    public final int o(b89 b89, long j, boolean z, qe9 qe9) {
        int i;
        oa9 oa9 = oa9.SENT;
        id9 i2 = i(j, b89, 0, z, 0, qe9);
        aj9 d2 = d();
        long j2 = b89.w;
        i6d i6d = d2.a;
        i6d.c();
        try {
            ya9 h = d2.h(j, j2);
            if (h == null) {
                i = 0;
            } else {
                id9 g = aj9.g(d2, h, i2, j, (Long) null, Long.valueOf(j2), 8);
                d2.n(h.a, oa9);
                i = d2.l(g);
            }
            i6d.r();
            return i;
        } finally {
            i6d.l();
        }
    }

    public final int p(long j, long j2, b89 b89, boolean z) {
        int i;
        id9 i2 = i(j, b89, j2, z, 0, (qe9) null);
        aj9 d2 = d();
        long j3 = b89.a;
        i6d i6d = d2.a;
        i6d.c();
        try {
            ya9 b2 = d2.b(j, j3);
            if (b2 == null) {
                i = 0;
            } else {
                i = d2.l(aj9.g(d2, b2, i2, j, Long.valueOf(j3), (Long) null, 16));
            }
            i6d.r();
            return i;
        } finally {
            i6d.l();
        }
    }

    public final void q(long j, Long l, Boolean bool) {
        aj9 d2 = d();
        i6d i6d = d2.a;
        i6d.b();
        uf9 uf9 = d2.n;
        gf6 E = uf9.E();
        if (l == null) {
            E.X(1);
        } else {
            E.k(1, l.longValue());
        }
        Integer valueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
        if (valueOf == null) {
            E.X(2);
        } else {
            E.k(2, (long) valueOf.intValue());
        }
        E.k(3, j);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            uf9.S(E);
        } catch (Throwable th) {
            uf9.S(E);
            throw th;
        }
    }
}
