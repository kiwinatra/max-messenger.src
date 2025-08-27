package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.android.OneMeApplication;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.devmenu.DevMenuScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.animoji.views.AnimojiTextView;
import ru.ok.tamtam.calls.CallDialogViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: r6  reason: default package */
public final /* synthetic */ class r6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        v5a v5a;
        i0g i0g;
        e4 e4Var;
        boolean z = false;
        String str = null;
        switch (this.a) {
            case 0:
                return ((a32) this.b).h((kl0) obj, (jl0) obj2);
            case 1:
                return AnimojiTextView.j((AnimojiTextView) this.b, (CharSequence) obj, (TextView.BufferType) obj2);
            case 2:
                ym ymVar = (ym) this.b;
                ymVar.getClass();
                return new v3d(((Integer) obj).intValue(), (float) ryg.t(ymVar.a), ((Integer) obj2).intValue());
            case 3:
                return ((hz0) this.b).k((b51) obj, obj2);
            case 4:
                int intValue = ((Integer) obj).intValue();
                vk3 p = ((CallDialogViewModel) this.b).e.p(((bj2) obj2).a.a, false);
                if (p != null) {
                    return new s8b(intValue, p);
                }
                return null;
            case 5:
                ((Long) obj).getClass();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                dk1 dk1 = ((ek1) this.b).E0;
                if (dk1 != null) {
                    gga gga = CallScreen.J0;
                    ((mh1) dk1).a.p0().c.h.a(booleanValue);
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return on1.a((on1) this.b);
            case 7:
                int i2 = ChangeDisabledDialog.w0;
                iu7 iu7 = iu7.o;
                ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
                bs0.K(new ps5(ct.k((bs5) obj, changeDisabledDialog.getViewLifecycleOwner().getLifecycle(), iu7), new nz1((Continuation) null, (Function1) obj2), 5), changeDisabledDialog.getViewLifecycleScope());
                return Unit.INSTANCE;
            case 8:
                ((ro3) ((t56) this.b).w).z(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            case 9:
                ct.G((AppCompatTextView) obj2, 300, new pb(27, (nw3) obj, (hx3) this.b));
                return Unit.INSTANCE;
            case 10:
                o94 o94 = (o94) obj2;
                int i3 = DevMenuScreen.z;
                ngf ngf = ((o94) obj).b;
                DevMenuScreen devMenuScreen = (DevMenuScreen) this.b;
                CharSequence a2 = ngf.a(devMenuScreen.getContext());
                String obj3 = a2 != null ? a2.toString() : null;
                String str2 = "";
                if (obj3 == null) {
                    obj3 = str2;
                }
                CharSequence a3 = o94.b.a(devMenuScreen.getContext());
                if (a3 != null) {
                    str = a3.toString();
                }
                if (str != null) {
                    str2 = str;
                }
                return Integer.valueOf(obj3.compareTo(str2));
            case 11:
                ((dn5) this.b).d.k((String) obj, obj2);
                return Unit.INSTANCE;
            case 12:
                iu7 iu72 = iu7.o;
                ForgotPinCodeDialog forgotPinCodeDialog = (ForgotPinCodeDialog) this.b;
                bs0.K(new ps5(ct.k((bs5) obj, forgotPinCodeDialog.getViewLifecycleOwner().getLifecycle(), iu72), new v96((Continuation) null, (Function1) obj2), 5), forgotPinCodeDialog.getViewLifecycleScope());
                return Unit.INSTANCE;
            case 13:
                View view = (View) obj;
                o0f o0f = (o0f) obj2;
                Function2 function2 = (Function2) this.b;
                if (function2 != null) {
                    function2.invoke(view, o0f);
                }
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                List list = (List) obj;
                List list2 = (List) obj2;
                ((ir9) this.b).getClass();
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            xk2 xk2 = (xk2) next;
                            xk2 xk22 = (xk2) list2.get(i4);
                            if (xk2.a == xk22.a && Intrinsics.areEqual((Object) xk2.c, (Object) xk22.c)) {
                                CharSequence charSequence = xk2.v;
                                int c = charSequence instanceof Spanned ? fqc.c((Spanned) charSequence) : charSequence.hashCode();
                                CharSequence charSequence2 = xk22.v;
                                if (c == (charSequence2 instanceof Spanned ? fqc.c((Spanned) charSequence2) : charSequence2.hashCode()) && Intrinsics.areEqual((Object) xk2.w, (Object) xk22.w) && Intrinsics.areEqual((Object) xk2.y, (Object) xk22.y) && xk2.Y == xk22.Y && xk2.Z == xk22.Z && xk2.v0 == xk22.v0 && xk2.w0 == xk22.w0 && xk2.x0 == xk22.x0 && xk2.y0 == xk22.y0 && xk2.z0 == xk22.z0 && Intrinsics.areEqual((Object) xk2.A0, (Object) xk22.A0) && Intrinsics.areEqual((Object) xk2.b, (Object) xk22.b) && xk2.B0 == xk22.B0) {
                                    i4 = i5;
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                String str3 = (String) obj;
                List list3 = (List) obj2;
                int i6 = OneMeApplication.X;
                int size = list3.size();
                Iterable<zi8> iterable = list3;
                long j = 0;
                for (zi8 zi8 : iterable) {
                    j += zi8.o.toMillis(zi8.c);
                }
                StringBuilder sb = new StringBuilder("Thread: ");
                sb.append(str3);
                sb.append(", tasksCount = ");
                sb.append(size);
                sb.append(", totalDuration = ");
                String m = wj6.m(sb, j, "\n");
                StringBuilder sb2 = (StringBuilder) this.b;
                sb2.append(m);
                Appendable unused = CollectionsKt___CollectionsKt.joinTo$default(CollectionsKt.sortedWith(iterable, new ed7(5)), sb2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new oo9(6), 60, (Object) null);
                sb2.append("\n");
                return Unit.INSTANCE;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                CoroutineContext.Key key = element.getKey();
                CoroutineContext.Element element2 = ((pbd) this.b).b.get(key);
                if (key != om7.a) {
                    i = element != element2 ? IntCompanionObject.MIN_VALUE : intValue2 + 1;
                } else {
                    pm7 pm7 = (pm7) element2;
                    pm7 pm72 = (pm7) element;
                    while (true) {
                        if (pm72 != null) {
                            if (pm72 != pm7 && (pm72 instanceof dgd)) {
                                hz2 hz2 = (hz2) qn7.b.get((dgd) pm72);
                                pm72 = hz2 != null ? hz2.getParent() : null;
                            }
                        }
                    }
                    str = pm72;
                    if (str == pm7) {
                        if (pm7 != null) {
                            intValue2++;
                        }
                        i = intValue2;
                    } else {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + str + ", expected child of " + pm7 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(i);
            case LangUtils.HASH_SEED:
                long longValue = ((Long) obj).longValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                j1e j1e = ((t1e) this.b).D0;
                if (j1e != null) {
                    j1e.N(longValue, booleanValue2);
                }
                return Unit.INSTANCE;
            case 18:
                ((j1e) this.b).N(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            case 19:
                long longValue2 = ((Long) obj).longValue();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                nob nob = (nob) this.b;
                nob.getClass();
                KProperty[] kPropertyArr = SettingMediaScreen.w;
                jzd c0 = ((SettingMediaScreen) nob.a).c0();
                int i7 = (int) longValue2;
                c0.getClass();
                if (i7 == qza.m) {
                    c0.v0.setValue(c0, jzd.y0[6], xag.g(c0, (CoroutineContext) null, (f14) null, new czd(c0, booleanValue3, (Continuation) null), 3));
                } else if (i7 == qza.j) {
                    c0.w0.setValue(c0, jzd.y0[7], xag.g(c0, (CoroutineContext) null, (f14) null, new bzd(c0, booleanValue3, (Continuation) null), 3));
                } else if (i7 == qza.n) {
                    c0.Z.setValue(c0, jzd.y0[5], xag.g(c0, (CoroutineContext) null, (f14) null, new gzd(c0, booleanValue3, (Continuation) null), 3));
                }
                return Unit.INSTANCE;
            case 20:
                long longValue3 = ((Long) obj).longValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                syc syc = (syc) this.b;
                syc.getClass();
                KProperty[] kPropertyArr2 = SettingsPrivacyScreen.x;
                y3e c02 = ((SettingsPrivacyScreen) syc.b).c0();
                c02.getClass();
                long j2 = uza.g;
                if (longValue3 == j2) {
                    if (!booleanValue4) {
                        c02.E0 = j2;
                        c02.q(vzd.b);
                    } else if (!c02.l().r()) {
                        if (c02.l().r()) {
                            v5a = (!c02.l().r() || !c02.m().a()) ? uzd.b : vzd.b;
                        } else if (((a33) c02.m()).g.getBoolean("app.onboarding.safe_mode", false)) {
                            i3e.b.getClass();
                            v5a = new pa4(":settings/privacy/pincode?mode=setup");
                        } else {
                            i3e.b.getClass();
                            v5a = new pa4(":settings/privacy/onboarding");
                        }
                        c02.q(v5a);
                    }
                }
                return Unit.INSTANCE;
            case 21:
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                KProperty[] kPropertyArr3 = StickersSettingsScreen.w;
                zue c03 = ((StickersSettingsScreen) this.b).c0();
                List mutableList = CollectionsKt.toMutableList((Collection) c03.y.getValue());
                if (intValue4 >= 0 && intValue4 <= CollectionsKt.getLastIndex(mutableList)) {
                    wmd wmd = (wmd) mutableList.get(intValue4);
                    if (wmd instanceof umd) {
                        c03.w0 = Long.valueOf(((umd) wmd).a);
                        if (c03.Z == null) {
                            c03.v0 = intValue3;
                            Object obj4 = mutableList.get(intValue3);
                            umd umd = obj4 instanceof umd ? (umd) obj4 : null;
                            c03.Z = umd != null ? Long.valueOf(umd.a) : null;
                        }
                        cjf.G(mutableList, intValue3, intValue4);
                        xme xme = c03.y;
                        xme.getClass();
                        xme.m((Object) null, mutableList);
                    }
                }
                return Unit.INSTANCE;
            case 22:
                List list4 = (List) obj;
                int intValue5 = ((Integer) obj2).intValue();
                gwe gwe = (gwe) this.b;
                gwe.getClass();
                if (intValue5 == m1b.v) {
                    igf igf = new igf(list4.size() > 1 ? n1b.t : n1b.s);
                    String l = gwe.l(list4.size());
                    ete ete = ete.RECENT;
                    ete ete2 = gwe.b;
                    Context context = gwe.o;
                    xag.h(gwe.z0, new q0e(igf, new mgf(context.getString(n1b.u, new Object[]{l, ete2 == ete ? context.getString(n1b.E) : context.getString(n1b.y)})), CollectionsKt.listOf(new pg3(m1b.c, new igf(n1b.h), og3.a), new pg3(m1b.a, new igf(n1b.i), og3.b))));
                }
                return Unit.INSTANCE;
            case 23:
                View view2 = (View) obj;
                if (((MotionEvent) obj2).getAction() == 0 && (e4Var = i0g.D0) != null) {
                    ((FoldersListScreen) e4Var.b).o.t((i0g = (i0g) this.b));
                }
                return Boolean.FALSE;
            default:
                Long l2 = (Long) obj;
                l2.longValue();
                ((h3g) this.b).c.invoke(l2, (View) obj2);
                return Unit.INSTANCE;
        }
    }
}
