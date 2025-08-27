package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KProperty;

/* renamed from: vdg  reason: default package */
public final class vdg implements fk1 {
    public static final /* synthetic */ KProperty[] l;
    public static final String m;
    public final Lazy a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;
    public final hs7 h;
    public final hs7 i;
    public final Lazy j;
    public boolean k;

    static {
        Class<vdg> cls = vdg.class;
        l = new KProperty[]{wj6.p(cls, "authStorage", "getAuthStorage()Lru/ok/tamtam/AuthStorage;", 0), wj6.p(cls, "pinger", "getPinger()Lru/ok/tamtam/services/Pinger;", 0), wj6.p(cls, "presenceController", "getPresenceController()Lru/ok/tamtam/contacts/presence/PresenceController;", 0), wj6.p(cls, "contactSortCache", "getContactSortCache()Lru/ok/tamtam/contacts/ContactSortCache;", 0), wj6.p(cls, "phonebook", "getPhonebook()Lru/ok/tamtam/services/Phonebook;", 0), wj6.p(cls, "outgoingTypingController", "getOutgoingTypingController()Lru/ok/tamtam/typing/OutgoingTypingController;", 0), wj6.p(cls, "contacts", "getContacts()Lru/ok/tamtam/contacts/ContactController;", 0), wj6.p(cls, "tamService", "getTamService()Lru/ok/tamtam/services/TamService;", 0), wj6.p(cls, "fileCacheController", "getFileCacheController()Lru/ok/tamtam/filecache/FileCacheController;", 0), wj6.p(cls, "connectionInfo", "getConnectionInfo()Lru/ok/tamtam/ConnectionInfo;", 0)};
        m = cls.getName();
    }

    public vdg(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78, Lazy lazy, Lazy lazy2) {
        this.a = lazy2;
        this.b = hs7;
        this.c = hs72;
        this.d = hs73;
        this.e = hs74;
        this.f = hs75;
        this.g = hs76;
        this.h = hs77;
        this.i = hs78;
        this.j = lazy;
        ((mp1) ((dp1) lazy.getValue())).I.add(this);
    }

    public final void b() {
        if (!this.k) {
            c();
            z68.c(m, "Call was ended. Stop ping activity state.", new Object[0]);
        }
    }

    public final void c() {
        mq4 mq4;
        String str = m;
        z68.c(str, "onAppGoesBackground", new Object[0]);
        this.k = false;
        KProperty[] kPropertyArr = l;
        KProperty kProperty = kPropertyArr[0];
        if (((doa) this.b.get()).e()) {
            if (((mp1) ((dp1) this.j.getValue())).p()) {
                z68.c(str, "ignore onAppGoesBackground due to active call", new Object[0]);
                return;
            }
            KProperty kProperty2 = kPropertyArr[1];
            vlb vlb = (vlb) this.c.get();
            vlb.getClass();
            z68.c("vlb", "stopInteractivePings", new Object[0]);
            ((jna) ((rl) vlb.a.getValue())).O(false);
            mq4 mq42 = vlb.f;
            if (!(mq42 == null || mq42.f() || (mq4 = vlb.f) == null)) {
                mq4.dispose();
            }
            KProperty kProperty3 = kPropertyArr[2];
            rtb rtb = (rtb) this.d.get();
            if (rtb != null) {
                AtomicBoolean atomicBoolean = rtb.k;
                if (atomicBoolean.get()) {
                    rtb.h();
                    atomicBoolean.set(false);
                }
                rtb.j.setValue(rtb, rtb.l[0], (Object) null);
            }
            KProperty kProperty4 = kPropertyArr[5];
            if (((d6b) this.f.get()) != null) {
                Iterator it = d6b.b.entrySet().iterator();
                while (it.hasNext()) {
                    b6b b6b = (b6b) ((Map.Entry) it.next()).getValue();
                    if (b6b.a.isEmpty()) {
                        mq4 mq43 = b6b.b;
                        if (mq43 != null && !mq43.f()) {
                            mq43.dispose();
                        }
                        it.remove();
                    }
                }
                d6b.c.clear();
            }
            KProperty[] kPropertyArr2 = l;
            KProperty kProperty5 = kPropertyArr2[7];
            ((wbf) ((pbf) this.g.get())).e(false);
            KProperty kProperty6 = kPropertyArr2[8];
            pl5 pl5 = (pl5) this.h.get();
            if (pl5 != null) {
                pl5.b.getClass();
            }
        }
    }

    public final void d(boolean z) {
        int ordinal;
        String str = m;
        z68.c(str, "onAppGoesForeground forceContactSync = %b", Boolean.valueOf(z));
        KProperty[] kPropertyArr = l;
        KProperty kProperty = kPropertyArr[9];
        hs7 hs7 = this.i;
        ((rh3) hs7.get()).invalidate();
        if (this.k || !((mp1) ((dp1) this.j.getValue())).q()) {
            this.k = true;
            KProperty kProperty2 = kPropertyArr[7];
            ((wbf) ((pbf) this.g.get())).e(true);
            KProperty kProperty3 = kPropertyArr[9];
            boolean a2 = ((rh3) hs7.get()).a();
            Lazy lazy = this.a;
            if (!a2 && lazy.isInitialized()) {
                ((zbf) lazy.getValue()).g();
            }
            ((zbf) lazy.getValue()).e();
            KProperty kProperty4 = kPropertyArr[1];
            ((vlb) this.c.get()).b();
            KProperty kProperty5 = kPropertyArr[0];
            if (((doa) this.b.get()).e()) {
                KProperty kProperty6 = kPropertyArr[2];
                rtb rtb = (rtb) this.d.get();
                rtb.k.set(true);
                if (((doa) rtb.f.getValue()).e()) {
                    long e2 = ((qjd) rtb.f()).e("user.presenceLastSync", 0);
                    jna jna = (jna) ((rl) rtb.g.getValue());
                    jna.getClass();
                    if (e2 < 0 && (ordinal = jna.C().ordinal()) != 0) {
                        if (ordinal == 1) {
                            z68.f(jna.a, "invalid last sync time", new IllegalArgumentException("invalid last sync time"));
                            jna.z(jna, new or3(((ltb) jna.D()).a.n(), (long[]) null, e2));
                        } else if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw new IllegalArgumentException("invalid last sync time");
                        }
                    }
                }
                if (z) {
                    KProperty kProperty7 = kPropertyArr[4];
                    ((meb) ((deb) this.e.get())).c();
                    return;
                }
                return;
            }
            return;
        }
        z68.c(str, "ignore onAppGoesForeground due to incoming call.", new Object[0]);
    }

    public final void onCallAccepted() {
        if (!this.k) {
            d(false);
            z68.c(m, "Call was accepted. Start ping activity state.", new Object[0]);
        }
    }
}
