package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: e50  reason: default package */
public final /* synthetic */ class e50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioListenView b;

    public /* synthetic */ e50(AudioListenView audioListenView, int i) {
        this.a = i;
        this.b = audioListenView;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f50 f50 = this.b.x;
                if (f50 != null) {
                    s60 s60 = (s60) f50;
                    if (s60.m()) {
                        s60.c.B();
                    }
                    s60.a();
                    s60.e();
                    return;
                }
                return;
            case 1:
                f50 f502 = this.b.x;
                if (f502 != null) {
                    s60 s602 = (s60) f502;
                    xy9 xy9 = s602.i;
                    xy9.getClass();
                    ev0.v(xy9.j, (CoroutineContext) null, (f14) null, new uy9(xy9, 1.0f, (Continuation) null), 3);
                    s602.d();
                    boolean m = s602.m();
                    f40 f40 = s602.c;
                    if (m) {
                        f40.s();
                        s602.r(false);
                        return;
                    }
                    long g = s602.g();
                    if (g == -1 || !f40.o(g)) {
                        if (s602.n == null) {
                            System.currentTimeMillis();
                            s602.i();
                            long j = s602.w;
                            xy9 xy92 = f40.c;
                            ev0.v(xy92.j, ((osa) xy92.c).b(), (f14) null, new sy9(j, xy92, (Continuation) null), 2);
                        } else {
                            System.currentTimeMillis();
                            l20 l20 = s602.n;
                            xy9 xy93 = f40.c;
                            ev0.v(xy93.j, ((osa) xy93.c).b(), (f14) null, new qy9(xy93, s602.q, l20, (Continuation) null), 2);
                        }
                        s602.r(true);
                        return;
                    }
                    f40.u();
                    s602.r(true);
                    return;
                }
                return;
            default:
                f50 f503 = this.b.x;
                if (f503 != null) {
                    s60 s603 = (s60) f503;
                    s603.d.h(s603.x, "ACTION_AUDIO_RECORD_REGULAR_SEND");
                    s603.a();
                    s603.q();
                    return;
                }
                return;
        }
    }
}
