package defpackage;

import android.view.View;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: dk8  reason: default package */
public final /* synthetic */ class dk8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPreviewLayout b;

    public /* synthetic */ dk8(MediaBarPreviewLayout mediaBarPreviewLayout, int i) {
        this.a = i;
        this.b = mediaBarPreviewLayout;
    }

    public final void onClick(View view) {
        int i = 1;
        MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
        switch (this.a) {
            case 0:
                if (mediaBarPreviewLayout.R0 != null) {
                    if (mediaBarPreviewLayout.V0) {
                        cud cud = mediaBarPreviewLayout.U0.b;
                        cud.getClass();
                        int r = (int) cud.r(PmsKey.f60maxattachcount, (long) 12);
                        if (mediaBarPreviewLayout.P0.f.c() > r) {
                            hi7.b0(0, mediaBarPreviewLayout.getContext(), ghf.s(pad.f, r, mediaBarPreviewLayout.getContext()));
                            return;
                        }
                    }
                    mediaBarPreviewLayout.R0.n();
                    return;
                }
                return;
            case 1:
                int i2 = MediaBarPreviewLayout.Z0;
                sqd sqd = mediaBarPreviewLayout.P0.f;
                sqd.s(sqd.k == 2 ? 1 : 2);
                mediaBarPreviewLayout.L();
                sqd sqd2 = mediaBarPreviewLayout.P0.f;
                if (sqd2.k == 2) {
                    mediaBarPreviewLayout.P(sqd2.c() > 1 ? qad.L8 : qad.K8);
                    return;
                } else {
                    mediaBarPreviewLayout.P(qad.M8);
                    return;
                }
            case 2:
                int i3 = MediaBarPreviewLayout.Z0;
                sqd sqd3 = mediaBarPreviewLayout.P0.f;
                if (sqd3.k != 3) {
                    i = 3;
                }
                sqd3.s(i);
                mediaBarPreviewLayout.L();
                if (mediaBarPreviewLayout.P0.f.k == 3) {
                    mediaBarPreviewLayout.P(qad.J8);
                    return;
                } else {
                    mediaBarPreviewLayout.P(qad.O8);
                    return;
                }
            default:
                sqd sqd4 = mediaBarPreviewLayout.P0.f;
                sqd4.a.clear();
                sqd4.p();
                fk8 fk8 = mediaBarPreviewLayout.R0;
                if (fk8 != null) {
                    fk8.e();
                }
                mediaBarPreviewLayout.Q0.m();
                return;
        }
    }
}
