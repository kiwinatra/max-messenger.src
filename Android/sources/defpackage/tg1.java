package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: tg1  reason: default package */
public final class tg1 {
    public static final long[] h = {500, 535, 458, 535, 825};
    public final Context a;
    public final sg1 b;
    public final bud c;
    public final Lazy d = LazyKt.lazy(new rg1(this, 0));
    public final Lazy e = LazyKt.lazy(new rg1(this, 1));
    public final Lazy f = LazyKt.lazy(new rg1(this, 2));
    public MediaPlayer g;

    public tg1(Context context, sg1 sg1, bud bud) {
        this.a = context;
        this.b = sg1;
        this.c = bud;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, android.media.MediaPlayer$OnPreparedListener] */
    public final void a(y35 y35, boolean z) {
        z68.c("RingtoneManagerTag", " start ringtone", new Object[0]);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z68.c("RingtoneManagerTag", " stop ringtone", new Object[0]);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                MediaPlayer mediaPlayer = this.g;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                this.g = null;
                try {
                    c();
                    MediaPlayer mediaPlayer2 = new MediaPlayer();
                    Context context = this.a;
                    Integer num = (Integer) y35.b;
                    if (num != null) {
                        try {
                            mediaPlayer2.setDataSource(context.getResources().openRawResourceFd(num.intValue()));
                        } catch (IOException e2) {
                            z68.h("RingtoneManagerTag", e2, e2.getMessage(), new Object[0]);
                        }
                    }
                    mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(0).build());
                    mediaPlayer2.setLooping(z);
                    mediaPlayer2.setOnPreparedListener(new Object());
                    mediaPlayer2.setOnCompletionListener(new qg1(z, this));
                    mediaPlayer2.prepareAsync();
                    this.g = mediaPlayer2;
                } catch (IOException e3) {
                    z68.f("RingtoneManagerTag", "Got error during init player", e3);
                }
            } else {
                throw new IllegalStateException("Main (UI) thread expected".toString());
            }
        } else {
            throw new IllegalStateException("Main (UI) thread expected".toString());
        }
    }

    public final void b() {
        z68.c("RingtoneManagerTag", " startVibrate", new Object[0]);
        Lazy lazy = this.e;
        if (((Vibrator) lazy.getValue()).hasVibrator()) {
            ((Vibrator) lazy.getValue()).cancel();
            ((Vibrator) lazy.getValue()).vibrate(VibrationEffect.createWaveform(h, 0), new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
        }
    }

    public final void c() {
        z68.c("RingtoneManagerTag", " stop all", new Object[0]);
        z68.c("RingtoneManagerTag", " stop ringtone", new Object[0]);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            this.g = null;
            z68.c("RingtoneManagerTag", " stopVibrate", new Object[0]);
            ((Vibrator) this.e.getValue()).cancel();
            return;
        }
        throw new IllegalStateException("Main (UI) thread expected".toString());
    }
}
