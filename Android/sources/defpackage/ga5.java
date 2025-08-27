package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ga5  reason: default package */
public final /* synthetic */ class ga5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ la5 b;

    public /* synthetic */ ga5(la5 la5, int i) {
        this.a = i;
        this.b = la5;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                if (l != null) {
                    this.b.a(l.longValue());
                }
                return Unit.INSTANCE;
            case 1:
                String className = ((StackTraceElement) obj).getClassName();
                Package packageR = this.b.getClass().getPackage();
                String name = packageR != null ? packageR.getName() : null;
                if (name == null) {
                    name = "";
                }
                return Boolean.valueOf(!StringsKt__StringsJVMKt.startsWith$default(className, name, false, 2, (Object) null));
            default:
                Long l2 = (Long) obj;
                if (l2 != null) {
                    this.b.a(l2.longValue());
                }
                return Unit.INSTANCE;
        }
    }
}
