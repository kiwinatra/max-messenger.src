package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: im5  reason: default package */
public final /* synthetic */ class im5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm5 b;

    public /* synthetic */ im5(jm5 jm5, int i) {
        this.a = i;
        this.b = jm5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
            case 1:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
            default:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
        }
    }
}
