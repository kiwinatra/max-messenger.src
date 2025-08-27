package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: qvd  reason: default package */
public final class qvd extends gud implements hdb {
    public static WeakReference x = new WeakReference((Object) null);
    public final long b;
    public final long c;
    public int o;
    public final bl4 v;
    public final String w;

    public qvd(long j, long j2, int i, bl4 bl4) {
        this.b = j;
        this.c = j2;
        this.o = i;
        this.v = bl4;
        String name = bl4.name();
        StringBuilder n = tr1.n(j, "TaskSyncChatHistory(#", ",");
        n.append(j2);
        n.append(",");
        n.append(name);
        n.append(")");
        this.w = n.toString();
    }

    public final void A() {
        String str = this.w;
        z68.c(str, "finishTask", new Object[0]);
        z68.c(str, "removeTask", new Object[0]);
        s().d(this.b);
        rvd.A(v());
    }

    /* JADX INFO: finally extract failed */
    public final int b() {
        o9a o9a;
        z68.c(this.w, "onPreExecute", new Object[0]);
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        if (!((nh3) hud.j0.getValue()).f()) {
            return 2;
        }
        eef s = s();
        idb idb = idb.TYPE_SYNC_CHAT_HISTORY;
        gef gef = gef.PROCESSING;
        hef b2 = ((a74) ((s74) s.a.get())).f.b();
        List listOf = CollectionsKt.listOf(idb);
        List<gef> listOf2 = CollectionsKt.listOf(gef);
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id FROM tasks WHERE type in (");
        int size = listOf.size();
        n79.c(sb, size);
        sb.append(") AND status in (");
        int size2 = listOf2.size();
        n79.c(sb, size2);
        sb.append(")");
        d7d a = d7d.a(size2 + size, sb.toString());
        Iterator it = listOf.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            o9a = b2.c;
            if (!hasNext) {
                break;
            }
            o9a.getClass();
            a.k(i, (long) ((idb) it.next()).a);
            i++;
        }
        int i2 = size + 1;
        for (gef gef2 : listOf2) {
            o9a.getClass();
            a.k(i2, (long) gef2.a);
            i2++;
        }
        i6d i6d = b2.a;
        i6d.b();
        Cursor o2 = i6d.o(a, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
            }
            o2.close();
            a.o();
            return arrayList.isEmpty() ^ true ? 2 : 1;
        } catch (Throwable th) {
            o2.close();
            a.o();
            throw th;
        }
    }

    public final void c() {
        z68.c(this.w, "removeTask", new Object[0]);
        s().d(this.b);
    }

    public final byte[] d() {
        Tasks.SyncChatHistory syncChatHistory = new Tasks.SyncChatHistory();
        syncChatHistory.taskId = this.b;
        syncChatHistory.chatId = this.c;
        syncChatHistory.count = this.o;
        syncChatHistory.itemTypeId = this.v.a;
        z68.c(this.w, "toByteArray", new Object[0]);
        return ad9.toByteArray(syncChatHistory);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (Intrinsics.areEqual((Object) qvd.class, (Object) obj.getClass())) {
                qvd qvd = (qvd) obj;
                return this.c == qvd.c && this.v == qvd.v;
            }
        }
        return false;
    }

    public final long getId() {
        return this.b;
    }

    public final idb getType() {
        return idb.TYPE_SYNC_CHAT_HISTORY;
    }

    public final int hashCode() {
        long j = this.c;
        return this.v.hashCode() + (((qvd.class.getName().hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final ExecutorService k(aua aua, kn4 kn4) {
        ExecutorService executorService;
        int i;
        ExecutorService executorService2 = (ExecutorService) x.get();
        if (executorService2 != null) {
            return executorService2;
        }
        synchronized (qvd.class) {
            try {
                executorService = (ExecutorService) x.get();
                if (executorService == null) {
                    int availableProcessors = Runtime.getRuntime().availableProcessors();
                    int ordinal = kn4.ordinal();
                    if (ordinal == 0) {
                        i = Math.max(4, availableProcessors - 1);
                    } else if (ordinal == 1) {
                        i = Math.max(8, availableProcessors);
                    } else if (ordinal == 2) {
                        i = Math.max(12, availableProcessors);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    KProperty[] kPropertyArr = aua.o;
                    executorService = aua.e(0, "sync-chat-history", i, 5);
                    x = new WeakReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public final String toString() {
        return this.w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = r0.w
            java.lang.String r2 = "process start"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            r62 r1 = r22.e()
            long r2 = r0.c
            a32 r1 = r1.G(r2)
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L_0x004e
            boolean r4 = r1.E()
            if (r4 != 0) goto L_0x0023
            boolean r4 = r1.S()
            if (r4 == 0) goto L_0x0029
        L_0x0023:
            boolean r4 = r1.f0()
            if (r4 != 0) goto L_0x004e
        L_0x0029:
            java.lang.String r4 = r0.w
            kotlin.jvm.internal.StringCompanionObject r5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            m72 r5 = r1.b
            k72 r5 = r5.c
            boolean r6 = r1.f0()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5, r6}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r3 = "Chat %s have status %s or self participant=%b finish this task"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            defpackage.z68.f(r4, r1, r2)
            r22.A()
            return
        L_0x004e:
            int r4 = r0.o
            r5 = 1
            int r4 = r4 + r5
            r0.o = r4
            r6 = 10
            if (r4 <= r6) goto L_0x0097
            java.lang.String r3 = r0.w
            ru.ok.tamtam.exception.TaskSyncChatHistoryMaxIterationsException r4 = new ru.ok.tamtam.exception.TaskSyncChatHistoryMaxIterationsException
            if (r1 == 0) goto L_0x0068
            m72 r5 = r1.b
            if (r5 == 0) goto L_0x0068
            long r5 = r5.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L_0x0068:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "chat = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            java.lang.String r2 = "MAX_ITERATION_COUNT reached"
            defpackage.z68.f(r3, r2, r4)
            if (r1 == 0) goto L_0x0093
            java.lang.String r2 = r0.w
            m72 r1 = r1.b
            long r3 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "process: chatServerId = %d"
            defpackage.z68.c(r2, r3, r1)
        L_0x0093:
            r22.A()
            return
        L_0x0097:
            eef r1 = r22.s()
            js9 r4 = defpackage.gef.b
            hs7 r1 = r1.a
            java.lang.Object r1 = r1.get()
            s74 r1 = (defpackage.s74) r1
            a74 r1 = (defpackage.a74) r1
            q7d r1 = r1.f
            hef r1 = r1.b()
            long r7 = r0.b
            byte[] r4 = r22.d()
            i6d r9 = r1.a
            r9.b()
            t5d r10 = r1.e
            gf6 r11 = r10.E()
            if (r4 != 0) goto L_0x00c4
            r11.X(r5)
            goto L_0x00c7
        L_0x00c4:
            r11.l(r5, r4)
        L_0x00c7:
            o9a r1 = r1.c
            r1.getClass()
            long r12 = (long) r6
            r1 = 2
            r11.k(r1, r12)
            r11.k(r3, r7)
            r9.c()     // Catch:{ all -> 0x0421 }
            r11.n()     // Catch:{ all -> 0x041c }
            r9.r()     // Catch:{ all -> 0x041c }
            r9.l()     // Catch:{ all -> 0x0421 }
            r10.S(r11)
            java.lang.String r1 = r0.w
            java.lang.String r3 = "syncMessages"
            defpackage.z68.c(r1, r3, new java.lang.Object[0])
            r62 r1 = r22.e()
            long r3 = r0.c
            a32 r1 = r1.G(r3)
            r3 = 0
            if (r1 == 0) goto L_0x01e7
            m72 r4 = r1.b
            long r6 = r4.a
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x010b
            r62 r4 = r22.e()
            boolean r4 = r4.W(r1)
            if (r4 == 0) goto L_0x01e7
        L_0x010b:
            boolean r4 = r1.f0()
            if (r4 != 0) goto L_0x0113
            goto L_0x01e7
        L_0x0113:
            boolean r4 = r1.I()
            if (r4 == 0) goto L_0x013a
            java.lang.String r2 = r0.w
            java.lang.String r3 = "current chat is blocked, try to get history from last event time (probably, it's equals to last message time"
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            qa2 r6 = r22.g()
            long r7 = r1.a
            m72 r1 = r1.b
            long r9 = r1.a
            long r11 = r1.k
            long r1 = r0.b
            bl4 r3 = r0.v
            r13 = 0
            r15 = r1
            r17 = r3
            defpackage.qa2.b(r6, r7, r9, r11, r13, r15, r17)
            goto L_0x03ec
        L_0x013a:
            a89 r4 = r1.c
            if (r4 == 0) goto L_0x018a
            ha9 r4 = r4.a
            long r6 = r4.z
            long r8 = r0.c
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x018a
            one.me.sdk.tasks.WrongLastMessageInChatException r4 = new one.me.sdk.tasks.WrongLastMessageInChatException
            r4.<init>()
            java.lang.String r6 = r0.w
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0154
            goto L_0x0183
        L_0x0154:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0183
            w78 r8 = defpackage.w78.w
            m72 r9 = r1.b
            long r9 = r9.a
            a89 r11 = r1.c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "CRITICAL SITUATION: chat.lastMessage.data.chatId != chatId serverId = "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " chat = "
            r12.append(r9)
            r12.append(r1)
            java.lang.String r9 = " lastMessage = "
            r12.append(r9)
            r12.append(r11)
            java.lang.String r9 = r12.toString()
            r7.d(r8, r6, r9, r2)
        L_0x0183:
            m95 r2 = r22.j()
            ((defpackage.uta) r2).c(r4, false)
        L_0x018a:
            bl4 r2 = r0.v
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0200
            if (r2 != r5) goto L_0x01ea
            qa2 r2 = r22.g()
            long r7 = r1.a
            m72 r1 = r1.b
            long r9 = r1.a
            long r13 = r0.b
            r2.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "firstPageDelayed: chatId = "
            r1.<init>(r4)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = r2.c
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            kotlin.Lazy r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            d3d r1 = (defpackage.d3d) r1
            qjd r1 = (defpackage.qjd) r1
            long r5 = r1.n()
            long r11 = java.lang.System.currentTimeMillis()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 + r15
            bl4 r20 = defpackage.bl4.DELAYED
            la2 r1 = new la2
            r4 = r1
            r17 = 0
            r18 = 0
            r15 = 0
            r16 = 40
            r21 = 3488(0xda0, float:4.888E-42)
            r4.<init>(r5, r7, r9, r11, r13, r15, r16, r17, r18, r20, r21)
            kotlin.Lazy r2 = r2.b
            java.lang.Object r2 = r2.getValue()
            ocf r2 = (defpackage.ocf) r2
            defpackage.ocf.b(r2, r1)
        L_0x01e7:
            r5 = r3
            goto L_0x03ec
        L_0x01ea:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            bl4 r0 = r0.v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected value: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0200:
            long r6 = r1.o()
            a89 r2 = r1.c
            if (r2 == 0) goto L_0x0211
            ha9 r2 = r2.a
            long r8 = r2.o
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0211
            r6 = r8
        L_0x0211:
            bl4 r2 = r0.v
            m72 r4 = r1.b
            g72 r4 = r4.n
            java.util.ArrayList r2 = r4.d(r2)
            kotlin.Pair r2 = defpackage.hd8.r(r6, r2)
            java.lang.Object r2 = r2.getSecond()
            f72 r2 = (defpackage.f72) r2
            java.lang.String r4 = r0.w
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = defpackage.iq.U(r8)
            java.lang.String r9 = defpackage.hd8.L(r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            java.lang.String r9 = "syncMessages: readMark = %s, chunk = %s"
            defpackage.z68.c(r4, r9, r8)
            if (r2 != 0) goto L_0x0263
            bl4 r2 = r0.v
            long r17 = r1.j(r6, r2)
            java.lang.String r2 = r0.w
            java.lang.String r3 = "checkReadmarkChunk: chunk is null, request from readmark back and forth"
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            qa2 r10 = r22.g()
            m72 r2 = r1.b
            long r13 = r2.a
            long r11 = r1.a
            long r1 = r0.b
            bl4 r3 = r0.v
            r15 = r6
            r19 = r1
            r21 = r3
            defpackage.qa2.b(r10, r11, r13, r15, r17, r19, r21)
            goto L_0x03ec
        L_0x0263:
            bl4 r4 = defpackage.bl4.REGULAR
            long r19 = r1.j(r6, r4)
            fa9 r10 = r22.o()
            long r13 = r2.a
            r17 = 1
            long r11 = r1.a
            r15 = r6
            r18 = r4
            java.util.ArrayList r4 = r10.o(r11, r13, r15, r17, r18)
            boolean r8 = r4.isEmpty()
            r9 = 40
            if (r8 != 0) goto L_0x0302
            int r8 = r4.size()
            if (r8 < r9) goto L_0x028a
            goto L_0x0302
        L_0x028a:
            java.util.Iterator r8 = r4.iterator()
        L_0x028e:
            boolean r10 = r8.hasNext()
            java.lang.String r11 = r0.w
            m72 r12 = r1.b
            if (r10 == 0) goto L_0x02af
            java.lang.Object r10 = r8.next()
            ha9 r10 = (defpackage.ha9) r10
            long r13 = r10.b
            long r9 = r12.x
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x02ac
            java.lang.String r4 = "checkBackwardSync: first chat message exists in backward history, stop syncing"
            defpackage.z68.c(r11, r4, new java.lang.Object[0])
            goto L_0x0302
        L_0x02ac:
            r9 = 40
            goto L_0x028e
        L_0x02af:
            java.lang.Object r2 = r4.get(r3)
            ha9 r2 = (defpackage.ha9) r2
            long r6 = r2.o
            int r3 = r4.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r14 = defpackage.iq.U(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            java.lang.String r15 = defpackage.iq.U(r3)
            long r3 = r12.x
            java.lang.Long r16 = java.lang.Long.valueOf(r3)
            g72 r3 = r12.n
            bl4 r4 = defpackage.bl4.REGULAR
            java.util.ArrayList r3 = r3.d(r4)
            java.lang.String r18 = defpackage.hd8.M(r3)
            r17 = r2
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r14, r15, r16, r17, r18}
            java.lang.String r3 = "checkBackwardSync: before.size = %d, from = %s, backward = %s, chat.data.firstMessageId = %d, firstInHistory = %s, chunks = %s"
            defpackage.z68.c(r11, r3, r2)
            qa2 r8 = r22.g()
            long r11 = r12.a
            long r9 = r1.a
            long r1 = r0.b
            r13 = r6
            r15 = r19
            r17 = r1
            r19 = r4
            defpackage.qa2.c(r8, r9, r11, r13, r15, r17, r19)
            goto L_0x03ec
        L_0x0302:
            a89 r4 = r1.c
            if (r4 == 0) goto L_0x0310
            ha9 r4 = r4.a
            long r8 = r4.o
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0310
            goto L_0x0381
        L_0x0310:
            fa9 r10 = r22.o()
            long r8 = r2.b
            bl4 r4 = defpackage.bl4.REGULAR
            long r11 = r1.a
            r17 = 0
            r13 = r6
            r15 = r8
            r18 = r4
            java.util.ArrayList r6 = r10.o(r11, r13, r15, r17, r18)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0381
            int r7 = r6.size()
            r8 = 40
            if (r7 >= r8) goto L_0x0381
            a89 r7 = r1.c
            if (r7 != 0) goto L_0x0337
            goto L_0x0381
        L_0x0337:
            ha9 r8 = r7.a
            long r8 = r8.o
            boolean r2 = defpackage.hd8.G(r8, r2)
            if (r2 != 0) goto L_0x0381
            int r2 = r6.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m72 r3 = r1.b
            g72 r8 = r3.n
            java.util.ArrayList r8 = r8.d(r4)
            java.lang.String r8 = defpackage.hd8.M(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r8, r7}
            java.lang.String r7 = r0.w
            java.lang.String r8 = "checkForwardSync: after.size = %d, chunks = %s, lastMessage = %s"
            defpackage.z68.c(r7, r8, r2)
            int r2 = r6.size()
            int r2 = r2 - r5
            java.lang.Object r2 = r6.get(r2)
            ha9 r2 = (defpackage.ha9) r2
            long r6 = r2.o
            qa2 r11 = r22.g()
            long r14 = r3.a
            long r12 = r1.a
            long r1 = r0.b
            r16 = r6
            r18 = r1
            r20 = r4
            defpackage.qa2.a(r11, r12, r14, r16, r18, r20)
            goto L_0x03ec
        L_0x0381:
            m72 r2 = r1.b
            g72 r2 = r2.n
            bl4 r4 = defpackage.bl4.REGULAR
            java.util.ArrayList r2 = r2.d(r4)
            a89 r4 = r1.c
            if (r4 == 0) goto L_0x01e7
            m72 r6 = r1.b
            int r7 = r6.m
            r8 = 40
            if (r7 >= r8) goto L_0x0399
            goto L_0x01e7
        L_0x0399:
            ha9 r4 = r4.a
            long r7 = r4.o
            bl4 r4 = r0.v
            long r16 = r1.j(r7, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x03a7:
            boolean r4 = r2.hasNext()
            a89 r7 = r1.c
            if (r4 == 0) goto L_0x03c8
            java.lang.Object r4 = r2.next()
            f72 r4 = (defpackage.f72) r4
            ha9 r7 = r7.a
            long r7 = r7.o
            boolean r7 = defpackage.hd8.G(r7, r4)
            if (r7 == 0) goto L_0x03a7
            long r7 = r4.a
            long r9 = r4.b
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01e7
            goto L_0x03a7
        L_0x03c8:
            int r2 = r6.m
            java.lang.String r3 = "checkBackwardLastMessageSync: newMessages = "
            java.lang.String r2 = defpackage.wj6.h(r2, r3)
            java.lang.String r3 = r0.w
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            qa2 r9 = r22.g()
            long r12 = r6.a
            ha9 r2 = r7.a
            long r14 = r2.o
            long r10 = r1.a
            long r1 = r0.b
            bl4 r3 = r0.v
            r18 = r1
            r20 = r3
            defpackage.qa2.c(r9, r10, r12, r14, r16, r18, r20)
        L_0x03ec:
            java.lang.String r1 = r0.w
            long r2 = r0.b
            long r6 = r0.c
            int r4 = r0.o
            java.lang.String r8 = "process, taskId = "
            java.lang.String r9 = ", chatId = "
            java.lang.StringBuilder r2 = defpackage.tr1.n(r2, r8, r9)
            r2.append(r6)
            java.lang.String r3 = ", needSyncMessage = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " count: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            if (r5 != 0) goto L_0x041b
            r22.A()
        L_0x041b:
            return
        L_0x041c:
            r0 = move-exception
            r9.l()     // Catch:{ all -> 0x0421 }
            throw r0     // Catch:{ all -> 0x0421 }
        L_0x0421:
            r0 = move-exception
            r10.S(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.z():void");
    }
}
