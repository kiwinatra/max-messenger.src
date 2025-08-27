package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.chats.picker.PickerChatController;

/* renamed from: ce1  reason: default package */
public final class ce1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce1(Object obj, Object obj2, Drawable drawable, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.v = drawable;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ce1 ce1 = new ce1((Object) (Lazy) this.b, (Object) (he1) this.v, (Continuation) obj3, 0);
                ce1.c = (Long) obj;
                ce1.o = (CharSequence) obj2;
                return ce1.invokeSuspend(Unit.INSTANCE);
            case 1:
                ce1 ce12 = new ce1((Object) (lp2) this.v, (Lazy) this.b, (Continuation) obj3, 1);
                ce12.c = (a32) obj;
                ce12.o = (vk3) obj2;
                return ce12.invokeSuspend(Unit.INSTANCE);
            case 2:
                ce1 ce13 = new ce1((Object) (ImageView) this.b, (Object) (TextView) this.v, (Continuation) obj3, 2);
                ce13.c = (LinearLayout) obj;
                ce13.o = (k2b) obj2;
                return ce13.invokeSuspend(Unit.INSTANCE);
            case 3:
                ce1 ce14 = new ce1((Object) (AppCompatImageView) this.b, (Object) (TextView) this.v, (Continuation) obj3, 3);
                ce14.c = (FrameLayout) obj;
                ce14.o = (k2b) obj2;
                return ce14.invokeSuspend(Unit.INSTANCE);
            case 4:
                ce1 ce15 = new ce1((Object) (l59) this.b, (Object) (String) this.v, (Continuation) obj3, 4);
                ce15.c = (List) obj;
                ce15.o = (List) obj2;
                return ce15.invokeSuspend(Unit.INSTANCE);
            case 5:
                ce1 ce16 = new ce1((Object) (View) this.b, (Object) (PickerChatController) this.v, (Continuation) obj3, 5);
                ce16.c = (Map) obj;
                ce16.o = (Map) obj2;
                return ce16.invokeSuspend(Unit.INSTANCE);
            case 6:
                ce1 ce17 = new ce1((Object) (wmb) this.v, (Lazy) this.b, (Continuation) obj3, 6);
                ce17.c = (y8b) obj;
                ce17.o = (s44) obj2;
                return ce17.invokeSuspend(Unit.INSTANCE);
            case 7:
                FrameLayout frameLayout = (FrameLayout) obj;
                ce1 ce18 = new ce1((Drawable) this.o, (Drawable) this.b, (GradientDrawable) this.v, (Continuation) obj3, 7);
                ce18.c = (k2b) obj2;
                return ce18.invokeSuspend(Unit.INSTANCE);
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                ce1 ce19 = new ce1((TextView) this.o, (TextView) this.b, (Drawable) this.v, (Continuation) obj3, 8);
                ce19.c = (k2b) obj2;
                return ce19.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = true;
        Object obj2 = this.v;
        Object obj3 = this.b;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                CharSequence charSequence = (CharSequence) this.o;
                ((hl1) ((Lazy) obj3).getValue()).getClass();
                String c2 = hl1.c((Long) this.c);
                if (c2 != null && !StringsKt.isBlank(c2)) {
                    charSequence = charSequence + " · " + c2;
                }
                jl1 jl1 = new jl1(il1.a, "", charSequence);
                ll1 ll1 = ((he1) obj2).v0;
                ll1.b = jl1;
                for (kl1 r : ll1.a) {
                    r.r(jl1);
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                a32 a32 = (a32) this.c;
                vk3 vk3 = (vk3) this.o;
                boolean w = vk3 != null ? vk3.w() : a32.I();
                if (((vj5) ((uj5) ((lp2) obj2).Z.getValue())).p() && a32.z()) {
                    z = false;
                }
                if (a32.b.J.b(64)) {
                    return sp2.w;
                }
                if (w) {
                    return sp2.a;
                }
                if (a32.U()) {
                    return sp2.b;
                }
                if (a32.M()) {
                    return sp2.c;
                }
                if (a32.T()) {
                    return sp2.o;
                }
                if (a32.J() && (a32.h0() || a32.b.a == 0)) {
                    return sp2.v;
                }
                Lazy lazy = (Lazy) obj3;
                if (a32.K() && a32.d0() && !a32.y() && z && a32.X((x23) lazy.getValue())) {
                    return sp2.x;
                }
                if (a32.K() && a32.d0() && !a32.y() && z && !a32.X((x23) lazy.getValue())) {
                    return sp2.y;
                }
                if (!a32.K() || a32.d0()) {
                    return null;
                }
                return sp2.z;
            case 2:
                ResultKt.throwOnFailure(obj);
                k2b k2b = (k2b) this.o;
                k2b.getIcon().getClass();
                ((ImageView) obj3).setColorFilter(-16745729);
                k2b.getText().getClass();
                ((TextView) obj2).setTextColor(-16745729);
                ((LinearLayout) this.c).setBackground(new RippleDrawable(ColorStateList.valueOf(k2b.b().a.f), (Drawable) null, new ColorDrawable(-65536)));
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = (FrameLayout) this.c;
                js9 js9 = fu4.k;
                js9.f(frameLayout).getIcon().getClass();
                ((AppCompatImageView) obj3).setImageTintList(ColorStateList.valueOf(-16745729));
                js9.e(frameLayout.getContext()).f().getText().getClass();
                ((TextView) obj2).setTextColor(-16745729);
                frameLayout.setForeground(new RippleDrawable(ColorStateList.valueOf(((k2b) this.o).b().a.f), (Drawable) null, ay5.D0));
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                List list = (List) this.c;
                List list2 = (List) this.o;
                CollectionsKt.plus(list, list2);
                l59 l59 = (l59) obj3;
                String str = (String) obj2;
                return CollectionsKt.plus(l59.c(l59, list, str), l59.c(l59, list2, str));
            case 5:
                ResultKt.throwOnFailure(obj);
                Map map = (Map) this.c;
                Map map2 = (Map) this.o;
                Iterator it = SetsKt.minus(map.keySet(), map2.keySet()).iterator();
                while (true) {
                    PickerChatController pickerChatController = (PickerChatController) obj2;
                    if (it.hasNext()) {
                        long longValue = ((Number) it.next()).longValue();
                        KProperty[] kPropertyArr = PickerChatController.z0;
                        pickerChatController.c0().c(longValue);
                    } else {
                        yrf yrf = new yrf();
                        KProperty[] kPropertyArr2 = PickerChatController.z0;
                        yrf.c(pickerChatController.c0());
                        yrf.b(hra.d0);
                        esf.a((ViewGroup) ((View) obj3), yrf);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!Intrinsics.areEqual(map.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            long longValue2 = ((Number) entry2.getKey()).longValue();
                            njb njb = (njb) entry2.getValue();
                            pickerChatController.c0().c(longValue2);
                            pickerChatController.c0().a(longValue2, njb.b, njb.e, njb.c, njb.d);
                        }
                        return map2;
                    }
                }
            case 6:
                ResultKt.throwOnFailure(obj);
                y8b y8b = (y8b) this.c;
                s44 s44 = (s44) this.o;
                xme xme = ((wmb) obj2).v;
                do {
                    value = xme.getValue();
                    v4b v4b = (v4b) value;
                } while (!xme.b(value, ke8.e(ke8.c(y8b, y8b.a.m(), s44.h, s44.f, (hl1) ((Lazy) obj3).getValue(), s44.j, (ze1) null), false, s44.h, s44.f)));
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = (k2b) this.c;
                k2b2.getIcon().getClass();
                ((Drawable) this.o).setTint(-1);
                k2b2.getIcon().getClass();
                ((Drawable) obj3).setTint(-1);
                k2b2.c().getClass();
                ((GradientDrawable) obj2).setTint(-1728053248);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                k2b k2b3 = (k2b) this.c;
                ((TextView) this.o).setTextColor(k2b3.getText().e);
                ((TextView) obj3).setTextColor(k2b3.getText().f);
                ((Drawable) obj2).setTint(k2b3.getIcon().g);
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.b = obj;
        this.v = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce1(Object obj, Lazy lazy, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.v = obj;
        this.b = lazy;
    }
}
