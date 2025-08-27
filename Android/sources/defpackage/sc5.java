package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: sc5  reason: default package */
public final class sc5 extends j3h {
    public final Looper A0;
    public final yg0 B0;
    public final b7f C0;
    public final mc5 D0;
    public final oc5 E0;
    public final n40 F0;
    public final nxe G0;
    public final v9a H0;
    public final djd I0;
    public final long J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public int O0;
    public final tnd P0;
    public a9e Q0;
    public oob R0;
    public ts8 S0;
    public final AudioTrack T0;
    public Object U0;
    public Surface V0;
    public final int W0;
    public final ec5 X;
    public int X0;
    public final ed5 Y;
    public int Y0;
    public final d23 Z;
    public final int Z0;
    public final h30 a1;
    public final mqf b;
    public float b1;
    public final oob c;
    public boolean c1;
    public List d1;
    public final boolean e1;
    public boolean f1;
    public final gn4 g1;
    public ts8 h1;
    public dob i1;
    public int j1;
    public long k1;
    public final bv1 o = new bv1(1, false, false);
    public final Context v;
    public final CopyOnWriteArraySet v0;
    public final j3h w;
    public final dkf w0;
    public final ok0[] x;
    public final ArrayList x0;
    public final oe8 y;
    public final boolean y0;
    public final j7f z;
    public final vb4 z0;

