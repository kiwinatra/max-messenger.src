package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* renamed from: p70  reason: default package */
public final class p70 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ q70 a;

    public p70(q70 q70) {
        this.a = q70;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            q70 q70 = this.a;
            if (clientAudioSessionId == q70.a.getAudioSessionId()) {
                q70.d(audioRecordingConfiguration.isClientSilenced());
                return;
            }
        }
    }
}
