package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: brb  reason: default package */
public final /* synthetic */ class brb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ orb b;

    public /* synthetic */ brb(orb orb, int i) {
        this.a = i;
        this.b = orb;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                return orb.b(this.b, floatValue);
            case 1:
                return orb.c(this.b, floatValue, f.floatValue());
            default:
                f.getClass();
                return orb.a(this.b, floatValue);
        }
    }
}
