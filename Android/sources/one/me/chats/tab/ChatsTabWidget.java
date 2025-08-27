package one.me.chats.tab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/tab/ChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Lt5a;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatsTabWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatsTabWidget.kt\none/me/chats/tab/ChatsTabWidget\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 Log.kt\nru/ok/tamtam/logger/Log\n+ 5 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n5#2:376\n5#2:410\n235#3,10:377\n414#3,4:398\n32#4,4:387\n32#4,4:391\n32#4,4:402\n32#4,4:406\n32#4,4:411\n43#5:395\n46#5:396\n1#6:397\n*S KotlinDebug\n*F\n+ 1 ChatsTabWidget.kt\none/me/chats/tab/ChatsTabWidget\n*L\n66#1:376\n319#1:410\n78#1:377,10\n209#1:398,4\n96#1:387,4\n130#1:391,4\n283#1:402,4\n290#1:406,4\n319#1:411,4\n167#1:395\n168#1:396\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatsTabWidget extends Widget implements t5a {
    public static final /* synthetic */ KProperty[] z0;
    public final Lazy X;
    public final Lazy Y;
    public m56 Z;
    public final yh7 a;
    public final String b;
    public v16 c;
    public final Lazy o;
    public final Lazy v;
    public final he v0;
    public final ReadOnlyProperty w;
    public final int w0;
    public final ReadOnlyProperty x;
    public final y66 x0;
    public final ReadOnlyProperty y;
    public pm7 y0;
    public final ReadOnlyProperty z;

    static {
        Class<ChatsTabWidget> cls = ChatsTabWidget.class;
        z0 = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), wj6.p(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), wj6.p(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0)};
    }

    public ChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        String name = ChatsTabWidget.class.getName();
        this.b = name;
        this.o = yh0.a.getAccessor().h(edb.class);
        cs2 cs2 = cs2.a;
        this.v = cs2.getAccessor().h(x23.class);
        this.w = viewBinding(hra.j);
        this.x = viewBinding(hra.e);
        this.y = viewBinding(hra.d);
        this.z = viewBinding(hra.f);
        this.X = createViewModelLazy(w86.class, new rn2(15, new oq2(8)));
        this.Y = cs2.getAccessor().h(z5a.class);
        this.v0 = new he(true);
        this.w0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(as2.a, 30);
        Unit unit = Unit.INSTANCE;
        this.x0 = new y66(this, bVar, y66.y0);
        ec8 c2 = cs2.c();
        c2.getClass();
        ybb ybb = ybb.FOLDERS_INIT_TO_RENDER;
        c2.e.k(ybb, new xbb(ybb, SystemClock.elapsedRealtime()));
        c2.f.put(tbb.EVENT_OPEN_CHATS, ev0.v(c2.d, (CoroutineContext) null, (f14) null, new dc8(c2, (Continuation) null), 3));
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, i2a.i("ONEME-6453|chats_list_lf | tabs subscribe on new data. Scope isActive: ", e14.f(getLifecycleScope())), (Throwable) null);
        }
        bs0.K(new ps5(f0().X, new sy2((Continuation) null, this), 5), getLifecycleScope());
    }

    public final c2b c0() {
        return (c2b) this.x.getValue(this, z0[1]);
    }

    public final ViewPager2 d0() {
        return (ViewPager2) this.y.getValue(this, z0[2]);
    }

    public final h3b e0() {
        return (h3b) this.w.getValue(this, z0[0]);
    }

    public final w86 f0() {
        return (w86) this.X.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r11 = (defpackage.i9d) kotlin.collections.CollectionsKt.firstOrNull(r11.e());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(int r11) {
        /*
            r10 = this;
            y66 r0 = r10.x0
            android.util.SparseArray r0 = r0.y
            java.lang.Object r11 = r0.get(r11)
            e9d r11 = (defpackage.e9d) r11
            r0 = 0
            if (r11 == 0) goto L_0x001c
            java.util.ArrayList r11 = r11.e()
            java.lang.Object r11 = kotlin.collections.CollectionsKt.firstOrNull(r11)
            i9d r11 = (defpackage.i9d) r11
            if (r11 == 0) goto L_0x001c
            zx3 r11 = r11.a
            goto L_0x001d
        L_0x001c:
            r11 = r0
        L_0x001d:
            boolean r1 = r11 instanceof one.me.chats.list.ChatsListWidget
            if (r1 == 0) goto L_0x0024
            one.me.chats.list.ChatsListWidget r11 = (one.me.chats.list.ChatsListWidget) r11
            goto L_0x0025
        L_0x0024:
            r11 = r0
        L_0x0025:
            if (r11 != 0) goto L_0x0028
            return
        L_0x0028:
            java.lang.String r10 = r10.b
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x002f
            goto L_0x0070
        L_0x002f:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0070
            w78 r2 = defpackage.w78.o
            android.view.View r3 = r11.getView()
            if (r3 == 0) goto L_0x0046
            int r3 = r3.getMeasuredWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            android.view.View r4 = r11.getView()
            if (r4 == 0) goto L_0x0056
            int r4 = r4.getMeasuredHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0057
        L_0x0056:
            r4 = r0
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ONEME-6873|chats_list_page_state | root width:"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", root height:"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r1.d(r2, r10, r3, r0)
        L_0x0070:
            android.view.View r10 = r11.getView()
            if (r10 == 0) goto L_0x0113
            java.lang.String r10 = r11.b
            java.lang.String r1 = "all.chat.folder"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r1)
            if (r10 == 0) goto L_0x0082
            goto L_0x0113
        L_0x0082:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r10 = r11.e0()
            int r10 = r10.getMeasuredWidth()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r11.e0()
            int r1 = r1.getMeasuredHeight()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r11.e0()
            tyc r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x00a5
            int r2 = r2.j()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00a6
        L_0x00a5:
            r2 = r0
        L_0x00a6:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r11.e0()
            int r3 = r3.getChildCount()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r4 = r11.e0()
            r5 = 0
            r6 = r5
        L_0x00b4:
            int r7 = r4.getChildCount()
            if (r6 >= r7) goto L_0x00d2
            int r7 = r6 + 1
            android.view.View r6 = r4.getChildAt(r6)
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r6.isAttachedToWindow()
            if (r6 == 0) goto L_0x00ca
            r5 = 1
            goto L_0x00d2
        L_0x00ca:
            r6 = r7
            goto L_0x00b4
        L_0x00cc:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
        L_0x00d2:
            java.lang.String r4 = r11.a
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x00d9
            goto L_0x0113
        L_0x00d9:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0113
            w78 r7 = defpackage.w78.o
            java.lang.String r11 = r11.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ONEME-6873|chats_list_page_state | chats list state. folderId:"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r11 = " | width:"
            r8.append(r11)
            r8.append(r10)
            java.lang.String r10 = "|height:"
            r8.append(r10)
            java.lang.String r10 = " | child:"
            java.lang.String r11 = "|childAttached:"
            defpackage.g63.o(r8, r1, r10, r3, r11)
            r8.append(r5)
            java.lang.String r10 = "|adapterCount:"
            r8.append(r10)
            r8.append(r2)
            java.lang.String r10 = r8.toString()
            r6.d(r7, r4, r10, r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.g0(int):void");
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final h8b h0() {
        long j;
        if (d0().getCurrentItem() == 0) {
            k16 k16 = k16.a;
            j = 1;
        } else {
            k16 k162 = k16.a;
            j = 2;
        }
        return new h8b(zfe.FOLDER_ID, Long.valueOf(j), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChangeEnded(defpackage.ey3 r12, defpackage.fy3 r13) {
        /*
            r11 = this;
            r12 = 1
            boolean r13 = r13.b
            if (r13 == 0) goto L_0x0115
            w86 r13 = r11.f0()
            boolean r13 = r13.w0
            kotlin.Lazy r0 = r11.o
            r1 = 0
            if (r13 != 0) goto L_0x00bc
            java.lang.Object r13 = r0.getValue()
            edb r13 = (defpackage.edb) r13
            g2g r13 = r13.b
            boolean r2 = r13.a
            if (r2 == 0) goto L_0x008a
            grg r13 = r13.b
            java.lang.Object r13 = r13.b
            android.content.Context r13 = (android.content.Context) r13
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r13.getSystemService(r2)     // Catch:{ all -> 0x0061 }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ all -> 0x0061 }
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            java.lang.String r4 = "checkOpNoThrow"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0061 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r5, r6}     // Catch:{ all -> 0x0061 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x0061 }
            r4 = 10020(0x2724, float:1.4041E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0061 }
            int r5 = android.os.Process.myUid()     // Catch:{ all -> 0x0061 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ all -> 0x0061 }
            java.lang.Object[] r13 = new java.lang.Object[]{r4, r5, r13}     // Catch:{ all -> 0x0061 }
            java.lang.Object r13 = r3.invoke(r2, r13)     // Catch:{ all -> 0x0061 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0061 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0061 }
            if (r13 != 0) goto L_0x005f
            goto L_0x0097
        L_0x005f:
            r13 = r1
            goto L_0x0098
        L_0x0061:
            r13 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r13)
            java.lang.Throwable r13 = kotlin.Result.m26exceptionOrNullimpl(r13)
            if (r13 == 0) goto L_0x0097
            java.lang.Class<grg> r2 = defpackage.grg.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Permission check error "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            defpackage.z68.c(r2, r13, new java.lang.Object[0])
            goto L_0x0097
        L_0x008a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L_0x0097
            android.app.NotificationManager r13 = r13.c
            boolean r13 = r13.canUseFullScreenIntent()
            goto L_0x0098
        L_0x0097:
            r13 = r12
        L_0x0098:
            if (r13 != 0) goto L_0x00bc
            w86 r13 = r11.f0()
            r13.w0 = r12
            java.lang.Object r13 = r0.getValue()
            edb r13 = (defpackage.edb) r13
            eng r0 = new eng
            r0.<init>(r11, r12)
            r13.getClass()
            int r3 = defpackage.bmc.permission_fsi_request
            int r4 = defpackage.bmc.permission_fsi_request_rationale
            int r5 = defpackage.bmc.permissions_fsi_request_positive_button
            java.lang.String[] r1 = defpackage.edb.o
            r2 = 180(0xb4, float:2.52E-43)
            r0.c(r1, r2, r3, r4, r5)
            goto L_0x0115
        L_0x00bc:
            java.lang.Object r13 = r0.getValue()
            edb r13 = (defpackage.edb) r13
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x00cf
            java.lang.String[] r4 = defpackage.edb.k
            boolean r13 = r13.b(r4)
            goto L_0x00d3
        L_0x00cf:
            r13.getClass()
            r13 = r12
        L_0x00d3:
            if (r13 != 0) goto L_0x0115
            kotlin.Lazy r13 = r11.v
            java.lang.Object r4 = r13.getValue()
            x23 r4 = (defpackage.x23) r4
            qjd r4 = (defpackage.qjd) r4
            a33 r4 = (defpackage.a33) r4
            ls7 r4 = r4.g
            java.lang.String r5 = "app.pushNotificationsRequested"
            boolean r1 = r4.getBoolean(r5, r1)
            if (r1 != 0) goto L_0x0115
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            qjd r13 = (defpackage.qjd) r13
            r13.i(r5, r12)
            java.lang.Object r13 = r0.getValue()
            r4 = r13
            edb r4 = (defpackage.edb) r4
            eng r5 = new eng
            r5.<init>(r11, r12)
            if (r2 < r3) goto L_0x0112
            java.lang.String[] r6 = defpackage.edb.k
            int r8 = defpackage.bmc.permissions_post_notification_request_rationale
            int r9 = defpackage.bmc.permissions_post_notification_request_title
            int r10 = defpackage.bmc.permissions_post_notification_request_positive_button
            r7 = 177(0xb1, float:2.48E-43)
            r4.d(r5, r6, r7, r8, r9, r10)
            goto L_0x0115
        L_0x0112:
            r4.getClass()
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.onChangeEnded(ey3, fy3):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [mza, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(hra.c);
        h3b d = o54.d(constraintLayout.getContext(), (AttributeSet) null);
        int i = hra.j;
        d.setId(i);
        d.setTransitionName(d.getContext().getString(jra.q));
        d.setForm(z2b.b);
        fj3 fj3 = new fj3(-1, -2);
        fj3.i = 0;
        int i2 = hra.e;
        fj3.k = i2;
        fj3.e = 0;
        fj3.h = 0;
        d.setLayoutParams(fj3);
        d.setTitle(jra.p);
        d.setRightActions(new u2b(new c3b(new Object()), new b3b(cad.P0, 0, new gl1(25), 14)));
        pza searchView = d.getSearchView();
        if (searchView != null) {
            searchView.setExpandWithAnimation(false);
        }
        constraintLayout.addView(d);
        c2b c2b = new c2b(constraintLayout.getContext(), (AttributeSet) null);
        c2b.setId(i2);
        c2b.setTabMode(0);
        fj3 fj32 = new fj3(0, -2);
        fj32.j = i;
        int i3 = hra.f;
        fj32.k = i3;
        fj32.e = 0;
        fj32.h = 0;
        c2b.setLayoutParams(fj32);
        constraintLayout.addView(c2b);
        oz1 a2 = kv0.a(constraintLayout.getContext());
        a2.setId(i3);
        fj3 fj33 = new fj3(0, -2);
        fj33.j = i2;
        int i4 = hra.d;
        fj33.k = i4;
        fj33.e = 0;
        fj33.h = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(a2, fj33);
        ViewPager2 viewPager2 = new ViewPager2(constraintLayout.getContext());
        viewPager2.setId(i4);
        fj3 fj34 = new fj3(0, 0);
        fj34.I = 1.0f;
        fj34.j = i3;
        fj34.l = 0;
        fj34.e = 0;
        fj34.h = 0;
        viewPager2.setLayoutParams(fj34);
        hsg.m(viewPager2);
        constraintLayout.addView(viewPager2);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        String str = this.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, i2a.i("ONEME-6453|chats_list_lf | tabs view destroy. Scope isActive: ", e14.f(getLifecycleScope())), (Throwable) null);
        }
        m56 m56 = this.Z;
        if (m56 != null) {
            m56.f();
        }
        this.Z = null;
        this.c = null;
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        f0().j(bundle2.getString("folder_id"));
    }

    public final void onViewCreated(View view) {
        String str = this.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, i2a.i("ONEME-6453|chats_list_lf | tabs view created. Scope isActive: ", e14.f(getLifecycleScope())), (Throwable) null);
        }
        d0().setAdapter(this.x0);
        y66 y66 = this.x0;
        y66.x = 0;
        while (((ya8) y66.X).k() > y66.x) {
            ((ya8) y66.X).j(((Number) y66.w.remove(0)).longValue());
        }
        d0().setOffscreenPageLimit(this.w0);
        he heVar = this.v0;
        c2b c0 = c0();
        ViewPager2 d0 = d0();
        rx2 rx2 = new rx2(3, this);
        zw zwVar = new zw(12, (Object) this);
        heVar.getClass();
        m56 m56 = new m56(c0, d0, true, new fm3(c0, heVar, rx2, zwVar));
        m56.d();
        this.Z = m56;
        bs0.K(new ps5(f0().X, new uy2((Continuation) null, this), 5), getViewLifecycleScope());
        ViewPager2 d02 = d0();
        View childAt = d02.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((yyc) null);
            recyclerView.setHasFixedSize(true);
        }
        d02.b(new gi0(4, this));
        if (this.x0.x0.size() > 0) {
            d02.measure(View.MeasureSpec.makeMeasureSpec(d02.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(d02.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
            if (this.x0.x0.size() > 1) {
                g0(1);
            }
        }
        e9d childRouter = getChildRouter((ViewGroup) this.z.getValue(this, z0[3]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget((Bundle) null, 1, (DefaultConstructorMarker) null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(iq.n(pinBarsWidget, (ey3) null, (ey3) null));
        }
        view.addOnAttachStateChangeListener(new el(2, this));
        f0().j(getArgs().getString("folder_id"));
        bs0.K(new ps5(ct.k(f0().Z, getViewLifecycleOwner().getLifecycle(), iu7.v), new ty2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ChatsTabWidget(String str) {
        this(o54.f(TuplesKt.to("folder_id", str)));
    }
}
