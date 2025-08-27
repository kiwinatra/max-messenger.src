package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* renamed from: bg2  reason: default package */
public final /* synthetic */ class bg2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ bg2(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    public final Object invoke() {
        Class<gaf> cls = gaf.class;
        Class<rh3> cls2 = rh3.class;
        Class<mi0> cls3 = mi0.class;
        Bundle bundle = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMediaTabWidget.Z;
                return new ag2(bundle.getLong("chat_id"));
            case 1:
                KProperty[] kPropertyArr2 = ContactListWidget.N0;
                eq3 eq3 = null;
                String string = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                if (string == null) {
                    string = "";
                }
                try {
                    eq3 = eq3.valueOf(string);
                } catch (IllegalArgumentException unused) {
                }
                if (eq3 == null) {
                    eq3 = eq3.b;
                }
                eq3 eq32 = eq3;
                gt3 gt3 = gt3.a;
                return new yp3(eq32, gt3.getAccessor().h(Context.class), (cp3) gt3.getAccessor().g(cp3.class), gt3.getAccessor().h(fd8.class), (gaf) gt3.getAccessor().g(cls), gt3.getAccessor().h(tld.class), gt3.getAccessor().h(yk3.class), gt3.getAccessor().h(eu3.class), gt3.getAccessor().h(qx2.class), gt3.getAccessor().h(hl3.class), gt3.getAccessor().h(rs3.class), gt3.getAccessor().h(zk3.class), gt3.getAccessor().h(yr3.class), gt3.getAccessor().h(h4f.class), gt3.getAccessor().h(bud.class));
            case 2:
                KProperty[] kPropertyArr3 = KeyboardStickersWidget.z;
                bundle.getLong("arg_key_chat_id");
                fq7 fq7 = fq7.a;
                return new hwe((gaf) fq7.getAccessor().g(cls), fq7.getAccessor().h(moe.class), fq7.getAccessor().h(gvc.class), fq7.getAccessor().h(vi5.class), fq7.getAccessor().h(ai5.class), fq7.getAccessor().h(jqg.class), LazyKt.lazy(new ck7(8)));
            case 3:
                KProperty[] kPropertyArr4 = ProfileInviteScreen.w;
                long j = bundle.getLong("id");
                jxb jxb = jxb.a;
                return new z2c(j, jxb.getAccessor().h(cls2), jxb.c(), jxb.f(), jxb.getAccessor().h(rl.class), jxb.getAccessor().h(cls3), jxb.g(), jxb.d());
            case 4:
                int i = ProfileMemberPermissionsScreen.o;
                long j2 = bundle.getLong("id");
                bzb bzb = bzb.a;
                return new q4c(j2, bzb.d(), bzb.e(), bzb.c(), bzb.getAccessor().h(cls3), bzb.getAccessor().h(cls2), bzb.getAccessor().h(e0b.class), bzb.getAccessor().h(uj5.class));
            default:
                KProperty[] kPropertyArr5 = ProfileScreen.D0;
                long j3 = bundle.getLong("profile:id");
                Class<txb> cls4 = txb.class;
                Object k = n54.k(bundle, "profile:id_type", cls4);
                if (k != null) {
                    return new k7c(j3, (txb) ((Parcelable) k), bundle.getBoolean("profile:opened_from_dialog"));
                }
                throw new IllegalArgumentException(wj6.k("No value passed for key profile:id_type of type ", cls4.getSimpleName(), " in bundle").toString());
        }
    }
}
