package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import java.lang.Thread;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ep1  reason: default package */
public final /* synthetic */ class ep1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ep1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARNING: type inference failed for: r15v22, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    public final Object invoke(Object obj) {
        SpannableString spannableString;
        boolean z = false;
        switch (this.a) {
            case 0:
                Conversation conversation = (Conversation) obj;
                Function0 function0 = ((wje) this.o).d;
                if (function0 != null) {
                    function0.invoke();
                }
                b31 b31 = ((Ref.ObjectRef) this.b).element;
                if (b31 != null) {
                    ((mp1) this.c).f(b31);
                }
                return Unit.INSTANCE;
            case 1:
                z68.c("CallEngineTag", ((d14) this.o) + " conversation for answer is created " + ((Conversation) obj).getConversationId(), new Object[0]);
                b31 b312 = ((Ref.ObjectRef) this.b).element;
                if (b312 != null) {
                    KProperty[] kPropertyArr = mp1.M;
                    ((mp1) this.c).f(b312);
                }
                return Unit.INSTANCE;
            case 2:
                ((w43) this.o).S0.invoke(new ri9((o43) this.b, ((MessageModel) this.c).a, (String) obj));
                return Unit.INSTANCE;
            case 3:
                ((w43) this.o).S0.invoke(new ri9((o43) this.b, ((MessageModel) this.c).a, (String) obj));
                return Unit.INSTANCE;
            case 4:
                isb j = ((yva) this.o).j((String) obj);
                return new isb(n54.p(fu4.k.e((Context) this.c).f(), j, n54.j(j.a.toString(), ((bac) this.b).b)), j.b);
            case 5:
                d19 d19 = (d19) this.o;
                a19 a19 = (a19) this.b;
                gd3 gd3 = (gd3) this.c;
                pm4 pm4 = (pm4) obj;
                String str = (String) d19.c;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, "executeWithDetachableLooper", (Throwable) null);
                }
                String str2 = ((s09) d19.b).c;
                lrf p = d19.p(d19.l(a19), new c19(a19, d19, pm4, 0));
                Lazy lazy = pm4.c;
                pm4.getClass();
                Handler handler = new Handler(pm4.b, (Handler.Callback) null);
                s09 s09 = (s09) d19.b;
                s09.getClass();
                v09 v09 = new v09(handler, p, 500, 300000, (vq7) s09.l);
                try {
                    p.e(gd3, str2);
                    v09.b();
                    String str3 = (String) d19.c;
                    a67 a672 = z68.b;
                    if (a672 != null) {
                        if (a672.c()) {
                            a672.d(w78.o, str3, "executeWithDetachableLooper, starting loop ...", (Throwable) null);
                        }
                    }
                    if (Intrinsics.areEqual((Object) pm4.b.getThread(), (Object) Thread.currentThread())) {
                        Looper.loop();
                        String str4 = (String) d19.c;
                        a67 a673 = z68.b;
                        if (a673 != null) {
                            if (a673.c()) {
                                a673.d(w78.o, str4, "executeWithDetachableLooper, loop completed", (Throwable) null);
                            }
                        }
                        d19.h(p);
                        v09.a();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                } catch (Throwable th) {
                    d19.h(p);
                    v09.a();
                    throw th;
                }
            case 6:
                vk3 vk3 = (vk3) obj;
                if (!vk3.B() && !((List) this.o).contains(vk3) && vk3.r() != ((qjd) ((Ref.ObjectRef) this.b).element.w).s() && vk3.r() == ((ha9) this.c).w) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                fe8 fe8 = (fe8) obj;
                fe8.a = (a32) this.o;
                fe8.c = (ha9) this.b;
                fe8.e = (gsb) this.c;
                return Unit.INSTANCE;
            case 8:
                String str5 = (String) obj;
                TextView textView = (TextView) this.o;
                String str6 = (String) this.b;
                if (textView != null) {
                    sjd sjd = sjd.a;
                    List e = sjd.w().e(str5, str6);
                    String f = hhf.f(str5);
                    if (!(f == null || f.length() == 0 || textView.getPaint().measureText(f) <= ((float) textView.getMeasuredWidth()))) {
                        f = sjd.w().m(f, e);
                    }
                    spannableString = n54.o(f, sjd.w().d(f.toString(), e), fu4.k.e(textView.getContext()).f());
                } else {
                    String f2 = hhf.f(str5);
                    sjd sjd2 = sjd.a;
                    spannableString = n54.o(f2, sjd2.w().d(f2.toString(), sjd2.w().e(f2, str6)), (k2b) this.c);
                }
                return sjd.a.s().k.c(spannableString);
            case 9:
                String str7 = (String) obj;
                l15 l15 = (l15) this.b;
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) l15.a;
                Integer num = (Integer) this.c;
                return new n2b((String) this.o, uncaughtExceptionHandler, num != null ? num.intValue() : 5, (nif) ((Function0) l15.b).invoke());
            case 10:
                Long l = (Long) obj;
                return ((hsb) ((esb) this.o).b.getValue()).a((a32) this.c, (ha9) this.b);
            case 11:
                c6d c6d = (c6d) this.o;
                c6d.getClass();
                return c6d.a(c6d, (String) this.b, (CharSequence) this.c, (Continuation) obj);
            case 12:
                c6d c6d2 = (c6d) this.o;
                c6d2.getClass();
                return c6d.i(c6d2, (String) this.b, (LinkedHashSet) ((Set) this.c), (Continuation) obj);
            case 13:
                c6d c6d3 = (c6d) this.o;
                c6d3.getClass();
                return c6d.g(c6d3, (List) this.b, (Set) this.c, (Continuation) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                View view = (View) this.o;
                float translationY = ((float) 1) - (view.getTranslationY() / (vo4.c().getDisplayMetrics().density * 4.0f));
                float translationY2 = view.getTranslationY() == c44.DEFAULT_ASPECT_RATIO ? vo4.c().getDisplayMetrics().density * 4.0f : view.getTranslationY();
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{translationY2, 0.0f});
                ofFloat.setDuration((long) (((float) 200) * translationY));
                ofFloat.setInterpolator(xhd.v0);
                ofFloat.addListener(new f60((xhd) this.b, (rhd) this.c, view, 1));
                ofFloat.addUpdateListener(new v7d(view, animatedFraction, 1));
                ofFloat.start();
                return ofFloat;
            default:
                ((Function3) this.o).invoke((View) obj, (g0g) this.b, Integer.valueOf(((i0g) this.c).q()));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ep1(String str, k2b k2b) {
        this.a = 8;
        this.o = null;
        this.b = str;
        this.c = k2b;
    }
}
