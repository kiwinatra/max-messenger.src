package defpackage;

import java.util.function.Predicate;

/* renamed from: wg6  reason: default package */
public final /* synthetic */ class wg6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ wg6(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final boolean test(Object obj) {
        vk3 vk3 = (vk3) obj;
        switch (this.a) {
            case 0:
                return vk3.r() == this.b;
            default:
                return vk3.r() == this.b;
        }
    }
}
