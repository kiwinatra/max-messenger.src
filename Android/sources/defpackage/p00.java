package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.media.crop.FrgTamCropImage;
import ru.ok.messages.views.ProfileFragment;
import ru.ok.messages.views.dialogs.FrgDlgLangChoose;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException;
import ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException;

/* renamed from: p00  reason: default package */
public final /* synthetic */ class p00 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                AttachPhotoView attachPhotoView = (AttachPhotoView) this.b;
                attachPhotoView.R0.z((k97) this.c, attachPhotoView.J0.b.y);
                return;
            case 1:
                mk3 mk3 = (mk3) this.b;
                zj3 zj3 = (zj3) this.c;
                if (zj3 != null) {
                    zj3.d(mk3.H0);
                    return;
                } else {
                    mk3.getClass();
                    return;
                }
            case 2:
                km3 km3 = (km3) this.b;
                km3.getClass();
                ArrayList arrayList = new ArrayList();
                for (vk3 vk3 : (List) this.c) {
                    if (!vk3.C()) {
                        arrayList.add(Long.valueOf(vk3.r()));
                    }
                }
                if (!arrayList.isEmpty()) {
                    z68.a("km3", "asyncFetchExternalContactsPresence, count = " + arrayList.size());
                    ((jna) ((rl) km3.i.get())).y(arrayList);
                    return;
                }
                return;
            case 3:
                z84 z84 = (z84) this.b;
                w84 w84 = z84.g;
                z84.c(new w84(w84.a, w84.b, SetsKt.plus(w84.e, (Set) this.c), w84.c, (mj5) null));
                return;
            case 4:
                ((th4) this.b).getClass();
                s9c s9c = (s9c) this.c;
                z68.c("th4", "close socket for host: %s", s9c.j.toString());
                Socket socket = s9c.e;
                if (socket != null) {
                    try {
                        socket.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                ((ExternalIdsResolver) this.b).lambda$resolveIds$0((List) this.c);
                return;
            case 6:
                ai5 ai5 = (ai5) this.b;
                ai5.getClass();
                long longValue = ((Long) this.c).longValue();
                akd akd = (akd) ((acf) ai5.v.getValue()).b;
                akd.getClass();
                if (longValue >= ((long) ((int) akd.r(PmsKey.f66maxfavoritestickersets, (long) 100)))) {
                    throw new FavoriteStickerSetController$MaxFavoriteStickerSetsException();
                }
                return;
            case 7:
                vi5 vi5 = (vi5) this.b;
                vi5.getClass();
                long longValue2 = ((Long) this.c).longValue();
                akd akd2 = (akd) ((bud) vi5.f.get());
                akd2.getClass();
                if (longValue2 >= ((long) ((int) akd2.r(PmsKey.f67maxfavoritestickers, (long) 100)))) {
                    throw new FavoriteStickersController$MaxFavoriteStickersException();
                }
                return;
            case 8:
                FrgTamCropImage frgTamCropImage = (FrgTamCropImage) this.b;
                frgTamCropImage.B1.getCropImageView().crop((Bitmap) this.c, ((Uri) frgTamCropImage.x.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI")).getPath(), frgTamCropImage.x.getBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
                return;
            case 9:
                xr6 xr6 = ((pr6) this.b).D0;
                b0 b0Var = ((wr6) ((qr6) this.c)).x;
                if (b0Var != null) {
                    b0Var.A(xr6);
                    return;
                }
                return;
            case 10:
                ((dx6) this.b).onClick((View) this.c);
                return;
            case 11:
                FrgDlgLangChoose frgDlgLangChoose = ((rr7) this.b).D0;
                if (frgDlgLangChoose.b3() != null) {
                    String language = ((Locale) this.c).getLanguage();
                    ProfileFragment profileFragment = (ProfileFragment) ((ih6) frgDlgLangChoose.b3());
                    profileFragment.getClass();
                    ((qra) ryg.x(profileFragment)).c().f("ACTION_LANG_CHANGED", "settings");
                    qwf qwf = (qwf) profileFragment.n1.getValue();
                    a33 a33 = ((ltb) qwf.b).a;
                    String q = a33.q();
                    if (q == null || q.length() == 0 || !Intrinsics.areEqual((Object) q, (Object) language)) {
                        a33.l("user.lang", language);
                        Application application = qwf.a;
                        b0h.L(application, a33);
                        ProcessPhoenix.b(application);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                n89 n89 = (n89) this.b;
                n89.e.P0.z((k97) this.c, n89.c.b.y);
                return;
            case 13:
                ((ef9) this.b).k.remove((ye9) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((vj9) this.b).g.remove((pj9) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                a2a a2a = (a2a) this.b;
                a2a.getClass();
                List list = (List) this.c;
                if (!list.isEmpty()) {
                    a2a.V(new y1a(a2a, list, 1));
                    return;
                }
                return;
            case 16:
                iac iac = (iac) this.b;
                mj5 mj5 = (mj5) this.c;
                iac.getClass();
                KProperty[] kPropertyArr = iac.z0;
                KProperty kProperty = kPropertyArr[3];
                z84 z842 = (z84) iac.w.get();
                KProperty kProperty2 = kPropertyArr[1];
                boolean z = !((fn4) iac.o.get()).d();
                z842.getClass();
                String str = z84.k;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, "notifyServerChatIdsDebounced", (Throwable) null);
                }
                z842.b(new v84(z842, mj5, z));
                return;
            case LangUtils.HASH_SEED:
                ruc ruc = (ruc) this.b;
                ruc.getClass();
                long r = ((vk3) this.c).r();
                km3 km32 = ruc.b;
                km32.getClass();
                km32.e(r, new c10(0, 16));
                return;
            case 18:
                ruc ruc2 = (ruc) this.b;
                ruc2.getClass();
                ruc2.a.s0(((a32) this.c).a, 0);
                return;
            case 19:
                ((i6d) this.b).e.c((qj7) this.c);
                return;
            case 20:
                vud vud = (vud) this.b;
                vud.s().d(vud.b);
                fa9 o = vud.o();
                long j = vud.c;
                ha9 r2 = o.r(j);
                if (r2 != null && r2.Y != qe9.DELETED) {
                    l20 a2 = r2.a(g20.v0);
                    if (a2 != null) {
                        vud.o().x(r2.b, a2.q, new nqd(3, (s58) this.c));
                        rvd.A(vud.v());
                        vud.u().c(new twf(0, r2.z, vud.c));
                        return;
                    }
                    z68.f(vud.v, "onSuccess: WTF, no location attach in message", (Throwable) null);
                    fa9 o2 = vud.o();
                    o2.getClass();
                    List singletonList = Collections.singletonList(Long.valueOf(j));
                    long j2 = r2.z;
                    o2.d(j2, singletonList);
                    vud.u().c(new kv9(j2, CollectionsKt.listOf(Long.valueOf(j)), (bl4) null));
                    return;
                }
                return;
            case 21:
                ((a74) ((s74) ((moe) this.b).d.get())).h.A((List) this.c);
                return;
            case 22:
                moe moe = (moe) this.b;
                ((a74) ((s74) moe.d.get())).h.A(Collections.singletonList((boe) this.c));
                moe.i();
                return;
            case 23:
                tba tba = (tba) ((vtd) ((ybf) this.b).k.getValue()).n.get();
                tba.getClass();
                StringBuilder sb = new StringBuilder("handle ");
                oba oba = (oba) this.c;
                sb.append(oba);
                String sb2 = sb.toString();
                String str2 = tba.h;
                z68.c(str2, sb2, new Object[0]);
                b89 b89 = oba.w;
                int ordinal = oba.v.ordinal();
                hs7 hs7 = tba.b;
                if (ordinal != 0) {
                    long j3 = oba.c;
                    if (ordinal == 1) {
                        KProperty kProperty3 = tba.g[1];
                        ((mba) hs7.get()).a(new kba(oba.c, (b32) null, oba.w, false, 0, false), bl4.DELAYED);
                        if (b89 != null && b89.v == re9.v) {
                            z68.p(str2, "delayed message has error status");
                            tba.b(j3, b89);
                            return;
                        }
                        return;
                    } else if (ordinal == 2) {
                        z68.c(str2, "handle delete", new Object[0]);
                        a32 a3 = tba.a(j3);
                        if (a3 != null) {
                            KProperty kProperty4 = tba.g[2];
                            ((wba) tba.c.get()).b(a3, oba.x, bl4.DELAYED);
                            return;
                        }
                        return;
                    } else if (ordinal != 3) {
                        if (ordinal == 4) {
                            z68.p(str2, "handle unknown type! " + oba);
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (b89 == null) {
                        z68.p(str2, "message is null");
                        return;
                    } else {
                        tba.b(j3, b89);
                        return;
                    }
                } else {
                    KProperty kProperty5 = tba.g[1];
                    ((mba) hs7.get()).a(new kba(oba.c, (b32) null, oba.w, false, 0, false), bl4.DELAYED);
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                hba hba = (hba) ((vtd) ((ybf) this.b).k.getValue()).j.get();
                hba.getClass();
                gba gba = (gba) this.c;
                t58 t58 = gba.v;
                s58 s58 = t58.a;
                qq3 qq3 = qq3.e;
                vy vyVar = new vy(s58);
                vyVar.b = gba.c;
                vyVar.c = t58.b;
                vyVar.o = gba.o;
                qq3 d = vyVar.d();
                KProperty kProperty6 = hba.b[0];
                ((j18) ((d18) hba.a.get())).c.d(d);
                return;
            case 25:
                ybf ybf = (ybf) this.b;
                ybf.getClass();
                zaa zaa = (zaa) this.c;
                if (zaa.c != null) {
                    km3 km33 = (km3) ybf.f.getValue();
                    km33.getClass();
                    z68.a("km3", "onNotifContact, response = " + zaa.c);
                    km33.D(Collections.singletonList(zaa.c));
                    ((uu3) km33.m.get()).b(Collections.singletonList(Long.valueOf(zaa.c.a)));
                    ((oj7) ybf.i.getValue()).a(Collections.singletonList(Long.valueOf(zaa.c.a)));
                    return;
                }
                return;
            case 26:
                ((yaa) ((vtd) ((ybf) this.b).k.getValue()).d.get()).b(((xaa) this.c).c, false);
                return;
            case 27:
                wba wba = (wba) ((vtd) ((ybf) this.b).k.getValue()).h.get();
                wba.getClass();
                StringBuilder sb3 = new StringBuilder("onNotifMsgDelete: ");
                uba uba = (uba) this.c;
                sb3.append(uba);
                z68.a("wba", sb3.toString());
                b32 b32 = uba.c;
                if (b32 != null) {
                    hs7 hs72 = wba.b;
                    ((r62) hs72.get()).n0(Collections.singletonList(b32));
                    wba.b(((r62) hs72.get()).D(b32.a), uba.o, bl4.REGULAR);
                    return;
                }
                return;
            case 28:
                eba eba = (eba) ((vtd) ((ybf) this.b).k.getValue()).l.get();
                a33 a332 = ((ltb) eba.a()).a;
                dba dba = (dba) this.c;
                a332.k("user.draftsLastSync", Long.valueOf(dba.v));
                if (!((ltb) eba.a()).b.w()) {
                    z68.c(eba.e, "onDraftDiscard: Drafts sync disabled", new Object[0]);
                    return;
                }
                KProperty kProperty7 = eba.d[1];
                ((hp4) eba.b.get()).a(dba.v, Long.valueOf(dba.c), Long.valueOf(dba.o));
                return;
            default:
                waa waa = (waa) ((vtd) ((ybf) this.b).k.getValue()).e.get();
                waa.getClass();
                vaa vaa = (vaa) this.c;
                b32 b322 = vaa.c;
                z68.c("waa", "onNotifChat, chat = " + b322 + " created  = " + iq.U(Long.valueOf(b322.v)), new Object[0]);
                try {
                    ((is9) waa.e.get()).m(b322);
                } catch (TamErrorException unused2) {
                }
                hs7 hs73 = waa.a;
                a32 D = ((r62) hs73.get()).D(b322.a);
                long j4 = b322.v;
                if (D != null && j4 > 0) {
                    m72 m72 = D.b;
                    if (j4 < m72.f) {
                        z68.f("waa", wj6.m(tr1.n(j4, "New chat created ", " < old chat created "), m72.f, ". Ignore this notif chat"), (Throwable) null);
                        return;
                    }
                }
                if (D != null && vaa.c.b.equals("REMOVED")) {
                    ((r62) hs73.get()).n0(Collections.singletonList(b322));
                }
                int i = b322.Z;
                if (D == null || D.b.f + 1 > j4 || b322.z != null || i != 0 || vaa.c.b.equals("REMOVED")) {
                    boolean z2 = (D == null || j4 == D.b.f) ? false : true;
                    List n0 = ((r62) hs73.get()).n0(Collections.singletonList(b322));
                    if (!n0.isEmpty() && z2 && j4 > 0) {
                        ((y13) waa.d.get()).a(((Long) n0.get(0)).longValue(), j4);
                    }
                    if (i > 0 && !n0.isEmpty()) {
                        ((qwa) waa.b.get()).b(Collections.singleton((Long) n0.get(0)));
                    }
                    long j5 = vaa.c.a;
                    ia2 ia2 = (ia2) ((u82) waa.f.get());
                    aje aje = ia2.H0;
                    if (aje != null) {
                        aje.b((CancellationException) null);
                    }
                    ia2.H0 = ev0.v(ia2.y, ia2.x, (f14) null, new ha2(ia2, (Continuation) null), 2);
                    xy2 xy2 = new xy2(n0, true);
                    sv0 sv0 = waa.c;
                    sv0.c(xy2);
                    if (D != null && vaa.c.b.equals("REMOVED")) {
                        sv0.c(new c1d(D.a));
                        return;
                    }
                    return;
                }
                ((r62) hs73.get()).s(D.a, vaa.c.Y);
                return;
        }
    }
}
