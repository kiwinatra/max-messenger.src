package defpackage;

import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wv1  reason: default package */
public final /* synthetic */ class wv1 implements dla, FunctionAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wv1(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof dla) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof dla) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
        }
    }

    public final Function getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
