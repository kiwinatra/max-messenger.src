package one.me.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.WorkRequest;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/profile/ProfileScreen;", "Lone/me/sdk/arch/Widget;", "Lw5c;", "Lcx3;", "Lqg3;", "Lmd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Ltxb;", "type", "", "isOpenedFromDialog", "(JLtxb;Z)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileScreen.kt\none/me/profile/ProfileScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 11 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 12 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 13 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n*L\n1#1,1004:1\n235#2,10:1005\n410#2,8:1050\n410#2,8:1058\n410#2,8:1072\n410#2,8:1080\n8#3:1015\n1#4:1016\n24#5:1017\n24#5:1018\n24#5:1019\n24#5:1020\n28#5:1021\n24#5:1022\n24#5:1031\n24#5:1032\n24#5:1033\n24#5:1034\n24#5:1043\n24#5:1044\n24#5:1045\n24#5:1046\n24#5:1047\n24#5:1048\n24#5:1049\n28#5:1099\n24#5:1129\n142#6,8:1023\n142#6,8:1035\n65#6,4:1088\n37#6:1092\n53#6:1093\n72#6:1094\n375#6,2:1095\n387#6,2:1097\n157#6,8:1130\n32#7:1066\n17#7:1067\n19#7:1071\n46#8:1068\n51#8:1070\n105#9:1069\n37#10,2:1100\n135#11,3:1102\n138#11,8:1119\n33#12,14:1105\n10#13,2:1127\n*S KotlinDebug\n*F\n+ 1 ProfileScreen.kt\none/me/profile/ProfileScreen\n*L\n133#1:1005,10\n490#1:1050,8\n532#1:1058,8\n538#1:1072,8\n603#1:1080,8\n141#1:1015\n227#1:1017\n228#1:1018\n229#1:1019\n230#1:1020\n232#1:1021\n261#1:1022\n276#1:1031\n295#1:1032\n296#1:1033\n396#1:1034\n408#1:1043\n418#1:1044\n420#1:1045\n432#1:1046\n433#1:1047\n434#1:1048\n451#1:1049\n744#1:1099\n471#1:1129\n261#1:1023,8\n396#1:1035,8\n662#1:1088,4\n662#1:1092\n662#1:1093\n662#1:1094\n688#1:1095,2\n688#1:1097,2\n471#1:1130,8\n537#1:1066\n537#1:1067\n537#1:1071\n537#1:1068\n537#1:1070\n537#1:1069\n794#1:1100,2\n796#1:1102,3\n796#1:1119,8\n796#1:1105,14\n136#1:1127,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class ProfileScreen extends Widget implements w5c, cx3, qg3, md0 {
    public static final /* synthetic */ KProperty[] D0;
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final ReadOnlyProperty Z;
    public final w28 a;
    public final yh7 b;
    public final Lazy c;
    public final Lazy o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty v0;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty w0;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty x0;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty y0;
    public final ReadOnlyProperty z;
    public final ReadOnlyProperty z0;

    static {
        Class<ProfileScreen> cls = ProfileScreen.class;
        D0 = new KProperty[]{wj6.p(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), wj6.p(cls, "expandedTitle", "getExpandedTitle()Landroid/widget/TextView;", 0), wj6.p(cls, "expandedSubtitle", "getExpandedSubtitle()Landroid/widget/TextView;", 0), wj6.p(cls, "linkView", "getLinkView()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "dotDivider", "getDotDivider()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "moreToolStackButton", "getMoreToolStackButton()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool;", 0), wj6.p(cls, "phoneNumberView", "getPhoneNumberView()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0), wj6.p(cls, "linkButtonView", "getLinkButtonView()Landroid/widget/TextView;", 0), wj6.p(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ProfileScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new w28(new mxb(10), (Function0) null, 6);
        this.b = yh7.d;
        this.c = createViewModelLazy(k7c.class, new zfa(18, new bg2(bundle, 5)));
        this.o = LazyKt.lazy(LazyThreadSafetyMode.NONE, new n5c(this, 0));
        this.v = viewBinding(jxa.d1);
        this.w = viewBinding(jxa.l1);
        this.x = viewBinding(jxa.k1);
        this.y = viewBinding(jxa.f1);
        this.z = viewBinding(jxa.e1);
        this.X = viewBinding(jxa.i1);
        this.Y = viewBinding(jxa.h1);
        this.Z = viewBinding(jxa.U);
        this.v0 = viewBinding(jxa.E);
        this.w0 = viewBinding(jxa.Q0);
        this.x0 = viewBinding(jxa.c1);
        this.y0 = viewBinding(jxa.T);
        this.z0 = childSlotRouter(jxa.j1);
        jxb jxb = jxb.a;
        this.A0 = jxb.getAccessor().h(edb.class);
        this.B0 = jxb.getAccessor().h(z5a.class);
        this.C0 = jxb.getAccessor().h(tq1.class);
    }

    public static final void c0(ProfileScreen profileScreen, h3b h3b, boolean z2) {
        profileScreen.getClass();
        m2g S = m5a.S(wgf.f(h3b.getTitle()));
        l2g l2g = null;
        if (z2) {
            l2g b2 = wgf.b(h3b.getTitle());
            if ((b2 != null ? b2.a : null) == S) {
                return;
            }
        }
        if (z2) {
            l2g b3 = wgf.b(h3b.getTitle());
            if ((b3 != null ? b3.a : null) != S) {
                l2g = new l2g(h3b.getContext(), S, new oo9(26));
            }
        }
        wgf.e(h3b.getTitle(), l2g);
    }

    public final void a(String str, RectF rectF, Rect rect) {
        k7c g0 = g0();
        ev0.v(g0.a, ((osa) g0.n()).b(), (f14) null, new c7c(g0, str, rectF, (Continuation) null), 2);
    }

    public final TextView d0() {
        return (TextView) this.X.getValue(this, D0[5]);
    }

    public final h3b e0() {
        return (h3b) this.x.getValue(this, D0[2]);
    }

    public final EndlessRecyclerView2 f0() {
        return (EndlessRecyclerView2) this.w.getValue(this, D0[1]);
    }

    public final void g(int i, Bundle bundle) {
        long j;
        long m;
        long j2;
        if (!((lf1) this.o.getValue()).g(i)) {
            int i2 = jxa.S0;
            if (i == i2 || i == jxa.T0 || i == jxa.R0 || i == jxa.U0) {
                k7c g0 = g0();
                Long i3 = g0.I0.i();
                if (i3 != null) {
                    long longValue = i3.longValue();
                    Lazy lazy = g0.Y;
                    if (i == i2) {
                        m = ((qjd) ((x23) lazy.getValue())).m();
                        j2 = 3600000;
                    } else if (i == jxa.T0) {
                        m = ((qjd) ((x23) lazy.getValue())).m();
                        j2 = WorkRequest.MAX_BACKOFF_MILLIS;
                    } else if (i == jxa.R0) {
                        m = ((qjd) ((x23) lazy.getValue())).m();
                        j2 = 86400000;
                    } else if (i == jxa.U0) {
                        j = -1;
                        ((my2) g0.m()).n().Y(longValue, j);
                        xag.h(g0.w0, new g6c(new igf(lxa.v2), Integer.valueOf(cad.o)));
                    } else {
                        return;
                    }
                    j = m + j2;
                    ((my2) g0.m()).n().Y(longValue, j);
                    xag.h(g0.w0, new g6c(new igf(lxa.v2), Integer.valueOf(cad.o)));
                }
            } else if (i == jxa.m) {
                k7c g02 = g0();
                ev0.v(g02.a, ((osa) g02.n()).b(), (f14) null, new v6c(g02, (Continuation) null), 2);
            } else if (i == jxa.x) {
                g0().j();
            } else if (i == jxa.D || i == jxa.B) {
                k7c g03 = g0();
                KProperty[] kPropertyArr = k7c.M0;
                g03.v(false);
            } else if (i == jxa.r) {
                k7c g04 = g0();
                Long i4 = g04.I0.i();
                if (i4 != null) {
                    long longValue2 = i4.longValue();
                    r4c.b.getClass();
                    xag.h(g04.x0, new pa4(":profile/change-owner?chat_id=" + longValue2 + "&leave_chat=true"));
                }
            } else if (i == jxa.R) {
                k7c g05 = g0();
                Long i5 = g05.I0.i();
                if (i5 != null) {
                    g05.y0.setValue(g05, k7c.M0[0], ev0.u(g05.a, ((osa) g05.n()).b(), f14.b, new a7c(g05, i5.longValue(), (Continuation) null)));
                }
            } else if (i == jxa.Q) {
                long j3 = getArgs().getLong("profile:id");
                r4c r4c = r4c.b;
                r4c.getClass();
                Unit unit = Unit.INSTANCE;
                r4c.W0().b(":profile/change-owner?chat_id=" + j3 + "&leave_chat=true", (Bundle) null);
            } else if (i == jxa.A0) {
                if (bundle != null) {
                    long j4 = bundle.getLong("profile:participant_id_for_action");
                    k7c g06 = g0();
                    g06.getClass();
                    xag.h(g06.w0, new b6c(new egf(kxa.d, 1), new q6c(g06, j4, false)));
                }
            } else if (i == jxa.C0) {
                if (bundle != null) {
                    long j5 = bundle.getLong("profile:participant_id_for_action");
                    k7c g07 = g0();
                    g07.getClass();
                    xag.h(g07.w0, new b6c(new egf(kxa.d, 1), new q6c(g07, j5, true)));
                }
            } else if (i == jxa.o) {
                r4c.b.W0().b(":media-picker/select/photo", (Bundle) null);
            } else if (i == jxa.n) {
                g0().q();
            } else if (i == jxa.C) {
                g0().t();
            } else if (i == jxa.A) {
                g0().v(true);
            }
        }
    }

    public final k7c g0() {
        return (k7c) this.c.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                g0().w();
                return;
            }
            k7c g0 = g0();
            ev0.v(g0.a, ((osa) g0.n()).b(), (f14) null, new d7c(intent, g0, (Continuation) null), 2);
        } else if (i2 == -1) {
            k7c g02 = g0();
            ev0.v(g02.a, ((osa) g02.n()).b(), (f14) null, new x6c(g02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new dr0(13, this));
        } else if (wgf.d(e0().getTitle())) {
            c0(this, e0(), true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m5c m5c = new m5c(this, 6);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(jxa.g1);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        m5c.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((lf1) this.o.getValue()).b(i, strArr, iArr) && i == 158 && ((edb) this.A0.getValue()).b(strArr)) {
            g0().q();
        }
    }

    public final void onViewCreated(View view) {
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new o5c((Continuation) null, this), 3);
        b0h.H(view, new x2(this, (Continuation) null, 26));
        EndlessRecyclerView2 f0 = f0();
        ib4 ib4 = new ib4(25, new ir0(5, this), new Rect(f0.getPaddingLeft(), f0.getPaddingTop(), f0.getPaddingRight(), f0.getPaddingBottom()));
        WeakHashMap weakHashMap = gag.a;
        v9g.u(f0, ib4);
        if (f0.E0) {
            t9g.c(f0);
        } else {
            f0.addOnAttachStateChangeListener(new p50(4, f0, f0));
        }
        gh5 gh5 = new gh5();
        KProperty[] kPropertyArr = D0;
        KProperty kProperty = kPropertyArr[0];
        ReadOnlyProperty readOnlyProperty = this.v;
        ((AppBarLayout) readOnlyProperty.getValue(this, kProperty)).a(h88.d0(new xb1(gh5, this, 3), (AppBarLayout) readOnlyProperty.getValue(this, kPropertyArr[0]), getViewLifecycleOwner()));
        ((AppCompatTextView) this.Z.getValue(this, kPropertyArr[7])).setOnClickListener(new u99(21, (Object) this));
        on2 on2 = new on2(g0().H0, 28);
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(on2, getViewLifecycleOwner().getLifecycle(), iu7), new p5c((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(bs0.w(new i21(g0().D0, g0().F0, new y98(3, (Continuation) null, 3), 4)), getViewLifecycleOwner().getLifecycle(), iu7), new q5c((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new ql8(g0().w0, 28), getViewLifecycleOwner().getLifecycle(), iu7), new r5c((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().x0, getViewLifecycleOwner().getLifecycle(), iu7), new s5c((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        int i2;
        c6c c6c;
        c6c c6c2;
        if (i == jxa.G0) {
            k7c g0 = g0();
            Long j = g0.I0.j();
            if (j != null) {
                xag.h(g0.x0, new t4c(j.longValue()));
                return;
            }
            return;
        }
        CharSequence charSequence = "";
        if (i == jxa.I0) {
            k7c g02 = g0();
            gwb gwb = g02.I0;
            gwb.getClass();
            if (gwb instanceof yq0) {
                g02.j();
                return;
            }
            owb owb = (owb) g02.G0.getValue();
            CharSequence charSequence2 = owb != null ? owb.e : null;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            qr2 k = gwb.k();
            if (k != null) {
                swb swb = (swb) g02.B0.getValue();
                swb.getClass();
                int ordinal = k.ordinal();
                if (ordinal == 0) {
                    kgf kgf = new kgf(lxa.D0, ArraysKt.toList((T[]) new Object[]{charSequence}));
                    List createListBuilder = CollectionsKt.createListBuilder();
                    createListBuilder.add(new pg3(jxa.x, new igf(lxa.z0), og3.a));
                    createListBuilder.add(swb.b());
                    Unit unit = Unit.INSTANCE;
                    c6c2 = new c6c(kgf, (ngf) null, CollectionsKt.build(createListBuilder), (Bundle) null);
                } else if (ordinal == 1) {
                    igf igf = new igf(lxa.A0);
                    kgf kgf2 = new kgf(lxa.C0, ArraysKt.toList((T[]) new Object[]{charSequence}));
                    List createListBuilder2 = CollectionsKt.createListBuilder();
                    createListBuilder2.add(new pg3(jxa.x, new igf(lxa.z0), og3.a));
                    createListBuilder2.add(swb.b());
                    Unit unit2 = Unit.INSTANCE;
                    c6c2 = new c6c(igf, kgf2, CollectionsKt.build(createListBuilder2), (Bundle) null);
                } else if (ordinal == 2) {
                    igf igf2 = new igf(lxa.y0);
                    igf igf3 = new igf(lxa.x0);
                    List createListBuilder3 = CollectionsKt.createListBuilder();
                    createListBuilder3.add(new pg3(jxa.x, new igf(lxa.z0), og3.a));
                    createListBuilder3.add(swb.b());
                    Unit unit3 = Unit.INSTANCE;
                    c6c2 = new c6c(igf2, igf3, CollectionsKt.build(createListBuilder3), (Bundle) null);
                } else if (ordinal == 3) {
                    c6c = swb.c();
                    xag.h(g02.w0, c6c);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                c6c = c6c2;
                xag.h(g02.w0, c6c);
            }
        } else if (i == jxa.O0) {
            k7c g03 = g0();
            Long i3 = g03.I0.i();
            if (i3 != null) {
                long longValue = i3.longValue();
                r4c.b.getClass();
                xag.h(g03.x0, new pa4(":complaint?chat_id=" + longValue));
            }
        } else if (i == jxa.H0) {
            k7c g04 = g0();
            owb owb2 = (owb) g04.G0.getValue();
            CharSequence charSequence3 = owb2 != null ? owb2.e : null;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            swb swb2 = (swb) g04.B0.getValue();
            swb2.getClass();
            kgf kgf3 = new kgf(lxa.V, ArraysKt.toList((T[]) new Object[]{charSequence}));
            igf igf4 = new igf(lxa.U);
            List createListBuilder4 = CollectionsKt.createListBuilder();
            createListBuilder4.add(new pg3(jxa.m, new igf(lxa.T), og3.a));
            createListBuilder4.add(swb2.b());
            Unit unit4 = Unit.INSTANCE;
            xag.h(g04.w0, new c6c(kgf3, igf4, CollectionsKt.build(createListBuilder4), (Bundle) null));
        } else if (i == jxa.K0 || i == (i2 = jxa.J0)) {
            gwb gwb2 = g0().I0;
            gwb2.getClass();
            if (gwb2 instanceof yq0) {
                g0().v(false);
            } else {
                g0().u();
            }
        } else if (i == i2) {
            g0().u();
        } else if (i == jxa.Y0) {
            Context context = getContext();
            k7c g05 = g0();
            CharSequence o2 = g05.I0.o();
            if (o2 != null) {
                charSequence = o2;
            }
            xag.h(g05.w0, new g6c(new igf(lxa.H0), Integer.valueOf(cad.w)));
            b59.k(context, "+" + charSequence);
        } else if (i == jxa.b1) {
            k7c g06 = g0();
            String o3 = g06.I0.o();
            if (o3 != null) {
                ev0.v(g06.a, ((osa) g06.n()).b(), (f14) null, new w6c(g06, Long.parseLong(o3), (Continuation) null), 2);
            }
        } else if (i == jxa.a1) {
            g0().o(false);
        } else if (i == jxa.Z0) {
            g0().o(true);
        } else if (i == jxa.S) {
            b59.k(getContext(), g0().k());
        } else if (i == jxa.N0 || i == jxa.M0) {
            k7c g07 = g0();
            h6c y2 = g07.I0.y();
            if (y2 != null) {
                xag.h(g07.w0, y2);
            }
        } else if (i == jxa.r0) {
            if (bundle != null) {
                long j2 = bundle.getLong("profile:participant_id_for_action");
                k7c g08 = g0();
                h6c A = g08.I0.A(j2);
                if (A != null) {
                    xag.h(g08.w0, A);
                }
            }
        } else if (i == jxa.P0) {
            k7c g09 = g0();
            g09.getClass();
            xag.h(g09.w0, new b6c(new igf(lxa.C2), new r6c(g09, 1)));
        } else if (i == jxa.L0) {
            g0().t();
        }
    }

    public ProfileScreen(long j, txb txb, boolean z2) {
        this(o54.f(TuplesKt.to("profile:id", Long.valueOf(j)), TuplesKt.to("profile:id_type", txb), TuplesKt.to("profile:opened_from_dialog", Boolean.valueOf(z2))));
    }
}
