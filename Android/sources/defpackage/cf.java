package defpackage;

import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.DialogFragment;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.work.WorkRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.a;
import one.me.rlottie.c;
import one.me.rlottie.d;
import one.me.rlottie.e;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.messages.widgets.Chronometer;
import ru.ok.tamtam.nano.Protos;

/* renamed from: cf  reason: default package */
public final class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cf(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        int decrementAndGet;
        boolean isEmpty;
        ArrayList arrayList;
        xbb xbb;
        switch (this.a) {
            case 0:
                df dfVar = (df) this.b;
                dfVar.unscheduleSelf(this);
                dfVar.invalidateSelf();
                return;
            case 1:
                synchronized (((eg) this.b)) {
                    eg egVar = (eg) this.b;
                    egVar.a = false;
                    if (((ys9) egVar.o).now() - egVar.b > 2000) {
                        xn0 xn0 = (xn0) ((eg) this.b).w;
                        if (xn0 != null) {
                            if (xn0.v) {
                                eo0 eo0 = xn0.w;
                                if (eo0 != null) {
                                    eo0.f();
                                }
                            } else {
                                xn0.clear();
                            }
                        }
                    } else {
                        ((eg) this.b).a();
                    }
                }
                return;
            case 2:
                Result.Companion companion = Result.Companion;
                ((kw1) this.b).resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                return;
            case 3:
                AudioAttachView audioAttachView = (AudioAttachView) this.b;
                if (audioAttachView.isAttachedToWindow()) {
                    audioAttachView.k();
                    return;
                }
                return;
            case 4:
                wz7 wz7 = (wz7) this.b;
                if (wz7.x0) {
                    boolean z = wz7.v0;
                    t90 t90 = wz7.a;
                    if (z) {
                        wz7.v0 = false;
                        t90.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        t90.e = currentAnimationTimeMillis;
                        t90.g = -1;
                        t90.f = currentAnimationTimeMillis;
                        t90.h = 0.5f;
                    }
                    if ((t90.g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= t90.g + ((long) t90.i)) && wz7.e()) {
                        boolean z2 = wz7.w0;
                        View view = wz7.c;
                        if (z2) {
                            wz7.w0 = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);
                            view.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (t90.f != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float a2 = t90.a(currentAnimationTimeMillis2);
                            t90.f = currentAnimationTimeMillis2;
                            wz7.z0.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - t90.f)) * ((a2 * 4.0f) + (-4.0f * a2 * a2)) * t90.d));
                            WeakHashMap weakHashMap = gag.a;
                            view.postOnAnimation(this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    wz7.x0 = false;
                    return;
                }
                return;
            case 5:
                int i = orb.z;
                ((orb) this.b).setHalfScreen((Function2<? super Float, ? super Float, Unit>) null);
                return;
            case 6:
                for (Thread thread : c.v.keySet()) {
                    if (!thread.isAlive()) {
                        c.v.remove(thread);
                    }
                }
                if (!c.v.isEmpty()) {
                    a.c(MultiFileUploader.UPLOAD_NEXT_INTERVAL, ((c) this.b).o);
                    return;
                } else {
                    c.w = false;
                    return;
                }
            case 7:
                ur0 ur0 = (ur0) this.b;
                ur0.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ur0.e;
                kag kag = bottomSheetBehavior.M;
                if (kag != null && kag.g()) {
                    ur0.b(ur0.b);
                    return;
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.L(ur0.b);
                    return;
                } else {
                    return;
                }
            case 8:
                nd1 nd1 = (nd1) this.b;
                Iterator it = nd1.i.iterator();
                while (it.hasNext()) {
                    ((in1) ((md1) it.next())).l.a(nd1.a);
                }
                ld1 ld1 = nd1.e;
                ld1.getClass();
                try {
                    ld1.k.postDelayed(this, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    return;
                } catch (IllegalStateException e) {
                    ld1.a.reportException(ld1.j, "OpenGL tread died, is it fine?", e);
                    return;
                }
            case 9:
                i42 i42 = (i42) this.b;
                i42.M0 = false;
                i42.requestLayout();
                return;
            case 10:
                ((aya) this.b).setAppearance(pxa.a);
                return;
            case 11:
                KProperty[] kPropertyArr = ChatsListWidget.I0;
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                if (!((ss2) chatsListWidget.f0().D0.getValue()).b && ((ss2) chatsListWidget.f0().E0.a.getValue()).a.isEmpty() && ((List) chatsListWidget.f0().H0.a.getValue()).isEmpty()) {
                    chatsListWidget.H0.b(CollectionsKt.listOf(new zbb(0)));
                    return;
                }
                return;
            case 12:
                Chronometer chronometer = (Chronometer) this.b;
                if (chronometer.v0) {
                    chronometer.k(SystemClock.elapsedRealtime());
                    chronometer.postDelayed(chronometer.E0, 1000);
                    return;
                }
                return;
            case 13:
                Class<ei4> cls = ei4.class;
                ei4 ei4 = (ei4) this.b;
                try {
                    Runnable runnable = (Runnable) ei4.o.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        int i2 = ei4.y;
                        bg5.f(cls, ei4.a, "%s: Worker has nothing to run");
                    }
                    if (isEmpty) {
                        int i3 = ei4.y;
                        bg5.g(cls, "%s: worker finished; %d workers left", ei4.a, Integer.valueOf(decrementAndGet));
                        return;
                    }
                    return;
                } finally {
                    decrementAndGet = ei4.w.decrementAndGet();
                    if (!ei4.o.isEmpty()) {
                        ei4.b();
                    } else {
                        int i4 = ei4.y;
                        bg5.g(cls, "%s: worker finished; %d workers left", ei4.a, Integer.valueOf(decrementAndGet));
                    }
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((Function0) this.b).invoke();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                synchronized (((pk4) this.b).a) {
                    pk4 pk4 = (pk4) this.b;
                    arrayList = (ArrayList) pk4.c;
                    pk4.d = arrayList;
                    pk4.c = (ArrayList) pk4.d;
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((m0) ((ok4) ((ArrayList) ((pk4) this.b).d).get(i5))).n();
                }
                ((ArrayList) ((pk4) this.b).d).clear();
                return;
            case 16:
                DialogFragment dialogFragment = (DialogFragment) this.b;
                dialogFragment.o1.onDismiss(dialogFragment.w1);
                return;
            case LangUtils.HASH_SEED /*17*/:
                e eVar = (e) this.b;
                if (!eVar.a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int size2 = eVar.a.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        d dVar = (d) eVar.a.get(i6);
                        if (dVar.c < elapsedRealtime - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            dVar.a.getLooper().quit();
                            eVar.a.remove(i6);
                            eVar.e--;
                            i6--;
                            size2--;
                        }
                        i6++;
                    }
                }
                if (!eVar.a.isEmpty() || !eVar.c.isEmpty()) {
                    a.c(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, this);
                    eVar.h = true;
                    return;
                }
                eVar.h = false;
                return;
            case 18:
                ax4 ax4 = (ax4) this.b;
                ax4.x0 = null;
                ax4.drawableStateChanged();
                return;
            case 19:
                ((EditTextPreferenceDialogFragmentCompat) this.b).f3();
                return;
            case 20:
                ((AtomicBoolean) ((z65) this.b).b).set(true);
                return;
            case 21:
                jh5 jh5 = (jh5) this.b;
                int i7 = jh5.J0;
                ValueAnimator valueAnimator = jh5.I0;
                if (i7 == 1) {
                    valueAnimator.cancel();
                } else if (i7 != 2) {
                    return;
                }
                jh5.J0 = 3;
                valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
                valueAnimator.setDuration((long) 500);
                valueAnimator.start();
                return;
            case 22:
                ec8 ec8 = (ec8) ((he) this.b).c;
                ec8.getClass();
                ybb ybb = ybb.FOLDERS_INIT_TO_RENDER;
                qz9 qz9 = ec8.e;
                xbb xbb2 = (xbb) qz9.c(ybb);
                if (xbb2 != null && xbb2.e == -1 && (xbb = (xbb) qz9.c(ybb)) != null) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    xbb.e = elapsedRealtime2 - xbb.b;
                    xbb xbb3 = (xbb) qz9.c(ybb.CHATS_INIT_TO_RENDER);
                    if (xbb3 == null || xbb3.e != -1) {
                        ec8.f(elapsedRealtime2);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.b;
                if (aVar.V0 != null) {
                    aVar.L1().getClass();
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((androidx.fragment.app.c) this.b).A(true);
                return;
            case 25:
                it8 it8 = (it8) this.b;
                it8.Y = false;
                it8.G();
                return;
            case 26:
                ((zz7) this.b).cancel(true);
                return;
            case 27:
                hk6 hk6 = (hk6) this.b;
                GLES20.glDeleteTextures(1, new int[]{hk6.c}, 0);
                hk6.c = -1;
                return;
            case 28:
                w28 w28 = (w28) this.b;
                if (((dw6) w28.o).a.getAndSet((Object) null) != null) {
                    ((Handler) w28.b).removeCallbacks((dw6) w28.o);
                    return;
                }
                return;
            default:
                ((s87) this.b).requestLayout();
                return;
        }
    }

    public /* synthetic */ cf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
