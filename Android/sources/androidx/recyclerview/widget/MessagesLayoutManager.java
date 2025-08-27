package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/recyclerview/widget/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class MessagesLayoutManager extends LinearLayoutManager {
    public RecyclerView E;

    @JvmOverloads
    public MessagesLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        n1(1);
        o1(true);
        this.h = false;
    }

    public final boolean J0() {
        return false;
    }

    public final void S(View view, int i, int i2, int i3, int i4) {
        pzc U;
        RecyclerView recyclerView = this.E;
        if (recyclerView != null && (U = recyclerView.U(view)) != null) {
            if (U instanceof qx3) {
                int i5 = i3 - i;
                int width = ((recyclerView.getWidth() - i5) / 2) + recyclerView.getLeft();
                super.S(view, width, i2, width + i5, i4);
                return;
            }
            super.S(view, i, i2, i3, i4);
        }
    }

    public final void W(RecyclerView recyclerView) {
        this.E = recyclerView;
    }

    public final void X(RecyclerView recyclerView) {
        this.E = null;
    }
}
