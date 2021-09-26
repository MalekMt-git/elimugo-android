package ngo.dean.elimugo.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ngo.dean.elimugo.R;

public class HeaderView extends LinearLayout {

    public HeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        Drawable iconSource;
        String textTitle;
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.HeaderView);
        try {
            iconSource = typedArray.getDrawable(R.styleable.HeaderView_iconDrawable);
            textTitle = typedArray.getString(R.styleable.HeaderView_titleText);
        } finally {
            typedArray.recycle();
        }

        setLayout();
        if (iconSource != null)
            addIcon(iconSource);
        if (textTitle != null)
            addTitle(textTitle);
    }

    private void setLayout() {
        setOrientation(LinearLayout.HORIZONTAL);
        setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
    }

    private void addIcon(Drawable iconSource) {
        ImageView icon = new ImageView(getContext());
        icon.setImageDrawable(iconSource);
        icon.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 4));
        addView(icon);
    }

    private void addTitle(String textTitle) {
        TextView title = new TextView(getContext());
        title.setPadding(0, dpPadding16(), 0, 0);
        title.setTextSize(24);
        title.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        title.setText(textTitle);
        title.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1));
        addView(title);
    }

    private int dpPadding16() {
        return (int) (16 * getResources().getDisplayMetrics().density + 0.5f);
    }
}
