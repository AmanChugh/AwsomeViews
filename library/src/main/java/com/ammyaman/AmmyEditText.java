package com.ammyaman;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import com.ammyaman.ammy.R;


/**
 * Created by amandeep on 14/10/15.
 */
public class AmmyEditText extends EditText {

    private String mFont;


    public AmmyEditText(Context context) {
        super(context, null);
        init(context);
    }


    public AmmyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AmmyEditText,
                0, 0);
        try {
            mFont = a.getString(R.styleable.AmmyEditText_font);
        } finally {
            a.recycle();
        }
        init(context);
    }

    public AmmyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AmmyEditText,
                0, 0);

        try {
            mFont = a.getString(R.styleable.AmmyEditText_font);
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
