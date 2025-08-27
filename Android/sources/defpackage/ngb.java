package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: ngb  reason: default package */
public final /* synthetic */ class ngb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ ngb(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final Object invoke(Object obj) {
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = PickSubscribersScreen.w0;
                fma onBackPressedDispatcher = pickSubscribersScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            default:
                ble ble = (ble) obj;
                ble.o1();
                KProperty[] kPropertyArr2 = PickSubscribersScreen.w0;
                pickSubscribersScreen.getClass();
                KProperty kProperty = PickSubscribersScreen.w0[1];
                ble.Y0(ble.n1(((Number) pickSubscribersScreen.z.a(pickSubscribersScreen)).longValue()));
                return Unit.INSTANCE;
        }
    }
}
