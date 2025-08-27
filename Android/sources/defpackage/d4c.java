package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* renamed from: d4c  reason: default package */
public final /* synthetic */ class d4c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileMemberPermissionsScreen b;

    public /* synthetic */ d4c(ProfileMemberPermissionsScreen profileMemberPermissionsScreen, int i) {
        this.a = i;
        this.b = profileMemberPermissionsScreen;
    }

    public final Object invoke(Object obj) {
        ProfileMemberPermissionsScreen profileMemberPermissionsScreen = this.b;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                int i = ProfileMemberPermissionsScreen.o;
                profileMemberPermissionsScreen.getClass();
                h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
                d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                d.setTitle(ixa.E1);
                d.setForm(z2b.a);
                d.setTextShimmerEnabled(false);
                d.setLeftActions(new p2b(new d4c(profileMemberPermissionsScreen, 1)));
                linearLayout.addView(d);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setLayoutParams(new fj3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileMemberPermissionsScreen.c);
                recyclerView.setItemAnimator((yyc) null);
                ez9 ez9 = ri7.a;
                ez9 ez92 = new ez9(1);
                ez92.g(2048);
                recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new pbb(7, profileMemberPermissionsScreen, ez92), (h9) null, 12));
                float f = (float) 6;
                int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
                int i2 = ki7.a;
                bz9 bz9 = new bz9();
                bz9.e(1024, 0);
                bz9.e(2048, roundToInt);
                int roundToInt2 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                bz9 bz92 = new bz9();
                bz92.e(1024, 0);
                bz92.e(2048, roundToInt2);
                int roundToInt3 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                int roundToInt4 = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                bz9 bz93 = new bz9();
                bz93.e(1024, roundToInt3);
                bz93.e(2048, roundToInt4);
                recyclerView.j(new ue8(bz93, bz9, bz92, 0));
                linearLayout.addView(recyclerView);
                return Unit.INSTANCE;
            default:
                View view = (View) obj;
                int i3 = ProfileMemberPermissionsScreen.o;
                xag.h(profileMemberPermissionsScreen.c0().w0, p33.b);
                return Unit.INSTANCE;
        }
    }
}
