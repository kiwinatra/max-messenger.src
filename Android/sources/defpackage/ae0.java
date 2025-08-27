package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* renamed from: ae0  reason: default package */
public final /* synthetic */ class ae0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ae0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                k2b k2b = (k2b) obj;
                fu4.k.e(this.b).f().getIcon().getClass();
                return -1;
            case 1:
                k2b k2b2 = (k2b) obj;
                fu4.k.e(this.b).f().c().getClass();
                return -1728053248;
            default:
                CharSequence a2 = ((ngf) obj).a(this.b);
                return a2 == null ? "" : a2;
        }
    }
}
