package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: tba  reason: default package */
public final class tba {
    public static final /* synthetic */ KProperty[] g;
    public static final String h;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;

    static {
        Class<tba> cls = tba.class;
        g = new KProperty[]{wj6.p(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), wj6.p(cls, "messageLogic", "getMessageLogic()Lru/ok/tamtam/servernotifs/NotifMessageLogic;", 0), wj6.p(cls, "deleteLogic", "getDeleteLogic()Lru/ok/tamtam/servernotifs/NotifMsgDeleteLogic;", 0), wj6.p(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0), wj6.p(cls, "bus", "getBus()Lcom/squareup/otto/Bus;", 0), wj6.p(cls, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), wj6.p(cls, "pushListener", "getPushListener()Lru/ok/tamtam/android/notifications/PushListener;", 0), wj6.p(cls, "getChatInfoUseCase", "getGetChatInfoUseCase()Lru/ok/tamtam/GetChatInfoUseCase;", 0)};
        h = cls.getName();
    }

    public tba(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
        this.f = hs76;
    }

    public final a32 a(long j) {
        KProperty kProperty = g[0];
        a32 D = ((r62) this.a.get()).D(j);
        if (D != null) {
            return D;
        }
        return (a32) ev0.C(EmptyCoroutineContext.INSTANCE, new sba(this, j, (Continuation) null));
    }

    public final void b(long j, b89 b89) {
        b89 b892 = b89;
        a32 a2 = a(j);
        if (a2 != null) {
            KProperty[] kPropertyArr = g;
            KProperty kProperty = kPropertyArr[5];
            vk3 p = ((km3) this.d.get()).p(b892.o, false);
            String f2 = p != null ? p.f() : null;
            String str = f2 == null ? "" : f2;
            long j2 = a2.b.a;
            String r = a2.r();
            ked ked = new ked(j2, r, b89, str);
            KProperty kProperty2 = kPropertyArr[6];
            iac iac = (iac) this.e.get();
            iac.getClass();
            z68.c(iac.A0, "handleScheduledMessageNotification %s", ked);
            if (!iac.d(j2, b892.a)) {
                pj5 pj5 = pj5.SCHEDULED;
                String str2 = ked.a;
                String str3 = str2 == null ? "" : str2;
                long j3 = b892.a;
                iac.g(new mj5(j2, j3, pj5, r, str, b892.o, ked.b, str3, -j3, (String) null, ked.d, true, ked.c), (cj5) null);
            }
        }
    }
}
