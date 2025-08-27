package ru.ok.messages.gallery;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/messages/gallery/GalleryResultViewModel;", "Lyag;", "Lul6;", "Lhdd;", "savedStateHandle", "<init>", "(Lhdd;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGalleryResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryResultViewModel.kt\nru/ok/messages/gallery/GalleryResultViewModel\n+ 2 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 3 SavedStateHandleExt.kt\nru/ok/tamtam/shared/lifecycle/SavedStateHandleExtKt\n*L\n1#1,65:1\n16#2:66\n16#2:67\n7#3,16:68\n*S KotlinDebug\n*F\n+ 1 GalleryResultViewModel.kt\nru/ok/messages/gallery/GalleryResultViewModel\n*L\n31#1:66\n34#1:67\n36#1:68,16\n*E\n"})
public final class GalleryResultViewModel extends yag implements ul6 {
    public static final /* synthetic */ KProperty[] k = {rae.s(GalleryResultViewModel.class, "chatMode", "getChatMode()Lru/ok/messages/messages/ChatMode;", 0)};
    public final xme c;
    public final x04 d;
    public final fz9 e = new u08();
    public final etc f = new etc(f6e.a((Object) null));
    public final fz9 g = new u08((Object) null);
    public final fz9 h;
    public final fz9 i;
    public final dm4 j;

    /* JADX WARNING: type inference failed for: r1v2, types: [fz9, u08] */
    /* JADX WARNING: type inference failed for: r1v4, types: [fz9, u08] */
    /* JADX WARNING: type inference failed for: r1v5, types: [fz9, u08] */
    public GalleryResultViewModel(hdd hdd) {
        xme a = f6e.a((Object) null);
        this.c = a;
        this.d = kv0.j(a, (CoroutineContext) null, 3);
        ? u08 = new u08((Object) null);
        this.h = u08;
        this.i = u08;
        this.j = new dm4(14, (Object) hdd, (Object) uk2.DEFAULT);
    }
}
