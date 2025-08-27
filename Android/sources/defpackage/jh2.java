package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: jh2  reason: default package */
public final /* synthetic */ class jh2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ jh2(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj) {
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
                fma onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = ChatMediaViewerScreen.H0;
                chatMediaViewerScreen.r0().z(cra.l);
                return Unit.INSTANCE;
        }
    }
}
