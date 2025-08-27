package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.messages.channels.CreateChannelViewModel;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;
import ru.ok.tamtam.calls.CallDialogViewModel;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* renamed from: wk  reason: default package */
public final /* synthetic */ class wk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        String str;
        Set set;
        boolean z = false;
        nzf nzf = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                cl clVar = (cl) obj3;
                z68.f(clVar.y, "fail to load static image", (Throwable) obj);
                clVar.e(xk.a);
                ((nzf) obj2).c = null;
                return Unit.INSTANCE;
            case 1:
                u8b u8b = (u8b) obj;
                if (!(u8b instanceof s8b)) {
                    return u8b;
                }
                s8b s8b = (s8b) u8b;
                long r = s8b.b.r();
                Long l = (Long) obj3;
                if (l == null || l.longValue() != r) {
                    return u8b;
                }
                return new s8b(s8b.a, s8b.b, s8b.c, ((CallDialogViewModel) obj2).f.a.getString(tmc.tt_you));
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj3;
                AppBarLayout c0 = callOpponentsListWidget.c0();
                KProperty[] kPropertyArr2 = CallOpponentsListWidget.B0;
                je1 je1 = new je1(callOpponentsListWidget, 2);
                callOpponentsListWidget.getClass();
                i53 i53 = new i53(c0.getContext(), (AttributeSet) null);
                dn dnVar = new dn(-1, -2);
                dnVar.a = 19;
                i53.setLayoutParams(dnVar);
                i53.setTitleEnabled(false);
                je1.invoke(i53);
                c0.addView(i53);
                c0.addView(callOpponentsListWidget.d0());
                Unit unit = Unit.INSTANCE;
                coordinatorLayout.addView(c0);
                LinearLayout linearLayout = new LinearLayout(((LayoutInflater) obj2).getContext());
                KProperty[] kPropertyArr3 = CallOpponentsListWidget.B0;
                KProperty kProperty = kPropertyArr3[3];
                linearLayout.addView((RecyclerView) callOpponentsListWidget.X.getValue());
                KProperty kProperty2 = kPropertyArr3[8];
                linearLayout.addView((ViewStub) callOpponentsListWidget.x0.getValue());
                wz3 wz3 = new wz3(-1, -1);
                wz3.b(new AppBarLayout.ScrollingViewBehavior());
                linearLayout.setLayoutParams(wz3);
                coordinatorLayout.addView(linearLayout);
                return Unit.INSTANCE;
            case 3:
                l20 l20 = (l20) obj;
                vb2 vb2 = (vb2) obj3;
                vb2.getClass();
                g20 g20 = l20.a;
                g20 g202 = g20.o;
                Lazy lazy = vb2.g;
                a89 a89 = (a89) obj2;
                Context context = vb2.a;
                if (g20 == g202) {
                    Uri a2 = ((o20) ((t00) lazy.getValue())).a(l20);
                    if (a2 != null) {
                        nzf = new nzf(context, ((o20) ((t00) lazy.getValue())).c(l20, ld8.g0(l20, a89)), a2.toString());
                    }
                    return new LayerDrawable(new Drawable[]{nzf, new InsetDrawable((Drawable) vb2.u.getValue(), 0.1f)});
                } else if (g20 == g20.w) {
                    f20 l2 = a89.a.l();
                    if (l2 != null) {
                        str = l2.h;
                        if (cvg.A(str)) {
                            str = l2.b;
                        }
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        nzf nzf2 = new nzf(context);
                        nzf2.c((Uri) null, str);
                        return nzf2;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    Uri a3 = ((o20) ((t00) lazy.getValue())).a(l20);
                    if (a3 != null) {
                        nzf = new nzf(context, ((o20) ((t00) lazy.getValue())).c(l20, ld8.g0(l20, a89)), a3.toString());
                    }
                    return nzf;
                }
            case 4:
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0) {
                    ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = (ChatNotificationsSettingsScreen) obj3;
                    if (intValue >= chatNotificationsSettingsScreen.c.j() || ((i1e) ((lz7) chatNotificationsSettingsScreen.c.E(intValue))).getItemId() != ((long) rwa.f)) {
                        return null;
                    }
                    return q8.p(swa.b, ((EndlessRecyclerView2) obj2).getContext()).toUpperCase(Locale.ROOT);
                }
                KProperty[] kPropertyArr4 = ChatNotificationsSettingsScreen.w;
                return null;
            case 5:
                View view = (View) obj;
                xag.h(((lp2) obj3).T0, new do2(((Long) obj2).longValue()));
                return Unit.INSTANCE;
            case 6:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj3;
                int l3 = chatsListSearchScreen.B0.l(((Integer) obj).intValue());
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj2;
                if (l3 == rra.m) {
                    return endlessRecyclerView2.getResources().getString(ead.s0);
                }
                if (l3 == rra.s) {
                    return endlessRecyclerView2.getResources().getString(ead.u0);
                }
                if (l3 == hra.m) {
                    if (chatsListSearchScreen.Y.j() == 0) {
                        return endlessRecyclerView2.getResources().getString(jra.x);
                    }
                    return null;
                } else if (l3 == hra.p) {
                    return endlessRecyclerView2.getResources().getString(ead.t0);
                } else {
                    if (l3 == hra.r) {
                        return endlessRecyclerView2.getResources().getString(jra.z);
                    }
                    return null;
                }
            case 7:
                if (tv2.$EnumSwitchMapping$0[((g0b) obj).ordinal()] == 1) {
                    tw2 tw2 = (tw2) obj3;
                    tw2.P0.setValue(tw2, tw2.T0[0], xag.g(tw2, ((osa) tw2.w).b(), (f14) null, new sw2(tw2, ((vk3) obj2).r(), (Continuation) null), 2));
                }
                return Unit.INSTANCE;
            case 8:
                ChatsListWidget chatsListWidget = (ChatsListWidget) obj3;
                if (((Integer) obj).intValue() != chatsListWidget.x0.j() + chatsListWidget.y0.j() || chatsListWidget.z0.j() <= 0) {
                    return null;
                }
                return ((zo3) obj2).b;
            case 9:
                long longValue = ((Long) obj).longValue();
                zo3 zo3 = (zo3) obj3;
                t56 t56 = (t56) obj2;
                if (zo3.Y) {
                    ((ro3) t56.w).b1();
                } else if (zo3.w != null) {
                    ((ro3) t56.w).v(longValue);
                } else {
                    ((ro3) t56.w).t0(longValue);
                }
                return Unit.INSTANCE;
            case 10:
                qdb qdb = (qdb) obj;
                if (!((Set) obj3).contains(qdb) && !n54.C(qdb).contains(Long.valueOf(((vk3) obj2).s()))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function2) obj3).invoke(Long.valueOf(((zo3) obj2).a), bool);
                return Unit.INSTANCE;
            case 12:
                int intValue2 = ((Integer) obj).intValue();
                KProperty[] kPropertyArr5 = ContactListWidget.N0;
                ContactListWidget contactListWidget = (ContactListWidget) obj3;
                CharSequence d0 = contactListWidget.d0();
                if (d0 == null || d0.length() == 0) {
                    return null;
                }
                int l4 = contactListWidget.X.l(intValue2);
                RecyclerView recyclerView = (RecyclerView) obj2;
                if (l4 == rra.m) {
                    return recyclerView.getResources().getString(ead.r0);
                }
                if (l4 == rra.p) {
                    return recyclerView.getResources().getString(ead.t0);
                }
                return null;
            case 13:
                CreateChannelViewModel createChannelViewModel = (CreateChannelViewModel) obj3;
                ((uta) createChannelViewModel.e).c(new HandledException((Throwable) obj), true);
                createChannelViewModel.l((String) null);
                o85 o85 = new o85(Boolean.TRUE);
                xme xme = createChannelViewModel.m;
                xme.getClass();
                xme.m((Object) null, o85);
                o85 o852 = new o85(((Application) obj2).getString(qad.t1));
                xme xme2 = createChannelViewModel.w;
                xme2.getClass();
                xme2.m((Object) null, o852);
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION:
                rf1 rf1 = (rf1) obj2;
                ((Boolean) obj).getClass();
                ng5 ng5 = (ng5) obj3;
                wie wie = ng5.h;
                KProperty[] kPropertyArr6 = ng5.i;
                pm7 pm7 = (pm7) wie.getValue(ng5, kPropertyArr6[0]);
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
                ng5.h.setValue(ng5, kPropertyArr6[0], (Object) null);
                ng5.b().o = null;
                try {
                    WindowManager c2 = ng5.c();
                    if (c2 != null) {
                        c2.removeView(rf1);
                    }
                } catch (IllegalArgumentException e) {
                    z68.f("FakePipController", "can't hide call local pip", e);
                }
                ng5.g = null;
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return Boolean.valueOf(((FoldersPickerViewModel) obj3).g.h(((w16) obj).c.toString(), (String) obj2));
            case 16:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((Function2) obj3).invoke((qs6) obj2, bool2);
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED:
                Throwable th = (Throwable) obj;
                ((bw6) obj3).b.removeCallbacks((Runnable) obj2);
                return Unit.INSTANCE;
            case 18:
                View view2 = (View) obj;
                KProperty[] kPropertyArr7 = InputPhoneScreen.D0;
                kr7.C((h3b) obj3);
                rh7 g0 = ((InputPhoneScreen) obj2).g0();
                g0.getClass();
                f98.b.getClass();
                xag.h(g0.y, new pa4(":webview/faq"));
                return Unit.INSTANCE;
            case 19:
                Throwable th2 = (Throwable) obj;
                z68.f(((k78) obj3).a, "Failed to store event", th2);
                ((uta) ((m95) ((Lazy) obj2).getValue())).c(th2, true);
                return Unit.INSTANCE;
            case 20:
                ((Long) obj).getClass();
                z29 z29 = (z29) obj3;
                t56 t562 = (t56) obj2;
                if (z29.y) {
                    xag.h(((MembersListWidget) ((v39) t562.w)).e0().v, f49.a);
                } else {
                    boolean z2 = z29.z;
                    long j = z29.a;
                    if (z2) {
                        i49 e0 = ((MembersListWidget) ((v39) t562.w)).e0();
                        e0.getClass();
                        xag.h(e0.v, new e49(j));
                    } else {
                        ((MembersListWidget) ((v39) t562.w)).e0().m(j, z29.Y);
                    }
                }
                return Unit.INSTANCE;
            case 21:
                Integer num = (Integer) obj;
                num.getClass();
                KProperty[] kPropertyArr8 = MembersListWidget.B0;
                z29 z292 = (z29) ((Function1) obj3).invoke(num);
                if (z292 != null && (set = (Set) ((MembersListWidget) obj2).e0().x.getValue()) != null && set.contains(Long.valueOf(z292.a)) && z292.Y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                bj2 bj2 = (bj2) obj;
                if (bj2.a.a != ((qjd) ((x59) obj3).w).s() && ((ha9) obj2).o <= bj2.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                lz7 lz7 = (lz7) ((MessageContextMenuBottomSheet) obj3).U0.E(((Integer) obj).intValue());
                if (!(lz7 instanceof y29) || !((y29) lz7).z) {
                    return null;
                }
                return ((RecyclerView) obj2).getContext().getString(ewa.l0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                Throwable th3 = (Throwable) obj;
                ((a0a) obj3).e(((zz9) obj2).b);
                return Unit.INSTANCE;
            case 25:
                return ((fa9) ((mba) obj3).f.get()).k(((a32) obj2).a, ((Long) obj).longValue());
            case 26:
                v95 v95 = (v95) obj;
                aua aua = (aua) obj3;
                wta wta = (wta) aua.e.getValue();
                wta.getClass();
                LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
                v95 v952 = (v95) obj2;
                int i = v952.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Integer valueOf = Integer.valueOf(v952.g);
                l15 l15 = wta.a;
                String str2 = v952.a;
                ThreadFactory B = l15.B(str2, valueOf);
                int i2 = v952.c;
                long j2 = v952.d;
                long j3 = j2;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j2, timeUnit, linkedTransferQueue, B);
                if (v952.e && j3 > 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                threadPoolExecutor.setRejectedExecutionHandler(new iu1(1));
                if (v952.f) {
                    threadPoolExecutor.prestartAllCoreThreads();
                }
                return aua.i(threadPoolExecutor, str2);
            case 27:
                int intValue3 = ((Integer) obj).intValue();
                KProperty[] kPropertyArr9 = PickerMembersListWidget.v0;
                tyc adapter = ((EndlessRecyclerView2) obj3).getAdapter();
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                fhb fhb = pickerMembersListWidget.w;
                if (adapter != fhb) {
                    fhb = pickerMembersListWidget.x;
                }
                if (fhb.j() > intValue3 && intValue3 >= 0) {
                    z = ((Set) pickerMembersListWidget.e0().x.a.getValue()).contains(Long.valueOf(((hhb) ((lz7) fhb.E(intValue3))).a));
                }
                return Boolean.valueOf(z);
            case 28:
                Long l5 = (Long) obj;
                return ((hsb) ((esb) obj3).b.getValue()).a((a32) null, (ha9) obj2);
            default:
                c6d c6d = (c6d) obj3;
                c6d.getClass();
                return c6d.b(c6d, (String) obj2, (Continuation) obj);
        }
    }
}
