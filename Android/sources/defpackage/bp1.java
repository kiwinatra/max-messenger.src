package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* renamed from: bp1  reason: default package */
public final /* synthetic */ class bp1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ Lazy c;

    public /* synthetic */ bp1(Lazy lazy, Lazy lazy2, int i) {
        this.a = i;
        this.b = lazy;
        this.c = lazy2;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [aqg, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return CoroutineContext.Element.DefaultImpls.plus(kr7.b(), ((osa) ((gaf) this.b.getValue())).b()).plus((CoroutineContext) this.c.getValue());
            case 1:
                return e14.a(CoroutineContext.Element.DefaultImpls.plus(kv0.b(), ((osa) ((gaf) this.b.getValue())).a().s0(1, "non-contacts")).plus((CoroutineContext) this.c.getValue()));
            case 2:
                return e14.a(((osa) ((gaf) this.b.getValue())).b().s0(1, "shortcuts").plus((CoroutineContext) this.c.getValue()));
            default:
                Lazy lazy = this.b;
                Lazy lazy2 = this.c;
                ? obj = new Object();
                obj.a = lazy;
                obj.b = lazy2;
                obj.c = LazyKt.lazy(new ifb(9, obj));
                return obj;
        }
    }
}
