package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

@SourceDebugExtension({"SMAP\nCallsAudioManagerV3Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallsAudioManagerV3Impl.kt\nru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,895:1\n1#2:896\n1#2:921\n1549#3:897\n1620#3,3:898\n288#3,2:901\n288#3,2:903\n1549#3:905\n1620#3,3:906\n288#3,2:909\n1603#3,9:911\n1855#3:920\n1856#3:922\n1612#3:923\n288#3,2:924\n*S KotlinDebug\n*F\n+ 1 CallsAudioManagerV3Impl.kt\nru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl\n*L\n870#1:921\n277#1:897\n277#1:898,3\n526#1:901,2\n530#1:903,2\n771#1:905\n771#1:906,3\n804#1:909,2\n870#1:911,9\n870#1:920\n870#1:922\n870#1:923\n874#1:924,2\n*E\n"})
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b-\b\u0001\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0017H\u0002J\b\u0010P\u001a\u00020NH\u0003J\b\u0010Q\u001a\u00020NH\u0003J\b\u0010R\u001a\u00020NH\u0002J\u0010\u0010S\u001a\u00020N2\u0006\u0010A\u001a\u00020BH\u0003J6\u0010T\u001a\u00020N2\u0006\u0010A\u001a\u00020B2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0016JH\u0010Z\u001a\u00020N2\u0006\u0010[\u001a\u00020K2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020N0V2\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0002JH\u0010]\u001a\u00020N2\u0006\u0010[\u001a\u00020K2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020N0V2\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0002J\u0012\u0010^\u001a\u0004\u0018\u00010\u00172\u0006\u0010_\u001a\u000206H\u0002J\b\u0010`\u001a\u00020KH\u0002J\u001a\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180b0 H\u0002J\u0014\u0010c\u001a\u0004\u0018\u00010\u00172\b\u0010d\u001a\u0004\u0018\u00010\u0018H\u0003J\u001c\u0010e\u001a\u00020\u00172\b\b\u0002\u0010f\u001a\u00020\t2\b\b\u0002\u0010g\u001a\u00020\tH\u0003J\u0012\u0010h\u001a\u00020N2\b\u0010d\u001a\u0004\u0018\u00010\u0018H\u0003J0\u0010i\u001a\u00020N2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N0X2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N0XH\u0016J0\u0010k\u001a\u00020N2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N0X2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N0XH\u0016J\u001e\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010b2\u0006\u0010d\u001a\u00020\u0018H\u0002J\b\u0010m\u001a\u00020NH\u0003J\b\u0010n\u001a\u00020NH\u0002J\b\u0010o\u001a\u00020NH\u0016J\u001f\u0010p\u001a\u00020N2\u0010\u0010q\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010rH\u0016¢\u0006\u0002\u0010sJ\u001f\u0010t\u001a\u00020N2\u0010\u0010u\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010rH\u0016¢\u0006\u0002\u0010sJ\u0010\u0010v\u001a\u00020N2\u0006\u0010A\u001a\u00020BH\u0003J\u0012\u0010w\u001a\u00020N2\b\u0010d\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010x\u001a\u00020NH\u0003J\b\u0010y\u001a\u00020NH\u0003J.\u0010z\u001a\u00020N2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0016J\b\u0010{\u001a\u00020NH\u0003J\b\u0010|\u001a\u00020NH\u0003J\u0010\u0010}\u001a\u00020N2\u0006\u0010d\u001a\u00020\u0017H\u0003J\u0010\u0010~\u001a\u00020N2\u0006\u0010d\u001a\u00020\u0017H\u0003J\b\u0010\u001a\u00020NH\u0002J\t\u0010\u0001\u001a\u00020NH\u0016J\t\u0010\u0001\u001a\u00020NH\u0003J\t\u0010\u0001\u001a\u00020NH\u0003J\t\u0010\u0001\u001a\u00020NH\u0003J\t\u0010\u0001\u001a\u00020NH\u0003J\u0011\u0010\u0001\u001a\u00020N2\u0006\u0010d\u001a\u00020\u0017H\u0003J\u0011\u0010\u0001\u001a\u00020N2\u0006\u0010d\u001a\u00020\u0017H\u0003J8\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\u00172\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0016J8\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u0002062\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\u001aH\u0003J\u0013\u0010\u0001\u001a\u00020\t2\b\u0010d\u001a\u0004\u0018\u00010\u0018H\u0003J\u0014\u0010\u0001\u001a\u00020N2\t\u0010\u0001\u001a\u0004\u0018\u00010:H\u0016J\u0014\u0010\u0001\u001a\u00020N2\t\u0010\u0001\u001a\u0004\u0018\u00010:H\u0003J\u001b\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0003JA\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\t2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010V2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020N\u0018\u00010XH\u0016J\t\u0010\u0001\u001a\u00020NH\u0002J\t\u0010\u0001\u001a\u00020NH\u0003J\t\u0010\u0001\u001a\u00020NH\u0002J\t\u0010\u0001\u001a\u00020NH\u0003J\t\u0010\u0001\u001a\u00020NH\u0003J\t\u0010\u0001\u001a\u00020NH\u0003J\u0014\u0010\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0001\u001a\u00020\tH\u0002J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\tH\u0003R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170&X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u000e\u00101\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.R\u000e\u00103\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020<X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020<X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u000208X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u0004\u0018\u00010\u0018*\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl;", "Landroid/media/AudioDeviceCallback;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Landroid/media/AudioManager$OnCommunicationDeviceChangedListener;", "context", "Landroid/content/Context;", "proximityTracker", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "trackProximityWhenSpeakerEnabled", "", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "disabledAudioDeviceUsagePolicy", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "audioDeviceByCallsDevice", "", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Landroid/media/AudioDeviceInfo;", "audioDeviceSyncCount", "", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioManager", "Landroid/media/AudioManager;", "availableAudioDevices", "", "getAvailableAudioDevices", "()Ljava/util/List;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "callsAudioDevices", "", "currentDevice", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "disabledBluetoothOnce", "disabledSpeakerOnce", "hasEarpiece", "getHasEarpiece", "()Z", "hasWiredHeadset", "getHasWiredHeadset", "isDestroyed", "isHeadsetConnected", "isInCall", "isStarted", "lastKnownAudioDeviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "mainHandler", "Landroid/os/Handler;", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "recoverDeviceByTypeRunnable", "Ljava/lang/Runnable;", "reportedAudioDevice", "savedIsMicrophoneMute", "savedIsSpeakerPhoneOn", "savedPreviousState", "state", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "syncWithSystemCommunicationDeviceRunnable", "tryAgainRunnable", "usedDevice", "workerThreadHandler", "audioDeviceInfo", "getAudioDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)Landroid/media/AudioDeviceInfo;", "androidDeviceToString", "", "info", "applyCurrentDevice", "", "selectedDevice", "cancelScheduledSyncWithSystemCommunicationDevice", "cancelScheduledTrySetCommunicationDeviceAgain", "cancelUtilizedDeviceTypeRecovery", "changeState", "changeStateAsync", "onComplete", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "doOnOwnThread", "action", "block", "doOnOwnThreadUnsafe", "firstOfType", "type", "getAudioManagerStateDetails", "getAvailableDevices", "Lkotlin/Pair;", "getDeviceForAndroidDevice", "device", "getPreferredAudioDevice", "bluetooth", "respectSpeakerEnabled", "handleCurrentCommunicationDevice", "hasBluetoothHeadsetAsync", "onSuccess", "hasWiredHeadsetAsync", "mapAndroidDeviceToCallsDevice", "maybeRecoverUtilizedDeviceType", "maybeSyncAudioDeviceList", "notifyBluetoothPermissionGranted", "onAudioDevicesAdded", "addedDevices", "", "([Landroid/media/AudioDeviceInfo;)V", "onAudioDevicesRemoved", "removedDevices", "onCallStateChangedInternal", "onCommunicationDeviceChanged", "recoverPreviouslyUtilizedDeviceType", "release", "releaseAsync", "releaseAudioFocus", "rememberUtilizedDeviceType", "reportAudioDeviceOnMainThread", "reportCurrentCallsAudioDevice", "requestAudioFocus", "requestAudioFocusAsync", "restorePreviousAudioState", "savePreviousState", "scheduleSyncWithSystemCommunicationDevice", "scheduleTryToSetCommunicationDeviceAgain", "selectAudioDevice", "setAudioDevice", "setAudioDeviceAsync", "audioDevice", "setAudioDeviceTypeAsync", "setAudioManagerModeSafe", "mode", "setCommunicationDevice", "setOnAudioDeviceChangeListener", "listener", "setOnAudioDeviceChangeListenerImpl", "setSpeakerEnabled", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "start", "startTrackingAudioDevices", "syncAudioDeviceList", "syncWithSystemCommunicationDevice", "trySetCommunicationDeviceAgain", "trySetCommunicationDeviceAgainUnsafe", "updateAvailableDeviceList", "byStopRinging", "updateProximityTrackingState", "speakerOn", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(31)
public final class CallsAudioManagerV3Impl extends AudioDeviceCallback implements CallsAudioManager, AudioManager$OnCommunicationDeviceChangedListener {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");
    @Deprecated
    public static final long ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS = 2000;
    @Deprecated
    public static final String TAG = "CallsAudioManagerV3Impl";
    @Deprecated
    public static final long TRY_AGAIN_TIMEOUT_MS = 2000;
    @Deprecated
    public static final long USED_DEVICE_RECOVER_TIMEOUT_MS = 3000;
    private final Map<CallsAudioDeviceInfo, AudioDeviceInfo> audioDeviceByCallsDevice = new LinkedHashMap();
    private final AudioDeviceSelector audioDeviceSelector;
    private int audioDeviceSyncCount;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final HandlerThread backgroundHandlerThread;
    /* access modifiers changed from: private */
    public final List<CallsAudioDeviceInfo> callsAudioDevices = new ArrayList();
    private final CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    /* access modifiers changed from: private */
    public boolean isDestroyed;
    private boolean isInCall;
    private boolean isStarted;
    private CallsAudioManager.AudioDeviceType lastKnownAudioDeviceType = CallsAudioManager.AudioDeviceType.NONE;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final Handler mainHandler;
    private CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final ProximityTracker proximityTracker;
    private final Runnable recoverDeviceByTypeRunnable;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.State state;
    private final Runnable syncWithSystemCommunicationDeviceRunnable;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final Runnable tryAgainRunnable;
    /* access modifiers changed from: private */
    public CallsAudioDeviceInfo usedDevice;
    private final VideoTracker videoTracker;
    private final Handler workerThreadHandler;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl$Companion;", "", "()V", "NO_DEVICE", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getNO_DEVICE", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS", "", "TAG", "", "TRY_AGAIN_TIMEOUT_MS", "USED_DEVICE_RECOVER_TIMEOUT_MS", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final CallsAudioDeviceInfo getNO_DEVICE() {
            return CallsAudioManagerV3Impl.NO_DEVICE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State[] r0 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.RINGING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.DIALING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.CONVERSATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.WhenMappings.<clinit>():void");
        }
    }

    public CallsAudioManagerV3Impl(Context context, ProximityTracker proximityTracker2, boolean z, VideoTracker videoTracker2, AudioDeviceSelector audioDeviceSelector2, CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy2, CallsAudioManager.OnMuteListener onMuteListener, Logger logger2) {
        this.proximityTracker = proximityTracker2;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker2;
        this.audioDeviceSelector = audioDeviceSelector2;
        this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy2;
        Logger logger3 = logger2;
        this.logger = logger3;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerV3Thread");
        this.backgroundHandlerThread = handlerThread;
        CallsAudioDeviceInfo.Companion companion = CallsAudioDeviceInfo.Companion;
        this.usedDevice = companion.getNONE();
        this.reportedAudioDevice = companion.getNONE();
        this.recoverDeviceByTypeRunnable = new qo1(this, 0);
        this.syncWithSystemCommunicationDeviceRunnable = new qo1(this, 1);
        this.tryAgainRunnable = new qo1(this, 2);
        this.state = CallsAudioManager.State.IDLE;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.mainHandler = handler2;
        Context context2 = context;
        AudioManager audioManager2 = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager2;
        AnonymousClass1 r9 = new Function0<Unit>(this) {
            public final void invoke() {
                ((CallsAudioManagerV3Impl) this.receiver).maybeRecoverUtilizedDeviceType();
            }
        };
        CallsAudioManager.OnMuteListener onMuteListener2 = onMuteListener;
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager2, onMuteListener2, handler2, handler, new Function0<Boolean>(this) {
            final /* synthetic */ CallsAudioManagerV3Impl this$0;

            {
                this.this$0 = r1;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isDestroyed);
            }
        }, logger3, new Function0<Unit>(this) {
            public final void invoke() {
                ((CallsAudioManagerV3Impl) this.receiver).rememberUtilizedDeviceType();
            }
        }, r9);
    }

    /* access modifiers changed from: private */
    public final String androidDeviceToString(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return "null";
        }
        try {
            int id = audioDeviceInfo.getId();
            int type = audioDeviceInfo.getType();
            CharSequence productName = audioDeviceInfo.getProductName();
            return id + ":" + type + ":" + productName;
        } catch (Throwable th) {
            return a81.m("error: ", th.getMessage());
        }
    }

    private final void applyCurrentDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        Logger logger2 = this.logger;
        logger2.d(TAG, "Cancel try again schedule because of used device change to " + callsAudioDeviceInfo);
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.usedDevice = callsAudioDeviceInfo;
        reportCurrentCallsAudioDevice(callsAudioDeviceInfo);
    }

    /* access modifiers changed from: private */
    public final void cancelScheduledSyncWithSystemCommunicationDevice() {
        this.workerThreadHandler.removeCallbacks(this.syncWithSystemCommunicationDeviceRunnable);
    }

    /* access modifiers changed from: private */
    public final void cancelScheduledTrySetCommunicationDeviceAgain() {
        this.workerThreadHandler.removeCallbacks(this.tryAgainRunnable);
    }

    private final void cancelUtilizedDeviceTypeRecovery() {
        Logger logger2 = this.logger;
        CallsAudioManager.AudioDeviceType audioDeviceType = this.lastKnownAudioDeviceType;
        logger2.d(TAG, "Cancelling audio device recovery by type " + audioDeviceType + " (maybe)");
        this.workerThreadHandler.removeCallbacks(this.recoverDeviceByTypeRunnable);
    }

    /* access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state2) {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            logger2.v(TAG, "requested " + state2);
            onCallStateChangedInternal(state2);
        }
    }

    private final void doOnOwnThread(String str, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1) {
        try {
            doOnOwnThreadUnsafe(str, function0, function02, function1);
        } catch (Throwable th) {
            this.logger.e(TAG, wj6.k("error posting action ", str, " for execution"), th);
        }
    }

    public static /* synthetic */ void doOnOwnThread$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        callsAudioManagerV3Impl.doOnOwnThread(str, function0, function02, function1);
    }

    private final void doOnOwnThreadUnsafe(String str, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1) {
        this.workerThreadHandler.post(new po1((Function0) function0, (Function0) function02, this, str, (Function1) function1));
    }

    public static /* synthetic */ void doOnOwnThreadUnsafe$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        callsAudioManagerV3Impl.doOnOwnThreadUnsafe(str, function0, function02, function1);
    }

    /* access modifiers changed from: private */
    public static final void doOnOwnThreadUnsafe$lambda$8(Function0 function0, Function0 function02, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, Function1 function1) {
        try {
            function0.invoke();
            if (function02 != null) {
                function02.invoke();
            }
        } catch (Throwable th) {
            Logger logger2 = callsAudioManagerV3Impl.logger;
            logger2.e(TAG, "error on executing action " + str, th);
            if (function1 != null) {
                function1.invoke(th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final CallsAudioDeviceInfo firstOfType(CallsAudioManager.AudioDeviceType audioDeviceType) {
        Object obj;
        Iterator it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CallsAudioDeviceInfo) obj).getDeviceType() == audioDeviceType) {
                break;
            }
        }
        return (CallsAudioDeviceInfo) obj;
    }

    private final AudioDeviceInfo getAudioDeviceInfo(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return this.audioDeviceByCallsDevice.get(callsAudioDeviceInfo);
    }

    private final String getAudioManagerStateDetails() {
        try {
            return CollectionsKt___CollectionsKt.joinToString$default(this.audioManager.getAvailableCommunicationDevices(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new CallsAudioManagerV3Impl$getAudioManagerStateDetails$1(this), 30, (Object) null);
        } catch (Throwable th) {
            return a81.m("audio manager error: ", th.getMessage());
        }
    }

    private final List<Pair<CallsAudioDeviceInfo, AudioDeviceInfo>> getAvailableDevices() {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo mapAndroidDeviceToCallsDevice : this.audioManager.getAvailableCommunicationDevices()) {
            Pair<CallsAudioDeviceInfo, AudioDeviceInfo> mapAndroidDeviceToCallsDevice2 = mapAndroidDeviceToCallsDevice(mapAndroidDeviceToCallsDevice);
            if (mapAndroidDeviceToCallsDevice2 != null) {
                arrayList.add(mapAndroidDeviceToCallsDevice2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final CallsAudioDeviceInfo getDeviceForAndroidDevice(AudioDeviceInfo audioDeviceInfo) {
        Object obj;
        Object obj2;
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "NULL device mapped to null");
            return null;
        }
        Iterator it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) getAudioDeviceInfo((CallsAudioDeviceInfo) obj), (Object) audioDeviceInfo)) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) obj;
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "Not having a mirror for current communication device");
            syncAudioDeviceList();
            Iterator it2 = this.callsAudioDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Intrinsics.areEqual((Object) getAudioDeviceInfo((CallsAudioDeviceInfo) obj2), (Object) audioDeviceInfo)) {
                    break;
                }
            }
            callsAudioDeviceInfo = (CallsAudioDeviceInfo) obj2;
        }
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "After double-check still not having a mirror for current communication device");
            return null;
        }
        Logger logger2 = this.logger;
        int id = audioDeviceInfo.getId();
        int type = audioDeviceInfo.getType();
        CharSequence productName = audioDeviceInfo.getProductName();
        StringBuilder n = a81.n("Device ", id, ":", type, ":");
        n.append(productName);
        n.append(" mirrored to ");
        n.append(callsAudioDeviceInfo);
        logger2.d(TAG, n.toString());
        return callsAudioDeviceInfo;
    }

    private final boolean getHasEarpiece() {
        return firstOfType(CallsAudioManager.AudioDeviceType.EARPIECE) != null;
    }

    private final boolean getHasWiredHeadset() {
        return firstOfType(CallsAudioManager.AudioDeviceType.WIRED_HEADSET) != null;
    }

    private final CallsAudioDeviceInfo getPreferredAudioDevice(boolean z, boolean z2) {
        maybeSyncAudioDeviceList();
        AudioDeviceSelector audioDeviceSelector2 = this.audioDeviceSelector;
        CallsAudioManager.State state2 = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean hasEarpiece = getHasEarpiece();
        boolean z3 = this.disabledSpeakerOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        boolean z4 = this.disabledBluetoothOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        Iterable<CallsAudioDeviceInfo> iterable = this.callsAudioDevices;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (CallsAudioDeviceInfo deviceType : iterable) {
            arrayList.add(deviceType.getDeviceType());
        }
        CallsAudioDeviceInfo firstOfType = firstOfType(audioDeviceSelector2.selectPreferableDevice(state2, z, z2, hasWiredHeadset, hasEarpiece, z3, z4, CollectionsKt.toSet(arrayList), this.usedDevice.getDeviceType(), this.videoTracker, this.proximityTracker));
        return firstOfType == null ? CallsAudioDeviceInfo.Companion.getNONE() : firstOfType;
    }

    public static /* synthetic */ CallsAudioDeviceInfo getPreferredAudioDevice$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV3Impl.getPreferredAudioDevice(z, z2);
    }

    /* access modifiers changed from: private */
    public final void handleCurrentCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        CallsAudioDeviceInfo deviceForAndroidDevice = getDeviceForAndroidDevice(audioDeviceInfo);
        if (deviceForAndroidDevice != null) {
            Logger logger2 = this.logger;
            logger2.d(TAG, "Apply device " + deviceForAndroidDevice + " confirmed by system");
            applyCurrentDevice(deviceForAndroidDevice);
        }
    }

    private final Pair<CallsAudioDeviceInfo, AudioDeviceInfo> mapAndroidDeviceToCallsDevice(AudioDeviceInfo audioDeviceInfo) {
        CallsAudioDeviceInfo callsAudioDeviceInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String obj;
        String obj2;
        String str5;
        String obj3;
        int type = audioDeviceInfo.getType();
        if (type == 1) {
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CharSequence productName = audioDeviceInfo.getProductName();
            if (productName == null || (str = productName.toString()) == null) {
                str = CallsAudioDeviceInfo.EARPIECE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType, str);
        } else if (type == 2) {
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            CharSequence productName2 = audioDeviceInfo.getProductName();
            if (productName2 == null || (str2 = productName2.toString()) == null) {
                str2 = CallsAudioDeviceInfo.SPEAKERPHONE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType2, str2);
        } else if (type == 3) {
            CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName3 = audioDeviceInfo.getProductName();
            if (productName3 == null || (str3 = productName3.toString()) == null) {
                str3 = CallsAudioDeviceInfo.WIRED_HEADSET;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType3, str3);
        } else if (type != 4) {
            String str6 = CallsAudioDeviceInfo.BLUETOOTH;
            if (type == 7) {
                CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName4 = audioDeviceInfo.getProductName();
                if (!(productName4 == null || (obj = productName4.toString()) == null)) {
                    str6 = obj;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType4, str6);
            } else if (type == 8) {
                CallsAudioManager.AudioDeviceType audioDeviceType5 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName5 = audioDeviceInfo.getProductName();
                if (!(productName5 == null || (obj2 = productName5.toString()) == null)) {
                    str6 = obj2;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType5, str6);
            } else if (type == 22) {
                CallsAudioManager.AudioDeviceType audioDeviceType6 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
                CharSequence productName6 = audioDeviceInfo.getProductName();
                if (productName6 == null || (str5 = productName6.toString()) == null) {
                    str5 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType6, str5);
            } else if (type != 26) {
                Logger logger2 = this.logger;
                int type2 = audioDeviceInfo.getType();
                CharSequence productName7 = audioDeviceInfo.getProductName();
                logger2.d(TAG, "Unknown available audio device " + type2 + ":" + productName7);
                callsAudioDeviceInfo = null;
            } else {
                CallsAudioManager.AudioDeviceType audioDeviceType7 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName8 = audioDeviceInfo.getProductName();
                if (!(productName8 == null || (obj3 = productName8.toString()) == null)) {
                    str6 = obj3;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType7, str6);
            }
        } else {
            CallsAudioManager.AudioDeviceType audioDeviceType8 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName9 = audioDeviceInfo.getProductName();
            if (productName9 == null || (str4 = productName9.toString()) == null) {
                str4 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType8, str4);
        }
        Logger logger3 = this.logger;
        int id = audioDeviceInfo.getId();
        int type3 = audioDeviceInfo.getType();
        CharSequence productName10 = audioDeviceInfo.getProductName();
        StringBuilder n = a81.n("Map ", id, ":", type3, ":");
        n.append(productName10);
        n.append(" -> ");
        n.append(callsAudioDeviceInfo);
        logger3.d(TAG, n.toString());
        if (callsAudioDeviceInfo != null) {
            return TuplesKt.to(callsAudioDeviceInfo, audioDeviceInfo);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void maybeRecoverUtilizedDeviceType() {
        if (this.lastKnownAudioDeviceType == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Previously used device type is not known, will not try to recover");
        }
        if (this.usedDevice.getDeviceType() == this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "Used device type matches type of device used before audio focus was lost. Nothing to do here");
            return;
        }
        this.logger.d(TAG, "Schedule previously utilized device recovery in 3000 ms");
        try {
            this.workerThreadHandler.postDelayed(this.recoverDeviceByTypeRunnable, USED_DEVICE_RECOVER_TIMEOUT_MS);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post recovery runnable", th);
        }
    }

    private final void maybeSyncAudioDeviceList() {
        if (this.audioDeviceSyncCount <= 0) {
            syncAudioDeviceList();
        }
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state2) {
        if (!this.isDestroyed) {
            boolean z = false;
            boolean z2 = this.state == CallsAudioManager.State.RINGING && state2 == CallsAudioManager.State.CONVERSATION;
            if (state2 == CallsAudioManager.State.CONVERSATION) {
                z = true;
            }
            this.isInCall = z;
            this.state = state2;
            int i = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i == 1) {
                release();
            } else if (i == 2 || i == 3 || i == 4) {
                start();
                if (z2) {
                    updateAvailableDeviceList(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void recoverDeviceByTypeRunnable$lambda$0(CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            callsAudioManagerV3Impl.recoverPreviouslyUtilizedDeviceType();
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Error on device recovery", th);
        }
    }

    private final void recoverPreviouslyUtilizedDeviceType() {
        if (!this.isDestroyed) {
            if (this.usedDevice.getDeviceType() != this.lastKnownAudioDeviceType) {
                this.logger.d(TAG, "It seems previously used device has been recovered by system. Nothing to do here");
            } else if (updateAvailableDeviceList$default(this, false, 1, (Object) null)) {
                this.logger.d(TAG, "It seems better option was found during device list update. Keep it as it is");
            } else {
                CallsAudioDeviceInfo firstOfType = firstOfType(this.lastKnownAudioDeviceType);
                if (firstOfType == null) {
                    Logger logger2 = this.logger;
                    CallsAudioManager.AudioDeviceType audioDeviceType = this.lastKnownAudioDeviceType;
                    logger2.d(TAG, "No device found by requested type " + audioDeviceType);
                    return;
                }
                Logger logger3 = this.logger;
                logger3.d(TAG, "Submitting request to select " + firstOfType + " as current (recovery)");
                selectAudioDevice(firstOfType);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            this.logger.d(TAG, "Already released, ignore");
            return;
        }
        this.isDestroyed = true;
        AudioManager audioManager2 = this.audioManager;
        audioManager2.unregisterAudioDeviceCallback(this);
        try {
            audioManager2.removeOnCommunicationDeviceChangedListener(n30.h(this));
        } catch (IllegalArgumentException unused) {
        }
        audioManager2.clearCommunicationDevice();
        this.logger.d(TAG, "Audio manager cleanup completed");
        releaseAudioFocus();
        restorePreviousAudioState();
        this.backgroundHandlerThread.quit();
        this.logger.d(TAG, "Release completed");
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    /* access modifiers changed from: private */
    public final void rememberUtilizedDeviceType() {
        cancelUtilizedDeviceTypeRecovery();
        this.lastKnownAudioDeviceType = this.usedDevice.getDeviceType();
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.mainHandler.post(new ktg(this, callsAudioDeviceInfo, this.onAudioDeviceChangeListener, 13));
    }

    /* access modifiers changed from: private */
    public static final void reportAudioDeviceOnMainThread$lambda$9(CallsAudioManagerV3Impl callsAudioManagerV3Impl, CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (Intrinsics.areEqual((Object) callsAudioManagerV3Impl.reportedAudioDevice, (Object) callsAudioDeviceInfo) || onAudioDeviceInfoChangeListener == null) {
            Logger logger2 = callsAudioManagerV3Impl.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo2 = callsAudioManagerV3Impl.reportedAudioDevice;
            boolean areEqual = Intrinsics.areEqual((Object) callsAudioDeviceInfo2, (Object) callsAudioDeviceInfo);
            boolean z = onAudioDeviceInfoChangeListener != null;
            logger2.d(TAG, "Will not report audio device change from " + callsAudioDeviceInfo2 + " to " + callsAudioDeviceInfo + " because of same device=" + areEqual + ", has listener=" + z);
            return;
        }
        Logger logger3 = callsAudioManagerV3Impl.logger;
        CallsAudioDeviceInfo callsAudioDeviceInfo3 = callsAudioManagerV3Impl.reportedAudioDevice;
        logger3.v(TAG, "reporting device change " + callsAudioDeviceInfo3 + " -> " + callsAudioDeviceInfo);
        onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(callsAudioManagerV3Impl.reportedAudioDevice, callsAudioDeviceInfo));
        callsAudioManagerV3Impl.reportedAudioDevice = callsAudioDeviceInfo;
    }

    private final void reportCurrentCallsAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        reportAudioDeviceOnMainThread(callsAudioDeviceInfo);
        updateProximityTrackingState(callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
    }

    /* access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        Object obj;
        if (this.savedPreviousState) {
            this.logger.v(TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager2 = this.audioManager;
                if (this.savedIsSpeakerPhoneOn) {
                    Iterator it = audioManager2.getAvailableCommunicationDevices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((AudioDeviceInfo) obj).getType() == 2) {
                            break;
                        }
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    if (audioDeviceInfo != null) {
                        audioManager2.setCommunicationDevice(audioDeviceInfo);
                    }
                }
                audioManager2.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.e(TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (!this.savedPreviousState) {
            this.logger.v(TAG, "saving state");
            try {
                AudioManager audioManager2 = this.audioManager;
                this.savedIsMicrophoneMute = audioManager2.isMicrophoneMute();
                AudioDeviceInfo g = audioManager2.getCommunicationDevice();
                boolean z = false;
                if (g != null && g.getType() == 2) {
                    z = true;
                }
                this.savedIsSpeakerPhoneOn = z;
                this.savedPreviousState = true;
            } catch (Exception e) {
                this.logger.e(TAG, "savePreviousState: failed", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void scheduleSyncWithSystemCommunicationDevice() {
        if (!this.isDestroyed) {
            cancelScheduledSyncWithSystemCommunicationDevice();
            try {
                this.workerThreadHandler.postDelayed(this.syncWithSystemCommunicationDeviceRunnable, 2000);
            } catch (Throwable th) {
                this.logger.d(TAG, "Can't schedule sync with system communication device", th);
            }
        }
    }

    private final void scheduleTryToSetCommunicationDeviceAgain() {
        if (!this.isDestroyed) {
            cancelScheduledTrySetCommunicationDeviceAgain();
            this.logger.d(TAG, "Schedule try again with current device in 2000ms");
            try {
                this.workerThreadHandler.postDelayed(this.tryAgainRunnable, 2000);
            } catch (Throwable th) {
                this.logger.e(TAG, "Unable to post try again runnable", th);
            }
        }
    }

    private final void selectAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        cancelUtilizedDeviceTypeRecovery();
        Logger logger2 = this.logger;
        logger2.d(TAG, "Selecting " + callsAudioDeviceInfo);
        if (Intrinsics.areEqual((Object) this.usedDevice, (Object) callsAudioDeviceInfo)) {
            Logger logger3 = this.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo2 = this.usedDevice;
            logger3.d(TAG, "An attempt to select same device " + callsAudioDeviceInfo2 + ", ignore");
            return;
        }
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(callsAudioDeviceInfo);
        if (audioDeviceInfo == null) {
            Logger logger4 = this.logger;
            logger4.d(TAG, "No known android device matches requested device " + callsAudioDeviceInfo);
            this.audioManager.clearCommunicationDevice();
        } else if (callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Empty device type, clear communication device");
            this.audioManager.clearCommunicationDevice();
            reportCurrentCallsAudioDevice(callsAudioDeviceInfo);
        } else if (Intrinsics.areEqual((Object) audioDeviceInfo, (Object) this.audioManager.getCommunicationDevice())) {
            Logger logger5 = this.logger;
            logger5.d(TAG, "Device " + callsAudioDeviceInfo + " mapped to currently used communication device");
            handleCurrentCommunicationDevice(audioDeviceInfo);
        } else {
            Logger logger6 = this.logger;
            logger6.d(TAG, "Submit request to set current communication device to " + callsAudioDeviceInfo);
            try {
                Logger logger7 = this.logger;
                logger7.d(TAG, "Apply device " + callsAudioDeviceInfo + " by user request (just a promise to use)");
                applyCurrentDevice(callsAudioDeviceInfo);
                if (!setCommunicationDevice(audioDeviceInfo)) {
                    Logger logger8 = this.logger;
                    String androidDeviceToString = androidDeviceToString(audioDeviceInfo);
                    logger8.d(TAG, "Can't set " + androidDeviceToString + ": setCommunicationDevice() returned false");
                    syncWithSystemCommunicationDevice();
                }
            } catch (Throwable th) {
                Logger logger9 = this.logger;
                String androidDeviceToString2 = androidDeviceToString(audioDeviceInfo);
                String audioManagerStateDetails = getAudioManagerStateDetails();
                logger9.e(TAG, "Error setting communication device", new IllegalArgumentException("Proposed device was not able to set as current " + callsAudioDeviceInfo + " (" + androidDeviceToString2 + "), details: " + audioManagerStateDetails, th));
                syncWithSystemCommunicationDevice();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        CallsAudioManager.AudioDeviceType deviceType;
        if (!this.isDestroyed && (deviceType = this.usedDevice.getDeviceType()) != callsAudioDeviceInfo.getDeviceType()) {
            boolean z = this.disabledBluetoothOnce;
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
            boolean z2 = false;
            this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
            boolean z3 = this.disabledSpeakerOnce;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            if (deviceType == audioDeviceType2) {
                z2 = true;
            }
            this.disabledSpeakerOnce = z3 | z2;
            this.logger.d(TAG, "Set audio device by external request: " + callsAudioDeviceInfo);
            if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
                selectAudioDevice(callsAudioDeviceInfo);
            }
        }
    }

    private final void setAudioManagerModeSafe(int i) {
        try {
            this.audioManager.setMode(i);
        } catch (Throwable th) {
            this.logger.reportError(TAG, "Can't set audio manager mode", th);
        }
    }

    private final boolean setCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            this.audioManager.clearCommunicationDevice();
            return true;
        } else if (!this.audioManager.setCommunicationDevice(audioDeviceInfo)) {
            return false;
        } else {
            scheduleTryToSetCommunicationDeviceAgain();
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void setOnAudioDeviceChangeListenerImpl(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (!this.isDestroyed) {
            this.onAudioDeviceChangeListener = onAudioDeviceInfoChangeListener;
            if (onAudioDeviceInfoChangeListener != null) {
                this.reportedAudioDevice = NO_DEVICE;
                reportAudioDeviceOnMainThread(this.usedDevice);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setSpeakerEnabled(boolean z, boolean z2) {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            logger2.v(TAG, "requested speaker " + z + " (" + z2 + ")");
            if (!z) {
                selectAudioDevice(getPreferredAudioDevice(true, false));
            } else if (z2 || !this.disabledSpeakerOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE)) {
                CallsAudioDeviceInfo callsAudioDeviceInfo = this.usedDevice;
                CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
                CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
                if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                    CallsAudioDeviceInfo firstOfType = firstOfType(audioDeviceType2);
                    if (firstOfType != null) {
                        selectAudioDevice(firstOfType);
                    } else {
                        this.logger.e(TAG, "No speaker found");
                    }
                }
            }
        }
    }

    private final void start() {
        if (this.isStarted) {
            this.logger.d(TAG, "Already started, ignore");
            return;
        }
        this.logger.d(TAG, "Starting...");
        this.isStarted = true;
        savePreviousState();
        requestAudioFocus();
        startTrackingAudioDevices();
        setAudioManagerModeSafe(3);
        selectAudioDevice(getPreferredAudioDevice(true, false));
    }

    private final void startTrackingAudioDevices() {
        AudioManager audioManager2 = this.audioManager;
        audioManager2.registerAudioDeviceCallback(this, this.workerThreadHandler);
        audioManager2.addOnCommunicationDeviceChangedListener(new ro1(0, this), n30.h(this));
        updateAvailableDeviceList$default(this, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void startTrackingAudioDevices$lambda$4$lambda$3(CallsAudioManagerV3Impl callsAudioManagerV3Impl, Runnable runnable) {
        callsAudioManagerV3Impl.workerThreadHandler.post(runnable);
    }

    private final void syncAudioDeviceList() {
        Logger logger2 = this.logger;
        int i = this.audioDeviceSyncCount;
        String p = CollectionsKt___CollectionsKt.joinToString$default(this.callsAudioDevices, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, CallsAudioManagerV3Impl$syncAudioDeviceList$1.INSTANCE, 31, (Object) null);
        logger2.d(TAG, " Sync audio device list (" + i + "). List before update: " + p);
        this.callsAudioDevices.clear();
        this.audioDeviceByCallsDevice.clear();
        try {
            List<Pair<CallsAudioDeviceInfo, AudioDeviceInfo>> availableDevices = getAvailableDevices();
            List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
            Iterable<Pair> iterable = availableDevices;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Pair first : iterable) {
                arrayList.add((CallsAudioDeviceInfo) first.getFirst());
            }
            list.addAll(arrayList);
            MapsKt.putAll(this.audioDeviceByCallsDevice, availableDevices);
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while getting available communication devices", th);
        }
        Logger logger3 = this.logger;
        int i2 = this.audioDeviceSyncCount;
        String p2 = CollectionsKt___CollectionsKt.joinToString$default(this.callsAudioDevices, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, CallsAudioManagerV3Impl$syncAudioDeviceList$3.INSTANCE, 31, (Object) null);
        logger3.d(TAG, " Sync audio device list (" + i2 + "). List after update: " + p2);
        this.audioDeviceSyncCount = this.audioDeviceSyncCount + 1;
    }

    /* access modifiers changed from: private */
    public final void syncWithSystemCommunicationDevice() {
        if (!this.isDestroyed) {
            this.logger.d(TAG, "Try to recover actual device audio device state");
            try {
                handleCurrentCommunicationDevice(this.audioManager.getCommunicationDevice());
            } catch (Throwable unused) {
                this.logger.e(TAG, "Can't recover current communication device from system state");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void trySetCommunicationDeviceAgain() {
        try {
            trySetCommunicationDeviceAgainUnsafe();
        } catch (Throwable th) {
            this.logger.e(TAG, "Failed to set communication device again", th);
            syncWithSystemCommunicationDevice();
        }
    }

    private final void trySetCommunicationDeviceAgainUnsafe() {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            String androidDeviceToString = androidDeviceToString(getAudioDeviceInfo(this.usedDevice));
            logger2.d(TAG, "Try again with " + androidDeviceToString);
            this.audioManager.clearCommunicationDevice();
            AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(this.usedDevice);
            if (audioDeviceInfo == null) {
                this.logger.d(TAG, "No current device, ignore try again attempt, sync with system device instead");
                syncWithSystemCommunicationDevice();
            } else if (!this.audioManager.setCommunicationDevice(audioDeviceInfo)) {
                Logger logger3 = this.logger;
                String androidDeviceToString2 = androidDeviceToString(audioDeviceInfo);
                logger3.d(TAG, "Try again with " + androidDeviceToString2 + " did fail. Sync with system device immediately");
                syncWithSystemCommunicationDevice();
            } else {
                Logger logger4 = this.logger;
                String androidDeviceToString3 = androidDeviceToString(audioDeviceInfo);
                logger4.d(TAG, "Try again with " + androidDeviceToString3 + " passed, wait for a system confirmation or rollback in 2000ms");
                scheduleSyncWithSystemCommunicationDevice();
            }
        }
    }

    private final boolean updateAvailableDeviceList(boolean z) {
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        boolean z2 = firstOfType(audioDeviceType) != null;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        boolean z3 = firstOfType(audioDeviceType2) != null;
        Logger logger2 = this.logger;
        logger2.d(TAG, "update audio device list, had bt before=" + z3 + ", had headphones before=" + z2);
        syncAudioDeviceList();
        Object obj = null;
        CallsAudioDeviceInfo firstOfType = !z2 ? firstOfType(audioDeviceType) : null;
        CallsAudioDeviceInfo firstOfType2 = !z3 ? firstOfType(audioDeviceType2) : null;
        Iterator it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual((Object) (CallsAudioDeviceInfo) next, (Object) this.usedDevice)) {
                obj = next;
                break;
            }
        }
        if (obj == null || z) {
            CallsAudioDeviceInfo preferredAudioDevice = getPreferredAudioDevice(true, !z);
            Logger logger3 = this.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo = this.usedDevice;
            logger3.d(TAG, "Current device " + callsAudioDeviceInfo + " disappeared, select " + preferredAudioDevice + " instead");
            selectAudioDevice(preferredAudioDevice);
        } else if (firstOfType != null && this.usedDevice.getDeviceType() != CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
            Logger logger4 = this.logger;
            logger4.d(TAG, "Wired headset did appear: " + firstOfType + ", let us try to select it");
            selectAudioDevice(firstOfType);
            return true;
        } else if (firstOfType2 != null && !this.usedDevice.getDeviceType().isHeadsetDevice()) {
            if (!this.disabledBluetoothOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) {
                Logger logger5 = this.logger;
                logger5.d(TAG, "Bluetooth headset did appear: " + firstOfType2 + ", let us try to select it");
                selectAudioDevice(firstOfType2);
                return true;
            }
            this.logger.d(TAG, "Will not try to select bluetooth because user disable it once already");
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean updateAvailableDeviceList$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return callsAudioManagerV3Impl.updateAvailableDeviceList(z);
    }

    private final void updateProximityTrackingState(boolean z) {
        boolean z2 = this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET || (z && !this.trackProximityWhenSpeakerEnabled);
        Logger logger2 = this.logger;
        logger2.v(TAG, "proximity disabled? " + z2 + ", speaker? " + z);
        this.mainHandler.post(new c70(z2, (Object) this, 4));
    }

    /* access modifiers changed from: private */
    public static final void updateProximityTrackingState$lambda$10(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        if (z) {
            try {
                callsAudioManagerV3Impl.proximityTracker.stopTrackingProximity();
            } catch (Throwable th) {
                callsAudioManagerV3Impl.logger.e(TAG, "Proximity tracker error", th);
            }
        } else {
            callsAudioManagerV3Impl.proximityTracker.startTrackingProximity();
        }
    }

    public void changeStateAsync(CallsAudioManager.State state2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        doOnOwnThread("changeStateAsync", new CallsAudioManagerV3Impl$changeStateAsync$1(this, state2), function0, function1);
    }

    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return this.callsAudioDevices;
    }

    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.usedDevice;
    }

    public void hasBluetoothHeadsetAsync(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        doOnOwnThread("hasBluetoothHeadsetAsync", new CallsAudioManagerV3Impl$hasBluetoothHeadsetAsync$1(function1, this), (Function0<Unit>) null, function12);
    }

    public void hasWiredHeadsetAsync(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        doOnOwnThread("hasWiredHeadsetAsync", new CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1(function1, this), (Function0<Unit>) null, function12);
    }

    public boolean isHeadsetConnected() {
        return this.usedDevice.getDeviceType().isHeadsetDevice();
    }

    public void notifyBluetoothPermissionGranted() {
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.logger.d(TAG, "Audio devices were added, update list");
        updateAvailableDeviceList$default(this, false, 1, (Object) null);
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.logger.d(TAG, "Audio devices were removed, update list");
        updateAvailableDeviceList$default(this, false, 1, (Object) null);
    }

    public void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        doOnOwnThread$default(this, "onCommunicationDeviceChanged", new CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1(this, audioDeviceInfo), (Function0) null, (Function1) null, 12, (Object) null);
    }

    public void releaseAsync(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        doOnOwnThread("releaseAsync", new CallsAudioManagerV3Impl$releaseAsync$1(this), function0, function1);
    }

    public void requestAudioFocusAsync() {
        doOnOwnThread("requestAudioFocus", new CallsAudioManagerV3Impl$requestAudioFocusAsync$1(this), new CallsAudioManagerV3Impl$requestAudioFocusAsync$2(this), new CallsAudioManagerV3Impl$requestAudioFocusAsync$3(this));
    }

    public void setAudioDeviceAsync(CallsAudioDeviceInfo callsAudioDeviceInfo, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        doOnOwnThread("setAudioDeviceAsync", new CallsAudioManagerV3Impl$setAudioDeviceAsync$1(this, callsAudioDeviceInfo), function0, function1);
    }

    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDeviceType, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        doOnOwnThread("setAudioDeviceAsync", new CallsAudioManagerV3Impl$setAudioDeviceTypeAsync$1(this, audioDeviceType), function0, function1);
    }

    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        doOnOwnThread$default(this, "setOnAudioDeviceChangeListener", new CallsAudioManagerV3Impl$setOnAudioDeviceChangeListener$1(this, onAudioDeviceInfoChangeListener), (Function0) null, (Function1) null, 12, (Object) null);
    }

    public void setSpeakerEnabledAsync(boolean z, boolean z2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        doOnOwnThread("setSpeakerEnabledAsync", new CallsAudioManagerV3Impl$setSpeakerEnabledAsync$1(this, z, z2), function0, function1);
    }
}
