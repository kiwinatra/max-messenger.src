package ru.ok.messages.media.attaches;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import ru.ok.messages.views.widgets.audiowave.AudioWaveView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u001a\u001eJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ok/messages/media/attaches/AudioAttachView;", "Landroid/widget/RelativeLayout;", "Ld80;", "Lbif;", "Lb60;", "Ly70;", "Lo23;", "", "Landroid/view/View;", "getClickableChildren", "()Ljava/util/List;", "Lx20;", "listener", "", "setListener", "(Lx20;)V", "", "newTranscription", "setTranscriptionAndExpand", "(Ljava/lang/CharSequence;)V", "getTranscription", "()Ljava/lang/CharSequence;", "", "currentPosition", "setCurrentPosition", "(J)V", "Lb30;", "isActionModeDelegate", "setDelegate", "(Lb30;)V", "La30;", "audioTranscriptionStateChangeListener", "setAudioTranscriptionStateChangeListener", "(La30;)V", "Lf40;", "F0", "Lkotlin/Lazy;", "getAudioController", "()Lf40;", "audioController", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioAttachView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioAttachView.kt\nru/ok/messages/media/attaches/AudioAttachView\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,529:1\n49#2,2:530\n45#2:532\n49#2,2:543\n45#2:545\n49#2,2:546\n45#2:548\n49#2,2:549\n45#2:551\n24#3:533\n24#3:534\n24#3:535\n24#3:536\n24#3:537\n32#3:540\n24#3:541\n24#3:542\n24#3:556\n24#3:559\n24#3:564\n256#4,2:538\n256#4,2:552\n256#4,2:554\n256#4,2:557\n148#4,2:560\n256#4,2:562\n148#4,2:565\n188#4,3:567\n216#5,2:570\n*S KotlinDebug\n*F\n+ 1 AudioAttachView.kt\nru/ok/messages/media/attaches/AudioAttachView\n*L\n76#1:530,2\n76#1:532\n169#1:543,2\n169#1:545\n170#1:546,2\n170#1:548\n228#1:549,2\n228#1:551\n83#1:533\n111#1:534\n115#1:535\n124#1:536\n125#1:537\n137#1:540\n145#1:541\n148#1:542\n264#1:556\n270#1:559\n279#1:564\n132#1:538,2\n247#1:552,2\n255#1:554,2\n268#1:557,2\n270#1:560,2\n278#1:562,2\n279#1:565,2\n360#1:567,3\n417#1:570,2\n*E\n"})
public final class AudioAttachView extends RelativeLayout implements d80, bif, b60, y70, o23 {
    public static final /* synthetic */ int I0 = 0;
    public d60 A0;
    public boolean B0;
    public a30 C0;
    public List D0;
    public ws0 E0;
    public final Lazy F0;
    public final int G0;
    public final HashMap H0;
    public final AppCompatImageView a;
    public final AudioWaveView b;
    public final AppCompatTextView c;
    public final g60 o;
    public final AppCompatTextView v;
    public of9 v0;
    public z70 w;
    public x20 w0;
    public i10 x;
    public boolean x0;
    public d20 y;
    public Long y0;
    public float z;
    public boolean z0;

    @JvmOverloads
    public AudioAttachView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final f40 getAudioController() {
        return (f40) this.F0.getValue();
    }

    public final void a() {
        j(0, true);
        i10 i10 = this.x;
        if (i10 != null) {
            this.b.b(i10.c, i10.d);
        }
        l();
    }

    public final void b() {
        a();
    }

