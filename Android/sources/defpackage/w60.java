package defpackage;

import android.view.animation.Animation;
import ru.ok.messages.media.audio.AudioRecordView;

/* renamed from: w60  reason: default package */
public final class w60 extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ AudioRecordView i;

    public /* synthetic */ w60(AudioRecordView audioRecordView, int i2) {
        this.h = i2;
        this.i = audioRecordView;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                AudioRecordView audioRecordView = this.i;
                audioRecordView.L0.setVisibility(8);
                audioRecordView.setVisibility(8);
                return;
            default:
                AudioRecordView audioRecordView2 = this.i;
                audioRecordView2.P0.setAnimation((Animation) null);
                audioRecordView2.P0.setVisibility(8);
                audioRecordView2.L();
                return;
        }
    }
}
