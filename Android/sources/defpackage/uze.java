package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: uze  reason: default package */
public final /* synthetic */ class uze implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq9 b;

    public /* synthetic */ uze(kq9 kq9, int i) {
        this.a = i;
        this.b = kq9;
    }

    public final Object invoke(Object obj) {
        vk3 vk3 = (vk3) obj;
        switch (this.a) {
            case 0:
                if (!vk3.x()) {
                    this.b.getClass();
                }
                return true;
            case 1:
                return this.b.i(vk3, "@");
            case 2:
                return this.b.i(vk3, "@");
            default:
                if (!vk3.x()) {
                    this.b.getClass();
                }
                return true;
        }
    }
}
