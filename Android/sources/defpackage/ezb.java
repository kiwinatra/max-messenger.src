package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ezb  reason: default package */
public final class ezb implements oa4 {
    public final /* synthetic */ int a;
    public final Lazy b;
    public final wa4 c;

    public ezb(int i, Lazy lazy) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = zfg.b;
                this.b = lazy;
                return;
            default:
                this.b = lazy;
                this.c = hzb.b;
                return;
        }
    }

    public final wa4 a() {
        switch (this.a) {
            case 0:
                return (hzb) this.c;
            default:
                return (zfg) this.c;
        }
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        ya4 ya4;
        ra4 ra42 = ra4;
        Bundle bundle2 = bundle;
        switch (this.a) {
            case 0:
                if (!((hzb) this.c).a.contains(ra42)) {
                    return null;
                }
                za4 za4 = za4.a;
                hzb.b.getClass();
                if (Intrinsics.areEqual((Object) ra42, (Object) hzb.c)) {
                    long L = o54.L("id", bundle2);
                    p9a p9a = gzb.b;
                    String N = o54.N("type", bundle2);
                    p9a.getClass();
                    ya4 = new oxb(L, (Parcelable) p9a.k(N), 2);
                } else if (Intrinsics.areEqual((Object) ra42, (Object) hzb.d)) {
                    ya4 = new ha3(o54.L("id", bundle2), 8);
                } else if (Intrinsics.areEqual((Object) ra42, (Object) hzb.e)) {
                    long L2 = o54.L("id", bundle2);
                    p9a p9a2 = gzb.b;
                    String N2 = o54.N("type", bundle2);
                    p9a2.getClass();
                    gzb k = p9a.k(N2);
                    if (k == gzb.CONTACT) {
                        akd akd = (akd) ((bud) this.b.getValue());
                        akd.getClass();
                        if (!akd.m(PmsKey.f6accountnicknameenabled, false)) {
                            return null;
                        }
                    }
                    o9a o9a = fzb.b;
                    String N3 = o54.N("flow", bundle2);
                    o9a.getClass();
                    for (fzb fzb : fzb.v) {
                        if (Intrinsics.areEqual((Object) fzb.a, (Object) N3)) {
                            ya4 = new czb(L2, k, fzb);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } else if (Intrinsics.areEqual((Object) ra42, (Object) hzb.f)) {
                    ya4 = new dzb(o54.L("chat_id", bundle2), o54.N("permissions_type", bundle2), o54.L("contact_id", bundle2));
                } else {
                    z68.f(ezb.class.getName(), "invalid route " + ra42, new IllegalArgumentException("invalid route " + ra42));
                    return null;
                }
                return new ab4(str, ra4, bundle, za4, (xa4) null, ya4, 16);
            default:
                Integer num = null;
                if (!((zfg) this.c).a.contains(ra42)) {
                    return null;
                }
                zfg.b.getClass();
                if (Intrinsics.areEqual((Object) ra42, (Object) zfg.c)) {
                    xa4 xa4 = new xa4(new i2g(5), new i2g(6));
                    long L3 = o54.L("bot_id", bundle2);
                    nfd nfd = kfg.c;
                    String N4 = o54.N("entry_point", bundle2);
                    nfd.getClass();
                    for (kfg kfg : kfg.z) {
                        if (Intrinsics.areEqual((Object) kfg.a, (Object) N4)) {
                            Long F = o54.F("chat_id", bundle2);
                            String string = bundle2.getString("start_param");
                            Boolean E = o54.E("is_fullscreen", bundle2);
                            boolean booleanValue = E != null ? E.booleanValue() : ((a33) ((x23) this.b.getValue())).g.getBoolean("app.toggle.webapp_fullscreen", false);
                            String string2 = bundle2.getString("request_code");
                            if (string2 != null) {
                                num = Integer.valueOf(Integer.parseInt(string2));
                            }
                            return new ab4(str, ra4, bundle, za4.a, xa4, new yfg(L3, kfg, F, string, booleanValue, num != null ? num.intValue() : 0));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                throw new IllegalStateException(tr1.i("invalid route ", ra42));
        }
    }
}
