package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.dialogs.ProgressDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgAttachPhoto extends FrgAttachView implements r00, jb9, d2a {
    public FrameLayout I1;
    public AttachPhotoView J1;
    public o0a K1;
    public int L1 = 0;
    public srd M1;
    public int N1;

    public final void A1(int i) {
        this.J1.setWrapContentMeasure(true);
        super.A1(i);
    }

    public final void D0() {
    }

    public final void I0() {
    }

    public final void W0(Throwable th) {
        if (th.getCause() != null && (th.getCause() instanceof FileDataSource$FileDataSourceException)) {
            int i = this.L1 + 1;
            this.L1 = i;
            View view = this.S0;
            if (view != null) {
                if (i > 2) {
                    view.post(new zf6(this, 0));
                    return;
                }
                File k = ((po5) this.q1.m()).k(this.D1.b.y);
                File n = ((po5) this.q1.m()).n(this.D1.b.X);
                if (k.delete() || n.delete()) {
                    view.post(new zf6(this, 1));
                }
            }
        }
    }

    public final void b3(int i, int i2, Intent intent) {
        if (intent != null) {
            new srd((Object) ((qra) ((id3) this.p1.b)).p(), (Object) ((qra) ((id3) this.p1.b)).y(), (Object) ((qra) ((id3) this.p1.b)).I(), (Object) ((qra) ((id3) this.p1.b)).c()).r(this, i, i2, intent, new xf6(this, 0));
        }
    }

    public final boolean d3() {
        this.J1.getZoomableController().reset();
        this.J1.setWrapContentMeasure(true);
        return false;
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        o3();
    }

    public final void j2(Menu menu, MenuInflater menuInflater) {
        if (!this.C1.a.v() && !this.x.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            menu.clear();
            menuInflater.inflate(wjc.menu_attach_photo, menu);
            iq.g(this.r1, menu, (Integer) null);
            boolean A = this.C1.a.A();
            boolean E = this.C1.a.E();
            boolean z = true;
            boolean z2 = this.D1.f() && this.D1.b.v;
            a32 j3 = j3();
            b33 q1 = q1();
            if (q1 != null) {
                MenuItem b = q1.b(lic.menu_attachments__open_in);
                if (b != null && !A) {
                    b.setVisible(false);
                }
                MenuItem b2 = q1.b(lic.menu_attachments__save_to_gallery);
                if (b2 != null && A) {
                    b2.setVisible(false);
                }
                MenuItem b3 = q1.b(lic.menu_attachments__open_all_media);
                if (b3 != null && (E || A || j3 == null)) {
                    b3.setVisible(false);
                }
                MenuItem b4 = q1.b(lic.menu_attachments__go_to_message);
                if (b4 != null) {
                    if (j3 == null) {
                        z = false;
                    }
                    b4.setVisible(z);
                }
                MenuItem b5 = q1.b(lic.menu_attachments__set_as_chat_bg);
                if (b5 != null && z2) {
                    b5.setVisible(false);
                }
                MenuItem b6 = q1.b(lic.menu_attachments__rotate_screen);
                if (b6 != null) {
                    Context O1 = O1();
                    if (O1 != null) {
                        Settings.System.getInt(O1.getContentResolver(), "accelerometer_rotation", 0);
                    }
                    b6.setVisible(false);
                }
                MenuItem b7 = q1.b(lic.menu_attachments__send_photo);
                if (z2) {
                    b7.setTitle(qad.F8);
                } else {
                    b7.setTitle(qad.Q8);
                }
            }
            super.j2(menu, menuInflater);
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(ujc.frg_photo_view, viewGroup, false);
        this.I1 = (FrameLayout) inflate.findViewById(lic.frg_photo_view__fl_photo);
        this.J1 = (AttachPhotoView) inflate.findViewById(lic.frg_photo_view__iv_photo);
        boolean z = this.E1 && ryg.j0(this.C1.a.x0);
        AttachPhotoView attachPhotoView = this.J1;
        a32 j3 = j3();
        l20 l20 = this.D1;
        a89 a89 = this.C1;
        attachPhotoView.L0 = this.G1;
        attachPhotoView.M0 = z;
        attachPhotoView.P0 = j3;
        attachPhotoView.r(l20, a89);
        this.J1.setListener(this);
        this.J1.setZoomEnabled(true);
        p3((SlideOutLayout) inflate, this.J1);
        if (this.E1) {
            this.J1.setWrapContentMeasure(true);
        }
        if (bundle != null) {
            this.L1 = bundle.getInt("ru.ok.tamtam.extra.GIF_ERRORS_COUNT", 0);
            this.M1 = hi7.W(((qra) ym.e()).g(), bundle, "ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER");
            if (bundle.containsKey("ru.ok.tamtam.extra.DOWNLOAD_ACTION")) {
                String string = bundle.getString("ru.ok.tamtam.extra.DOWNLOAD_ACTION");
                if (string != null) {
                    if (string.equals("SET_AS_BG")) {
                        i = 1;
                    } else if (string.equals("SHARE")) {
                        i = 2;
                    } else if (string.equals("OPEN")) {
                        i = 3;
                    } else {
                        throw new IllegalArgumentException("No enum constant ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.DownloadAction.".concat(string));
                    }
                    this.N1 = i;
                } else {
                    throw new NullPointerException("Name is null");
                }
            }
        }
        y64.n(inflate, new xf6(this, 2));
        return inflate;
    }

    public final void l2() {
        super.l2();
        o0a o0a = this.K1;
        if (o0a != null) {
            o0a.I(false);
            this.K1 = null;
        }
    }

    public final void m() {
        t3(false);
    }

    public final void n3(boolean z) {
        if (!this.E1) {
            z68.a("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "setUserVisibleHintExtended: " + z);
            if (z) {
                u3(false);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        this.J1.getZoomableController().reset();
    }

    @oye
    public void onEvent(tr4 tr4) {
        if (this.o1 && this.U0 && this.D1.f() && TextUtils.equals(this.D1.b.z, tr4.b)) {
            v3();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r0.endsWith(".mp4") == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s2(android.view.MenuItem r5) {
        /*
            r4 = this;
            int r5 = r5.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            r1 = 1
            if (r5 != r0) goto L_0x0035
            ru.ok.messages.media.attaches.AttachPhotoView r5 = r4.J1
            bsg r5 = r5.getZoomableController()
            r5.reset()
            boolean r5 = r4.F1
            if (r5 == 0) goto L_0x0030
            ru.ok.messages.media.attaches.AttachPhotoView r5 = r4.J1
            r5.setWrapContentMeasure(r1)
            m5 r4 = r4.X2()
            boolean r5 = r4 instanceof ru.ok.messages.media.attaches.ActAttachesView
            if (r5 == 0) goto L_0x0029
            r4.onBackPressed()
            goto L_0x0125
        L_0x0029:
            if (r4 == 0) goto L_0x0125
            defpackage.l8.a(r4)
            goto L_0x0125
        L_0x0030:
            r4.U2()
            goto L_0x0125
        L_0x0035:
            int r0 = defpackage.lic.menu_attachments__save_to_gallery
            if (r5 != r0) goto L_0x0085
            m5 r5 = r4.X2()
            if (r5 == 0) goto L_0x0125
            l20 r5 = r4.D1
            java.lang.String r0 = r5.r
            x10 r5 = r5.b
            java.lang.String r5 = r5.a()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x005a
            int r2 = defpackage.cjf.g
            java.lang.String r2 = ".mp4"
            boolean r2 = r0.endsWith(r2)
            if (r2 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r0 = r5
        L_0x005b:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0070
            android.content.Context r5 = r4.O1()
            int r0 = defpackage.qad.t8
            java.lang.String r4 = r4.S1(r0)
            r0 = 0
            defpackage.hi7.b0(r0, r5, r4)
            return r1
        L_0x0070:
            l20 r5 = r4.D1
            x10 r5 = r5.b
            boolean r5 = r5.v
            ru.ok.messages.views.dialogs.SaveToGalleryDialog r5 = ru.ok.messages.views.dialogs.SaveToGalleryDialog.b3(r0, r5)
            androidx.fragment.app.c r4 = r4.Q1()
            java.lang.String r0 = "ru.ok.messages.views.dialogs.SaveToGalleryDialog"
            r5.Y2(r4, r0)
            goto L_0x0125
        L_0x0085:
            int r0 = defpackage.lic.menu_attachments__open_in
            if (r5 != r0) goto L_0x008f
            r5 = 3
            r4.s3(r5)
            goto L_0x0125
        L_0x008f:
            int r0 = defpackage.lic.menu_attachments__set_as_chat_bg
            if (r5 != r0) goto L_0x0098
            r4.s3(r1)
            goto L_0x0125
        L_0x0098:
            int r0 = defpackage.lic.menu_attachments__forward
            r2 = 0
            if (r5 != r0) goto L_0x00af
            eg6 r5 = r4.h3()
            if (r5 == 0) goto L_0x0125
            a89 r4 = r4.C1
            ru.ok.messages.media.attaches.ActAttachesView r5 = (ru.ok.messages.media.attaches.ActAttachesView) r5
            sd3 r5 = r5.R0
            r5.i(r4, r2)
            goto L_0x0125
        L_0x00af:
            int r0 = defpackage.lic.menu_attachments__open_all_media
            if (r5 != r0) goto L_0x00c4
            androidx.fragment.app.b r5 = r4.M1()
            a89 r0 = r4.C1
            ha9 r0 = r0.a
            long r2 = r0.z
            defpackage.r5.T(r5, r2)
            r4.U2()
            goto L_0x0125
        L_0x00c4:
            int r0 = defpackage.lic.menu_attachments__share
            if (r5 != r0) goto L_0x00cd
            r5 = 2
            r4.s3(r5)
            goto L_0x0125
        L_0x00cd:
            int r0 = defpackage.lic.menu_attachments__go_to_message
            if (r5 != r0) goto L_0x00ed
            m5 r5 = r4.X2()
            if (r5 == 0) goto L_0x0125
            a89 r4 = r4.C1
            ha9 r4 = r4.a
            long r2 = r4.z
            t5 r0 = new t5
            r0.<init>(r2)
            long r2 = r4.o
            r0.d = r2
            defpackage.q5.T(r5, r0)
            r5.finish()
            goto L_0x0125
        L_0x00ed:
            int r0 = defpackage.lic.menu_attachments__rotate_screen
            if (r5 != r0) goto L_0x00f5
            r4.q3()
            goto L_0x0125
        L_0x00f5:
            int r0 = defpackage.lic.menu_attachments__send_photo
            if (r5 != r0) goto L_0x0125
            eg6 r5 = r4.h3()
            if (r5 == 0) goto L_0x0125
            l20 r0 = r4.D1
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x010e
            l20 r0 = r4.D1
            x10 r0 = r0.b
            long r2 = r0.y
            goto L_0x011c
        L_0x010e:
            l20 r0 = r4.D1
            boolean r0 = defpackage.ld8.W(r0)
            if (r0 == 0) goto L_0x011c
            l20 r0 = r4.D1
            s10 r0 = r0.j
            long r2 = r0.a
        L_0x011c:
            a89 r4 = r4.C1
            ru.ok.messages.media.attaches.ActAttachesView r5 = (ru.ok.messages.media.attaches.ActAttachesView) r5
            sd3 r5 = r5.R0
            r5.i(r4, r2)
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.s2(android.view.MenuItem):boolean");
    }

    public final void s3(int i) {
        ProgressDialog f3 = f3(qad.B1, true);
        if (f3 != null) {
            f3.F1 = new lc5(16, (Object) this);
            srd a = ((qra) ym.e()).g().a(this.D1);
            this.M1 = a;
            this.N1 = i;
            a.O(new yf6(this, i, 0), new yf6(this, i, 1));
        }
    }

    public final void t2() {
        super.t2();
        srd srd = this.M1;
        if (srd != null) {
            jbd.c((or7) srd.o);
        }
    }

    public final void t3(boolean z) {
        if (z) {
            ((qra) ((id3) this.p1.b)).u().v(this.C1.a, this.D1);
        } else if (h3() != null) {
            ((ActAttachesView) h3()).c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [odf, java.lang.Object] */
    public final void u3(boolean z) {
        File file;
        if (this.D1.f()) {
            l20 l20 = this.D1;
            if (l20.b.v && !ld8.g0(l20, this.C1)) {
                if (!TextUtils.isEmpty(this.D1.b.X)) {
                    file = ((po5) this.q1.m()).n(this.D1.b.X);
                } else {
                    file = null;
                }
                if (file == null || !file.exists()) {
                    file = ((po5) this.q1.m()).k(this.D1.b.y);
                }
                if (this.D1.n.c() && file.exists()) {
                    z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif exists start play", new Object[0]);
                    v3();
                } else if ((z || this.q1.h().c(true)) && !this.D1.n.d()) {
                    z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists start download", new Object[0]);
                    this.q1.r().w(this.C1.a, this.D1.q, d20.v);
                    l20 l202 = this.D1;
                    long j = this.C1.a.b;
                    ? obj = new Object();
                    obj.a = j;
                    obj.b = l202.q;
                    x10 x10 = l202.b;
                    obj.e = x10.y;
                    obj.g = x10.z;
                    obj.h = true;
                    ((uk5) this.q1.getAccessor().g(uk5.class)).a(new pdf(obj));
                } else {
                    z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists, do nothing, autoload disabled or loading in progress", new Object[0]);
                }
            }
        }
    }

    public final void v1(long[] jArr, long[] jArr2) {
    }

    public final void v3() {
        z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "playGif", new Object[0]);
        m5 X2 = X2();
        if (X2 != null) {
            o0a o0a = this.K1;
            if (o0a != null) {
                o0a.I(false);
                this.K1 = null;
            }
            ju8 j = ((ku8) M1()).j();
            u3a u3a = new u3a(X2, (float[]) null);
            this.K1 = new o0a(u3a, j, ((qra) ((id3) this.p1.b)).p(), this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.I1.addView((View) u3a.c, layoutParams);
            o0a o0a2 = this.K1;
            sr6 sr6 = new sr6(o0a2.c, this.D1);
            o0a2.v = sr6;
            ((m48) o0a2.b).t(sr6, o0a2);
            ((o4a) o0a2.a).i(o0a2);
        }
    }

    public final void w2() {
        super.w2();
        int i = this.N1;
        srd srd = this.M1;
        if (srd != null) {
            this.N1 = i;
            srd.O(new yf6(this, i, 0), new yf6(this, i, 1));
        }
    }

    public final void x2(Bundle bundle) {
        String str;
        super.x2(bundle);
        bundle.putInt("ru.ok.tamtam.extra.GIF_ERRORS_COUNT", this.L1);
        srd srd = this.M1;
        if (srd != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER", (ArrayList) srd.c);
        }
        int i = this.N1;
        if (i != 0) {
            if (i == 1) {
                str = "SET_AS_BG";
            } else if (i == 2) {
                str = "SHARE";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                throw null;
            }
            bundle.putString("ru.ok.tamtam.extra.DOWNLOAD_ACTION", str);
        }
    }

    @oye
    public void onEvent(twf twf) {
        if (this.o1 && twf.c == this.C1.a.b) {
            l3(twf, new xf6(this, 1));
        }
    }
}
