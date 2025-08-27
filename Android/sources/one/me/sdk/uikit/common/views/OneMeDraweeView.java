package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/uikit/common/views/OneMeDraweeView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "withAutoPlay", "", "setupNewController", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeDraweeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeDraweeView.kt\none/me/sdk/uikit/common/views/OneMeDraweeView\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n*L\n1#1,130:1\n5#2:131\n182#3,6:132\n*S KotlinDebug\n*F\n+ 1 OneMeDraweeView.kt\none/me/sdk/uikit/common/views/OneMeDraweeView\n*L\n23#1:131\n125#1:132,6\n*E\n"})
public class OneMeDraweeView extends SimpleDraweeView {
    public static final /* synthetic */ int z0 = 0;
    public final String v0 = getClass().getName();
    public final w4d w0 = new w4d();
    public final j5 x0 = new j5(3, this);
    public boolean y0;

    public OneMeDraweeView(Context context) {
        super(context);
        setupNewController(false);
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new vj6(13, (Object) this, (Object) drawable));
        } else {
            post(new uj6(16, this, drawable));
        }
    }

    public final void o(qa7 qa7, qa7 qa72) {
        r2f r2f;
        w4d w4d = this.w0;
        if (qa7 != null) {
            if (qa72 != null) {
                ba7 B = ld9.B();
                B.getClass();
                aa7 aa7 = new aa7(B, qa7, (Object) null);
                ba7 B2 = ld9.B();
                B2.getClass();
                r2f = new se7(CollectionsKt.listOf(aa7, new aa7(B2, qa72, (Object) null)), false);
            } else {
                ba7 B3 = ld9.B();
                B3.getClass();
                r2f = new aa7(B3, qa7, (Object) null);
            }
            w4d.a(r2f);
            if (getController() == null) {
                setupNewController(this.y0);
            }
        } else if (qa72 != null) {
            ba7 B4 = ld9.B();
            B4.getClass();
            w4d.a(new aa7(B4, qa72, (Object) null));
            if (getController() == null) {
                setupNewController(this.y0);
            }
        } else {
            setController((gv4) null);
        }
    }

    public void p(k97 k97, Animatable animatable) {
    }

    public final void setupNewController(boolean z) {
        this.y0 = z;
        knb a = ld9.p.get();
        a.g = this.w0;
        a.h = this.x0;
        a.l = getController();
        a.j = z;
        setController(a.a());
    }

    public OneMeDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupNewController(false);
    }
}
