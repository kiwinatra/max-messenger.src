package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lce  reason: default package */
public final /* synthetic */ class lce implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lce(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        Object obj;
        Integer num = null;
        switch (this.a) {
            case 0:
                mce mce = (mce) this.b;
                return new n7g(mce.a, mce.b, mce.c, mce.d);
            case 1:
                KProperty[] kPropertyArr = StartConversationScreen.E0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) this.b;
                startConversationScreen.getClass();
                KProperty[] kPropertyArr2 = StartConversationScreen.E0;
                KProperty kProperty = kPropertyArr2[0];
                is isVar = startConversationScreen.c;
                if (((Boolean) isVar.a(startConversationScreen)).booleanValue()) {
                    ((RecyclerView) startConversationScreen.z.getValue(startConversationScreen, kPropertyArr2[3])).z0(0);
                    KProperty kProperty2 = kPropertyArr2[0];
                    isVar.b(startConversationScreen, Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 2:
                return ew3.b(((xle) this.b).getContext(), cad.U1);
            case 3:
                return new ame((ph1) ((StartRecordBottomSheet) this.b).w0.getValue());
            case 4:
                return (jgd) this.b;
            case 5:
                ejd ejd = r89.y;
                k2b f = fu4.k.f((epe) this.b);
                ejd.getClass();
                return ejd.a(f);
            case 6:
                KProperty[] kPropertyArr3 = StickerSetBottomSheet.x0;
                aya aya = new aya(((StickerSetBottomSheet) this.b).getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                aya.setLayoutParams(layoutParams);
                aya.setAppearance(sxa.a);
                aya.setSize(vxa.a);
                return aya;
            case 7:
                gwe gwe = (gwe) this.b;
                return new bx9(gwe.a, gwe.v, new r6(22, gwe));
            case 8:
                djf djf = (djf) this.b;
                String str = djf.a;
                int i = djf.b;
                int i2 = djf.c;
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.m23constructorimpl(QrCodeGenerator.nativeRenderSvg(str, i, i2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m29isFailureimpl(obj)) {
                    obj = null;
                }
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return null;
                }
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int i3 = djf.b;
                int i4 = djf.c;
                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, config);
                createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i4);
                Paint paint = djf.g;
                Shader.TileMode tileMode = djf.i;
                paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                djf.j = true;
                return Unit.INSTANCE;
            case 9:
                ViewConfiguration viewConfiguration = ViewConfiguration.get(((a6f) this.b).b.getContext());
                int max = Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2;
                Integer valueOf = Integer.valueOf(max);
                if (max > 0) {
                    num = valueOf;
                }
                return Integer.valueOf(num != null ? num.intValue() : MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density));
            case 10:
                int i5 = SwipeWidget.b;
                return Boolean.valueOf(((SwipeWidget) this.b).J());
            case 11:
                return ((aua) ((wbf) this.b).j.getValue()).g();
            case 12:
                hff hff = (hff) this.b;
                hff.getClass();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hff.l, property, new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
                ofFloat.setDuration(100);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hff.m, property, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                ofFloat2.setDuration(100);
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{hff.e.getWidth(), hff.n - ((int) (((float) MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)) * hff.a.getResources().getDisplayMetrics().density))});
                if (ofInt != null) {
                    ofInt.addUpdateListener(new fff(hff, 0));
                }
                if (ofInt != null) {
                    ofInt.setDuration(100);
                }
                AnimatorSet animatorSet = hff.q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = hff.p;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                hff.q = animatorSet3;
                animatorSet3.playSequentially(new Animator[]{ofFloat, ofInt, ofFloat2});
                AnimatorSet animatorSet4 = hff.q;
                if (animatorSet4 != null) {
                    animatorSet4.addListener(new gff(hff, 0));
                }
                AnimatorSet animatorSet5 = hff.q;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                return Unit.INSTANCE;
            case 13:
                return new j1g(((uhf) this.b).a);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (k2b k2b : (Set) ((l15) this.b).a) {
                    concurrentHashMap.put(k2b.getName(), k2b);
                }
                String str2 = o84.f0.e;
                m2b m2b = m2b.a;
                concurrentHashMap.put(str2, m2b);
                concurrentHashMap.put(vi4.f0.e, m2b);
                String str3 = hu6.f0.e;
                l2b l2b = l2b.a;
                concurrentHashMap.put(str3, l2b);
                concurrentHashMap.put(q09.f0.e, m2b);
                concurrentHashMap.put(l9a.f0.e, l2b);
                return concurrentHashMap;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                float intValue = (float) ((Number) ((c3g) this.b).c.getValue()).intValue();
                return Integer.valueOf((int) (intValue - (0.4f * intValue)));
            case 16:
                int i6 = nad.g1;
                ThreadLocal threadLocal = h4d.a;
                Drawable a2 = c4d.a((Resources) this.b, i6, (Resources.Theme) null);
                a2.setTint(-1);
                return new vdd(a2, ydd.l);
            case LangUtils.HASH_SEED /*17*/:
                return new m7g((j7g) this.b);
            case 18:
                KProperty[] kPropertyArr4 = VideoViewerWidget.X;
                j9g e0 = ((VideoViewerWidget) this.b).e0();
                if (e0 != null) {
                    return ((ChatMediaViewerScreen) e0).p0();
                }
                return null;
            case 19:
                KProperty[] kPropertyArr5 = WelcomeScreen.X;
                return new aj7(((WelcomeScreen) this.b).getRouter());
            case 20:
                return Widget.childWidgetContainer_delegate$lambda$13((Widget) this.b);
            case 21:
                return new eng(((eng) this.b).b, 1);
            case 22:
                g7a g7a = new g7a(1);
                bpg bpg = (bpg) this.b;
                g7a.c = bpg.a;
                g7a.a = Math.min(100, 50);
                Lazy lazy = bpg.c;
                g7a.d = ((aua) lazy.getValue()).b();
                g7a.b = ((aua) lazy.getValue()).a();
                return new ve3(g7a);
            default:
                String str4 = ipg.o;
                z68.c(str4, "start init property workManager", new Object[0]);
                ipg ipg = (ipg) this.b;
                dpg d = dpg.d(new hpg(ipg, ipg.a));
                z68.c(str4, "workManager property inited!", new Object[0]);
                h88 h88 = new h88(1, (byte) 0);
                synchronized (h88.c) {
                    h88.d = h88;
                }
                return d;
        }
    }
}
