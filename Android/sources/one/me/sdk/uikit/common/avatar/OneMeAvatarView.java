package one.me.sdk.uikit.common.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u00039:\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u000b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b*\u0010%J\u0015\u0010+\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010%J\u001d\u0010,\u001a\u00020\u000b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010&¢\u0006\u0004\b,\u0010)R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u001b\u00108\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101¨\u0006;"}, d2 = {"Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", "Landroid/view/View;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljoa;", "shape", "", "setAvatarShape", "(Ljoa;)V", "", "url", "setAvatarUrl", "(Ljava/lang/String;)V", "", "urls", "setAvatarUrls", "(Ljava/util/List;)V", "Lee0;", "placeholderIcon", "setCustomPlaceholder", "(Lee0;)V", "Landroid/graphics/drawable/Drawable;", "overlayIcon", "setOverlay", "(Landroid/graphics/drawable/Drawable;)V", "Lbe0;", "overlay", "setCustomOverlay", "(Lbe0;)V", "", "visible", "setCloseBadgeVisibility", "(Z)V", "Lkotlin/Function0;", "listener", "setCloseBadgeClickListener", "(Lkotlin/jvm/functions/Function0;)V", "setOnlineBadgeVisibility", "setAddBadgeVisibility", "setOnImageLoadedListener", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "y", "Lkotlin/Lazy;", "getAddBadgeDrawable", "()Lone/me/sdk/richvector/EnhancedVectorDrawable;", "addBadgeDrawable", "z", "getOnlineBadgeDrawable", "onlineBadgeDrawable", "v0", "getCloseBadgeDrawable", "closeBadgeDrawable", "ct", "koa", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeAvatarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeAvatarView.kt\none/me/sdk/uikit/common/avatar/OneMeAvatarView\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 AvatarAbbreviationModel.kt\none/me/sdk/uikit/common/avatar/AvatarAbbreviationModelKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n+ 8 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,441:1\n5#2:442\n8#3:443\n8#3:444\n8#3:445\n1557#4:446\n1628#4,3:447\n20#5:450\n1#6:451\n182#7,6:452\n182#7,6:458\n182#7,6:464\n182#7,6:470\n24#8:476\n24#8:477\n24#8:478\n24#8:479\n24#8:480\n24#8:481\n24#8:482\n24#8:483\n24#8:484\n24#8:485\n*S KotlinDebug\n*F\n+ 1 OneMeAvatarView.kt\none/me/sdk/uikit/common/avatar/OneMeAvatarView\n*L\n47#1:442\n60#1:443\n67#1:444\n74#1:445\n167#1:446\n167#1:447,3\n219#1:450\n287#1:452,6\n297#1:458,6\n307#1:464,6\n317#1:470,6\n331#1:476\n332#1:477\n333#1:478\n334#1:479\n342#1:480\n343#1:481\n344#1:482\n345#1:483\n347#1:484\n352#1:485\n*E\n"})
public final class OneMeAvatarView extends View implements phf {
    public static final /* synthetic */ int E0 = 0;
    public ee0 A0;
    public final w4d B0;
    public final j5 C0;
    public List D0;
    public final String a = OneMeAvatarView.class.getName();
    public final mv4 b;
    public joa c;
    public koa o;
    public boolean v;
    public final Lazy v0;
    public boolean w;
    public Function0 w0;
    public boolean x;
    public Function0 x0;
    public final Lazy y;
    public boolean y0;
    public final Lazy z;
    public fd0 z0;

