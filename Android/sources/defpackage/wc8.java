package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import one.me.rlottie.network.LottieFetchCall;
import one.me.rlottie.network.LottieNetworkFetcher;

/* renamed from: wc8  reason: default package */
public final class wc8 implements LottieNetworkFetcher, epf, zl, mza, usb, tja, pyc, oie, t8g {
    public static final wc8 a = new Object();
    public static final wc8 b = new Object();
    public static final wc8 c = new Object();
    public static final wc8 o = new Object();
    public static final wc8 v = new Object();
    public static final wc8 w = new Object();
    public static wc8 x;

    public static final void a(File... fileArr) {
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    f6e.m(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }
    }

    public static final ArrayDeque b(File... fileArr) {
        List list;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 0;
        for (File file : fileArr) {
            if (!file.exists()) {
                list = CollectionsKt.emptyList();
            } else {
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(FilesKt.readBytes(file));
                    List createListBuilder = CollectionsKt.createListBuilder();
                    while (wrap.hasRemaining()) {
                        try {
                            if (wrap.hasArray()) {
                                long j = wrap.getLong();
                                int i2 = wrap.getInt();
                                if (wrap.remaining() >= i2) {
                                    int position = wrap.position() + wrap.arrayOffset();
                                    o78 o78 = new o78(j, ArraysKt.copyOfRange(wrap.array(), position, position + i2));
                                    wrap.position(wrap.position() + i2);
                                    createListBuilder.add(o78);
                                } else {
                                    throw new BufferUnderflowException();
                                }
                            } else {
                                throw new IllegalArgumentException("Only buffers with backing array supported".toString());
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                    if (createListBuilder.size() > 1) {
                        CollectionsKt.sortWith(createListBuilder, new ed7(3));
                    }
                    list = CollectionsKt.build(createListBuilder);
                } catch (Exception unused2) {
                    file.toString();
                    list = CollectionsKt.emptyList();
                }
            }
            if (!list.isEmpty()) {
                if (arrayDeque.isEmpty() || ((o78) arrayDeque.last()).a < ((o78) CollectionsKt.first(list)).a) {
                    arrayDeque.addAll(list);
                } else {
                    int size = arrayDeque.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (((o78) arrayDeque.get(i3)).a > ((o78) CollectionsKt.last(list)).a) {
                            arrayDeque.addAll(i3, list);
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            i += ((o78) it.next()).c;
        }
        while (i > 65536) {
            i -= ((o78) arrayDeque.removeFirst()).c;
        }
        return arrayDeque;
    }

    public static vw0 f(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (tf6.c(str.charAt(i2 + 1)) + (tf6.c(str.charAt(i2)) << 4));
            }
            return new vw0(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static vw0 g(String str) {
        vw0 vw0 = new vw0(str.getBytes(Charsets.UTF_8));
        vw0.b = str;
        return vw0;
    }

    public static boolean h(File file) {
        Boolean bool;
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(file.exists() && file.canRead()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public static boolean i(String str) {
        Boolean bool;
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(h(new File(str))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public static File p(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int m = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        int i = 0;
        while (i < 100) {
            if (m != -1) {
                str2 = str.substring(0, m) + "(" + (i + 1) + ")" + str.substring(m);
            } else {
                str2 = str + "(" + (i + 1) + ")";
            }
            File file3 = new File(file, str2);
            if (!file3.exists()) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static vw0 r(byte[] bArr) {
        int length = bArr.length;
        n79.l((long) bArr.length, (long) 0, (long) length);
        return new vw0(ArraysKt.copyOfRange(bArr, 0, length));
    }

    public static void s(String str) {
        Boolean bool;
        Boolean bool2;
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(str);
            bool2 = Result.m23constructorimpl(Boolean.valueOf(file.exists() ? file.delete() : false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool3 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool2)) {
            bool2 = bool3;
        }
        Boolean bool4 = (Boolean) bool2;
        bool4.booleanValue();
        bool = Result.m23constructorimpl(bool4);
        Boolean bool5 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool5;
        }
        ((Boolean) bool).getClass();
    }

    public static txb v(String str) {
        for (txb txb : txb.x) {
            if (Intrinsics.areEqual((Object) txb.a, (Object) str)) {
                return txb;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public CharSequence c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (!TextUtils.isEmpty(editTextPreference.c1)) {
            return editTextPreference.c1;
        }
        return editTextPreference.a.getString(hmc.not_set);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.ArrayList, wja] */
    public wja call() {
        return new ArrayList(16);
    }

    public void d() {
        ox2.b.W0().b(":chats-search", (Bundle) null);
    }

    public kr7 e(ca6 ca6) {
        String str = ca6.Z;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new up(0);
                case 1:
                    return new h77();
                case 2:
                    return new r77((o77) null);
                case 3:
                    return new up(1);
                case 4:
                    return new zge();
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public LottieFetchCall fetch(String str) {
        return new ug4(str);
    }

    public boolean j(UnsatisfiedLinkError unsatisfiedLinkError, nfe[] nfeArr) {
        mfe mfe;
        String message;
        if (!(unsatisfiedLinkError instanceof mfe) || (unsatisfiedLinkError instanceof lfe) || (message = mfe.getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        Objects.toString(unsatisfiedLinkError);
        String str = (mfe = (mfe) unsatisfiedLinkError).a;
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (cg0 cg0 : nfeArr) {
            if (cg0 instanceof cg0) {
                cg0 cg02 = cg0;
                try {
                    cg02.getClass();
                    cg02.d(2);
                } catch (Exception unused) {
                    cg02.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    public void k(VideoSink$VideoSinkException videoSink$VideoSinkException) {
    }

    public void m() {
    }

    public long o(long j) {
        return j;
    }

    public void onFirstFrameRendered() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC, Splitter:B:22:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(java.io.File r12, java.io.InputStream r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.oo5
            if (r0 == 0) goto L_0x0013
            r0 = r14
            oo5 r0 = (defpackage.oo5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.z = r1
            goto L_0x0018
        L_0x0013:
            oo5 r0 = new oo5
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r11 = r0.x
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0047
            if (r1 != r3) goto L_0x003f
            long r12 = r0.w
            byte[] r1 = r0.v
            java.io.InputStream r4 = r0.o
            java.io.OutputStream r5 = r0.c
            java.io.Closeable r6 = r0.b
            java.io.Closeable r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x003c }
            r11 = r4
            r10 = r6
            r6 = r5
            r4 = r12
            r13 = r7
            r7 = r10
            goto L_0x0078
        L_0x003c:
            r11 = move-exception
            r13 = r7
            goto L_0x0092
        L_0x003f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r11)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r6.<init>(r12, r2)
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0091 }
            int r12 = r13.read(r11)     // Catch:{ all -> 0x0091 }
            r4 = 0
            r1 = r11
            r11 = r13
            r7 = r6
        L_0x005c:
            if (r12 < 0) goto L_0x0080
            r6.write(r1, r2, r12)     // Catch:{ all -> 0x007d }
            long r8 = (long) r12     // Catch:{ all -> 0x007d }
            long r4 = r4 + r8
            r0.a = r13     // Catch:{ all -> 0x007d }
            r0.b = r7     // Catch:{ all -> 0x007d }
            r0.c = r6     // Catch:{ all -> 0x007d }
            r0.o = r11     // Catch:{ all -> 0x007d }
            r0.v = r1     // Catch:{ all -> 0x007d }
            r0.w = r4     // Catch:{ all -> 0x007d }
            r0.z = r3     // Catch:{ all -> 0x007d }
            java.lang.Object r12 = defpackage.f6e.M(r0)     // Catch:{ all -> 0x007d }
            if (r12 != r14) goto L_0x0078
            return r14
        L_0x0078:
            int r12 = r11.read(r1)     // Catch:{ all -> 0x007d }
            goto L_0x005c
        L_0x007d:
            r11 = move-exception
            r6 = r7
            goto L_0x0092
        L_0x0080:
            r6.flush()     // Catch:{ all -> 0x007d }
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x007d }
            r11 = 0
            kotlin.io.CloseableKt.closeFinally(r7, r11)     // Catch:{ all -> 0x008f }
            kotlin.io.CloseableKt.closeFinally(r13, r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x008f:
            r11 = move-exception
            goto L_0x0098
        L_0x0091:
            r11 = move-exception
        L_0x0092:
            throw r11     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r11)     // Catch:{ all -> 0x008f }
            throw r12     // Catch:{ all -> 0x008f }
        L_0x0098:
            throw r11     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r13, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc8.q(java.io.File, java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public r3 t(Context context, String str, sx6 sx6) {
        r3 r3Var = new r3();
        int h = sx6.h(context, str, true);
        r3Var.b = h;
        if (h != 0) {
            r3Var.c = 1;
        } else {
            int g = sx6.g(context, str);
            r3Var.a = g;
            if (g != 0) {
                r3Var.c = -1;
            }
        }
        return r3Var;
    }

    public boolean u(ca6 ca6) {
        String str = ca6.Z;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
