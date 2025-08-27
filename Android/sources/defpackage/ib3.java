package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ib3  reason: default package */
public final class ib3 {
    public final Object a;
    public final bw1 b;
    public final Function3 c;
    public final Object d;
    public final Throwable e;

    public ib3(Object obj, bw1 bw1, Function3 function3, Object obj2, Throwable th) {
        this.a = obj;
        this.b = bw1;
        this.c = function3;
        this.d = obj2;
        this.e = th;
    }

    public static ib3 a(ib3 ib3, bw1 bw1, CancellationException cancellationException, int i) {
        Object obj = ib3.a;
        if ((i & 2) != 0) {
            bw1 = ib3.b;
        }
        bw1 bw12 = bw1;
        Function3 function3 = ib3.c;
        Object obj2 = ib3.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = ib3.e;
        }
        ib3.getClass();
        return new ib3(obj, bw12, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib3)) {
            return false;
        }
        ib3 ib3 = (ib3) obj;
        return Intrinsics.areEqual(this.a, ib3.a) && Intrinsics.areEqual((Object) this.b, (Object) ib3.b) && Intrinsics.areEqual((Object) this.c, (Object) ib3.c) && Intrinsics.areEqual(this.d, ib3.d) && Intrinsics.areEqual((Object) this.e, (Object) ib3.e);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        bw1 bw1 = this.b;
        int hashCode2 = (hashCode + (bw1 == null ? 0 : bw1.hashCode())) * 31;
        Function3 function3 = this.c;
        int hashCode3 = (hashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib3(Object obj, bw1 bw1, Function3 function3, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : bw1, (i & 4) != 0 ? null : function3, (Object) null, (Throwable) (i & 16) != 0 ? null : cancellationException);
    }
}
