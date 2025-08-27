package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: d6f  reason: default package */
public final /* synthetic */ class d6f implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6f b;

    public /* synthetic */ d6f(f6f f6f, int i) {
        this.a = i;
        this.b = f6f;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                return f6f.b(this.b, floatValue, f.floatValue());
            default:
                f.getClass();
                return f6f.a(this.b, floatValue);
        }
    }
}
