package defpackage;

import android.content.Intent;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: iz1  reason: default package */
public final /* synthetic */ class iz1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ iz1() {
        this.a = 0;
        this.b = null;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((w62) obj).h = this.b;
                return Unit.INSTANCE;
            case 1:
                ((w62) obj).g = this.b;
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(((eo3) obj).a.equals(this.b));
            case 3:
                return Boolean.valueOf(Intrinsics.areEqual((Object) ((iqd) obj).a, (Object) this.b));
            case 4:
                Intent intent = (Intent) obj;
                String str = this.b;
                if (str != null) {
                    intent.putExtra("external_callback_param_arg", str);
                }
                return Unit.INSTANCE;
            case 5:
                ThreadsKt.thread$default(true, true, (ClassLoader) null, "watchdog-" + this.b, 0, new ha5((Runnable) obj, 3), 20, (Object) null);
                return Unit.INSTANCE;
            case 6:
                ThreadsKt.thread$default(true, true, (ClassLoader) null, "watchdog-" + this.b, 0, new ha5((Runnable) obj, 2), 20, (Object) null);
                return Unit.INSTANCE;
            default:
                String str2 = (String) obj;
                return Boolean.valueOf(str2.length() > 0 && sjd.a.w().h(str2, this.b));
        }
    }

    public /* synthetic */ iz1(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
