package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* renamed from: bh3  reason: default package */
public final /* synthetic */ class bh3 implements hd6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ bh3(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    public final void b(String str, Bundle bundle) {
        ah3 ah3;
        xfb xfb;
        switch (this.a) {
            case 0:
                ah3.a.getClass();
                ah3[] values = ah3.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        ah3 = values[i];
                        if (!bundle.containsKey(ah3.name())) {
                            i++;
                        }
                    } else {
                        ah3 = null;
                    }
                }
                if (ah3 != null) {
                    int ordinal = ah3.ordinal();
                    if (ordinal == 0) {
                        this.b.invoke();
                        return;
                    } else if (ordinal == 1) {
                        this.c.invoke();
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                xfb.a.getClass();
                xfb[] values2 = xfb.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        xfb = values2[i2];
                        if (!bundle.containsKey(xfb.name())) {
                            i2++;
                        }
                    } else {
                        xfb = null;
                    }
                }
                if (xfb != null) {
                    int ordinal2 = xfb.ordinal();
                    if (ordinal2 == 0) {
                        this.b.invoke();
                        return;
                    } else if (ordinal2 == 1) {
                        this.c.invoke();
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
