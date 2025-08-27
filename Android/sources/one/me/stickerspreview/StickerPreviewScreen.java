package one.me.stickerspreview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/stickerspreview/StickerPreviewScreen;", "Lone/me/sdk/arch/Widget;", "Leqe;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "stickerId", "chatId", "forwardId", "(JJJ)V", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickerPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerPreviewScreen.kt\none/me/stickerspreview/StickerPreviewScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n419#2:342\n419#2:343\n419#2:344\n235#2,10:345\n1#3:355\n24#4:356\n24#4:357\n24#4:358\n24#4:359\n24#4:360\n24#4:361\n24#4:362\n24#4:363\n24#4:364\n24#4:365\n24#4:368\n24#4:369\n24#4:370\n295#5,2:366\n*S KotlinDebug\n*F\n+ 1 StickerPreviewScreen.kt\none/me/stickerspreview/StickerPreviewScreen\n*L\n55#1:342\n56#1:343\n58#1:344\n73#1:345,10\n150#1:356\n165#1:357\n188#1:358\n191#1:359\n192#1:360\n213#1:361\n215#1:362\n216#1:363\n230#1:364\n233#1:365\n296#1:368\n96#1:369\n106#1:370\n271#1:366,2\n*E\n"})
public final class StickerPreviewScreen extends Widget implements eqe {
    public static final /* synthetic */ KProperty[] v0;
    public final ReadOnlyProperty X;
    public final sn0 Y;
    public final sn0 Z;
    public final is a;
    public final is b;
    public final yh7 c;
    public final String o;
    public final Lazy v;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty z;

    static {
        Class<StickerPreviewScreen> cls = StickerPreviewScreen.class;
        v0 = new KProperty[]{wj6.p(cls, "stickerId", "getStickerId()J", 0), wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "forwardId", "getForwardId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0), wj6.p(cls, "stickerContainer", "getStickerContainer()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "favoriteButton", "getFavoriteButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0), wj6.p(cls, "stickerSetSheetRouter", "getStickerSetSheetRouter()Lcom/bluelinelabs/conductor/Router;", 0), wj6.p(cls, "staticCellView", "getStaticCellView()Lone/me/sdk/stickers/StickerCellView;", 0), wj6.p(cls, "lottieCellView", "getLottieCellView()Lone/me/sdk/stickers/lottie/LottieStickerCellView;", 0)};
    }

    public StickerPreviewScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Class<Long> cls = Long.class;
        is isVar = new is(cls, 0L, "arg_key_sticker_id");
        this.a = new is(cls, 0L, "arg_key_chat_id");
        this.b = new is(cls, 0L, "arg_key_forward_id");
        jdb jdb = jdb.b;
        jdb jdb2 = anf.a;
        this.c = new yh7(jdb, new nr0(jdb, mr0.a, false));
        this.o = "StickerPreviewScreen";
        this.v = createViewModelLazy(upe.class, new mle(2, new npe(this, 0)));
        this.w = viewBinding(h1b.k);
        this.x = viewBinding(h1b.d);
        this.y = viewBinding(h1b.g);
        this.z = viewBinding(h1b.a);
        this.X = Widget.childRouter$default(this, h1b.h, (Function1) null, 2, (Object) null);
        this.Y = binding(new npe(this, 1));
        this.Z = binding(new npe(this, 2));
        upe c0 = c0();
        KProperty kProperty = v0[0];
        c0.l(((Number) isVar.a(this)).longValue());
        upe c02 = c0();
        if (c02.b != 0) {
            aje u = ev0.u(c02.a, ((osa) c02.c).b(), f14.b, new ope(c02, (Continuation) null));
            c02.C0.setValue(c02, upe.F0[1], u);
        }
    }

