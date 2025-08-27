package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: xe6  reason: default package */
public final class xe6 implements e0a {
    public static final k0d y;
    public static final k0d z;
    public final MediaMuxer a;
    public final long b;
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();
    public we6 v;
    public boolean w;
    public boolean x;

    /* JADX WARNING: type inference failed for: r0v0, types: [qb7, jb7] */
    static {
        ? jb7 = new jb7(4);
        jb7.b("video/avc", "video/3gpp", "video/mp4v-es");
        int i = v0g.a;
        if (i >= 24) {
            jb7.a("video/hevc");
        }
        if (i >= 34) {
            jb7.a("video/av01");
        }
        y = jb7.j();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        f6e.g(3, objArr);
        z = tb7.n(3, objArr);
    }

    public xe6(MediaMuxer mediaMuxer, long j) {
        this.a = mediaMuxer;
        this.b = v0g.S(j);
    }

    public static void a(MediaMuxer mediaMuxer) {
        Class<MediaMuxer> cls = MediaMuxer.class;
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (v0g.a < 30) {
                try {
                    Field declaredField = cls.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(mediaMuxer);
                    num.getClass();
                    Field declaredField2 = cls.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    public final void c(qp9 qp9) {
        if (qp9 instanceof su9) {
            su9 su9 = (su9) qp9;
            this.a.setLocation(su9.a, su9.b);
        }
    }

    public final void close() {
        if (!this.x) {
            boolean z2 = this.w;
            MediaMuxer mediaMuxer = this.a;
            if (!z2) {
                try {
                    mediaMuxer.start();
                    this.w = true;
                } catch (RuntimeException e) {
                    throw new Exception("Failed to start the muxer", e);
                }
            }
            if (!(this.b == -9223372036854775807L || this.v == null)) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(0, 0, this.b, 4);
                we6 we6 = this.v;
                we6.getClass();
                h(we6, ByteBuffer.allocateDirect(0), bufferInfo);
            }
            this.w = false;
            try {
                a(mediaMuxer);
                mediaMuxer.release();
                this.x = true;
            } catch (RuntimeException e2) {
                throw new Exception("Failed to stop the MediaMuxer", e2);
            } catch (Throwable th) {
                mediaMuxer.release();
                this.x = true;
                throw th;
            }
        }
    }

    public final void h(we6 we6, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        we6 we62 = we6;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        long j = bufferInfo2.presentationTimeUs;
        long j2 = this.b;
        if (j2 == -9223372036854775807L || we62 != this.v || j <= j2) {
            boolean z2 = this.w;
            HashMap hashMap = this.o;
            MediaMuxer mediaMuxer = this.a;
            if (!z2) {
                if (v0g.a < 30 && j < 0) {
                    hashMap.put(we62, Long.valueOf(-j));
                }
                try {
                    mediaMuxer.start();
                    this.w = true;
                } catch (RuntimeException e) {
                    throw new Exception("Failed to start the muxer", e);
                }
            }
            long longValue = hashMap.containsKey(we62) ? ((Long) hashMap.get(we62)).longValue() : 0;
            long j3 = j + longValue;
            HashMap hashMap2 = this.c;
            long longValue2 = hashMap2.containsKey(we62) ? ((Long) hashMap2.get(we62)).longValue() : 0;
            boolean z3 = v0g.a > 24 || j3 >= longValue2;
            StringBuilder n = tr1.n(j3, "Samples not in presentation order (", " < ");
            n.append(longValue2);
            n.append(") unsupported on this API version");
            n79.m(n.toString(), z3);
            hashMap2.put(we62, Long.valueOf(j3));
            boolean z4 = longValue == 0 || j3 >= longValue2;
            StringBuilder n2 = tr1.n(j3, "Samples not in presentation order (", " < ");
            n2.append(longValue2);
            n2.append(") unsupported when using negative PTS workaround");
            n79.m(n2.toString(), z4);
            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j3, bufferInfo2.flags);
            try {
                n79.n(we62 instanceof we6);
                mediaMuxer.writeSampleData(we62.a, byteBuffer, bufferInfo2);
            } catch (RuntimeException e2) {
                StringBuilder n3 = tr1.n(j3, "Failed to write sample for presentationTimeUs=", ", size=");
                n3.append(bufferInfo2.size);
                throw new Exception(n3.toString(), e2);
            }
        }
    }

    public final we6 i(ea6 ea6) {
        MediaFormat mediaFormat;
        int i = ea6.w;
        String str = ea6.n;
        str.getClass();
        boolean k = vq9.k(str);
        MediaMuxer mediaMuxer = this.a;
        if (k) {
            mediaFormat = MediaFormat.createVideoFormat(str, ea6.t, ea6.u);
            hsg.w(mediaFormat, ea6.A);
            try {
                mediaMuxer.setOrientationHint(i);
            } catch (RuntimeException e) {
                throw new Exception(wj6.h(i, "Failed to set orientation hint with rotationDegrees="), e);
            }
        } else {
            mediaFormat = MediaFormat.createAudioFormat(str, ea6.C, ea6.B);
            String str2 = ea6.d;
            if (str2 != null) {
                mediaFormat.setString("language", str2);
            }
        }
        hsg.C(mediaFormat, ea6.q);
        try {
            we6 we6 = new we6(mediaMuxer.addTrack(mediaFormat));
            if (k) {
                this.v = we6;
            }
            return we6;
        } catch (RuntimeException e2) {
            throw new Exception("Failed to add track with format=" + ea6, e2);
        }
    }
}
