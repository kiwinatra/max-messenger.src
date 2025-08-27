package defpackage;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* renamed from: rz5  reason: default package */
public final /* synthetic */ class rz5 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rz5(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            default:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }
}
