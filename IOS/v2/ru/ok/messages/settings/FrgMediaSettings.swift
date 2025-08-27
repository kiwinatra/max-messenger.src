package ru.ok.messages.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import kotlin.TuplesKt;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.LoadMediaDialog;
import ru.ok.messages.views.dialogs.VideoCompressionModeDialog;

public class FrgMediaSettings extends FrgBaseSettings implements vx0 {
    public hq E1;
    public rh3 F1;
    public nd G1;
    public volatile String H1 = "";
    public wx0 I1;

    public final void A2(View view, Bundle bundle) {
        N1().g0("VideoCompressionModeDialog:result:request", this, new z3g((Runnable) null, new h6(3, this), 0));
    }

    public final void C(int i, Object obj) {
        if (i == lic.setting_media_gallery_auto_save) {
            this.E1.i("app.media.save.to.gallery", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_media_auto_play_gif) {
            this.E1.i("app.media.autoplay.gif", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_media_roaming) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.E1.i("app.media.load.roaming", booleanValue);
            this.G1.f("ROAMING_SWITCH", booleanValue ? "1" : "0");
            k3();
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_media_photo || i == lic.setting_media_video || i == lic.setting_media_gif || i == lic.setting_media_audio || i == lic.setting_media_stickers || i == lic.setting_media_auto_play_video) {
            LoadMediaDialog loadMediaDialog = new LoadMediaDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ok.tamtam.extra.SETTING_ID", i);
            loadMediaDialog.L2(bundle);
            loadMediaDialog.P2(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
            loadMediaDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.LoadMediaDialog");
        } else if (i == lic.setting_media_video_auto_compress) {
            VideoCompressionModeDialog videoCompressionModeDialog = new VideoCompressionModeDialog();
            videoCompressionModeDialog.L2(o54.f(TuplesKt.to("ru.ok.tamtam.extra.SETTING_ID", Integer.valueOf(i))));
            videoCompressionModeDialog.Y2(N1(), "ru.ok.messages.settings.FrgBaseSettings");
        } else if (i == lic.setting_media_caching_setting) {
            ActSettings.T(lic.setting_media_caching, O1(), false);
        }
    }

    public final void F(ArrayList arrayList) {
    }

    public final void H1() {
    }

    public final String V2() {
        return "SETTINGS_MEDIA";
    }

    public final void Y(String str) {
        this.H1 = str;
        if (this.o1) {
            k3();
        }
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 101) {
            int intExtra = intent.getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            int intExtra2 = intent.getIntExtra("ru.ok.tamtam.extra.RESULT_ITEM", -1);
            if (intExtra == lic.setting_media_photo) {
                this.E1.j(intExtra2, "app.media.load.photo");
            } else if (intExtra == lic.setting_media_gif) {
                this.E1.j(intExtra2, "app.media.load.gif");
            } else if (intExtra == lic.setting_media_audio) {
                this.E1.j(intExtra2, "app.media.load.audio");
            } else if (intExtra == lic.setting_media_stickers) {
                this.E1.j(intExtra2, "app.media.load.stickers");
            } else if (intExtra == lic.setting_media_auto_play_video) {
                this.G1.c(intExtra2, "VIDEO_AUTO_PLAY_LOAD_TYPE_CHANGE");
                this.E1.j(intExtra2, "app.video.auto.play");
            }
            k3();
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        this.E1 = ((qra) ((id3) this.p1.b)).y().c;
        ((qra) ((id3) this.p1.b)).y();
        this.F1 = (rh3) ((qra) ((id3) this.p1.b)).getAccessor().g(rh3.class);
        this.G1 = ((qra) ((id3) this.p1.b)).c();
        this.I1 = new wx0((pl5) this.q1.getAccessor().g(pl5.class), ((qra) ((id3) this.p1.b)).i(), new u13(O1()), this.q1.A(), xfd.a(), qe.a(), new lc5(19, (Object) this), this);
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fyd.b(S1(qad.G4)));
        arrayList.add(fyd.c(lic.setting_media_photo, S1(qad.X4), l3(this.E1.g.getInt("app.media.load.photo", 0), lic.setting_media_photo)));
        int i = lic.setting_media_gif;
        int i2 = qad.T4;
        arrayList.add(fyd.c(i, S1(i2), l3(this.E1.g.getInt("app.media.load.gif", 0), lic.setting_media_gif)));
        arrayList.add(fyd.c(lic.setting_media_audio, S1(qad.F4), l3(this.E1.g.getInt("app.media.load.audio", 0), lic.setting_media_audio)));
        fyd a = fyd.a(S1(qad.Y4), lic.setting_media_roaming, this.E1.m() ? S1(qad.b5) : S1(qad.a5), this.E1.m());
        a.X = true;
        arrayList.add(a);
        arrayList.add(fyd.b(S1(qad.H4)));
        fyd c = fyd.c(lic.setting_media_auto_play_video, S1(qad.Z0), l3(this.E1.g.getInt("app.video.auto.play", 1), lic.setting_media_auto_play_video));
        c.X = true;
        arrayList.add(c);
        arrayList.add(fyd.a(S1(i2), lic.setting_media_auto_play_gif, "", this.E1.g.getBoolean("app.media.autoplay.gif", true)));
        arrayList.add(fyd.b(S1(qad.Q4)));
        fyd c2 = fyd.c(lic.setting_media_video_auto_compress, S1(qad.R4), this.E1.p().a.a);
        c2.X = true;
        arrayList.add(c2);
        arrayList.add(new fyd(lic.setting_media_caching_setting, S1(qad.M4), "", this.H1, (Object) null, 1));
        return arrayList;
    }

    public final void j1() {
    }

    public final String j3() {
        return S1(qad.o4);
    }

    public final String l3(int i, int i2) {
        if (i == -1) {
            return i2 == lic.setting_media_auto_play_video ? S1(qad.I4) : S1(qad.S4);
        }
        String str = "";
        if (i != 0) {
            return i != 1 ? str : S1(qad.V4);
        }
        if (!this.E1.m() && this.F1.f()) {
            str = " " + S1(qad.Z4);
        }
        return S1(qad.D4) + str;
    }

    public final void p1() {
    }

    public final void r1() {
    }

    public final void w2() {
        super.w2();
        this.I1.b();
        ((qra) ((id3) this.p1.b)).w().f(jgd.SETTINGS_MEDIA, h8b.e);
    }
}