    public final upe c0() {
        return (upe) this.v.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.c;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1574getScopeIdIluPPks() {
        return this.o;
    }

    public final void onAttach(View view) {
        Window window;
        View currentFocus;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            int i = pq7.a;
            if (pq7.b(pq7.c)) {
                kr7.C(currentFocus);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r0 = r22
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r22.getContext()
            r1.<init>(r2)
            java.lang.String r2 = "#CC000000"
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setBackgroundColor(r2)
            mpe r2 = new mpe
            r3 = 0
            r2.<init>(r0, r3)
            defpackage.ct.G(r1, 300, r2)
            oz1 r2 = new oz1
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            int r3 = defpackage.h1b.h
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            r1.addView(r2)
            android.content.Context r2 = r1.getContext()
            r3 = 0
            h3b r2 = defpackage.o54.d(r2, r3)
            int r5 = defpackage.h1b.k
            r2.setId(r5)
            r5 = 52
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r4, r5)
            r7 = 48
            r6.gravity = r7
            r6.topMargin = r5
            r2.setLayoutParams(r6)
            l2b r5 = defpackage.l2b.a
            r2.setCustomTheme(r5)
            r2.setBackground(r3)
            z2b r3 = defpackage.z2b.a
            r2.setForm(r3)
            q2b r3 = new q2b
            jkb r6 = new jkb
            r7 = 22
            r6.<init>((int) r7, (java.lang.Object) r0)
            r3.<init>(r6)
            r2.setLeftActions(r3)
            r1.addView(r2)
            r2 = 160(0xa0, float:2.24E-43)
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r6 = r1.getContext()
            r3.<init>(r6)
            int r6 = defpackage.h1b.d
            r3.setId(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r6.<init>(r4, r7)
            r8 = 17
            r6.gravity = r8
            r3.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r8 = r3.getContext()
            r6.<init>(r8)
            int r8 = defpackage.h1b.g
            r6.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r4, r2)
            r6.setLayoutParams(r8)
            r3.addView(r6)
            kotlin.reflect.KProperty[] r4 = v0
            r6 = 1
            r8 = r4[r6]
            is r8 = r0.a
            java.lang.Object r9 = r8.a(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e3
            r9 = r6
            goto L_0x00e4
        L_0x00e3:
            r9 = 0
        L_0x00e4:
            is r13 = r0.b
            r14 = 2
            r10 = 20
            r15 = 120(0x78, float:1.68E-43)
            if (r9 == 0) goto L_0x016f
            t67 r9 = new t67
            android.content.Context r11 = r3.getContext()
            r9.<init>(r11)
            int r11 = defpackage.h1b.c
            r9.setId(r11)
            float r11 = (float) r15
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r11, r7)
            r12.gravity = r6
            float r6 = (float) r10
            android.content.res.Resources r18 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r18.getDisplayMetrics()
            float r10 = r10.density
            int r6 = defpackage.g63.b(r6, r10, r2)
            r12.topMargin = r6
            r6 = r4[r14]
            java.lang.Object r6 = r13.a(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            long r20 = r6.longValue()
            r16 = 0
            int r6 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x0136
            goto L_0x0148
        L_0x0136:
            r6 = 60
            float r10 = (float) r6
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r11 = kotlin.math.MathKt.roundToInt((float) r10)
        L_0x0148:
            r12.leftMargin = r11
            r9.setLayoutParams(r12)
            int r6 = defpackage.cad.W0
            r9.setIcon(r6)
            int r6 = defpackage.i1b.d
            r9.setLabel(r6)
            zpa r6 = defpackage.zpa.a
            one.me.sdk.uikit.common.button.OneMeButton r10 = r9.b
            r10.setMode(r6)
            xpa r6 = defpackage.xpa.v
            r10.setAppearance(r6)
            mpe r6 = new mpe
            r10 = 2
            r6.<init>(r0, r10)
            defpackage.ct.G(r9, 300, r6)
            r3.addView(r9)
        L_0x016f:
            t67 r6 = new t67
            android.content.Context r9 = r3.getContext()
            r6.<init>(r9)
            int r9 = defpackage.h1b.a
            r6.setId(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            float r10 = (float) r15
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r9.<init>(r11, r7)
            r11 = 1
            r9.gravity = r11
            r11 = 20
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r12 = defpackage.g63.b(r11, r12, r2)
            r9.topMargin = r12
            r12 = r4[r14]
            java.lang.Object r12 = r13.a(r0)
            java.lang.Number r12 = (java.lang.Number) r12
            long r18 = r12.longValue()
            r15 = 0
            int r12 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x01bb
            goto L_0x01df
        L_0x01bb:
            r12 = 1
            r17 = r4[r12]
            java.lang.Object r8 = r8.a(r0)
            java.lang.Number r8 = (java.lang.Number) r8
            long r17 = r8.longValue()
            int r8 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x01df
            r8 = 60
            float r8 = (float) r8
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r8 = r8 * r12
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            goto L_0x01e0
        L_0x01df:
            r8 = 0
        L_0x01e0:
            r9.rightMargin = r8
            r6.setLayoutParams(r9)
            int r8 = defpackage.cad.L
            r6.setIcon(r8)
            int r8 = defpackage.i1b.a
            r6.setLabel(r8)
            one.me.sdk.uikit.common.button.OneMeButton r8 = r6.b
            r8.setCustomTheme(r5)
            mpe r8 = new mpe
            r9 = 3
            r8.<init>(r0, r9)
            defpackage.ct.G(r6, 300, r8)
            r3.addView(r6)
            r4 = r4[r14]
            java.lang.Object r4 = r13.a(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            long r8 = r4.longValue()
            r12 = 0
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0267
            t67 r4 = new t67
            android.content.Context r6 = r3.getContext()
            r4.<init>(r6)
            int r6 = defpackage.h1b.b
            r4.setId(r6)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r6 = kotlin.math.MathKt.roundToInt((float) r10)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r6, r7)
            r7 = 1
            r8.gravity = r7
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            int r2 = defpackage.g63.b(r11, r7, r2)
            r8.topMargin = r2
            r8.rightMargin = r6
            r4.setLayoutParams(r8)
            int r2 = defpackage.cad.Z1
            r4.setIcon(r2)
            int r2 = defpackage.i1b.b
            r4.setLabel(r2)
            one.me.sdk.uikit.common.button.OneMeButton r2 = r4.b
            r2.setCustomTheme(r5)
            mpe r2 = new mpe
            r5 = 1
            r2.<init>(r0, r5)
            defpackage.ct.G(r4, 300, r2)
            r3.addView(r4)
        L_0x0267:
            r1.addView(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerspreview.StickerPreviewScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onViewCreated(View view) {
        KProperty[] kPropertyArr = v0;
        KProperty kProperty = kPropertyArr[7];
        ReadOnlyProperty readOnlyProperty = this.X;
        if (!((e9d) readOnlyProperty.getValue(this, kProperty)).n()) {
            ((e9d) readOnlyProperty.getValue(this, kPropertyArr[7])).R(iq.n(new StickerSetBottomSheet(this.o, (DefaultConstructorMarker) null), (ey3) null, (ey3) null));
        }
        bs0.K(new ps5(c0().w0, new p2c(2, this, StickerPreviewScreen.class, "handleNewSticker", "handleNewSticker(Lone/me/sdk/stickers/model/StickerModel;)V", 4, 5), 5), getViewLifecycleScope());
        bs0.K(new ps5(c0().y0, new p2c(2, (h3b) this.w.getValue(this, kPropertyArr[3]), h3b.class, "setTitle", "setTitle(Ljava/lang/CharSequence;)V", 4, 6), 5), getViewLifecycleScope());
        bs0.K(new ps5(c0().Y, new p2c(2, this, StickerPreviewScreen.class, "handleNavEvent", "handleNavEvent(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 7), 5), getViewLifecycleScope());
        bs0.K(new ps5(c0().Z, new p2c(2, this, StickerPreviewScreen.class, "handleEvent", "handleEvent(Lone/me/sdk/arch/event/Event;)V", 4, 8), 5), getViewLifecycleScope());
    }

    public StickerPreviewScreen(long j, long j2, long j3) {
        this(o54.f(TuplesKt.to("arg_key_sticker_id", Long.valueOf(j)), TuplesKt.to("arg_key_chat_id", Long.valueOf(j2)), TuplesKt.to("arg_key_forward_id", Long.valueOf(j3))));
    }
}
