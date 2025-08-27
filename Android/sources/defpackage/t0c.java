package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: t0c  reason: default package */
public final class t0c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditScreen b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0c(ProfileEditScreen profileEditScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.b = profileEditScreen;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t0c t0c = new t0c(this.b, this.c, continuation);
        t0c.a = obj;
        return t0c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t0c) create((azb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        azb azb = (azb) this.a;
        KProperty[] kPropertyArr = ProfileEditScreen.w0;
        ProfileEditScreen profileEditScreen = this.b;
        profileEditScreen.getClass();
        KProperty[] kPropertyArr2 = ProfileEditScreen.w0;
        KProperty kProperty = kPropertyArr2[4];
        ReadOnlyProperty readOnlyProperty = profileEditScreen.X;
        ((OneMeAvatarView) readOnlyProperty.getValue(profileEditScreen, kProperty)).setAvatarUrl(azb.a);
        OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) readOnlyProperty.getValue(profileEditScreen, kPropertyArr2[4]);
        CharSequence charSequence = azb.d;
        if (charSequence == null) {
            charSequence = "";
        }
        oneMeAvatarView.f(new gd0(charSequence, azb.b), true);
        ((OneMeAvatarView) readOnlyProperty.getValue(profileEditScreen, kPropertyArr2[4])).setAddBadgeVisibility(azb.f);
        int ordinal = azb.g.ordinal();
        boolean z = azb.e;
        if (ordinal == 0) {
            sn0 sn0 = profileEditScreen.v0;
            if (!sn0.isInitialized()) {
                ((ViewGroup) this.c).addView((View) sn0.getValue());
            }
            OneMeButton oneMeButton = (OneMeButton) sn0.getValue();
            int i = 0;
            oneMeButton.setVisibility(z ? 0 : 8);
            if (z) {
                i = (MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density) * 2) + oneMeButton.getMeasuredHeight();
            }
            RecyclerView recyclerView = (RecyclerView) profileEditScreen.x.getValue(profileEditScreen, kPropertyArr2[1]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i);
        } else if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            profileEditScreen.c0().setRightActions(new r2b(new n0c(profileEditScreen, 5)));
        } else {
            profileEditScreen.c0().setRightActions(s2b.a);
        }
        return Unit.INSTANCE;
    }
}
