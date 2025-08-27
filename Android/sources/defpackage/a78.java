package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a78  reason: default package */
public final class a78 extends SuspendLambda implements Function2 {
    public ArrayList a;
    public Iterator b;
    public Object c;
    public int o;
    public int v;
    public long w;
    public int x;
    public final /* synthetic */ d78 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a78(d78 d78, Continuation continuation) {
        super(2, continuation);
        this.y = d78;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a78(this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a78) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:30|31|32|(5:34|(1:36)(1:37)|38|(1:40)(1:41)|(1:43))|61|62|63|64|23|(1:(3:84|(1:86)|87))(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:(1:(1:(11:5|78|(1:80)|81|23|(5:25|26|27|(1:29)(10:30|31|32|(5:34|(1:36)(1:37)|38|(1:40)(1:41)|(1:43))|61|62|63|64|23|(1:(3:84|(1:86)|87))(0))|29)|84|(0)|87|88|(1:90)(6:91|(1:95)|96|(1:98)(1:99)|100|(5:102|(7:105|(1:107)|108|(1:110)|(2:112|118)(1:119)|113|103)|117|114|120)(2:115|116)))(2:6|7))(3:8|9|10))(12:13|14|15|16|31|32|(11:61|62|63|64|23|(0)|84|(0)|87|88|(0)(0))|34|(0)(0)|38|(0)(0)|(0)))(10:17|(1:21)|22|23|(0)(0)|84|(0)|87|88|(0)(0))|11|(2:44|45)|46|47|48|49|50|51|52|23|(0)|84|(0)|87|88|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0179, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017a, code lost:
        r13 = r8;
        r8 = r9;
        r10 = r26;
        r12 = r27;
        r11 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0184, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0189, code lost:
        r28 = r11;
        r27 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a0, code lost:
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01eb, code lost:
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f4, code lost:
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f9, code lost:
        r9 = r0;
        r0 = r5;
        r10 = r12;
        r8 = r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0114 A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0115 A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0222 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = 1
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.x
            java.lang.String r4 = "ONEME-11049"
            r5 = 2
            r6 = 0
            r7 = 3
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x004e
            if (r0 == r5) goto L_0x0035
            if (r0 != r7) goto L_0x002d
            int r0 = r1.v
            int r8 = r1.o
            java.lang.Object r9 = r1.c
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.util.Iterator r10 = r1.b
            java.util.ArrayList r11 = r1.a
            kotlin.ResultKt.throwOnFailure(r33)
            r6 = r7
            r29 = r11
            r11 = r8
            r8 = r29
            goto L_0x01fd
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            long r8 = r1.w
            int r10 = r1.v
            int r11 = r1.o
            java.lang.Object r0 = r1.c
            q78 r0 = (defpackage.q78) r0
            java.util.Iterator r12 = r1.b
            java.util.ArrayList r13 = r1.a
            kotlin.ResultKt.throwOnFailure(r33)     // Catch:{ all -> 0x004b }
        L_0x0046:
            r5 = r10
            r9 = r8
            r8 = r13
            goto L_0x0123
        L_0x004b:
            r0 = move-exception
            goto L_0x01b1
        L_0x004e:
            long r8 = r1.w
            int r10 = r1.v
            int r11 = r1.o
            java.util.Iterator r12 = r1.b
            java.util.ArrayList r13 = r1.a
            kotlin.ResultKt.throwOnFailure(r33)     // Catch:{ all -> 0x004b }
            r0 = r33
            goto L_0x00df
        L_0x005f:
            kotlin.ResultKt.throwOnFailure(r33)
            d78 r0 = r1.y
            java.lang.String r8 = r0.x
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x006b
            goto L_0x0086
        L_0x006b:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0086
            w78 r10 = defpackage.w78.o
            java.util.List r0 = r0.v
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Creating LogApiTask for tasks="
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r9.d(r10, r8, r0, r6)
        L_0x0086:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            d78 r8 = r1.y
            java.util.List r8 = r8.v
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
            r10 = r9
            r11 = r10
            r9 = r8
            r8 = r0
        L_0x0098:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r0 = r9.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r12 = r0.longValue()
            d78 r0 = r1.y     // Catch:{ all -> 0x01af }
            k78 r0 = r0.n()     // Catch:{ all -> 0x01af }
            r1.a = r8     // Catch:{ all -> 0x01af }
            r1.b = r9     // Catch:{ all -> 0x01af }
            r1.c = r6     // Catch:{ all -> 0x01af }
            r1.o = r10     // Catch:{ all -> 0x01af }
            r1.v = r11     // Catch:{ all -> 0x01af }
            r1.w = r12     // Catch:{ all -> 0x01af }
            r1.x = r2     // Catch:{ all -> 0x01af }
            o7d r0 = r0.b()     // Catch:{ all -> 0x01af }
            gaf r14 = r0.a     // Catch:{ all -> 0x01af }
            osa r14 = (defpackage.osa) r14     // Catch:{ all -> 0x01af }
            q04 r14 = r14.b()     // Catch:{ all -> 0x01af }
            j7d r15 = new j7d     // Catch:{ all -> 0x01af }
            r15.<init>(r0, r12, r6)     // Catch:{ all -> 0x01af }
            java.lang.Object r0 = defpackage.ev0.I(r14, r15, r1)     // Catch:{ all -> 0x01af }
            if (r0 != r3) goto L_0x00d4
            return r3
        L_0x00d4:
            r29 = r12
            r13 = r8
            r12 = r9
            r8 = r29
            r31 = r11
            r11 = r10
            r10 = r31
        L_0x00df:
            q78 r0 = (defpackage.q78) r0     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x0190
            d78 r14 = r1.y     // Catch:{ all -> 0x018e }
            k78 r14 = r14.n()     // Catch:{ all -> 0x018e }
            sx6 r15 = defpackage.r78.b     // Catch:{ all -> 0x018e }
            r1.a = r13     // Catch:{ all -> 0x018e }
            r1.b = r12     // Catch:{ all -> 0x018e }
            r1.c = r0     // Catch:{ all -> 0x018e }
            r1.o = r11     // Catch:{ all -> 0x018e }
            r1.v = r10     // Catch:{ all -> 0x018e }
            r1.w = r8     // Catch:{ all -> 0x018e }
            r1.x = r5     // Catch:{ all -> 0x018e }
            o7d r14 = r14.b()     // Catch:{ all -> 0x018e }
            gaf r15 = r14.a     // Catch:{ all -> 0x018e }
            osa r15 = (defpackage.osa) r15     // Catch:{ all -> 0x018e }
            q04 r15 = r15.b()     // Catch:{ all -> 0x018e }
            m7d r5 = new m7d     // Catch:{ all -> 0x018e }
            r5.<init>(r14, r8, r6)     // Catch:{ all -> 0x018e }
            java.lang.Object r5 = defpackage.ev0.I(r15, r5, r1)     // Catch:{ all -> 0x018e }
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x018e }
            if (r5 != r14) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x018e }
        L_0x0117:
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x018e }
            if (r5 != r14) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x018e }
        L_0x0120:
            if (r5 != r3) goto L_0x0046
            return r3
        L_0x0123:
            n78 r0 = r0.v     // Catch:{ all -> 0x0186 }
            long r13 = r0.a     // Catch:{ all -> 0x0186 }
            long r6 = r0.b     // Catch:{ all -> 0x0186 }
            java.lang.String r15 = r0.c     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = r0.d     // Catch:{ all -> 0x0186 }
            r26 = r5
            java.util.Map r5 = r0.e     // Catch:{ all -> 0x0184 }
            r28 = r11
            r27 = r12
            long r11 = r0.f     // Catch:{ all -> 0x0179 }
            dm r0 = new dm     // Catch:{ all -> 0x0179 }
            r16 = r0
            r17 = r13
            r19 = r6
            r21 = r11
            r23 = r15
            r24 = r2
            r25 = r5
            r16.<init>(r17, r19, r21, r23, r24, r25)     // Catch:{ all -> 0x0179 }
            r8.add(r0)     // Catch:{ all -> 0x0179 }
            d78 r2 = r1.y     // Catch:{ all -> 0x0179 }
            java.lang.String r2 = r2.x     // Catch:{ all -> 0x0179 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0179 }
            r5.<init>()     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "Create entry for request: taskId:"
            r5.append(r6)     // Catch:{ all -> 0x0179 }
            r5.append(r9)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = ", event:"
            r5.append(r6)     // Catch:{ all -> 0x0179 }
            r5.append(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0179 }
            defpackage.z68.c(r2, r0, new java.lang.Object[0])     // Catch:{ all -> 0x0179 }
            r11 = r26
            r9 = r27
            r10 = r28
            r2 = 1
            r5 = 2
            r6 = 0
            r7 = 3
            goto L_0x0098
        L_0x0179:
            r0 = move-exception
        L_0x017a:
            r13 = r8
            r8 = r9
            r10 = r26
            r12 = r27
            r11 = r28
        L_0x0182:
            r2 = 1
            goto L_0x01b1
        L_0x0184:
            r0 = move-exception
            goto L_0x0189
        L_0x0186:
            r0 = move-exception
            r26 = r5
        L_0x0189:
            r28 = r11
            r27 = r12
            goto L_0x017a
        L_0x018e:
            r0 = move-exception
            goto L_0x0182
        L_0x0190:
            int r5 = r11 + 1
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)     // Catch:{ all -> 0x019f }
            r11 = r10
            r9 = r12
            r8 = r13
            r2 = 1
            r6 = 0
            r7 = 3
            r10 = r5
            r5 = 2
            goto L_0x0098
        L_0x019f:
            r0 = move-exception
            r11 = r5
            goto L_0x0182
        L_0x01a2:
            r2 = 1
            r29 = r12
            r13 = r8
            r12 = r9
            r8 = r29
            r31 = r11
            r11 = r10
            r10 = r31
            goto L_0x01b1
        L_0x01af:
            r0 = move-exception
            goto L_0x01a2
        L_0x01b1:
            int r5 = r10 + 1
            d78 r2 = r1.y
            k78 r2 = r2.n()
            r1.a = r13
            r1.b = r12
            r1.c = r0
            r1.o = r11
            r1.v = r5
            r6 = 3
            r1.x = r6
            o7d r2 = r2.b()
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            gaf r8 = r2.a
            osa r8 = (defpackage.osa) r8
            q04 r8 = r8.b()
            g7d r9 = new g7d
            r10 = 0
            r9.<init>(r2, r7, r10)
            java.lang.Object r2 = defpackage.ev0.I(r8, r9, r1)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r7) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x01ed:
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r7) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x01f6:
            if (r2 != r3) goto L_0x01f9
            return r3
        L_0x01f9:
            r9 = r0
            r0 = r5
            r10 = r12
            r8 = r13
        L_0x01fd:
            d78 r2 = r1.y
            rm r2 = r2.c
            if (r2 == 0) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r2 = 0
        L_0x0205:
            kotlin.Lazy r2 = r2.y
            java.lang.Object r2 = r2.getValue()
            m95 r2 = (defpackage.m95) r2
            ru.ok.tamtam.ExceptionHandler$HandledException r5 = new ru.ok.tamtam.ExceptionHandler$HandledException
            r7 = 0
            r12 = 1
            r5.<init>(r7, r9, r12, r4)
            uta r2 = (defpackage.uta) r2
            r2.c(r5, r12)
            r7 = r6
            r9 = r10
            r10 = r11
            r2 = r12
            r5 = 2
            r6 = 0
            r11 = r0
            goto L_0x0098
        L_0x0222:
            if (r11 != 0) goto L_0x0226
            if (r10 == 0) goto L_0x024b
        L_0x0226:
            d78 r0 = r1.y
            rm r0 = r0.c
            if (r0 == 0) goto L_0x022d
            goto L_0x022e
        L_0x022d:
            r0 = 0
        L_0x022e:
            kotlin.Lazy r0 = r0.y
            java.lang.Object r0 = r0.getValue()
            m95 r0 = (defpackage.m95) r0
            ru.ok.tamtam.ExceptionHandler$HandledException r2 = new ru.ok.tamtam.ExceptionHandler$HandledException
            java.lang.String r3 = "Skipped events in task = "
            java.lang.String r5 = ", deleted due error = "
            java.lang.String r3 = defpackage.g63.h(r3, r10, r11, r5)
            r5 = 2
            r6 = 0
            r2.<init>(r3, r6, r5, r4)
            uta r0 = (defpackage.uta) r0
            r3 = 1
            r0.c(r2, r3)
        L_0x024b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0254
            r6 = 0
            goto L_0x0336
        L_0x0254:
            long r2 = java.lang.System.currentTimeMillis()
            d78 r0 = r1.y
            java.lang.String r4 = r0.x
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x0261
            goto L_0x028d
        L_0x0261:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x028d
            w78 r6 = defpackage.w78.o
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            java.lang.String r7 = defpackage.iq.U(r7)
            boolean r0 = r0.o
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Updating lastSuccessful sent time="
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = " for isCritical="
            r9.append(r7)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r7 = 0
            r5.d(r6, r4, r0, r7)
        L_0x028d:
            d78 r0 = r1.y
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x02a5
            jtb r0 = r0.q()
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "user.lastSentCriticalLogTime"
            r0.k(r2, r1)
            goto L_0x02b6
        L_0x02a5:
            jtb r0 = r0.q()
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "user.lastSentLogTime"
            r0.k(r2, r1)
        L_0x02b6:
            e78 r0 = new e78
            r1 = 0
            r0.<init>((defpackage.x3b) r1)
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0337
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x02cb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0330
            java.lang.Object r4 = r3.next()
            dm r4 = (defpackage.dm) r4
            r4.getClass()
            java.util.Map r5 = kotlin.collections.MapsKt.createMapBuilder()
            long r6 = r4.a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "time"
            r5.put(r7, r6)
            long r6 = r4.b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "userId"
            r5.put(r7, r6)
            java.lang.String r6 = "type"
            java.lang.String r7 = r4.d
            r5.put(r6, r7)
            java.lang.String r6 = "event"
            java.lang.String r7 = r4.e
            r5.put(r6, r7)
            java.util.Map r6 = r4.f
            if (r6 == 0) goto L_0x030b
            java.lang.String r7 = "params"
            r5.put(r7, r6)
        L_0x030b:
            long r6 = r4.c
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0318
            goto L_0x0319
        L_0x0318:
            r4 = r1
        L_0x0319:
            if (r4 == 0) goto L_0x0328
            long r6 = r4.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "sessionId"
            r5.put(r6, r4)
        L_0x0328:
            java.util.Map r4 = kotlin.collections.MapsKt.build(r5)
            r2.add(r4)
            goto L_0x02cb
        L_0x0330:
            java.lang.String r1 = "events"
            r0.i(r1, r2)
            r6 = r0
        L_0x0336:
            return r6
        L_0x0337:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "status can't be null or empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a78.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
