package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.animation.ScaleAnimation;
import java.io.File;
import ru.ok.messages.media.audio.AudioRecordView;

/* renamed from: p60  reason: default package */
public final /* synthetic */ class p60 implements b60, qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s60 b;

    public /* synthetic */ p60(s60 s60, int i) {
        this.a = i;
        this.b = s60;
    }

    public void accept(Object obj) {
        s60 s60 = this.b;
        switch (this.a) {
            case 1:
                Throwable th = (Throwable) obj;
                hi7.a0(qad.t, s60.b);
                s60.c();
                return;
            case 3:
                Pair pair = (Pair) obj;
                AudioRecordView audioRecordView = s60.o;
                int intValue = ((Integer) pair.second).intValue();
                audioRecordView.G0.setText((String) pair.first);
                View view = audioRecordView.M0;
                view.clearAnimation();
                if (view.getVisibility() == 0) {
                    float f = ((((float) intValue) * 2.0f) / 32768.0f) + 1.4f;
                    if (f > 2.0f) {
                        f = 2.0f;
                    }
                    float f2 = audioRecordView.E0;
                    ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f, f2, f, ((float) view.getWidth()) / 2.0f, ((float) view.getHeight()) / 2.0f);
                    audioRecordView.E0 = f;
                    scaleAnimation.setInterpolator(audioRecordView.R0.a.n());
                    scaleAnimation.setDuration(50);
                    view.setAnimation(scaleAnimation);
                    scaleAnimation.start();
                    return;
                }
                return;
            case 4:
                File file = (File) obj;
                s60.getClass();
                z68.c("s60", "Success download attach", new Object[0]);
                s60.F = true;
                if (s60.n == null) {
                    z68.f("s60", "saveDraftPath: serverAttach is null", (Throwable) null);
                } else {
                    rt4 rt4 = (rt4) s60.q.b.f0;
                    z68.f("s60", "saveDraftPath: draft is null", (Throwable) null);
                }
                s60.w();
                return;
            case 5:
                s60.getClass();
                z68.f("s60", "Can't download attach", (Throwable) obj);
                if (s60.m()) {
                    s60.c.B();
                }
                s60.a();
                s60.e();
                return;
            default:
                yjf yjf = (yjf) obj;
                s60.m = r60.a;
                s60.t();
                s60.b();
                s60.d.e("ACTION_AUDIO_RECORD_CONTINUOUS_START");
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            yjf r10 = (defpackage.yjf) r10
            s60 r9 = r9.b
            f40 r0 = r9.c
            android.media.MediaRecorder r0 = r0.v0
            if (r0 == 0) goto L_0x0017
            int r0 = r0.getMaxAmplitude()     // Catch:{ IllegalStateException -> 0x000f }
            goto L_0x0018
        L_0x000f:
            r0 = move-exception
            java.lang.String r1 = "f40"
            java.lang.String r2 = "Can't getRecorderAmplitude illegal state"
            defpackage.z68.f(r1, r2, r0)
        L_0x0017:
            r0 = 0
        L_0x0018:
            java.util.List r9 = r9.l
            r1 = 4674736413210574848(0x40e0000000000000, double:32768.0)
            r3 = -4591842032569286656(0xc046800000000000, double:-45.0)
            if (r0 != 0) goto L_0x0025
            r5 = r3
            goto L_0x002e
        L_0x0025:
            double r5 = (double) r0
            double r5 = r5 / r1
            double r5 = java.lang.Math.log10(r5)
            r7 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r5 = r5 * r7
        L_0x002e:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r5
        L_0x0034:
            r5 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r3 = r3 + r5
            double r3 = r3 * r1
            double r3 = r3 / r5
            int r1 = (int) r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.add(r1)
            android.util.Pair r9 = new android.util.Pair
            java.lang.Object r10 = r10.a
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            r3 = 50
            long r1 = r1 * r3
            java.lang.String[] r10 = defpackage.ghf.c
            java.lang.String r10 = defpackage.b0h.d(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.<init>(r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p60.apply(java.lang.Object):java.lang.Object");
    }

    public void setCurrentPosition(long j) {
        s60 s60 = this.b;
        if (s60.l()) {
            s60.p.b(j, s60.h(j), s60.l(), s60.F);
            return;
        }
        s60.d();
    }
}
