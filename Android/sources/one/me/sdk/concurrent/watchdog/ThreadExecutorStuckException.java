package one.me.sdk.concurrent.watchdog;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/concurrent/watchdog/ThreadExecutorStuckException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-concurrent"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nThreadExecutorStuckException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadExecutorStuckException.kt\none/me/sdk/concurrent/watchdog/ThreadExecutorStuckException\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n37#2,2:24\n1062#3:26\n1971#3,14:27\n*S KotlinDebug\n*F\n+ 1 ThreadExecutorStuckException.kt\none/me/sdk/concurrent/watchdog/ThreadExecutorStuckException\n*L\n8#1:24,2\n13#1:26\n17#1:27,14\n*E\n"})
public final class ThreadExecutorStuckException extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: yeg} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ThreadExecutorStuckException(java.lang.Iterable r12) {
        /*
            r11 = this;
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r0 = java.lang.System.nanoTime()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationKt.toDuration((long) r0, (kotlin.time.DurationUnit) r2)
            nf8 r3 = new nf8
            r4 = 1
            r3.<init>(r0, r4)
            java.util.List r3 = kotlin.collections.CollectionsKt.sortedWith(r12, r3)
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            hg2 r9 = new hg2
            r3 = 10
            r9.<init>(r0, r3)
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            r10 = 31
            java.lang.String r0 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r4, r5, r6, r7, 0, r8, r9, r10, (java.lang.Object) null)
            r11.<init>(r0)
            long r0 = java.lang.System.nanoTime()
            long r0 = kotlin.time.DurationKt.toDuration((long) r0, (kotlin.time.DurationUnit) r2)
            java.util.Iterator r12 = r12.iterator()
            boolean r2 = r12.hasNext()
            if (r2 != 0) goto L_0x0041
            r12 = 0
            goto L_0x007a
        L_0x0041:
            java.lang.Object r2 = r12.next()
            boolean r3 = r12.hasNext()
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r12 = r2
            goto L_0x007a
        L_0x004d:
            r3 = r2
            yeg r3 = (defpackage.yeg) r3
            long r3 = r3.c
            long r3 = kotlin.time.Duration.m1388minusLRDsOJo(r0, r3)
            kotlin.time.Duration r3 = kotlin.time.Duration.m1351boximpl(r3)
        L_0x005a:
            java.lang.Object r4 = r12.next()
            r5 = r4
            yeg r5 = (defpackage.yeg) r5
            long r5 = r5.c
            long r5 = kotlin.time.Duration.m1388minusLRDsOJo(r0, r5)
            kotlin.time.Duration r5 = kotlin.time.Duration.m1351boximpl(r5)
            int r6 = r3.compareTo(r5)
            if (r6 >= 0) goto L_0x0073
            r2 = r4
            r3 = r5
        L_0x0073:
            boolean r4 = r12.hasNext()
            if (r4 != 0) goto L_0x005a
            goto L_0x004b
        L_0x007a:
            yeg r12 = (defpackage.yeg) r12
            if (r12 == 0) goto L_0x008b
            java.lang.Thread r12 = r12.d
            if (r12 == 0) goto L_0x008b
            java.lang.StackTraceElement[] r12 = r12.getStackTrace()
            if (r12 == 0) goto L_0x008b
            r11.setStackTrace(r12)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException.<init>(java.lang.Iterable):void");
    }
}
