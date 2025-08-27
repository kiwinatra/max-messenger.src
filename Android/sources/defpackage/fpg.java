package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: fpg  reason: default package */
public final /* synthetic */ class fpg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fpg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new kpg((hs7) this.b, ((ipg) this.c).d);
            default:
                ((t84) this.b).o.onClick((View) this.c);
                return Unit.INSTANCE;
        }
    }
}
