package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Locale;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

public class FrgDlgAudioTracksPicker extends FrgDlgChecked<FrgAttachVideo> {
    public ArrayList F1;

    public final Dialog V2(Bundle bundle) {
        cg8 cg8 = new cg8(G2());
        cg8.q(S1(qad.x));
        this.F1 = F2().getParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS");
        mpf mpf = (mpf) F2().getParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK");
        Locale u = ((qra) ym.e()).y().a.u();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 = 0; i2 < this.F1.size(); i2++) {
            mpf mpf2 = (mpf) this.F1.get(i2);
            String str = mpf2.b;
            String str2 = mpf2.c;
            String str3 = null;
            if (!cvg.A(str2) && !"und".equals(str2)) {
                str3 = ghf.e(new Locale(str2).getDisplayLanguage(u));
            }
            if (cvg.A(str)) {
                str = str3;
            } else if (!cvg.A(str3)) {
                str = str + "(" + str3 + ")";
            }
            boolean A = cvg.A(str);
            int i3 = mpf2.y;
            if (A) {
                str = T1(qad.w, Integer.valueOf(i3 + 1));
            }
            arrayList.add(str);
            if (i3 == mpf.y && mpf2.z == mpf.z) {
                i = i2;
            }
        }
        cg8.p((CharSequence[]) arrayList.toArray(new CharSequence[0]), i, new d10(2, (Object) this));
        cg8.m(S1(qad.m0), new e10(1));
        return cg8.g();
    }

    public final Class c3() {
        return FrgAttachVideo.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker";
    }
}
