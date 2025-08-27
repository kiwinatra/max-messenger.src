package ru.ok.messages.settings.folders.filters.presentation;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/settings/folders/filters/presentation/FolderFiltersViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "h16", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderFiltersViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderFiltersViewModel.kt\nru/ok/messages/settings/folders/filters/presentation/FolderFiltersViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n774#2:179\n865#2,2:180\n1755#2,3:182\n*S KotlinDebug\n*F\n+ 1 FolderFiltersViewModel.kt\nru/ok/messages/settings/folders/filters/presentation/FolderFiltersViewModel\n*L\n172#1:179\n172#1:180,2\n173#1:182,3\n*E\n"})
public final class FolderFiltersViewModel extends AndroidViewModel {
    public final String d;
    public final u82 e;
    public final nd f;
    public final gaf g;
    public final xme h;
    public final etc i;
    public final xme j;
    public final etc k;
    public final xme l;
    public final etc m;
    public final xme n;
    public final etc o;
    public final xme p;
    public final etc q;
    public final xme r;
    public final etc s;
    public aje t;

    public FolderFiltersViewModel(Application application, String str, u82 u82, nd ndVar, gaf gaf) {
        super(application);
        this.d = str;
        this.e = u82;
        this.f = ndVar;
        this.g = gaf;
        xme a = f6e.a((Object) null);
        this.h = a;
        this.i = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.j = a2;
        this.k = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.l = a3;
        this.m = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.n = a4;
        this.o = new etc(a4);
        xme a5 = f6e.a((Object) null);
        this.p = a5;
        this.q = new etc(a5);
        xme a6 = f6e.a((Object) null);
        this.r = a6;
        this.s = new etc(a6);
        this.t = ev0.v(b0h.C(this), ((osa) gaf).a(), (f14) null, new b16(this, (Continuation) null), 2);
    }

    public static final Object j(FolderFiltersViewModel folderFiltersViewModel, Continuation continuation) {
        Object I = ev0.I(((osa) folderFiltersViewModel.g).b(), new g16(folderFiltersViewModel, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public final void i() {
        aje aje = this.t;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.t = null;
    }
}
