package defpackage;

import android.animation.IntEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import ru.ok.messages.media.audio.AudioListenView;
import ru.ok.messages.media.audio.AudioRecordView;

/* renamed from: s60  reason: default package */
public final class s60 implements x60, f50 {
    public static final qw6 G = qw6.VIRTUAL_KEY;
    public or7 A;
    public d60 B;
    public PointF C;
    public boolean D;
    public srd E;
    public boolean F = true;
    public final int a;
    public final Context b;
    public final f40 c;
    public final nd d;
    public final po5 e;
    public final hn4 f;
    public final v21 g;
    public final sv0 h;
    public final xy9 i;
    public final sz j;
    public final Set k = Collections.newSetFromMap(new ConcurrentHashMap());
    public List l = new ArrayList();
    public r60 m = r60.c;
    public l20 n;
    public AudioRecordView o;
    public AudioListenView p;
    public final a32 q;
    public final uk2 r;
    public final ViewStub s;
    public final ViewStub t;
    public String u;
    public long v;
    public long w;
    public long x;
    public or7 y;
    public or7 z;

    public s60(Context context, a32 a32, uk2 uk2, ViewStub viewStub, ViewStub viewStub2, f40 f40, nd ndVar, po5 po5, hn4 hn4, w21 w21, jd8 jd8, xy9 xy9, sz szVar, r62 r62) {
        this.b = context;
        this.q = a32;
        this.r = uk2;
        this.s = viewStub;
        this.t = viewStub2;
        this.c = f40;
        this.d = ndVar;
        this.e = po5;
        this.f = hn4;
        this.g = w21;
        this.h = jd8;
        this.i = xy9;
        this.j = szVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static String h(long j2) {
        String[] strArr = ghf.c;
        long hours = TimeUnit.MILLISECONDS.toHours(j2);
        long j3 = j2 - (3600000 * hours);
        long j4 = j3 / 60000;
        long j5 = (j3 - (60000 * j4)) / ((long) 1000);
        return hours > 0 ? String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public final void a() {
        this.m = r60.c;
        AudioListenView audioListenView = this.p;
        if (audioListenView != null) {
            kne.s(audioListenView.getContext()).m(audioListenView);
        }
    }

    public final void b() {
        this.C = null;
        or7 or7 = this.z;
        if (or7 != null) {
            qq4.a(or7);
            this.z = null;
        }
    }

    public final void c() {
        if (m()) {
            this.c.B();
        }
        v();
        e();
        AudioRecordView audioRecordView = this.o;
        if (audioRecordView != null) {
            if (audioRecordView.getVisibility() == 0) {
                AudioRecordView audioRecordView2 = this.o;
                View view = audioRecordView2.P0;
                ch chVar = audioRecordView2.R0;
                chVar.m(view).v(new w60(audioRecordView2, 1));
                chVar.m(audioRecordView2.L0);
                chVar.m(audioRecordView2.M0);
                chVar.m(audioRecordView2.J0);
            } else {
                this.o.L();
            }
        }
        this.m = r60.c;
    }

    public final void d() {
        or7 or7 = this.y;
        if (or7 != null) {
            qq4.a(or7);
            this.y = null;
        }
        d60 d60 = this.B;
        if (d60 != null) {
            d60.e();
            this.B = null;
        }
    }

    public final void e() {
        jbd.c(this.A);
        this.A = null;
        this.c.C();
        this.u = null;
        this.w = 0;
        this.v = 0;
        this.x = 0;
        this.C = null;
        this.n = null;
        srd srd = this.E;
        if (srd != null) {
            jbd.c((or7) srd.o);
        }
        this.F = true;
        this.l = new ArrayList();
        b();
        d();
        for (q60 y2 : this.k) {
            y2.y(false);
        }
        r(false);
    }

    public final k50 f() {
        return new k50(i(), this.x, j());
    }

    public final long g() {
        f40 f40 = this.c;
        if (f40.c.m() == jr8.v) {
            return this.w;
        }
        if (f40.c.m() == jr8.o) {
            return this.q.a;
        }
        return -1;
    }

    public final String i() {
        if (this.u == null) {
            this.u = this.e.d(this.w).getAbsolutePath();
        }
        return this.u;
    }

    public final byte[] j() {
        List<Integer> list = this.l;
        if (list == null || list.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[list.size()];
        int i2 = 0;
        for (Integer num : list) {
            if (this.n == null) {
                bArr[i2] = (byte) ((num.intValue() * 127) / 32768);
            } else {
                bArr[i2] = num.byteValue();
            }
            i2++;
        }
        return bArr;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            rw6.REJECT.e(this.o);
        } else {
            rw6.LONG_PRESS.e(this.o);
        }
        hi7.a0(qad.v, this.b);
        this.d.e("ACTION_AUDIO_RECORD_LESS_1_S");
    }

    public final boolean l() {
        long g2 = g();
        return g2 != -1 && this.c.c.p(g2);
    }

    public final boolean m() {
        long g2 = g();
        return g2 != -1 && this.c.p(g2);
    }

    public final void n() {
        r60 r60 = this.m;
        r60 r602 = r60.b;
        nd ndVar = this.d;
        if (r60 == r602) {
            c();
            ndVar.e("ACTION_AUDIO_RECORD_REGULAR_CANCEL");
        } else if (r60 == r60.a) {
            c();
            ndVar.e("ACTION_AUDIO_RECORD_CONTINUOUS_CANCEL");
        }
    }

    public final void o(r60 r60, long j2, long j3, List list, l20 l20) {
        r60 r602 = r60.c;
        if (r60 == null) {
            this.m = r602;
        } else if (r60 != r602) {
            this.n = l20;
            this.m = r60;
            this.w = j2;
            this.x = j3;
            if (list == null) {
                this.l = new ArrayList();
            } else {
                this.l = list;
            }
            this.n = l20;
            p();
            if (this.n == null) {
                this.F = true;
                return;
            }
            this.F = false;
            w();
            srd a2 = this.j.a(this.n);
            this.E = a2;
            a2.O(new p60(this, 4), new p60(this, 5));
        }
    }

    @oye
    public void onEvent(e60 e60) {
        r60 r60 = this.m;
        r60 r602 = r60.o;
        f40 f40 = this.c;
        if (r60 != r602 || f40.b(g())) {
            r60 r603 = this.m;
            if ((r603 == r60.b || r603 == r60.a) && f40.c.z) {
                u(true, true);
                return;
            }
            return;
        }
        w();
    }

    public final void p() {
        if (this.m != r60.c && this.x != 0) {
            AudioRecordView audioRecordView = this.o;
            if (audioRecordView != null) {
                audioRecordView.L();
                this.o.setVisibility(4);
            }
            s(false);
            w();
        }
    }

    public final void q() {
        boolean z2 = this.m != r60.c;
        if (this.x > 1000) {
            if (z2) {
                G.e(this.o);
            }
            for (q60 C2 : this.k) {
                C2.C(f());
            }
        } else {
            k();
        }
        c();
    }

    public final void r(boolean z2) {
        AudioListenView audioListenView = this.p;
        if (audioListenView != null) {
            audioListenView.setPlayButtonState(z2);
        }
    }

    public final void s(boolean z2) {
        this.m = r60.o;
        AudioListenView audioListenView = this.p;
        Set<q60> set = this.k;
        if (audioListenView == null) {
            AudioListenView audioListenView2 = (AudioListenView) this.t.inflate();
            this.p = audioListenView2;
            audioListenView2.setScheduledSend(((Boolean) this.r.b.getValue()).booleanValue());
            for (q60 q60 : set) {
                q60.getClass();
            }
        }
        this.p.setListener(this);
        if (z2) {
            AudioListenView audioListenView3 = this.p;
            audioListenView3.bringToFront();
            kne.s(audioListenView3.getContext()).j(audioListenView3);
        } else {
            AudioListenView audioListenView4 = this.p;
            audioListenView4.bringToFront();
            audioListenView4.setVisibility(0);
        }
        AudioListenView audioListenView5 = this.p;
        byte[] j2 = j();
        long j3 = this.x;
        String h2 = h(j3);
        audioListenView5.a.b(j3, j2);
        audioListenView5.b.setText(h2);
        for (q60 y2 : set) {
            y2.y(true);
        }
    }

    public final void t() {
        if (m()) {
            this.c.B();
        }
        e();
        if (this.o == null) {
            AudioRecordView audioRecordView = (AudioRecordView) this.s.inflate();
            this.o = audioRecordView;
            audioRecordView.setListener(this);
        }
        Context context = this.b;
        Activity activity = (Activity) context;
        this.f.getClass();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = n5b.d;
        hn4.j(activity, hd8.x(context) == 1 ? rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? l5b.c : l5b.a : l5b.o : l5b.b : l5b.c : rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? l5b.b : l5b.c : l5b.a : l5b.o : l5b.b);
        hn4.l((Activity) context, true);
        this.w = System.currentTimeMillis();
        iia j2 = new aja(1, new h5(1, this)).s(qe.a()).x(xfd.b()).j(new p60(this, 1));
        gga gga = m58.f;
        ekd ekd = m58.g;
        dj6 dj6 = m58.e;
        or7 or7 = new or7(gga, ekd, dj6);
        j2.a(or7);
        this.A = or7;
        this.o.setVisibility(0);
        this.o.bringToFront();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hja p2 = jha.p(50, timeUnit);
        lfd a2 = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        lja s2 = new yia(new uka(p2, timeUnit, a2, 1).s(qe.a()), new p60(this, 2), 3).s(qe.a());
        or7 or72 = new or7(new p60(this, 3), ekd, dj6);
        s2.a(or72);
        this.y = or72;
        G.e(this.o);
        AudioRecordView audioRecordView2 = this.o;
        r60 r60 = this.m;
        audioRecordView2.G0.setText(qad.s);
        audioRecordView2.P0.setVisibility(0);
        r60 r602 = r60.a;
        View view = audioRecordView2.K0;
        ch chVar = audioRecordView2.R0;
        TextView textView = audioRecordView2.I0;
        View view2 = audioRecordView2.N0;
        ImageView imageView = audioRecordView2.J0;
        if (r60 == r602) {
            imageView.setImageResource(cad.Z0);
            view2.setVisibility(0);
            textView.setVisibility(8);
            boolean z2 = audioRecordView2.Q0;
            TranslateAnimation N = !z2 ? audioRecordView2.N(view2) : audioRecordView2.M(view2);
            TranslateAnimation translateAnimation = new TranslateAnimation(c44.DEFAULT_ASPECT_RATIO, z2 ? 7.5f : -7.5f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
            translateAnimation.setDuration(500);
            translateAnimation.setRepeatCount(-1);
            translateAnimation.setRepeatMode(2);
            translateAnimation.setInterpolator(chVar.a.l());
            audioRecordView2.O0.setAnimation(translateAnimation);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(N);
            animationSet.addAnimation(translateAnimation);
            animationSet.start();
            (!audioRecordView2.Q0 ? audioRecordView2.M(view) : audioRecordView2.N(view)).start();
        } else {
            imageView.setImageResource(cad.i);
            view2.setVisibility(8);
            textView.setVisibility(0);
            (!audioRecordView2.Q0 ? audioRecordView2.M(view) : audioRecordView2.N(view)).start();
        }
        chVar.a(imageView);
        chVar.a(audioRecordView2.L0);
        chVar.a(audioRecordView2.M0);
        Set<q60> set = this.k;
        for (q60 e2 : set) {
            e2.e();
        }
        for (q60 y2 : set) {
            y2.y(true);
        }
    }

    public final void u(boolean z2, boolean z3) {
        v();
        AudioRecordView audioRecordView = this.o;
        if (audioRecordView != null) {
            audioRecordView.L();
        }
        if (this.x > 1000) {
            AudioRecordView audioRecordView2 = this.o;
            if (audioRecordView2 != null) {
                if (z2) {
                    audioRecordView2.R0.c(audioRecordView2.L0).v(new w60(audioRecordView2, 0));
                } else {
                    audioRecordView2.setVisibility(8);
                }
            }
            s(z2);
            return;
        }
        if (z3) {
            k();
        }
        c();
    }

    public final void v() {
        Integer num;
        if (this.v == 0) {
            this.x = 0;
            this.l = new ArrayList();
        } else {
            this.x = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - this.v));
            List list = this.l;
            if (list == null || list.isEmpty()) {
                this.l = new ArrayList();
            } else {
                List list2 = this.l;
                IntEvaluator intEvaluator = new IntEvaluator();
                IntRange until = RangesKt.until(0, 1000);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    if (nextInt == 0 || list2.size() == 1) {
                        num = (Integer) list2.get(0);
                    } else if (nextInt == 999) {
                        num = (Integer) a81.i(1, list2);
                    } else {
                        float size = (((float) nextInt) / ((float) 1000)) * ((float) (list2.size() - 1));
                        int i2 = (int) size;
                        num = intEvaluator.evaluate(size - ((float) i2), (Integer) list2.get(i2), (Integer) list2.get(i2 + 1));
                    }
                    arrayList.add(num);
                }
                this.l = arrayList;
            }
        }
        this.c.C();
        d();
        Activity activity = (Activity) this.b;
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        hn4.l(activity, false);
        for (q60 h2 : this.k) {
            h2.h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r11 = this;
            boolean r0 = r11.l()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            f40 r0 = r11.c
            xy9 r0 = r0.c
            boolean r3 = r0.C
            if (r3 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            long r3 = r0.o()
            r6 = r3
            goto L_0x0018
        L_0x0017:
            r6 = r1
        L_0x0018:
            r11.d()
            ru.ok.messages.media.audio.AudioListenView r5 = r11.p
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            r1 = r6
            goto L_0x0025
        L_0x0023:
            long r1 = r11.x
        L_0x0025:
            java.lang.String r8 = h(r1)
            boolean r9 = r11.l()
            boolean r10 = r11.F
            r5.b(r6, r8, r9, r10)
            r1 = 0
            if (r0 < 0) goto L_0x0085
            boolean r0 = r11.m()
            if (r0 == 0) goto L_0x0085
            d60 r0 = new d60
            long r2 = r11.g()
            p60 r4 = new p60
            r5 = 0
            r4.<init>(r11, r5)
            xy9 r5 = r11.i
            r0.<init>(r5, r2, r4)
            r11.B = r0
            r2 = 1
            r0.o = r2
            pm7 r3 = r0.w
            if (r3 == 0) goto L_0x0056
            goto L_0x006c
        L_0x0056:
            xy9 r3 = r0.b
            etc r3 = r3.v
            c60 r4 = new c60
            r5 = 0
            r4.<init>(r0, r5)
            ps5 r5 = new ps5
            r6 = 5
            r5.<init>(r3, r4, r6)
            pm7 r3 = defpackage.bs0.K(r5, r0)
            r0.w = r3
        L_0x006c:
            xy9 r3 = r0.b
            long r4 = r3.l()
            r0.h(r4, r1)
            java.util.concurrent.CopyOnWriteArraySet r1 = r3.q
            monitor-enter(r1)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.q     // Catch:{ all -> 0x0082 }
            r3.add(r0)     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)
            r11.r(r2)
            goto L_0x008e
        L_0x0082:
            r11 = move-exception
            monitor-exit(r1)
            throw r11
        L_0x0085:
            boolean r0 = r11.m()
            if (r0 != 0) goto L_0x008e
            r11.r(r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s60.w():void");
    }

    @oye
    public void onEvent(u60 u60) {
        hi7.a0(qad.u, this.b);
        u(true, true);
    }

    @oye
    public void onEvent(z41 z41) {
        this.g.getClass();
    }
}
