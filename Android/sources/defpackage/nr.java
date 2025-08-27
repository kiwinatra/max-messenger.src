package defpackage;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nr  reason: default package */
public final /* synthetic */ class nr implements t32, FunctionAdapter {
    public final /* synthetic */ as a;

    public nr(as asVar) {
        this.a = asVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t32) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, as.class, "backgroundSelected", "backgroundSelected(Lone/me/appearancesettings/model/ChatBackground;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
