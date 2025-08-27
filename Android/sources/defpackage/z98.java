package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: z98  reason: default package */
public final /* synthetic */ class z98 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa8 b;
    public final /* synthetic */ List c;

    public /* synthetic */ z98(oa8 oa8, List list, int i) {
        this.a = i;
        this.b = oa8;
        this.c = list;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.v.put(this.c);
                return Unit.INSTANCE;
            default:
                this.b.x.put(this.c);
                return Unit.INSTANCE;
        }
    }
}
