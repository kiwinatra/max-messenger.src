package defpackage;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import java.util.WeakHashMap;

/* renamed from: gmd  reason: default package */
public abstract class gmd extends yv7 implements c53 {
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final dmd PRE_API_29_HIDDEN_METHOD_INVOKER = null;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private amd mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private bmd mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private cmd mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchView$SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    w44 mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private fmd mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public gmd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hdc.searchViewStyle);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(nec.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(nec.abc_search_view_preferred_width);
    }

    public static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public void adjustDropDownSizeAndPosition() {
        boolean z = true;
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            int i = 0;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            if (this.mIconifiedByDefault) {
                i = resources.getDimensionPixelSize(nec.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(nec.abc_dropdownitem_icon_width);
            }
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            this.mSearchSrcTextView.setDropDownHorizontalOffset(z ? -rect.left : paddingLeft - (rect.left + i));
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    public final Intent c(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public final Intent e(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = 0;
        if (!z2 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z = false;
        }
        ImageView imageView = this.mCloseButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void forceSuggestionQuery() {
        zld.a(this.mSearchSrcTextView);
    }

    public final void g() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.mIconifiedByDefault && this.mSearchHintIcon != null) {
            int textSize = (int) (((double) searchView$SearchAutoComplete.getTextSize()) * 1.25d);
            this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(queryHint);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public w44 getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public final void h() {
        this.mSubmitArea.setVisibility(((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    public final void i(boolean z) {
        boolean z2 = this.mSubmitButtonEnabled;
        this.mGoButton.setVisibility((!z2 || (!z2 && !this.mVoiceButtonEnabled) || isIconified() || !hasFocus() || (!z && this.mVoiceButtonEnabled)) ? 8 : 0);
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public final void j(boolean z) {
        this.mIconified = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        i(!isEmpty);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() != null && !this.mIconifiedByDefault) {
            i = 0;
        }
        this.mCollapsedIcon.setVisibility(i);
        f();
        k(isEmpty);
        h();
    }

    public final void k(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(c("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        j(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    public void onActionViewExpanded() {
        if (!this.mExpandedInActionView) {
            this.mExpandedInActionView = true;
            int imeOptions = this.mSearchSrcTextView.getImeOptions();
            this.mCollapsedImeOptions = imeOptions;
            this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
            this.mSearchSrcTextView.setText("");
            setIconified(false);
        }
    }

    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            clearFocus();
            j(true);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r9.getPosition();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onItemClicked(int r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            w44 r9 = r7.mSuggestionsAdapter
            android.database.Cursor r9 = r9.c
            if (r9 == 0) goto L_0x0094
            boolean r8 = r9.moveToPosition(r8)
            if (r8 == 0) goto L_0x0094
            r8 = 0
            int r10 = defpackage.n0f.G0     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = "suggest_intent_action"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = defpackage.n0f.h(r9, r10)     // Catch:{ RuntimeException -> 0x0083 }
            if (r10 != 0) goto L_0x0021
            android.app.SearchableInfo r10 = r7.mSearchable     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = r10.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0083 }
        L_0x0021:
            if (r10 != 0) goto L_0x0025
            java.lang.String r10 = "android.intent.action.SEARCH"
        L_0x0025:
            r1 = r10
            java.lang.String r10 = "suggest_intent_data"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = defpackage.n0f.h(r9, r10)     // Catch:{ RuntimeException -> 0x0083 }
            if (r10 != 0) goto L_0x0038
            android.app.SearchableInfo r10 = r7.mSearchable     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = r10.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0083 }
        L_0x0038:
            if (r10 == 0) goto L_0x005e
            java.lang.String r0 = "suggest_intent_data_id"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r0 = defpackage.n0f.h(r9, r0)     // Catch:{ RuntimeException -> 0x0083 }
            if (r0 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0083 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0083 }
            r2.append(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = "/"
            r2.append(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = android.net.Uri.encode(r0)     // Catch:{ RuntimeException -> 0x0083 }
            r2.append(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = r2.toString()     // Catch:{ RuntimeException -> 0x0083 }
        L_0x005e:
            if (r10 != 0) goto L_0x0062
            r2 = r8
            goto L_0x0067
        L_0x0062:
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ RuntimeException -> 0x0083 }
            r2 = r10
        L_0x0067:
            java.lang.String r10 = "suggest_intent_query"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r4 = defpackage.n0f.h(r9, r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r10 = "suggest_intent_extra_data"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ RuntimeException -> 0x0083 }
            java.lang.String r3 = defpackage.n0f.h(r9, r10)     // Catch:{ RuntimeException -> 0x0083 }
            r5 = 0
            r6 = 0
            r0 = r7
            android.content.Intent r8 = r0.c(r1, r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x0083 }
            goto L_0x0086
        L_0x0083:
            r9.getPosition()     // Catch:{ RuntimeException -> 0x0086 }
        L_0x0086:
            if (r8 != 0) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            android.content.Context r9 = r7.getContext()     // Catch:{ RuntimeException -> 0x0091 }
            r9.startActivity(r8)     // Catch:{ RuntimeException -> 0x0091 }
            goto L_0x0094
        L_0x0091:
            r8.toString()
        L_0x0094:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r8 = r7.mSearchSrcTextView
            r9 = 0
            r8.setImeVisibility(r9)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r7.mSearchSrcTextView
            r7.dismissDropDown()
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmd.onItemClicked(int, int, java.lang.String):boolean");
    }

    public boolean onItemSelected(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.c;
        if (cursor == null) {
            return true;
        }
        if (cursor.moveToPosition(i)) {
            String c = this.mSuggestionsAdapter.c(cursor);
            if (c != null) {
                setQuery(c);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
            Rect rect = this.mSearchSrcTextViewBounds;
            searchView$SearchAutoComplete.getLocationInWindow(this.mTemp);
            getLocationInWindow(this.mTemp2);
            int[] iArr = this.mTemp;
            int i5 = iArr[1];
            int[] iArr2 = this.mTemp2;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchView$SearchAutoComplete.getWidth() + i7, searchView$SearchAutoComplete.getHeight() + i6);
            Rect rect2 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect3 = this.mSearchSrcTextViewBounds;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            fmd fmd = this.mTouchDelegate;
            if (fmd == null) {
                fmd fmd2 = new fmd(this.mSearchSrcTextView, this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
                this.mTouchDelegate = fmd2;
                setTouchDelegate(fmd2);
                return;
            }
            Rect rect4 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect5 = this.mSearchSrcTextViewBounds;
            fmd.b.set(rect4);
            Rect rect6 = fmd.d;
            rect6.set(rect4);
            int i8 = -fmd.e;
            rect6.inset(i8, i8);
            fmd.c.set(rect5);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof emd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        emd emd = (emd) parcelable;
        super.onRestoreInstanceState(emd.a);
        j(emd.c);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, z, emd] */
    public Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = isIconified();
        return zVar;
    }

    public void onSearchClicked() {
        j(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            bmd bmd = this.mOnQueryChangeListener;
            if (bmd != null) {
                text.toString();
                hmd hmd = (hmd) bmd;
                if (!hmd.a.get()) {
                    gmd gmd = (gmd) hmd.o;
                    hmd.c.d(new jmd(gmd, gmd.getQuery(), true));
                    return;
                }
            }
            if (this.mSearchable != null) {
                launchQuerySearch(0, (String) null, text.toString());
            }
            this.mSearchSrcTextView.setImeVisibility(false);
            this.mSearchSrcTextView.dismissDropDown();
        }
    }

    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
                searchView$SearchAutoComplete.getClass();
                zld.b(searchView$SearchAutoComplete, 1);
                if (searchView$SearchAutoComplete.enoughToFilter()) {
                    searchView$SearchAutoComplete.showDropDown();
                }
                return true;
            } else if (i == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        i(!isEmpty);
        k(isEmpty);
        f();
        h();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            bmd bmd = this.mOnQueryChangeListener;
            String charSequence2 = charSequence.toString();
            hmd hmd = (hmd) bmd;
            if (!hmd.a.get()) {
                hmd.c.d(new jmd((gmd) hmd.o, charSequence2, false));
            }
        }
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() {
        j(isIconified());
        post(this.mUpdateDrawableStateRunnable);
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.mVoiceWebSearchIntent);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    getContext().startActivity(intent);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(e(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.mUpdateDrawableStateRunnable);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            j(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            j(z);
            g();
        }
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(amd amd) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(bmd bmd) {
        this.mOnQueryChangeListener = bmd;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(cmd cmd) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        g();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        w44 w44 = this.mSuggestionsAdapter;
        if (w44 instanceof n0f) {
            ((n0f) w44).y0 = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        Intent intent = null;
        boolean z = true;
        if (searchableInfo != null) {
            this.mSearchSrcTextView.setThreshold(searchableInfo.getSuggestThreshold());
            this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
            int inputType = this.mSearchable.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.mSearchable.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            this.mSearchSrcTextView.setInputType(inputType);
            w44 w44 = this.mSuggestionsAdapter;
            if (w44 != null) {
                w44.b((Cursor) null);
            }
            if (this.mSearchable.getSuggestAuthority() != null) {
                n0f n0f = new n0f(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
                this.mSuggestionsAdapter = n0f;
                this.mSearchSrcTextView.setAdapter(n0f);
                ((n0f) this.mSuggestionsAdapter).y0 = this.mQueryRefinement ? 2 : 1;
            }
            g();
        }
        SearchableInfo searchableInfo2 = this.mSearchable;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z = false;
                }
                z2 = z;
            }
        }
        this.mVoiceButtonEnabled = z2;
        if (z2) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        j(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        j(isIconified());
    }

    public void setSuggestionsAdapter(w44 w44) {
        this.mSuggestionsAdapter = w44;
        this.mSearchSrcTextView.setAdapter(w44);
    }

    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gmd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new uld(this, 1);
        this.mReleaseCursorRunnable = new uld(this, 0);
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        wld wld = new wld(0, this);
        this.mOnClickListener = wld;
        this.mTextKeyListener = new xld(0, this);
        yld yld = new yld(this);
        this.mOnEditorActionListener = yld;
        vo voVar = new vo(2, this);
        this.mOnItemClickListener = voVar;
        bx4 bx4 = new bx4(2, this);
        this.mOnItemSelectedListener = bx4;
        this.mTextWatcher = new u2(14, this);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, koc.SearchView, i, 0);
        g6d g6d = new g6d(17, (Object) context2, (Object) obtainStyledAttributes);
        int[] iArr = koc.SearchView;
        WeakHashMap weakHashMap = gag.a;
        TypedArray typedArray = obtainStyledAttributes;
        bag.d(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArray.getResourceId(koc.SearchView_layout, vjc.abc_search_view), this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(egc.search_src_text);
        this.mSearchSrcTextView = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(egc.search_edit_frame);
        View findViewById = findViewById(egc.search_plate);
        this.mSearchPlate = findViewById;
        View findViewById2 = findViewById(egc.submit_area);
        this.mSubmitArea = findViewById2;
        ImageView imageView = (ImageView) findViewById(egc.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(egc.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(egc.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(egc.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(egc.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        findViewById.setBackground(g6d.q(koc.SearchView_queryBackground));
        findViewById2.setBackground(g6d.q(koc.SearchView_submitBackground));
        imageView.setImageDrawable(g6d.q(koc.SearchView_searchIcon));
        imageView2.setImageDrawable(g6d.q(koc.SearchView_goIcon));
        imageView3.setImageDrawable(g6d.q(koc.SearchView_closeIcon));
        imageView4.setImageDrawable(g6d.q(koc.SearchView_voiceIcon));
        imageView5.setImageDrawable(g6d.q(koc.SearchView_searchIcon));
        this.mSearchHintIcon = g6d.q(koc.SearchView_searchHintIcon);
        pmf.a(imageView, getResources().getString(zmc.abc_searchview_description_search));
        this.mSuggestionRowLayout = typedArray.getResourceId(koc.SearchView_suggestionRowLayout, vjc.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = typedArray.getResourceId(koc.SearchView_commitIcon, 0);
        imageView.setOnClickListener(wld);
        imageView3.setOnClickListener(wld);
        imageView2.setOnClickListener(wld);
        imageView4.setOnClickListener(wld);
        searchView$SearchAutoComplete.setOnClickListener(wld);
        searchView$SearchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchView$SearchAutoComplete.setOnEditorActionListener(yld);
        searchView$SearchAutoComplete.setOnItemClickListener(voVar);
        searchView$SearchAutoComplete.setOnItemSelectedListener(bx4);
        searchView$SearchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new vld(this));
        setIconifiedByDefault(typedArray.getBoolean(koc.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(koc.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = typedArray.getText(koc.SearchView_defaultQueryHint);
        this.mQueryHint = typedArray.getText(koc.SearchView_queryHint);
        int i2 = typedArray.getInt(koc.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(koc.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(koc.SearchView_android_focusable, true));
        g6d.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new dr0(16, this));
        }
        j(this.mIconifiedByDefault);
        g();
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
