package one.me.rlottie;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;
import one.me.rlottie.network.RLottieLoaderPipeline;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002#$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J`\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007J^\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007JV\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007Jh\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007J`\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0010H\u0002¨\u0006%"}, d2 = {"Lone/me/rlottie/RLottieFactory;", "", "<init>", "()V", "create", "Lone/me/rlottie/RLottieDrawable;", "config", "Lone/me/rlottie/RLottieFactory$Config;", "createByRawRes", "rawResId", "", "cacheName", "", "width", "height", "autoRepeat", "", "limitFps", "decodeFirstFrame", "autoStart", "preCache", "createByJsonString", "jsonString", "createByFile", "file", "Ljava/io/File;", "createByAsset", "context", "Landroid/content/Context;", "assetsRes", "createByUrl", "url", "networkFetchEnabled", "autoRepeatModeByBoolean", "b", "Config", "Way", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RLottieFactory {
    public static final RLottieFactory INSTANCE = new RLottieFactory();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006 "}, d2 = {"Lone/me/rlottie/RLottieFactory$Config;", "", "way", "Lone/me/rlottie/RLottieFactory$Way;", "preCache", "", "autoRepeat", "autoStart", "startDecodeFirstFrame", "<init>", "(Lone/me/rlottie/RLottieFactory$Way;ZZZZ)V", "getWay$rlottie_release", "()Lone/me/rlottie/RLottieFactory$Way;", "setWay$rlottie_release", "(Lone/me/rlottie/RLottieFactory$Way;)V", "getPreCache$rlottie_release", "()Z", "setPreCache$rlottie_release", "(Z)V", "getAutoRepeat$rlottie_release", "setAutoRepeat$rlottie_release", "getAutoStart$rlottie_release", "setAutoStart$rlottie_release", "getStartDecodeFirstFrame$rlottie_release", "setStartDecodeFirstFrame$rlottie_release", "setPreCache", "setAutoRepeat", "setAutoStart", "setStartDecodeFirstFrame", "setWay", "Builder", "Companion", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static boolean defaultAutoRepeat = true;
        /* access modifiers changed from: private */
        public static boolean defaultAutoStart;
        /* access modifiers changed from: private */
        public static boolean defaultNetworkFetchEnabled = true;
        /* access modifiers changed from: private */
        public static boolean defaultPrecache;
        /* access modifiers changed from: private */
        public static boolean defaultShouldLimitFps;
        /* access modifiers changed from: private */
        public static int defaultSize = 200;
        /* access modifiers changed from: private */
        public static boolean defaultStartDecodeFirstFrame;
        private boolean autoRepeat;
        private boolean autoStart;
        private boolean preCache;
        private boolean startDecodeFirstFrame;
        private Way way;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lone/me/rlottie/RLottieFactory$Config$Builder;", "", "<init>", "()V", "way", "Lone/me/rlottie/RLottieFactory$Way;", "preCache", "", "autoRepeat", "autoStart", "startDecodeFirstFrame", "setPreCache", "setAutoRepeat", "setAutoStart", "setStartDecodeFirstFrame", "setWay", "build", "Lone/me/rlottie/RLottieFactory$Config;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
            private boolean autoRepeat;
            private boolean autoStart;
            private boolean preCache;
            private boolean startDecodeFirstFrame;
            private Way way;

            public Builder() {
                Companion companion = Config.Companion;
                this.preCache = companion.getDefaultPrecache();
                this.autoRepeat = companion.getDefaultAutoRepeat();
                this.autoStart = companion.getDefaultAutoStart();
                this.startDecodeFirstFrame = companion.getDefaultStartDecodeFirstFrame();
            }

            public final Config build() {
                Way way2 = this.way;
                if (way2 == null) {
                    way2 = null;
                }
                return new Config(way2, this.preCache, this.autoRepeat, this.autoStart, this.startDecodeFirstFrame);
            }

            public final Builder setAutoRepeat(boolean z) {
                this.autoRepeat = z;
                return this;
            }

            public final Builder setAutoStart(boolean z) {
                this.autoStart = z;
                return this;
            }

            public final Builder setPreCache(boolean z) {
                this.preCache = z;
                return this;
            }

            public final Builder setStartDecodeFirstFrame(boolean z) {
                this.startDecodeFirstFrame = z;
                return this;
            }

            public final Builder setWay(Way way2) {
                this.way = way2;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R$\u0010\"\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lone/me/rlottie/RLottieFactory$Config$Companion;", "", "<init>", "()V", "defaultSize", "", "getDefaultSize$annotations", "getDefaultSize", "()I", "setDefaultSize", "(I)V", "defaultShouldLimitFps", "", "getDefaultShouldLimitFps$annotations", "getDefaultShouldLimitFps", "()Z", "setDefaultShouldLimitFps", "(Z)V", "defaultAutoRepeat", "getDefaultAutoRepeat$annotations", "getDefaultAutoRepeat", "setDefaultAutoRepeat", "defaultAutoStart", "getDefaultAutoStart$annotations", "getDefaultAutoStart", "setDefaultAutoStart", "defaultStartDecodeFirstFrame", "getDefaultStartDecodeFirstFrame$annotations", "getDefaultStartDecodeFirstFrame", "setDefaultStartDecodeFirstFrame", "defaultNetworkFetchEnabled", "getDefaultNetworkFetchEnabled$annotations", "getDefaultNetworkFetchEnabled", "setDefaultNetworkFetchEnabled", "defaultPrecache", "getDefaultPrecache$annotations", "getDefaultPrecache", "setDefaultPrecache", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultAutoRepeat$annotations() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultAutoStart$annotations() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultNetworkFetchEnabled$annotations() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultPrecache$annotations() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultShouldLimitFps$annotations() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultSize$annotations() {
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultStartDecodeFirstFrame$annotations() {
            }

            public final boolean getDefaultAutoRepeat() {
                return Config.defaultAutoRepeat;
            }

            public final boolean getDefaultAutoStart() {
                return Config.defaultAutoStart;
            }

            public final boolean getDefaultNetworkFetchEnabled() {
                return Config.defaultNetworkFetchEnabled;
            }

            public final boolean getDefaultPrecache() {
                return Config.defaultPrecache;
            }

            public final boolean getDefaultShouldLimitFps() {
                return Config.defaultShouldLimitFps;
            }

            public final int getDefaultSize() {
                return Config.defaultSize;
            }

            public final boolean getDefaultStartDecodeFirstFrame() {
                return Config.defaultStartDecodeFirstFrame;
            }

            public final void setDefaultAutoRepeat(boolean z) {
                Config.defaultAutoRepeat = z;
            }

            public final void setDefaultAutoStart(boolean z) {
                Config.defaultAutoStart = z;
            }

            public final void setDefaultNetworkFetchEnabled(boolean z) {
                Config.defaultNetworkFetchEnabled = z;
            }

            public final void setDefaultPrecache(boolean z) {
                Config.defaultPrecache = z;
            }

            public final void setDefaultShouldLimitFps(boolean z) {
                Config.defaultShouldLimitFps = z;
            }

            public final void setDefaultSize(int i) {
                Config.defaultSize = i;
            }

            public final void setDefaultStartDecodeFirstFrame(boolean z) {
                Config.defaultStartDecodeFirstFrame = z;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @JvmOverloads
        public Config(Way way2) {
            this(way2, false, false, false, false, 30, (DefaultConstructorMarker) null);
        }

        public static final boolean getDefaultAutoRepeat() {
            return Companion.getDefaultAutoRepeat();
        }

        public static final boolean getDefaultAutoStart() {
            return Companion.getDefaultAutoStart();
        }

        public static final boolean getDefaultNetworkFetchEnabled() {
            return Companion.getDefaultNetworkFetchEnabled();
        }

        public static final boolean getDefaultPrecache() {
            return Companion.getDefaultPrecache();
        }

        public static final boolean getDefaultShouldLimitFps() {
            return Companion.getDefaultShouldLimitFps();
        }

        public static final int getDefaultSize() {
            return Companion.getDefaultSize();
        }

        public static final boolean getDefaultStartDecodeFirstFrame() {
            return Companion.getDefaultStartDecodeFirstFrame();
        }

        public static final void setDefaultAutoRepeat(boolean z) {
            Companion.setDefaultAutoRepeat(z);
        }

        public static final void setDefaultAutoStart(boolean z) {
            Companion.setDefaultAutoStart(z);
        }

        public static final void setDefaultNetworkFetchEnabled(boolean z) {
            Companion.setDefaultNetworkFetchEnabled(z);
        }

        public static final void setDefaultPrecache(boolean z) {
            Companion.setDefaultPrecache(z);
        }

        public static final void setDefaultShouldLimitFps(boolean z) {
            Companion.setDefaultShouldLimitFps(z);
        }

        public static final void setDefaultSize(int i) {
            Companion.setDefaultSize(i);
        }

        public static final void setDefaultStartDecodeFirstFrame(boolean z) {
            Companion.setDefaultStartDecodeFirstFrame(z);
        }

        public final boolean getAutoRepeat$rlottie_release() {
            return this.autoRepeat;
        }

        public final boolean getAutoStart$rlottie_release() {
            return this.autoStart;
        }

        public final boolean getPreCache$rlottie_release() {
            return this.preCache;
        }

        public final boolean getStartDecodeFirstFrame$rlottie_release() {
            return this.startDecodeFirstFrame;
        }

        public final Way getWay$rlottie_release() {
            return this.way;
        }

        public final Config setAutoRepeat(boolean z) {
            this.autoRepeat = z;
            return this;
        }

        public final void setAutoRepeat$rlottie_release(boolean z) {
            this.autoRepeat = z;
        }

        public final Config setAutoStart(boolean z) {
            this.autoStart = z;
            return this;
        }

        public final void setAutoStart$rlottie_release(boolean z) {
            this.autoStart = z;
        }

        public final Config setPreCache(boolean z) {
            this.preCache = z;
            return this;
        }

        public final void setPreCache$rlottie_release(boolean z) {
            this.preCache = z;
        }

        public final Config setStartDecodeFirstFrame(boolean z) {
            this.startDecodeFirstFrame = z;
            return this;
        }

        public final void setStartDecodeFirstFrame$rlottie_release(boolean z) {
            this.startDecodeFirstFrame = z;
        }

        public final Config setWay(Way way2) {
            this.way = way2;
            return this;
        }

        public final void setWay$rlottie_release(Way way2) {
            this.way = way2;
        }

        @JvmOverloads
        public Config(Way way2, boolean z) {
            this(way2, z, false, false, false, 28, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Way way2, boolean z, boolean z2) {
            this(way2, z, z2, false, false, 24, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Way way2, boolean z, boolean z2, boolean z3) {
            this(way2, z, z2, z3, false, 16, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Way way2, boolean z, boolean z2, boolean z3, boolean z4) {
            this.way = way2;
            this.preCache = z;
            this.autoRepeat = z2;
            this.autoStart = z3;
            this.startDecodeFirstFrame = z4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Config(Way way2, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(way2, (i & 2) != 0 ? defaultPrecache : z, (i & 4) != 0 ? defaultAutoRepeat : z2, (i & 8) != 0 ? defaultAutoStart : z3, (i & 16) != 0 ? defaultStartDecodeFirstFrame : z4);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B%\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way;", "", "width", "", "height", "limitFps", "", "<init>", "(IIZ)V", "getWidth$rlottie_release", "()I", "getHeight$rlottie_release", "getLimitFps$rlottie_release", "()Z", "Builder", "Asset", "RawRes", "Json", "File", "Url", "Lone/me/rlottie/RLottieFactory$Way$Asset;", "Lone/me/rlottie/RLottieFactory$Way$File;", "Lone/me/rlottie/RLottieFactory$Way$Json;", "Lone/me/rlottie/RLottieFactory$Way$RawRes;", "Lone/me/rlottie/RLottieFactory$Way$Url;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Way {
        private final int height;
        private final boolean limitFps;
        private final int width;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\u0013\u0010\r\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0004@\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0004@\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Builder;", "B", "", "<init>", "()V", "width", "", "getWidth", "()I", "setWidth", "(I)V", "height", "getHeight", "setHeight", "limitFps", "", "getLimitFps", "()Z", "setLimitFps", "(Z)V", "(I)Ljava/lang/Object;", "setSize", "(II)Ljava/lang/Object;", "(Z)Ljava/lang/Object;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Builder<B> {
            private int height;
            private boolean limitFps;
            private int width;

            public Builder() {
                Config.Companion companion = Config.Companion;
                this.width = companion.getDefaultSize();
                this.height = companion.getDefaultSize();
                this.limitFps = companion.getDefaultShouldLimitFps();
            }

            public final int getHeight() {
                return this.height;
            }

            public final boolean getLimitFps() {
                return this.limitFps;
            }

            public final int getWidth() {
                return this.width;
            }

            /* renamed from: setHeight  reason: collision with other method in class */
            public final void m1562setHeight(int i) {
                this.height = i;
            }

            /* renamed from: setLimitFps  reason: collision with other method in class */
            public final void m1563setLimitFps(boolean z) {
                this.limitFps = z;
            }

            public final B setSize(int i, int i2) {
                this.width = i;
                this.height = i2;
                return this;
            }

            /* renamed from: setWidth  reason: collision with other method in class */
            public final void m1564setWidth(int i) {
                this.width = i;
            }

            public final B setHeight(int i) {
                this.height = i;
                return this;
            }

            public final B setLimitFps(boolean z) {
                this.limitFps = z;
                return this;
            }

            public final B setWidth(int i) {
                this.width = i;
                return this;
            }
        }

        public /* synthetic */ Way(int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, z);
        }

        public final int getHeight$rlottie_release() {
            return this.height;
        }

        public final boolean getLimitFps$rlottie_release() {
            return this.limitFps;
        }

        public final int getWidth$rlottie_release() {
            return this.width;
        }

        private Way(int i, int i2, boolean z) {
            this.width = i;
            this.height = i2;
            this.limitFps = z;
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Asset;", "Lone/me/rlottie/RLottieFactory$Way;", "context", "Landroid/content/Context;", "assetsRes", "", "cacheName", "width", "", "height", "limitFps", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getContext$rlottie_release", "()Landroid/content/Context;", "getAssetsRes$rlottie_release", "()Ljava/lang/String;", "getCacheName$rlottie_release", "Builder", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Asset extends Way {
            private final String assetsRes;
            private final String cacheName;
            private final Context context;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Asset$Builder;", "Lone/me/rlottie/RLottieFactory$Way$Builder;", "<init>", "()V", "context", "Landroid/content/Context;", "assetsRes", "", "cacheName", "setContext", "setAssetsRes", "setCacheName", "build", "Lone/me/rlottie/RLottieFactory$Way$Asset;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Builder extends Builder<Builder> {
                private String assetsRes;
                private String cacheName;
                private Context context;

                public final Asset build() {
                    Context context2 = this.context;
                    Context context3 = context2 == null ? null : context2;
                    String str = this.assetsRes;
                    String str2 = str == null ? null : str;
                    String str3 = this.cacheName;
                    if (str3 == null) {
                        str3 = str == null ? null : str;
                    }
                    return new Asset(context3, str2, str3, getWidth(), getHeight(), getLimitFps());
                }

                public final Builder setAssetsRes(String str) {
                    this.assetsRes = str;
                    return this;
                }

                public final Builder setCacheName(String str) {
                    this.cacheName = str;
                    return this;
                }

                public final Builder setContext(Context context2) {
                    this.context = context2;
                    return this;
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Asset(Context context2, String str, String str2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(context2, str, (i3 & 4) != 0 ? str : str2, (i3 & 8) != 0 ? Config.Companion.getDefaultSize() : i, (i3 & 16) != 0 ? Config.Companion.getDefaultSize() : i2, (i3 & 32) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z);
            }

            public final String getAssetsRes$rlottie_release() {
                return this.assetsRes;
            }

            public final String getCacheName$rlottie_release() {
                return this.cacheName;
            }

            public final Context getContext$rlottie_release() {
                return this.context;
            }

            public Asset(Context context2, String str, String str2, int i, int i2, boolean z) {
                super(i, i2, z, (DefaultConstructorMarker) null);
                this.context = context2;
                this.assetsRes = str;
                this.cacheName = str2;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$File;", "Lone/me/rlottie/RLottieFactory$Way;", "file", "Ljava/io/File;", "width", "", "height", "limitFps", "", "<init>", "(Ljava/io/File;IIZ)V", "getFile$rlottie_release", "()Ljava/io/File;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class File extends Way {
            private final java.io.File file;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ File(java.io.File file2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(file2, (i3 & 2) != 0 ? Config.Companion.getDefaultSize() : i, (i3 & 4) != 0 ? Config.Companion.getDefaultSize() : i2, (i3 & 8) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z);
            }

            public final java.io.File getFile$rlottie_release() {
                return this.file;
            }

            public File(java.io.File file2, int i, int i2, boolean z) {
                super(i, i2, z, (DefaultConstructorMarker) null);
                this.file = file2;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Json;", "Lone/me/rlottie/RLottieFactory$Way;", "jsonString", "", "cacheName", "width", "", "height", "limitFps", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZ)V", "getJsonString$rlottie_release", "()Ljava/lang/String;", "getCacheName$rlottie_release", "Builder", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Json extends Way {
            private final String cacheName;
            private final String jsonString;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Json$Builder;", "Lone/me/rlottie/RLottieFactory$Way$Builder;", "<init>", "()V", "jsonString", "", "cacheName", "setJsonString", "setCacheName", "build", "Lone/me/rlottie/RLottieFactory$Way$Json;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Builder extends Builder<Builder> {
                private String cacheName;
                private String jsonString;

                public final Json build() {
                    String str = this.jsonString;
                    String str2 = str == null ? null : str;
                    String str3 = this.cacheName;
                    return new Json(str2, str3 == null ? null : str3, getWidth(), getHeight(), getLimitFps());
                }

                public final Builder setCacheName(String str) {
                    this.cacheName = str;
                    return this;
                }

                public final Builder setJsonString(String str) {
                    this.jsonString = str;
                    if (this.cacheName == null) {
                        this.cacheName = str;
                    }
                    return this;
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Json(String str, String str2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i3 & 4) != 0 ? Config.Companion.getDefaultSize() : i, (i3 & 8) != 0 ? Config.Companion.getDefaultSize() : i2, (i3 & 16) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z);
            }

            public final String getCacheName$rlottie_release() {
                return this.cacheName;
            }

            public final String getJsonString$rlottie_release() {
                return this.jsonString;
            }

            public Json(String str, String str2, int i, int i2, boolean z) {
                super(i, i2, z, (DefaultConstructorMarker) null);
                this.jsonString = str;
                this.cacheName = str2;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$RawRes;", "Lone/me/rlottie/RLottieFactory$Way;", "rawResId", "", "cacheName", "", "width", "height", "limitFps", "", "<init>", "(ILjava/lang/String;IIZ)V", "getRawResId$rlottie_release", "()I", "getCacheName$rlottie_release", "()Ljava/lang/String;", "Builder", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RawRes extends Way {
            private final String cacheName;
            private final int rawResId;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$RawRes$Builder;", "Lone/me/rlottie/RLottieFactory$Way$Builder;", "<init>", "()V", "<set-?>", "", "rawResId", "getRawResId", "()I", "setRawResId", "(I)V", "rawResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "cacheName", "", "setCacheName", "build", "Lone/me/rlottie/RLottieFactory$Way$RawRes;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Builder extends Builder<Builder> {
                static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {rae.s(Builder.class, "rawResId", "getRawResId()I", 0)};
                private String cacheName;
                private final ReadWriteProperty rawResId$delegate = Delegates.INSTANCE.notNull();

                private final int getRawResId() {
                    return ((Number) this.rawResId$delegate.getValue(this, $$delegatedProperties[0])).intValue();
                }

                private final void setRawResId(int i) {
                    this.rawResId$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
                }

                public final RawRes build() {
                    int rawResId = getRawResId();
                    String str = this.cacheName;
                    if (str == null) {
                        str = null;
                    }
                    return new RawRes(rawResId, str, getWidth(), getHeight(), getLimitFps());
                }

                public final Builder setCacheName(String str) {
                    this.cacheName = str;
                    return this;
                }

                /* renamed from: setRawResId  reason: collision with other method in class */
                public final Builder m1565setRawResId(int i) {
                    setRawResId(i);
                    return this;
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ RawRes(int i, String str, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i4 & 4) != 0 ? Config.Companion.getDefaultSize() : i2, (i4 & 8) != 0 ? Config.Companion.getDefaultSize() : i3, (i4 & 16) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z);
            }

            public final String getCacheName$rlottie_release() {
                return this.cacheName;
            }

            public final int getRawResId$rlottie_release() {
                return this.rawResId;
            }

            public RawRes(int i, String str, int i2, int i3, boolean z) {
                super(i2, i3, z, (DefaultConstructorMarker) null);
                this.rawResId = i;
                this.cacheName = str;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Url;", "Lone/me/rlottie/RLottieFactory$Way;", "url", "", "networkFetchEnabled", "", "width", "", "height", "limitFps", "<init>", "(Ljava/lang/String;ZIIZ)V", "getUrl$rlottie_release", "()Ljava/lang/String;", "getNetworkFetchEnabled$rlottie_release", "()Z", "Builder", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Url extends Way {
            private final boolean networkFetchEnabled;
            private final String url;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lone/me/rlottie/RLottieFactory$Way$Url$Builder;", "Lone/me/rlottie/RLottieFactory$Way$Builder;", "<init>", "()V", "url", "", "networkFetchEnabled", "", "setUrl", "setNetworkFetchEnabled", "build", "Lone/me/rlottie/RLottieFactory$Way$Url;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Builder extends Builder<Builder> {
                private boolean networkFetchEnabled = Config.Companion.getDefaultNetworkFetchEnabled();
                private String url;

                public final Url build() {
                    String str = this.url;
                    if (str == null) {
                        str = null;
                    }
                    return new Url(str, this.networkFetchEnabled, getWidth(), getHeight(), getLimitFps());
                }

                public final Builder setNetworkFetchEnabled(boolean z) {
                    this.networkFetchEnabled = z;
                    return this;
                }

                public final Builder setUrl(String str) {
                    this.url = str;
                    return this;
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Url(String str, boolean z, int i, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i3 & 2) != 0 ? Config.Companion.getDefaultNetworkFetchEnabled() : z, (i3 & 4) != 0 ? Config.Companion.getDefaultSize() : i, (i3 & 8) != 0 ? Config.Companion.getDefaultSize() : i2, (i3 & 16) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z2);
            }

            public final boolean getNetworkFetchEnabled$rlottie_release() {
                return this.networkFetchEnabled;
            }

            public final String getUrl$rlottie_release() {
                return this.url;
            }

            public Url(String str, boolean z, int i, int i2, boolean z2) {
                super(i, i2, z2, (DefaultConstructorMarker) null);
                this.url = str;
                this.networkFetchEnabled = z;
            }
        }
    }

    private RLottieFactory() {
    }

    private final int autoRepeatModeByBoolean(boolean z) {
        return z ? 1 : 2;
    }

    @JvmStatic
    public static final RLottieDrawable create(Config config) {
        Way way$rlottie_release = config.getWay$rlottie_release();
        if (way$rlottie_release instanceof Way.Asset) {
            Way.Asset asset = (Way.Asset) way$rlottie_release;
            return createByAsset(asset.getContext$rlottie_release(), asset.getAssetsRes$rlottie_release(), asset.getCacheName$rlottie_release(), way$rlottie_release.getWidth$rlottie_release(), way$rlottie_release.getHeight$rlottie_release(), way$rlottie_release.getLimitFps$rlottie_release(), config.getAutoRepeat$rlottie_release(), config.getStartDecodeFirstFrame$rlottie_release(), config.getAutoStart$rlottie_release(), config.getPreCache$rlottie_release());
        } else if (way$rlottie_release instanceof Way.File) {
            File file$rlottie_release = ((Way.File) way$rlottie_release).getFile$rlottie_release();
            int width$rlottie_release = way$rlottie_release.getWidth$rlottie_release();
            int height$rlottie_release = way$rlottie_release.getHeight$rlottie_release();
            return createByFile(file$rlottie_release, config.getPreCache$rlottie_release(), width$rlottie_release, height$rlottie_release, config.getAutoRepeat$rlottie_release(), way$rlottie_release.getLimitFps$rlottie_release(), config.getStartDecodeFirstFrame$rlottie_release(), config.getAutoStart$rlottie_release());
        } else if (way$rlottie_release instanceof Way.Json) {
            Way.Json json = (Way.Json) way$rlottie_release;
            return createByJsonString(json.getJsonString$rlottie_release(), json.getCacheName$rlottie_release(), config.getAutoStart$rlottie_release(), config.getAutoRepeat$rlottie_release(), way$rlottie_release.getWidth$rlottie_release(), way$rlottie_release.getHeight$rlottie_release(), way$rlottie_release.getLimitFps$rlottie_release(), config.getStartDecodeFirstFrame$rlottie_release(), config.getPreCache$rlottie_release());
        } else if (way$rlottie_release instanceof Way.RawRes) {
            Way.RawRes rawRes = (Way.RawRes) way$rlottie_release;
            return createByRawRes(rawRes.getRawResId$rlottie_release(), rawRes.getCacheName$rlottie_release(), way$rlottie_release.getWidth$rlottie_release(), way$rlottie_release.getHeight$rlottie_release(), config.getAutoRepeat$rlottie_release(), way$rlottie_release.getLimitFps$rlottie_release(), config.getStartDecodeFirstFrame$rlottie_release(), config.getAutoStart$rlottie_release(), config.getPreCache$rlottie_release());
        } else if (way$rlottie_release instanceof Way.Url) {
            Way.Url url = (Way.Url) way$rlottie_release;
            return createByUrl(url.getUrl$rlottie_release(), way$rlottie_release.getWidth$rlottie_release(), way$rlottie_release.getHeight$rlottie_release(), way$rlottie_release.getLimitFps$rlottie_release(), config.getAutoRepeat$rlottie_release(), url.getNetworkFetchEnabled$rlottie_release(), config.getStartDecodeFirstFrame$rlottie_release(), config.getAutoStart$rlottie_release(), config.getPreCache$rlottie_release());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str) {
        return createByAsset$default(context, str, (String) null, 0, 0, false, false, false, false, false, 1020, (Object) null);
    }

    public static /* synthetic */ RLottieDrawable createByAsset$default(Context context, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, Object obj) {
        int i4 = i3;
        return createByAsset(context, str, (i4 & 4) != 0 ? str : str2, (i4 & 8) != 0 ? Config.Companion.getDefaultSize() : i, (i4 & 16) != 0 ? Config.Companion.getDefaultSize() : i2, (i4 & 32) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z, (i4 & 64) != 0 ? Config.Companion.getDefaultAutoRepeat() : z2, (i4 & Uuid.SIZE_BITS) != 0 ? Config.Companion.getDefaultStartDecodeFirstFrame() : z3, (i4 & 256) != 0 ? Config.Companion.getDefaultAutoStart() : z4, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Config.Companion.getDefaultPrecache() : z5);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file) {
        return createByFile$default(file, false, 0, 0, false, false, false, false, 254, (Object) null);
    }

    public static /* synthetic */ RLottieDrawable createByFile$default(File file, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = Config.Companion.getDefaultPrecache();
        }
        if ((i3 & 4) != 0) {
            i = Config.Companion.getDefaultSize();
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = Config.Companion.getDefaultSize();
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z2 = Config.Companion.getDefaultAutoRepeat();
        }
        boolean z6 = z2;
        if ((i3 & 32) != 0) {
            z3 = Config.Companion.getDefaultShouldLimitFps();
        }
        boolean z7 = z3;
        if ((i3 & 64) != 0) {
            z4 = Config.Companion.getDefaultStartDecodeFirstFrame();
        }
        boolean z8 = z4;
        if ((i3 & Uuid.SIZE_BITS) != 0) {
            z5 = Config.Companion.getDefaultAutoStart();
        }
        return createByFile(file, z, i4, i5, z6, z7, z8, z5);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2) {
        return createByJsonString$default(str, str2, false, false, 0, 0, false, false, false, 508, (Object) null);
    }

    public static /* synthetic */ RLottieDrawable createByJsonString$default(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, Object obj) {
        int i4 = i3;
        return createByJsonString(str, str2, (i4 & 4) != 0 ? Config.Companion.getDefaultAutoStart() : z, (i4 & 8) != 0 ? Config.Companion.getDefaultAutoRepeat() : z2, (i4 & 16) != 0 ? Config.Companion.getDefaultSize() : i, (i4 & 32) != 0 ? Config.Companion.getDefaultSize() : i2, (i4 & 64) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z3, (i4 & Uuid.SIZE_BITS) != 0 ? Config.Companion.getDefaultStartDecodeFirstFrame() : z4, (i4 & 256) != 0 ? Config.Companion.getDefaultPrecache() : z5);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str) {
        return createByRawRes$default(i, str, 0, 0, false, false, false, false, false, 508, (Object) null);
    }

    public static /* synthetic */ RLottieDrawable createByRawRes$default(int i, String str, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, Object obj) {
        int i5 = i4;
        return createByRawRes(i, str, (i5 & 4) != 0 ? Config.Companion.getDefaultSize() : i2, (i5 & 8) != 0 ? Config.Companion.getDefaultSize() : i3, (i5 & 16) != 0 ? Config.Companion.getDefaultAutoRepeat() : z, (i5 & 32) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z2, (i5 & 64) != 0 ? Config.Companion.getDefaultStartDecodeFirstFrame() : z3, (i5 & Uuid.SIZE_BITS) != 0 ? Config.Companion.getDefaultAutoStart() : z4, (i5 & 256) != 0 ? Config.Companion.getDefaultPrecache() : z5);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str) {
        return createByUrl$default(str, 0, 0, false, false, false, false, false, false, 510, (Object) null);
    }

    public static /* synthetic */ RLottieDrawable createByUrl$default(String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, Object obj) {
        int i4 = i3;
        return createByUrl(str, (i4 & 2) != 0 ? Config.Companion.getDefaultSize() : i, (i4 & 4) != 0 ? Config.Companion.getDefaultSize() : i2, (i4 & 8) != 0 ? Config.Companion.getDefaultShouldLimitFps() : z, (i4 & 16) != 0 ? Config.Companion.getDefaultAutoRepeat() : z2, (i4 & 32) != 0 ? Config.Companion.getDefaultNetworkFetchEnabled() : z3, (i4 & 64) != 0 ? Config.Companion.getDefaultStartDecodeFirstFrame() : z4, (i4 & Uuid.SIZE_BITS) != 0 ? Config.Companion.getDefaultAutoStart() : z5, (i4 & 256) != 0 ? Config.Companion.getDefaultPrecache() : z6);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2) {
        return createByAsset$default(context, str, str2, 0, 0, false, false, false, false, false, 1016, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file, boolean z) {
        return createByFile$default(file, z, 0, 0, false, false, false, false, 252, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z) {
        return createByJsonString$default(str, str2, z, false, 0, 0, false, false, false, HttpStatus.SC_GATEWAY_TIMEOUT, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2) {
        return createByRawRes$default(i, str, i2, 0, false, false, false, false, false, HttpStatus.SC_GATEWAY_TIMEOUT, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i) {
        return createByUrl$default(str, i, 0, false, false, false, false, false, false, 508, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i) {
        return createByAsset$default(context, str, str2, i, 0, false, false, false, false, false, 1008, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file, boolean z, int i) {
        return createByFile$default(file, z, i, 0, false, false, false, false, 248, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z, boolean z2) {
        return createByJsonString$default(str, str2, z, z2, 0, 0, false, false, false, 496, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2, int i3) {
        return createByRawRes$default(i, str, i2, i3, false, false, false, false, false, 496, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2) {
        return createByUrl$default(str, i, i2, false, false, false, false, false, false, HttpStatus.SC_GATEWAY_TIMEOUT, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i, int i2) {
        return createByAsset$default(context, str, str2, i, i2, false, false, false, false, false, 992, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file, boolean z, int i, int i2) {
        return createByFile$default(file, z, i, i2, false, false, false, false, 240, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z, boolean z2, int i) {
        return createByJsonString$default(str, str2, z, z2, i, 0, false, false, false, 480, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2, int i3, boolean z) {
        return createByRawRes$default(i, str, i2, i3, z, false, false, false, false, 480, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2, boolean z) {
        return createByUrl$default(str, i, i2, z, false, false, false, false, false, 496, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i, int i2, boolean z) {
        return createByAsset$default(context, str, str2, i, i2, z, false, false, false, false, 960, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file, boolean z, int i, int i2, boolean z2) {
        return createByFile$default(file, z, i, i2, z2, false, false, false, 224, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z, boolean z2, int i, int i2) {
        return createByJsonString$default(str, str2, z, z2, i, i2, false, false, false, 448, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2, int i3, boolean z, boolean z2) {
        return createByRawRes$default(i, str, i2, i3, z, z2, false, false, false, 448, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2, boolean z, boolean z2) {
        return createByUrl$default(str, i, i2, z, z2, false, false, false, false, 480, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i, int i2, boolean z, boolean z2) {
        return createByAsset$default(context, str, str2, i, i2, z, z2, false, false, false, 896, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file, boolean z, int i, int i2, boolean z2, boolean z3) {
        return createByFile$default(file, z, i, i2, z2, z3, false, false, 192, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3) {
        return createByJsonString$default(str, str2, z, z2, i, i2, z3, false, false, 384, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2, int i3, boolean z, boolean z2, boolean z3) {
        return createByRawRes$default(i, str, i2, i3, z, z2, z3, false, false, 384, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        return createByUrl$default(str, i, i2, z, z2, z3, false, false, false, 448, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        return createByAsset$default(context, str, str2, i, i2, z, z2, z3, false, false, 768, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByFile(File file, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        return createByFile$default(file, z, i, i2, z2, z3, z4, false, Uuid.SIZE_BITS, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4) {
        return createByJsonString$default(str, str2, z, z2, i, i2, z3, z4, false, 256, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        return createByRawRes$default(i, str, i2, i3, z, z2, z3, z4, false, 256, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        return createByUrl$default(str, i, i2, z, z2, z3, z4, false, false, 384, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        return createByAsset$default(context, str, str2, i, i2, z, z2, z3, z4, false, ConstantsKt.MINIMUM_BLOCK_SIZE, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: xo0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final one.me.rlottie.RLottieDrawable createByFile(java.io.File r7, boolean r8, int r9, int r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            one.me.rlottie.RLottie r0 = one.me.rlottie.RLottie.INSTANCE
            r0.checkNativeLibraryLoad$rlottie_release()
            one.me.rlottie.RLottieDrawable r0 = new one.me.rlottie.RLottieDrawable
            if (r8 == 0) goto L_0x0010
            xo0 r1 = new xo0
            r1.<init>()
        L_0x000e:
            r5 = r1
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x000e
        L_0x0012:
            r1 = r0
            r2 = r7
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.g1 = r8
            one.me.rlottie.RLottieFactory r7 = INSTANCE
            int r7 = r7.autoRepeatModeByBoolean(r11)
            r0.setAutoRepeat(r7)
            r0.setAllowDecodeSingleFrame(r13)
            if (r14 == 0) goto L_0x002d
            r0.start()
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieFactory.createByFile(java.io.File, boolean, int, int, boolean, boolean, boolean, boolean):one.me.rlottie.RLottieDrawable");
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByJsonString(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5) {
        RLottie.INSTANCE.checkNativeLibraryLoad$rlottie_release();
        RLottieDrawable rLottieDrawable = new RLottieDrawable(str, str2, i, i2, true, (int[]) null);
        rLottieDrawable.R0 = z3;
        rLottieDrawable.g1 = z5;
        boolean z6 = z2;
        rLottieDrawable.setAutoRepeat(INSTANCE.autoRepeatModeByBoolean(z2));
        boolean z7 = z4;
        rLottieDrawable.setAllowDecodeSingleFrame(z4);
        if (z) {
            rLottieDrawable.start();
        }
        return rLottieDrawable;
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByRawRes(int i, String str, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        RLottie.INSTANCE.checkNativeLibraryLoad$rlottie_release();
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, str, i2, i3);
        rLottieDrawable.R0 = z2;
        rLottieDrawable.g1 = z5;
        if (z4) {
            rLottieDrawable.start();
        }
        rLottieDrawable.setAutoRepeat(INSTANCE.autoRepeatModeByBoolean(z));
        rLottieDrawable.setAllowDecodeSingleFrame(z3);
        return rLottieDrawable;
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return createByUrl$default(str, i, i2, z, z2, z3, z4, z5, false, 256, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByAsset(Context context, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str3;
        try {
            ThreadLocal threadLocal = nl7.a;
            String str4 = str;
            str3 = nl7.d(context.getAssets().open(str));
        } catch (Throwable unused) {
            str3 = null;
        }
        return createByJsonString(str3, str2, z4, z2, i, i2, z, z3, z5);
    }

    @JvmStatic
    @JvmOverloads
    public static final RLottieDrawable createByUrl(String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str2 = str;
        RLottie.INSTANCE.checkNativeLibraryLoad$rlottie_release();
        RLottieDrawable rLottieDrawable = new RLottieDrawable("", str, i, i2, false, (int[]) null);
        rLottieDrawable.y1 = str2;
        rLottieDrawable.R0 = z;
        rLottieDrawable.B1 = str2;
        rLottieDrawable.g1 = z6;
        boolean z7 = z2;
        rLottieDrawable.setAutoRepeat(INSTANCE.autoRepeatModeByBoolean(z2));
        boolean z8 = z4;
        rLottieDrawable.setAllowDecodeSingleFrame(z4);
        if (z5) {
            rLottieDrawable.start();
        }
        boolean z9 = z3;
        RLottieLoaderPipeline.download(str, z3).withListener(rLottieDrawable);
        return rLottieDrawable;
    }
}
