package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;

/* renamed from: ic4  reason: default package */
public final class ic4 {
    public final ea6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final h60 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public ic4(ea6 ea6, int i2, int i3, int i4, int i5, int i6, int i7, int i8, h60 h60, boolean z, boolean z2, boolean z3) {
        this.a = ea6;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = h60;
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    public static AudioAttributes c(i30 i30, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) i30.b().b;
    }

    public final AudioTrack a(i30 i30, int i2) {
        int i3 = this.c;
        try {
            AudioTrack b2 = b(i30, i2);
            int state = b2.getState();
            if (state == 1) {
                return b2;
            }
            try {
                b2.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, this.e, this.f, this.h, this.a, i3 == 1, (RuntimeException) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new AudioSink$InitializationException(0, this.e, this.f, this.h, this.a, i3 == 1, e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.AudioTrack b(defpackage.i30 r13, int r14) {
        /*
            r12 = this;
            int r2 = defpackage.v0g.a
            r3 = 0
            r4 = 1
            r5 = 29
            boolean r6 = r12.l
            int r8 = r12.e
            int r9 = r12.g
            int r10 = r12.f
            if (r2 < r5) goto L_0x0041
            android.media.AudioFormat r2 = defpackage.v0g.s(r8, r10, r9)
            android.media.AudioAttributes r1 = c(r13, r6)
            android.media.AudioTrack$Builder r5 = new android.media.AudioTrack$Builder
            r5.<init>()
            android.media.AudioTrack$Builder r1 = r5.setAudioAttributes(r1)
            android.media.AudioTrack$Builder r1 = r1.setAudioFormat(r2)
            android.media.AudioTrack$Builder r1 = r1.setTransferMode(r4)
            int r2 = r12.h
            android.media.AudioTrack$Builder r1 = r1.setBufferSizeInBytes(r2)
            android.media.AudioTrack$Builder r1 = r1.setSessionId(r14)
            int r0 = r12.c
            if (r0 != r4) goto L_0x0038
            r3 = r4
        L_0x0038:
            android.media.AudioTrack$Builder r0 = r1.setOffloadedPlayback(r3)
            android.media.AudioTrack r0 = r0.build()
            return r0
        L_0x0041:
            r5 = 21
            if (r2 < r5) goto L_0x0058
            android.media.AudioTrack r11 = new android.media.AudioTrack
            android.media.AudioAttributes r1 = c(r13, r6)
            android.media.AudioFormat r2 = defpackage.v0g.s(r8, r10, r9)
            int r3 = r12.h
            r4 = 1
            r0 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            return r11
        L_0x0058:
            int r1 = r13.c
            r2 = 13
            if (r1 == r2) goto L_0x006d
            switch(r1) {
                case 2: goto L_0x006e;
                case 3: goto L_0x006a;
                case 4: goto L_0x0068;
                case 5: goto L_0x0066;
                case 6: goto L_0x0064;
                case 7: goto L_0x0066;
                case 8: goto L_0x0066;
                case 9: goto L_0x0066;
                case 10: goto L_0x0066;
                default: goto L_0x0061;
            }
        L_0x0061:
            r1 = 3
        L_0x0062:
            r3 = r1
            goto L_0x006e
        L_0x0064:
            r1 = 2
            goto L_0x0062
        L_0x0066:
            r1 = 5
            goto L_0x0062
        L_0x0068:
            r1 = 4
            goto L_0x0062
        L_0x006a:
            r1 = 8
            goto L_0x0062
        L_0x006d:
            r3 = r4
        L_0x006e:
            if (r14 != 0) goto L_0x0080
            android.media.AudioTrack r1 = new android.media.AudioTrack
            int r7 = r12.h
            r8 = 1
            int r4 = r12.e
            int r5 = r12.f
            int r6 = r12.g
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0094
        L_0x0080:
            android.media.AudioTrack r8 = new android.media.AudioTrack
            int r5 = r12.h
            r6 = 1
            int r2 = r12.e
            int r4 = r12.f
            int r9 = r12.g
            r0 = r8
            r1 = r3
            r3 = r4
            r4 = r9
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r8
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic4.b(i30, int):android.media.AudioTrack");
    }
}
