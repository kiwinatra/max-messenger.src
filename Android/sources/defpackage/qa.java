package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* renamed from: qa  reason: default package */
public class qa extends frb {
    public final /* synthetic */ int b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ qa(Widget widget, int i) {
        this.b = i;
        this.c = widget;
    }

    public int a() {
        switch (this.b) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return 0;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.c;
                urc urc = messageContextMenuBottomSheet.N0;
                if (urc != null && urc.c.j() > 8) {
                    return c();
                }
                if (messageContextMenuBottomSheet.u0()) {
                    return 0;
                }
                return c();
            case 4:
                return 0;
            case 5:
                return StickerSetBottomSheet.n0((StickerSetBottomSheet) this.c);
            default:
                return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        r1 = r1.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            one.me.sdk.arch.Widget r2 = r6.c
            int r3 = r6.b
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0144;
                case 2: goto L_0x0126;
                case 3: goto L_0x0090;
                case 4: goto L_0x008f;
                case 5: goto L_0x008a;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r6 = r6.e()
            int r0 = r6 / 2
            kotlin.reflect.KProperty[] r3 = one.me.sdk.messagewrite.mention.SuggestionsWidget.z0
            one.me.sdk.messagewrite.mention.SuggestionsWidget r2 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r2
            v0f r3 = r2.r0()
            etc r3 = r3.D0
            ome r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            h0f r3 = (defpackage.h0f) r3
            v0f r4 = r2.r0()
            xme r5 = r4.G0
            java.lang.Object r5 = r5.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            xme r4 = r4.H0
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            if (r5 == 0) goto L_0x0089
            boolean r4 = kotlin.text.StringsKt.isBlank(r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            java.util.List r1 = r3.b
        L_0x0045:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x006f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0050
            goto L_0x006f
        L_0x0050:
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r6 = defpackage.a81.e(r1, r3, r6)
            one.me.sdk.lists.widgets.EndlessRecyclerView r1 = r2.q0()
            int r1 = r1.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = java.lang.Math.max(r6, r0)
            goto L_0x0089
        L_0x006f:
            androidx.appcompat.widget.AppCompatTextView r0 = r2.p0()
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 - r0
            r0 = 48
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r6 = defpackage.a81.e(r0, r1, r6)
        L_0x0089:
            return r6
        L_0x008a:
            int r6 = r6.e()
            return r6
        L_0x008f:
            return r0
        L_0x0090:
            kotlin.reflect.KProperty[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.X0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r2 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r2
            boolean r3 = r2.u0()
            if (r3 == 0) goto L_0x00e1
            r6 = 350(0x15e, float:4.9E-43)
            float r6 = (float) r6
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r6 = r6 * r3
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            androidx.recyclerview.widget.RecyclerView r3 = r2.M0
            if (r3 == 0) goto L_0x00b6
            r4 = -9223372036854775808
            pzc r1 = r3.N(r4)
        L_0x00b6:
            if (r1 == 0) goto L_0x00c1
            android.view.View r1 = r1.a
            if (r1 == 0) goto L_0x00c1
            int r1 = r1.getMeasuredHeight()
            goto L_0x00c2
        L_0x00c1:
            r1 = r0
        L_0x00c2:
            r3 = 120(0x78, float:1.68E-43)
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.g63.b(r3, r4, r1)
            androidx.recyclerview.widget.RecyclerView r3 = r2.M0
            if (r3 == 0) goto L_0x00db
            int r0 = r3.getPaddingBottom()
        L_0x00db:
            int r1 = r1 + r0
            int r6 = kotlin.ranges.RangesKt.coerceAtLeast((int) r1, (int) r6)
            goto L_0x00fe
        L_0x00e1:
            android.view.ViewGroup r0 = r2.L0
            if (r0 == 0) goto L_0x00ea
            int r6 = r0.getMeasuredHeight()
            goto L_0x00f2
        L_0x00ea:
            android.view.View r6 = r6.f()
            int r6 = r6.getMeasuredHeight()
        L_0x00f2:
            int r0 = r2.W0
            int r6 = r6 + r0
            android.view.ViewGroup r0 = r2.r0()
            int r0 = r0.getPaddingBottom()
            int r6 = r6 + r0
        L_0x00fe:
            int r0 = defpackage.pq7.a
            int r0 = defpackage.pq7.c
            boolean r0 = defpackage.pq7.b(r0)
            if (r0 == 0) goto L_0x011b
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 - r6
            android.content.Context r6 = r2.getContext()
            int r6 = defpackage.pq7.a(r6)
            int r6 = r6 + r0
            goto L_0x0125
        L_0x011b:
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            int r6 = r0 - r6
        L_0x0125:
            return r6
        L_0x0126:
            kotlin.reflect.KProperty[] r6 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            one.me.chatscreen.mediabar.MediaBarWidget r2 = (one.me.chatscreen.mediabar.MediaBarWidget) r2
            android.widget.LinearLayout r6 = r2.j0()
            int r6 = r6.getMeasuredHeight()
            r0 = 405(0x195, float:5.68E-43)
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r6 = defpackage.a81.e(r0, r1, r6)
            return r6
        L_0x0144:
            dbe r6 = one.me.sdk.bottomsheet.BaseBottomSheetWidget.v
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r2 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r2
            android.view.View r6 = r2.requireView()
            int r6 = r6.getMeasuredHeight()
            android.view.View r0 = r2.f0()
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 - r0
            return r6
        L_0x015a:
            kotlin.reflect.KProperty[] r0 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.Z
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r2 = (one.me.sdk.messagewrite.markdown.AddLinkBottomSheet) r2
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            android.view.View r6 = r6.f()
            int r6 = r6.getMeasuredHeight()
            int r0 = r0 - r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.c():int");
    }

    public View d() {
        switch (this.b) {
            case 2:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                return ((MediaBarWidget) this.c).h0();
            default:
                return super.d();
        }
    }

    public final int e() {
        int i = 0;
        Widget widget = this.c;
        switch (this.b) {
            case 0:
                View view = ((AddLinkBottomSheet) widget).getView();
                if (view != null) {
                    return view.getMeasuredHeight();
                }
                return 0;
            case 1:
                View view2 = ((BaseBottomSheetWidget) widget).getView();
                if (view2 != null) {
                    return view2.getMeasuredHeight();
                }
                return 0;
            case 2:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                return ((MediaBarWidget) widget).j0().getMeasuredHeight();
            case 3:
                View view3 = ((MessageContextMenuBottomSheet) widget).getView();
                if (view3 != null) {
                    return view3.getMeasuredHeight();
                }
                return 0;
            case 4:
                KProperty[] kPropertyArr2 = SelectAlbumWidget.w;
                return -((SelectAlbumWidget) widget).c0().getMeasuredHeight();
            case 5:
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) widget;
                View view4 = stickerSetBottomSheet.getView();
                if (view4 != null) {
                    i = view4.getMeasuredHeight();
                }
                return i - stickerSetBottomSheet.v0;
            default:
                KProperty[] kPropertyArr3 = SuggestionsWidget.z0;
                return ((SuggestionsWidget) widget).f0().getMeasuredHeight();
        }
    }

    public final View f() {
        Widget widget = this.c;
        switch (this.b) {
            case 0:
                KProperty[] kPropertyArr = AddLinkBottomSheet.Z;
                return ((AddLinkBottomSheet) widget).f0();
            case 1:
                return ((BaseBottomSheetWidget) widget).f0();
            case 2:
                KProperty[] kPropertyArr2 = MediaBarWidget.c1;
                return ((MediaBarWidget) widget).j0();
            case 3:
                KProperty[] kPropertyArr3 = MessageContextMenuBottomSheet.X0;
                return ((MessageContextMenuBottomSheet) widget).f0();
            case 4:
                KProperty[] kPropertyArr4 = SelectAlbumWidget.w;
                return ((SelectAlbumWidget) widget).c0();
            case 5:
                KProperty[] kPropertyArr5 = StickerSetBottomSheet.x0;
                return ((StickerSetBottomSheet) widget).f0();
            default:
                KProperty[] kPropertyArr6 = SuggestionsWidget.z0;
                return ((SuggestionsWidget) widget).f0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.r0().y0.a.getValue() == defpackage.pub.b) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r0.l0().n() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r0.r0().n() != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.lrb g(defpackage.lrb r4, defpackage.lrb r5) {
        /*
            r3 = this;
            one.me.sdk.arch.Widget r0 = r3.c
            int r3 = r3.b
            switch(r3) {
                case 1: goto L_0x0081;
                case 2: goto L_0x0024;
                case 3: goto L_0x0018;
                case 4: goto L_0x0007;
                case 5: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r5
        L_0x0008:
            lrb r3 = defpackage.lrb.a
            if (r5 != r3) goto L_0x0013
            lrb r0 = defpackage.lrb.c
            if (r4 != r0) goto L_0x0013
            lrb r4 = defpackage.lrb.b
            goto L_0x0017
        L_0x0013:
            if (r5 != r3) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r4 = r5
        L_0x0017:
            return r4
        L_0x0018:
            lrb r3 = defpackage.lrb.a
            if (r5 != r3) goto L_0x0023
            kotlin.reflect.KProperty[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.X0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r0 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r0
            r0.getClass()
        L_0x0023:
            return r5
        L_0x0024:
            lrb r3 = defpackage.lrb.c
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            if (r5 != r3) goto L_0x003d
            kotlin.reflect.KProperty[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r1 = r0.r0()
            etc r1 = r1.y0
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            pub r2 = defpackage.pub.b
            if (r1 != r2) goto L_0x003d
            goto L_0x006f
        L_0x003d:
            if (r4 != r3) goto L_0x005a
            lrb r3 = defpackage.lrb.b
            if (r5 != r3) goto L_0x005a
            int r3 = defpackage.pq7.a
            int r3 = defpackage.pq7.c
            boolean r3 = defpackage.pq7.b(r3)
            if (r3 != 0) goto L_0x006f
            kotlin.reflect.KProperty[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            e9d r3 = r0.l0()
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x005a
            goto L_0x006f
        L_0x005a:
            r5.getClass()
            lrb r3 = defpackage.lrb.a
            if (r5 == r3) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            kotlin.reflect.KProperty[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r3 = r0.r0()
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x006f
        L_0x006e:
            r4 = r5
        L_0x006f:
            lrb r3 = defpackage.lrb.a
            if (r4 != r3) goto L_0x0080
            kotlin.reflect.KProperty[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r3 = r0.r0()
            rk8 r5 = defpackage.rk8.a
            s85 r3 = r3.Z
            defpackage.xag.h(r3, r5)
        L_0x0080:
            return r4
        L_0x0081:
            lrb r3 = defpackage.lrb.a
            if (r5 != r3) goto L_0x008d
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r0 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r0
            boolean r3 = r0.h0()
            if (r3 == 0) goto L_0x008e
        L_0x008d:
            r4 = r5
        L_0x008e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.g(lrb, lrb):lrb");
    }

    public void h() {
        Widget widget = this.c;
        switch (this.b) {
            case 0:
                KProperty[] kPropertyArr = AddLinkBottomSheet.Z;
                ((AddLinkBottomSheet) widget).j0();
                return;
            case 1:
                ((BaseBottomSheetWidget) widget).j0();
                return;
            case 2:
                KProperty[] kPropertyArr2 = MediaBarWidget.c1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                mediaBarWidget.f0();
                il8 r0 = mediaBarWidget.r0();
                r0.z.s(lj8.a);
                xag.h(r0.Z, qk8.a);
                ml8 ml8 = mediaBarWidget.b1;
                if (ml8 != null) {
                    ((ChatScreen) ml8).c.f();
                    return;
                }
                return;
            case 3:
                KProperty[] kPropertyArr3 = MessageContextMenuBottomSheet.X0;
                ((MessageContextMenuBottomSheet) widget).j0();
                return;
            case 4:
                KProperty[] kPropertyArr4 = SelectAlbumWidget.w;
                opd e0 = ((SelectAlbumWidget) widget).e0();
                xag.h(e0.o, fpd.a);
                return;
            case 6:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) widget;
                suggestionsWidget.getRouter().B(suggestionsWidget);
                return;
            default:
                return;
        }
    }

    public void i() {
        switch (this.b) {
            case 2:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                il8 r0 = ((MediaBarWidget) this.c).r0();
                xag.h(r0.Z, rk8.a);
                return;
            default:
                return;
        }
    }

    public boolean j() {
        switch (this.b) {
            case 2:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                return ((MediaBarWidget) this.c).r0().n();
            default:
                return super.j();
        }
    }

    public void k() {
        switch (this.b) {
            case 2:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                ((MediaBarWidget) this.c).g0();
                return;
            default:
                return;
        }
    }

    public void l(lrb lrb) {
        switch (this.b) {
            case 6:
                boolean z = lrb == lrb.c;
                KProperty[] kPropertyArr = SuggestionsWidget.z0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.c;
                suggestionsWidget.n0().setVisibility(z ? 0 : 8);
                suggestionsWidget.o0().setVisibility(z ^ true ? 0 : 8);
                EndlessRecyclerView q0 = suggestionsWidget.q0();
                ViewGroup.LayoutParams layoutParams = q0.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = MathKt.roundToInt((z ? (float) 0 : (float) 20) * vo4.c().getDisplayMetrics().density);
                    q0.setLayoutParams(marginLayoutParams);
                    AppCompatTextView p0 = suggestionsWidget.p0();
                    ViewGroup.LayoutParams layoutParams2 = p0.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = MathKt.roundToInt((z ? (float) 0 : (float) 8) * vo4.c().getDisplayMetrics().density);
                        p0.setLayoutParams(marginLayoutParams2);
                        ReadOnlyProperty readOnlyProperty = suggestionsWidget.z;
                        if (z) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) readOnlyProperty.getValue(suggestionsWidget, SuggestionsWidget.z0[1]);
                            float f = vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO;
                            constraintLayout.setClipToOutline(true);
                            constraintLayout.setOutlineProvider(new n04(f));
                            return;
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) readOnlyProperty.getValue(suggestionsWidget, SuggestionsWidget.z0[1]);
                        constraintLayout2.setClipToOutline(true);
                        constraintLayout2.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 20.0f));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(int r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 4
            r3 = 0
            r4 = 0
            one.me.sdk.arch.Widget r5 = r11.c
            int r6 = r11.b
            switch(r6) {
                case 2: goto L_0x010a;
                case 3: goto L_0x0066;
                case 4: goto L_0x0047;
                case 5: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            kotlin.reflect.KProperty[] r11 = one.me.stickerspreview.set.StickerSetBottomSheet.x0
            one.me.stickerspreview.set.StickerSetBottomSheet r5 = (one.me.stickerspreview.set.StickerSetBottomSheet) r5
            zx3 r11 = r5.getParentController()
            boolean r0 = r11 instanceof defpackage.eqe
            if (r0 == 0) goto L_0x001d
            eqe r11 = (defpackage.eqe) r11
            goto L_0x001e
        L_0x001d:
            r11 = r3
        L_0x001e:
            if (r11 == 0) goto L_0x002f
            one.me.stickerspreview.StickerPreviewScreen r11 = (one.me.stickerspreview.StickerPreviewScreen) r11
            kotlin.reflect.KProperty[] r0 = one.me.stickerspreview.StickerPreviewScreen.v0
            r0 = r0[r2]
            kotlin.properties.ReadOnlyProperty r1 = r11.x
            java.lang.Object r11 = r1.getValue(r11, r0)
            r3 = r11
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x002f:
            if (r3 != 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            int r11 = r3.getBottom()
            if (r12 > r11) goto L_0x0043
            float r11 = (float) r12
            int r12 = r3.getBottom()
            float r12 = (float) r12
            float r11 = r11 - r12
            r3.setTranslationY(r11)
            goto L_0x0046
        L_0x0043:
            r3.setTranslationY(r4)
        L_0x0046:
            return
        L_0x0047:
            kotlin.reflect.KProperty[] r0 = one.me.sdk.gallery.selectalbum.SelectAlbumWidget.w
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r5 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r5
            opd r0 = r5.e0()
            android.view.View r11 = r11.f()
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r12
            r0.getClass()
            dpd r12 = new dpd
            r12.<init>(r11)
            s85 r11 = r0.o
            defpackage.xag.h(r11, r12)
            return
        L_0x0066:
            kotlin.reflect.KProperty[] r11 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.X0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r5 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r5
            boolean r11 = r5.isAttached()
            if (r11 == 0) goto L_0x0109
            boolean r11 = r5.u0()
            if (r11 != 0) goto L_0x0078
            goto L_0x0109
        L_0x0078:
            float r11 = (float) r12
            r12 = 76
            float r12 = (float) r12
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r12 = r12 * r2
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            float r12 = (float) r12
            float r11 = r11 / r12
            float r11 = kotlin.ranges.RangesKt.coerceIn((float) r11, (float) r4, (float) r1)
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x009c
            android.view.ViewGroup r12 = r5.r0()
            r12.getMeasuredHeight()
        L_0x009c:
            int r12 = defpackage.hya.c
            android.view.View r12 = r5.findViewById(r12)
            h3b r12 = (defpackage.h3b) r12
            if (r12 == 0) goto L_0x00e9
            float r0 = (float) r0
            float r0 = r0 - r11
            r12.setAlpha(r0)
            int r12 = r12.getMeasuredHeight()
            float r12 = (float) r12
            float r0 = r0 * r12
            int r12 = (int) r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.M0
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            if (r2 == 0) goto L_0x00c6
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.topMargin = r12
            r0.setLayoutParams(r2)
            goto L_0x00cc
        L_0x00c6:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r1)
            throw r11
        L_0x00cc:
            android.view.ViewGroup r12 = r5.r0()
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            if (r0 == 0) goto L_0x00e3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.W0
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = (int) r1
            r0.topMargin = r1
            r12.setLayoutParams(r0)
            goto L_0x00e9
        L_0x00e3:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r1)
            throw r11
        L_0x00e9:
            r12 = 1101004800(0x41a00000, float:20.0)
            float r12 = r12 * r11
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r12 = r12 * r0
            lr0 r0 = r5.V0
            r0.b = r12
            android.view.ViewGroup r12 = r5.r0()
            r12.invalidateOutline()
            nu4 r12 = r5.z
            if (r12 == 0) goto L_0x0109
            r12.setAlpha(r11)
        L_0x0109:
            return
        L_0x010a:
            kotlin.reflect.KProperty[] r11 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            one.me.chatscreen.mediabar.MediaBarWidget r5 = (one.me.chatscreen.mediabar.MediaBarWidget) r5
            r5.getClass()
            float r11 = (float) r12
            r6 = 48
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            float r6 = (float) r6
            float r6 = r11 / r6
            float r1 = kotlin.ranges.RangesKt.coerceIn((float) r6, (float) r4, (float) r1)
            android.view.View r4 = r5.requireView()
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            r6 = 0
            if (r4 == 0) goto L_0x0144
            iog r3 = defpackage.iog.g(r3, r4)
            fog r3 = r3.a
            r4 = 7
            wh7 r3 = r3.f(r4)
            int r3 = r3.b
            goto L_0x0145
        L_0x0144:
            r3 = r6
        L_0x0145:
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r7 = 5
            r7 = r4[r7]
            sn0 r7 = r5.Z
            java.lang.Object r7 = r7.getValue()
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 - r7
            int r3 = r3 - r12
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast((int) r3, (int) r6)
            android.widget.LinearLayout r7 = r5.j0()
            int r8 = r7.getPaddingLeft()
            int r9 = r7.getPaddingRight()
            int r10 = r7.getPaddingBottom()
            r7.setPadding(r8, r3, r9, r10)
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = r3 * r1
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            lr0 r7 = r5.J0
            r7.b = r3
            android.widget.LinearLayout r3 = r5.j0()
            r3.invalidateOutline()
            r2 = r4[r2]
            sn0 r2 = r5.Y
            java.lang.Object r2 = r2.getValue()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setAlpha(r1)
            h3b r1 = r5.q0()
            if (r12 > 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r0 = r6
        L_0x019d:
            r1.setShowDropdown(r0)
            r5.D0 = r11
            one.me.chatscreen.mediabar.MediaBarWidget.e0(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.m(int):void");
    }

    public boolean n(float f, float f2) {
        boolean z;
        f6f f6f;
        RecyclerView recyclerView;
        Widget widget = this.c;
        switch (this.b) {
            case 2:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                if (mediaBarWidget.i0().x0) {
                    return false;
                }
                z3a z3a = mediaBarWidget.X;
                if (z3a == null || (f6f = (f6f) ((j50) z3a.b).v) == null) {
                    z = false;
                } else {
                    Rect rect = rcg.a;
                    rcg.d(rect, f6f);
                    z = rect.contains((int) f, (int) f2);
                }
                if (z) {
                    return false;
                }
                if (mediaBarWidget.p0().getVisibility() == 0) {
                    return false;
                }
                zx3 a = mediaBarWidget.o0().a();
                MediaGalleryWidget mediaGalleryWidget = a instanceof MediaGalleryWidget ? (MediaGalleryWidget) a : null;
                return !(mediaGalleryWidget != null ? mediaGalleryWidget.c0().canScrollVertically(-1) : false);
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                urc urc = messageContextMenuBottomSheet.N0;
                boolean canScrollVertically = (urc == null || (recyclerView = urc.d) == null) ? false : recyclerView.canScrollVertically(-1);
                RecyclerView recyclerView2 = messageContextMenuBottomSheet.M0;
                return !(recyclerView2 != null ? recyclerView2.canScrollVertically(-1) : false) && !canScrollVertically;
            case 4:
                KProperty[] kPropertyArr2 = SelectAlbumWidget.w;
                return !((SelectAlbumWidget) widget).c0().canScrollVertically(1);
            case 5:
                KProperty[] kPropertyArr3 = StickerSetBottomSheet.x0;
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) widget;
                stickerSetBottomSheet.getClass();
                return ((RecyclerView) stickerSetBottomSheet.Y.getValue(stickerSetBottomSheet, StickerSetBottomSheet.x0[2])).computeVerticalScrollOffset() == 0;
            case 6:
                KProperty[] kPropertyArr4 = SuggestionsWidget.z0;
                return ((LinearLayoutManager) ((SuggestionsWidget) widget).q0().getLayoutManager()).S0() == 0;
            default:
                return super.n(f, f2);
        }
    }
}
