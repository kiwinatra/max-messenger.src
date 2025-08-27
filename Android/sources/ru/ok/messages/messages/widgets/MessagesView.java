package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/messages/widgets/MessagesView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class MessagesView extends CoordinatorLayout {
    @JvmOverloads
    public MessagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.view_messages, this);
    }
}
