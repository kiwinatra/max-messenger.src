package ru.ok.messages.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/messages/UnknownPersonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lbif;", "Luvf;", "listener", "", "setListener", "(Luvf;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUnknownPersonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnknownPersonView.kt\nru/ok/messages/messages/UnknownPersonView\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,59:1\n45#2:60\n45#2:61\n45#2:62\n45#2:63\n45#2:64\n*S KotlinDebug\n*F\n+ 1 UnknownPersonView.kt\nru/ok/messages/messages/UnknownPersonView\n*L\n53#1:60\n54#1:61\n55#1:62\n56#1:63\n57#1:64\n*E\n"})
public final class UnknownPersonView extends ConstraintLayout implements bif {
    public static final /* synthetic */ int I0 = 0;
    public final AppCompatButton E0;
    public final AppCompatButton F0;
    public final AppCompatButton G0;
    public final AppCompatTextView H0 = ((AppCompatTextView) findViewById(lic.text));

    @JvmOverloads
    public UnknownPersonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.unknown_person_view, this);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(lic.addToContact);
        this.E0 = appCompatButton;
        AppCompatButton appCompatButton2 = (AppCompatButton) findViewById(lic.block);
        this.F0 = appCompatButton2;
        AppCompatButton appCompatButton3 = (AppCompatButton) findViewById(lic.hide);
        this.G0 = appCompatButton3;
        ct.G(appCompatButton, 300, new tvf(this, 0));
        ct.G(appCompatButton2, 300, new tvf(this, 1));
        ct.G(appCompatButton3, 300, new tvf(this, 2));
        c();
    }

    public final void c() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        setBackgroundColor(j4b.k0(context).n);
        this.H0.setTextColor(j4b.k0(getContext()).G);
        scf k0 = j4b.k0(getContext());
        getContext();
        iq.f(k0, this.E0, ro4.a(25.0f), 0, 0, 60);
        scf k02 = j4b.k0(getContext());
        getContext();
        iq.f(k02, this.F0, ro4.a(25.0f), j4b.k0(getContext()).J, j4b.k0(getContext()).x, 48);
        scf k03 = j4b.k0(getContext());
        getContext();
        iq.f(k03, this.G0, ro4.a(25.0f), j4b.k0(getContext()).J, j4b.k0(getContext()).x, 48);
    }

    public final void setListener(uvf uvf) {
    }
}
