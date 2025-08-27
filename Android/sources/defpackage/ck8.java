package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* renamed from: ck8  reason: default package */
public final class ck8 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ MediaBarPermissionWidget b;
    public final /* synthetic */ FrameLayout c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ck8(MediaBarPermissionWidget mediaBarPermissionWidget, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.b = mediaBarPermissionWidget;
        this.c = frameLayout;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ck8 ck8 = new ck8(this.b, this.c, continuation);
        ck8.a = ((Boolean) obj).booleanValue();
        return ck8;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ck8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        View view;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        if (z) {
            view = ((at1) mediaBarPermissionWidget.o.getValue()).getRootView();
            ct.G(view, 300, new bk8(mediaBarPermissionWidget, 2));
        } else {
            KProperty[] kPropertyArr = MediaBarPermissionWidget.x;
            mediaBarPermissionWidget.getClass();
            KProperty kProperty = MediaBarPermissionWidget.x[0];
            view = (LinearLayout) mediaBarPermissionWidget.c.getValue();
        }
        FrameLayout frameLayout = this.c;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
        return Unit.INSTANCE;
    }
}
