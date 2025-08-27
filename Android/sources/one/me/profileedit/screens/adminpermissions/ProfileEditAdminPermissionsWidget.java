package one.me.profileedit.screens.adminpermissions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget;", "Lone/me/sdk/arch/Widget;", "Lzxb;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "contactId", "Leyb;", "type", "(JJLeyb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileEditAdminPermissionsWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileEditAdminPermissionsWidget.kt\none/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n*L\n1#1,395:1\n420#2:396\n420#2:397\n420#2:398\n235#2,10:399\n410#2,8:453\n410#2,8:461\n410#2,8:469\n24#3:409\n24#3:410\n24#3:422\n24#3:431\n24#3:432\n24#3:433\n24#3:434\n24#3:435\n24#3:436\n24#3:437\n24#3:438\n24#3:439\n24#3:440\n24#3:441\n24#3:442\n24#3:443\n24#3:444\n24#3:445\n24#3:446\n24#3:447\n24#3:448\n24#3:449\n24#3:450\n24#3:451\n256#4,2:411\n157#4,8:423\n81#4:452\n254#4:479\n81#4:480\n157#4,8:481\n9#5,6:413\n15#5:420\n1#6:419\n1#6:421\n65#7,2:477\n68#7:489\n*S KotlinDebug\n*F\n+ 1 ProfileEditAdminPermissionsWidget.kt\none/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget\n*L\n70#1:396\n71#1:397\n72#1:398\n78#1:399,10\n278#1:453,8\n295#1:461,8\n320#1:469,8\n105#1:409\n116#1:410\n180#1:422\n213#1:431\n215#1:432\n216#1:433\n217#1:434\n222#1:435\n223#1:436\n224#1:437\n225#1:438\n230#1:439\n232#1:440\n233#1:441\n234#1:442\n239#1:443\n240#1:444\n241#1:445\n242#1:446\n250#1:447\n251#1:448\n252#1:449\n253#1:450\n254#1:451\n125#1:411,2\n180#1:423,8\n262#1:452\n331#1:479\n332#1:480\n336#1:481,8\n141#1:413,6\n141#1:420\n141#1:419\n330#1:477,2\n330#1:489\n*E\n"})
@SuppressLint({"ValidController"})
public final class ProfileEditAdminPermissionsWidget extends Widget implements zxb, qg3 {
    public static final /* synthetic */ KProperty[] v0;
    public final r3d X;
    public final int Y;
    public z3a Z;
    public final yh7 a;
    public final is b;
    public final is c;
    public final is o;
    public final Lazy v;
    public final Lazy w;
    public final t56 x;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty z;

    static {
        Class<ProfileEditAdminPermissionsWidget> cls = ProfileEditAdminPermissionsWidget.class;
        v0 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "contactId", "getContactId()J", 0), wj6.p(cls, "type", "getType()Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsType;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public ProfileEditAdminPermissionsWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        Class<Long> cls = Long.class;
        this.b = new is(cls, "chat_id");
        this.c = new is(cls, "contact_id");
        this.o = new is(eyb.class, "permissions_type");
        this.v = LazyKt.lazy(new mxb(7));
        this.w = createViewModelLazy(syb.class, new zfa(14, new uyb(this, 0)));
        this.x = new t56(((aua) bzb.a.getAccessor().g(aua.class)).a(), (Object) this, 20);
        this.y = viewBinding(fxa.T);
        this.z = viewBinding(fxa.Q);
        this.X = cvg.I(new uyb(this, 1));
        this.Y = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
    }

    public final boolean c0() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final eyb d0() {
        KProperty kProperty = v0[2];
        return (eyb) this.o.a(this);
    }

    public final syb e0() {
        return (syb) this.w.getValue();
    }

