package defpackage;

import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* renamed from: mn2  reason: default package */
public final /* synthetic */ class mn2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ mn2(AdaptedFunctionReference adaptedFunctionReference, int i) {
        this.a = i;
        this.b = (Function1) adaptedFunctionReference;
    }

    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }
}
