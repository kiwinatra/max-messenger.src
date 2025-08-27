package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\nJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantsStorage", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "", "sendActualState", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "sendActualStateToAll", "()V", "Leu9;", "updates", "updateState", "(Leu9;)V", "", "position", "Lyt9;", "getPosition", "(Ljava/lang/Long;)Lyt9;", "Lcu9;", "startInfo", "onVideoStarted", "(Lcu9;)V", "onVideoStatesUpdatedChanged", "Lfu9;", "stopInfo", "onVideoStopped", "(Lfu9;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "movieStates", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWatchTogetherListenerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchTogetherListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1855#2,2:153\n1855#2,2:155\n1855#2,2:158\n1#3:157\n*S KotlinDebug\n*F\n+ 1 WatchTogetherListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl\n*L\n57#1:153,2\n81#1:155,2\n137#1:158,2\n*E\n"})
public final class WatchTogetherListenerManagerImpl implements WatchTogetherListenerManager {
    private final CopyOnWriteArraySet<WatchTogetherListener> listeners = new CopyOnWriteArraySet<>();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile MovieStates movieStates = new MovieStates(MapsKt.emptyMap());
    private final ParticipantStore participantsStorage;

    public WatchTogetherListenerManagerImpl(ParticipantStore participantStore) {
        this.participantsStorage = participantStore;
    }

    private final yt9 getPosition(Long l) {
        return (l == null || l.longValue() < 0) ? xt9.a : new wt9(l.longValue(), TimeUnit.SECONDS);
    }

    private final void sendActualState(WatchTogetherListener watchTogetherListener) {
        this.mainHandler.post(new l8g(2, this, watchTogetherListener));
    }

    /* access modifiers changed from: private */
    public static final void sendActualState$lambda$5(WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl, WatchTogetherListener watchTogetherListener) {
        if (watchTogetherListenerManagerImpl.listeners.contains(watchTogetherListener) && (!watchTogetherListenerManagerImpl.movieStates.getStates().isEmpty())) {
            watchTogetherListener.onVideoStatesChanged(watchTogetherListenerManagerImpl.movieStates);
        }
    }

    private final void sendActualStateToAll() {
        Iterator<WatchTogetherListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatesChanged(this.movieStates);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: st9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: st9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: st9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: st9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateState(defpackage.eu9 r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r15 = r15.a
            java.util.Iterator r15 = r15.iterator()
        L_0x000b:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r15.next()
            du9 r1 = (defpackage.du9) r1
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r2 = r14.participantsStorage
            ln1 r3 = r1.a
            ue1 r3 = r3.b
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r2.getByInternal(r3)
            if (r2 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            ru.ok.android.externcalls.sdk.id.ParticipantId r11 = r2.getExternalId()
            ln1 r3 = r1.a
            vt9 r12 = r3.c
            if (r12 != 0) goto L_0x002f
            goto L_0x000b
        L_0x002f:
            a9g r3 = r3.a
            int[] r4 = defpackage.bu9.$EnumSwitchMapping$1
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0045
            r6 = 2
            if (r3 == r6) goto L_0x0042
            r3 = r4
            goto L_0x0047
        L_0x0042:
            au9 r3 = defpackage.au9.b
            goto L_0x0047
        L_0x0045:
            au9 r3 = defpackage.au9.a
        L_0x0047:
            if (r3 != 0) goto L_0x004a
            goto L_0x000b
        L_0x004a:
            java.util.List r2 = r2.getMovies()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r2.next()
            r7 = r6
            st9 r7 = (defpackage.st9) r7
            au9 r8 = r7.d
            if (r8 != r3) goto L_0x0054
            vt9 r7 = r7.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r12)
            if (r7 == 0) goto L_0x0054
            r4 = r6
        L_0x006e:
            r2 = r4
            st9 r2 = (defpackage.st9) r2
            ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState r13 = new ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState
            java.lang.Long r3 = r1.d
            yt9 r6 = r14.getPosition(r3)
            boolean r3 = r1.c
            r7 = r3 ^ 1
            float r8 = r1.b
            defpackage.iu9.a(r8)
            boolean r1 = r1.e
            r10 = 0
            r3 = r13
            r4 = r11
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r1
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.put(r12, r13)
            ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates r1 = r14.movieStates
            java.util.Map r1 = r1.getStates()
            boolean r1 = r1.containsKey(r12)
            if (r1 != 0) goto L_0x000b
            if (r2 == 0) goto L_0x000b
            ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData r1 = new ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r3 = r14.participantsStorage
            zwd r3 = r3.getActiveRoomId()
            r1.<init>(r11, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet<ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener> r2 = r14.listeners
            java.util.Iterator r2 = r2.iterator()
        L_0x00b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000b
            java.lang.Object r3 = r2.next()
            ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener r3 = (ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener) r3
            r3.onVideoStarted(r1)
            goto L_0x00b1
        L_0x00c1:
            ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates r15 = r14.movieStates
            ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates r15 = r15.copy(r0)
            r14.movieStates = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl.updateState(eu9):void");
    }

    public void addListener(WatchTogetherListener watchTogetherListener) {
        this.listeners.add(watchTogetherListener);
        sendActualState(watchTogetherListener);
    }

    public MovieStates getMovieStates() {
        return this.movieStates;
    }

    public final void onVideoStarted(cu9 cu9) {
        ConversationParticipant byInternal = this.participantsStorage.getByInternal(cu9.a);
        if (byInternal != null) {
            st9 st9 = cu9.c;
            ParticipantId externalId = byInternal.getExternalId();
            MovieStates movieStates2 = this.movieStates;
            Map<vt9, MovieState> mutableMap = MapsKt.toMutableMap(this.movieStates.getStates());
            vt9 vt9 = st9.a;
            xt9 xt9 = xt9.a;
            float f = iu9.a;
            mutableMap.put(vt9, new MovieState(externalId, xt9, true, c44.DEFAULT_ASPECT_RATIO, true, st9, (DefaultConstructorMarker) null));
            Unit unit = Unit.INSTANCE;
            this.movieStates = movieStates2.copy(mutableMap);
            MovieStartedData movieStartedData = new MovieStartedData(byInternal.getExternalId(), cu9.b, st9);
            for (WatchTogetherListener onVideoStarted : this.listeners) {
                onVideoStarted.onVideoStarted(movieStartedData);
            }
        }
    }

    public final void onVideoStatesUpdatedChanged(eu9 eu9) {
        updateState(eu9);
        sendActualStateToAll();
    }

    public final void onVideoStopped(fu9 fu9) {
        Map<vt9, MovieState> mutableMap = MapsKt.toMutableMap(this.movieStates.getStates());
        MovieState remove = mutableMap.remove(fu9.c);
        this.movieStates = this.movieStates.copy(mutableMap);
        if (remove != null) {
            MovieStoppedData movieStoppedData = new MovieStoppedData(remove.getParticipantId(), fu9.b, fu9.c, fu9.d);
            for (WatchTogetherListener onVideoStopped : this.listeners) {
                onVideoStopped.onVideoStopped(movieStoppedData);
            }
        }
    }

    public void removeListener(WatchTogetherListener watchTogetherListener) {
        this.listeners.remove(watchTogetherListener);
    }
}
