package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: dm8  reason: default package */
public final class dm8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ MediaBarWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm8(Continuation continuation, LinearLayout linearLayout, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = linearLayout;
        this.c = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dm8 dm8 = new dm8(continuation, this.b, this.c);
        dm8.a = obj;
        return dm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dm8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xqd xqd;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = ((Boolean) this.a).booleanValue() ? 0 : 8;
        LinearLayout linearLayout = this.b;
        linearLayout.setVisibility(i);
        KProperty[] kPropertyArr = MediaBarWidget.c1;
        MediaBarWidget mediaBarWidget = this.c;
        mediaBarWidget.getClass();
        KProperty[] kPropertyArr2 = MediaBarWidget.c1;
        KProperty kProperty = kPropertyArr2[12];
        RecyclerView recyclerView = (RecyclerView) mediaBarWidget.G0.getValue();
        if (linearLayout.getVisibility() == 0) {
            KProperty kProperty2 = kPropertyArr2[11];
            xqd = (xqd) mediaBarWidget.F0.getValue();
        } else {
            xqd = null;
        }
        recyclerView.setAdapter(xqd);
        return Unit.INSTANCE;
    }
}
