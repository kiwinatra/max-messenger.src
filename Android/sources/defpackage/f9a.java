package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;

/* renamed from: f9a  reason: default package */
public final class f9a {
    public static final /* synthetic */ f9a a = new Object();

    public static String a(k9a k9a) {
        if (k9a instanceof e9a) {
            return "auto," + ((e9a) k9a).b;
        } else if (Intrinsics.areEqual((Object) k9a, (Object) g9a.b)) {
            return "disabled";
        } else {
            if (k9a instanceof i9a) {
                i9a i9a = (i9a) k9a;
                DurationUnit durationUnit = DurationUnit.MINUTES;
                return g63.h("schedule,", Duration.m1397toIntimpl(i9a.b, durationUnit), Duration.m1397toIntimpl(i9a.c, durationUnit), ",");
            } else if (Intrinsics.areEqual((Object) k9a, (Object) j9a.b)) {
                return "system";
            } else {
                if (Intrinsics.areEqual((Object) k9a, (Object) h9a.b)) {
                    return "enabled";
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
