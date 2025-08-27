package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: ta1  reason: default package */
public final class ta1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5[] b;

    public /* synthetic */ ta1(bs5[] bs5Arr, int i) {
        this.a = i;
        this.b = bs5Arr;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new vk3[this.b.length];
            case 1:
                return new List[this.b.length];
            case 2:
                return new Object[this.b.length];
            case 3:
                return new cua[this.b.length];
            case 4:
                return new a32[this.b.length];
            default:
                return new njb[this.b.length];
        }
    }
}
