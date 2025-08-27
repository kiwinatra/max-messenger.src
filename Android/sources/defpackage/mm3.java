package defpackage;

import java.util.function.Function;

/* renamed from: mm3  reason: default package */
public final /* synthetic */ class mm3 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ mm3(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((pm3) obj).c;
            case 1:
                return ((er3) obj).b;
            case 2:
                return Long.valueOf(((vk3) obj).r());
            case 3:
                return Long.valueOf(((fo3) obj).a);
            case 4:
                return Long.valueOf(((ald) obj).o.a);
            case 5:
                return Long.valueOf(((ald) obj).v.r());
            case 6:
                return ((pm3) obj).a();
            case 7:
                return Long.valueOf(((ald) obj).o.b.a);
            default:
                return Long.valueOf(((ald) obj).v.r());
        }
    }
}
