package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.ProgressDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

public class FrgAttachVideo extends FrgAttachView implements jb9, w57, i0a {
    public Map I1;
    public ImageButton J1;
    public r20 K1;
    public ju8 L1;
    public x2a M1;
    public j0a N1;
    public VideoThumbnailView O1;
    public srd P1;
    public nd Q1;
    public ll5 R1;

    public final void A1(int i) {
        y64.C(500, new ag6(this, 1));
        super.A1(i);
    }

    public final void A3() {
        b33 q1;
        boolean z = true;
        if (this.U0 && (q1 = q1()) != null) {
            MenuItem b = q1.b(lic.menu_attach_video__download);
            MenuItem b2 = q1.b(lic.menu_attach_video__download_cancel);
            MenuItem b3 = q1.b(lic.menu_attachments__share);
            MenuItem b4 = q1.b(lic.menu_attachments__to_pip_mode);
            MenuItem b5 = q1.b(lic.menu_attachments__open_in);
            MenuItem b6 = q1.b(lic.menu_attachments__rotate_screen);
            MenuItem b7 = q1.b(lic.menu_attach_video__go_to_message);
            MenuItem b8 = q1.b(lic.menu_attach_video__audio_tracks);
            if (b != null && b2 != null && b3 != null && b4 != null && b5 != null && b6 != null && b7 != null && b8 != null) {
                if (j3() == null) {
                    b.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b4.setVisible(false);
                    b5.setVisible(false);
                    b6.setVisible(false);
                    b7.setVisible(false);
                    b8.setVisible(false);
                    return;
                }
                k20 k20 = ld8.Y(this.D1) ? this.D1.j.d.d : this.D1.d;
                boolean a0 = ld8.a0(((qra) ((id3) this.p1.b)).y(), k20);
                b3.setVisible(true);
                b4.setVisible(!a0);
                if (k20 == null) {
                    b.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(true);
                    b5.setVisible(!TextUtils.isEmpty(this.D1.r));
                    MenuItem b9 = q1.b(lic.menu_attachments__open_all_media);
                    if (b9 != null) {
                        b9.setVisible(false);
                    }
                    b6.setVisible(false);
                    b8.setVisible(false);
                } else {
                    String str = k20.g;
                    b5.setVisible(!a0 && !TextUtils.isEmpty(str));
                    if (k20.a == 0) {
                        b.setVisible(false);
                        b2.setVisible(false);
                    } else if (this.D1.n.d()) {
                        b2.setVisible(true);
                        b.setVisible(false);
                    } else {
                        b2.setVisible(false);
                        ltb y = ((qra) ((id3) this.p1.b)).y();
                        if (cvg.A(str) && !k20.f) {
                            cud cud = y.b;
                            cud.getClass();
                            long r = cud.r(PmsKey.f74maxvideodurationdownload, 1200) * 1000;
                            if (r == 0 || k20.b <= r) {
                                aqg s = i8b.s(this.D1);
                                if (!TextUtils.isEmpty((String) s.a) || ((File) s.b) != null) {
                                    b.setVisible(false);
                                } else {
                                    b.setVisible(true);
                                }
                            }
                        }
                        b.setVisible(false);
                        b3.setVisible(false);
                    }
                    Context O12 = O1();
                    if (O12 != null) {
                        Settings.System.getInt(O12.getContentResolver(), "accelerometer_rotation", 0);
                    }
                    b6.setVisible(false);
                    j0a j0a = this.N1;
                    b8.setVisible(j0a != null && j0a.X().size() > 1);
                }
                if (j3() == null) {
                    z = false;
                }
                b7.setVisible(z);
            }
        }
    }

    public final void D0() {
        eg6 k3 = h3();
        if (k3 != null) {
            ((ActAttachesView) k3).b(true, true, false);
        }
    }

