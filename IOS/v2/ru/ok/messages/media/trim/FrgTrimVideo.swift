package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgTrimVideo extends FrgBase {
    public MediaMetadataRetriever B1;
    public c2a C1;
    public Uri D1;

    public final String V2() {
        return "TRIM_VIDEO";
    }

    public final boolean d3() {
        h3();
        return false;
    }

    public final void h3() {
        MediaMetadataRetriever mediaMetadataRetriever = this.B1;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                z68.f("ru.ok.messages.media.trim.FrgTrimVideo", "fail to release", th);
            }
            this.B1 = null;
        }
        c2a c2a = this.C1;
        if (c2a != null) {
            ((m4a) c2a.a).z.b();
            m48 m48 = (m48) c2a.v;
            if (m48.g == c2a) {
                m48.v();
                m48.e = null;
                m48.s((Surface) null);
                m48.g = null;
            }
            jbd.c(c2a.Z);
            c2a.Z = null;
            jbd.c(c2a.Y);
            c2a.Y = null;
            this.C1 = null;
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        this.D1 = (Uri) this.x.getParcelable("ru.ok.tamtam.extra.VIDEO_URI");
        ((ActTrimVideo) M1()).M((View.OnSystemUiVisibilityChangeListener) null);
        m4a m4a = new m4a(layoutInflater.getContext(), viewGroup, this, new fj((a) this), this, ((qra) ((id3) this.p1.b)).d());
        m4a m4a2 = m4a;
        String str = "ru.ok.tamtam.extra.END_POSITION";
        c2a c2a = new c2a(m4a, this, ((qra) ((id3) this.p1.b)).c(), this.D1.toString(), ((ku8) M1()).a(), this.x.getLong("ru.ok.tamtam.extra.START_POSITION", 0), this.x.getLong("ru.ok.tamtam.extra.END_POSITION", 0), this.x.getBoolean("ru.ok.tamtam.extra.MUTE"));
        this.C1 = c2a;
        if (bundle2 != null) {
            c2a.z = bundle2.getLong("ru.ok.tamtam.extra.POINTER_POSITION");
            c2a.x = bundle2.getLong("ru.ok.tamtam.extra.START_POSITION");
            long j = bundle2.getLong(str);
            c2a.y = j;
            m4a2.Z(c2a.z, c2a.x, j, c2a.w);
            c2a.a0();
        }
        return (View) m4a2.c;
    }

    public final void l2() {
        super.l2();
        h3();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        c2a c2a = this.C1;
        ((m4a) c2a.a).Z(c2a.z, c2a.x, c2a.y, c2a.w);
    }

    public final void t2() {
        super.t2();
        c2a c2a = this.C1;
        if (c2a != null) {
            c2a.W();
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        c2a c2a = this.C1;
        if (c2a != null) {
            bundle.putLong("ru.ok.tamtam.extra.POINTER_POSITION", c2a.z);
            bundle.putLong("ru.ok.tamtam.extra.START_POSITION", c2a.x);
            bundle.putLong("ru.ok.tamtam.extra.END_POSITION", c2a.y);
        }
    }
}
