package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: kg3  reason: default package */
public final class kg3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg3 b;
    public final /* synthetic */ ig3 c;

    public /* synthetic */ kg3(lg3 lg3, ig3 ig3, int i) {
        this.a = i;
        this.b = lg3;
        this.c = ig3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Function1<ig3, Unit> onAnimationEnded = this.b.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke(this.c);
                }
                return Unit.INSTANCE;
            case 1:
                Function1<ig3, Unit> onAnimationEnded2 = this.b.getOnAnimationEnded();
                if (onAnimationEnded2 != null) {
                    onAnimationEnded2.invoke(this.c);
                }
                return Unit.INSTANCE;
            default:
                lg3 lg3 = this.b;
                lg3.N0();
                Function1<ig3, Unit> onAnimationEnded3 = lg3.getOnAnimationEnded();
                if (onAnimationEnded3 != null) {
                    onAnimationEnded3.invoke(this.c);
                }
                return Unit.INSTANCE;
        }
    }
}