    public final void c() {
        Object obj;
        scf scf;
        if (isInEditMode()) {
            obj = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            obj = j4b.k0(context);
        }
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy2 = scf.b0;
            scf = j4b.k0(context2);
        }
        ws0 c2 = scf.c(this.B0);
        this.E0 = c2;
        int i = c2.c.c;
        AppCompatImageView appCompatImageView = this.a;
        appCompatImageView.setColorFilter(i);
        qs0 qs0 = c2.a;
        GradientDrawable K = i8b.K(Integer.valueOf(qs0.e), (Integer) null, (Integer) null);
        obj.getClass();
        appCompatImageView.setBackground(i8b.T(K, i8b.K(Integer.valueOf(j4b.l0(0.8f, qs0.e)), (Integer) null, (Integer) null), (GradientDrawable) null));
        AppCompatTextView appCompatTextView = this.c;
        zs0 zs0 = c2.b;
        appCompatTextView.setTextColor(zs0.c);
        this.v.setTextColor(zs0.c);
    }

    public final void d() {
    }

    public final void e(float f) {
        this.o.setLayoutPosition(this.b.getX() + f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(float r7) {
        /*
            r6 = this;
            f40 r0 = r6.getAudioController()
            of9 r1 = r6.v0
            r2 = 0
            if (r1 == 0) goto L_0x0013
            a89 r1 = r1.a
            if (r1 == 0) goto L_0x0013
            ha9 r1 = r1.a
            long r4 = r1.b
            goto L_0x0014
        L_0x0013:
            r4 = r2
        L_0x0014:
            xy9 r0 = r0.c
            boolean r0 = r0.p(r4)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            i10 r0 = r6.x
            if (r0 == 0) goto L_0x002a
            double r1 = (double) r7
            long r3 = r0.c
            double r3 = (double) r3
            double r1 = r1 * r3
            long r2 = kotlin.math.MathKt.roundToLong((double) r1)
        L_0x002a:
            g60 r7 = r6.o
            r7.setCurrentAudioPosition(r2)
            r7 = 0
            r6.j(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.f(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(float r7) {
        /*
            r6 = this;
            r6.l()
            x20 r0 = r6.w0
            if (r0 == 0) goto L_0x0039
            f40 r0 = r6.getAudioController()
            of9 r1 = r6.v0
            r2 = 0
            if (r1 == 0) goto L_0x001a
            a89 r1 = r1.a
            if (r1 == 0) goto L_0x001a
            ha9 r1 = r1.a
            long r4 = r1.b
            goto L_0x001b
        L_0x001a:
            r4 = r2
        L_0x001b:
            xy9 r0 = r0.c
            boolean r0 = r0.p(r4)
            if (r0 == 0) goto L_0x0039
            i10 r0 = r6.x
            if (r0 == 0) goto L_0x0030
            double r1 = (double) r7
            long r3 = r0.c
            double r3 = (double) r3
            double r1 = r1 * r3
            long r2 = kotlin.math.MathKt.roundToLong((double) r1)
        L_0x0030:
            x20 r7 = r6.w0
            if (r7 == 0) goto L_0x0039
            gg9 r7 = (defpackage.gg9) r7
            r7.z(r2)
        L_0x0039:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.y0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.g(float):void");
    }

    public List<View> getClickableChildren() {
        return SequencesKt.toList(SequencesKt.filter(cjf.x(this), new h9(13)));
    }

    public final CharSequence getTranscription() {
        z70 z70 = this.w;
        if (z70 != null) {
            return z70.getTranscription();
        }
        return null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0029 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    public final void h(float r7) {
        /*
            r6 = this;
            r0 = 0
            r6.setClipChildren(r0)
            r6.setClipToPadding(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            r4 = 0
            if (r3 == 0) goto L_0x0018
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0019
        L_0x0018:
            r2 = r4
        L_0x0019:
            if (r2 == 0) goto L_0x0029
            r1.add(r2)
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0018
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0019
        L_0x0029:
            java.util.Iterator r1 = r1.iterator()
        L_0x002d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r1.next()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r3 = r2.getClipToPadding()
            boolean r4 = r2.getClipChildren()
            if (r4 == 0) goto L_0x0045
            r3 = r3 | 2
        L_0x0045:
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r4 = r6.H0
            r4.put(r2, r3)
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x002d
        L_0x0058:
            i10 r1 = r6.x
            if (r1 == 0) goto L_0x0066
            double r2 = (double) r7
            long r4 = r1.c
            double r4 = (double) r4
            double r2 = r2 * r4
            long r1 = kotlin.math.MathKt.roundToLong((double) r2)
            goto L_0x0068
        L_0x0066:
            r1 = 0
        L_0x0068:
            g60 r6 = r6.o
            r6.setCurrentAudioPosition(r1)
            android.content.Context r7 = r6.getContext()
            ch r7 = defpackage.kne.s(r7)
            boolean r7 = r7.p()
            if (r7 == 0) goto L_0x007f
            r6.setVisibility(r0)
            goto L_0x00d2
        L_0x007f:
            boolean r7 = r6.x0
            r0 = 1
            if (r7 == 0) goto L_0x008f
            android.animation.Animator r7 = r6.w0
            if (r7 == 0) goto L_0x008f
            boolean r7 = r7.isRunning()
            if (r7 != r0) goto L_0x008f
            goto L_0x00d2
        L_0x008f:
            r6.x0 = r0
            android.animation.Animator r7 = r6.w0
            if (r7 == 0) goto L_0x009b
            r7.removeAllListeners()
            r7.cancel()
        L_0x009b:
            r7 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r7 = r6.j(r7, r0)
            android.content.Context r0 = r6.getContext()
            ch r0 = defpackage.kne.s(r0)
            ug r0 = r0.a
            long r0 = r0.h()
            r7.setDuration(r0)
            android.content.Context r0 = r6.getContext()
            ch r0 = defpackage.kne.s(r0)
            ug r0 = r0.a
            android.view.animation.Interpolator r0 = r0.d()
            r7.setInterpolator(r0)
            uf r0 = new uf
            r1 = 1
            r0.<init>(r1, r6)
            r7.addListener(r0)
            r6.w0 = r7
            r7.start()
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.h(float):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    public final void i(defpackage.of9 r9, defpackage.i10 r10, defpackage.d20 r11, float r12, boolean r13, boolean r14, java.util.List r15) {
        /*
            r8 = this;
            r0 = 0
            r8.x0 = r0
            if (r9 != 0) goto L_0x0006
            return
        L_0x0006:
            of9 r1 = r8.v0
            r2 = 1
            if (r1 == 0) goto L_0x002f
            a89 r1 = r1.a
            if (r1 == 0) goto L_0x002f
            ha9 r1 = r1.a
            long r3 = r1.b
            a89 r5 = r9.a
            ha9 r6 = r5.a
            long r6 = r6.b
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x002f
            i10 r1 = r1.c()
            ha9 r3 = r5.a
            i10 r3 = r3.c()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = r0
        L_0x0030:
            r8.x = r10
            r8.z = r12
            r8.y = r11
            r8.v0 = r9
            r8.B0 = r13
            r8.z0 = r14
            r8.D0 = r15
            boolean r12 = r8.isInEditMode()
            if (r12 == 0) goto L_0x0047
            vi4 r12 = defpackage.vi4.f0
            goto L_0x0051
        L_0x0047:
            android.content.Context r12 = r8.getContext()
            kotlin.Lazy r3 = defpackage.scf.b0
            scf r12 = defpackage.j4b.k0(r12)
        L_0x0051:
            ws0 r12 = r12.c(r13)
            r8.E0 = r12
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r12 = r8.b
            r12.setIncomingMessage(r13)
            byte[] r3 = r10.d
            long r4 = r10.c
            r12.b(r4, r3)
            androidx.appcompat.widget.AppCompatTextView r3 = r8.c
            java.lang.String r4 = defpackage.b0h.c(r4)
            r3.setText(r4)
            boolean r12 = r12.E0
            if (r12 != 0) goto L_0x0073
            r8.l()
        L_0x0073:
            r8.k()
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.d()
            if (r11 != 0) goto L_0x008b
            f40 r11 = r8.getAudioController()
            xy9 r11 = r11.c
            long r11 = r11.o()
            r8.j(r11, r0)
        L_0x008b:
            d60 r11 = r8.A0
            r12 = 0
            if (r11 == 0) goto L_0x0095
            boolean r3 = r11.o
            if (r3 != r2) goto L_0x0095
            goto L_0x00f8
        L_0x0095:
            if (r11 == 0) goto L_0x0099
            r11.c = r12
        L_0x0099:
            if (r11 == 0) goto L_0x009e
            r11.e()
        L_0x009e:
            r8.A0 = r12
            d60 r11 = new d60
            id3 r3 = defpackage.ym.e()
            qra r3 = (defpackage.qra) r3
            q4 r3 = r3.getAccessor()
            java.lang.Class<xy9> r4 = defpackage.xy9.class
            java.lang.Object r3 = r3.g(r4)
            xy9 r3 = (defpackage.xy9) r3
            of9 r4 = r8.v0
            if (r4 == 0) goto L_0x00c1
            a89 r4 = r4.a
            if (r4 == 0) goto L_0x00c1
            ha9 r4 = r4.a
            long r4 = r4.b
            goto L_0x00c3
        L_0x00c1:
            r4 = 0
        L_0x00c3:
            r11.<init>(r3, r4, r12)
            r8.A0 = r11
            r11.c = r8
            r11.o = r2
            pm7 r3 = r11.w
            if (r3 == 0) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            xy9 r3 = r11.b
            etc r3 = r3.v
            c60 r4 = new c60
            r4.<init>(r11, r12)
            ps5 r5 = new ps5
            r6 = 5
            r5.<init>(r3, r4, r6)
            pm7 r3 = defpackage.bs0.K(r5, r11)
            r11.w = r3
        L_0x00e6:
            xy9 r3 = r11.b
            long r4 = r3.l()
            r11.h(r4, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.q
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.q     // Catch:{ all -> 0x01fb }
            r3.add(r11)     // Catch:{ all -> 0x01fb }
            monitor-exit(r4)
        L_0x00f8:
            androidx.appcompat.widget.AppCompatTextView r11 = r8.v
            r3 = 2
            int r4 = r10.i
            if (r4 != r3) goto L_0x0103
            if (r14 == 0) goto L_0x0103
            r3 = r2
            goto L_0x0104
        L_0x0103:
            r3 = r0
        L_0x0104:
            r4 = 8
            if (r3 == 0) goto L_0x010a
            r3 = r0
            goto L_0x010b
        L_0x010a:
            r3 = r4
        L_0x010b:
            r11.setVisibility(r3)
            java.lang.String r10 = r10.f
            int r11 = r10.length()
            r3 = 10
            if (r11 <= 0) goto L_0x01d1
            if (r14 == 0) goto L_0x01d1
            z70 r11 = r8.w
            if (r11 != 0) goto L_0x015b
            z70 r11 = new z70
            android.content.Context r14 = r8.getContext()
            r11.<init>(r14)
            int r14 = defpackage.lic.view_audio_attach__transcription
            r11.setId(r14)
            r11.setVisibility(r4)
            r11.setListener(r8)
            android.widget.RelativeLayout$LayoutParams r14 = new android.widget.RelativeLayout$LayoutParams
            r4 = -1
            r5 = -2
            r14.<init>(r4, r5)
            r5 = 3
            int r6 = defpackage.lic.view_audio_attach__btn_play
            r14.addRule(r5, r6)
            r5 = 20
            r14.addRule(r5, r4)
            float r4 = (float) r3
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r14.topMargin = r4
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r8.addView(r11, r14)
        L_0x015b:
            r8.w = r11
            r11.setVisibility(r0)
            r11.setIncoming(r13)
            float r13 = (float) r3
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r13
            int r14 = kotlin.math.MathKt.roundToInt((float) r14)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r13
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r13 = r13 * r4
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            r8.setPaddingRelative(r14, r0, r3, r13)
            r11.setHighlights(r15)
            if (r1 == 0) goto L_0x01cb
            z70 r13 = r8.w
            if (r13 == 0) goto L_0x01a2
            java.lang.CharSequence r13 = r13.getTranscription()
            goto L_0x01a3
        L_0x01a2:
            r13 = r12
        L_0x01a3:
            boolean r14 = r13 instanceof android.text.Spannable
            if (r14 == 0) goto L_0x01aa
            r12 = r13
            android.text.Spannable r12 = (android.text.Spannable) r12
        L_0x01aa:
            if (r12 != 0) goto L_0x01ad
            goto L_0x01fa
        L_0x01ad:
            java.util.List r8 = r8.D0
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x01b9
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x01fa
        L_0x01b9:
            int r8 = r12.length()
            java.lang.Class<android.text.style.BackgroundColorSpan> r13 = android.text.style.BackgroundColorSpan.class
            java.lang.Object[] r8 = r12.getSpans(r0, r8, r13)
            int r8 = r8.length
            if (r8 != 0) goto L_0x01c7
            r0 = r2
        L_0x01c7:
            r8 = r0 ^ 1
            if (r8 == 0) goto L_0x01fa
        L_0x01cb:
            boolean r8 = r9.b
            r11.b(r10, r8)
            goto L_0x01fa
        L_0x01d1:
            z70 r9 = r8.w
            if (r9 == 0) goto L_0x01d8
            r9.setVisibility(r4)
        L_0x01d8:
            float r9 = (float) r3
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r9
            int r10 = kotlin.math.MathKt.roundToInt((float) r10)
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r9 = r9 * r11
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            r8.setPaddingRelative(r10, r0, r9, r0)
        L_0x01fa:
            return
        L_0x01fb:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.i(of9, i10, d20, float, boolean, boolean, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r2 = r2.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r5, boolean r7) {
        /*
            r4 = this;
            i10 r0 = r4.x
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            f40 r1 = r4.getAudioController()
            of9 r2 = r4.v0
            if (r2 == 0) goto L_0x0016
            a89 r2 = r2.a
            if (r2 == 0) goto L_0x0016
            ha9 r2 = r2.a
            long r2 = r2.b
            goto L_0x0018
        L_0x0016:
            r2 = 0
        L_0x0018:
            xy9 r1 = r1.c
            boolean r1 = r1.p(r2)
            r2 = 0
            if (r7 != 0) goto L_0x0025
            if (r1 == 0) goto L_0x0025
            r7 = 1
            goto L_0x0026
        L_0x0025:
            r7 = r2
        L_0x0026:
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r1 = r4.b
            r1.z = r5
            r1.v0 = r7
            if (r7 != 0) goto L_0x0030
            r1.E0 = r2
        L_0x0030:
            r1.invalidate()
            long r5 = r0.c
            java.lang.String r5 = defpackage.b0h.c(r5)
            androidx.appcompat.widget.AppCompatTextView r4 = r4.c
            r4.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.j(long, boolean):void");
    }

    public final void k() {
        a89 a89;
        d20 d20 = this.y;
        int i = d20 == null ? -1 : c30.$EnumSwitchMapping$0[d20.ordinal()];
        AppCompatImageView appCompatImageView = this.a;
        if (i == -1 || i == 1) {
            if (!(appCompatImageView.getDrawable() instanceof r20)) {
                r20 r20 = new r20(getContext());
                r20.m.setColor(0);
                r20.l = true;
                r20.c = this.G0;
                r20.d = true;
                r20.d(this.E0);
                appCompatImageView.setImageDrawable(r20);
            }
            appCompatImageView.getDrawable().setLevel((int) (this.z * ((float) 100)));
            return;
        }
        f40 audioController = getAudioController();
        of9 of9 = this.v0;
        appCompatImageView.setImageResource(audioController.p((of9 == null || (a89 = of9.a) == null) ? 0 : a89.a.b) ? cad.K0 : cad.O0);
    }

    public final void l() {
        Animator animator;
        j6 j6Var = new j6(10, this);
        g60 g60 = this.o;
        if (g60.getVisibility() != 8) {
            if (kne.s(g60.getContext()).p()) {
                g60.setVisibility(8);
                j6Var.invoke();
            } else if (!g60.y0 || (animator = g60.w0) == null || !animator.isRunning()) {
                g60.y0 = true;
                Animator animator2 = g60.w0;
                if (animator2 != null) {
                    animator2.removeAllListeners();
                    animator2.cancel();
                }
                ObjectAnimator j = g60.j(1.0f, c44.DEFAULT_ASPECT_RATIO);
                j.setDuration(kne.s(g60.getContext()).a.h());
                j.setInterpolator(kne.s(g60.getContext()).a.l());
                j.addListener(new f60(g60, j6Var, j6Var, 0));
                g60.w0 = j;
                j.start();
            }
        }
    }

    public final void m() {
        a89 a89;
        i10 i10 = this.x;
        if (i10 != null && this.x0) {
            of9 of9 = this.v0;
            if (of9 == null || (a89 = of9.a) == null || a89.a.b != 0) {
                i(of9, i10, this.y, this.z, this.B0, this.z0, this.D0);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    public final void onDetachedFromWindow() {
        l();
        super.onDetachedFromWindow();
        d60 d60 = this.A0;
        if (d60 != null) {
            d60.c = null;
        }
        if (d60 != null) {
            d60.e();
        }
        this.A0 = null;
        this.x = null;
        this.y = null;
        this.z = c44.DEFAULT_ASPECT_RATIO;
        this.x0 = true;
    }

    public final void setAudioTranscriptionStateChangeListener(a30 a30) {
        this.C0 = a30;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentPosition(long r6) {
        /*
            r5 = this;
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r0 = r5.b
            boolean r0 = r0.E0
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Long r0 = r5.y0
            if (r0 == 0) goto L_0x001b
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.longValue()
            long r1 = r1 - r3
            r3 = 34
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            return
        L_0x001b:
            r0 = 0
            r5.y0 = r0
            f40 r0 = r5.getAudioController()
            of9 r1 = r5.v0
            if (r1 == 0) goto L_0x002f
            a89 r1 = r1.a
            if (r1 == 0) goto L_0x002f
            ha9 r1 = r1.a
            long r1 = r1.b
            goto L_0x0031
        L_0x002f:
            r1 = 0
        L_0x0031:
            xy9 r0 = r0.c
            boolean r0 = r0.p(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            r5.j(r6, r0)
            goto L_0x0044
        L_0x003e:
            r0 = 1
            r5.x0 = r0
            r5.m()
        L_0x0044:
            g60 r5 = r5.o
            r5.setCurrentAudioPosition(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.setCurrentPosition(long):void");
    }

    public final void setDelegate(b30 b30) {
    }

    public final void setListener(x20 x20) {
        this.w0 = x20;
    }

    public final void setTranscriptionAndExpand(CharSequence charSequence) {
        z70 z70 = this.w;
        if (z70 != null) {
            z70.b(charSequence, true);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioAttachView(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            r4 = 2
            r5 = r20 & 2
            r6 = 0
            if (r5 == 0) goto L_0x000e
            r5 = r6
            goto L_0x0010
        L_0x000e:
            r5 = r19
        L_0x0010:
            r0.<init>(r1, r5, r3)
            r0.x0 = r2
            boolean r7 = r17.isInEditMode()
            if (r7 == 0) goto L_0x001e
            vi4 r7 = defpackage.vi4.f0
            goto L_0x0028
        L_0x001e:
            android.content.Context r7 = r17.getContext()
            kotlin.Lazy r8 = defpackage.scf.b0
            scf r7 = defpackage.j4b.k0(r7)
        L_0x0028:
            boolean r8 = r0.B0
            ws0 r7 = r7.c(r8)
            r0.E0 = r7
            m r7 = new m
            r8 = 11
            r7.<init>(r8)
            kotlin.Lazy r7 = kotlin.LazyKt.lazy(r7)
            r0.F0 = r7
            r7 = 32
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r0.G0 = r7
            androidx.appcompat.widget.AppCompatImageView r8 = new androidx.appcompat.widget.AppCompatImageView
            r8.<init>(r1, r6)
            int r9 = defpackage.nad.h1
            r8.setImageResource(r9)
            int r9 = defpackage.lic.view_audio_attach__btn_play
            r8.setId(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER
            r8.setScaleType(r9)
            r0.a = r8
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r9.<init>(r7, r7)
            r7 = 20
            r9.addRule(r7)
            r7 = 10
            r9.addRule(r7)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            r0.addView(r8, r9)
            y20 r9 = new y20
            r9.<init>(r0, r3)
            defpackage.ct.G(r8, 300, r9)
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r9 = new ru.ok.messages.views.widgets.audiowave.AudioWaveView
            r10 = 6
            r9.<init>(r1, r6, r10)
            int r10 = defpackage.lic.view_audio_attach__wave
            r9.setId(r10)
            r9.setListener(r0)
            y20 r10 = new y20
            r10.<init>(r0, r2)
            defpackage.ct.G(r9, 300, r10)
            z20 r10 = new z20
            r10.<init>(r3, r0)
            r9.setOnLongClickListener(r10)
            r0.b = r9
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r11 = 16
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r12 = -1
            r10.<init>(r12, r11)
            r10.addRule(r7)
            int r7 = r8.getId()
            r8 = 17
            r10.addRule(r8, r7)
            r7 = 21
            r10.addRule(r7, r12)
            r7 = 8
            float r11 = (float) r7
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r11
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            r10.setMarginStart(r12)
            r0.addView(r9, r10)
            androidx.appcompat.widget.AppCompatTextView r9 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r10 = r17.getContext()
            r9.<init>(r10, r6)
            ogf r10 = defpackage.puf.a
            ogf r10 = defpackage.tr2.d
            r10.b(r9, defpackage.uy4.b)
            int r10 = defpackage.lic.view_audio_attach__duration
            r9.setId(r10)
            r0.c = r9
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r12 = -2
            r10.<init>(r12, r12)
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r11
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            r10.setMarginStart(r13)
            r13 = 4
            float r13 = (float) r13
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r13 = r13 * r14
            int r13 = kotlin.math.MathKt.roundToInt((float) r13)
            r10.topMargin = r13
            int r13 = defpackage.lic.view_audio_attach__btn_play
            r10.addRule(r8, r13)
            int r13 = defpackage.lic.view_audio_attach__wave
            r14 = 3
            r10.addRule(r14, r13)
            r0.addView(r9, r10)
            g60 r9 = new g60
            r9.<init>(r1, r5, r3)
            int r3 = defpackage.lic.view_audio_attach__seek
            r9.setId(r3)
            r9.setVisibility(r7)
            r0.o = r9
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r12, r12)
            int r5 = defpackage.lic.view_audio_attach__btn_play
            r3.addRule(r4, r5)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            double r4 = (double) r4
            r15 = 4617540697942969549(0x4014cccccccccccd, double:5.2)
            double r4 = r4 * r15
            int r4 = kotlin.math.MathKt.roundToInt((double) r4)
            r3.bottomMargin = r4
            r0.addView(r9, r3)
            androidx.appcompat.widget.AppCompatTextView r3 = new androidx.appcompat.widget.AppCompatTextView
            r3.<init>(r1, r6)
            int r4 = defpackage.lic.view_audio_attach__transcription_status
            r3.setId(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r4)
            r3.setVisibility(r7)
            r3.setGravity(r8)
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = 18
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r4.<init>(r12, r5)
            int r5 = defpackage.lic.view_audio_attach__duration
            r4.addRule(r8, r5)
            int r5 = defpackage.lic.view_audio_attach__wave
            r4.addRule(r14, r5)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r11 = r11 * r5
            int r5 = kotlin.math.MathKt.roundToInt((float) r11)
            r4.setMarginStart(r5)
            r3.setLayoutParams(r4)
            int r4 = defpackage.qad.R1
            java.lang.String r1 = r1.getString(r4)
            r3.setText(r1)
            r3.setSingleLine(r2)
            r3.setMaxLines(r2)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r1)
            r0.v = r3
            r0.addView(r3)
            r17.c()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.H0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
