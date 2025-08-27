package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: iv9  reason: default package */
public final class iv9 extends qm implements lcf, hdb {
    public static final /* synthetic */ int Z = 0;
    public final bl4 X;
    public final boolean Y;
    public final long o;
    public final long v;
    public final List w;
    public final List x;
    public final z93 y;
    public final boolean z;

    public iv9(long j, long j2, long j3, List list, List list2, z93 z93, boolean z2, bl4 bl4, boolean z3) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = list;
        this.x = list2;
        this.y = z93;
        this.z = z2;
        this.X = bl4;
        this.Y = z3;
    }

    public final int b() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return rmVar.c().G(this.o) != null ? 1 : 3;
    }

    public final void c() {
        z68.c("iv9", "onMaxFailCount", new Object[0]);
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.e().d(this.a);
        t(this.w);
    }

    public final byte[] d() {
        Tasks.MsgDelete msgDelete = new Tasks.MsgDelete();
        msgDelete.requestId = this.a;
        msgDelete.chatId = this.o;
        msgDelete.chatServerId = this.v;
        msgDelete.messagesId = cjf.i(this.w);
        msgDelete.messagesServerId = cjf.i(this.x);
        msgDelete.forMe = this.z;
        msgDelete.itemTypeId = this.X.a;
        msgDelete.notDeleteMessageFromDb = this.Y;
        z93 z93 = this.y;
        if (z93 != null) {
            msgDelete.complaint = z93.a;
        }
        return ad9.toByteArray(msgDelete);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.ibf r104) {
        /*
            r103 = this;
            r0 = r103
            r1 = r104
            jv9 r1 = (defpackage.jv9) r1
            java.util.Set r1 = r1.o
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            java.util.List r4 = r0.w
            r5 = 0
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r6 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.util.List r6 = r0.x
            int r3 = r6.indexOf(r3)
            if (r3 < 0) goto L_0x003b
            java.lang.Object r3 = r4.get(r3)
            r5 = r3
            java.lang.Long r5 = (java.lang.Long) r5
        L_0x003b:
            if (r5 == 0) goto L_0x0015
            r2.add(r5)
            goto L_0x0015
        L_0x0041:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r1.removeAll(r2)
            boolean r3 = r1.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            long r6 = r0.o
            if (r3 == 0) goto L_0x0077
            r0.t(r1)
            bl4 r1 = defpackage.bl4.REGULAR
            bl4 r3 = r0.X
            if (r3 != r1) goto L_0x0077
            rm r1 = r0.c
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r5
        L_0x0062:
            fa9 r1 = r1.d()
            ha9 r1 = r1.q(r6, r3)
            rm r3 = r0.c
            if (r3 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r5
        L_0x0070:
            r62 r3 = r3.c()
            r3.u0(r6, r1, r4)
        L_0x0077:
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ r4
            boolean r3 = r0.Y
            if (r1 == 0) goto L_0x04c1
            rm r1 = r0.c
            if (r1 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r1 = r5
        L_0x0086:
            r62 r1 = r1.c()
            a32 r1 = r1.G(r6)
            if (r1 == 0) goto L_0x04c1
            m72 r1 = r1.b
            long r8 = r1.x
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r8 = r2.contains(r8)
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L_0x00b7
            rm r8 = r0.c
            if (r8 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r8 = r5
        L_0x00a7:
            r62 r8 = r8.c()
            r8.getClass()
            c10 r12 = new c10
            r13 = 4
            r12.<init>(r10, r13)
            r8.i(r6, r9, r12)
        L_0x00b7:
            if (r3 == 0) goto L_0x00bb
            goto L_0x04e2
        L_0x00bb:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r2.iterator()
        L_0x00c4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0489
            java.lang.Object r13 = r12.next()
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            rm r15 = r0.c
            if (r15 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r15 = r5
        L_0x00da:
            fa9 r15 = r15.d()
            s74 r15 = r15.a
            a74 r15 = (defpackage.a74) r15
            z6d r15 = r15.c
            aj9 r9 = r15.d()
            r9.getClass()
            java.lang.String r10 = "SELECT * FROM messages WHERE msg_link_id = ?"
            d7d r10 = defpackage.d7d.a(r4, r10)
            r10.k(r4, r13)
            i6d r11 = r9.a
            r11.b()
            android.database.Cursor r11 = r11.o(r10, r5)
            java.lang.String r5 = "id"
            int r5 = defpackage.kne.u(r11, r5)     // Catch:{ all -> 0x047f }
            java.lang.String r4 = "server_id"
            int r4 = defpackage.kne.u(r11, r4)     // Catch:{ all -> 0x047f }
            r16 = r12
            java.lang.String r12 = "time"
            int r12 = defpackage.kne.u(r11, r12)     // Catch:{ all -> 0x047f }
            r17 = r6
            java.lang.String r6 = "update_time"
            int r6 = defpackage.kne.u(r11, r6)     // Catch:{ all -> 0x047f }
            java.lang.String r7 = "sender"
            int r7 = defpackage.kne.u(r11, r7)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "cid"
            int r0 = defpackage.kne.u(r11, r0)     // Catch:{ all -> 0x047f }
            r19 = r3
            java.lang.String r3 = "text"
            int r3 = defpackage.kne.u(r11, r3)     // Catch:{ all -> 0x047f }
            r20 = r1
            java.lang.String r1 = "delivery_status"
            int r1 = defpackage.kne.u(r11, r1)     // Catch:{ all -> 0x047f }
            r21 = r2
            java.lang.String r2 = "status"
            int r2 = defpackage.kne.u(r11, r2)     // Catch:{ all -> 0x047f }
            r22 = r8
            java.lang.String r8 = "time_local"
            int r8 = defpackage.kne.u(r11, r8)     // Catch:{ all -> 0x047f }
            r23 = r13
            java.lang.String r13 = "error"
            int r13 = defpackage.kne.u(r11, r13)     // Catch:{ all -> 0x047f }
            java.lang.String r14 = "localized_error"
            int r14 = defpackage.kne.u(r11, r14)     // Catch:{ all -> 0x047f }
            r25 = r15
            java.lang.String r15 = "attaches"
            int r15 = defpackage.kne.u(r11, r15)     // Catch:{ all -> 0x047f }
            r26 = r10
            java.lang.String r10 = "media_type"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r27 = r10
            java.lang.String r10 = "detect_share"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r28 = r10
            java.lang.String r10 = "msg_link_type"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r29 = r10
            java.lang.String r10 = "msg_link_id"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r30 = r10
            java.lang.String r10 = "inserted_from_msg_link"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r31 = r10
            java.lang.String r10 = "msg_link_chat_id"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r32 = r10
            java.lang.String r10 = "msg_link_chat_name"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r33 = r10
            java.lang.String r10 = "msg_link_chat_link"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r34 = r10
            java.lang.String r10 = "msg_link_out_chat_id"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r35 = r10
            java.lang.String r10 = "msg_link_out_msg_id"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r36 = r10
            java.lang.String r10 = "type"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r37 = r10
            java.lang.String r10 = "chat_id"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r38 = r10
            java.lang.String r10 = "ttl"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r39 = r10
            java.lang.String r10 = "channel_views"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r40 = r10
            java.lang.String r10 = "channel_forwards"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r41 = r10
            java.lang.String r10 = "view_time"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r42 = r10
            java.lang.String r10 = "zoom"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r43 = r10
            java.lang.String r10 = "options"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r44 = r10
            java.lang.String r10 = "live_until"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r45 = r10
            java.lang.String r10 = "elements"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r46 = r10
            java.lang.String r10 = "reactions"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r47 = r10
            java.lang.String r10 = "delayed_attrs_time_to_fire"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r48 = r10
            java.lang.String r10 = "delayed_attrs_notify_sender"
            int r10 = defpackage.kne.u(r11, r10)     // Catch:{ all -> 0x0422 }
            r49 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0422 }
            r50 = r15
            int r15 = r11.getCount()     // Catch:{ all -> 0x0422 }
            r10.<init>(r15)     // Catch:{ all -> 0x0422 }
        L_0x0220:
            boolean r15 = r11.moveToNext()     // Catch:{ all -> 0x0422 }
            if (r15 == 0) goto L_0x0424
            long r52 = r11.getLong(r5)     // Catch:{ all -> 0x0422 }
            long r54 = r11.getLong(r4)     // Catch:{ all -> 0x0422 }
            long r56 = r11.getLong(r12)     // Catch:{ all -> 0x0422 }
            long r58 = r11.getLong(r6)     // Catch:{ all -> 0x0422 }
            long r60 = r11.getLong(r7)     // Catch:{ all -> 0x0422 }
            long r62 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            boolean r15 = r11.isNull(r3)     // Catch:{ all -> 0x0422 }
            if (r15 == 0) goto L_0x0247
            r64 = 0
            goto L_0x024d
        L_0x0247:
            java.lang.String r15 = r11.getString(r3)     // Catch:{ all -> 0x0422 }
            r64 = r15
        L_0x024d:
            int r15 = r11.getInt(r1)     // Catch:{ all -> 0x0422 }
            hp9 r51 = r9.a()     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            cd4 r51 = defpackage.oa9.b     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            oa9 r65 = defpackage.cd4.n(r15)     // Catch:{ all -> 0x0422 }
            int r15 = r11.getInt(r2)     // Catch:{ all -> 0x0422 }
            hp9 r51 = r9.a()     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            sq6 r51 = defpackage.qe9.b     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            qe9 r66 = defpackage.sq6.D(r15)     // Catch:{ all -> 0x0422 }
            long r67 = r11.getLong(r8)     // Catch:{ all -> 0x0422 }
            boolean r15 = r11.isNull(r13)     // Catch:{ all -> 0x0422 }
            if (r15 == 0) goto L_0x0282
            r69 = 0
            goto L_0x0288
        L_0x0282:
            java.lang.String r15 = r11.getString(r13)     // Catch:{ all -> 0x0422 }
            r69 = r15
        L_0x0288:
            boolean r15 = r11.isNull(r14)     // Catch:{ all -> 0x0422 }
            if (r15 == 0) goto L_0x0293
            r15 = r50
            r70 = 0
            goto L_0x029b
        L_0x0293:
            java.lang.String r15 = r11.getString(r14)     // Catch:{ all -> 0x0422 }
            r70 = r15
            r15 = r50
        L_0x029b:
            boolean r50 = r11.isNull(r15)     // Catch:{ all -> 0x0422 }
            if (r50 == 0) goto L_0x02a4
            r50 = 0
            goto L_0x02a8
        L_0x02a4:
            byte[] r50 = r11.getBlob(r15)     // Catch:{ all -> 0x0422 }
        L_0x02a8:
            hp9 r51 = r9.a()     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            w28 r71 = defpackage.qe8.b(r50)     // Catch:{ all -> 0x0422 }
            r50 = r0
            r0 = r27
            int r72 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r27 = r0
            r0 = r28
            int r28 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            if (r28 == 0) goto L_0x02cc
            r28 = r0
            r0 = r29
            r73 = 1
            goto L_0x02d2
        L_0x02cc:
            r28 = r0
            r0 = r29
            r73 = 0
        L_0x02d2:
            int r74 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r29 = r0
            r0 = r30
            long r75 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r30 = r0
            r0 = r31
            int r31 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            if (r31 == 0) goto L_0x02ef
            r31 = r0
            r0 = r32
            r77 = 1
            goto L_0x02f5
        L_0x02ef:
            r31 = r0
            r0 = r32
            r77 = 0
        L_0x02f5:
            long r78 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r32 = r0
            r0 = r33
            boolean r33 = r11.isNull(r0)     // Catch:{ all -> 0x0422 }
            if (r33 == 0) goto L_0x030a
            r33 = r0
            r0 = r34
            r80 = 0
            goto L_0x0314
        L_0x030a:
            java.lang.String r33 = r11.getString(r0)     // Catch:{ all -> 0x0422 }
            r80 = r33
            r33 = r0
            r0 = r34
        L_0x0314:
            boolean r34 = r11.isNull(r0)     // Catch:{ all -> 0x0422 }
            if (r34 == 0) goto L_0x0321
            r34 = r0
            r0 = r35
            r81 = 0
            goto L_0x032b
        L_0x0321:
            java.lang.String r34 = r11.getString(r0)     // Catch:{ all -> 0x0422 }
            r81 = r34
            r34 = r0
            r0 = r35
        L_0x032b:
            long r82 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r35 = r0
            r0 = r36
            long r84 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r36 = r0
            r0 = r37
            int r37 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            hp9 r51 = r9.a()     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            int r86 = defpackage.wj6.c(r37)     // Catch:{ all -> 0x0422 }
            r37 = r0
            r0 = r38
            long r87 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r38 = r0
            r0 = r39
            int r89 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r39 = r0
            r0 = r40
            int r90 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r40 = r0
            r0 = r41
            int r91 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r41 = r0
            r0 = r42
            long r92 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r42 = r0
            r0 = r43
            int r94 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r43 = r0
            r0 = r44
            int r95 = r11.getInt(r0)     // Catch:{ all -> 0x0422 }
            r44 = r0
            r0 = r45
            long r96 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            r45 = r0
            r0 = r46
            boolean r46 = r11.isNull(r0)     // Catch:{ all -> 0x0422 }
            if (r46 == 0) goto L_0x0397
            r46 = 0
            goto L_0x039b
        L_0x0397:
            byte[] r46 = r11.getBlob(r0)     // Catch:{ all -> 0x0422 }
        L_0x039b:
            hp9 r51 = r9.a()     // Catch:{ all -> 0x0422 }
            r51.getClass()     // Catch:{ all -> 0x0422 }
            java.util.List r98 = defpackage.hp9.a(r46)     // Catch:{ all -> 0x0422 }
            r46 = r0
            r0 = r47
            boolean r47 = r11.isNull(r0)     // Catch:{ all -> 0x0422 }
            if (r47 == 0) goto L_0x03b6
            r102 = r0
            r47 = r1
            r0 = 0
            goto L_0x03c0
        L_0x03b6:
            byte[] r47 = r11.getBlob(r0)     // Catch:{ all -> 0x0422 }
            r102 = r0
            r0 = r47
            r47 = r1
        L_0x03c0:
            hp9 r1 = r9.a()     // Catch:{ all -> 0x0422 }
            xd9 r99 = r1.b(r0)     // Catch:{ all -> 0x0422 }
            r0 = r48
            boolean r1 = r11.isNull(r0)     // Catch:{ all -> 0x0422 }
            if (r1 == 0) goto L_0x03d5
            r1 = r49
            r100 = 0
            goto L_0x03e1
        L_0x03d5:
            long r100 = r11.getLong(r0)     // Catch:{ all -> 0x0422 }
            java.lang.Long r1 = java.lang.Long.valueOf(r100)     // Catch:{ all -> 0x0422 }
            r100 = r1
            r1 = r49
        L_0x03e1:
            boolean r48 = r11.isNull(r1)     // Catch:{ all -> 0x0422 }
            if (r48 == 0) goto L_0x03ea
            r48 = 0
            goto L_0x03f2
        L_0x03ea:
            int r48 = r11.getInt(r1)     // Catch:{ all -> 0x0422 }
            java.lang.Integer r48 = java.lang.Integer.valueOf(r48)     // Catch:{ all -> 0x0422 }
        L_0x03f2:
            if (r48 != 0) goto L_0x03f9
            r48 = r0
            r101 = 0
            goto L_0x040c
        L_0x03f9:
            int r48 = r48.intValue()     // Catch:{ all -> 0x0422 }
            if (r48 == 0) goto L_0x0402
            r48 = 1
            goto L_0x0404
        L_0x0402:
            r48 = 0
        L_0x0404:
            java.lang.Boolean r48 = java.lang.Boolean.valueOf(r48)     // Catch:{ all -> 0x0422 }
            r101 = r48
            r48 = r0
        L_0x040c:
            ya9 r0 = new ya9     // Catch:{ all -> 0x0422 }
            r51 = r0
            r51.<init>(r52, r54, r56, r58, r60, r62, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r77, r78, r80, r81, r82, r84, r86, r87, r89, r90, r91, r92, r94, r95, r96, r98, r99, r100, r101)     // Catch:{ all -> 0x0422 }
            r10.add(r0)     // Catch:{ all -> 0x0422 }
            r49 = r1
            r1 = r47
            r0 = r50
            r47 = r102
            r50 = r15
            goto L_0x0220
        L_0x0422:
            r0 = move-exception
            goto L_0x0482
        L_0x0424:
            r11.close()
            r26.o()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, 10)
            r0.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
        L_0x0437:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x044d
            java.lang.Object r2 = r1.next()
            ya9 r2 = (defpackage.ya9) r2
            r3 = r25
            ha9 r2 = r3.b(r2)
            r0.add(r2)
            goto L_0x0437
        L_0x044d:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0470
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r1 = r22
            r1.add(r0)
            r0 = r103
            r8 = r1
            r12 = r16
            r6 = r17
            r3 = r19
            r1 = r20
            r2 = r21
        L_0x0469:
            r4 = 1
            r5 = 0
            r9 = 0
            r10 = 0
            goto L_0x00c4
        L_0x0470:
            r0 = r103
            r12 = r16
            r6 = r17
            r3 = r19
            r1 = r20
            r2 = r21
            r8 = r22
            goto L_0x0469
        L_0x047f:
            r0 = move-exception
            r26 = r10
        L_0x0482:
            r11.close()
            r26.o()
            throw r0
        L_0x0489:
            r20 = r1
            r0 = r2
            r19 = r3
            r17 = r6
            r1 = r8
            r0.removeAll(r1)
            r1 = r20
            long r1 = r1.L
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x04c6
            java.util.Iterator r3 = r0.iterator()
        L_0x04a2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b8
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x04a2
            goto L_0x04b9
        L_0x04b8:
            r4 = 0
        L_0x04b9:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x04c6
            r0.remove(r4)
            goto L_0x04c6
        L_0x04c1:
            r0 = r2
            r19 = r3
            r17 = r6
        L_0x04c6:
            if (r19 != 0) goto L_0x04e2
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x04e2
            r1 = r103
            rm r1 = r1.c
            if (r1 == 0) goto L_0x04d8
            r5 = r1
            goto L_0x04d9
        L_0x04d8:
            r5 = 0
        L_0x04d9:
            fa9 r1 = r5.d()
            r2 = r17
            r1.d(r2, r0)
        L_0x04e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv9.e(ibf):void");
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        rm rmVar = this.c;
        np2 np2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        a32 G = rmVar.c().G(this.o);
        if (G != null) {
            Collection collection = this.x;
            boolean z2 = !G.K() && this.z;
            np2 = new np2(x3b.MSG_DELETE, 19);
            np2.p(this.v, ApiProtocol.PARAM_CHAT_ID);
            np2.i("messageIds", CollectionsKt.toList(collection));
            z93 z93 = this.y;
            if (z93 != null) {
                np2.t("complaint", z93.a);
            }
            np2.d("forMe", z2);
            np2.t("itemType", this.X.name());
        }
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_DELETE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
            rm rmVar = this.c;
            if (rmVar == null) {
                rmVar = null;
            }
            rmVar.b().c(new hj0(this.a, qaf));
        }
    }

    public final void t(List list) {
        int size = list.size();
        z68.c("iv9", "returnToActiveMessages, messageIds = " + size, new Object[0]);
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        fa9 d = rmVar.d();
        ((a74) d.a).c.d().o(this.o, list, qe9.ACTIVE);
    }
}
