package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* renamed from: n40  reason: default package */
public final class n40 {
    public final /* synthetic */ int a = 0;
    public final AudioManager b;
    public int c;
    public int d;
    public float e = 1.0f;
    public AudioFocusRequest f;
    public final AudioManager.OnAudioFocusChangeListener g;
    public Object h;
    public Object i;

    public n40(Context context, Handler handler, mc5 mc5) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.b = audioManager;
        this.h = mc5;
        this.g = new m40(0, handler, this);
        this.c = 0;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                if (this.c != 0) {
                    int i2 = t0g.a;
                    AudioManager audioManager = this.b;
                    if (i2 >= 26) {
                        AudioFocusRequest audioFocusRequest = this.f;
                        if (audioFocusRequest != null) {
                            audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        }
                    } else {
                        audioManager.abandonAudioFocus((m40) this.g);
                    }
                    c(0);
                    return;
                }
                return;
            default:
                int i3 = this.c;
                if (i3 != 1 && i3 != 0) {
                    int i4 = v0g.a;
                    AudioManager audioManager2 = this.b;
                    if (i4 >= 26) {
                        AudioFocusRequest audioFocusRequest2 = this.f;
                        if (audioFocusRequest2 != null) {
                            audioManager2.abandonAudioFocusRequest(audioFocusRequest2);
                            return;
                        }
                        return;
                    }
                    audioManager2.abandonAudioFocus((m40) this.g);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r6.a == 1) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r2 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.i30 r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.i
            i30 r0 = (defpackage.i30) r0
            boolean r0 = defpackage.v0g.a(r0, r6)
            if (r0 != 0) goto L_0x003b
            r5.i = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L_0x0012
        L_0x0010:
            r2 = r0
            goto L_0x002f
        L_0x0012:
            r2 = 3
            r3 = 2
            int r4 = r6.c
            switch(r4) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0027;
                case 2: goto L_0x0025;
                case 3: goto L_0x0010;
                case 4: goto L_0x0025;
                case 5: goto L_0x002f;
                case 6: goto L_0x002f;
                case 7: goto L_0x002f;
                case 8: goto L_0x002f;
                case 9: goto L_0x002f;
                case 10: goto L_0x002f;
                case 11: goto L_0x0021;
                case 12: goto L_0x002f;
                case 13: goto L_0x002f;
                case 14: goto L_0x0027;
                case 15: goto L_0x0019;
                case 16: goto L_0x001f;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.String r6 = "Unidentified audio usage: "
            defpackage.i2a.m(r4, r6)
            goto L_0x0010
        L_0x001f:
            r2 = 4
            goto L_0x002f
        L_0x0021:
            int r6 = r6.a
            if (r6 != r1) goto L_0x002f
        L_0x0025:
            r2 = r3
            goto L_0x002f
        L_0x0027:
            r2 = r1
            goto L_0x002f
        L_0x0029:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.i8b.V(r6)
            goto L_0x0027
        L_0x002f:
            r5.d = r2
            if (r2 == r1) goto L_0x0035
            if (r2 != 0) goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            java.lang.String r5 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.n79.f(r5, r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.b(i30):void");
    }

