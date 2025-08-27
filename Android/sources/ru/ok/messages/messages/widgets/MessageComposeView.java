package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/messages/widgets/MessageComposeView;", "Landroid/widget/LinearLayout;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMessageComposeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComposeView.kt\nru/ok/messages/messages/widgets/MessageComposeView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,20:1\n24#2:21\n*S KotlinDebug\n*F\n+ 1 MessageComposeView.kt\nru/ok/messages/messages/widgets/MessageComposeView\n*L\n18#1:21\n*E\n"})
public final class MessageComposeView extends LinearLayout {
    @JvmOverloads
    public MessageComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(getContext(), ujc.view_message_compose, this);
        setOrientation(0);
        float f = (float) 6;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
    }
}
