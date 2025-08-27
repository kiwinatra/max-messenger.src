package defpackage;

import android.content.Context;

/* renamed from: pid  reason: default package */
public abstract class pid extends y2 implements fq {
    public final om0 h = om0.I(Float.valueOf(this.g.getFloat("app.extra.text.size.sp", c44.DEFAULT_ASPECT_RATIO)));
    public final om0 i = om0.I(Integer.valueOf(d("app.extra.text.size.mode", 1)));
    public final om0 j = om0.I(Integer.valueOf(o()));
    public final om0 k = om0.I(Integer.valueOf(n()));

    public pid(Context context, fn5 fn5) {
        super(context, "app.prefs", fn5);
    }

    public static String t(int i2) {
        return i2 != 1 ? i2 != 2 ? "ON" : "REPLY" : "OFF";
    }

    public final boolean m() {
        return this.g.getBoolean("app.media.load.roaming", false);
    }

    public final int n() {
        return d("app.notification.chats.show", 0);
    }

    public final int o() {
        return d("app.notification.dialogs.show", 0);
    }

    public final y3g p() {
        String string = this.g.getString("app.media.video.compress", (String) null);
        return string == null ? y3g.OPTIMAL : y3g.valueOf(string);
    }

    public final boolean q() {
        return this.g.getBoolean("audio.transcription.enabled", true);
    }

    public final boolean r() {
        return this.g.getBoolean("app.privacy.safe_mode", false);
    }

    public final void s(int i2) {
        j(i2, "app.notification.chats.show");
        if (i2 != 1) {
            j(i2, "app.notification.chats.show.last");
        }
        this.k.d(Integer.valueOf(i2));
    }
}
