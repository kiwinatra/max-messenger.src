package org.webrtc.audio;

import android.media.AudioManager;
import androidx.work.WorkRequest;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    /* access modifiers changed from: private */
    public final AudioManager audioManager;
    private Timer timer;

    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        private int getStreamVolume(int i) {
            try {
                return VolumeLogger.this.audioManager.getStreamVolume(i);
            } catch (Exception unused) {
                return -1;
            }
        }

        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                Logging.d(VolumeLogger.TAG, a81.l("STREAM_RING stream volume: ", getStreamVolume(2), " (max=", this.maxRingVolume, ")"));
            } else if (mode == 3) {
                Logging.d(VolumeLogger.TAG, a81.l("VOICE_CALL stream volume: ", getStreamVolume(0), " (max=", this.maxVoiceCallVolume, ")"));
            }
        }
    }

    public VolumeLogger(AudioManager audioManager2) {
        this.audioManager = audioManager2;
    }

    public void start() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.d(TAG, "start" + threadInfo);
        if (this.timer == null) {
            String modeToString = WebRtcAudioUtils.modeToString(this.audioManager.getMode());
            Logging.d(TAG, "audio mode is: " + modeToString);
            Timer timer2 = new Timer(THREAD_NAME);
            this.timer = timer2;
            try {
                timer2.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            } catch (Exception unused) {
            }
        }
    }

    public void stop() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.d(TAG, "stop" + threadInfo);
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }
}
