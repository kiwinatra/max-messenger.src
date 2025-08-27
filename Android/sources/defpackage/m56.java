package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.tutor.FolderTutorLayout;
import ru.ok.messages.settings.folders.view.LockableNestedScrollView;

/* renamed from: m56  reason: default package */
public final class m56 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public m56(FolderTutorLayout folderTutorLayout, RecyclerView recyclerView, LockableNestedScrollView lockableNestedScrollView) {
        scf scf;
        this.c = folderTutorLayout;
        this.d = recyclerView;
        this.e = lockableNestedScrollView;
        TextPaint textPaint = new TextPaint(1);
        folderTutorLayout.getContext();
        textPaint.setTextSize(TypedValue.applyDimension(2, (float) 16, vo4.c().getDisplayMetrics()));
        if (folderTutorLayout.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = folderTutorLayout.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        textPaint.setColor(scf.m);
        this.f = textPaint;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = LazyKt.lazy(lazyThreadSafetyMode, new l56(this, 0));
        this.h = LazyKt.lazy(lazyThreadSafetyMode, new l56(this, 1));
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new l56(this, 2));
    }

    public static final buf a(m56 m56, tf6 tf6) {
        m56.getClass();
        boolean areEqual = Intrinsics.areEqual((Object) tf6, (Object) j56.f);
        RecyclerView recyclerView = (RecyclerView) m56.d;
        if (areEqual) {
            return (buf) recyclerView.M(1);
        }
        if (Intrinsics.areEqual((Object) tf6, (Object) k56.f)) {
            return (buf) recyclerView.M(0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void b(m56 m56, Rect rect) {
        m56.getClass();
        ((NestedScrollView) m56.e).setScrollY(rect.centerY() - (((FolderTutorLayout) m56.c).getHeight() / 2));
    }

    public void c(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (!this.a) {
                    ((CopyOnWriteArraySet) this.f).add(new m08(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        if (!this.b) {
            ViewPager2 viewPager2 = (ViewPager2) this.d;
            tyc adapter = viewPager2.getAdapter();
            this.f = adapter;
            if (adapter != null) {
                this.b = true;
                TabLayout tabLayout = (TabLayout) this.c;
                zu6 zu6 = new zu6(tabLayout);
                this.g = zu6;
                viewPager2.b(zu6);
                s8f s8f = new s8f(viewPager2, true);
                this.h = s8f;
                tabLayout.a(s8f);
                if (this.a) {
                    t45 t45 = new t45(10, this);
                    this.i = t45;
                    ((tyc) this.f).A(t45);
                }
                i();
                tabLayout.o(viewPager2.getCurrentItem(), c44.DEFAULT_ASPECT_RATIO, true, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public StaticLayout e(int i2, String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), (TextPaint) this.f, i2).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(c44.DEFAULT_ASPECT_RATIO, 1.0f).setIncludePad(false).build();
    }

    public void f() {
        tyc tyc;
        if (this.a && (tyc = (tyc) this.f) != null) {
            tyc.D((t45) this.i);
            this.i = null;
        }
        ((TabLayout) this.c).X0.remove((s8f) this.h);
        ((ViewPager2) this.d).g((zu6) this.g);
        this.h = null;
        this.g = null;
        this.f = null;
        this.b = false;
    }

    public void g(boolean z) {
        if (!z || this.a || !this.b) {
            this.a = false;
            ((NestedScrollView) this.e).setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            FolderTutorLayout folderTutorLayout = (FolderTutorLayout) this.c;
            folderTutorLayout.v = null;
            folderTutorLayout.c.reset();
            folderTutorLayout.o.reset();
            folderTutorLayout.x = false;
            folderTutorLayout.w = false;
            folderTutorLayout.invalidate();
        }
    }

    public void h() {
        o();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        if (!arrayDeque.isEmpty()) {
            k7f k7f = (k7f) this.d;
            if (!k7f.a.hasMessages(1)) {
                k7f.getClass();
                i7f c2 = k7f.c();
                c2.a = k7f.a.obtainMessage(1);
                k7f.getClass();
                Message message = c2.a;
                message.getClass();
                k7f.a.sendMessageAtFrontOfQueue(message);
                c2.a();
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.g;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public void i() {
        int min;
        TabLayout tabLayout = (TabLayout) this.c;
        tabLayout.k();
        tyc tyc = (tyc) this.f;
        if (tyc != null) {
            int j = tyc.j();
            for (int i2 = 0; i2 < j; i2++) {
                o8f i3 = tabLayout.i();
                ((r8f) this.e).k(i3, i2);
                tabLayout.b(i3, false);
            }
            if (j > 0 && (min = Math.min(((ViewPager2) this.d).getCurrentItem(), tabLayout.getTabCount() - 1)) != tabLayout.getSelectedTabPosition()) {
                tabLayout.m(tabLayout.h(min), true);
            }
        }
    }

    public void j(int i2, i08 i08) {
        o();
        ((ArrayDeque) this.h).add(new kh1((Object) new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i2, (Object) i08, 12));
    }

    public void k() {
        o();
        synchronized (this.i) {
            this.a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f).iterator();
        while (it.hasNext()) {
            m08 m08 = (m08) it.next();
            k08 k08 = (k08) this.e;
            m08.d = true;
            if (m08.c) {
                m08.c = false;
                k08.f(m08.a, m08.b.e());
            }
        }
        ((CopyOnWriteArraySet) this.f).clear();
    }

    public void l(Object obj) {
        o();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            m08 m08 = (m08) it.next();
            if (m08.a.equals(obj)) {
                m08.d = true;
                if (m08.c) {
                    m08.c = false;
                    xq5 e2 = m08.b.e();
                    ((k08) this.e).f(m08.a, e2);
                }
                copyOnWriteArraySet.remove(m08);
            }
        }
    }

    public void m(int i2, i08 i08) {
        j(i2, i08);
        h();
    }

    public h56 n(Rect rect, Rect rect2, StaticLayout staticLayout) {
        g56 g56 = g56.a;
        FolderTutorLayout folderTutorLayout = (FolderTutorLayout) this.c;
        float width = (((float) folderTutorLayout.getWidth()) / 2.0f) - (((float) staticLayout.getWidth()) / 2.0f);
        float roundToInt = ((float) rect.bottom) + ((float) MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density));
        i56 i56 = new i56(staticLayout, width, roundToInt);
        Rect rect3 = new Rect();
        staticLayout.getLineBounds(0, rect3);
        return new h56(i56, rect, new a20(width + ((float) rect3.right), roundToInt + ((float) staticLayout.getHeight()), rect2.exactCenterX(), ((float) rect2.bottom) + ((float) MathKt.roundToInt(((float) 24) * folderTutorLayout.getContext().getResources().getDisplayMetrics().density)), 4));
    }

    public void o() {
        if (this.b) {
            n79.n(Thread.currentThread() == ((k7f) this.d).a.getLooper().getThread());
        }
    }

    public m56(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, r8f r8f) {
        this.c = tabLayout;
        this.d = viewPager2;
        this.a = z;
        this.e = r8f;
    }

    public m56(Looper looper, c7f c7f, k08 k08) {
        this(new CopyOnWriteArraySet(), looper, c7f, k08, true);
    }

    public m56(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, c7f c7f, k08 k08, boolean z) {
        this.c = c7f;
        this.f = copyOnWriteArraySet;
        this.e = k08;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        this.d = c7f.a(looper, new xp4(2, this));
        this.b = z;
    }
}
