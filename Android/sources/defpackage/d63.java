package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: d63  reason: default package */
public final class d63 {
    public int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Bundle e;
    public final boolean f;

    public d63(int i) {
        int i2;
        String str = e63.i;
        switch (i) {
            case 57369:
                i2 = mfc.media3_icon_album;
                break;
            case 57370:
                i2 = mfc.media3_icon_artist;
                break;
            case 57372:
                i2 = mfc.media3_icon_closed_captions;
                break;
            case 57375:
                i2 = mfc.media3_icon_fast_forward;
                break;
            case 57376:
                i2 = mfc.media3_icon_rewind;
                break;
            case 57396:
                i2 = mfc.media3_icon_pause;
                break;
            case 57399:
                i2 = mfc.media3_icon_play;
                break;
            case 57403:
                i2 = mfc.media3_icon_playlist_add;
                break;
            case 57408:
                i2 = mfc.media3_icon_repeat_all;
                break;
            case 57409:
                i2 = mfc.media3_icon_repeat_one;
                break;
            case 57410:
                i2 = mfc.media3_icon_skip_back;
                break;
            case 57411:
                i2 = mfc.media3_icon_shuffle_on;
                break;
            case 57412:
                i2 = mfc.media3_icon_next;
                break;
            case 57413:
                i2 = mfc.media3_icon_previous;
                break;
            case 57415:
                i2 = mfc.media3_icon_stop;
                break;
            case 57416:
                i2 = mfc.media3_icon_subtitles;
                break;
            case 57421:
                i2 = mfc.media3_icon_volume_down;
                break;
            case 57423:
                i2 = mfc.media3_icon_volume_off;
                break;
            case 57424:
                i2 = mfc.media3_icon_volume_up;
                break;
            case 57430:
                i2 = mfc.media3_icon_skip_forward_10;
                break;
            case 57431:
                i2 = mfc.media3_icon_skip_forward_30;
                break;
            case 57432:
                i2 = mfc.media3_icon_skip_forward_5;
                break;
            case 57433:
                i2 = mfc.media3_icon_skip_back_10;
                break;
            case 57434:
                i2 = mfc.media3_icon_skip_back_30;
                break;
            case 57435:
                i2 = mfc.media3_icon_skip_back_5;
                break;
            case 57436:
                i2 = mfc.media3_icon_queue_add;
                break;
            case 57446:
                i2 = mfc.media3_icon_queue_next;
                break;
            case 57447:
                i2 = mfc.media3_icon_queue_remove;
                break;
            case 57448:
                i2 = mfc.media3_icon_playback_speed;
                break;
            case 57573:
                i2 = mfc.media3_icon_feed;
                break;
            case 57669:
                i2 = mfc.media3_icon_plus;
                break;
            case 57671:
                i2 = mfc.media3_icon_plus_circle_unfilled;
                break;
            case 57675:
                i2 = mfc.media3_icon_block;
                break;
            case 57683:
                i2 = mfc.media3_icon_flag_unfilled;
                break;
            case 57691:
                i2 = mfc.media3_icon_minus;
                break;
            case 58409:
                i2 = mfc.media3_icon_quality;
                break;
            case 58654:
                i2 = mfc.media3_icon_radio;
                break;
            case 58919:
                i2 = mfc.media3_icon_sync;
                break;
            case 59405:
                i2 = mfc.media3_icon_share;
                break;
            case 59448:
                i2 = mfc.media3_icon_star_unfilled;
                break;
            case 59494:
                i2 = mfc.media3_icon_bookmark_unfilled;
                break;
            case 59500:
                i2 = mfc.media3_icon_check_circle_unfilled;
                break;
            case 59517:
                i2 = mfc.media3_icon_heart_unfilled;
                break;
            case 59576:
                i2 = mfc.media3_icon_settings;
                break;
            case 59611:
                i2 = mfc.media3_icon_thumb_down_unfilled;
                break;
            case 59612:
                i2 = mfc.media3_icon_thumb_up_unfilled;
                break;
            case 60288:
                i2 = mfc.media3_icon_playlist_remove;
                break;
            case 61298:
                i2 = mfc.media3_icon_subtitles_off;
                break;
            case 61389:
                i2 = mfc.media3_icon_playback_speed_1_0;
                break;
            case 61512:
                i2 = mfc.media3_icon_signal;
                break;
            case 61916:
                i2 = mfc.media3_icon_closed_captions_off;
                break;
            case 62688:
                i2 = mfc.media3_icon_playback_speed_1_5;
                break;
            case 62689:
                i2 = mfc.media3_icon_playback_speed_1_2;
                break;
            case 62690:
                i2 = mfc.media3_icon_playback_speed_0_5;
                break;
            case 62699:
                i2 = mfc.media3_icon_playback_speed_2_0;
                break;
            case 63220:
                i2 = mfc.media3_icon_skip_forward;
                break;
            case 1040448:
                i2 = mfc.media3_icon_repeat_off;
                break;
            case 1040451:
                i2 = mfc.media3_icon_shuffle_star;
                break;
            case 1040452:
                i2 = mfc.media3_icon_shuffle_off;
                break;
            case 1040470:
                i2 = mfc.media3_icon_skip_forward_15;
                break;
            case 1040473:
                i2 = mfc.media3_icon_skip_back_15;
                break;
            case 1040711:
                i2 = mfc.media3_icon_plus_circle_filled;
                break;
            case 1040712:
                i2 = mfc.media3_icon_minus_circle_filled;
                break;
            case 1040713:
                i2 = mfc.media3_icon_minus_circle_unfilled;
                break;
            case 1040723:
                i2 = mfc.media3_icon_flag_filled;
                break;
            case 1042488:
                i2 = mfc.media3_icon_star_filled;
                break;
            case 1042534:
                i2 = mfc.media3_icon_bookmark_filled;
                break;
            case 1042540:
                i2 = mfc.media3_icon_check_circle_filled;
                break;
            case 1042557:
                i2 = mfc.media3_icon_heart_filled;
                break;
            case 1042651:
                i2 = mfc.media3_icon_thumb_down_filled;
                break;
            case 1042652:
                i2 = mfc.media3_icon_thumb_up_filled;
                break;
            case 1045728:
                i2 = mfc.media3_icon_playback_speed_1_8;
                break;
            case 1045730:
                i2 = mfc.media3_icon_playback_speed_0_8;
                break;
            default:
                i2 = 0;
                break;
        }
        this.b = i;
        this.c = i2;
        this.d = "";
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.f = true;
    }

    public final e63 a() {
        n79.m("Exactly one of sessionCommand and playerCommand should be set", this.a != -1);
        return new e63((yvd) null, this.a, this.b, this.c, (Uri) null, this.d, this.e, this.f);
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(Bundle bundle) {
        this.e = new Bundle(bundle);
    }

    public final void d(int i) {
        this.a = i;
    }
}
