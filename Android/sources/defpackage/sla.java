package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import one.me.rlottie.network.LottieFetchCall;

/* renamed from: sla  reason: default package */
public final class sla implements LottieFetchCall {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final k4d a;

    public sla(k4d k4d) {
        this.a = k4d;
    }

    public final InputStream bodyByteStream() {
        ptc ptc = this.a.x;
        if (ptc != null) {
            return ptc.m();
        }
        throw new IOException("failed to get response body");
    }

    public final void close() {
        this.a.close();
    }

    public final String error() {
        k4d k4d = this.a;
        if (k4d.isSuccessful()) {
            return null;
        }
        return k4d.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r4 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r0, '/', 0, false, 6, (java.lang.Object) null) + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String fileName() {
        /*
            r4 = this;
            k4d r4 = r4.a
            java.lang.String r0 = "Content-Disposition"
            java.lang.String r4 = defpackage.k4d.a(r4, r0)
            r0 = 0
            if (r4 == 0) goto L_0x0034
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0012
            goto L_0x0034
        L_0x0012:
            r1 = 1
            java.util.regex.Pattern r2 = b     // Catch:{ IllegalStateException -> 0x0023 }
            java.util.regex.Matcher r4 = r2.matcher(r4)     // Catch:{ IllegalStateException -> 0x0023 }
            boolean r2 = r4.find()     // Catch:{ IllegalStateException -> 0x0023 }
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = r4.group(r1)     // Catch:{ IllegalStateException -> 0x0023 }
        L_0x0023:
            if (r0 == 0) goto L_0x0034
            r4 = 47
            r2 = 0
            r3 = 6
            int r4 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r0, (char) r4, (int) r2, false, (int) r3, (java.lang.Object) null)
            int r4 = r4 + r1
            if (r4 <= 0) goto L_0x0034
            java.lang.String r0 = r0.substring(r4)
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sla.fileName():java.lang.String");
    }

    public final boolean isSuccessful() {
        return this.a.isSuccessful();
    }

    public final int resultCode() {
        return this.a.o;
    }
}
