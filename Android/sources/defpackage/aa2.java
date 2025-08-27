package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: aa2  reason: default package */
public final class aa2 extends SuspendLambda implements Function2 {
    public ArrayList a;
    public ArrayList b;
    public ia2 c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ ia2 w;
    public final /* synthetic */ List x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Function0 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aa2(ia2 ia2, List list, boolean z2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.w = ia2;
        this.x = list;
        this.y = z2;
        this.z = function0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        aa2 aa2 = new aa2(this.w, this.x, this.y, this.z, continuation);
        aa2.v = obj;
        return aa2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aa2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: d14} */
    /* JADX WARNING: type inference failed for: r1v2, types: [qae, java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0027
            if (r2 != r4) goto L_0x001f
            ia2 r1 = r0.c
            java.util.ArrayList r2 = r0.b
            java.util.ArrayList r5 = r0.a
            java.lang.Object r6 = r0.v
            d14 r6 = (defpackage.d14) r6
            kotlin.ResultKt.throwOnFailure(r18)
            r4 = r18
            goto L_0x011d
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.v
            r6 = r2
            d14 r6 = (defpackage.d14) r6
            boolean r2 = defpackage.e14.f(r6)
            if (r2 != 0) goto L_0x0038
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0038:
            ia2 r2 = r0.w
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.D0
            r2.set(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r2 = r0.x
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            ia2 r7 = r0.w
            java.util.Iterator r2 = r2.iterator()
        L_0x004e:
            boolean r8 = r2.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r2.next()
            j5d r8 = (defpackage.j5d) r8
            boolean r10 = defpackage.e14.f(r6)
            if (r10 != 0) goto L_0x0069
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.D0
            r0.set(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0069:
            c6d r10 = r7.g()
            java.lang.String r11 = r8.a
            r10.getClass()
            java.lang.String r12 = "SELECT * FROM folder_and_chats WHERE folderId = ?"
            d7d r12 = defpackage.d7d.a(r4, r12)
            if (r11 != 0) goto L_0x007e
            r12.X(r4)
            goto L_0x0081
        L_0x007e:
            r12.h(r4, r11)
        L_0x0081:
            i6d r10 = r10.a
            r10.b()
            android.database.Cursor r10 = r10.o(r12, r9)
            java.lang.String r11 = "chatId"
            int r11 = defpackage.kne.u(r10, r11)     // Catch:{ all -> 0x00c3 }
            java.lang.String r13 = "folderId"
            int r13 = defpackage.kne.u(r10, r13)     // Catch:{ all -> 0x00c3 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x00c3 }
            int r15 = r10.getCount()     // Catch:{ all -> 0x00c3 }
            r14.<init>(r15)     // Catch:{ all -> 0x00c3 }
        L_0x009f:
            boolean r15 = r10.moveToNext()     // Catch:{ all -> 0x00c3 }
            if (r15 == 0) goto L_0x00c5
            long r3 = r10.getLong(r11)     // Catch:{ all -> 0x00c3 }
            boolean r16 = r10.isNull(r13)     // Catch:{ all -> 0x00c3 }
            if (r16 == 0) goto L_0x00b1
            r15 = r9
            goto L_0x00b7
        L_0x00b1:
            java.lang.String r16 = r10.getString(r13)     // Catch:{ all -> 0x00c3 }
            r15 = r16
        L_0x00b7:
            r32 r9 = new r32     // Catch:{ all -> 0x00c3 }
            r9.<init>(r3, r15)     // Catch:{ all -> 0x00c3 }
            r14.add(r9)     // Catch:{ all -> 0x00c3 }
            r3 = 0
            r4 = 1
            r9 = 0
            goto L_0x009f
        L_0x00c3:
            r0 = move-exception
            goto L_0x00dd
        L_0x00c5:
            r10.close()
            r12.o()
            zx5 r3 = r7.m(r8)
            r5.add(r3)
            java.util.HashMap r3 = r7.Y
            java.lang.String r4 = r8.a
            r3.put(r4, r14)
            r3 = 0
            r4 = 1
            goto L_0x004e
        L_0x00dd:
            r10.close()
            r12.o()
            throw r0
        L_0x00e4:
            boolean r2 = defpackage.e14.f(r6)
            if (r2 != 0) goto L_0x00f5
            ia2 r0 = r0.w
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.D0
            r1 = 0
            r0.set(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00f5:
            kotlin.collections.CollectionsKt.sort(r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            ia2 r3 = r0.w
            r0.v = r6
            r0.a = r5
            r0.b = r2
            r0.c = r3
            r4 = 1
            r0.o = r4
            r3.getClass()
            g92 r4 = new g92
            r7 = 0
            r4.<init>(r3, r7)
            kotlin.coroutines.CoroutineContext r7 = r3.x
            java.lang.Object r4 = defpackage.ev0.I(r7, r4, r0)
            if (r4 != r1) goto L_0x011c
            return r1
        L_0x011c:
            r1 = r3
        L_0x011d:
            zx5 r4 = (defpackage.zx5) r4
            r1.C0 = r4
            ts r1 = new ts
            r3 = 0
            r1.<init>(r3)
            ia2 r3 = r0.w
            java.util.Iterator r4 = r5.iterator()
        L_0x012d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x014e
            java.lang.Object r7 = r4.next()
            zx5 r7 = (defpackage.zx5) r7
            boolean r8 = defpackage.e14.f(r6)
            if (r8 != 0) goto L_0x0148
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.D0
            r1 = 0
            r0.set(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0148:
            java.lang.String r8 = r7.a
            r1.put(r8, r7)
            goto L_0x012d
        L_0x014e:
            ia2 r3 = r0.w
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>(r1)
            r3.X = r4
            boolean r1 = defpackage.e14.f(r6)
            if (r1 != 0) goto L_0x0168
            ia2 r0 = r0.w
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.D0
            r1 = 0
            r0.set(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0168:
            ia2 r1 = r0.w
            zx5 r1 = r1.C0
            if (r1 == 0) goto L_0x0189
            ia2 r3 = r0.w
            java.util.concurrent.ConcurrentHashMap r3 = r3.X
            java.lang.String r4 = "all.chat.folder"
            r3.put(r4, r1)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0185
            boolean r1 = r5.add(r1)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            goto L_0x0189
        L_0x0185:
            r3 = 0
            r5.add(r3, r1)
        L_0x0189:
            ia2 r1 = r0.w
            xme r1 = r1.w
            r1.setValue(r5)
            boolean r1 = r0.y
            if (r1 == 0) goto L_0x019b
            ia2 r1 = r0.w
            dac r1 = r1.w0
            r1.d(r2)
        L_0x019b:
            kotlin.jvm.functions.Function0 r1 = r0.z
            if (r1 == 0) goto L_0x01a2
            r1.invoke()
        L_0x01a2:
            ia2 r1 = r0.w
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.D0
            r2 = 0
            r1.set(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            ia2 r2 = r0.w
            java.util.concurrent.ConcurrentHashMap r2 = r2.E0
            java.util.Collection r2 = r2.values()
            r1.<init>(r2)
            ia2 r0 = r0.w
            java.util.concurrent.ConcurrentHashMap r0 = r0.E0
            r0.clear()
            boolean r0 = r1.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x01da
            java.util.Iterator r0 = r1.iterator()
        L_0x01ca:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01da
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x01ca
        L_0x01da:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
