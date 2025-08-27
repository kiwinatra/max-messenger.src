package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class LoadMediaDialog extends DialogFragment {
    public final Dialog V2(Bundle bundle) {
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        int i = F2().getInt("ru.ok.tamtam.extra.SETTING_ID");
        if (i == lic.setting_media_photo) {
            cg8.q(S1(qad.W4));
        } else if (i == lic.setting_media_video) {
            cg8.q(S1(qad.d5));
        } else if (i == lic.setting_media_gif) {
            cg8.q(S1(qad.U4));
        } else if (i == lic.setting_media_audio) {
            cg8.q(S1(qad.E4));
        } else if (i == lic.setting_media_stickers) {
            cg8.q(S1(qad.c5));
        } else if (i == lic.setting_media_auto_play_video) {
            cg8.q(S1(qad.J4));
        }
        cg8.h(new CharSequence[]{S1(qad.D4), S1(qad.V4), i == lic.setting_media_auto_play_video ? S1(qad.I4) : S1(qad.S4)}, new d10(16, (Object) this));
        return cg8.g();
    }
}
