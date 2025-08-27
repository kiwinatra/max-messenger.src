package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.ProfileScreen;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.gallery.GalleryViewModel;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: k71  reason: default package */
public final class k71 implements u65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean E1() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                s9a s9a = CallHistoryPageScreen.X;
                return ((CallHistoryPageScreen) obj).f0().k();
            case 1:
                KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                if (((vu2) chatsListSearchScreen.d0().D0.a.getValue()).a != uu2.b && ((vu2) chatsListSearchScreen.d0().D0.a.getValue()).b.length() > 0) {
                    fd8 fd8 = chatsListSearchScreen.d0().o;
                    if ((!jbd.d(fd8.k) || fd8.r != null) && chatsListSearchScreen.w0.j() > 0) {
                        return true;
                    }
                }
                return false;
            case 2:
                KProperty[] kPropertyArr2 = ChatsListWidget.I0;
                return ((ss2) ((ChatsListWidget) obj).f0().D0.getValue()).b;
            case 3:
                GalleryViewModel k3 = ((GalleryFragment) obj).k3();
                pm6 pm6 = (pm6) k3.y.getValue();
                if (pm6 == null) {
                    return false;
                }
                boolean b2 = ((yd7) k3.f).b(pm6.a);
                z68.c(GalleryViewModel.T, i2a.i("canLoadMoreItems = ", b2), new Object[0]);
                return b2;
            case 4:
                return true;
            case 5:
                KProperty[] kPropertyArr3 = MediaGalleryWidget.x;
                gp6 e0 = ((MediaGalleryWidget) obj).e0();
                wk6 wk6 = (wk6) e0.z0.getValue();
                if (wk6 == null) {
                    return false;
                }
                boolean b3 = ((yd7) e0.v).b(wk6);
                z68.c("gp6", "canLoadMoreItems = " + b3, new Object[0]);
                return b3;
            case 6:
                KProperty[] kPropertyArr4 = MembersListWidget.B0;
                return ((z49) ((MembersListWidget) obj).f0().z.getValue()).c();
            case 7:
                KProperty[] kPropertyArr5 = PickerChatsListWidget.Z;
                return ((ss2) ((PickerChatsListWidget) obj).f0().c.getValue()).b;
            case 8:
                return PickerChatsListWidget2.d0((PickerChatsListWidget2) obj);
            case 9:
                KProperty[] kPropertyArr6 = ProfileScreen.D0;
                return ((ProfileScreen) obj).g0().I0.w();
            case 10:
                KProperty[] kPropertyArr7 = StickersSearchScreen.X;
                return ((StickersSearchScreen) obj).d0().k();
            case 11:
                KProperty[] kPropertyArr8 = StickersShowcaseScreen.Y;
                return ((StickersShowcaseScreen) obj).d0().k();
            case 12:
                KProperty[] kPropertyArr9 = SuggestionsWidget.z0;
                v0f r0 = ((SuggestionsWidget) obj).r0();
                if (!Intrinsics.areEqual((Object) r0.B0.a, (Object) String.valueOf((String) r0.G0.getValue()))) {
                    return false;
                }
                return r0.B0.f;
            default:
                return ((SuggestsFragment) obj).V2().k();
        }
    }

    public final void u1() {
        Unit unit;
        Unit unit2;
        String str;
        String str2 = null;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                s9a s9a = CallHistoryPageScreen.X;
                zp1 zp1 = ((CallHistoryPageScreen) obj).f0().v;
                zp1.getClass();
                zp1.i(new c70((Object) zp1, true, 5));
                return;
            case 1:
                KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
                ov2 d0 = ((ChatsListSearchScreen) obj).d0();
                aje aje = d0.L0;
                if (aje == null || !aje.isActive()) {
                    xme xme = d0.C0;
                    xme.m((Object) null, vu2.a((vu2) xme.getValue(), uu2.b, (z77) null, (ArrayList) null, false, 30));
                    d0.L0 = ev0.v(d0.a, d0.J0, (f14) null, new av2(d0, (Continuation) null), 2);
                    return;
                }
                return;
            case 2:
                KProperty[] kPropertyArr2 = ChatsListWidget.I0;
                ((wt2) ((ChatsListWidget) obj).f0().v).e();
                return;
            case 3:
                GalleryViewModel k3 = ((GalleryFragment) obj).k3();
                k3.getClass();
                String str3 = GalleryViewModel.T;
                z68.c(str3, "loadMoreItems()", new Object[0]);
                aje aje2 = k3.H;
                if ((aje2 == null || !aje2.isActive()) && !((Boolean) ((o85) k3.t.getValue()).a).booleanValue()) {
                    try {
                        Result.Companion companion = Result.Companion;
                        pm7 pm7 = k3.G;
                        if (pm7 != null) {
                            pm7.b((CancellationException) null);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        Result.m23constructorimpl(unit);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Result.m23constructorimpl(ResultKt.createFailure(th));
                    }
                    k3.G = ev0.v(b0h.C(k3), ((osa) k3.o()).e().plus(k3.h), (f14) null, new co6(k3, (Continuation) null), 2);
                    return;
                }
                z68.c(str3, "try to load more items when loading in process, ignore it", new Object[0]);
                return;
            case 4:
                KProperty[] kPropertyArr3 = LogsViewerScreen.w;
                ((LogsViewerScreen) obj).c0().j();
                return;
            case 5:
                KProperty[] kPropertyArr4 = MediaGalleryWidget.x;
                gp6 e0 = ((MediaGalleryWidget) obj).e0();
                e0.getClass();
                z68.c("gp6", "loadMoreItems()", new Object[0]);
                aje aje3 = e0.G0;
                if ((aje3 == null || !aje3.isActive()) && !((Boolean) e0.x0.getValue()).booleanValue()) {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        pm7 pm72 = e0.F0;
                        if (pm72 != null) {
                            pm72.b((CancellationException) null);
                            unit2 = Unit.INSTANCE;
                        } else {
                            unit2 = null;
                        }
                        Result.m23constructorimpl(unit2);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        Result.m23constructorimpl(ResultKt.createFailure(th2));
                    }
                    e0.F0 = xag.g(e0, ((osa) e0.l()).e().plus(e0.o), (f14) null, new do6(e0, (Continuation) null), 2);
                    return;
                }
                z68.c("gp6", "try to load more items when loading in process, ignore it", new Object[0]);
                return;
            case 6:
                KProperty[] kPropertyArr5 = MembersListWidget.B0;
                ((z49) ((MembersListWidget) obj).f0().z.getValue()).d();
                return;
            case 7:
                KProperty[] kPropertyArr6 = PickerChatsListWidget.Z;
                ((wt2) ((PickerChatsListWidget) obj).f0().b).e();
                return;
            case 8:
                KProperty[] kPropertyArr7 = PickerChatsListWidget2.w0;
                ((wt2) ((PickerChatsListWidget2) obj).g0().c).e();
                return;
            case 9:
                KProperty[] kPropertyArr8 = ProfileScreen.D0;
                ((ProfileScreen) obj).g0().I0.s();
                return;
            case 10:
                KProperty[] kPropertyArr9 = StickersSearchScreen.X;
                ute d02 = ((StickersSearchScreen) obj).d0();
                pte pte = (pte) d02.Y.get();
                aje aje4 = d02.v0;
                if ((aje4 == null || !aje4.isActive()) && (str = pte.a) != null && str.length() != 0) {
                    d02.v0 = xag.g(d02, ((osa) d02.c).b(), (f14) null, new rte(d02, pte, (Continuation) null), 2);
                    return;
                }
                return;
            case 11:
                KProperty[] kPropertyArr10 = StickersShowcaseScreen.Y;
                mve d03 = ((StickersShowcaseScreen) obj).d0();
                iue iue = d03.v;
                if (iue.a()) {
                    aje aje5 = iue.h;
                    if (aje5 == null || !aje5.isActive()) {
                        iue.h = ev0.v(iue.c, (CoroutineContext) null, (f14) null, new gue(iue, (Continuation) null), 3);
                        return;
                    }
                    return;
                }
                due due = d03.c;
                aje aje6 = due.g;
                if (aje6 == null || !aje6.isActive()) {
                    due.g = ev0.v(due.c, (CoroutineContext) null, (f14) null, new bue(due, (Continuation) null), 3);
                    return;
                }
                return;
            case 12:
                KProperty[] kPropertyArr11 = SuggestionsWidget.z0;
                v0f r0 = ((SuggestionsWidget) obj).r0();
                r0.j(((Number) r0.H0.getValue()).intValue(), (String) r0.G0.getValue());
                return;
            default:
                SuggestsViewModel V2 = ((SuggestsFragment) obj).V2();
                p1a p1a = V2.D;
                if (p1a == null) {
                    p1a = null;
                }
                CharSequence Y = p1a.Y();
                if (Y != null) {
                    str2 = Y.toString();
                }
                V2.m(str2);
                return;
        }
    }
}
