package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;

public class ActTrimVideo extends m5 implements ku8 {
    public ju8 A0;
    public q09 z0;

    public final String E() {
        return null;
    }

    public final scf K0() {
        if (this.z0 == null) {
            this.z0 = q09.f0;
        }
        return this.z0;
    }

    public final ju8 a() {
        if (this.A0 == null) {
            this.A0 = ((qra) ((id3) this.x.b)).t().q(nu8.c, new z50(true, false, false), (jv7) null);
        }
        return this.A0;
    }

    public final ju8 j() {
        z68.e("ru.ok.messages.media.trim.ActTrimVideo", "Trim is only for video");
        return ((qra) ((id3) this.x.b)).t().r(nu8.a);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y64.C(300, new b(7, (Object) this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.A0 = a();
        setContentView(ujc.act_trim_video);
        L(K0().M);
        if (bundle == null) {
            Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.VIDEO_URI");
            long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0);
            long longExtra2 = getIntent().getLongExtra("ru.ok.tamtam.extra.END_POSITION", -1);
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.MUTE", false);
            if (longExtra2 == -1) {
                longExtra2 = o5a.B(this, uri);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.VIDEO_URI", uri);
            bundle2.putLong("ru.ok.tamtam.extra.START_POSITION", longExtra);
            bundle2.putLong("ru.ok.tamtam.extra.END_POSITION", longExtra2);
            bundle2.putBoolean("ru.ok.tamtam.extra.MUTE", booleanExtra);
            FrgTrimVideo frgTrimVideo = new FrgTrimVideo();
            frgTrimVideo.L2(bundle2);
            b59.c(v(), lic.act_trim_video__container, frgTrimVideo, "ru.ok.messages.media.trim.FrgTrimVideo");
            return;
        }
        m48 m48 = (m48) this.A0;
        m48.h = bundle.getFloat(m48.b("MediaPlayerController.Volume"));
        m48.i = bundle.getBoolean(m48.b("MediaPlayerController.Looping"));
        m48.j = bundle.getBoolean(m48.b("MediaPlayerController.PlayWhenReady"));
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.A0 != null) {
            ((qra) ((id3) this.x.b)).t().w(this.A0);
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.A0 != null) {
            ((qra) ((id3) this.x.b)).t().s(this.A0);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.A0 != null) {
            ((qra) ((id3) this.x.b)).t().o(this.A0);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ju8 ju8 = this.A0;
        if (ju8 != null) {
            m48 m48 = (m48) ju8;
            bundle.putFloat(m48.b("MediaPlayerController.Volume"), m48.h);
            bundle.putBoolean(m48.b("MediaPlayerController.Looping"), m48.i);
            bundle.putBoolean(m48.b("MediaPlayerController.PlayWhenReady"), m48.j);
        }
    }

    public final ju8 p() {
        z68.e("ru.ok.messages.media.trim.ActTrimVideo", "Trim is only for video");
        return ((qra) ((id3) this.x.b)).t().r(nu8.b);
    }
}