    static {
        gd5.a("goog.exo.exoplayer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: sc5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: sc5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: sc5} */
    /* JADX WARNING: type inference failed for: r12v1, types: [oc5, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sc5(defpackage.ub5 r31, defpackage.j3h r32) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            r3 = 20
            r5 = 1
            r6 = 0
            r7 = 2
            r1.<init>((int) r7)
            bv1 r8 = new bv1
            r8.<init>(r5, r6, r6)
            r1.o = r8
            int r8 = java.lang.System.identityHashCode(r30)     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.Integer.toHexString(r8)     // Catch:{ all -> 0x019e }
            java.lang.String r9 = defpackage.t0g.e     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x019e }
            int r8 = r8.length()     // Catch:{ all -> 0x019e }
            int r8 = r8 + 30
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019e }
            int r9 = r9.length()     // Catch:{ all -> 0x019e }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r9.<init>(r8)     // Catch:{ all -> 0x019e }
            android.content.Context r8 = r0.a     // Catch:{ all -> 0x019e }
            android.os.Looper r9 = r0.i
            android.content.Context r10 = r8.getApplicationContext()     // Catch:{ all -> 0x019e }
            r1.v = r10     // Catch:{ all -> 0x019e }
            yi6 r10 = r0.h     // Catch:{ all -> 0x019e }
            b7f r11 = r0.b
            java.lang.Object r10 = r10.apply(r11)     // Catch:{ all -> 0x019e }
            vb4 r10 = (defpackage.vb4) r10     // Catch:{ all -> 0x019e }
            r1.z0 = r10     // Catch:{ all -> 0x019e }
            h30 r10 = r0.j     // Catch:{ all -> 0x019e }
            r1.a1 = r10     // Catch:{ all -> 0x019e }
            int r10 = r0.k     // Catch:{ all -> 0x019e }
            r1.W0 = r10     // Catch:{ all -> 0x019e }
            r1.c1 = r6     // Catch:{ all -> 0x019e }
            long r12 = r0.o     // Catch:{ all -> 0x019e }
            r1.J0 = r12     // Catch:{ all -> 0x019e }
            mc5 r10 = new mc5     // Catch:{ all -> 0x019e }
            r10.<init>(r1)     // Catch:{ all -> 0x019e }
            r1.D0 = r10     // Catch:{ all -> 0x019e }
            oc5 r12 = new oc5     // Catch:{ all -> 0x019e }
            r12.<init>()     // Catch:{ all -> 0x019e }
            r1.E0 = r12     // Catch:{ all -> 0x019e }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x019e }
            r12.<init>(r9)     // Catch:{ all -> 0x019e }
            s2f r13 = r0.c     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            r14 = r13
            ebf r14 = (defpackage.ebf) r14     // Catch:{ all -> 0x019e }
            r15 = r12
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            ok0[] r10 = r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x019e }
            r1.x = r10     // Catch:{ all -> 0x019e }
            int r13 = r10.length     // Catch:{ all -> 0x019e }
            if (r13 <= 0) goto L_0x0089
            r13 = r5
            goto L_0x008a
        L_0x0089:
            r13 = r6
        L_0x008a:
            defpackage.y64.j(r13)     // Catch:{ all -> 0x019e }
            s2f r13 = r0.e     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            oe8 r13 = (defpackage.oe8) r13     // Catch:{ all -> 0x019e }
            r1.y = r13     // Catch:{ all -> 0x019e }
            s2f r13 = r0.d     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            kz8 r13 = (defpackage.kz8) r13     // Catch:{ all -> 0x019e }
            s2f r13 = r0.g     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            yg0 r13 = (defpackage.yg0) r13     // Catch:{ all -> 0x019e }
            r1.B0 = r13     // Catch:{ all -> 0x019e }
            boolean r13 = r0.l     // Catch:{ all -> 0x019e }
            r1.y0 = r13     // Catch:{ all -> 0x019e }
            tnd r13 = r0.m     // Catch:{ all -> 0x019e }
            r1.P0 = r13     // Catch:{ all -> 0x019e }
            r1.A0 = r9     // Catch:{ all -> 0x019e }
            r1.C0 = r11     // Catch:{ all -> 0x019e }
            if (r32 != 0) goto L_0x00b9
            r13 = r1
            goto L_0x00bb
        L_0x00b9:
            r13 = r32
        L_0x00bb:
            r1.w = r13     // Catch:{ all -> 0x019e }
            d23 r13 = new d23     // Catch:{ all -> 0x019e }
            ec5 r14 = new ec5     // Catch:{ all -> 0x019e }
            r14.<init>(r1)     // Catch:{ all -> 0x019e }
            r13.<init>((android.os.Looper) r9, (defpackage.b7f) r11, (defpackage.j08) r14)     // Catch:{ all -> 0x019e }
            r1.Z = r13     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r9 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.v0 = r9     // Catch:{ all -> 0x019e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.x0 = r9     // Catch:{ all -> 0x019e }
            a9e r9 = new a9e     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.Q0 = r9     // Catch:{ all -> 0x019e }
            mqf r9 = new mqf     // Catch:{ all -> 0x019e }
            int r11 = r10.length     // Catch:{ all -> 0x019e }
            r1d[] r11 = new defpackage.r1d[r11]     // Catch:{ all -> 0x019e }
            int r10 = r10.length     // Catch:{ all -> 0x019e }
            ld5[] r10 = new defpackage.ld5[r10]     // Catch:{ all -> 0x019e }
            sqf r13 = defpackage.sqf.b     // Catch:{ all -> 0x019e }
            r14 = 0
            r9.<init>((defpackage.r1d[]) r11, (defpackage.ld5[]) r10, (defpackage.sqf) r13, (defpackage.me8) r14)     // Catch:{ all -> 0x019e }
            r1.b = r9     // Catch:{ all -> 0x019e }
            dkf r9 = new dkf     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.w0 = r9     // Catch:{ all -> 0x019e }
            android.util.SparseBooleanArray r9 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            int[] r10 = new int[r3]     // Catch:{ all -> 0x019e }
            r10 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28} // fill-array     // Catch:{ all -> 0x019e }
            r11 = r6
        L_0x0100:
            if (r11 >= r3) goto L_0x010e
            r13 = r10[r11]     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            defpackage.y64.j(r15)     // Catch:{ all -> 0x019e }
            r9.append(r13, r5)     // Catch:{ all -> 0x019e }
            int r11 = r11 + r5
            goto L_0x0100
        L_0x010e:
            oe8 r3 = r1.y     // Catch:{ all -> 0x019e }
            r3.getClass()     // Catch:{ all -> 0x019e }
            r3 = r6 ^ 1
            defpackage.y64.j(r3)     // Catch:{ all -> 0x019e }
            r3 = 29
            r9.append(r3, r5)     // Catch:{ all -> 0x019e }
            oob r10 = new oob     // Catch:{ all -> 0x019e }
            r11 = r6 ^ 1
            defpackage.y64.j(r11)     // Catch:{ all -> 0x019e }
            wq5 r11 = new wq5     // Catch:{ all -> 0x019e }
            r11.<init>(r9)     // Catch:{ all -> 0x019e }
            r10.<init>(r11)     // Catch:{ all -> 0x019e }
            r1.c = r10     // Catch:{ all -> 0x019e }
            android.util.SparseBooleanArray r9 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r10 = r6
        L_0x0134:
            android.util.SparseBooleanArray r13 = r11.a     // Catch:{ all -> 0x019e }
            int r13 = r13.size()     // Catch:{ all -> 0x019e }
            if (r10 >= r13) goto L_0x014a
            int r13 = r11.a(r10)     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            defpackage.y64.j(r15)     // Catch:{ all -> 0x019e }
            r9.append(r13, r5)     // Catch:{ all -> 0x019e }
            int r10 = r10 + r5
            goto L_0x0134
        L_0x014a:
            r10 = r6 ^ 1
            defpackage.y64.j(r10)     // Catch:{ all -> 0x019e }
            r10 = 4
            r9.append(r10, r5)     // Catch:{ all -> 0x019e }
            r11 = r6 ^ 1
            defpackage.y64.j(r11)     // Catch:{ all -> 0x019e }
            r11 = 10
            r9.append(r11, r5)     // Catch:{ all -> 0x019e }
            oob r13 = new oob     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            defpackage.y64.j(r15)     // Catch:{ all -> 0x019e }
            wq5 r15 = new wq5     // Catch:{ all -> 0x019e }
            r15.<init>(r9)     // Catch:{ all -> 0x019e }
            r13.<init>(r15)     // Catch:{ all -> 0x019e }
            r1.R0 = r13     // Catch:{ all -> 0x019e }
            b7f r9 = r1.C0     // Catch:{ all -> 0x019e }
            android.os.Looper r13 = r1.A0     // Catch:{ all -> 0x019e }
            j7f r9 = r9.a(r13, r14)     // Catch:{ all -> 0x019e }
            r1.z = r9     // Catch:{ all -> 0x019e }
            ec5 r9 = new ec5     // Catch:{ all -> 0x019e }
            r9.<init>(r1)     // Catch:{ all -> 0x019e }
            r1.X = r9     // Catch:{ all -> 0x019e }
            mqf r13 = r1.b     // Catch:{ all -> 0x019e }
            dob r13 = defpackage.dob.h(r13)     // Catch:{ all -> 0x019e }
            r1.i1 = r13     // Catch:{ all -> 0x019e }
            vb4 r13 = r1.z0     // Catch:{ all -> 0x019e }
            j3h r15 = r1.w     // Catch:{ all -> 0x019e }
            android.os.Looper r10 = r1.A0     // Catch:{ all -> 0x019e }
            r13.R(r15, r10)     // Catch:{ all -> 0x019e }
            int r10 = defpackage.t0g.a     // Catch:{ all -> 0x019e }
            r13 = 31
            if (r10 >= r13) goto L_0x01a1
            lpb r13 = new lpb     // Catch:{ all -> 0x019e }
            r13.<init>()     // Catch:{ all -> 0x019e }
        L_0x019b:
            r29 = r13
            goto L_0x01a6
        L_0x019e:
            r0 = move-exception
            goto L_0x0343
        L_0x01a1:
            lpb r13 = defpackage.jc5.a()     // Catch:{ all -> 0x019e }
            goto L_0x019b
        L_0x01a6:
            ed5 r13 = new ed5     // Catch:{ all -> 0x019e }
            ok0[] r15 = r1.x     // Catch:{ all -> 0x019e }
            oe8 r7 = r1.y     // Catch:{ all -> 0x019e }
            mqf r11 = r1.b     // Catch:{ all -> 0x019e }
            s2f r3 = r0.f     // Catch:{ all -> 0x019e }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x019e }
            r19 = r3
            sg4 r19 = (defpackage.sg4) r19     // Catch:{ all -> 0x019e }
            yg0 r3 = r1.B0     // Catch:{ all -> 0x019e }
            int r4 = r1.K0     // Catch:{ all -> 0x019e }
            vb4 r5 = r1.z0     // Catch:{ all -> 0x019e }
            tnd r14 = r1.P0     // Catch:{ all -> 0x019e }
            qg4 r0 = r0.n     // Catch:{ all -> 0x019e }
            android.os.Looper r2 = r1.A0     // Catch:{ all -> 0x019e }
            b7f r6 = r1.C0     // Catch:{ all -> 0x019e }
            r25 = 0
            r16 = r15
            r15 = r13
            r17 = r7
            r18 = r11
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r14
            r24 = r0
            r26 = r2
            r27 = r6
            r28 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x019e }
            r1.Y = r13     // Catch:{ all -> 0x019e }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.b1 = r0     // Catch:{ all -> 0x019e }
            r0 = 0
            r1.K0 = r0     // Catch:{ all -> 0x019e }
            ts8 r0 = defpackage.ts8.Q0     // Catch:{ all -> 0x019e }
            r1.S0 = r0     // Catch:{ all -> 0x019e }
            r1.h1 = r0     // Catch:{ all -> 0x019e }
            r0 = -1
            r1.j1 = r0     // Catch:{ all -> 0x019e }
            r2 = 21
            if (r10 >= r2) goto L_0x022c
            android.media.AudioTrack r0 = r1.T0     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x020a
            int r0 = r0.getAudioSessionId()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x020a
            android.media.AudioTrack r0 = r1.T0     // Catch:{ all -> 0x019e }
            r0.release()     // Catch:{ all -> 0x019e }
            r0 = 0
            r1.T0 = r0     // Catch:{ all -> 0x019e }
        L_0x020a:
            android.media.AudioTrack r0 = r1.T0     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x0223
            android.media.AudioTrack r0 = new android.media.AudioTrack     // Catch:{ all -> 0x019e }
            r15 = 4000(0xfa0, float:5.605E-42)
            r16 = 4
            r17 = 2
            r18 = 2
            r20 = 0
            r14 = 3
            r19 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x019e }
            r1.T0 = r0     // Catch:{ all -> 0x019e }
        L_0x0223:
            android.media.AudioTrack r0 = r1.T0     // Catch:{ all -> 0x019e }
            int r0 = r0.getAudioSessionId()     // Catch:{ all -> 0x019e }
            r1.Z0 = r0     // Catch:{ all -> 0x019e }
            goto L_0x023f
        L_0x022c:
            android.content.Context r2 = r1.v     // Catch:{ all -> 0x019e }
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x019e }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ all -> 0x019e }
            if (r2 != 0) goto L_0x0239
            goto L_0x023d
        L_0x0239:
            int r0 = r2.generateAudioSessionId()     // Catch:{ all -> 0x019e }
        L_0x023d:
            r1.Z0 = r0     // Catch:{ all -> 0x019e }
        L_0x023f:
            k0d r0 = defpackage.k0d.v     // Catch:{ all -> 0x019e }
            r0 = 1
            r1.e1 = r0     // Catch:{ all -> 0x019e }
            vb4 r0 = r1.z0     // Catch:{ all -> 0x019e }
            r0.getClass()     // Catch:{ all -> 0x019e }
            d23 r2 = r1.Z     // Catch:{ all -> 0x019e }
            r2.getClass()     // Catch:{ all -> 0x019e }
            l08 r3 = new l08     // Catch:{ all -> 0x019e }
            r3.<init>(r0)     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r2.o     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch:{ all -> 0x019e }
            r0.add(r3)     // Catch:{ all -> 0x019e }
            yg0 r0 = r1.B0     // Catch:{ all -> 0x019e }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x019e }
            android.os.Looper r3 = r1.A0     // Catch:{ all -> 0x019e }
            r2.<init>(r3)     // Catch:{ all -> 0x019e }
            vb4 r3 = r1.z0     // Catch:{ all -> 0x019e }
            vc4 r0 = (defpackage.vc4) r0     // Catch:{ all -> 0x019e }
            r0.b(r3, r2)     // Catch:{ all -> 0x019e }
            mc5 r0 = r1.D0     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.v0     // Catch:{ all -> 0x019e }
            r2.add(r0)     // Catch:{ all -> 0x019e }
            he r0 = new he     // Catch:{ all -> 0x019e }
            mc5 r2 = r1.D0     // Catch:{ all -> 0x019e }
            r0.<init>((android.content.Context) r8, (android.os.Handler) r12, (defpackage.mc5) r2)     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r0.o     // Catch:{ all -> 0x019e }
            l30 r2 = (defpackage.l30) r2     // Catch:{ all -> 0x019e }
            java.lang.Object r3 = r0.c     // Catch:{ all -> 0x019e }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x019e }
            boolean r4 = r0.b     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x028a
            r3.unregisterReceiver(r2)     // Catch:{ all -> 0x019e }
            r2 = 0
            r0.b = r2     // Catch:{ all -> 0x019e }
        L_0x028a:
            n40 r0 = new n40     // Catch:{ all -> 0x019e }
            mc5 r2 = r1.D0     // Catch:{ all -> 0x019e }
            r0.<init>((android.content.Context) r8, (android.os.Handler) r12, (defpackage.mc5) r2)     // Catch:{ all -> 0x019e }
            r1.F0 = r0     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r0.i     // Catch:{ all -> 0x019e }
            h30 r2 = (defpackage.h30) r2     // Catch:{ all -> 0x019e }
            r3 = 0
            boolean r2 = defpackage.t0g.a(r2, r3)     // Catch:{ all -> 0x019e }
            if (r2 != 0) goto L_0x02a3
            r0.i = r3     // Catch:{ all -> 0x019e }
            r2 = 0
            r0.d = r2     // Catch:{ all -> 0x019e }
        L_0x02a3:
            nxe r0 = new nxe     // Catch:{ all -> 0x019e }
            mc5 r2 = r1.D0     // Catch:{ all -> 0x019e }
            r0.<init>(r8, r12, r2)     // Catch:{ all -> 0x019e }
            r1.G0 = r0     // Catch:{ all -> 0x019e }
            h30 r2 = r1.a1     // Catch:{ all -> 0x019e }
            int r2 = r2.c     // Catch:{ all -> 0x019e }
            int r2 = defpackage.t0g.x(r2)     // Catch:{ all -> 0x019e }
            int r3 = r0.d     // Catch:{ all -> 0x019e }
            if (r3 != r2) goto L_0x02b9
            goto L_0x02df
        L_0x02b9:
            r0.d = r2     // Catch:{ all -> 0x019e }
            r0.b()     // Catch:{ all -> 0x019e }
            mc5 r2 = r0.b     // Catch:{ all -> 0x019e }
            sc5 r2 = r2.a     // Catch:{ all -> 0x019e }
            nxe r3 = r2.G0     // Catch:{ all -> 0x019e }
            gn4 r3 = o1(r3)     // Catch:{ all -> 0x019e }
            gn4 r4 = r2.g1     // Catch:{ all -> 0x019e }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x019e }
            if (r4 != 0) goto L_0x02df
            r2.g1 = r3     // Catch:{ all -> 0x019e }
            lc5 r4 = new lc5     // Catch:{ all -> 0x019e }
            r5 = 3
            r4.<init>((int) r5, (java.lang.Object) r3)     // Catch:{ all -> 0x019e }
            d23 r2 = r2.Z     // Catch:{ all -> 0x019e }
            r3 = 29
            r2.r(r3, r4)     // Catch:{ all -> 0x019e }
        L_0x02df:
            v9a r2 = new v9a     // Catch:{ all -> 0x019e }
            r2.<init>((android.content.Context) r8)     // Catch:{ all -> 0x019e }
            r1.H0 = r2     // Catch:{ all -> 0x019e }
            djd r2 = new djd     // Catch:{ all -> 0x019e }
            r2.<init>((android.content.Context) r8)     // Catch:{ all -> 0x019e }
            r1.I0 = r2     // Catch:{ all -> 0x019e }
            gn4 r0 = o1(r0)     // Catch:{ all -> 0x019e }
            r1.g1 = r0     // Catch:{ all -> 0x019e }
            int r0 = r1.Z0     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 10
            r3 = 1
            r1.y1(r3, r2, r0)     // Catch:{ all -> 0x019e }
            int r0 = r1.Z0     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r4 = 2
            r1.y1(r4, r2, r0)     // Catch:{ all -> 0x019e }
            h30 r0 = r1.a1     // Catch:{ all -> 0x019e }
            r2 = 3
            r1.y1(r3, r2, r0)     // Catch:{ all -> 0x019e }
            int r0 = r1.W0     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 4
            r1.y1(r4, r2, r0)     // Catch:{ all -> 0x019e }
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 5
            r1.y1(r4, r2, r0)     // Catch:{ all -> 0x019e }
            boolean r0 = r1.c1     // Catch:{ all -> 0x019e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 9
            r3 = 1
            r1.y1(r3, r2, r0)     // Catch:{ all -> 0x019e }
            oc5 r0 = r1.E0     // Catch:{ all -> 0x019e }
            r2 = 7
            r3 = 2
            r1.y1(r3, r2, r0)     // Catch:{ all -> 0x019e }
            oc5 r0 = r1.E0     // Catch:{ all -> 0x019e }
            r2 = 6
            r3 = 8
            r1.y1(r2, r3, r0)     // Catch:{ all -> 0x019e }
            bv1 r0 = r1.o
            r0.g()
            return
        L_0x0343:
            bv1 r1 = r1.o
            r1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc5.<init>(ub5, j3h):void");
    }

    public static gn4 o1(nxe nxe) {
        nxe.getClass();
        int i = t0g.a;
        AudioManager audioManager = nxe.c;
        return new gn4(0, i >= 28 ? audioManager.getStreamMinVolume(nxe.d) : 0, audioManager.getStreamMaxVolume(nxe.d));
    }

    public static long s1(dob dob) {
        gkf gkf = new gkf();
        dkf dkf = new dkf();
        dob.a.h(dob.b.a, dkf);
        long j = dob.c;
        if (j != -9223372036854775807L) {
            return dkf.v + j;
        }
        return dob.a.n(dkf.c, gkf, 0).v0;
    }

    public static boolean t1(dob dob) {
        return dob.e == 3 && dob.l && dob.m == 0;
    }

    public final void A1(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (ok0 ok0 : this.x) {
            if (ok0.a == 2) {
                tpb p1 = p1(ok0);
                y64.j(!p1.g);
                p1.d = 1;
                y64.j(true ^ p1.g);
                p1.e = surface;
                p1.c();
                arrayList.add(p1);
            }
        }
        Object obj = this.U0;
        if (!(obj == null || obj == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((tpb) it.next()).a(this.J0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            Object obj2 = this.U0;
            Surface surface2 = this.V0;
            if (obj2 == surface2) {
                surface2.release();
                this.V0 = null;
            }
        }
        this.U0 = surface;
        if (z2) {
            B1(new ExoPlaybackException(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final void B1(ExoPlaybackException exoPlaybackException) {
        dob dob = this.i1;
        dob a = dob.a(dob.b);
        a.q = a.s;
        a.r = 0;
        boolean z2 = true;
        dob f = a.f(1);
        if (exoPlaybackException != null) {
            f = f.e(exoPlaybackException);
        }
        dob dob2 = f;
        this.L0++;
        j7f j7f = this.Y.y;
        j7f.getClass();
        h7f b2 = j7f.b();
        b2.a = j7f.a.obtainMessage(6);
        b2.b();
        if (!dob2.a.q() || this.i1.a.q()) {
            z2 = false;
        }
        E1(dob2, 0, 1, false, z2, 4, q1(dob2), -1);
    }

    public final void C1() {
        int i;
        int i2;
        boolean z2 = false;
        oob oob = this.R0;
        int i3 = t0g.a;
        j3h j3h = this.w;
        boolean k = j3h.k();
        ikf V02 = j3h.V0();
        boolean q = V02.q();
        gkf gkf = (gkf) j3h.a;
        boolean z3 = !q && V02.n(j3h.d0(), gkf, 0).y;
        ikf V03 = j3h.V0();
        if (V03.q()) {
            i = -1;
        } else {
            int d0 = j3h.d0();
            int repeatMode = j3h.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            j3h.X0();
            i = V03.l(d0, repeatMode, false);
        }
        boolean z4 = i != -1;
        ikf V04 = j3h.V0();
        if (V04.q()) {
            i2 = -1;
        } else {
            int d02 = j3h.d0();
            int repeatMode2 = j3h.getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            j3h.X0();
            i2 = V04.e(d02, repeatMode2, false);
        }
        boolean z5 = i2 != -1;
        ikf V05 = j3h.V0();
        boolean z6 = !V05.q() && V05.n(j3h.d0(), gkf, 0).a();
        ikf V06 = j3h.V0();
        boolean z7 = !V06.q() && V06.n(j3h.d0(), gkf, 0).z;
        boolean q2 = j3h.V0().q();
        nob nob = new nob(0);
        wq5 wq5 = this.c.a;
        vq5 vq5 = (vq5) nob.a;
        vq5.getClass();
        for (int i4 = 0; i4 < wq5.a.size(); i4++) {
            vq5.a(wq5.a(i4));
        }
        boolean z8 = !k;
        nob.q(4, z8);
        nob.q(5, z3 && !k);
        nob.q(6, z4 && !k);
        nob.q(7, !q2 && (z4 || !z6 || z3) && !k);
        nob.q(8, z5 && !k);
        nob.q(9, !q2 && (z5 || (z6 && z7)) && !k);
        nob.q(10, z8);
        nob.q(11, z3 && !k);
        if (z3 && !k) {
            z2 = true;
        }
        nob.q(12, z2);
        oob oob2 = new oob(vq5.d());
        this.R0 = oob2;
        if (!oob2.equals(oob)) {
            this.Z.q(13, new ec5(this));
        }
    }

    public final void D1(int i, int i2, boolean z2) {
        int i3 = 0;
        boolean z3 = z2 && i != -1;
        if (z3 && i != 1) {
            i3 = 1;
        }
        dob dob = this.i1;
        if (dob.l != z3 || dob.m != i3) {
            this.L0++;
            dob d = dob.d(i3, z3);
            j7f j7f = this.Y.y;
            j7f.getClass();
            h7f b2 = j7f.b();
            b2.a = j7f.a.obtainMessage(1, z3 ? 1 : 0, i3);
            b2.b();
            E1(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0290  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1(defpackage.dob r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            dob r3 = r0.i1
            r0.i1 = r1
            ikf r4 = r3.a
            ikf r5 = r1.a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            ikf r6 = r3.a
            ikf r7 = r1.a
            boolean r8 = r7.q()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.q()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
            goto L_0x00ba
        L_0x0035:
            boolean r8 = r7.q()
            boolean r12 = r6.q()
            if (r8 == r12) goto L_0x004c
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00ba
        L_0x004c:
            mz8 r8 = r3.b
            java.lang.Object r12 = r8.a
            dkf r11 = r0.w0
            dkf r12 = r6.h(r12, r11)
            int r12 = r12.c
            java.lang.Object r9 = r0.a
            gkf r9 = (defpackage.gkf) r9
            gkf r6 = r6.n(r12, r9, r13)
            java.lang.Object r6 = r6.a
            mz8 r12 = r1.b
            java.lang.Object r15 = r12.a
            dkf r11 = r7.h(r15, r11)
            int r11 = r11.c
            gkf r7 = r7.n(r11, r9, r13)
            java.lang.Object r7 = r7.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            if (r45 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r4 = r5
            goto L_0x0087
        L_0x007e:
            if (r45 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0084
            r4 = 2
            goto L_0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0094
            r4 = 3
        L_0x0087:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00ba
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x009a:
            if (r45 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x00b3
            long r6 = r8.d
            long r8 = r12.d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.<init>(r6, r8)
            goto L_0x00ba
        L_0x00b3:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
        L_0x00ba:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            ts8 r7 = r0.S0
            if (r6 == 0) goto L_0x00f7
            ikf r9 = r1.a
            boolean r9 = r9.q()
            if (r9 != 0) goto L_0x00f1
            ikf r9 = r1.a
            mz8 r10 = r1.b
            java.lang.Object r10 = r10.a
            dkf r11 = r0.w0
            dkf r9 = r9.h(r10, r11)
            int r9 = r9.c
            ikf r10 = r1.a
            java.lang.Object r11 = r0.a
            gkf r11 = (defpackage.gkf) r11
            gkf r9 = r10.n(r9, r11, r13)
            gr8 r9 = r9.c
            goto L_0x00f2
        L_0x00f1:
            r9 = 0
        L_0x00f2:
            ts8 r10 = defpackage.ts8.Q0
            r0.h1 = r10
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            if (r6 != 0) goto L_0x0104
            java.util.List r10 = r3.j
            java.util.List r11 = r1.j
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0139
        L_0x0104:
            ts8 r7 = r0.h1
            rs8 r7 = r7.a()
            java.util.List r10 = r1.j
            r11 = 0
        L_0x010d:
            int r12 = r10.size()
            if (r11 >= r12) goto L_0x012e
            java.lang.Object r12 = r10.get(r11)
            rp9 r12 = (defpackage.rp9) r12
            r15 = 0
        L_0x011a:
            pp9[] r8 = r12.a
            int r13 = r8.length
            if (r15 >= r13) goto L_0x0129
            r8 = r8[r15]
            r8.o(r7)
            int r15 = r15 + 1
            r13 = 0
            goto L_0x011a
        L_0x0129:
            int r11 = r11 + 1
            r13 = 0
            goto L_0x010d
        L_0x012e:
            ts8 r8 = new ts8
            r8.<init>(r7)
            r0.h1 = r8
            ts8 r7 = r40.n1()
        L_0x0139:
            ts8 r8 = r0.S0
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.S0 = r7
            boolean r7 = r3.l
            boolean r10 = r1.l
            if (r7 == r10) goto L_0x014a
            r7 = r5
            goto L_0x014b
        L_0x014a:
            r7 = 0
        L_0x014b:
            int r10 = r3.e
            int r11 = r1.e
            if (r10 == r11) goto L_0x0153
            r10 = r5
            goto L_0x0154
        L_0x0153:
            r10 = 0
        L_0x0154:
            if (r10 != 0) goto L_0x0158
            if (r7 == 0) goto L_0x015b
        L_0x0158:
            r40.F1()
        L_0x015b:
            boolean r11 = r3.g
            boolean r12 = r1.g
            if (r11 == r12) goto L_0x0163
            r11 = r5
            goto L_0x0164
        L_0x0163:
            r11 = 0
        L_0x0164:
            ikf r12 = r3.a
            ikf r13 = r1.a
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x017c
            d23 r12 = r0.Z
            cc5 r13 = new cc5
            r14 = 0
            r15 = r42
            r13.<init>(r1, r15, r14)
            r14 = 0
            r12.q(r14, r13)
        L_0x017c:
            if (r45 == 0) goto L_0x02b3
            dkf r12 = new dkf
            r12.<init>()
            ikf r13 = r3.a
            boolean r13 = r13.q()
            if (r13 != 0) goto L_0x01c1
            mz8 r13 = r3.b
            java.lang.Object r13 = r13.a
            ikf r14 = r3.a
            r14.h(r13, r12)
            int r14 = r12.c
            ikf r15 = r3.a
            int r15 = r15.b(r13)
            ikf r5 = r3.a
            r42 = r13
            java.lang.Object r13 = r0.a
            gkf r13 = (defpackage.gkf) r13
            r16 = r10
            r17 = r11
            r10 = 0
            gkf r5 = r5.n(r14, r13, r10)
            java.lang.Object r5 = r5.a
            java.lang.Object r10 = r0.a
            gkf r10 = (defpackage.gkf) r10
            gr8 r10 = r10.c
            r22 = r42
            r19 = r5
            r21 = r10
            r20 = r14
            r23 = r15
            goto L_0x01cf
        L_0x01c1:
            r16 = r10
            r17 = r11
            r20 = r49
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01cf:
            if (r2 != 0) goto L_0x01fd
            mz8 r5 = r3.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x01e8
            mz8 r5 = r3.b
            int r10 = r5.b
            int r5 = r5.c
            long r10 = r12.a(r10, r5)
            long r12 = s1(r3)
            goto L_0x0211
        L_0x01e8:
            mz8 r5 = r3.b
            int r5 = r5.e
            r10 = -1
            if (r5 == r10) goto L_0x01f7
            dob r5 = r0.i1
            long r10 = s1(r5)
        L_0x01f5:
            r12 = r10
            goto L_0x0211
        L_0x01f7:
            long r10 = r12.v
            long r12 = r12.o
        L_0x01fb:
            long r10 = r10 + r12
            goto L_0x01f5
        L_0x01fd:
            mz8 r5 = r3.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x020c
            long r10 = r3.s
            long r12 = s1(r3)
            goto L_0x0211
        L_0x020c:
            long r10 = r12.v
            long r12 = r3.s
            goto L_0x01fb
        L_0x0211:
            tob r5 = new tob
            long r24 = defpackage.t0g.M(r10)
            long r26 = defpackage.t0g.M(r12)
            mz8 r10 = r3.b
            int r11 = r10.b
            int r10 = r10.c
            r18 = r5
            r28 = r11
            r29 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r10 = r40.d0()
            dob r11 = r0.i1
            ikf r11 = r11.a
            boolean r11 = r11.q()
            if (r11 != 0) goto L_0x026b
            dob r11 = r0.i1
            mz8 r12 = r11.b
            java.lang.Object r12 = r12.a
            ikf r11 = r11.a
            dkf r13 = r0.w0
            r11.h(r12, r13)
            dob r11 = r0.i1
            ikf r11 = r11.a
            int r11 = r11.b(r12)
            dob r13 = r0.i1
            ikf r13 = r13.a
            java.lang.Object r14 = r0.a
            gkf r14 = (defpackage.gkf) r14
            r42 = r11
            r15 = r12
            r11 = 0
            gkf r11 = r13.n(r10, r14, r11)
            java.lang.Object r11 = r11.a
            gr8 r12 = r14.c
            r33 = r42
            r29 = r11
            r31 = r12
            r32 = r15
            goto L_0x0273
        L_0x026b:
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x0273:
            long r34 = defpackage.t0g.M(r47)
            tob r11 = new tob
            dob r12 = r0.i1
            mz8 r12 = r12.b
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x0290
            dob r12 = r0.i1
            long r12 = s1(r12)
            long r12 = defpackage.t0g.M(r12)
            r36 = r12
            goto L_0x0292
        L_0x0290:
            r36 = r34
        L_0x0292:
            dob r12 = r0.i1
            mz8 r12 = r12.b
            int r13 = r12.b
            int r12 = r12.c
            r28 = r11
            r30 = r10
            r38 = r13
            r39 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            d23 r10 = r0.Z
            oj0 r12 = new oj0
            r13 = 4
            r12.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r11, (int) r13)
            r2 = 11
            r10.q(r2, r12)
            goto L_0x02b7
        L_0x02b3:
            r16 = r10
            r17 = r11
        L_0x02b7:
            if (r6 == 0) goto L_0x02c5
            d23 r2 = r0.Z
            ud0 r5 = new ud0
            r6 = 5
            r5.<init>(r9, r4, r6)
            r4 = 1
            r2.q(r4, r5)
        L_0x02c5:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r3.f
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f
            if (r2 == r4) goto L_0x02e7
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 10
            r2.q(r5, r4)
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.f
            if (r2 == 0) goto L_0x02e7
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r6 = 1
            r4.<init>(r1, r6)
            r2.q(r5, r4)
        L_0x02e7:
            mqf r2 = r3.i
            mqf r4 = r1.i
            if (r2 == r4) goto L_0x031b
            oe8 r2 = r0.y
            java.lang.Object r4 = r4.c
            r2.getClass()
            me8 r4 = (defpackage.me8) r4
            r2.c = r4
            cqf r2 = new cqf
            mqf r4 = r1.i
            java.lang.Object r4 = r4.v
            ld5[] r4 = (defpackage.ld5[]) r4
            r2.<init>(r4)
            d23 r4 = r0.Z
            ib4 r5 = new ib4
            r6 = 15
            r5.<init>(r6, r1, r2)
            r2 = 2
            r4.q(r2, r5)
            d23 r4 = r0.Z
            ac5 r5 = new ac5
            r6 = 2
            r5.<init>(r1, r6)
            r4.q(r2, r5)
        L_0x031b:
            if (r8 == 0) goto L_0x032d
            ts8 r2 = r0.S0
            d23 r4 = r0.Z
            rt3 r5 = new rt3
            r6 = 27
            r5.<init>((int) r6, (java.lang.Object) r2)
            r2 = 14
            r4.q(r2, r5)
        L_0x032d:
            if (r17 == 0) goto L_0x033b
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 3
            r2.q(r5, r4)
        L_0x033b:
            if (r16 != 0) goto L_0x033f
            if (r7 == 0) goto L_0x034b
        L_0x033f:
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 4
            r4.<init>(r1, r5)
            r5 = -1
            r2.q(r5, r4)
        L_0x034b:
            if (r16 == 0) goto L_0x0359
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 4
            r2.q(r5, r4)
        L_0x0359:
            if (r7 == 0) goto L_0x0369
            d23 r2 = r0.Z
            cc5 r4 = new cc5
            r5 = 1
            r6 = r43
            r4.<init>(r1, r6, r5)
            r5 = 5
            r2.q(r5, r4)
        L_0x0369:
            int r2 = r3.m
            int r4 = r1.m
            if (r2 == r4) goto L_0x037a
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 6
            r4.<init>(r1, r5)
            r2.q(r5, r4)
        L_0x037a:
            boolean r2 = t1(r3)
            boolean r4 = t1(r41)
            if (r2 == r4) goto L_0x038f
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 7
            r4.<init>(r1, r5)
            r2.q(r5, r4)
        L_0x038f:
            fob r2 = r3.n
            fob r4 = r1.n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a7
            d23 r2 = r0.Z
            ac5 r4 = new ac5
            r5 = 8
            r4.<init>(r1, r5)
            r5 = 12
            r2.q(r5, r4)
        L_0x03a7:
            if (r44 == 0) goto L_0x03b6
            d23 r2 = r0.Z
            lw4 r4 = new lw4
            r5 = 11
            r4.<init>(r5)
            r5 = -1
            r2.q(r5, r4)
        L_0x03b6:
            r40.C1()
            d23 r2 = r0.Z
            r2.h()
            boolean r2 = r3.o
            boolean r4 = r1.o
            if (r2 == r4) goto L_0x03da
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.v0
            java.util.Iterator r2 = r2.iterator()
        L_0x03ca:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03da
            java.lang.Object r4 = r2.next()
            mc5 r4 = (defpackage.mc5) r4
            r4.getClass()
            goto L_0x03ca
        L_0x03da:
            boolean r2 = r3.p
            boolean r1 = r1.p
            if (r2 == r1) goto L_0x03f8
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.v0
            java.util.Iterator r0 = r0.iterator()
        L_0x03e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03f8
            java.lang.Object r1 = r0.next()
            mc5 r1 = (defpackage.mc5) r1
            sc5 r1 = r1.a
            r1.F1()
            goto L_0x03e6
        L_0x03f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc5.E1(dob, int, int, boolean, boolean, int, long, int):void");
    }

    public final void F1() {
        G1();
        int i = this.i1.e;
        djd djd = this.I0;
        v9a v9a = this.H0;
        if (i != 1) {
            if (i == 2 || i == 3) {
                G1();
                boolean z2 = this.i1.p;
                boolean q = q();
                v9a.getClass();
                q();
                djd.getClass();
                return;
            } else if (i != 4) {
                throw new IllegalStateException();
            }
        }
        v9a.getClass();
        djd.getClass();
    }

    public final void G1() {
        this.o.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.A0;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = t0g.a;
            Locale locale = Locale.US;
            String p = rae.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (!this.e1) {
                iq.a(p, this.f1 ? null : new IllegalStateException());
                this.f1 = true;
                return;
            }
            throw new IllegalStateException(p);
        }
    }

    public final int I() {
        G1();
        if (k()) {
            return this.i1.b.c;
        }
        return -1;
    }

    public final long R() {
        G1();
        if (!k()) {
            return h();
        }
        dob dob = this.i1;
        ikf ikf = dob.a;
        Object obj = dob.b.a;
        dkf dkf = this.w0;
        ikf.h(obj, dkf);
        dob dob2 = this.i1;
        return dob2.c == -9223372036854775807L ? t0g.M(dob2.a.n(d0(), (gkf) this.a, 0).v0) : t0g.M(dkf.v) + t0g.M(this.i1.c);
    }

    public final ikf V0() {
        G1();
        return this.i1.a;
    }

    public final void X0() {
        G1();
    }

    public final int c0() {
        G1();
        if (k()) {
            return this.i1.b.b;
        }
        return -1;
    }

    public final int d0() {
        G1();
        int r1 = r1();
        if (r1 == -1) {
            return 0;
        }
        return r1;
    }

    public final long e() {
        G1();
        if (k()) {
            dob dob = this.i1;
            mz8 mz8 = dob.b;
            ikf ikf = dob.a;
            Object obj = mz8.a;
            dkf dkf = this.w0;
            ikf.h(obj, dkf);
            return t0g.M(dkf.a(mz8.b, mz8.c));
        }
        ikf V02 = V0();
        if (V02.q()) {
            return -9223372036854775807L;
        }
        return t0g.M(V02.n(d0(), (gkf) this.a, 0).w0);
    }

    public final int getRepeatMode() {
        G1();
        return this.K0;
    }

    public final long h() {
        G1();
        return t0g.M(q1(this.i1));
    }

    public final boolean k() {
        G1();
        return this.i1.b.a();
    }

    public final long m() {
        G1();
        return t0g.M(this.i1.r);
    }

    public final void n(int i, long j) {
        G1();
        vb4 vb4 = this.z0;
        int i2 = 1;
        if (!vb4.y) {
            sd b2 = vb4.b();
            vb4.y = true;
            vb4.Q(b2, -1, new db4(9));
        }
        ikf ikf = this.i1.a;
        if (i < 0 || (!ikf.q() && i >= ikf.p())) {
            throw new IllegalStateException();
        }
        this.L0++;
        if (k()) {
            zc5 zc5 = new zc5(this.i1);
            zc5.a(1);
            sc5 sc5 = this.X.a;
            sc5.z.a.post(new bk4(23, sc5, zc5));
            return;
        }
        G1();
        if (this.i1.e != 1) {
            i2 = 2;
        }
        int d0 = d0();
        dob u1 = u1(this.i1.f(i2), ikf, v1(ikf, i, j));
        this.Y.y.a(3, new cd5(ikf, i, t0g.D(j))).b();
        E1(u1, 0, 1, true, true, 1, q1(u1), d0);
    }

    public final ts8 n1() {
        ikf V02 = V0();
        if (V02.q()) {
            return this.h1;
        }
        gr8 gr8 = V02.n(d0(), (gkf) this.a, 0).c;
        rs8 a = this.h1.a();
        ts8 ts8 = gr8.o;
        if (ts8 != null) {
            CharSequence charSequence = ts8.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = ts8.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = ts8.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = ts8.o;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = ts8.v;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = ts8.w;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = ts8.x;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Uri uri = ts8.y;
            if (uri != null) {
                a.h = uri;
            }
            qpc qpc = ts8.z;
            if (qpc != null) {
                a.i = qpc;
            }
            qpc qpc2 = ts8.X;
            if (qpc2 != null) {
                a.j = qpc2;
            }
            byte[] bArr = ts8.Y;
            if (bArr != null) {
                a.k = (byte[]) bArr.clone();
                a.l = ts8.Z;
            }
            Uri uri2 = ts8.v0;
            if (uri2 != null) {
                a.m = uri2;
            }
            Integer num = ts8.w0;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = ts8.x0;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = ts8.y0;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = ts8.z0;
            if (bool != null) {
                a.q = bool;
            }
            Integer num4 = ts8.A0;
            if (num4 != null) {
                a.r = num4;
            }
            Integer num5 = ts8.B0;
            if (num5 != null) {
                a.r = num5;
            }
            Integer num6 = ts8.C0;
            if (num6 != null) {
                a.s = num6;
            }
            Integer num7 = ts8.D0;
            if (num7 != null) {
                a.t = num7;
            }
            Integer num8 = ts8.E0;
            if (num8 != null) {
                a.u = num8;
            }
            Integer num9 = ts8.F0;
            if (num9 != null) {
                a.v = num9;
            }
            Integer num10 = ts8.G0;
            if (num10 != null) {
                a.w = num10;
            }
            CharSequence charSequence8 = ts8.H0;
            if (charSequence8 != null) {
                a.x = charSequence8;
            }
            CharSequence charSequence9 = ts8.I0;
            if (charSequence9 != null) {
                a.y = charSequence9;
            }
            CharSequence charSequence10 = ts8.J0;
            if (charSequence10 != null) {
                a.z = charSequence10;
            }
            Integer num11 = ts8.K0;
            if (num11 != null) {
                a.A = num11;
            }
            Integer num12 = ts8.L0;
            if (num12 != null) {
                a.B = num12;
            }
            CharSequence charSequence11 = ts8.M0;
            if (charSequence11 != null) {
                a.C = charSequence11;
            }
            CharSequence charSequence12 = ts8.N0;
            if (charSequence12 != null) {
                a.D = charSequence12;
            }
            CharSequence charSequence13 = ts8.O0;
            if (charSequence13 != null) {
                a.E = charSequence13;
            }
            Bundle bundle = ts8.P0;
            if (bundle != null) {
                a.F = bundle;
            }
        }
        return new ts8(a);
    }

    public final tpb p1(rpb rpb) {
        int r1 = r1();
        ikf ikf = this.i1.a;
        if (r1 == -1) {
            r1 = 0;
        }
        ed5 ed5 = this.Y;
        return new tpb(ed5, rpb, ikf, r1, this.C0, ed5.X);
    }

    public final boolean q() {
        G1();
        return this.i1.l;
    }

    public final long q1(dob dob) {
        if (dob.a.q()) {
            return t0g.D(this.k1);
        }
        if (dob.b.a()) {
            return dob.s;
        }
        ikf ikf = dob.a;
        mz8 mz8 = dob.b;
        long j = dob.s;
        Object obj = mz8.a;
        dkf dkf = this.w0;
        ikf.h(obj, dkf);
        return j + dkf.v;
    }

    public final int r1() {
        if (this.i1.a.q()) {
            return this.j1;
        }
        dob dob = this.i1;
        return dob.a.h(dob.b.a, this.w0).c;
    }

    public final dob u1(dob dob, ikf ikf, Pair pair) {
        List list;
        int i;
        ikf ikf2 = ikf;
        Pair pair2 = pair;
        y64.g(ikf.q() || pair2 != null);
        ikf ikf3 = dob.a;
        dob g = dob.g(ikf);
        if (ikf.q()) {
            mz8 mz8 = dob.t;
            long D = t0g.D(this.k1);
            dob a = g.b(mz8, D, D, D, 0, tpf.o, this.b, k0d.v).a(mz8);
            a.q = a.s;
            return a;
        }
        Object obj = g.b.a;
        int i2 = t0g.a;
        boolean z2 = !obj.equals(pair2.first);
        mz8 mz82 = z2 ? new mz8(pair2.first) : g.b;
        long longValue = ((Long) pair2.second).longValue();
        long D2 = t0g.D(R());
        if (!ikf3.q()) {
            D2 -= ikf3.h(obj, this.w0).v;
        }
        if (z2 || longValue < D2) {
            mz8 mz83 = mz82;
            y64.j(!mz83.a());
            tpf tpf = z2 ? tpf.o : g.h;
            mqf mqf = z2 ? this.b : g.i;
            if (z2) {
                lx5 lx5 = tb7.b;
                list = k0d.v;
            } else {
                list = g.j;
            }
            dob a2 = g.b(mz83, longValue, longValue, longValue, 0, tpf, mqf, list).a(mz83);
            a2.q = longValue;
            return a2;
        } else if (i == 0) {
            int b2 = ikf2.b(g.k.a);
            if (b2 != -1 && ikf2.g(b2, this.w0, false).c == ikf2.h(mz82.a, this.w0).c) {
                return g;
            }
            ikf2.h(mz82.a, this.w0);
            long a3 = mz82.a() ? this.w0.a(mz82.b, mz82.c) : this.w0.o;
            dob a4 = g.b(mz82, g.s, g.s, g.d, a3 - g.s, g.h, g.i, g.j).a(mz82);
            a4.q = a3;
            return a4;
        } else {
            mz8 mz84 = mz82;
            y64.j(!mz84.a());
            long max = Math.max(0, g.r - (longValue - D2));
            long j = g.q;
            if (g.k.equals(g.b)) {
                j = longValue + max;
            }
            dob b3 = g.b(mz84, longValue, longValue, longValue, max, g.h, g.i, g.j);
            b3.q = j;
            return b3;
        }
    }

    public final Pair v1(ikf ikf, int i, long j) {
        if (ikf.q()) {
            this.j1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.k1 = j;
            return null;
        }
        if (i == -1 || i >= ikf.p()) {
            i = ikf.a(false);
            j = t0g.M(ikf.n(i, (gkf) this.a, 0).v0);
        }
        return ikf.j((gkf) this.a, this.w0, i, t0g.D(j));
    }

    public final void w1(int i, int i2) {
        if (i != this.X0 || i2 != this.Y0) {
            this.X0 = i;
            this.Y0 = i2;
            this.Z.r(24, new fc5(i, i2, 1));
        }
    }

    public final int x() {
        G1();
        if (this.i1.a.q()) {
            return 0;
        }
        dob dob = this.i1;
        return dob.a.b(dob.b.a);
    }

    public final void x1(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.x0.remove(i2);
        }
        a9e a9e = this.Q0;
        int[] iArr = a9e.b;
        int[] iArr2 = new int[(iArr.length - i)];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.Q0 = new a9e(iArr2, new Random(a9e.a.nextLong()));
    }

    public final void y1(int i, int i2, Object obj) {
        for (ok0 ok0 : this.x) {
            if (ok0.a == i) {
                tpb p1 = p1(ok0);
                y64.j(!p1.g);
                p1.d = i2;
                y64.j(!p1.g);
                p1.e = obj;
                p1.c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z1(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r16
            int r2 = r14.r1()
            long r3 = r14.h()
            int r5 = r0.L0
            r6 = 1
            int r5 = r5 + r6
            r0.L0 = r5
            java.util.ArrayList r5 = r0.x0
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0020
            int r7 = r5.size()
            r14.x1(r7)
        L_0x0020:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7 = 0
            r8 = r7
        L_0x0027:
            int r10 = r15.size()
            if (r8 >= r10) goto L_0x004f
            g09 r10 = new g09
            r11 = r15
            java.lang.Object r12 = r15.get(r8)
            xj0 r12 = (defpackage.xj0) r12
            boolean r13 = r0.y0
            r10.<init>(r12, r13)
            r9.add(r10)
            qc5 r12 = new qc5
            java.lang.Object r13 = r10.b
            ag8 r10 = r10.a
            wf8 r10 = r10.o
            r12.<init>(r13, r10)
            r5.add(r8, r12)
            int r8 = r8 + 1
            goto L_0x0027
        L_0x004f:
            a9e r8 = r0.Q0
            int r10 = r9.size()
            a9e r8 = r8.a(r10)
            r0.Q0 = r8
            bqb r10 = new bqb
            r10.<init>(r5, r8)
            boolean r5 = r10.q()
            int r8 = r10.o
            if (r5 != 0) goto L_0x0071
            if (r1 >= r8) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            com.google.android.exoplayer2.IllegalSeekPositionException r0 = new com.google.android.exoplayer2.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x0071:
            r5 = -1
            if (r19 == 0) goto L_0x007f
            int r1 = r10.a(r7)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x007d:
            r11 = r1
            goto L_0x0087
        L_0x007f:
            if (r1 != r5) goto L_0x0084
            r11 = r2
            r2 = r3
            goto L_0x0087
        L_0x0084:
            r2 = r17
            goto L_0x007d
        L_0x0087:
            dob r1 = r0.i1
            android.util.Pair r4 = r14.v1(r10, r11, r2)
            dob r1 = r14.u1(r1, r10, r4)
            int r4 = r1.e
            if (r11 == r5) goto L_0x00a3
            if (r4 == r6) goto L_0x00a3
            boolean r4 = r10.q()
            if (r4 != 0) goto L_0x00a2
            if (r11 < r8) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r4 = 2
            goto L_0x00a3
        L_0x00a2:
            r4 = 4
        L_0x00a3:
            dob r1 = r1.f(r4)
            long r12 = defpackage.t0g.D(r2)
            a9e r10 = r0.Q0
            ed5 r2 = r0.Y
            j7f r2 = r2.y
            wc5 r3 = new wc5
            r8 = r3
            r8.<init>(r9, r10, r11, r12)
            r4 = 17
            h7f r2 = r2.a(r4, r3)
            r2.b()
            dob r2 = r0.i1
            mz8 r2 = r2.b
            java.lang.Object r2 = r2.a
            mz8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00dc
            dob r2 = r0.i1
            ikf r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x00dc
            r5 = r6
            goto L_0x00dd
        L_0x00dc:
            r5 = r7
        L_0x00dd:
            long r7 = r14.q1(r1)
            r4 = 0
            r6 = 4
            r2 = 0
            r3 = 1
            r9 = -1
            r0 = r14
            r0.E1(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc5.z1(java.util.List, int, long, boolean):void");
    }
}
