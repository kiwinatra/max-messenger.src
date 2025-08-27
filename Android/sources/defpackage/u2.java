package defpackage;

import android.app.Dialog;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.PickerChatController;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.channels.CreateChannelViewModel;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;
import ru.ok.messages.views.dialogs.InputDialog;
import ru.ok.tamtam.nano.Protos;

/* renamed from: u2  reason: default package */
public final class u2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(Editable editable) {
    }

    private final void i(Editable editable) {
    }

    private final void j(Editable editable) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        CharSequence charSequence = "";
        boolean z = true;
        int i = 0;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return;
            case 1:
                KProperty[] kPropertyArr = AddLinkBottomSheet.Z;
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) obj;
                addLinkBottomSheet.getClass();
                OneMeButton oneMeButton = (OneMeButton) addLinkBottomSheet.X.getValue(addLinkBottomSheet, AddLinkBottomSheet.Z[2]);
                if (editable == null || editable.length() == 0 || StringsKt.contentEquals((CharSequence) editable, (CharSequence) "https://")) {
                    z = false;
                }
                oneMeButton.setEnabled(z);
                return;
            case 2:
                if (editable != null) {
                    CreateChannelFragment createChannelFragment = (CreateChannelFragment) obj;
                    if (editable.length() != 0) {
                        charSequence = String.valueOf(createChannelFragment.i3().A - editable.length());
                    }
                    t24 t24 = createChannelFragment.D1;
                    t24.getClass();
                    ((AppCompatTextView) t24.z.getValue(t24, t24.Z[6])).setText(charSequence);
                    CreateChannelViewModel i3 = createChannelFragment.i3();
                    i3.C.setValue(i3, CreateChannelViewModel.G[6], editable.toString());
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ((FolderEditFragment) obj).j3().l(editable);
                return;
            case 5:
            case 6:
            case 7:
                return;
            case 8:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) obj;
                fk8 fk8 = mediaBarPreviewLayout.R0;
                if (!(fk8 == null || editable == null)) {
                    fk8.g(editable);
                }
                if (mediaBarPreviewLayout.V0) {
                    if (mediaBarPreviewLayout.P0.f.c() <= 0) {
                        z = false;
                    }
                    mediaBarPreviewLayout.R(z);
                    return;
                }
                return;
            case 9:
                if (!TextUtils.isEmpty(editable.toString().trim()) && editable.charAt(editable.length() - 1) == 10) {
                    s3a s3a = (s3a) obj;
                    if (s3a.Y.getVisibility() == 0) {
                        s3a.N(new l3a(0));
                        return;
                    } else if (s3a.Z.getVisibility() == 0) {
                        s3a.N(new l3a(1));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                return;
            case 11:
                pza pza = (pza) obj;
                pza.o = editable;
                if (pza.D0.isInitialized()) {
                    View view = (View) pza.D0.getValue();
                    if (!(!(editable == null || editable.length() == 0))) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
                mza mza = pza.x;
                if (mza != null) {
                    mza.C(editable);
                    return;
                }
                return;
            case 12:
                CharSequence subSequence = editable != null ? editable.subSequence(0, editable.length()) : null;
                if (subSequence != null) {
                    charSequence = subSequence;
                }
                ((Function1) obj).invoke(charSequence);
                return;
            default:
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.b;
                arrayList.clear();
                if (charSequence.length() != 0 && (charSequence instanceof Spannable)) {
                    Spannable spannable = (Spannable) charSequence;
                    jf8[] jf8Arr = (jf8[]) spannable.getSpans(0, charSequence.length(), jf8.class);
                    if (jf8Arr != null && jf8Arr.length != 0) {
                        ArrayList arrayList2 = new ArrayList(jf8Arr.length);
                        for (jf8 jf8 : jf8Arr) {
                            arrayList2.add(new dq5(jf8, spannable.getSpanStart(jf8), spannable.getSpanEnd(jf8)));
                        }
                        arrayList.addAll(arrayList2);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ysa ysa;
        String str;
        String a2;
        String str2 = "";
        boolean z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                vhb l0 = ((AbstractPickerScreen) obj).l0();
                String obj2 = charSequence != null ? charSequence.toString() : null;
                xme xme = l0.z;
                if (obj2 != null) {
                    str2 = obj2;
                }
                xme.getClass();
                xme.m((Object) null, str2);
                return;
            case 1:
            case 2:
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty() && charSequence.length() != 0) {
                    SpannableString valueOf = SpannableString.valueOf(charSequence);
                    jf8[] jf8Arr = (jf8[]) valueOf.getSpans(0, valueOf.length(), jf8.class);
                    if (jf8Arr == null || jf8Arr.length != arrayList.size()) {
                        int length = valueOf.length();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            dq5 dq5 = (dq5) it.next();
                            int i4 = dq5.b;
                            if (i4 <= length) {
                                int i5 = dq5.c;
                                if (i5 > length) {
                                    i5 = length;
                                }
                                valueOf.setSpan(dq5.a, i4, i5, 33);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                String charSequence2 = charSequence.toString();
                FrgContactMultiPicker frgContactMultiPicker = (FrgContactMultiPicker) obj;
                frgContactMultiPicker.o3(charSequence2.isEmpty());
                frgContactMultiPicker.h3(charSequence2);
                return;
            case 6:
                InputDialog inputDialog = (InputDialog) obj;
                inputDialog.getClass();
                String trim = charSequence.toString().trim();
                Dialog dialog = inputDialog.w1;
                if (dialog != null) {
                    inputDialog.b3(((ed) dialog).w.k, trim);
                    return;
                }
                return;
            case 7:
                KProperty[] kPropertyArr = LogsViewerScreen.w;
                oa8 c0 = ((LogsViewerScreen) obj).c0();
                if (charSequence != null) {
                    c0.getClass();
                    if (!StringsKt.isBlank(charSequence)) {
                        c0.z.setValue(c0, oa8.Y[0], ev0.u(c0.a, ((osa) c0.c).b(), f14.b, new na8(c0, charSequence, (Continuation) null)));
                        c0.j();
                        return;
                    }
                }
                c0.getClass();
                c0.z.setValue(c0, oa8.Y[0], (Object) null);
                c0.y.setValue(CollectionsKt.emptyList());
                return;
            case 8:
            case 9:
                return;
            case 10:
                if (i3 > 1) {
                    zwa zwa = (zwa) obj;
                    if (!zwa.v && (ysa = zwa.c) != null && (str = ysa.a) != null) {
                        String valueOf2 = String.valueOf(charSequence);
                        ywa phoneFormatterProvider = zwa.getPhoneFormatterProvider();
                        if (!(phoneFormatterProvider == null || (a2 = phoneFormatterProvider.a(str, valueOf2)) == null)) {
                            valueOf2 = a2;
                        }
                        EditText editText = zwa.z;
                        editText.removeTextChangedListener(zwa.v0);
                        zwa.setText(valueOf2);
                        editText.addTextChangedListener(zwa.v0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
            case 12:
                return;
            case 13:
                KProperty[] kPropertyArr2 = PickerChatController.z0;
                whb f0 = ((PickerChatController) obj).f0();
                String obj3 = charSequence != null ? charSequence.toString() : null;
                xme xme2 = f0.C0;
                if (obj3 != null) {
                    str2 = obj3;
                }
                xme2.getClass();
                xme2.m((Object) null, str2);
                return;
            case Protos.Attaches.Attach.LOCATION:
                ((gmd) obj).onTextChanged(charSequence);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                KProperty[] kPropertyArr3 = ServerHostBottomSheet.E0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                OneMeButton oneMeButton = (OneMeButton) serverHostBottomSheet.D0.getValue(serverHostBottomSheet, ServerHostBottomSheet.E0[4]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton.setEnabled(!z);
                return;
            default:
                KProperty[] kPropertyArr4 = ServerPortBottomSheet.z0;
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj;
                serverPortBottomSheet.getClass();
                OneMeButton oneMeButton2 = (OneMeButton) serverPortBottomSheet.y0.getValue(serverPortBottomSheet, ServerPortBottomSheet.z0[1]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton2.setEnabled(!z);
                return;
        }
    }

    public u2() {
        this.a = 3;
        this.b = new ArrayList();
    }
}
