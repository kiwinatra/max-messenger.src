package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.Logging;
import ru.ok.tamtam.nano.Protos;

public final class WebRtcAudioUtils {
    private static final String TAG = "WebRtcAudioUtilsExternal";

    @TargetApi(24)
    public static String audioEncodingToString(int i) {
        if (i == 0) {
            return "INVALID";
        }
        switch (i) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                return wj6.h(i, "Invalid encoding: ");
        }
    }

    public static String audioSourceToString(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
            default:
                return "INVALID";
        }
    }

    public static String channelMaskToString(int i) {
        return i != 12 ? i != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
    }

    public static String deviceTypeToString(int i) {
        switch (i) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return "TYPE_FM";
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case LangUtils.HASH_SEED:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return "TYPE_BUILTIN_SPEAKER_SAFE";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
            case 26:
                return "TYPE_BLE_HEADSET";
            case 27:
                return "TYPE_BLE_SPEAKER";
            case 29:
                return "TYPE_HDMI_EARC";
            case 30:
                return "TYPE_BLE_BROADCAST";
            case 31:
                return "TYPE_DOCK_ANALOG";
            default:
                return a81.j(i, "TYPE_UNKNOWN(", ")");
        }
    }

    public static String getThreadInfo() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        long id = currentThread.getId();
        return "@[name=" + name + ", id=" + id + "]";
    }

    private static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length != 0) {
            Logging.d(str, "Audio Devices: ");
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                StringBuilder sb = new StringBuilder("  ");
                sb.append(deviceTypeToString(audioDeviceInfo.getType()));
                sb.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb.append("channels=");
                    sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb.append("encodings=");
                    sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb.append("sample rates=");
                    sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb.append(", ");
                }
                sb.append("id=");
                sb.append(audioDeviceInfo.getId());
                Logging.d(str, sb.toString());
            }
        }
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        String modeToString = modeToString(audioManager.getMode());
        boolean hasMicrophone = hasMicrophone(context);
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        Logging.d(str, "Audio State: audio mode: " + modeToString + ", has mic: " + hasMicrophone + ", mic muted: " + isMicrophoneMute + ", music active: " + isMusicActive + ", speakerphone: " + isSpeakerphoneOn + ", BT SCO: " + isBluetoothScoOn);
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean isVolumeFixed = audioManager.isVolumeFixed();
        Logging.d(str, "  fixed volume=" + isVolumeFixed);
        if (!isVolumeFixed) {
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                StringBuilder sb = new StringBuilder();
                String streamTypeToString = streamTypeToString(i2);
                sb.append("  " + streamTypeToString + ": ");
                sb.append("volume=");
                sb.append(audioManager.getStreamVolume(i2));
                sb.append(", max=");
                sb.append(audioManager.getStreamMaxVolume(i2));
                sb.append(", muted=");
                sb.append(audioManager.isStreamMute(i2));
                Logging.d(str, sb.toString());
            }
        }
    }

    private static void logDeviceInfo(String str) {
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        Logging.d(str, "Android SDK: " + i + ", Release: " + str2 + ", Brand: " + str3 + ", Device: " + str4 + ", Id: " + str5 + ", Hardware: " + str6 + ", Manufacturer: " + str7 + ", Model: " + str8 + ", Product: " + str9);
    }

    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        String str = Build.HARDWARE;
        return str.equals("goldfish") || str.equals("ranchu");
    }

    private static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }
}
