package defpackage;

import android.app.Application;
import androidx.fragment.app.a;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;

/* renamed from: m46  reason: default package */
public final class m46 extends rc6 {
    public final Application b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;

    public m46(Application application, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16) {
        this.b = application;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
        this.h = lazy6;
        this.i = lazy7;
        this.j = lazy8;
        this.k = lazy9;
        this.l = lazy10;
        this.m = lazy11;
        this.n = lazy12;
        this.o = lazy13;
        this.p = lazy14;
        this.q = lazy15;
        this.r = lazy16;
    }

    /* JADX WARNING: type inference failed for: r15v8, types: [ic3, java.lang.Object] */
    public final a a(ClassLoader classLoader, String str) {
        boolean areEqual = Intrinsics.areEqual((Object) str, (Object) FolderSettingsFragment.class.getName());
        Lazy lazy = this.c;
        if (areEqual) {
            return new FolderSettingsFragment((f56) fi7.a(new f56(new kq9(new l46(this, 0), new l46(this, 2), new l46(this, 12), new l46(this, 13), new l46(this, 14), new l46(this, 15)))).a, (r46) lazy.getValue());
        }
        boolean areEqual2 = Intrinsics.areEqual((Object) str, (Object) FolderEditFragment.class.getName());
        Lazy lazy2 = this.f;
        Lazy lazy3 = this.k;
        if (areEqual2) {
            return new FolderEditFragment((n06) fi7.a(new n06(new l15(new l46(this, 16), new l46(this, 17), new l46(this, 18)))).a, (r46) lazy.getValue(), (p25) this.i.getValue(), (x15) lazy3.getValue(), (ch) lazy2.getValue(), (ise) this.h.getValue());
        }
        if (!Intrinsics.areEqual((Object) str, (Object) FolderPageFragment.class.getName())) {
            return Intrinsics.areEqual((Object) str, (Object) FoldersPickerFragment.class.getName()) ? new FoldersPickerFragment((m86) fi7.a(new m86(new b33(new l46(this, 25), new l46(this, 26), new l46(this, 27), new l46(this, 1), new l46(this, 3), new l46(this, 4), new l46(this, 5), new l46(this, 6)))).a, (r46) lazy.getValue(), (yva) this.d.getValue(), (x15) lazy3.getValue(), (ch) lazy2.getValue()) : Intrinsics.areEqual((Object) str, (Object) FolderFiltersFragment.class.getName()) ? new FolderFiltersFragment((h16) fi7.a(new h16(new qpg(new l46(this, 7), new l46(this, 8), new l46(this, 9), new l46(this, 10)))).a, (r46) lazy.getValue()) : super.a(classLoader, str);
        }
        l46 l46 = new l46(this, 19);
        l46 l462 = new l46(this, 11);
        l46 l463 = new l46(this, 20);
        l46 l464 = new l46(this, 21);
        l46 l465 = new l46(this, 22);
        l46 l466 = new l46(this, 23);
        l46 l467 = new l46(this, 24);
        ? obj = new Object();
        obj.a = l46;
        obj.b = l462;
        obj.c = l463;
        obj.o = l464;
        obj.v = l465;
        obj.w = l466;
        obj.x = l467;
        return new FolderPageFragment((t36) fi7.a(new t36(obj)).a, (r46) lazy.getValue(), (x15) lazy3.getValue());
    }
}
