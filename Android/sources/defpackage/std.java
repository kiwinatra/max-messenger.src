package defpackage;

import kotlin.Function;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: std  reason: default package */
public final /* synthetic */ class std implements FunctionAdapter {
    public final /* synthetic */ c37 a;

    public std(c37 c37) {
        this.a = c37;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof std) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function getFunctionDelegate() {
        return new AdaptedFunctionReference(1, this.a, c37.class, "onNewHost", "onNewHost(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
