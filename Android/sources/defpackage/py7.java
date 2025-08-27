package defpackage;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: py7  reason: default package */
public final /* synthetic */ class py7 implements FunctionAdapter {
    public final /* synthetic */ qy7 a;

    public py7(qy7 qy7) {
        this.a = qy7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof py7) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, qy7.class, "onMessageElementClick", "onMessageElementClick(Landroid/view/View;Lru/ok/tamtam/models/MessageElementData;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
