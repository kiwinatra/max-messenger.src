package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dr0  reason: default package */
public final class dr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        p6g b2;
        ViewGroup viewGroup = null;
        switch (this.a) {
            case 0:
                ((BottomAppBar$Behavior) this.b).getClass();
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                jk1 jk1 = (jk1) this.b;
                jk1.O(jk1.O0);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                gn1 gn1 = (gn1) this.b;
                gn1.U(gn1.c1);
                return;
            case 3:
                on1 on1 = (on1) this.b;
                if (on1.c != null && (b2 = on1.getVideoLayoutUpdatesController()) != null) {
                    b2.a(on1, on1.y);
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr = ChatScreen.d1;
                ChatScreen chatScreen = (ChatScreen) this.b;
                if (wgf.d(chatScreen.z0().getTitle())) {
                    ChatScreen.k0(chatScreen, chatScreen.z0(), true);
                    return;
                }
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                int e = a81.e((float) 32, vo4.c().getDisplayMetrics().density, ((FolderEditFragment) this.b).G1.e().getHeight());
                if (view.getHeight() > e) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        fj3 fj3 = (fj3) layoutParams;
                        fj3.height = e;
                        fj3.width = e;
                        view.setLayoutParams(fj3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    fj3 fj32 = (fj3) layoutParams2;
                    float f = (float) 80;
                    fj32.height = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
                    fj32.width = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                    view.setLayoutParams(fj32);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            case 6:
                view.removeOnLayoutChangeListener(this);
                ((Runnable) this.b).run();
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                oc9 oc9 = (oc9) this.b;
                ViewGroup viewGroup2 = (ViewGroup) oc9.b;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                int coerceAtLeast = RangesKt.coerceAtLeast(a81.e((float) 10, vo4.c().getDisplayMetrics().density, viewGroup2.getMeasuredWidth()) - oc9.L(), 0);
                ViewGroup viewGroup3 = (ViewGroup) oc9.b;
                if (viewGroup3 != null) {
                    viewGroup = viewGroup3;
                }
                b59.x(0, 0, coerceAtLeast, 0, viewGroup, oc9.Q());
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                String str = ((xo9) this.b).f;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, wj6.i(((xo9) this.b).b.c, "Scroll: Highlighted from args message with id="), (Throwable) null);
                }
                xo9 xo9 = (xo9) this.b;
                xo9.e.j(TuplesKt.to(Long.valueOf(xo9.b.c), ((xo9) this.b).b.d));
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                OneMeContactsChipGroup oneMeContactsChipGroup = (OneMeContactsChipGroup) this.b;
                oneMeContactsChipGroup.getEditText().getHitRect(oneMeContactsChipGroup.y0);
                Rect rect = oneMeContactsChipGroup.z0;
                rect.set(oneMeContactsChipGroup.y0);
                rect.left = rect.right;
                rect.right = oneMeContactsChipGroup.getRight();
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                ((pza) this.b).E0.start();
                return;
            case 11:
                h3b.e((h3b) this.b);
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                ((wfb) this.b).setHalfScreen((Function2<? super Float, ? super Float, Unit>) null);
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr2 = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                if (wgf.d(profileScreen.e0().getTitle())) {
                    ProfileScreen.c0(profileScreen, profileScreen.e0(), true);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                ((RecordControlsWidget) this.b).K0();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                view.removeOnLayoutChangeListener(this);
                ((Function0) this.b).invoke();
                return;
            case 16:
                ((gmd) this.b).adjustDropDownSizeAndPosition();
                return;
            case LangUtils.HASH_SEED /*17*/:
                rmf rmf = (rmf) this.b;
                rmf.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rmf.T0 = iArr[0];
                view.getWindowVisibleDisplayFrame(rmf.M0);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr4 = WebAppRootScreen.D0;
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.b;
                if (wgf.d(webAppRootScreen.o0().getTitle())) {
                    WebAppRootScreen.s0(webAppRootScreen.o0(), true);
                    return;
                }
                return;
        }
    }
}
