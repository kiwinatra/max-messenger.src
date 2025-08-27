package ru.ok.android.externcalls.analytics.config;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0001>B§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\n\u0012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0013\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u0013\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nHÆ\u0003J\u0013\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nHÆ\u0003J\u0013\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nHÆ\u0003J\u0013\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\nHÆ\u0003J\u0013\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\nHÆ\u0003J«\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\n2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\nHÆ\u0001J\u0013\u00109\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u001b\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010'\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006?"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "uploadJobId", "", "uploadExecutor", "Ljava/util/concurrent/Executor;", "maxTimeToUploadMillis", "", "silenceToUploadMillis", "maxFileLengthKbProvider", "Lkotlin/Function0;", "maxEventCountProvider", "maxLocalCacheFileCountProvider", "timeToUploadNextMsProvider", "compressContentProvider", "", "disableUploadWhenCallIsActiveProvider", "(ILjava/util/concurrent/Executor;JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "compressContent", "getCompressContent", "()Z", "getCompressContentProvider", "()Lkotlin/jvm/functions/Function0;", "disableUploadWhenCallIsActive", "getDisableUploadWhenCallIsActive", "getDisableUploadWhenCallIsActiveProvider", "eventCountToUploadNumber", "getEventCountToUploadNumber", "()I", "fileLengthTriggerToUploadBytes", "getFileLengthTriggerToUploadBytes", "getMaxEventCountProvider", "getMaxFileLengthKbProvider", "maxLocalCacheFileCount", "getMaxLocalCacheFileCount", "getMaxLocalCacheFileCountProvider", "getMaxTimeToUploadMillis", "()J", "getSilenceToUploadMillis", "timeToUploadNextMs", "getTimeToUploadNextMs", "()Ljava/lang/Long;", "getTimeToUploadNextMsProvider", "getUploadExecutor", "()Ljava/util/concurrent/Executor;", "getUploadJobId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UploadConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DEFAULT_MAX_EVENT_COUNT = 500;
    public static final int DEFAULT_MAX_FILE_SIZE_KB = 100;
    private final Function0<Boolean> compressContentProvider;
    private final Function0<Boolean> disableUploadWhenCallIsActiveProvider;
    private final Function0<Integer> maxEventCountProvider;
    private final Function0<Integer> maxFileLengthKbProvider;
    private final Function0<Integer> maxLocalCacheFileCountProvider;
    private final long maxTimeToUploadMillis;
    private final long silenceToUploadMillis;
    private final Function0<Long> timeToUploadNextMsProvider;
    private final Executor uploadExecutor;
    private final int uploadJobId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig$Companion;", "", "()V", "DEFAULT_MAX_EVENT_COUNT", "", "DEFAULT_MAX_FILE_SIZE_KB", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UploadConfig() {
        this(0, (Executor) null, 0, 0, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UploadConfig copy$default(UploadConfig uploadConfig, int i, Executor executor, long j, long j2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i2, Object obj) {
        UploadConfig uploadConfig2 = uploadConfig;
        int i3 = i2;
        return uploadConfig.copy((i3 & 1) != 0 ? uploadConfig2.uploadJobId : i, (i3 & 2) != 0 ? uploadConfig2.uploadExecutor : executor, (i3 & 4) != 0 ? uploadConfig2.maxTimeToUploadMillis : j, (i3 & 8) != 0 ? uploadConfig2.silenceToUploadMillis : j2, (i3 & 16) != 0 ? uploadConfig2.maxFileLengthKbProvider : function0, (i3 & 32) != 0 ? uploadConfig2.maxEventCountProvider : function02, (i3 & 64) != 0 ? uploadConfig2.maxLocalCacheFileCountProvider : function03, (i3 & Uuid.SIZE_BITS) != 0 ? uploadConfig2.timeToUploadNextMsProvider : function04, (i3 & 256) != 0 ? uploadConfig2.compressContentProvider : function05, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? uploadConfig2.disableUploadWhenCallIsActiveProvider : function06);
    }

    public final int component1() {
        return this.uploadJobId;
    }

    public final Function0<Boolean> component10() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final Executor component2() {
        return this.uploadExecutor;
    }

    public final long component3() {
        return this.maxTimeToUploadMillis;
    }

    public final long component4() {
        return this.silenceToUploadMillis;
    }

    public final Function0<Integer> component5() {
        return this.maxFileLengthKbProvider;
    }

    public final Function0<Integer> component6() {
        return this.maxEventCountProvider;
    }

    public final Function0<Integer> component7() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final Function0<Long> component8() {
        return this.timeToUploadNextMsProvider;
    }

    public final Function0<Boolean> component9() {
        return this.compressContentProvider;
    }

    public final UploadConfig copy(int i, Executor executor, long j, long j2, Function0<Integer> function0, Function0<Integer> function02, Function0<Integer> function03, Function0<Long> function04, Function0<Boolean> function05, Function0<Boolean> function06) {
        return new UploadConfig(i, executor, j, j2, function0, function02, function03, function04, function05, function06);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) obj;
        return this.uploadJobId == uploadConfig.uploadJobId && Intrinsics.areEqual((Object) this.uploadExecutor, (Object) uploadConfig.uploadExecutor) && this.maxTimeToUploadMillis == uploadConfig.maxTimeToUploadMillis && this.silenceToUploadMillis == uploadConfig.silenceToUploadMillis && Intrinsics.areEqual((Object) this.maxFileLengthKbProvider, (Object) uploadConfig.maxFileLengthKbProvider) && Intrinsics.areEqual((Object) this.maxEventCountProvider, (Object) uploadConfig.maxEventCountProvider) && Intrinsics.areEqual((Object) this.maxLocalCacheFileCountProvider, (Object) uploadConfig.maxLocalCacheFileCountProvider) && Intrinsics.areEqual((Object) this.timeToUploadNextMsProvider, (Object) uploadConfig.timeToUploadNextMsProvider) && Intrinsics.areEqual((Object) this.compressContentProvider, (Object) uploadConfig.compressContentProvider) && Intrinsics.areEqual((Object) this.disableUploadWhenCallIsActiveProvider, (Object) uploadConfig.disableUploadWhenCallIsActiveProvider);
    }

    public final boolean getCompressContent() {
        Boolean invoke;
        Function0<Boolean> function0 = this.compressContentProvider;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    public final Function0<Boolean> getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final boolean getDisableUploadWhenCallIsActive() {
        Boolean invoke;
        Function0<Boolean> function0 = this.disableUploadWhenCallIsActiveProvider;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            return true;
        }
        return invoke.booleanValue();
    }

    public final Function0<Boolean> getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getEventCountToUploadNumber() {
        Integer invoke;
        Function0<Integer> function0 = this.maxEventCountProvider;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            return 500;
        }
        return invoke.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getFileLengthTriggerToUploadBytes() {
        /*
            r0 = this;
            kotlin.jvm.functions.Function0<java.lang.Integer> r0 = r0.maxFileLengthKbProvider
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.invoke()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0011
            int r0 = r0.intValue()
            goto L_0x0013
        L_0x0011:
            r0 = 100
        L_0x0013:
            int r0 = r0 * 1000
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.config.UploadConfig.getFileLengthTriggerToUploadBytes():int");
    }

    public final Function0<Integer> getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    public final Function0<Integer> getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    public final int getMaxLocalCacheFileCount() {
        Integer invoke;
        Function0<Integer> function0 = this.maxLocalCacheFileCountProvider;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            return 1;
        }
        return invoke.intValue();
    }

    public final Function0<Integer> getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    public final Long getTimeToUploadNextMs() {
        Function0<Long> function0 = this.timeToUploadNextMsProvider;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final Function0<Long> getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.uploadJobId) * 31;
        Executor executor = this.uploadExecutor;
        int i = 0;
        int i2 = wzf.i(wzf.i((hashCode + (executor == null ? 0 : executor.hashCode())) * 31, 31, this.maxTimeToUploadMillis), 31, this.silenceToUploadMillis);
        Function0<Integer> function0 = this.maxFileLengthKbProvider;
        int hashCode2 = (i2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Integer> function02 = this.maxEventCountProvider;
        int hashCode3 = (hashCode2 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0<Integer> function03 = this.maxLocalCacheFileCountProvider;
        int hashCode4 = (hashCode3 + (function03 == null ? 0 : function03.hashCode())) * 31;
        Function0<Long> function04 = this.timeToUploadNextMsProvider;
        int hashCode5 = (hashCode4 + (function04 == null ? 0 : function04.hashCode())) * 31;
        Function0<Boolean> function05 = this.compressContentProvider;
        int hashCode6 = (hashCode5 + (function05 == null ? 0 : function05.hashCode())) * 31;
        Function0<Boolean> function06 = this.disableUploadWhenCallIsActiveProvider;
        if (function06 != null) {
            i = function06.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        int i = this.uploadJobId;
        Executor executor = this.uploadExecutor;
        long j = this.maxTimeToUploadMillis;
        long j2 = this.silenceToUploadMillis;
        Function0<Integer> function0 = this.maxFileLengthKbProvider;
        Function0<Integer> function02 = this.maxEventCountProvider;
        Function0<Integer> function03 = this.maxLocalCacheFileCountProvider;
        Function0<Long> function04 = this.timeToUploadNextMsProvider;
        Function0<Boolean> function05 = this.compressContentProvider;
        Function0<Boolean> function06 = this.disableUploadWhenCallIsActiveProvider;
        StringBuilder sb = new StringBuilder("UploadConfig(uploadJobId=");
        sb.append(i);
        sb.append(", uploadExecutor=");
        sb.append(executor);
        sb.append(", maxTimeToUploadMillis=");
        sb.append(j);
        tr1.v(sb, ", silenceToUploadMillis=", j2, ", maxFileLengthKbProvider=");
        sb.append(function0);
        sb.append(", maxEventCountProvider=");
        sb.append(function02);
        sb.append(", maxLocalCacheFileCountProvider=");
        sb.append(function03);
        sb.append(", timeToUploadNextMsProvider=");
        sb.append(function04);
        sb.append(", compressContentProvider=");
        sb.append(function05);
        sb.append(", disableUploadWhenCallIsActiveProvider=");
        sb.append(function06);
        sb.append(")");
        return sb.toString();
    }

    public UploadConfig(int i, Executor executor, long j, long j2, Function0<Integer> function0, Function0<Integer> function02, Function0<Integer> function03, Function0<Long> function04, Function0<Boolean> function05, Function0<Boolean> function06) {
        this.uploadJobId = i;
        this.uploadExecutor = executor;
        this.maxTimeToUploadMillis = j;
        this.silenceToUploadMillis = j2;
        this.maxFileLengthKbProvider = function0;
        this.maxEventCountProvider = function02;
        this.maxLocalCacheFileCountProvider = function03;
        this.timeToUploadNextMsProvider = function04;
        this.compressContentProvider = function05;
        this.disableUploadWhenCallIsActiveProvider = function06;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UploadConfig(int r14, java.util.concurrent.Executor r15, long r16, long r18, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            r1 = 3815413(0x3a37f5, float:5.346532E-39)
            goto L_0x000b
        L_0x000a:
            r1 = r14
        L_0x000b:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0013
        L_0x0012:
            r2 = r15
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x001f
        L_0x001d:
            r4 = r16
        L_0x001f:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0026
            r6 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0028
        L_0x0026:
            r6 = r18
        L_0x0028:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002e
            r8 = r3
            goto L_0x0030
        L_0x002e:
            r8 = r20
        L_0x0030:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0036
            r9 = r3
            goto L_0x0038
        L_0x0036:
            r9 = r21
        L_0x0038:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003e
            r10 = r3
            goto L_0x0040
        L_0x003e:
            r10 = r22
        L_0x0040:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0046
            r11 = r3
            goto L_0x0048
        L_0x0046:
            r11 = r23
        L_0x0048:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004e
            r12 = r3
            goto L_0x0050
        L_0x004e:
            r12 = r24
        L_0x0050:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r3 = r25
        L_0x0057:
            r14 = r1
            r15 = r2
            r16 = r4
            r18 = r6
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r3
            r13.<init>(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.config.UploadConfig.<init>(int, java.util.concurrent.Executor, long, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