    public final void f0() {
        r3d r3d = this.X;
        if (r3d.isInitialized()) {
            OneMeButton oneMeButton = (OneMeButton) r3d.getValue();
            if (oneMeButton.getVisibility() == 0) {
                u3b.a(oneMeButton, new vj6((ViewGroup) oneMeButton, (Object) this, (Object) oneMeButton, 16));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.z.getValue(this, v0[4]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.Y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r9 = e0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            int r11 = defpackage.fxa.d0
            if (r10 != r11) goto L_0x000d
            syb r9 = r9.e0()
            r9.k()
            goto L_0x009e
        L_0x000d:
            int r11 = defpackage.fxa.c0
            if (r10 != r11) goto L_0x001e
            syb r9 = r9.e0()
            s85 r9 = r9.x0
            p33 r10 = defpackage.p33.b
            defpackage.xag.h(r9, r10)
            goto L_0x009e
        L_0x001e:
            int r11 = defpackage.fxa.H
            if (r10 != r11) goto L_0x0066
            syb r9 = r9.e0()
            a32 r10 = r9.l()
            if (r10 == 0) goto L_0x009e
            kotlin.Lazy r11 = r9.X
            java.lang.Object r11 = r11.getValue()
            rl r11 = (defpackage.rl) r11
            m72 r10 = r10.b
            long r3 = r10.a
            r0 = r11
            jna r0 = (defpackage.jna) r0
            long r1 = r9.b
            long r5 = r9.c
            r0.i(r1, r3, r5)
            xxb r10 = new xxb
            int r11 = defpackage.ixa.R0
            igf r0 = new igf
            r0.<init>(r11)
            int r11 = defpackage.cad.B
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.<init>(r0, r11)
            s85 r11 = r9.y0
            defpackage.xag.h(r11, r10)
            dyb r10 = new dyb
            long r0 = r9.b
            r10.<init>(r0)
            s85 r9 = r9.x0
            defpackage.xag.h(r9, r10)
            goto L_0x009e
        L_0x0066:
            int r11 = defpackage.fxa.K
            if (r10 != r11) goto L_0x009e
            syb r9 = r9.e0()
            a32 r10 = r9.l()
            if (r10 == 0) goto L_0x009e
            kotlin.Lazy r11 = r9.X
            java.lang.Object r11 = r11.getValue()
            rl r11 = (defpackage.rl) r11
            m72 r0 = r10.b
            long r4 = r0.a
            long r0 = r9.c
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.List r6 = kotlin.collections.CollectionsKt.listOf(r2)
            int r8 = r10.f(r0)
            r1 = r11
            jna r1 = (defpackage.jna) r1
            long r2 = r10.a
            r7 = 0
            r1.Q(r2, r4, r6, r7, r8)
            s85 r9 = r9.x0
            p33 r10 = defpackage.p33.b
            defpackage.xag.h(r9, r10)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.g(int, android.os.Bundle):void");
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bz9 bz9;
        bz9 bz92;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        b0h.H(frameLayout, new sn2(3, (Continuation) null, 5));
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(fxa.Q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        float f = (float) 24;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), recyclerView.getPaddingRight(), this.Y);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.x);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.setHasFixedSize(true);
        ez9 ez9 = ri7.a;
        ez9 ez92 = new ez9(3);
        ez92.g(2048);
        ez92.g(ConstantsKt.DEFAULT_BLOCK_SIZE);
        ez92.g(Uuid.SIZE_BITS);
        recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new pbb(3, this, ez92), (h9) null, 12));
        if (c0()) {
            float f2 = (float) 8;
            bz9 = ki7.b(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, 32768, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), ConstantsKt.DEFAULT_BLOCK_SIZE, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
        } else {
            float f3 = (float) 6;
            bz9 = ki7.b(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), 32768, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), ConstantsKt.DEFAULT_BLOCK_SIZE, MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        }
        if (c0()) {
            float f4 = (float) 8;
            bz92 = ki7.b(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), 0, ConstantsKt.DEFAULT_BLOCK_SIZE, MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), 32768, MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        } else {
            float f5 = (float) 12;
            bz92 = ki7.b(0, MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density), ConstantsKt.DEFAULT_BLOCK_SIZE, MathKt.roundToInt(((float) 30) * vo4.c().getDisplayMetrics().density), 32768, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density));
        }
        float f6 = (float) 12;
        recyclerView.j(new ue8(ki7.b(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), ConstantsKt.DEFAULT_BLOCK_SIZE, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 32768, MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)), bz9, bz92, 0));
        frameLayout.addView(recyclerView);
        h3b d = o54.d(frameLayout.getContext(), (AttributeSet) null);
        d.setId(fxa.T);
        d.setTitle(c0() ? ixa.J0 : ixa.m1);
        d.setForm(z2b.a);
        d.setLeftActions(new q2b(new tyb(this, 0)));
        if (!c0()) {
            d.setRightActions(new r2b(new tyb(this, 1)));
        }
        b0h.H(d, new vyb(3, (Continuation) null, 0));
        frameLayout.addView(d);
        if (c0()) {
            frameLayout.addView((View) this.X.getValue());
        }
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.X.b = v9a.x;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        h3b h3b = (h3b) this.y.getValue(this, v0[3]);
        u3b.a(h3b, new uj6(18, h3b, this));
        f0();
        fma h = getRouter().h();
        if (h != null) {
            h.a(this.lifecycleOwner, new wx3((Widget) this, 8));
        }
        on2 on2 = new on2(e0().x0, 28);
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(on2, getViewLifecycleOwner().getLifecycle(), iu7), new wyb((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(e0().y0, 28), getViewLifecycleOwner().getLifecycle(), iu7), new xyb((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(e0().B0, getViewLifecycleOwner().getLifecycle(), iu7), new yyb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ProfileEditAdminPermissionsWidget(long j, long j2, eyb eyb) {
        this(o54.f(TuplesKt.to("chat_id", Long.valueOf(j)), TuplesKt.to("contact_id", Long.valueOf(j2)), TuplesKt.to("permissions_type", eyb)));
    }
}