    public final void c(int i2) {
        switch (this.a) {
            case 0:
                if (this.c != i2) {
                    this.c = i2;
                    float f2 = i2 == 3 ? 0.2f : 1.0f;
                    if (this.e != f2) {
                        this.e = f2;
                        mc5 mc5 = (mc5) this.h;
                        if (mc5 != null) {
                            sc5 sc5 = mc5.a;
                            sc5.y1(1, 2, Float.valueOf(sc5.b1 * sc5.F0.e));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (this.c != i2) {
                    this.c = i2;
                    float f3 = i2 == 4 ? 0.2f : 1.0f;
                    if (this.e != f3) {
                        this.e = f3;
                        nc5 nc5 = (nc5) this.h;
                        if (nc5 != null) {
                            tc5 tc5 = nc5.a;
                            tc5.B1(1, 2, Float.valueOf(tc5.e1 * tc5.K0.e));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0129, code lost:
        if (r9 != false) goto L_0x012d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(int r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            r1 = 0
            if (r8 == r0) goto L_0x00a0
            int r8 = r7.d
            if (r8 != r0) goto L_0x00a0
            r8 = 3
            r2 = -1
            if (r9 == 0) goto L_0x0095
            int r9 = r7.c
            r3 = 2
            if (r9 != r3) goto L_0x0018
            goto L_0x00a6
        L_0x0018:
            int r9 = defpackage.v0g.a
            r4 = 26
            android.media.AudioManager r5 = r7.b
            android.media.AudioManager$OnAudioFocusChangeListener r6 = r7.g
            m40 r6 = (defpackage.m40) r6
            if (r9 < r4) goto L_0x0069
            android.media.AudioFocusRequest r8 = r7.f
            if (r8 == 0) goto L_0x0029
            goto L_0x0062
        L_0x0029:
            if (r8 != 0) goto L_0x0033
            android.media.AudioFocusRequest$Builder r8 = new android.media.AudioFocusRequest$Builder
            int r9 = r7.d
            r8.<init>(r9)
            goto L_0x003a
        L_0x0033:
            android.media.AudioFocusRequest$Builder r8 = new android.media.AudioFocusRequest$Builder
            android.media.AudioFocusRequest r9 = r7.f
            r8.<init>(r9)
        L_0x003a:
            java.lang.Object r9 = r7.i
            i30 r9 = (defpackage.i30) r9
            if (r9 == 0) goto L_0x0045
            int r4 = r9.a
            if (r4 != r0) goto L_0x0045
            r1 = r0
        L_0x0045:
            r9.getClass()
            vs6 r9 = r9.b()
            java.lang.Object r9 = r9.b
            android.media.AudioAttributes r9 = (android.media.AudioAttributes) r9
            android.media.AudioFocusRequest$Builder r8 = r8.setAudioAttributes(r9)
            android.media.AudioFocusRequest$Builder r8 = r8.setWillPauseWhenDucked(r1)
            android.media.AudioFocusRequest$Builder r8 = r8.setOnAudioFocusChangeListener(r6)
            android.media.AudioFocusRequest r8 = r8.build()
            r7.f = r8
        L_0x0062:
            android.media.AudioFocusRequest r8 = r7.f
            int r8 = r5.requestAudioFocus(r8)
            goto L_0x008b
        L_0x0069:
            java.lang.Object r9 = r7.i
            i30 r9 = (defpackage.i30) r9
            r9.getClass()
            r4 = 13
            int r9 = r9.c
            if (r9 == r4) goto L_0x0084
            switch(r9) {
                case 2: goto L_0x0085;
                case 3: goto L_0x0081;
                case 4: goto L_0x007f;
                case 5: goto L_0x007d;
                case 6: goto L_0x007b;
                case 7: goto L_0x007d;
                case 8: goto L_0x007d;
                case 9: goto L_0x007d;
                case 10: goto L_0x007d;
                default: goto L_0x0079;
            }
        L_0x0079:
            r1 = r8
            goto L_0x0085
        L_0x007b:
            r1 = r3
            goto L_0x0085
        L_0x007d:
            r1 = 5
            goto L_0x0085
        L_0x007f:
            r1 = 4
            goto L_0x0085
        L_0x0081:
            r1 = 8
            goto L_0x0085
        L_0x0084:
            r1 = r0
        L_0x0085:
            int r8 = r7.d
            int r8 = r5.requestAudioFocus(r6, r1, r8)
        L_0x008b:
            if (r8 != r0) goto L_0x0091
            r7.c(r3)
            goto L_0x00a6
        L_0x0091:
            r7.c(r0)
            goto L_0x009e
        L_0x0095:
            int r7 = r7.c
            if (r7 == r0) goto L_0x009e
            if (r7 == r8) goto L_0x009c
            goto L_0x00a6
        L_0x009c:
            r0 = r1
            goto L_0x00a6
        L_0x009e:
            r0 = r2
            goto L_0x00a6
        L_0x00a0:
            r7.a()
            r7.c(r1)
        L_0x00a6:
            return r0
        L_0x00a7:
            r0 = 1
            r1 = -1
            if (r8 == r0) goto L_0x0126
            int r8 = r7.d
            if (r8 == r0) goto L_0x00b1
            goto L_0x0126
        L_0x00b1:
            if (r9 == 0) goto L_0x012e
            int r8 = r7.c
            if (r8 != r0) goto L_0x00b9
            goto L_0x012d
        L_0x00b9:
            int r8 = defpackage.t0g.a
            r9 = 0
            r2 = 26
            android.media.AudioManager r3 = r7.b
            android.media.AudioManager$OnAudioFocusChangeListener r4 = r7.g
            m40 r4 = (defpackage.m40) r4
            if (r8 < r2) goto L_0x0109
            android.media.AudioFocusRequest r8 = r7.f
            if (r8 == 0) goto L_0x00cb
            goto L_0x0102
        L_0x00cb:
            if (r8 != 0) goto L_0x00d5
            android.media.AudioFocusRequest$Builder r8 = new android.media.AudioFocusRequest$Builder
            int r2 = r7.d
            r8.<init>(r2)
            goto L_0x00dc
        L_0x00d5:
            android.media.AudioFocusRequest$Builder r8 = new android.media.AudioFocusRequest$Builder
            android.media.AudioFocusRequest r2 = r7.f
            r8.<init>(r2)
        L_0x00dc:
            java.lang.Object r2 = r7.i
            h30 r2 = (defpackage.h30) r2
            if (r2 == 0) goto L_0x00e8
            int r5 = r2.a
            if (r5 != r0) goto L_0x00e8
            r5 = r0
            goto L_0x00e9
        L_0x00e8:
            r5 = r9
        L_0x00e9:
            r2.getClass()
            android.media.AudioAttributes r2 = r2.a()
            android.media.AudioFocusRequest$Builder r8 = r8.setAudioAttributes(r2)
            android.media.AudioFocusRequest$Builder r8 = r8.setWillPauseWhenDucked(r5)
            android.media.AudioFocusRequest$Builder r8 = r8.setOnAudioFocusChangeListener(r4)
            android.media.AudioFocusRequest r8 = r8.build()
            r7.f = r8
        L_0x0102:
            android.media.AudioFocusRequest r8 = r7.f
            int r8 = r3.requestAudioFocus(r8)
            goto L_0x011c
        L_0x0109:
            java.lang.Object r8 = r7.i
            h30 r8 = (defpackage.h30) r8
            r8.getClass()
            int r8 = r8.c
            int r8 = defpackage.t0g.x(r8)
            int r2 = r7.d
            int r8 = r3.requestAudioFocus(r4, r8, r2)
        L_0x011c:
            if (r8 != r0) goto L_0x0122
            r7.c(r0)
            goto L_0x012d
        L_0x0122:
            r7.c(r9)
            goto L_0x012c
        L_0x0126:
            r7.a()
            if (r9 == 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r0 = r1
        L_0x012d:
            r1 = r0
        L_0x012e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.d(int, boolean):int");
    }

    public n40(Context context, Handler handler, nc5 nc5) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.b = audioManager;
        this.h = nc5;
        this.g = new m40(1, handler, this);
        this.c = 0;
    }
}