    @JvmOverloads
    public OneMeAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mv4 mv4 = new mv4(new tp6(getResources()).a());
        z7d e = mv4.e();
        if (e != null) {
            e.setCallback(this);
        }
        lv4 lv4 = mv4.o;
        lv4.getClass();
        ig5 ig5 = ((sp6) lv4).e;
        ig5.Z = 50;
        if (ig5.Y == 1) {
            ig5.Y = 0;
        }
        this.b = mv4;
        this.c = goa.a;
        this.o = koa.a;
        p35 p35 = new p35(context, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = LazyKt.lazy(lazyThreadSafetyMode, p35);
        this.z = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 16));
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 17));
        this.B0 = new w4d();
        this.C0 = new j5(2, this);
        mv4.i(e());
    }

    public static void g(OneMeAvatarView oneMeAvatarView, Drawable drawable, joa joa, int i) {
        if ((i & 2) != 0) {
            joa = oneMeAvatarView.c;
        }
        joa joa2 = joa;
        k2b f = fu4.k.f(oneMeAvatarView);
        ee0 ee0 = null;
        i9 i9Var = (i & 8) != 0 ? new i9(f, 2) : null;
        i9 i9Var2 = (i & 16) != 0 ? new i9(f, 3) : null;
        oneMeAvatarView.setAvatarShape(joa2);
        if (drawable != null) {
            ee0 = new ee0(drawable, joa2, f, i9Var, i9Var2);
        }
        oneMeAvatarView.setCustomPlaceholder(ee0);
        oneMeAvatarView.invalidate();
    }

    private final EnhancedVectorDrawable getAddBadgeDrawable() {
        return (EnhancedVectorDrawable) this.y.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.v0.getValue();
    }

    private final EnhancedVectorDrawable getOnlineBadgeDrawable() {
        return (EnhancedVectorDrawable) this.z.getValue();
    }

    public final jnb e() {
        knb a2 = ld9.p.get();
        a2.g = this.B0;
        a2.h = this.C0;
        a2.l = this.b.v;
        a2.k = true;
        return a2.a();
    }

    public final void f(gd0 gd0, boolean z2) {
        mv4 mv4 = this.b;
        if (gd0 != null && (gd0.a != 0 || gd0.b.length() != 0)) {
            fd0 fd0 = new fd0(this.c, gd0, fu4.k.e(getContext()).f());
            fd0.z.setValue(fd0, fd0.X[0], Boolean.valueOf(z2));
            this.z0 = fd0;
            lv4 lv4 = mv4.o;
            lv4.getClass();
            ((sp6) lv4).i(fd0, 1);
            lv4 lv42 = mv4.o;
            lv42.getClass();
            ((sp6) lv42).i(fd0, 5);
            this.o = koa.c;
        } else if (this.o == koa.c) {
            lv4 lv43 = mv4.o;
            lv43.getClass();
            ((sp6) lv43).i((Drawable) null, 1);
            this.z0 = null;
            this.o = koa.a;
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new moa(this, drawable, 0));
        } else {
            post(new noa(this, drawable, 0));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.g();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.h();
    }

    public final void onDraw(Canvas canvas) {
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        z7d e = this.b.e();
        if (e != null) {
            e.setBounds(0, 0, min, min);
        }
        if (e != null) {
            e.draw(canvas);
        }
        if (this.v) {
            int roundToInt = min >= MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density) : min >= MathKt.roundToInt(((float) 54) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density) : min >= MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density) : MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
            getCloseBadgeDrawable().setBounds(min - roundToInt, 0, min, roundToInt);
            getCloseBadgeDrawable().draw(canvas);
        }
        if (this.w) {
            int roundToInt2 = min - (min >= MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density) : min >= MathKt.roundToInt(((float) 54) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density) : min >= MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density) : MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
            float f = (float) 3;
            getOnlineBadgeDrawable().setBounds(g63.b(f, vo4.c().getDisplayMetrics().density, roundToInt2), g63.b(f, vo4.c().getDisplayMetrics().density, roundToInt2), g63.b(f, vo4.c().getDisplayMetrics().density, min), g63.b(f, vo4.c().getDisplayMetrics().density, min));
            getOnlineBadgeDrawable().draw(canvas);
        }
        if (this.x) {
            float f2 = (float) 28;
            getAddBadgeDrawable().setBounds(a81.e(f2, vo4.c().getDisplayMetrics().density, min), a81.e(f2, vo4.c().getDisplayMetrics().density, min), min, min);
            getAddBadgeDrawable().draw(canvas);
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.g();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.b.h();
    }

    public final void onThemeChanged(k2b k2b) {
        fd0 fd0;
        EnhancedVectorDrawable addBadgeDrawable = getAddBadgeDrawable();
        hi7.Y(addBadgeDrawable, "background", k2b.c().a.f);
        hi7.Y(addBadgeDrawable, "plus", k2b.getIcon().b);
        EnhancedVectorDrawable onlineBadgeDrawable = getOnlineBadgeDrawable();
        hi7.Y(onlineBadgeDrawable, "online", k2b.getIcon().e);
        int i = k2b.c().i;
        VectorPath findPath = onlineBadgeDrawable.findPath("online");
        if (findPath != null) {
            findPath.setStrokeColor(i);
            onlineBadgeDrawable.invalidatePath();
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        k2b.getIcon().getClass();
        hi7.Y(closeBadgeDrawable, "cross", -1);
        hi7.Y(closeBadgeDrawable, "circle_background", k2b.getIcon().i);
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            ee0 ee0 = this.A0;
            if (ee0 != null) {
                ee0.onThemeChanged(k2b);
            }
        } else if (ordinal == 2 && (fd0 = this.z0) != null) {
            fd0.onThemeChanged(k2b);
        }
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function0 function0;
        if (!this.v || this.x0 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.y0 && getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (function0 = this.x0) != null) {
                function0.invoke();
            }
            return super.onTouchEvent(motionEvent);
        }
        boolean contains = getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        this.y0 = contains;
        if (contains) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ooa(this, drawable, runnable, j, 0));
            return;
        }
        post(new ooa(this, drawable, runnable, j, 1));
    }

    public final void setAddBadgeVisibility(boolean z2) {
        this.x = z2;
        if (z2) {
            this.w = false;
        }
        invalidate();
    }

    public final void setAvatarShape(joa joa) {
        if (!Intrinsics.areEqual((Object) this.c, (Object) joa)) {
            this.c = joa;
            invalidate();
        }
    }

    public final void setAvatarUrl(String str) {
        qa7 qa7;
        List list = this.D0;
        if (list != null && list.size() == 1) {
            List list2 = this.D0;
            if (Intrinsics.areEqual((Object) list2 != null ? (String) CollectionsKt.first(list2) : null, (Object) str)) {
                return;
            }
        }
        if (str == null || str.length() == 0) {
            this.D0 = null;
            qa7 = null;
        } else {
            this.D0 = CollectionsKt.listOf(str);
            hd0 hd0 = foa.a;
            qa7 = foa.b(str, this.c, 4);
        }
        mv4 mv4 = this.b;
        if (qa7 != null) {
            ba7 B = ld9.B();
            B.getClass();
            this.B0.a(new aa7(B, qa7, str));
            if (mv4.v == null) {
                mv4.i(e());
                return;
            }
            return;
        }
        mv4.i((gv4) null);
    }

    public final void setAvatarUrls(List<String> list) {
        Collection collection = list;
        if (collection == null || collection.isEmpty() || !Intrinsics.areEqual((Object) this.D0, (Object) list)) {
            mv4 mv4 = this.b;
            if (collection == null || collection.isEmpty()) {
                mv4.i((gv4) null);
                this.D0 = null;
                return;
            }
            Iterable<String> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (String str : iterable) {
                hd0 hd0 = foa.a;
                qa7 b2 = foa.b(str, this.c, 4);
                ba7 B = ld9.B();
                B.getClass();
                arrayList.add(new aa7(B, b2, str));
            }
            se7 se7 = new se7(arrayList, true);
            this.D0 = list;
            this.B0.a(se7);
            if (mv4.v == null) {
                mv4.i(e());
            }
        }
    }

    public final void setCloseBadgeClickListener(Function0<Unit> function0) {
        this.x0 = function0;
    }

    public final void setCloseBadgeVisibility(boolean z2) {
        this.v = z2;
        invalidate();
    }

    public final void setCustomOverlay(be0 be0) {
        mv4 mv4 = this.b;
        if (be0 == null) {
            lv4 lv4 = mv4.o;
            lv4.getClass();
            ((sp6) lv4).k((Drawable) null);
            return;
        }
        lv4 lv42 = mv4.o;
        lv42.getClass();
        ((sp6) lv42).k(be0);
    }

    public final void setCustomPlaceholder(ee0 ee0) {
        mv4 mv4 = this.b;
        if (ee0 != null) {
            this.A0 = ee0;
            lv4 lv4 = mv4.o;
            lv4.getClass();
            ((sp6) lv4).i(ee0, 1);
            this.o = koa.b;
        } else if (this.o == koa.b) {
            lv4 lv42 = mv4.o;
            lv42.getClass();
            ((sp6) lv42).i((Drawable) null, 1);
            this.A0 = null;
            this.o = koa.a;
        }
    }

    public final void setOnImageLoadedListener(Function0<Unit> function0) {
        this.w0 = function0;
    }

    public final void setOnlineBadgeVisibility(boolean z2) {
        this.w = z2;
        if (z2) {
            this.x = false;
        }
        invalidate();
    }

    public final void setOverlay(Drawable drawable) {
        be0 be0;
        if (drawable != null) {
            joa joa = this.c;
            Context context = getContext();
            be0 = new be0(drawable, joa, context, new ae0(context, 0), new ae0(context, 1));
        } else {
            be0 = null;
        }
        setCustomOverlay(be0);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new poa(this, drawable, runnable, 0));
        } else {
            post(new poa(this, drawable, runnable, 1));
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.b.e() == drawable || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new moa(this, drawable, 1));
        } else {
            post(new noa(this, drawable, 1));
        }
    }
}
