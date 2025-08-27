package okhttp3.internal.publicsuffix;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "nfd", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class PublicSuffixDatabase {
    public static final byte[] e = {(byte) 42};
    public static final List f = CollectionsKt.listOf("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List x = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual((Object) (String) CollectionsKt.last(x), (Object) "") ? CollectionsKt.dropLast(x, 1) : x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r3 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = java.net.IDN.toUnicode(r12)
            java.util.List r2 = c(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.a
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x004a
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.a
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L_0x004a
            r3 = r0
        L_0x001b:
            r11.b()     // Catch:{ InterruptedIOException -> 0x003b, IOException -> 0x002a }
            if (r3 == 0) goto L_0x0057
        L_0x0020:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x0057
        L_0x0028:
            r11 = move-exception
            goto L_0x0040
        L_0x002a:
            r4 = move-exception
            wnb r5 = defpackage.wnb.a     // Catch:{ all -> 0x0028 }
            wnb r5 = defpackage.wnb.a     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "Failed to read public suffix list"
            r5.getClass()     // Catch:{ all -> 0x0028 }
            r5 = 5
            defpackage.wnb.i(r5, r6, r4)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0057
            goto L_0x0020
        L_0x003b:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0028 }
            r3 = r1
            goto L_0x001b
        L_0x0040:
            if (r3 == 0) goto L_0x0049
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L_0x0049:
            throw r11
        L_0x004a:
            java.util.concurrent.CountDownLatch r3 = r11.b     // Catch:{ InterruptedException -> 0x0050 }
            r3.await()     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L_0x0057:
            byte[] r3 = r11.c
            if (r3 == 0) goto L_0x0152
            int r3 = r2.size()
            byte[][] r4 = new byte[r3][]
            r5 = r0
        L_0x0062:
            if (r5 >= r3) goto L_0x007e
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            if (r6 == 0) goto L_0x0076
            byte[] r6 = r6.getBytes(r7)
            r4[r5] = r6
            int r5 = r5 + r1
            goto L_0x0062
        L_0x0076:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type java.lang.String"
            r11.<init>(r12)
            throw r11
        L_0x007e:
            r5 = r0
        L_0x007f:
            r6 = 0
            if (r5 >= r3) goto L_0x008d
            byte[] r7 = r11.c
            java.lang.String r7 = defpackage.nfd.b(r7, r4, r5)
            if (r7 == 0) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            int r5 = r5 + r1
            goto L_0x007f
        L_0x008d:
            r7 = r6
        L_0x008e:
            if (r3 <= r1) goto L_0x00aa
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r8 = r5.length
            int r8 = r8 - r1
            r9 = r0
        L_0x0099:
            if (r9 >= r8) goto L_0x00aa
            byte[] r10 = e
            r5[r9] = r10
            byte[] r10 = r11.c
            java.lang.String r10 = defpackage.nfd.b(r10, r5, r9)
            if (r10 == 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            int r9 = r9 + r1
            goto L_0x0099
        L_0x00aa:
            r10 = r6
        L_0x00ab:
            if (r10 == 0) goto L_0x00bc
            int r3 = r3 - r1
            r5 = r0
        L_0x00af:
            if (r5 >= r3) goto L_0x00bc
            byte[] r8 = r11.d
            java.lang.String r8 = defpackage.nfd.b(r8, r4, r5)
            if (r8 == 0) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            int r5 = r5 + r1
            goto L_0x00af
        L_0x00bc:
            r8 = r6
        L_0x00bd:
            r11 = 46
            if (r8 == 0) goto L_0x00d0
            java.lang.String r3 = "!"
            java.lang.String r3 = r3.concat(r8)
            char[] r4 = new char[r1]
            r4[r0] = r11
            java.util.List r11 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r3, (char[]) r4, false, 0, 6, (java.lang.Object) null)
            goto L_0x0104
        L_0x00d0:
            if (r7 != 0) goto L_0x00d7
            if (r10 != 0) goto L_0x00d7
            java.util.List r11 = f
            goto L_0x0104
        L_0x00d7:
            if (r7 == 0) goto L_0x00e4
            char[] r3 = new char[r1]
            r3[r0] = r11
            java.util.List r3 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r7, (char[]) r3, false, 0, 6, (java.lang.Object) null)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00e8
        L_0x00e4:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00e8:
            if (r10 == 0) goto L_0x00f5
            char[] r4 = new char[r1]
            r4[r0] = r11
            java.util.List r11 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r10, (char[]) r4, false, 0, 6, (java.lang.Object) null)
            if (r11 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00f9:
            int r4 = r3.size()
            int r5 = r11.size()
            if (r4 <= r5) goto L_0x0104
            r11 = r3
        L_0x0104:
            int r3 = r2.size()
            int r4 = r11.size()
            r5 = 33
            if (r3 != r4) goto L_0x011d
            java.lang.Object r3 = r11.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            char r3 = r3.charAt(r0)
            if (r3 == r5) goto L_0x011d
            return r6
        L_0x011d:
            java.lang.Object r3 = r11.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            char r0 = r3.charAt(r0)
            if (r0 != r5) goto L_0x0133
            int r0 = r2.size()
            int r11 = r11.size()
        L_0x0131:
            int r0 = r0 - r11
            goto L_0x013d
        L_0x0133:
            int r0 = r2.size()
            int r11 = r11.size()
            int r11 = r11 + r1
            goto L_0x0131
        L_0x013d:
            java.util.List r11 = c(r12)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.sequences.Sequence r11 = kotlin.collections.CollectionsKt.asSequence(r11)
            kotlin.sequences.Sequence r11 = kotlin.sequences.SequencesKt.drop(r11, r0)
            java.lang.String r12 = "."
            java.lang.String r11 = kotlin.sequences.SequencesKt___SequencesKt.joinToString$default(r11, r12, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null)
            return r11
        L_0x0152:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0059
            kv6 r1 = new kv6
            java.util.logging.Logger r2 = defpackage.ula.a
            ay r2 = new ay
            lkf r3 = new lkf
            r3.<init>()
            r4 = 1
            r2.<init>(r4, r0, r3)
            r1.<init>(r2)
            gtc r0 = new gtc
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0052 }
            long r1 = (long) r1     // Catch:{ all -> 0x0052 }
            r0.i0(r1)     // Catch:{ all -> 0x0052 }
            rt0 r3 = r0.a     // Catch:{ all -> 0x0052 }
            byte[] r1 = r3.m0(r1)     // Catch:{ all -> 0x0052 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0052 }
            long r2 = (long) r2     // Catch:{ all -> 0x0052 }
            r0.i0(r2)     // Catch:{ all -> 0x0052 }
            rt0 r4 = r0.a     // Catch:{ all -> 0x0052 }
            byte[] r2 = r4.m0(r2)     // Catch:{ all -> 0x0052 }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0052 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            monitor-enter(r5)
            r5.c = r1     // Catch:{ all -> 0x004f }
            r5.d = r2     // Catch:{ all -> 0x004f }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r5 = r5.b
            r5.countDown()
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0052:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r5)
            throw r1
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}
