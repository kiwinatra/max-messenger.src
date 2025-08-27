package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: d50  reason: default package */
public final /* synthetic */ class d50 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioListenView b;

    public /* synthetic */ d50(AudioListenView audioListenView, int i) {
        this.a = i;
        this.b = audioListenView;
    }

    public final Object invoke() {
        AudioListenView audioListenView = this.b;
        switch (this.a) {
            case 0:
                int i = AudioListenView.B0;
                return ew3.b(audioListenView.getContext(), cad.I1);
            case 1:
                int i2 = AudioListenView.B0;
                return ew3.b(audioListenView.getContext(), cad.x1);
            case 2:
                int i3 = AudioListenView.B0;
                return ew3.b(audioListenView.getContext(), cad.W0);
            default:
                return AudioListenView.a(audioListenView);
        }
    }
}
