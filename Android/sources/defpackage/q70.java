package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q70  reason: default package */
public final class q70 implements o70 {
    public static final long m = TimeUnit.MILLISECONDS.toNanos(500);
    public static final /* synthetic */ int n = 0;
    public AudioRecord a;
    public final y90 b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference((Object) null);
    public final int f;
    public final int g;
    public b8d h;
    public Executor i;
    public long j;
    public p70 k;
    public boolean l = false;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q70(defpackage.y90 r10, android.content.Context r11) {
        /*
            r9 = this;
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r9.c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r9.d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r0.<init>(r2)
            r9.e = r0
            r9.l = r1
            int r0 = r10.b
            r3 = 12
            r4 = 16
            r5 = 1
            int r6 = r10.c
            int r7 = r10.d
            if (r0 <= 0) goto L_0x0039
            if (r6 > 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            if (r6 != r5) goto L_0x0030
            r8 = r4
            goto L_0x0031
        L_0x0030:
            r8 = r3
        L_0x0031:
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r8, r7)
            if (r0 <= 0) goto L_0x0039
            r0 = r5
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            int r8 = r10.b
            if (r0 == 0) goto L_0x006f
            r9.b = r10
            int r0 = r10.a()
            r9.g = r0
            if (r6 != r5) goto L_0x0049
            r3 = r4
        L_0x0049:
            int r0 = android.media.AudioRecord.getMinBufferSize(r8, r3, r7)
            if (r0 <= 0) goto L_0x0050
            r1 = r5
        L_0x0050:
            defpackage.bs0.r(r2, r1)
            int r0 = r0 * 2
            r9.f = r0
            android.media.AudioRecord r10 = c(r0, r10, r11)
            r9.a = r10
            int r9 = r10.getState()
            if (r9 != r5) goto L_0x0064
            return
        L_0x0064:
            r10.release()
            androidx.camera.video.internal.audio.AudioStream$AudioStreamException r9 = new androidx.camera.video.internal.audio.AudioStream$AudioStreamException
            java.lang.String r10 = "Unable to initialize AudioRecord"
            r9.<init>(r10)
            throw r9
        L_0x006f:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r0}
            java.lang.String r11 = "The combination of sample rate %d, channel count %d and audio format %d is not supported."
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q70.<init>(y90, android.content.Context):void");
    }

    public static AudioRecord c(int i2, y90 y90, Context context) {
        int i3 = Build.VERSION.SDK_INT;
        AudioFormat build = new AudioFormat.Builder().setSampleRate(y90.b).setChannelMask(y90.c == 1 ? 16 : 12).setEncoding(y90.d).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i3 >= 31 && context != null) {
            ul.c(builder, context);
        }
        builder.setAudioSource(y90.a);
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i2);
        return builder.build();
    }

    public final void a(b8d b8d, tsd tsd) {
        bs0.r("AudioStream can not be started when setCallback.", !this.d.get());
        b();
        this.h = b8d;
        this.i = tsd;
        p70 p70 = this.k;
        if (p70 != null) {
            this.a.unregisterAudioRecordingCallback(p70);
        }
        if (this.k == null) {
            this.k = new p70(this);
        }
        this.a.registerAudioRecordingCallback(tsd, this.k);
    }

    public final void b() {
        bs0.r("AudioStream has been released.", !this.c.get());
    }

    public final void d(boolean z) {
        Executor executor = this.i;
        b8d b8d = this.h;
        if (executor != null && b8d != null && !Objects.equals(this.e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            executor.execute(new c70((Object) b8d, z, 3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ba0 read(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.b()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            defpackage.bs0.r(r1, r0)
            android.media.AudioRecord r0 = r13.a
            int r1 = r13.f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L_0x0086
            r14.limit(r0)
            boolean r14 = r13.l
            r3 = -1
            if (r14 != 0) goto L_0x0071
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.a
            r6 = 0
            int r5 = r5.getTimestamp(r14, r6)
            if (r5 != 0) goto L_0x0071
            y90 r5 = r13.b
            int r5 = r5.b
            long r7 = r13.j
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L_0x003f
            r9 = r10
            goto L_0x0040
        L_0x003f:
            r9 = r6
        L_0x0040:
            java.lang.String r11 = "sampleRate must be greater than 0."
            defpackage.bs0.m(r11, r9)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x004a
            r6 = r10
        L_0x004a:
            java.lang.String r9 = "framePosition must be no less than 0."
            defpackage.bs0.m(r9, r6)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = defpackage.m5a.u(r5, r7)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r7
        L_0x005f:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0072
            r13.l = r10
        L_0x0071:
            r1 = r3
        L_0x0072:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L_0x007a
            long r1 = java.lang.System.nanoTime()
        L_0x007a:
            long r3 = r13.j
            long r5 = (long) r0
            int r14 = r13.g
            long r5 = defpackage.m5a.Q(r14, r5)
            long r5 = r5 + r3
            r13.j = r5
        L_0x0086:
            ba0 r13 = new ba0
            r13.<init>(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q70.read(java.nio.ByteBuffer):ba0");
    }

    public final void release() {
        if (!this.c.getAndSet(true)) {
            p70 p70 = this.k;
            if (p70 != null) {
                this.a.unregisterAudioRecordingCallback(p70);
            }
            this.a.release();
        }
    }

    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.d;
        boolean z = true;
        if (!atomicBoolean.getAndSet(true)) {
            if (on4.a.g(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                AudioRecord audioRecord = this.a;
                if (audioRecord.getState() != 1) {
                    audioRecord.release();
                    throw new Exception("Unable to initialize AudioRecord");
                }
            }
            this.a.startRecording();
            if (this.a.getRecordingState() == 3) {
                this.j = 0;
                this.l = false;
                this.e.set((Object) null);
                AudioRecordingConfiguration activeRecordingConfiguration = this.a.getActiveRecordingConfiguration();
                if (activeRecordingConfiguration == null || !activeRecordingConfiguration.isClientSilenced()) {
                    z = false;
                }
                d(z);
                return;
            }
            atomicBoolean.set(false);
            throw new Exception("Unable to start AudioRecord with state: " + this.a.getRecordingState());
        }
    }

    public final void stop() {
        b();
        if (this.d.getAndSet(false)) {
            this.a.stop();
            if (this.a.getRecordingState() != 1) {
                this.a.getRecordingState();
            }
            if (on4.a.g(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                this.a.release();
                this.a = c(this.f, this.b, (Context) null);
            }
        }
    }
}
