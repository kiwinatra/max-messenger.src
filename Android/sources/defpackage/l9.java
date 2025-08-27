package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: l9  reason: default package */
public final class l9 implements Function1 {
    public static final l9 b = new l9(0);
    public static final l9 c = new l9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ l9(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return String.valueOf(((WeakReference) obj).get());
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                h3b.E0.getClass();
                h3b.G0 = booleanValue;
                return Unit.INSTANCE;
        }
    }
}
