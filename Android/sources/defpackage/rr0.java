package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.RangesKt;
import ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout;
import ru.ok.messages.stickers.widgets.StickersView;

/* renamed from: rr0  reason: default package */
public final class rr0 extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ rr0(int i2, Object obj) {
        this.h = i2;
        this.i = obj;
    }

    public void F(View view, int i2) {
        switch (this.h) {
            case 2:
                qre qre = ((StickerSlideRelativeLayout) this.i).v0;
                if (qre != null) {
                    j4a j4a = (j4a) qre;
                    rre state = j4a.w0.getState();
                    rre rre = rre.c;
                    if (state == rre) {
                        j4a.x0.setState(1);
                        j4a.c0();
                        j4a.y0.m(8);
                    }
                    if (j4a.w0.getState() == rre.a) {
                        s3a s3a = j4a.o;
                        if (s3a == null || TextUtils.isEmpty(s3a.e0())) {
                            j4a.x0.setTabsVisible(true);
                            j4a.x0.setSearchHintVisible(false);
                        } else {
                            if (s3a.J0 && ((Context) s3a.b).getResources().getConfiguration().orientation != 2) {
                                s3a.M0.a(0, 8);
                            }
                            j4a.x0.setTabsVisible(false);
                            j4a.x0.setSearchHintVisible(true);
                        }
                    }
                    if (j4a.w0.getState() != rre) {
                        j4a.N(new l3a(12));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void G(int i2) {
        switch (this.h) {
            case 0:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.i;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.L(1);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.i;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) this.i;
                StickersView stickersView = stickerSlideRelativeLayout.x0;
                if (stickersView == null) {
                    stickersView = null;
                }
                stickersView.setListVisible((i2 == 0 && stickerSlideRelativeLayout.getState() == rre.a) ? false : true);
                return;
            default:
                return;
        }
    }

    public void H(View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj = this.i;
        switch (this.h) {
            case 0:
                ((BottomSheetBehavior) obj).A(i3);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.a.b0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.m(i2);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        rae.w(it.next());
                        throw null;
                    }
                    return;
                }
                return;
            case 3:
                f6f f6f = (f6f) obj;
                if (i2 <= (-f6f.getWidth()) || i2 >= f6f.getWidth()) {
                    f6f.b = true;
                    e6f callback = f6f.getCallback();
                    if (callback != null) {
                        Handler handler = l0b.a;
                        l0b.b((h0b) ((i0b) callback).a.y, g0b.b);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f2, code lost:
        if (java.lang.Math.abs(r10 - r8.a.y()) < java.lang.Math.abs(r10 - r8.a.z())) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0214, code lost:
        if (r10 > r8.E) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0264, code lost:
        if (java.lang.Math.abs(r9.getTop() - r8.E()) < java.lang.Math.abs(r9.getTop() - r8.E)) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0292, code lost:
        if (java.lang.Math.abs(r10 - r8.E) < java.lang.Math.abs(r10 - r8.G)) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ac, code lost:
        if (java.lang.Math.abs(r10 - r8.D) < java.lang.Math.abs(r10 - r8.G)) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02bc, code lost:
        if (r10 < java.lang.Math.abs(r10 - r8.G)) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02cd, code lost:
        if (java.lang.Math.abs(r10 - r11) < java.lang.Math.abs(r10 - r8.G)) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c1, code lost:
        if (r8.a.N(r9) == false) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            int r0 = r8.h
            switch(r0) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x019c;
                case 2: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r10 = r9.getWidth()
            int r10 = r10 / 2
            int r11 = r10 / 2
            int r0 = r10 - r11
            int r10 = r10 + r11
            int r11 = r9.getLeft()
            java.lang.Object r8 = r8.i
            f6f r8 = (defpackage.f6f) r8
            if (r11 <= r0) goto L_0x001f
            int r10 = r8.getWidth()
            goto L_0x002f
        L_0x001f:
            int r11 = r9.getRight()
            if (r11 >= r10) goto L_0x002b
            int r10 = r8.getWidth()
            int r10 = -r10
            goto L_0x002f
        L_0x002b:
            int r10 = r8.getPaddingStart()
        L_0x002f:
            kag r11 = r8.a
            int r0 = r9.getTop()
            boolean r9 = r11.r(r9, r10, r0)
            if (r9 == 0) goto L_0x003e
            r8.postInvalidateOnAnimation()
        L_0x003e:
            return
        L_0x003f:
            r10 = -1
            java.lang.Object r8 = r8.i
            ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout r8 = (ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout) r8
            r8.w = r10
            r10 = 0
            r8.x = r10
            boolean r0 = r8.z
            if (r0 == 0) goto L_0x005b
            int r0 = r8.getInitialOffset()
            int r1 = r8.getSuggestOffset()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            goto L_0x005c
        L_0x005b:
            r0 = r10
        L_0x005c:
            float r1 = java.lang.Math.abs(r11)
            r2 = 1128792064(0x43480000, float:200.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r2 = 2
            if (r1 <= 0) goto L_0x00b1
            rre r1 = r8.getState()
            rre r3 = defpackage.rre.c
            r4 = 0
            if (r1 != r3) goto L_0x007e
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x007e
            rre r1 = r8.v
            rre r5 = defpackage.rre.b
            if (r1 == r5) goto L_0x007e
            rre r11 = defpackage.rre.a
            goto L_0x00e8
        L_0x007e:
            boolean r1 = r8.z
            if (r1 == 0) goto L_0x00aa
            int r1 = r9.getTop()
            int r5 = r8.getSuggestOffset()
            rre r6 = r8.getState()
            rre r7 = defpackage.rre.a
            if (r6 != r7) goto L_0x0094
            int r0 = r0 / r2
            goto L_0x0095
        L_0x0094:
            r0 = r10
        L_0x0095:
            int r5 = r5 - r0
            if (r1 >= r5) goto L_0x00a1
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            rre r3 = defpackage.rre.b
        L_0x009f:
            r11 = r3
            goto L_0x00e8
        L_0x00a1:
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a7
            r11 = r7
            goto L_0x00e8
        L_0x00a7:
            rre r11 = defpackage.rre.b
            goto L_0x00e8
        L_0x00aa:
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x009f
            rre r3 = defpackage.rre.a
            goto L_0x009f
        L_0x00b1:
            boolean r11 = r8.z
            if (r11 == 0) goto L_0x00d8
            int r11 = r9.getTop()
            int r1 = r8.getSuggestOffset()
            int r11 = r11 - r1
            int r11 = java.lang.Math.abs(r11)
            int r0 = r0 / r2
            if (r11 >= r0) goto L_0x00c8
            rre r11 = defpackage.rre.b
            goto L_0x00e8
        L_0x00c8:
            int r11 = r9.getTop()
            int r0 = r8.getSuggestOffset()
            if (r11 >= r0) goto L_0x00d5
            rre r11 = defpackage.rre.c
            goto L_0x00e8
        L_0x00d5:
            rre r11 = defpackage.rre.a
            goto L_0x00e8
        L_0x00d8:
            int r11 = r9.getTop()
            int r0 = r8.getInitialOffset()
            int r0 = r0 / r2
            if (r11 >= r0) goto L_0x00e6
            rre r11 = defpackage.rre.c
            goto L_0x00e8
        L_0x00e6:
            rre r11 = defpackage.rre.a
        L_0x00e8:
            qre r0 = r8.v0
            if (r0 == 0) goto L_0x0188
            rre r1 = r8.getState()
            j4a r0 = (defpackage.j4a) r0
            rre r3 = defpackage.rre.c
            s3a r4 = r0.o
            d6a r5 = r0.Y
            if (r11 != r3) goto L_0x0142
            ru.ok.messages.stickers.widgets.StickersView r3 = r0.x0
            r3.setState(r2)
            r0.c0()
            b33 r3 = r0.y0
            r3.m(r10)
            if (r4 == 0) goto L_0x013e
            java.lang.String r10 = r4.e0()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0114
            goto L_0x013e
        L_0x0114:
            rre r10 = defpackage.rre.b
            if (r1 != r10) goto L_0x0129
            r5.p(r2)
            java.lang.String r10 = defpackage.rae.e(r2)
            java.lang.Object r2 = r5.b
            nd r2 = (defpackage.nd) r2
            java.lang.String r3 = "STICKERS_SEARCH_OPEN_FROM_SUGGEST"
            r2.f(r3, r10)
            goto L_0x014b
        L_0x0129:
            rre r10 = defpackage.rre.a
            if (r1 != r10) goto L_0x014b
            r5.p(r2)
            java.lang.String r10 = defpackage.rae.e(r2)
            java.lang.Object r2 = r5.b
            nd r2 = (defpackage.nd) r2
            java.lang.String r3 = "STICKERS_SEARCH_OPEN_FROM_CHAT"
            r2.f(r3, r10)
            goto L_0x014b
        L_0x013e:
            r5.p(r2)
            goto L_0x014b
        L_0x0142:
            if (r4 == 0) goto L_0x014b
            java.lang.Object r2 = r4.c
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r10)
        L_0x014b:
            rre r10 = defpackage.rre.b
            if (r1 != r10) goto L_0x0188
            rre r10 = defpackage.rre.a
            if (r11 != r10) goto L_0x0188
            java.lang.Object r10 = r0.a
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x015b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r0 = r10.next()
            a2a r0 = (defpackage.a2a) r0
            if (r4 != 0) goto L_0x016c
            java.lang.String r1 = ""
            goto L_0x0170
        L_0x016c:
            java.lang.String r1 = r4.e0()
        L_0x0170:
            r0.getClass()
            boolean r1 = defpackage.cvg.A(r1)
            if (r1 == 0) goto L_0x015b
            ru.ok.messages.stickers.FrgStickersLoader r0 = r0.b
            r0.h3()
            goto L_0x015b
        L_0x017f:
            java.lang.Object r10 = r5.b
            nd r10 = (defpackage.nd) r10
            java.lang.String r0 = "STICKERS_SUGGEST_MANUAL_CLOSE"
            r10.e(r0)
        L_0x0188:
            r8.f(r11)
            int r9 = r9.getLeft()
            int r10 = r8.getStateOffset()
            kag r11 = r8.c
            r11.p(r9, r10)
            r8.invalidate()
            return
        L_0x019c:
            java.lang.Object r8 = r8.i
            com.google.android.material.sidesheet.SideSheetBehavior r8 = (com.google.android.material.sidesheet.SideSheetBehavior) r8
            kv0 r0 = r8.a
            boolean r0 = r0.L(r10)
            r1 = 3
            if (r0 == 0) goto L_0x01aa
            goto L_0x01f4
        L_0x01aa:
            kv0 r0 = r8.a
            boolean r0 = r0.Z(r9, r10)
            r2 = 5
            if (r0 == 0) goto L_0x01c5
            kv0 r0 = r8.a
            boolean r10 = r0.O(r10, r11)
            if (r10 != 0) goto L_0x01c3
            kv0 r10 = r8.a
            boolean r10 = r10.N(r9)
            if (r10 == 0) goto L_0x01f4
        L_0x01c3:
            r1 = r2
            goto L_0x01f4
        L_0x01c5:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01d7
            float r10 = java.lang.Math.abs(r10)
            float r11 = java.lang.Math.abs(r11)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x01d7
            goto L_0x01c3
        L_0x01d7:
            int r10 = r9.getLeft()
            kv0 r11 = r8.a
            int r11 = r11.y()
            int r11 = r10 - r11
            int r11 = java.lang.Math.abs(r11)
            kv0 r0 = r8.a
            int r0 = r0.z()
            int r10 = r10 - r0
            int r10 = java.lang.Math.abs(r10)
            if (r11 >= r10) goto L_0x01c3
        L_0x01f4:
            r10 = 1
            r8.z(r1, r9, r10)
            return
        L_0x01f9:
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            java.lang.Object r8 = r8.i
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r8
            if (r1 >= 0) goto L_0x0218
            boolean r10 = r8.b
            if (r10 == 0) goto L_0x020b
        L_0x0208:
            r2 = r3
            goto L_0x02cf
        L_0x020b:
            int r10 = r9.getTop()
            java.lang.System.currentTimeMillis()
            int r11 = r8.E
            if (r10 <= r11) goto L_0x0208
            goto L_0x02cf
        L_0x0218:
            boolean r1 = r8.I
            if (r1 == 0) goto L_0x0267
            boolean r1 = r8.M(r9, r11)
            if (r1 == 0) goto L_0x0267
            float r10 = java.lang.Math.abs(r10)
            float r0 = java.lang.Math.abs(r11)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x0235
            int r10 = r8.d
            float r10 = (float) r10
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x0244
        L_0x0235:
            int r10 = r9.getTop()
            int r11 = r8.T
            int r0 = r8.E()
            int r0 = r0 + r11
            int r0 = r0 / 2
            if (r10 <= r0) goto L_0x0247
        L_0x0244:
            r2 = 5
            goto L_0x02cf
        L_0x0247:
            boolean r10 = r8.b
            if (r10 == 0) goto L_0x024c
            goto L_0x0208
        L_0x024c:
            int r10 = r9.getTop()
            int r11 = r8.E()
            int r10 = r10 - r11
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.getTop()
            int r0 = r8.E
            int r11 = r11 - r0
            int r11 = java.lang.Math.abs(r11)
            if (r10 >= r11) goto L_0x02cf
            goto L_0x0208
        L_0x0267:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L_0x0295
            float r10 = java.lang.Math.abs(r10)
            float r11 = java.lang.Math.abs(r11)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0279
            goto L_0x0295
        L_0x0279:
            boolean r10 = r8.b
            if (r10 == 0) goto L_0x027f
        L_0x027d:
            r2 = r1
            goto L_0x02cf
        L_0x027f:
            int r10 = r9.getTop()
            int r11 = r8.E
            int r11 = r10 - r11
            int r11 = java.lang.Math.abs(r11)
            int r0 = r8.G
            int r10 = r10 - r0
            int r10 = java.lang.Math.abs(r10)
            if (r11 >= r10) goto L_0x027d
            goto L_0x02cf
        L_0x0295:
            int r10 = r9.getTop()
            boolean r11 = r8.b
            if (r11 == 0) goto L_0x02b0
            int r11 = r8.D
            int r11 = r10 - r11
            int r11 = java.lang.Math.abs(r11)
            int r0 = r8.G
            int r10 = r10 - r0
            int r10 = java.lang.Math.abs(r10)
            if (r11 >= r10) goto L_0x027d
            goto L_0x0208
        L_0x02b0:
            int r11 = r8.E
            if (r10 >= r11) goto L_0x02c0
            int r11 = r8.G
            int r11 = r10 - r11
            int r11 = java.lang.Math.abs(r11)
            if (r10 >= r11) goto L_0x02cf
            goto L_0x0208
        L_0x02c0:
            int r11 = r10 - r11
            int r11 = java.lang.Math.abs(r11)
            int r0 = r8.G
            int r10 = r10 - r0
            int r10 = java.lang.Math.abs(r10)
            if (r11 >= r10) goto L_0x027d
        L_0x02cf:
            r8.getClass()
            r10 = 1
            r8.N(r2, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr0.I(android.view.View, float, float):void");
    }

    public final boolean Q(View view, int i2) {
        WeakReference weakReference;
        switch (this.h) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.i;
                int i3 = bottomSheetBehavior.L;
                if (i3 == 1 || bottomSheetBehavior.b0) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.Z == i2) {
                    WeakReference weakReference2 = bottomSheetBehavior.V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.U;
                return weakReference3 != null && weakReference3.get() == view;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.i;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
            case 2:
                StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) this.i;
                StickersView stickersView = stickerSlideRelativeLayout.x0;
                if (stickersView == null) {
                    stickersView = null;
                }
                return view == stickersView && stickerSlideRelativeLayout.x;
            default:
                f6f f6f = (f6f) this.i;
                e6f callback = f6f.getCallback();
                return view == (callback != null ? ((i0b) callback).b : null) && !f6f.b;
        }
    }

    public int f(View view, int i2) {
        switch (this.h) {
            case 0:
                return view.getLeft();
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.i;
                return h88.l(i2, sideSheetBehavior.a.D(), sideSheetBehavior.a.C());
            case 3:
                return RangesKt.coerceIn(i2, -2147483647, (int) IntCompanionObject.MAX_VALUE);
            default:
                return super.f(view, i2);
        }
    }

    public int g(View view, int i2) {
        switch (this.h) {
            case 0:
                return h88.l(i2, ((BottomSheetBehavior) this.i).E(), u(view));
            case 1:
                return view.getTop();
            case 2:
                StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) this.i;
                return i2 < stickerSlideRelativeLayout.getFullScreenOffset() ? stickerSlideRelativeLayout.getFullScreenOffset() : RangesKt.coerceAtMost(i2, stickerSlideRelativeLayout.getInitialOffset());
            default:
                return super.g(view, i2);
        }
    }

    public int q(int i2) {
        switch (this.h) {
            case 2:
                StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) this.i;
                StickersView stickersView = stickerSlideRelativeLayout.x0;
                if (stickersView == null) {
                    stickersView = null;
                }
                return stickerSlideRelativeLayout.indexOfChild(stickersView);
            default:
                return i2;
        }
    }

    public int t(View view) {
        switch (this.h) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.i;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            case 2:
                return 0;
            case 3:
                return view.getWidth();
            default:
                return super.t(view);
        }
    }

    public int u(View view) {
        switch (this.h) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.i;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            case 2:
                return view.getHeight();
            default:
                return super.u(view);
        }
    }
}
