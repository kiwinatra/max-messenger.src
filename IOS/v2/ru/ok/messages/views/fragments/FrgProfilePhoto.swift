package ru.ok.messages.views.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgProfilePhoto extends FrgSlideOut {
    public ImageView C1;
    public ZoomableDraweeView D1;
    public t6 E1;
    public ha9 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public long J1;

    public final String V2() {
        return "AVATAR_PHOTO";
    }

    public final void b3(int i, int i2, Intent intent) {
        if (intent != null) {
            new srd((Object) ((qra) ((id3) this.p1.b)).p(), (Object) ((qra) ((id3) this.p1.b)).y(), (Object) ((qra) ((id3) this.p1.b)).I(), (Object) ((qra) ((id3) this.p1.b)).c()).r(this, i, i2, intent, new b5(18, this));
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle != null) {
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG");
            t6 t6Var = (t6) bundle.getParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER");
            this.E1 = t6Var;
            if (t6Var != null) {
                this.H1 = true;
            }
            this.I1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID");
            this.J1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
        }
        if (!this.H1) {
            this.E1 = (t6) this.x.getParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER");
        }
        ja9 ja9 = (ja9) this.x.getParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC");
        if (ja9 != null) {
            this.F1 = ja9.a;
        }
    }

    public final void i3() {
        this.C1.setVisibility(4);
        b M1 = M1();
        b33 q1 = M1 instanceof kmf ? ((kmf) M1).q1() : null;
        if (q1 != null) {
            q1.l(this.E1.c);
        }
        this.D1.setVisibility(0);
        this.D1.setListener(new gi6(this));
        knb a = ld9.p.get();
        List<String> list = this.E1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                ba7 B = ld9.B();
                qa7 b = qa7.b(str);
                B.getClass();
                arrayList.add(new aa7(B, b, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        a.g = new se7(arrayList, true);
        a.i = true;
        a.l = this.D1.getController();
        this.D1.setController(a.a());
    }

    public final void j2(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(wjc.menu_avatar_view, menu);
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(ujc.frg_profile_photo, viewGroup, false);
        ImageView imageView = (ImageView) slideOutLayout.findViewById(lic.frg_profile_photo__progress);
        this.C1 = imageView;
        imageView.setImageDrawable(new r20(O1(), 0));
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(lic.frg_profile_photo__iv_photo);
        this.D1 = zoomableDraweeView;
        tp6 tp6 = new tp6(R1());
        tp6.l = ydd.p;
        tp6.j = new r20(O1(), 0);
        Context O1 = O1();
        int i = nad.c0;
        tp6.f = iq.E(i, -1, O1);
        tp6.h = iq.E(i, -1, O1());
        tp6.b = 0;
        zoomableDraweeView.setHierarchy(tp6.a());
        this.D1.setZoomEnabled(true);
        this.D1.setOnTouchListener(new pg6(new GestureDetector(O1(), new q00(13, this)), 1));
        i3();
        slideOutLayout.setSlideOutListener(this);
        M2(true);
        return slideOutLayout;
    }

    @SuppressLint({"CheckResult"})
    @oye
    public void onEvent(twf twf) {
        ha9 ha9 = this.F1;
        if (ha9 != null) {
            long j = twf.c;
            if (j != ha9.b) {
                return;
            }
            if (this.o1) {
                ((qra) ((id3) this.p1.b)).getClass();
                c48 q = sjd.a.q();
                q.getClass();
                c48.b(q, j, 0, true, 0, 2).j(((kbf) ((qra) ((id3) this.p1.b)).H()).c()).n(((kbf) ((qra) ((id3) this.p1.b)).H()).a()).l(new ao1(3, new gi6(this), new ip5(25)));
                return;
            }
            ryg.S(this.s1, twf, true);
        }
    }

    public final boolean s2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (X2() == null) {
                return true;
            }
            M1().finish();
            return true;
        } else if (itemId != lic.menu_avatar_view__save_to_gallery) {
            Class<s97> cls = s97.class;
            if (itemId == lic.menu_avatar_view__share) {
                if (X2() == null) {
                    return true;
                }
                long n = ((ltb) ((jna) this.q1.d()).D()).a.n();
                this.I1 = n;
                String str = this.E1.a;
                ((s97) ((qra) ((id3) this.p1.b)).getAccessor().g(cls)).a(str, new qg6(n, str, new WeakReference(this), 1));
                return true;
            } else if (itemId != lic.menu_attachments__set_as_chat_bg) {
                return true;
            } else {
                long n2 = ((ltb) ((jna) ((qra) ym.e()).e()).D()).a.n();
                this.J1 = n2;
                String str2 = this.E1.a;
                ((s97) ((qra) ((id3) this.p1.b)).getAccessor().g(cls)).a(str2, new qg6(n2, str2, new WeakReference(this), 1));
                return true;
            }
        } else if (X2() == null) {
            return true;
        } else {
            SaveToGalleryDialog.b3(this.E1.a, false).Y2(this.D0, "ru.ok.messages.views.dialogs.SaveToGalleryDialog");
            return true;
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID", this.I1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.J1);
        if (this.H1) {
            bundle.putParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER", this.E1);
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (this.G1 != hj0.a) {
            return;
        }
        if (this.o1) {
            this.C1.setVisibility(4);
            this.D1.setVisibility(0);
            this.D1.setZoomEnabled(false);
            hi7.b0(1, M1(), S1(qad.w1));
            return;
        }
        ryg.S(this.s1, hj0, true);
    }

    @oye
    public void onEvent(tr4 tr4) {
        long j = this.I1;
        long j2 = tr4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        String str = tr4.c;
        if (i == 0) {
            if (this.o1) {
                a3();
                gsg.A(M1(), new File(str), ((qra) ((id3) this.p1.b)).p());
                return;
            }
            ryg.S(hashSet, tr4, true);
        } else if (this.J1 == j2 && !TextUtils.isEmpty(str)) {
            if (this.o1) {
                a3();
                new ule(((qra) ((id3) this.p1.b)).p(), ((qra) ((id3) this.p1.b)).n(), ((qra) ((id3) this.p1.b)).y().b).a(this, str);
                return;
            }
            ryg.S(hashSet, tr4, true);
        }
    }

    @oye
    public void onEvent(vr4 vr4) {
        long j = this.I1;
        long j2 = vr4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        if (i == 0) {
            if (this.o1) {
                a3();
                hi7.b0(0, O1(), S1(qad.y9));
                return;
            }
            ryg.S(hashSet, vr4, true);
        } else if (this.J1 != j2) {
        } else {
            if (this.o1) {
                a3();
                hi7.a0(qad.V8, O1());
                return;
            }
            ryg.S(hashSet, vr4, false);
        }
    }
}
