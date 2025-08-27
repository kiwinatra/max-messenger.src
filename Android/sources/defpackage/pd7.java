package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: pd7  reason: default package */
public final /* synthetic */ class pd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ pd7(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        int i = this.b;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    String str = yd7.C0;
                    z68.f(str, "prefetch " + i + " fetchVirtualAlbums() completed by error", th);
                }
                return Unit.INSTANCE;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    String str2 = yd7.C0;
                    z68.f(str2, "prefetch " + i + " fetchRealAlbums() completed by error", th2);
                }
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr = OneMeButton.z0;
                return Boolean.valueOf(((View) obj).getId() != i);
        }
    }
}
