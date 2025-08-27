package defpackage;

import ru.ok.messages.media.audio.AudioRecordView;

/* renamed from: v60  reason: default package */
public final /* synthetic */ class v60 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRecordView b;

    public /* synthetic */ v60(AudioRecordView audioRecordView, int i) {
        this.a = i;
        this.b = audioRecordView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                x60 x60 = this.b.F0;
                if (x60 != null) {
                    ((s60) x60).n();
                    return;
                }
                return;
            case 1:
                x60 x602 = this.b.F0;
                if (x602 != null) {
                    s60 s60 = (s60) x602;
                    r60 r60 = s60.m;
                    if (r60 == r60.b || r60 == r60.a) {
                        s60.u(true, true);
                        s60.d.e("ACTION_AUDIO_RECORD_REGULAR_STOP");
                        return;
                    }
                    return;
                }
                return;
            default:
                x60 x603 = this.b.F0;
                if (x603 != null) {
                    ((s60) x603).n();
                    return;
                }
                return;
        }
    }
}
