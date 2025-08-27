package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.b;
import java.io.File;
import java.util.List;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: bg6  reason: default package */
public final /* synthetic */ class bg6 implements vla, qk3, n7c {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ bg6(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                FrgAttachVideo frgAttachVideo = this.b;
                frgAttachVideo.P1 = null;
                frgAttachVideo.a3();
                gsg.E(frgAttachVideo.O1(), (File) obj, ((qra) ((id3) frgAttachVideo.p1.b)).p());
                return;
            default:
                Throwable th = (Throwable) obj;
                FrgAttachVideo frgAttachVideo2 = this.b;
                frgAttachVideo2.P1 = null;
                frgAttachVideo2.a3();
                hi7.a0(qad.z9, frgAttachVideo2.O1());
                return;
        }
    }

    public void b() {
        srd srd = this.b.P1;
        if (srd != null) {
            jbd.c((or7) srd.o);
            for (pz a2 : (List) srd.b) {
                a2.a();
            }
        }
    }

    public iog z(View view, iog iog) {
        FrgAttachVideo frgAttachVideo = this.b;
        b M1 = frgAttachVideo.M1();
        int i = 0;
        if (M1 != null) {
            int a2 = vo4.a(frgAttachVideo.G2());
            if (M1 instanceof ActAttachesView) {
                ActAttachesView actAttachesView = (ActAttachesView) M1;
                View view2 = actAttachesView.C0;
                if (view2 != null) {
                    i = (view2.getMeasuredHeight() - actAttachesView.Q0.getMeasuredHeight()) + vo4.a(actAttachesView);
                }
            } else {
                i = a2;
            }
        }
        Rect rect = new Rect(iog.b(), iog.d(), iog.c(), iog.a() + i);
        x2a x2a = frgAttachVideo.M1;
        if (x2a != null) {
            x2a.Z(rect);
        }
        return iog;
    }
}
