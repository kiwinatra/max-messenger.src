package one.me.settings.privacy.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/ChangeDisabledDialog;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChangeDisabledDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeDisabledDialog.kt\none/me/settings/privacy/ui/ChangeDisabledDialog\n+ 2 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 3 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 4 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 5 Widget.kt\none/me/sdk/arch/Widget\n*L\n1#1,144:1\n20#2:145\n29#3:146\n31#4,4:147\n410#5,8:151\n*S KotlinDebug\n*F\n+ 1 ChangeDisabledDialog.kt\none/me/settings/privacy/ui/ChangeDisabledDialog\n*L\n99#1:145\n99#1:146\n100#1:147,4\n108#1:151,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChangeDisabledDialog extends BottomSheetWidget {
    public static final /* synthetic */ int w0 = 0;

    public ChangeDisabledDialog() {
        super((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new mz1(this, frameLayout.getContext());
    }
}
