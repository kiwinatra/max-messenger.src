package ru.ok.messages.settings.folders.tutor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lru/ok/messages/settings/folders/tutor/FolderTutorLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "", "y", "Lkotlin/jvm/functions/Function0;", "getTutorFinishCallback", "()Lkotlin/jvm/functions/Function0;", "setTutorFinishCallback", "(Lkotlin/jvm/functions/Function0;)V", "tutorFinishCallback", "h56", "i56", "a20", "g56", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderTutorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderTutorLayout.kt\nru/ok/messages/settings/folders/tutor/FolderTutorLayout\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n49#2,2:182\n45#2:184\n49#2,2:185\n45#2:187\n1863#3,2:188\n1863#3,2:190\n1557#3:192\n1628#3,3:193\n1863#3,2:196\n*S KotlinDebug\n*F\n+ 1 FolderTutorLayout.kt\nru/ok/messages/settings/folders/tutor/FolderTutorLayout\n*L\n42#1:182,2\n42#1:184\n56#1:185,2\n56#1:187\n66#1:188,2\n124#1:190,2\n145#1:192\n145#1:193,3\n147#1:196,2\n*E\n"})
public final class FolderTutorLayout extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final Path o;
    public List v;
    public boolean w;
    public boolean x;
    public Function0 y;

    @JvmOverloads
    public FolderTutorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        scf scf;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(fw3.a(context, lad.e));
        this.a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(8.0f);
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        paint2.setColor(scf.m);
        this.b = paint2;
        this.c = new Path();
        this.o = new Path();
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = this.w;
        Paint paint = this.a;
        Path path = this.c;
        if (z) {
            List<h56> list = this.v;
            if (list != null) {
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
                canvas.restore();
                for (h56 h56 : list) {
                    canvas.save();
                    i56 i56 = h56.a;
                    canvas.translate(i56.a, i56.b);
                    ((StaticLayout) h56.a.c).draw(canvas);
                    canvas.restore();
                }
                canvas.drawPath(this.o, this.b);
            }
        } else if (this.x) {
            canvas.save();
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            canvas.restore();
        }
    }

    public final Function0<Unit> getTutorFinishCallback() {
        return this.y;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        List list = this.v;
        if (list == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Iterable<h56> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (h56 h56 : iterable) {
            arrayList.add(h56.b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Rect) it.next()).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        Function0 function0 = this.y;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public final void setTutorFinishCallback(Function0<Unit> function0) {
        this.y = function0;
    }
}
