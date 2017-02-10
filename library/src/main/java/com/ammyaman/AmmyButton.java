package com.ammyaman;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.ammyaman.ammy.R;


/**
 * Created by amandeep on 14/10/15.
 */
public class AmmyButton extends Button {

    private String mFont;

    public AmmyButton(Context context) {
        super(context, null);
        init(context);
    }


    public AmmyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AmmyButton,
                0, 0);
        try {
            mFont = a.getString(R.styleable.AmmyButton_font);
        } finally {
            a.recycle();
        }
        init(context);
    }

    public AmmyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AmmyButton,
                0, 0);

        try {
            mFont = a.getString(R.styleable.AmmyButton_font);
        } finally {
            a.recycle();
        }
        init(context);
    }

    private void init(Context context) {
        if (mFont != null) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + mFont);
            setTypeface(tf);
        }
    }


}
