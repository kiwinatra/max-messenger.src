package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: vze  reason: default package */
public final /* synthetic */ class vze implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq9 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vze(kq9 kq9, String str, int i) {
        this.a = i;
        this.b = kq9;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        vk3 vk3 = (vk3) obj;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((tld) this.b.a).g(vk3, this.c));
            case 1:
                return ((tld) this.b.a).b(vk3, this.c);
            default:
                return this.b.i(vk3, this.c);
        }
    }
}
