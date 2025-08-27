package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: t60  reason: default package */
public final class t60 implements lxc, MediaRecorder.OnInfoListener {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public MediaRecorder v;
    public hxc w;
    public volatile String x;

    public t60(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        Lazy h = wqg.a.getAccessor().h(bud.class);
        this.a = lazy;
        this.b = h;
        this.c = lazy2;
        this.o = lazy3;
    }

    public final int a() {
        MediaRecorder mediaRecorder = this.v;
        if (mediaRecorder == null) {
            return 0;
        }
        try {
            return mediaRecorder.getMaxAmplitude();
        } catch (RuntimeException e) {
            z68.f(t60.class.getName(), "Can't getRecorderAmplitude illegal state", e);
            return 0;
        }
    }

    public final boolean b() {
        return this.v != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r4.v = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r4 = this;
            android.media.MediaRecorder r0 = r4.v
            if (r0 == 0) goto L_0x0032
            r1 = 0
            if (r0 == 0) goto L_0x002d
            r0.stop()     // Catch:{ RuntimeException -> 0x000d }
            goto L_0x002d
        L_0x000b:
            r0 = move-exception
            goto L_0x0023
        L_0x000d:
            r0 = move-exception
            java.lang.Class<t60> r2 = defpackage.t60.class
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x000b }
            java.lang.String r3 = "Can't stopRecordAudio"
            defpackage.z68.f(r2, r3, r0)     // Catch:{ all -> 0x000b }
            android.media.MediaRecorder r0 = r4.v
            if (r0 == 0) goto L_0x0020
        L_0x001d:
            r0.release()
        L_0x0020:
            r4.v = r1
            goto L_0x0032
        L_0x0023:
            android.media.MediaRecorder r2 = r4.v
            if (r2 == 0) goto L_0x002a
            r2.release()
        L_0x002a:
            r4.v = r1
            throw r0
        L_0x002d:
            android.media.MediaRecorder r0 = r4.v
            if (r0 == 0) goto L_0x0020
            goto L_0x001d
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t60.c():void");
    }

    public final void d() {
        MediaRecorder mediaRecorder = this.v;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    public final Object e(long j, Continuation continuation) {
        String absolutePath = ((po5) ((ln5) this.o.getValue())).d(j).getAbsolutePath();
        if (absolutePath == null) {
            z68.c(t60.class.getName(), "Couldn't create a file for the audio message", new Object[0]);
            return Unit.INSTANCE;
        }
        this.x = absolutePath;
        if (!j(3, 90000, Boxing.boxInt(60000), absolutePath) && !j(3, 45000, Boxing.boxInt(30000), absolutePath) && !j(3, 16000, (Integer) null, absolutePath)) {
            j(0, 16000, (Integer) null, absolutePath);
        }
        return Unit.INSTANCE;
    }

    public final Object f(kxc kxc, Continuation continuation) {
        String str;
        if (!(kxc instanceof ixc) || (str = this.x) == null) {
            return null;
        }
        ixc ixc = (ixc) kxc;
        return new k50(str, ixc.a, ixc.b);
    }

    public final void g() {
        MediaRecorder mediaRecorder = this.v;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    public final boolean h() {
        return ((edb) this.c.getValue()).b(edb.h);
    }

    public final void i(pwc pwc) {
        this.w = pwc;
    }

    public final boolean j(int i, int i2, Integer num, String str) {
        try {
            MediaRecorder j = Build.VERSION.SDK_INT >= 31 ? n30.j((Context) this.a.getValue()) : new MediaRecorder();
            this.v = j;
            j.setAudioSource(1);
            j.setOutputFormat(6);
            j.setAudioEncoder(i);
            j.setOnInfoListener(this);
            akd akd = (akd) ((bud) this.b.getValue());
            akd.getClass();
            j.setMaxDuration(((int) akd.r(PmsKey.f61maxaudiolength, (long) 3600)) * 1000);
            j.setAudioSamplingRate(i2);
            if (num != null) {
                j.setAudioEncodingBitRate(num.intValue());
            }
            j.setAudioChannels(1);
            j.setOutputFile(str);
            j.prepare();
            j.start();
            return true;
        } catch (RuntimeException e) {
            String name = t60.class.getName();
            a67 a67 = z68.b;
            if (a67 == null || !a67.c()) {
                return false;
            }
            w78 w78 = w78.x;
            String message = e.getMessage();
            a67.d(w78, name, message + " encoder: " + i, (Throwable) null);
            return false;
        }
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        hxc hxc;
        if ((i == 800 || i == 801) && (hxc = this.w) != null) {
            pwc pwc = (pwc) hxc;
            igf igf = new igf(yya.f);
            yvc yvc = pwc.c;
            yvc.getClass();
            xag.h(yvc.b, new vvc(igf));
            fwc fwc = new fwc(3, false, false);
            xme xme = pwc.Z;
            xme.getClass();
            xme.m((Object) null, fwc);
            a80 a80 = (a80) pwc.Y.getValue();
            if (a80 != null) {
                a80.a();
            }
            pwc.w();
        }
    }
}
