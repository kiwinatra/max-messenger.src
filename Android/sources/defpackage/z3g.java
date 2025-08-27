package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3g  reason: default package */
public final /* synthetic */ class z3g implements hd6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ sk3 c;

    public /* synthetic */ z3g(Runnable runnable, sk3 sk3, int i) {
        this.a = i;
        this.b = runnable;
        this.c = sk3;
    }

    public final void b(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                c4g c4g = (c4g) bundle.getParcelable("VideoCompressionModeDialog:result:key");
                if (c4g != null) {
                    if (Intrinsics.areEqual((Object) c4g, (Object) a4g.a)) {
                        Runnable runnable = this.b;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    } else if (c4g instanceof b4g) {
                        this.c.accept(((b4g) c4g).a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                y7g y7g = (y7g) bundle.getParcelable("VideoQualityPickerDialog:result:key");
                if (y7g != null) {
                    if (Intrinsics.areEqual((Object) y7g, (Object) w7g.a)) {
                        Runnable runnable2 = this.b;
                        if (runnable2 != null) {
                            runnable2.run();
                            return;
                        }
                        return;
                    } else if (y7g instanceof x7g) {
                        this.c.accept(((x7g) y7g).a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
        }
    }
}
