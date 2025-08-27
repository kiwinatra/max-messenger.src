package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.CloseableKt;

/* renamed from: tvb  reason: default package */
public final class tvb {
    public final Lazy a;
    public final Lazy b;

    public tvb() {
        this.a = LazyKt.lazy(atg.a);
        this.b = LazyKt.lazy(tsg.a);
    }

    public static svb a() {
        String str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            try {
                StringBuilder sb = new StringBuilder();
                for (String readLine = randomAccessFile.readLine(); readLine != null; readLine = randomAccessFile.readLine()) {
                    sb.append(readLine);
                }
                str = sb.toString();
                CloseableKt.closeFinally(randomAccessFile, (Throwable) null);
            } catch (Throwable th) {
                CloseableKt.closeFinally(randomAccessFile, th);
                throw th;
            }
        } catch (IOException unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        List y = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        if (y.size() <= 22) {
            return null;
        }
        try {
            return new svb(Long.parseLong((String) y.get(13)), Long.parseLong((String) y.get(14)), Long.parseLong((String) y.get(15)), Long.parseLong((String) y.get(16)), Long.parseLong((String) y.get(21)));
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public tvb(Lazy lazy) {
        Lazy lazy2 = rjd.f;
        this.a = lazy;
        this.b = lazy2;
    }
}
