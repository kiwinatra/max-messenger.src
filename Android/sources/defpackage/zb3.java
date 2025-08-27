package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: zb3  reason: default package */
public final class zb3 extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb3(bc3 bc3, int i) {
        super(0);
        this.a = i;
        this.b = bc3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                bc3 bc3 = this.b;
                return new pdd(bc3.getApplication(), bc3, bc3.getIntent() != null ? bc3.getIntent().getExtras() : null);
            case 1:
                this.b.reportFullyDrawn();
                return Unit.INSTANCE;
            case 2:
                bc3 bc32 = this.b;
                return new xi6(bc32.reportFullyDrawnExecutor, new zb3(bc32, 1));
            case 3:
                bc3 bc33 = this.b;
                fma fma = new fma(new nb3(bc33, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new ir1(10, bc33, fma));
                    } else {
                        bc3.access$addObserverForBackInvoker(bc33, fma);
                    }
                }
                return fma;
            case 4:
                return this.b.getDefaultViewModelProviderFactory();
            case 5:
                return this.b.getViewModelStore();
            default:
                return this.b.getDefaultViewModelCreationExtras();
        }
    }
}
