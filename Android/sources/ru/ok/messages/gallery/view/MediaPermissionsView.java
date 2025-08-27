package ru.ok.messages.gallery.view;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/gallery/view/MediaPermissionsView;", "Landroid/widget/LinearLayout;", "Lbif;", "Lkotlin/Function0;", "", "action", "setOnPermissionsClickListener", "(Lkotlin/jvm/functions/Function0;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaPermissionsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPermissionsView.kt\nru/ok/messages/gallery/view/MediaPermissionsView\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,49:1\n49#2,2:50\n45#2:52\n49#2,2:53\n45#2:55\n*S KotlinDebug\n*F\n+ 1 MediaPermissionsView.kt\nru/ok/messages/gallery/view/MediaPermissionsView\n*L\n39#1:50,2\n39#1:52\n41#1:53,2\n41#1:55\n*E\n"})
public final class MediaPermissionsView extends LinearLayout implements bif {
    public static final /* synthetic */ int c = 0;
    public final AppCompatTextView a = ((AppCompatTextView) findViewById(lic.media_permissions_view_title));
    public final AppCompatTextView b = ((AppCompatTextView) findViewById(lic.media_permissions_view_button));

    @JvmOverloads
    public MediaPermissionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View.inflate(context, ujc.view_media_permissions, this);
        setOrientation(1);
        c();
    }

    public final void c() {
        scf scf;
        scf scf2;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        if (isInEditMode()) {
            scf2 = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy2 = scf.b0;
            scf2 = j4b.k0(context2);
        }
        setBackgroundColor(scf2.n);
        RippleDrawable e = scf.e();
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setBackground(e);
        appCompatTextView.setTextColor(scf.l);
        this.a.setTextColor(scf.N);
    }

    public final void setOnPermissionsClickListener(Function0<Unit> function0) {
        ct.G(this.b, 300, new e7(14, function0));
    }
}
