package defpackage;

import java.util.function.IntPredicate;

/* renamed from: uk3  reason: default package */
public final /* synthetic */ class uk3 implements IntPredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ uk3(int i) {
        this.a = i;
    }

    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                return i == 1;
            default:
                return ev0.r(i) || i == 8205 || i == 8419;
        }
    }
}
