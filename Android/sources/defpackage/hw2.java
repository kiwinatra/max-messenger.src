package defpackage;

import android.view.View;
import android.widget.EditText;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.profile.ProfileScreen;

/* renamed from: hw2  reason: default package */
public final class hw2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                zo3 zo3 = (zo3) obj;
                ((tw2) obj2).N0.e(zo3.a, zo3.Z);
                return Unit.INSTANCE;
            case 1:
                Long l = (Long) obj;
                return f6e.a((a32) obj2);
            case 2:
                View view = (View) obj;
                KProperty[] kPropertyArr = FolderMemberPickerScreen.v0;
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj2;
                p16 p16 = (p16) folderMemberPickerScreen.l0().c;
                KProperty kProperty = FolderMemberPickerScreen.v0[0];
                String str = (String) folderMemberPickerScreen.Y.a(folderMemberPickerScreen);
                if (!p16.g) {
                    p16.g = true;
                    d14 d14 = p16.f;
                    if (d14 != null) {
                        ev0.u(d14, caa.a.plus(((osa) ((gaf) p16.c.getValue())).b()), f14.c, new o16(p16, str, (Continuation) null));
                    }
                }
                return Unit.INSTANCE;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    zwa zwa = (zwa) obj2;
                    EditText editText = zwa.z;
                    editText.requestFocus();
                    editText.post(new sx8(15, zwa, editText));
                    zwa.setOnWindowFocusChanged((Function1<? super Boolean, Unit>) null);
                }
                return Unit.INSTANCE;
            case 4:
                Throwable th = (Throwable) obj;
                try {
                    ((jtc) obj2).e();
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 5:
                Throwable th2 = (Throwable) obj;
                ((whb) obj2).j().h = null;
                return Unit.INSTANCE;
            case 6:
                Throwable th3 = (Throwable) obj;
                KProperty[] kPropertyArr2 = jib.D0;
                ((jib) obj2).k().h = null;
                return Unit.INSTANCE;
            case 7:
                Throwable th4 = (Throwable) obj;
                Result.Companion companion = Result.Companion;
                Unit unit = Unit.INSTANCE;
                ((kw1) obj2).resumeWith(Result.m23constructorimpl(unit));
                return unit;
            case 8:
                View view2 = (View) obj;
                KProperty[] kPropertyArr3 = ProfileScreen.D0;
                k7c g0 = ((ProfileScreen) obj2).g0();
                j91 e = g0.I0.e();
                if (e != null) {
                    xag.h(g0.x0, e);
                }
                return Unit.INSTANCE;
            default:
                Throwable th5 = (Throwable) obj;
                ((mq4) obj2).dispose();
                return Unit.INSTANCE;
        }
    }
}
