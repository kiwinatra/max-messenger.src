package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fpf  reason: default package */
public final class fpf {
    public static final fpf a = new Object();
    public static volatile epf b = wc8.w;

    public static void a(String str, long j, TimeUnit timeUnit, Pair... pairArr) {
        String str2;
        switch (suf.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                str2 = "ns";
                break;
            case 2:
                str2 = "us";
                break;
            case 3:
                str2 = "ms";
                break;
            case 4:
                str2 = "s";
                break;
            case 5:
                str2 = "min";
                break;
            case 6:
                str2 = "h";
                break;
            case 7:
                str2 = "d";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str3 = str2;
        Map mapOf = MapsKt.mapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        epf epf = b;
        if (!Intrinsics.areEqual((Object) epf, (Object) wc8.w) && !Intrinsics.areEqual((Object) epf, (Object) sx6.y)) {
            ipf.a(new qof(2, new wbb((SystemClock.elapsedRealtimeNanos() + jsb.a) - jsb.b, str, j, str3, mapOf)));
        }
    }
}
