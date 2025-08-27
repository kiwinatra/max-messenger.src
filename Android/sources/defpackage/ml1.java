package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ml1  reason: default package */
public final class ml1 extends ibf {
    public final String c;
    public final long o;
    public final long v;
    public final long w;

    public /* synthetic */ ml1() {
        this(0, 0, 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1 = (ml1) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) ml1.c) && this.o == ml1.o && this.v == ml1.v && this.w == ml1.w;
    }

    public final int hashCode() {
        return Long.hashCode(this.w) + wzf.i(wzf.i(this.c.hashCode() * 31, 31, this.o), 31, this.v);
    }

    public final String toString() {
        String str = this.c;
        return wj6.m(tr1.p("Response(token=", StringsKt.replaceRange((CharSequence) str, 0, str.length(), (CharSequence) "*").toString(), " expiredDurationSec="), this.o, ")");
    }

    public ml1(long j, long j2, long j3, String str) {
        this.c = str;
        this.o = j;
        this.v = j2;
        this.w = j3;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j3));
    }
}
