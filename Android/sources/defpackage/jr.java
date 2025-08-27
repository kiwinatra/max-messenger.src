package defpackage;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jr  reason: default package */
public final /* synthetic */ class jr implements FunctionAdapter {
    public final /* synthetic */ as a;

    public jr(as asVar) {
        this.a = asVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jr) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, as.class, "modeSelected", "modeSelected(Lone/me/appearancesettings/model/AppearanceMode;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
