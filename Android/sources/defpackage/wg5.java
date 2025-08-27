package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: wg5  reason: default package */
public final class wg5 extends SuspendLambda implements Function3 {
    public /* synthetic */ ConstraintLayout a;
    public /* synthetic */ k2b b;
    public final /* synthetic */ FakeInAppReviewBottomSheet c;
    public final /* synthetic */ AppCompatTextView o;
    public final /* synthetic */ AppCompatTextView v;
    public final /* synthetic */ AppCompatTextView w;
    public final /* synthetic */ tpc x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, tpc tpc, Continuation continuation) {
        super(3, continuation);
        this.c = fakeInAppReviewBottomSheet;
        this.o = appCompatTextView;
        this.v = appCompatTextView2;
        this.w = appCompatTextView3;
        this.x = tpc;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatTextView appCompatTextView = this.w;
        tpc tpc = this.x;
        wg5 wg5 = new wg5(this.c, this.o, this.v, appCompatTextView, tpc, (Continuation) obj3);
        wg5.a = (ConstraintLayout) obj;
        wg5.b = (k2b) obj2;
        return wg5.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ConstraintLayout constraintLayout = this.a;
        k2b k2b = this.b;
        js9 js9 = fu4.k;
        boolean g = js9.e(constraintLayout.getContext()).g();
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.c;
        fakeInAppReviewBottomSheet.z0.getPaint().setColor(k2b.h().j);
        fakeInAppReviewBottomSheet.B0.getPaint().setColor(g ? -14860999 : -1969940);
        this.o.setTextColor(k2b.getText().e);
        this.v.setTextColor(k2b.getText().h);
        this.w.setTextColor(this.x.getSelected() != 0 ? -1 : js9.e(constraintLayout.getContext()).f().getText().h);
        constraintLayout.invalidate();
        return Unit.INSTANCE;
    }
}
