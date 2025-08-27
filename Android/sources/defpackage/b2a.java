package defpackage;

import android.content.Intent;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: b2a  reason: default package */
public final /* synthetic */ class b2a implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2a b;

    public /* synthetic */ b2a(c2a c2a, int i) {
        this.a = i;
        this.b = c2a;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                c2a c2a = this.b;
                long f = ((m48) c2a.v).f();
                c2a.z = f;
                if (f > c2a.y) {
                    c2a.Y();
                    return;
                } else {
                    ((m4a) c2a.a).w0.setPointerPosition(f);
                    return;
                }
            default:
                c2a c2a2 = this.b;
                long j = c2a2.x;
                long j2 = c2a2.y;
                FrgTrimVideo frgTrimVideo = c2a2.b;
                frgTrimVideo.getClass();
                Intent intent = new Intent();
                intent.putExtra("ru.ok.tamtam.extra.START_POSITION", j);
                intent.putExtra("ru.ok.tamtam.extra.END_POSITION", j2);
                intent.putExtra("ru.ok.tamtam.extra.THUMBNAIL_URI", (String) obj);
                frgTrimVideo.X2().setResult(-1, intent);
                frgTrimVideo.h3();
                frgTrimVideo.U2();
                return;
        }
    }
}
