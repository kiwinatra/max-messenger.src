package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.reflect.KProperty;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: nk7  reason: default package */
public final class nk7 extends ConstraintLayout implements phf {
    public final /* synthetic */ InviteByPhoneScreen E0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk7(InviteByPhoneScreen inviteByPhoneScreen, Context context) {
        super(context);
        this.E0 = inviteByPhoneScreen;
    }

    public final void onThemeChanged(k2b k2b) {
        KProperty[] kPropertyArr = InviteByPhoneScreen.z0;
        InviteByPhoneScreen inviteByPhoneScreen = this.E0;
        inviteByPhoneScreen.getClass();
        KProperty[] kPropertyArr2 = InviteByPhoneScreen.z0;
        ((TextView) inviteByPhoneScreen.w.getValue(inviteByPhoneScreen, kPropertyArr2[1])).setTextColor(k2b.getText().e);
        ((TextView) inviteByPhoneScreen.x.getValue(inviteByPhoneScreen, kPropertyArr2[2])).setTextColor(k2b.getText().f);
        AppCompatTextView appCompatTextView = inviteByPhoneScreen.Y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(k2b.getText().b);
        }
        inviteByPhoneScreen.e0().onThemeChanged(k2b);
        inviteByPhoneScreen.d0().e();
        ((h3b) inviteByPhoneScreen.X.getValue(inviteByPhoneScreen, kPropertyArr2[5])).onThemeChanged(k2b);
    }
}
