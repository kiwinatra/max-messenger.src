package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/workmanager/BacklogWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "i8b", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class BacklogWorker extends SdkCoroutineWorker {
    public static BacklogWorker w;
    public final Lazy a = LazyKt.lazy(new of0(this, 0));
    public final Lazy b = LazyKt.lazy(new of0(this, 1));
    public final Object c = new Object();
    public final HashSet o = new HashSet();
    public volatile boolean v;

    public BacklogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.pf0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            pf0 r0 = (defpackage.pf0) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            pf0 r0 = new pf0
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r6 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.b
            java.util.List r8 = r0.a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.throwOnFailure(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x007c
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r9.element = r6
            r6 = r7
            r7 = r9
        L_0x0048:
            r9 = 10
            if (r8 <= r9) goto L_0x0052
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            return r6
        L_0x0052:
            T r9 = r7.element
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            kotlin.Lazy r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            gaf r9 = (defpackage.gaf) r9
            osa r9 = (defpackage.osa) r9
            q04 r9 = r9.b()
            qf0 r2 = new qf0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r4 = r6
            java.util.List r4 = (java.util.List) r4
            r0.a = r4
            r0.b = r7
            r0.c = r8
            r0.w = r3
            java.lang.Object r9 = defpackage.ev0.I(r9, r2, r0)
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x008c
            T r9 = r7.element
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            int r8 = r8 + r3
            r7.element = r9
            goto L_0x0048
        L_0x008c:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.c(java.util.List, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object d(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.rf0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf0 r0 = (defpackage.rf0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            rf0 r0 = new rf0
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x009e
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r7
            r7 = r8
        L_0x003e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            T r2 = r7.element
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            java.lang.Object r2 = r2.c
            monitor-enter(r2)
            java.lang.String r4 = "BACKLOG_WORKER"
            java.lang.String r5 = "checkStayAliveAndRunIfNeeded %d"
            T r6 = r7.element     // Catch:{ all -> 0x0083 }
            ru.ok.tamtam.workmanager.BacklogWorker r6 = (ru.ok.tamtam.workmanager.BacklogWorker) r6     // Catch:{ all -> 0x0083 }
            java.util.HashSet r6 = r6.o     // Catch:{ all -> 0x0083 }
            int r6 = r6.size()     // Catch:{ all -> 0x0083 }
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)     // Catch:{ all -> 0x0083 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0083 }
            defpackage.z68.c(r4, r5, r6)     // Catch:{ all -> 0x0083 }
            T r4 = r7.element     // Catch:{ all -> 0x0083 }
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch:{ all -> 0x0083 }
            java.util.HashSet r4 = r4.o     // Catch:{ all -> 0x0083 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0083 }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0085
            T r4 = r7.element     // Catch:{ all -> 0x0083 }
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch:{ all -> 0x0083 }
            java.util.HashSet r4 = r4.o     // Catch:{ all -> 0x0083 }
            r8.addAll(r4)     // Catch:{ all -> 0x0083 }
            T r4 = r7.element     // Catch:{ all -> 0x0083 }
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch:{ all -> 0x0083 }
            java.util.HashSet r4 = r4.o     // Catch:{ all -> 0x0083 }
            r4.clear()     // Catch:{ all -> 0x0083 }
            goto L_0x0085
        L_0x0083:
            r7 = move-exception
            goto L_0x00a8
        L_0x0085:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0083 }
            monitor-exit(r2)
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00a5
            T r2 = r7.element
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            r0.a = r7
            r0.o = r3
            java.lang.Object r8 = r2.g(r8, r0)
            if (r8 != r1) goto L_0x009e
            return r1
        L_0x009e:
            T r8 = r7.element
            ru.ok.tamtam.workmanager.BacklogWorker r8 = (ru.ok.tamtam.workmanager.BacklogWorker) r8
            r7.element = r8
            goto L_0x003e
        L_0x00a5:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00a8:
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.sf0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            sf0 r0 = (defpackage.sf0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            sf0 r0 = new sf0
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            ru.ok.tamtam.workmanager.BacklogWorker r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004f
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r7)
            w = r6
            r0.a = r6
            r0.o = r5
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0.a = r3
            r0.o = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            w = r3
            c08 r6 = defpackage.d08.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ipg e() {
        return (ipg) this.b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[Catch:{ all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0121 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0134 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014f A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0187 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.tf0
            if (r2 == 0) goto L_0x0017
            r2 = r1
            tf0 r2 = (defpackage.tf0) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w = r3
            goto L_0x001c
        L_0x0017:
            tf0 r2 = new tf0
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.o
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.w
            r5 = 1
            r6 = 0
            r7 = 3
            r8 = 2
            java.lang.String r9 = "BACKLOG_WORKER"
            r10 = 4
            if (r4 == 0) goto L_0x0077
            if (r4 == r5) goto L_0x006b
            if (r4 == r8) goto L_0x005e
            if (r4 == r7) goto L_0x0053
            if (r4 != r10) goto L_0x004b
            int r0 = r2.c
            java.util.List r4 = r2.b
            java.util.List r4 = (java.util.List) r4
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0048 }
        L_0x0040:
            r1 = r11
            r16 = r4
            r4 = r0
            r0 = r16
            goto L_0x0188
        L_0x0048:
            r0 = move-exception
            goto L_0x018e
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0053:
            java.util.List r0 = r2.b
            java.util.List r0 = (java.util.List) r0
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0145
        L_0x005e:
            int r0 = r2.c
            java.util.List r4 = r2.b
            java.util.List r4 = (java.util.List) r4
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0119
        L_0x006b:
            int r0 = r2.c
            java.util.List r4 = r2.b
            java.util.List r4 = (java.util.List) r4
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x00bb
        L_0x0077:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r1 = "run"
            defpackage.z68.c(r9, r1, new java.lang.Object[0])
            r0.v = r5
            r1 = r0
            r4 = r5
            r0 = r19
        L_0x0085:
            boolean r11 = r1.isStopped()     // Catch:{ all -> 0x018c }
            if (r11 != 0) goto L_0x0194
            kotlin.Lazy r11 = r1.a     // Catch:{ all -> 0x018c }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x018c }
            gaf r11 = (defpackage.gaf) r11     // Catch:{ all -> 0x018c }
            osa r11 = (defpackage.osa) r11     // Catch:{ all -> 0x018c }
            q04 r11 = r11.b()     // Catch:{ all -> 0x018c }
            uf0 r12 = new uf0     // Catch:{ all -> 0x018c }
            r13 = 0
            r12.<init>(r1, r13)     // Catch:{ all -> 0x018c }
            r2.a = r1     // Catch:{ all -> 0x018c }
            r13 = r0
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x018c }
            r2.b = r13     // Catch:{ all -> 0x018c }
            r2.c = r4     // Catch:{ all -> 0x018c }
            r2.w = r5     // Catch:{ all -> 0x018c }
            java.lang.Object r11 = defpackage.ev0.I(r11, r12, r2)     // Catch:{ all -> 0x018c }
            if (r11 != r3) goto L_0x00b1
            return r3
        L_0x00b1:
            r16 = r4
            r4 = r0
            r0 = r16
            r17 = r11
            r11 = r1
            r1 = r17
        L_0x00bb:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0048 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r12.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r13 = "run: queue count = "
            r12.append(r13)     // Catch:{ all -> 0x0048 }
            r12.append(r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0048 }
            defpackage.z68.c(r9, r12, new java.lang.Object[0])     // Catch:{ all -> 0x0048 }
            ipg r12 = r11.e()     // Catch:{ all -> 0x0048 }
            kotlin.Lazy r12 = r12.h     // Catch:{ all -> 0x0048 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0048 }
            kpg r12 = (defpackage.kpg) r12     // Catch:{ all -> 0x0048 }
            bud r13 = r12.a     // Catch:{ all -> 0x0048 }
            akd r13 = (defpackage.akd) r13     // Catch:{ all -> 0x0048 }
            r13.getClass()     // Catch:{ all -> 0x0048 }
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.f123wmanalyticsenabled     // Catch:{ all -> 0x0048 }
            boolean r15 = r13.h     // Catch:{ all -> 0x0048 }
            boolean r13 = r13.m(r14, r15)     // Catch:{ all -> 0x0048 }
            if (r13 != 0) goto L_0x00f3
            goto L_0x00ff
        L_0x00f3:
            int r13 = r12.d     // Catch:{ all -> 0x0048 }
            if (r13 != r1) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            r12.d = r1     // Catch:{ all -> 0x0048 }
            f94 r12 = r12.e     // Catch:{ all -> 0x0048 }
            r12.a()     // Catch:{ all -> 0x0048 }
        L_0x00ff:
            if (r1 != 0) goto L_0x0123
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0193
            r2.a = r11     // Catch:{ all -> 0x0048 }
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0048 }
            r2.b = r1     // Catch:{ all -> 0x0048 }
            r2.c = r0     // Catch:{ all -> 0x0048 }
            r2.w = r8     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r11.c(r4, r6, r2)     // Catch:{ all -> 0x0048 }
            if (r1 != r3) goto L_0x0119
            return r3
        L_0x0119:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0123
            goto L_0x0193
        L_0x0123:
            ipg r1 = r11.e()     // Catch:{ all -> 0x0048 }
            int r12 = r1.m     // Catch:{ all -> 0x0048 }
            int r1 = r1.f()     // Catch:{ all -> 0x0048 }
            if (r12 >= r1) goto L_0x0131
            r1 = r5
            goto L_0x0132
        L_0x0131:
            r1 = r6
        L_0x0132:
            if (r1 == 0) goto L_0x0152
            r2.a = r11     // Catch:{ all -> 0x0048 }
            r0 = r4
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0048 }
            r2.b = r0     // Catch:{ all -> 0x0048 }
            r2.w = r7     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r11.h(r2)     // Catch:{ all -> 0x0048 }
            if (r1 != r3) goto L_0x0144
            return r3
        L_0x0144:
            r0 = r4
        L_0x0145:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x014f
            r1 = r8
            goto L_0x0150
        L_0x014f:
            r1 = r5
        L_0x0150:
            r4 = r0
            r0 = r1
        L_0x0152:
            long r12 = (long) r0     // Catch:{ all -> 0x0048 }
            z9f r1 = r11.getTamComponent()     // Catch:{ all -> 0x0048 }
            sjd r1 = (defpackage.sjd) r1     // Catch:{ all -> 0x0048 }
            jtb r1 = r1.u()     // Catch:{ all -> 0x0048 }
            ltb r1 = (defpackage.ltb) r1     // Catch:{ all -> 0x0048 }
            cud r1 = r1.b     // Catch:{ all -> 0x0048 }
            r1.getClass()     // Catch:{ all -> 0x0048 }
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.f125wmbacklogworkercheckdelaysec     // Catch:{ all -> 0x0048 }
            r15 = 5
            long r7 = (long) r15     // Catch:{ all -> 0x0048 }
            long r7 = r1.r(r14, r7)     // Catch:{ all -> 0x0048 }
            int r1 = (int) r7     // Catch:{ all -> 0x0048 }
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast((int) r1, (int) r5)     // Catch:{ all -> 0x0048 }
            long r7 = (long) r1     // Catch:{ all -> 0x0048 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r14
            long r7 = r7 * r12
            r2.a = r11     // Catch:{ all -> 0x0048 }
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0048 }
            r2.b = r1     // Catch:{ all -> 0x0048 }
            r2.c = r0     // Catch:{ all -> 0x0048 }
            r2.w = r10     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = defpackage.xk4.b(r7, r2)     // Catch:{ all -> 0x0048 }
            if (r1 != r3) goto L_0x0040
            return r3
        L_0x0188:
            r7 = 3
            r8 = 2
            goto L_0x0085
        L_0x018c:
            r0 = move-exception
            r11 = r1
        L_0x018e:
            java.lang.String r1 = "run failure!"
            defpackage.z68.f(r9, r1, r0)
        L_0x0193:
            r1 = r11
        L_0x0194:
            java.lang.String r0 = "run: finish!"
            defpackage.z68.c(r9, r0, new java.lang.Object[0])
            r1.v = r6
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.g(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.Continuation r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof defpackage.vf0
            if (r2 == 0) goto L_0x0017
            r2 = r1
            vf0 r2 = (defpackage.vf0) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w = r3
            goto L_0x001c
        L_0x0017:
            vf0 r2 = new vf0
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.o
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.w
            r5 = 2
            r6 = 3
            r7 = 0
            java.lang.String r8 = "BACKLOG_WORKER"
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L_0x0059
            if (r4 == r10) goto L_0x0051
            if (r4 == r5) goto L_0x0044
            if (r4 != r6) goto L_0x003c
            java.lang.Object r0 = r2.a
            java.util.HashSet r0 = (java.util.HashSet) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x021d
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            java.util.HashSet r0 = r2.c
            java.util.HashSet r4 = r2.b
            java.lang.Object r5 = r2.a
            ru.ok.tamtam.workmanager.BacklogWorker r5 = (ru.ok.tamtam.workmanager.BacklogWorker) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01ed
        L_0x0051:
            java.lang.Object r0 = r2.a
            ru.ok.tamtam.workmanager.BacklogWorker r0 = (ru.ok.tamtam.workmanager.BacklogWorker) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a1
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r1)
            ipg r1 = r22.e()
            int r4 = r1.f()
            int r11 = r1.m
            int r4 = r4 - r11
            int r1 = r1.f()
            int r1 = kotlin.ranges.RangesKt.coerceIn((int) r4, (int) r7, (int) r1)
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r11 = "runPendingWorkers: pendingLimit = %d"
            defpackage.z68.c(r8, r11, r4)
            if (r1 != 0) goto L_0x0083
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            return r0
        L_0x0083:
            kotlin.Lazy r4 = r0.a
            java.lang.Object r4 = r4.getValue()
            gaf r4 = (defpackage.gaf) r4
            osa r4 = (defpackage.osa) r4
            q04 r4 = r4.b()
            yf0 r11 = new yf0
            r11.<init>(r0, r1, r9)
            r2.a = r0
            r2.w = r10
            java.lang.Object r1 = defpackage.ev0.I(r4, r11, r2)
            if (r1 != r3) goto L_0x00a1
            return r3
        L_0x00a1:
            java.util.List r1 = (java.util.List) r1
            int r4 = r1.size()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r11 = "runPendingWorkers: items.count = %d"
            defpackage.z68.c(r8, r11, r4)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x00bf
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            return r0
        L_0x00bf:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00cd:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x01c0
            java.lang.Object r12 = r1.next()
            hqg r12 = (defpackage.hqg) r12
            ipg r13 = r0.e()
            int r14 = r13.m
            int r13 = r13.f()
            if (r14 >= r13) goto L_0x01ba
            xpg r13 = r12.d
            boolean r14 = r13.d()
            if (r14 == 0) goto L_0x00fd
            hcb r14 = new hcb
            java.lang.String r15 = r13.c
            java.lang.Class r15 = java.lang.Class.forName(r15)
            long r5 = r13.n
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r14.<init>(r15, r5, r9)
            goto L_0x0108
        L_0x00fd:
            v3b r14 = new v3b
            java.lang.String r5 = r13.c
            java.lang.Class r5 = java.lang.Class.forName(r5)
            r14.<init>(r5)
        L_0x0108:
            java.lang.String r5 = r12.a
            java.util.UUID r5 = java.util.UUID.fromString(r5)
            java.lang.Class r6 = r14.getClass()
            java.lang.Class r6 = r6.getSuperclass()
            java.lang.String r9 = "workSpec"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r9)
            r6.setAccessible(r10)
            r6.set(r14, r13)
            java.lang.Class r6 = r14.getClass()
            java.lang.Class r6 = r6.getSuperclass()
            java.lang.String r9 = "id"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r9)
            r6.setAccessible(r10)
            r6.set(r14, r5)
            java.util.Set r5 = r12.e
            java.util.Iterator r5 = r5.iterator()
        L_0x013c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x014c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r14.addTag(r6)
            goto L_0x013c
        L_0x014c:
            androidx.work.WorkRequest r5 = r14.build()
            boolean r6 = r5 instanceof defpackage.w3b
            if (r6 == 0) goto L_0x0167
            ipg r6 = r0.e()
            java.lang.String r9 = r12.b
            fb5 r13 = r12.c
            w3b r5 = (defpackage.w3b) r5
            sv7 r5 = r6.b(r9, r13, r5, r7)
            bv1 r5 = r5.v()
            goto L_0x018b
        L_0x0167:
            boolean r6 = r5 instanceof defpackage.icb
            if (r6 == 0) goto L_0x01b5
            ipg r16 = r0.e()
            java.lang.String r6 = r12.b
            fb5 r9 = r12.c
            fb5 r13 = defpackage.fb5.b
            if (r9 != r13) goto L_0x017a
            r18 = 2
            goto L_0x017d
        L_0x017a:
            r9 = 4
            r18 = r9
        L_0x017d:
            r19 = r5
            icb r19 = (defpackage.icb) r19
            r21 = 16
            r20 = 0
            r17 = r6
            bv1 r5 = defpackage.ipg.e(r16, r17, r18, r19, r20, r21)
        L_0x018b:
            boolean r5 = r5.b
            if (r5 == 0) goto L_0x01a5
            java.lang.String r5 = r12.b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r10)
            java.lang.String r6 = "work %s is enqueued!"
            r9 = 0
            defpackage.z68.n(r8, r9, r6, r5)
            java.lang.String r5 = r12.a
            r4.add(r5)
            goto L_0x01b5
        L_0x01a5:
            java.lang.String r5 = r12.b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "work %s is running!"
            defpackage.z68.c(r8, r6, r5)
            java.lang.String r5 = r12.a
            r11.add(r5)
        L_0x01b5:
            r5 = 2
            r6 = 3
            r9 = 0
            goto L_0x00cd
        L_0x01ba:
            java.lang.String r5 = r12.a
            r4.add(r5)
            goto L_0x01b5
        L_0x01c0:
            boolean r1 = r4.isEmpty()
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x01f0
            kotlin.Lazy r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            gaf r1 = (defpackage.gaf) r1
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            wf0 r5 = new wf0
            r6 = 0
            r5.<init>(r0, r4, r6)
            r2.a = r0
            r2.b = r4
            r2.c = r11
            r6 = 2
            r2.w = r6
            java.lang.Object r1 = defpackage.ev0.I(r1, r5, r2)
            if (r1 != r3) goto L_0x01eb
            return r3
        L_0x01eb:
            r5 = r0
            r0 = r11
        L_0x01ed:
            r11 = r0
        L_0x01ee:
            r0 = r4
            goto L_0x01f2
        L_0x01f0:
            r5 = r0
            goto L_0x01ee
        L_0x01f2:
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x021d
            kotlin.Lazy r1 = r5.a
            java.lang.Object r1 = r1.getValue()
            gaf r1 = (defpackage.gaf) r1
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            xf0 r4 = new xf0
            r6 = 0
            r4.<init>(r5, r11, r6)
            r2.a = r0
            r2.b = r6
            r2.c = r6
            r5 = 3
            r2.w = r5
            java.lang.Object r1 = defpackage.ev0.I(r1, r4, r2)
            if (r1 != r3) goto L_0x021d
            return r3
        L_0x021d:
            boolean r0 = r0.isEmpty()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.h(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
