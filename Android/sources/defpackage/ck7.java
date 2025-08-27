package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.login.LoginScreen;
import one.me.mediapicker.MediaPickerScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ck7  reason: default package */
public final /* synthetic */ class ck7 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ck7(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<nd> cls = nd.class;
        Class<gaf> cls2 = gaf.class;
        Class<coa> cls3 = coa.class;
        switch (this.a) {
            case 0:
                return new jbe(true);
            case 1:
                KProperty[] kPropertyArr = InviteByPhoneScreen.z0;
                return jgd.CONTACTS_SEARCH_BY_PHONE;
            case 2:
                KProperty[] kPropertyArr2 = InviteByPhoneScreen.z0;
                return new xk7();
            case 3:
                KProperty[] kPropertyArr3 = InviteByPhoneScreen.z0;
                return new oo3(bk7.a.getAccessor().h(bud.class));
            case 4:
                KProperty[] kPropertyArr4 = InviteByQrBottomSheet.C0;
                return new cl7();
            case 5:
                return new u2g(200);
            case 6:
                return new u2g(200);
            case 7:
                KProperty[] kPropertyArr5 = KeyboardEmojiWidget.y;
                fq7 fq7 = fq7.a;
                return new i45(fq7.getAccessor().h(gk.class), (gj) fq7.getAccessor().g(gj.class), new vs6(25, (Object) (k45) fq7.getAccessor().g(k45.class)), (gaf) fq7.getAccessor().g(cls2), (gvc) fq7.getAccessor().h(gvc.class).getValue());
            case 8:
                KProperty[] kPropertyArr6 = KeyboardStickersWidget.z;
                fq7 fq72 = fq7.a;
                return new z8e(fq72.getAccessor().h(moe.class), fq72.getAccessor().h(due.class));
            case 9:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setShape(0);
                return gradientDrawable;
            case 10:
                return ((a74) ((s74) sjd.a.getAccessor().g(s74.class))).g;
            case 11:
                return h2g.a.d();
            case 12:
                int i = LinkInterceptorWidget.o;
                return (cy7) qra.a.getAccessor().g(cy7.class);
            case 13:
                return new MediaMetadataRetriever();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                n88 n88 = n88.a;
                return new j98(n88.getAccessor().h(cls3), n88.getAccessor().h(x23.class), n88.getAccessor().h(doa.class), n88.getAccessor().h(vlb.class), n88.getAccessor().h(e98.class), n88.getAccessor().h(z88.class), n88.getAccessor().h(eu3.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                n88 n882 = n88.a;
                return new x80(n882.getAccessor().h(cls), n882.getAccessor().h(cls3));
            case 16:
                n88 n883 = n88.a;
                return new t80(n883.getAccessor().h(cls), n883.getAccessor().h(cls3));
            case LangUtils.HASH_SEED /*17*/:
                return new n80(n88.a.getAccessor().h(cls3));
            case 18:
                KProperty[] kPropertyArr7 = LoginScreen.o;
                return new k98(n88.a.getAccessor().h(edb.class));
            case 19:
                return new hg5(150);
            case 20:
                return new hg5(150);
            case 21:
                KProperty[] kPropertyArr8 = LogsViewerScreen.w;
                v98 v98 = v98.a;
                return new oa8((kva) v98.getAccessor().g(kva.class), (gaf) v98.getAccessor().g(cls2));
            case 22:
                KProperty[] kPropertyArr9 = MediaBarPermissionWidget.x;
                return new zj8();
            case 23:
                KProperty[] kPropertyArr10 = MediaBarWidget.c1;
                un2 un2 = un2.a;
                Class<ggd> cls4 = ggd.class;
                return new hcc(new xcd((ggd) un2.getAccessor().g(cls4), ((osa) un2.getDispatchers()).b()), new zcd((ggd) un2.getAccessor().g(cls4), ((osa) un2.getDispatchers()).b()), (h48) un2.getAccessor().g(h48.class), (ln5) un2.getAccessor().g(ln5.class), (ggd) un2.getAccessor().g(cls4), (ou8) un2.getAccessor().g(ou8.class), un2.getDispatchers());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                KProperty[] kPropertyArr11 = MediaBarWidget.c1;
                return new p19();
            case 25:
                KProperty[] kPropertyArr12 = MediaBarWidget.c1;
                return new opd((s48) un2.a.getAccessor().g(s48.class), new cpd(false, true));
            case 26:
                return new byte[131072];
            case 27:
                KProperty[] kPropertyArr13 = MediaPickerScreen.z0;
                return jgd.AVATAR_PICKER_GALLERY;
            case 28:
                KProperty[] kPropertyArr14 = MediaPickerScreen.z0;
                return new om6(new ck7(29));
            default:
                KProperty[] kPropertyArr15 = MediaPickerScreen.z0;
                return Boolean.FALSE;
        }
    }
}
