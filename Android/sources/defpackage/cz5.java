package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;

/* renamed from: cz5  reason: default package */
public final class cz5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderEditFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cz5(FolderEditFragment folderEditFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderEditFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cz5 cz5 = new cz5(this.b, continuation);
        cz5.a = obj;
        return cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cz5) create((zz5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zz5 zz5 = (zz5) this.a;
        FolderEditFragment folderEditFragment = this.b;
        folderEditFragment.G1.j().setText(zz5.g ? folderEditFragment.G2().getString(qad.B2) : folderEditFragment.G2().getString(qad.A5));
        bz5 bz5 = folderEditFragment.G1;
        boolean z = zz5.f;
        boolean z2 = zz5.g;
        boolean z3 = zz5.a;
        if (z3) {
            if (!z2 || !z) {
                folderEditFragment.m3();
            } else {
                View view = folderEditFragment.S0;
                if (view != null) {
                    view.postDelayed(new ne4(27, folderEditFragment), 300);
                }
            }
            bz5.f().clearFocus();
        } else if (folderEditFragment.M1.e()) {
            folderEditFragment.i3();
            folderEditFragment.M1.d();
            bz5.j().setVisibility(0);
        }
        ImageView d = bz5.d();
        e15 e15 = zz5.b;
        if (e15 != null) {
            x15 x15 = folderEditFragment.D1;
            x15.getClass();
            d.setImageDrawable(new de0((ce0) x15.b.getValue(), (yva) x15.a.getValue(), e15.c, 0));
            bz5.h().setVisibility(0);
        } else {
            Drawable mutate = ((Drawable) folderEditFragment.K1.getValue()).mutate();
            iq.a0(mutate, folderEditFragment.r1.x);
            d.setImageDrawable(mutate);
            bz5.h().setVisibility(8);
        }
        ((GradientDrawable) folderEditFragment.J1.getValue()).setStroke(MathKt.roundToInt(((float) 1) * folderEditFragment.R1().getDisplayMetrics().density), z3 ? folderEditFragment.r1.l : fw3.a(folderEditFragment.G2(), lad.b));
        if (z) {
            bz5.f().setText(zz5.e);
        }
        int counterMaxLength = bz5.g().getCounterMaxLength();
        int i = zz5.c;
        if (counterMaxLength != i) {
            bz5.g().setCounterMaxLength(i);
        }
        bz5.i().setText(z2 ? folderEditFragment.S1(qad.h3) : folderEditFragment.G2().getResources().getConfiguration().orientation == 2 ? folderEditFragment.S1(qad.S1) : folderEditFragment.S1(qad.H2));
        bz5.i().setEnabled(zz5.d);
        return Unit.INSTANCE;
    }
}
