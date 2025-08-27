package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.reflect.KProperty;

/* renamed from: e41  reason: default package */
public final class e41 extends qf5 {
    public static final /* synthetic */ KProperty[] Y;
    public final w28 X = c(mic.call_button);
    public final w28 c = c(mic.grabber_view);
    public final w28 o = c(mic.title);
    public final w28 v = c(mic.subtitle_template);
    public final w28 w = c(mic.subtitle);
    public final w28 x = c(mic.faces);
    public final w28 y = c(mic.faces_divider);
    public final w28 z = c(mic.switched_divider);

    static {
        Class<e41> cls = e41.class;
        Y = new KProperty[]{wj6.p(cls, "contentView", "getContentView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wj6.p(cls, "grabberView", "getGrabberView()Landroid/view/View;", 0), wj6.p(cls, "title", "getTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "subtitleTemplate", "getSubtitleTemplate()Landroid/view/View;", 0), wj6.p(cls, "subtitle", "getSubtitle()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "faces", "getFaces()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "facesDivider", "getFacesDivider()Landroid/view/View;", 0), wj6.p(cls, "microphone", "getMicrophone()Lru/ok/tamtam/calls/ui/IconSwitch;", 0), wj6.p(cls, "switchDivider", "getSwitchDivider()Landroid/view/View;", 0), wj6.p(cls, "videocamera", "getVideocamera()Lru/ok/tamtam/calls/ui/IconSwitch;", 0), wj6.p(cls, "button", "getButton()Landroid/widget/Button;", 0)};
    }

    public final Button d() {
        return (Button) this.X.getValue(this, Y[10]);
    }

    public final RecyclerView e() {
        return (RecyclerView) this.x.getValue(this, Y[5]);
    }

    public final AppCompatTextView f() {
        return (AppCompatTextView) this.w.getValue(this, Y[4]);
    }

    public final View g() {
        return (View) this.v.getValue(this, Y[3]);
    }
}
