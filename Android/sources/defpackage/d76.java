package defpackage;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;
import ru.ok.utils.widgets.BadgeCountView;

/* renamed from: d76  reason: default package */
public final class d76 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersPickerFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d76(FoldersPickerFragment foldersPickerFragment, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d76 d76 = new d76(this.b, continuation);
        d76.a = obj;
        return d76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d76) create((z76) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z76 z76 = (z76) this.a;
        FoldersPickerFragment foldersPickerFragment = this.b;
        foldersPickerFragment.getClass();
        boolean z = z76.a;
        int i = 8;
        b76 b76 = foldersPickerFragment.H1;
        if (z) {
            b76.getClass();
            ((LinearLayout) b76.Y.getValue(b76, b76.x0[8])).setVisibility(0);
            b76.d().setVisibility(8);
            b76.e().setVisibility(8);
        } else {
            b76.getClass();
            KProperty[] kPropertyArr = b76.x0;
            ((LinearLayout) b76.Y.getValue(b76, kPropertyArr[8])).setVisibility(8);
            b76.d().setVisibility(0);
            ((ekb) b76.d().getAdapter()).G(z76.b);
            List list = z76.c;
            boolean isEmpty = list.isEmpty();
            w28 w28 = b76.X;
            ch chVar = foldersPickerFragment.F1;
            if (isEmpty) {
                LinearLayout linearLayout = (LinearLayout) w28.getValue(b76, kPropertyArr[7]);
                if (linearLayout.getVisibility() == 0 && foldersPickerFragment.L1 == null) {
                    dm4 dm4 = foldersPickerFragment.K1;
                    if (dm4 != null) {
                        dm4.f();
                    }
                    foldersPickerFragment.K1 = null;
                    dm4 m = chVar.m(linearLayout);
                    m.v(new c76(linearLayout, foldersPickerFragment, 0));
                    foldersPickerFragment.L1 = m;
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) w28.getValue(b76, kPropertyArr[7]);
                if (linearLayout2.getVisibility() != 0 && foldersPickerFragment.K1 == null) {
                    dm4 dm42 = foldersPickerFragment.L1;
                    if (dm42 != null) {
                        dm42.f();
                    }
                    foldersPickerFragment.L1 = null;
                    dm4 j = chVar.j(linearLayout2);
                    j.v(new c76(linearLayout2, foldersPickerFragment, 1));
                    foldersPickerFragment.K1 = j;
                }
            }
            lqd lqd = (lqd) b76.f().getAdapter();
            lqd.H(list, new uo5(5, (Object) lqd, (Object) foldersPickerFragment));
            ((BadgeCountView) b76.y.getValue(b76, kPropertyArr[5])).setCount(list.size());
            Button e = b76.e();
            if (list.isEmpty() && z76.d) {
                i = 0;
            }
            e.setVisibility(i);
            b76.e().setText(z76.e);
            KProperty kProperty = kPropertyArr[3];
            boolean z2 = z76.f;
            ((ImageView) b76.w.getValue(b76, kProperty)).setEnabled(z2);
            ((FrameLayout) b76.x.getValue(b76, kPropertyArr[4])).setAlpha(z2 ? 1.0f : 0.5f);
        }
        return Unit.INSTANCE;
    }
}
