package defpackage;

import android.content.Context;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* renamed from: zp  reason: default package */
public final /* synthetic */ class zp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cq c;
    public final /* synthetic */ ed4 o;

    public /* synthetic */ zp(ed4 ed4, cq cqVar, Context context) {
        this.a = 3;
        this.o = ed4;
        this.c = cqVar;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                cq cqVar = this.c;
                pwa b2 = cqVar.b();
                return new mu4(this.b, (ltb) cqVar.n.getValue(), b2, this.o);
            case 1:
                return new bnb(this.b, this.c.b(), this.o);
            case 2:
                return new r68(this.b, this.c.b(), this.o);
            case 3:
                return new pu8(this.o.a(), LazyKt.lazy(new aq(this.c, 1)), new bq(this.b));
            default:
                cq cqVar2 = this.c;
                return new k18(this.b, cqVar2.b(), cqVar2.a(), this.o, (yaf) cqVar2.m.getValue());
        }
    }

    public /* synthetic */ zp(Context context, cq cqVar, ed4 ed4, int i) {
        this.a = i;
        this.b = context;
        this.c = cqVar;
        this.o = ed4;
    }

    public /* synthetic */ zp(Context context, cq cqVar, ed4 ed4, ipg ipg) {
        this.a = 0;
        this.b = context;
        this.c = cqVar;
        this.o = ed4;
    }
}
