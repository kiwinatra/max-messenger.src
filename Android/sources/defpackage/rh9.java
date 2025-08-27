package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rh9  reason: default package */
public final /* synthetic */ class rh9 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(int i, Object obj) {
        super(0, obj, MessageWriteWidget.class, "onClickAttachPicker", "onClickAttachPicker()V", 0);
        this.a = i;
        switch (i) {
            case 2:
                super(0, obj, MessageWriteWidget.class, "onRightOuterIconClick", "onRightOuterIconClick()V", 0);
                return;
            case 3:
                super(0, obj, MessageWriteWidget.class, "onSendLongClick", "onSendLongClick()V", 0);
                return;
            case 5:
                super(0, obj, fma.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
                return;
            case 6:
                super(0, obj, fma.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
                return;
            case 9:
                super(0, obj, qu2.class, "onClearClick", "onClearClick()V", 0);
                return;
            case 10:
                super(0, obj, wm4.class, "onButtonClick", "onButtonClick()V", 0);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                super(0, obj, zq7.class, "onFakeSearchClick", "onFakeSearchClick()V", 0);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                super(0, obj, zq7.class, "onRecentClearClick", "onRecentClearClick()V", 0);
                return;
            case 16:
                super(0, obj, e6f.class, "onDismiss", "onDismiss()V", 0);
                return;
            case 19:
                super(0, obj, WebAppRootScreen.class, "buildScreenParams", "buildScreenParams()Lone/me/sdk/statistics/params/Params;", 0);
                return;
            case 20:
                super(0, obj, Runnable.class, "run", "run()V", 0);
                return;
            default:
                return;
        }
    }

    public final Object invoke() {
        vk3 m;
        xb9 xb9 = xb9.a;
        yb9 yb9 = yb9.a;
        e9d e9d = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((edb) this.receiver).b(edb.l));
            case 1:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                messageWriteWidget.v.f.j = messageWriteWidget.d0().getText();
                xme xme = messageWriteWidget.h0().B0;
                r5a r5a = new r5a();
                xme.getClass();
                xme.m((Object) null, r5a);
                return Unit.INSTANCE;
            case 2:
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) this.receiver;
                if (!y7e.L(messageWriteWidget2.v0) || (!Intrinsics.areEqual((Object) messageWriteWidget2.d0().getSendActionState(), (Object) yb9) && !Intrinsics.areEqual((Object) messageWriteWidget2.d0().getSendActionState(), (Object) xb9))) {
                    CharSequence text = messageWriteWidget2.d0().getText();
                    if ((text == null || text.length() == 0) && messageWriteWidget2.d0().getEmojiExpandableState() != tb9.a) {
                        mh9.o(messageWriteWidget2.h0(), (lg9) null, 3);
                    } else {
                        messageWriteWidget2.l0();
                    }
                } else {
                    messageWriteWidget2.j0();
                }
                return Unit.INSTANCE;
            case 3:
                MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) this.receiver;
                KProperty[] kPropertyArr2 = MessageWriteWidget.C0;
                CharSequence text2 = messageWriteWidget3.d0().getText();
                if (text2 != null && !StringsKt.isBlank(text2)) {
                    if (!y7e.L(messageWriteWidget3.v0) || (!Intrinsics.areEqual((Object) messageWriteWidget3.d0().getSendActionState(), (Object) yb9) && !Intrinsics.areEqual((Object) messageWriteWidget3.d0().getSendActionState(), (Object) xb9))) {
                        messageWriteWidget3.h0().r(text2, true);
                        messageWriteWidget3.d0().setText((CharSequence) null);
                    } else {
                        messageWriteWidget3.j0();
                    }
                }
                return Unit.INSTANCE;
            case 4:
                a32 a32 = (a32) ((mh9) this.receiver).b.getValue();
                if (!(a32 == null || (m = a32.m()) == null)) {
                    long r = m.r();
                    rg9 rg9 = rg9.b;
                    Long valueOf = Long.valueOf(a32.a);
                    ta4 W0 = rg9.W0();
                    zqd zqd = new zqd(9);
                    zqd.b = ":webapp:root";
                    zqd.z(Long.valueOf(r), "bot_id");
                    zqd.z("start_button", "entry_point");
                    zqd.z(valueOf, "chat_id");
                    W0.c(zqd.p(), (Bundle) null);
                }
                return Unit.INSTANCE;
            case 5:
                ((fma) this.receiver).f();
                return Unit.INSTANCE;
            case 6:
                ((fma) this.receiver).f();
                return Unit.INSTANCE;
            case 7:
                return Boolean.valueOf(((a33) ((x23) this.receiver)).g.getBoolean("app.debug.profile.info.enabled", false));
            case 8:
                return Boolean.valueOf(((a33) ((x23) this.receiver)).g.getBoolean("app.toggle.new_toolbar", true));
            case 9:
                ChatsListSearchScreen chatsListSearchScreen = ((qu2) this.receiver).a;
                kr7.z(chatsListSearchScreen);
                KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = new ClearRecentSearchBottomSheet();
                clearRecentSearchBottomSheet.setTargetController(chatsListSearchScreen);
                zx3 zx3 = chatsListSearchScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                clearRecentSearchBottomSheet.p0(chatsListSearchScreen);
                if (e9d != null) {
                    i9d i9d = new i9d(clearRecentSearchBottomSheet, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
                return Unit.INSTANCE;
            case 10:
                ((wm4) this.receiver).a();
                return Unit.INSTANCE;
            case 11:
                wyd wyd = (wyd) this.receiver;
                String str = ((z3e) wyd.x0.getValue()).b;
                s85 s85 = wyd.v0;
                if (str == null) {
                    xag.h(s85, s2e.b);
                } else {
                    Long m2 = wyd.m();
                    if (m2 != null) {
                        xag.h(s85, new w2e(m2.longValue()));
                    }
                }
                return Unit.INSTANCE;
            case 12:
                wyd wyd2 = (wyd) this.receiver;
                eu3 eu3 = (eu3) wyd2.c.a.getValue();
                vk3 r2 = eu3.a.r();
                if (r2 == null) {
                    r2 = eu3.a(((Number) eu3.b.getValue()).longValue());
                }
                xag.h(wyd2.w0, new y1e(r2.j(), new igf(xza.v)));
                return Unit.INSTANCE;
            case 13:
                wyd wyd3 = (wyd) this.receiver;
                eu3 eu32 = (eu3) wyd3.c.a.getValue();
                vk3 r3 = eu32.a.r();
                if (r3 == null) {
                    r3 = eu32.a(((Number) eu32.b.getValue()).longValue());
                }
                xag.h(wyd3.w0, new y1e(wj6.i(r3.s(), "+"), new igf(xza.w)));
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                zq7 zq7 = (zq7) this.receiver;
                zq7.getClass();
                nq7 nq7 = nq7.b;
                long j = zq7.b.getLong("arg_key_chat_id");
                ta4 W02 = nq7.W0();
                W02.b(":stickers/search?chat_id=" + j, (Bundle) null);
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                zq7 zq72 = (zq7) this.receiver;
                zq72.getClass();
                KProperty[] kPropertyArr4 = KeyboardStickersWidget.z;
                KeyboardStickersWidget keyboardStickersWidget = zq72.a;
                keyboardStickersWidget.getClass();
                KProperty[] kPropertyArr5 = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(new igf(ava.o), (Bundle) null, 6);
                a2.a(new pg3(zua.g, new igf(ava.m), og3.a), new pg3(zua.h, new igf(ava.n), og3.b));
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(keyboardStickersWidget);
                zx3 zx32 = keyboardStickersWidget;
                while (zx32.getParentController() != null) {
                    zx32 = zx32.getParentController();
                }
                l9d l9d2 = zx32 instanceof l9d ? (l9d) zx32 : null;
                if (l9d2 != null) {
                    e9d = l9d2.K();
                }
                e.p0(keyboardStickersWidget);
                if (e9d != null) {
                    i9d i9d2 = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d2, true, "BottomSheetWidget");
                    e9d.G(i9d2);
                }
                return Unit.INSTANCE;
            case 16:
                ((i0b) ((e6f) this.receiver)).c();
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED:
                a6f a6f = (a6f) this.receiver;
                a6f.f = false;
                a6f.g = -1.0f;
                a6f.h = -1.0f;
                return Unit.INSTANCE;
            case 18:
                return Boolean.valueOf(((a33) ((x23) this.receiver)).g.getBoolean("app.toggle.webapp_fullscreen", false));
            case 19:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.receiver;
                KProperty[] kPropertyArr6 = WebAppRootScreen.D0;
                webAppRootScreen.getClass();
                zfe zfe = zfe.WEBAPP_ID;
                KProperty kProperty = WebAppRootScreen.D0[1];
                return new h8b(zfe, Long.valueOf(((Number) webAppRootScreen.z.a(webAppRootScreen)).longValue()), 3);
            default:
                ((Runnable) this.receiver).run();
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(x23 x23, int i) {
        super(0, x23, x23.class, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z", 0);
        this.a = i;
        switch (i) {
            case 8:
                super(0, x23, x23.class, "isNewToolbarEnable", "isNewToolbarEnable()Z", 0);
                return;
            case 18:
                super(0, x23, x23.class, "isWebAppFullscreen", "isWebAppFullscreen()Z", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(mh9 mh9) {
        super(0, mh9, mh9.class, "onMiniAppClick", "onMiniAppClick$message_write_widget_release()V", 0);
        this.a = 4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(edb edb) {
        super(0, edb, edb.class, "checkCameraPermission", "checkCameraPermission()Z", 0);
        this.a = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(wyd wyd, int i) {
        super(0, wyd, wyd.class, "openUserAvatars", "openUserAvatars()V", 0);
        this.a = i;
        switch (i) {
            case 12:
                super(0, wyd, wyd.class, "copyProfileLink", "copyProfileLink()V", 0);
                return;
            case 13:
                super(0, wyd, wyd.class, "copyUserPhone", "copyUserPhone()V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(a6f a6f) {
        super(0, a6f, a6f.class, "resetDraggingState", "resetDraggingState()V", 0);
        this.a = 17;
    }
}