    public final void F0(int i) {
        ProgressDialog progressDialog;
        c cVar = this.D0;
        if (cVar != null && (progressDialog = (ProgressDialog) cVar.E("ru.ok.messages.views.dialogs.ProgressDialog")) != null) {
            ((ProgressBar) progressDialog.W2().findViewById(lic.dialog_progress__progress)).setProgress(i);
        }
    }

    public final void I0() {
    }

    public final void Q(String str) {
    }

    public final List U() {
        return Collections.singletonList(this.C1);
    }

    public final void W0(Throwable th) {
        Context O12 = O1();
        if (O12 != null) {
            hi7.b0(0, O12, fhf.f(O12, th));
        }
    }

    public final void Z2(View view) {
        j0a j0a = this.N1;
        if (j0a != null) {
            f2a f2a = j0a.a;
            if (f2a instanceof bif) {
                ((bif) f2a).c();
            }
        }
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 101) {
                String[] strArr = n54.c;
                S2(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + O1().getPackageName())), HttpStatus.SC_PROCESSING, (Bundle) null);
            } else if (i == 102) {
                w3(true);
            }
        } else if (i == 102) {
            Context O12 = O1();
            String[] strArr2 = n54.c;
            if (O12 == null ? false : Settings.canDrawOverlays(O12)) {
                w3(true);
            }
        }
    }

    public final void d0() {
    }

    public final boolean d3() {
        m5 X2 = X2();
        if (X2 == null) {
            return false;
        }
        if (X2.isTaskRoot() && !this.x.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            int i = o6.z0;
            Intent intent = new Intent(X2, o6.class);
            intent.setFlags(604045312);
            intent.setAction("ru.ok.tamtam.OPEN_CHATS_LIST");
            intent.putExtra("ru.ok.tamtam.extra.OPENED_FROM_PUSH", false);
            X2.startActivity(intent);
        }
        y64.C(400, new ag6(this, 1));
        if (this.F1) {
            l8.a(X2);
        } else {
            X2.finish();
        }
        return true;
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        if (i == 110) {
            if (n54.X(this, strArr, iArr, n54.n(), qad.h7, qad.e7)) {
                View view = this.S0;
                if (view != null) {
                    view.post(new ag6(this, 0));
                }
                s3();
            }
        } else if (i == 111) {
            if (n54.X(this, strArr, iArr, n54.n(), qad.g7, qad.e7)) {
                x3();
            }
        } else if (i == 112) {
            if (n54.X(this, strArr, iArr, n54.n(), qad.h7, qad.e7)) {
                aqg s = i8b.s(this.D1);
                gsg.E(M1(), (File) s.b, ((qra) ((id3) this.p1.b)).p());
            }
        }
    }

    public final void i() {
        A3();
    }

    public final void i0(boolean z) {
        eg6 k3 = h3();
        if (k3 != null) {
            ((ActAttachesView) k3).b(z, true, false);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        o3();
        if (ld8.Y(this.D1)) {
            nd c = this.q1.c();
            jqg A = this.q1.A();
            po5 po5 = (po5) this.q1.m();
            Context O12 = O1();
            if (this.x1 == null) {
                this.x1 = new dac();
            }
            ll5 ll5 = new ll5(c, A, po5, O12, this, this, this.x1, ((qra) ((id3) this.p1.b)).u());
            this.R1 = ll5;
            ((sjd) ((z9f) ll5.b)).f().d(ll5);
            ll5.Q(bundle);
            this.R1.o = this;
        }
        this.Q1 = ((qra) ((id3) this.p1.b)).c();
    }

    public final boolean isActive() {
        return this.o1;
    }

    public final void j0() {
    }

    public final void j2(Menu menu, MenuInflater menuInflater) {
        MenuItem b;
        if (!this.C1.a.v() && !this.x.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            menu.clear();
            menuInflater.inflate(wjc.menu_attach_video, menu);
            iq.g(this.r1, menu, (Integer) null);
            A3();
            b33 q1 = q1();
            a32 j3 = j3();
            if (!((!this.C1.a.E() && j3 != null) || q1 == null || (b = q1.b(lic.menu_attachments__open_all_media)) == null)) {
                b.setVisible(false);
            }
            super.j2(menu, menuInflater);
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        Bundle bundle2 = bundle;
        View inflate = layoutInflater.inflate(ujc.frg_video_view, viewGroup, false);
        y64.n(inflate.findViewById(lic.frg_video_view__rl_root), new cg6(this, 1));
        ct.b(inflate);
        this.L1 = ((ku8) M1()).a();
        qra qra = (qra) ((id3) this.p1.b);
        this.M1 = new x2a(O1(), inflate.findViewById(lic.frg_video_view__player), qra.d(), qra.c());
        if (!this.F1 || bundle2 != null || ld8.d0(this.D1)) {
            view = inflate;
            view.findViewById(lic.frg_video_view__player).setVisibility(8);
            this.O1 = (VideoThumbnailView) view.findViewById(lic.frg_video_view__vt_transition);
            this.O1.o(ld8.Y(this.D1) ? this.D1.j.d.d : this.D1.d, qra.h().a(this.D1));
            view2 = this.O1;
        } else {
            x2a x2a = this.M1;
            ju8 ju8 = this.L1;
            p8g K = qra.K();
            jbf H = qra.H();
            ys7 ys7 = (ys7) qra.getAccessor().g(ys7.class);
            o20 h = qra.h();
            fa9 u = qra.u();
            ltb y = qra.y();
            m95 o = qra.o();
            hn4 n = qra.n();
            eg6 k3 = h3();
            j0a j0a = r0;
            view = inflate;
            j0a j0a2 = new j0a(x2a, ju8, K, H, ys7, h, u, y, this, o, n, k3 == null ? true : ((ActAttachesView) k3).G0, false);
            this.N1 = j0a;
            a32 j3 = j3();
            this.N1.W(this.D1, j3 != null ? j3.b.a : 0, this.C1.a, 4, true);
            z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", this.D1.q);
            view2 = ld8.y0(qra.y(), this.D1) ? this.M1.B0 : this.M1.Z;
        }
        p3((SlideOutLayout) view, view2);
        this.J1 = (ImageButton) view.findViewById(lic.frg_video_view__btn_cancel);
        r20 r20 = new r20(O1());
        this.K1 = r20;
        this.J1.setImageDrawable(r20);
        y64.n(this.J1, new cg6(this, 2));
        Bundle bundle3 = bundle;
        View view3 = view;
        if (bundle3 != null) {
            this.P1 = hi7.W(qra.g(), bundle3, "ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER");
        }
        if (bundle3 != null && this.I1 == null) {
            this.I1 = new HashMap();
            ArrayList parcelableArrayList = bundle3.getParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS");
            ArrayList parcelableArrayList2 = bundle3.getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
            if (!(parcelableArrayList == null || parcelableArrayList2 == null)) {
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    this.I1.put((npf) parcelableArrayList.get(i), ((uac) parcelableArrayList2.get(i)).a);
                }
            }
        }
        if (!this.E1) {
            bg6 bg6 = new bg6(this, 0);
            WeakHashMap weakHashMap = gag.a;
            v9g.u(view3, bg6);
            view3.post(new vg(view3, 4));
        }
        y3();
        return view3;
    }

    public final void l2() {
        super.l2();
        ll5 ll5 = this.R1;
        if (ll5 != null) {
            ll5.o = null;
            ((sjd) ((z9f) ll5.b)).f().f(ll5);
            jbd.c(ll5.x0);
            jbd.c(ll5.y0);
        }
        v3();
    }

    public final void m() {
        eg6 k3 = h3();
        if (k3 != null) {
            ((ActAttachesView) k3).c();
        }
    }

    public final void m1() {
    }

    public final void m3(boolean z) {
        j0a j0a = this.N1;
        if (j0a != null) {
            if (!z) {
                j0a.j0();
            } else if (j0a.a()) {
                this.N1.h0();
            }
        }
    }

    public final void n3(boolean z) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.M1.x;
        pinchToZoomVideoViewWrapper.c = qlb.b;
        pinchToZoomVideoViewWrapper.v = 1.0f;
    }

    @oye
    public void onEvent(twf twf) {
        if (twf.c == this.C1.a.b) {
            l3(twf, new cg6(this, 0));
        }
    }

    public final void r3() {
        z3();
    }

    public final boolean s2(MenuItem menuItem) {
        eg6 k3;
        MenuItem b;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            d3();
        } else if (itemId != lic.menu_attachments__open_all_media) {
            long j = 0;
            if (itemId == lic.menu_attachments__forward) {
                eg6 k32 = h3();
                if (k32 != null) {
                    ((ActAttachesView) k32).R0.i(this.C1, 0);
                }
            } else if (itemId == lic.menu_attachments__share) {
                if (this.o1) {
                    if (this.D1.i()) {
                        aqg s = i8b.s(this.D1);
                        String str = (String) s.a;
                        if (str != null) {
                            gsg.B(O1(), str);
                        } else {
                            File file = (File) s.b;
                            if (file == null) {
                                Boolean bool = (Boolean) s.c;
                                if (bool != null) {
                                    t3(bool.booleanValue());
                                }
                            } else if (!n54.f(O1())) {
                                n54.N(this, n54.n(), 112);
                            } else {
                                gsg.E(M1(), file, ((qra) ((id3) this.p1.b)).p());
                            }
                        }
                    } else if (ld8.Y(this.D1)) {
                        t3(false);
                    }
                }
            } else if (itemId == lic.menu_attach_video__download) {
                x3();
            } else if (itemId == lic.menu_attach_video__download_cancel) {
                this.q1.r().w(this.C1.a, this.D1.q, d20.b);
                A3();
            } else if (itemId == lic.menu_attachments__to_pip_mode) {
                Context O12 = O1();
                String[] strArr = n54.c;
                if (O12 == null ? false : Settings.canDrawOverlays(O12)) {
                    w3(false);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", qad.s6);
                    bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.X6);
                    bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.V6);
                    ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                    confirmationDialog.L2(bundle);
                    confirmationDialog.P2(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
                    confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
                }
            } else if (itemId == lic.menu_attachments__open_in) {
                if (ld8.Y(this.D1)) {
                    this.R1.P(this.C1, this.D1, this, true, false, 4, (o5h) null);
                } else if (this.D1.i()) {
                    gsg.v(M1(), this.D1.d.g);
                }
            } else if (itemId == lic.menu_attach_video__go_to_message) {
                m5 X2 = X2();
                if (X2 != null) {
                    ha9 ha9 = this.C1.a;
                    t5 t5Var = new t5(ha9.z);
                    t5Var.d = ha9.o;
                    q5.T(X2, t5Var);
                    X2.finish();
                }
            } else if (itemId == lic.menu_attachments__rotate_screen) {
                q3();
            } else if (itemId == lic.menu_attach_video__audio_tracks) {
                z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Open audio tracks", new Object[0]);
                j0a j0a = this.N1;
                if (j0a != null) {
                    List X = j0a.X();
                    if (X.size() < 2) {
                        ((uta) ((qra) ((id3) this.p1.b)).o()).c(new HandledException(new IllegalStateException("Audio tracks count less then 2")), true);
                        b33 q1 = q1();
                        if (!(q1 == null || (b = q1.b(lic.menu_attach_video__audio_tracks)) == null)) {
                            b.setVisible(false);
                        }
                    } else {
                        this.Q1.c(X.size(), "OPEN_AUDIO_TRACKS_DIALOG");
                        this.N1.j0();
                        mpf e = ((m48) this.N1.b).e();
                        ArrayList arrayList = new ArrayList(X);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS", arrayList);
                        bundle2.putParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK", e);
                        FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = new FrgDlgAudioTracksPicker();
                        frgDlgAudioTracksPicker.L2(bundle2);
                        frgDlgAudioTracksPicker.d3(this);
                    }
                }
            } else if (itemId == lic.menu_attach_video__send_video && (k3 = h3()) != null) {
                if (this.D1.i()) {
                    j = this.D1.d.a;
                } else if (ld8.Y(this.D1)) {
                    j = this.D1.j.a;
                }
                ((ActAttachesView) k3).R0.i(this.C1, j);
            }
        } else if (X2() != null) {
            r5.T(M1(), this.C1.a.z);
            U2();
        }
        return true;
    }

    public final void s3() {
        if (this.D1.i()) {
            this.q1.r().u(this.C1.a, this.D1.q, new p79(9));
        }
        f3(qad.B1, true).F1 = new bg6(this, 3);
        srd a = ((qra) ym.e()).g().a(this.D1);
        this.P1 = a;
        a.O(new bg6(this, 1), new bg6(this, 2));
    }

    public final void t2() {
        super.t2();
        srd srd = this.P1;
        if (srd != null) {
            jbd.c((or7) srd.o);
        }
        v3();
    }

    public final void t3(boolean z) {
        if (z) {
            hi7.b0(0, O1(), S1(qad.na));
        } else if (!n54.f(O1())) {
            n54.N(this, n54.n(), 110);
        } else {
            s3();
        }
    }

    public final void u3() {
        y3();
        v3();
        if (!ld8.d0(this.D1)) {
            x2a x2a = this.M1;
            ju8 ju8 = this.L1;
            qra qra = (qra) ((id3) this.p1.b);
            p8g K = qra.K();
            jbf H = qra.H();
            ys7 ys7 = (ys7) qra.getAccessor().g(ys7.class);
            o20 h = qra.h();
            fa9 u = qra.u();
            ltb y = qra.y();
            m95 o = qra.o();
            hn4 n = qra.n();
            eg6 k3 = h3();
            this.N1 = new j0a(x2a, ju8, K, H, ys7, h, u, y, this, o, n, k3 == null ? true : ((ActAttachesView) k3).G0, false);
            ((View) this.M1.c).setVisibility(0);
            VideoThumbnailView videoThumbnailView = this.O1;
            if (videoThumbnailView != null) {
                videoThumbnailView.setVisibility(8);
            }
            a32 j3 = j3();
            long j = j3 != null ? j3.b.a : 0;
            z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", this.D1.q);
            this.N1.W(this.D1, j, this.C1.a, 4, false);
        }
    }

    public final void v1(long[] jArr, long[] jArr2) {
    }

    public final void v3() {
        if (this.N1 != null) {
            z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Release %s", this.D1.q);
            this.N1.I(false);
            this.N1 = null;
        }
    }

    public final void w2() {
        super.w2();
        srd srd = this.P1;
        if (srd != null) {
            srd.O(new bg6(this, 1), new bg6(this, 2));
        }
        z3();
    }

    public final void w3(boolean z) {
        VideoView videoView = this.M1.w;
        Rect rect = rcg.a;
        rcg.d(rect, videoView);
        j0a j0a = this.N1;
        if (j0a != null) {
            j0a.Q();
            j10 j = this.D1.j();
            kr7.M(j, this.N1.h(), this.N1.e(), this.N1.c());
            this.D1 = j.a();
        }
        v3();
        ((qra) ((id3) this.p1.b)).t().X.f(O1(), j3(), this.C1, this.D1, rect, !z);
        if (z) {
            b M12 = M1();
            if (M12 != null) {
                M12.finish();
                M12.overridePendingTransition(0, qcc.fullscreen_to_pip);
                return;
            }
            return;
        }
        if (((qra) ((id3) this.p1.b)).d().q()) {
            if (this.O1 != null) {
                ((qra) ((id3) this.p1.b)).d().g(this.O1);
            }
            x2a x2a = this.M1;
            if (!(x2a == null || ((View) x2a.c) == null)) {
                ((qra) ((id3) this.p1.b)).d().g((View) this.M1.c);
            }
        }
        y64.C(400, new ag6(this, 2));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [qae, java.util.Map] */
    public final void x1() {
        j0a j0a = this.N1;
        if (j0a != null) {
            j0a.j0();
            m48 m48 = (m48) this.N1.b;
            List<npf> emptyList = m48.f == null ? Collections.emptyList() : (List) m48.b.b.o;
            m48 m482 = (m48) this.N1.b;
            npf p = m482.f == null ? npf.c : m482.b.b.p();
            HashMap hashMap = new HashMap();
            for (npf npf : emptyList) {
                mpf mpf = npf.a;
                qac b = sac.b(mpf.o, mpf.v);
                hashMap.put(npf, new rac(b, b.c, b.o, b.v, 0, false));
            }
            this.I1 = new qae(0);
            for (Map.Entry entry : hashMap.entrySet()) {
                this.I1.put((npf) entry.getKey(), (rac) entry.getValue());
            }
            qac qac = p != npf.c ? ((rac) this.I1.get(p)).a : null;
            f4g f4g = ((m48) this.N1.b).f;
            if (f4g != null && !(f4g instanceof r64)) {
                boolean z = f4g instanceof k27;
            }
            VideoQualityPickerDialog.b3(new ArrayList(this.I1.values()), qac, false).Y2(N1(), "ru.ok.messages.media.attaches.fragments.FrgAttachVideo");
            N1().g0("VideoQualityPickerDialog:result:request", this, new z3g(new xvg(4), new dg6(this, hashMap), 1));
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        srd srd = this.P1;
        if (srd != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER", (ArrayList) srd.c);
        }
        ll5 ll5 = this.R1;
        if (ll5 != null) {
            long j = ll5.y;
            if (j != 0) {
                bundle.putLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", j);
            }
            if (!cvg.A(ll5.X)) {
                bundle.putString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", ll5.X);
                bundle.putBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", ll5.Y);
            }
            int i = ll5.v0;
            if (i != 0) {
                bundle.putInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", i);
            }
            long j2 = ll5.z;
            if (j2 != 0) {
                bundle.putLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", j2);
            }
            if (ll5.w0) {
                bundle.putBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", true);
            }
        }
        if (this.I1 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : this.I1.entrySet()) {
                arrayList.add((npf) entry.getKey());
                arrayList2.add(new uac((rac) entry.getValue()));
            }
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS", arrayList);
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.QUALITIES", arrayList2);
        }
    }

    public final void x3() {
        if (this.D1.i()) {
            if (!n54.f(O1())) {
                n54.N(this, n54.n(), 111);
                return;
            }
            ((qra) ((id3) this.p1.b)).c().e("EXO_VIDEO_DOWNLOAD");
            this.q1.r().u(this.C1.a, this.D1.q, new p79(9));
            this.q1.r().w(this.C1.a, this.D1.q, d20.v);
            a32 j3 = j3();
            rl d = this.q1.d();
            l20 l20 = this.D1;
            k20 k20 = l20.d;
            long j = k20.a;
            long j2 = j3.b.a;
            ha9 ha9 = this.C1.a;
            ((jna) d).W(true, j, j2, ha9.c, ha9.b, l20.q, true, k20.l);
            A3();
        }
    }

    public final void y3() {
        if (!ld8.d0(this.D1) || this.E1) {
            this.J1.setVisibility(8);
            return;
        }
        this.K1.setLevel((int) (this.D1.p * 100.0f));
        this.J1.setVisibility(0);
        VideoThumbnailView videoThumbnailView = this.O1;
        if (videoThumbnailView != null) {
            videoThumbnailView.setVisibility(0);
        }
        j0a j0a = this.N1;
        if (j0a != null && j0a.a()) {
            this.N1.b0();
        }
    }

    public final void z3() {
        if (this.N1 != null) {
            if (h3() != null) {
                eg6 k3 = h3();
                if ((k3 == null ? true : ((ActAttachesView) k3).G0) && !ld8.d0(this.D1)) {
                    this.N1.G(true);
                    return;
                }
            }
            this.N1.G(false);
        }
    }
}
