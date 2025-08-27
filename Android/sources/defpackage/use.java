package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: use  reason: default package */
public final class use implements oa4 {
    public static final use a = new Object();
    public static final vse b = vse.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        vse.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) vse.c)) {
            return new ab4(str, ra4, bundle, za4.a, new xa4(new dle(5), new dle(6)), new oxb(o54.L("sticker_id", bundle), (Parcelable) bundle, 3));
        }
        throw new IllegalStateException(tr1.i("invalid route ", ra4));
    }
}
