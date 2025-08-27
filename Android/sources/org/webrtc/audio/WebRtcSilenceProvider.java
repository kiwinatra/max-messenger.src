package org.webrtc.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;

class WebRtcSilenceProvider {
    private static final String TAG = "WebRtcSilenceProvider";
    private final int audioFormat;
    private final long bufferDurationNs;
    private final int channelCount;
    private long lastReadTimeNs;
    private final int sampleRate;
    private final byte[] silenceBytes;
    private final Statistics statistics = new Statistics(0);

    public static class Statistics {
        private static final long LOG_INTERVAL = TimeUnit.SECONDS.toNanos(15);
        private long lastLogTimeNs;
        private int readCount;
        private long totalReadTimeNs;
        private long totalSleepTimeMs;

        private Statistics() {
        }

        private void reset() {
            this.totalSleepTimeMs = 0;
            this.totalReadTimeNs = 0;
            this.readCount = 0;
        }

        public void trackRead(long j, long j2, long j3) {
            int i = this.readCount + 1;
            this.readCount = i;
            if (j3 > 0) {
                this.totalSleepTimeMs += j3;
            }
            long j4 = (j2 - j) + this.totalReadTimeNs;
            this.totalReadTimeNs = j4;
            long j5 = j2 - this.lastLogTimeNs;
            long j6 = LOG_INTERVAL;
            if (j5 > j6) {
                long j7 = this.totalSleepTimeMs / ((long) i);
                long millis = TimeUnit.NANOSECONDS.toMillis(j4 / ((long) i));
                this.lastLogTimeNs = j2;
                int i2 = this.readCount;
                StringBuilder n = tr1.n(j6, "Log interval: ", "ns, log delta: ");
                n.append(j5);
                n.append("ns, reads: ");
                n.append(i2);
                tr1.v(n, ", read time: ", millis, "ms, suspend time: ");
                n.append(j7);
                n.append("ms");
                Logging.d(WebRtcSilenceProvider.TAG, n.toString());
                reset();
            }
        }

        public /* synthetic */ Statistics(int i) {
            this();
        }
    }

    public WebRtcSilenceProvider(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.sampleRate = i2;
        this.audioFormat = i;
        this.channelCount = i3;
        long nanos = (((long) i4) * TimeUnit.SECONDS.toNanos(1)) / ((long) i2);
        this.bufferDurationNs = nanos;
        if (bArr == null || i5 != bArr.length) {
            bArr = new byte[(i5 < 0 ? 0 : i5)];
        }
        this.silenceBytes = bArr;
        long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
        int length = bArr.length;
        StringBuilder n = a81.n("Silence provider initialized, sampleRate=", i2, ", framesPerBuffer=", i4, ", bufferDuration=");
        n.append(millis);
        n.append("ms, bufferCapacity=");
        n.append(length);
        Logging.d(TAG, n.toString());
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int read(ByteBuffer byteBuffer, int i) {
        int min = Math.min(i, byteBuffer.capacity());
        byteBuffer.clear();
        int i2 = 0;
        while (i2 < min) {
            int min2 = Math.min(byteBuffer.remaining(), this.silenceBytes.length);
            if (min2 == 0) {
                break;
            }
            byteBuffer.put(this.silenceBytes, byteBuffer.position(), min2);
            i2 += min2;
        }
        long nanoTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(this.bufferDurationNs - (nanoTime - this.lastReadTimeNs));
        if (millis > 0) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException unused) {
                Logging.d(TAG, "Interrupted while waiting for frame duration, return immediately");
            }
        }
        long nanoTime2 = System.nanoTime();
        this.lastReadTimeNs = nanoTime2;
        this.statistics.trackRead(nanoTime, nanoTime2, millis);
        return i2;
    }
}
