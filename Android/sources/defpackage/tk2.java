package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: tk2  reason: default package */
public final /* synthetic */ class tk2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk2 b;

    public /* synthetic */ tk2(uk2 uk2, int i) {
        this.a = i;
        this.b = uk2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b == uk2.DEFAULT);
            default:
                return Boolean.valueOf(this.b == uk2.SCHEDULED_SEND);
        }
    }
}
