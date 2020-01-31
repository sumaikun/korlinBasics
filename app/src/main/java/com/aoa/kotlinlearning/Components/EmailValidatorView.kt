package com.aoa.kotlinlearning.Components

import android.content.Context
import android.graphics.PorterDuff
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import com.aoa.kotlinlearning.R
import kotlinx.android.synthetic.main.password_validator.view.*
import java.util.regex.Pattern

class EmailValidatorView(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs),
    TextWatcher {


    var successColor: Int
    var errorColor: Int

    init {
        inflate(context, R.layout.password_validator, this)


        val attributes = context.obtainStyledAttributes(attrs, R.styleable.PasswordValidator)
        tvErrorCode.text = attributes.getString(R.styleable.PasswordValidator_textError)
        errorColor = attributes.getColor(R.styleable.PasswordValidator_underlineErrorColor, ContextCompat.getColor(context, R.color.colorAccent))
        successColor = attributes.getColor(R.styleable.PasswordValidator_underlineSuccessColor, ContextCompat.getColor(context, R.color.colorAccent))
        attributes.recycle()
        etMail.addTextChangedListener(this)
    }

    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


        val pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")
        val matcher = pattern.matcher(s.toString())
        val valid = matcher.matches()
        if (valid) {
            tvErrorCode.visibility = View.INVISIBLE
            etMail.background.setColorFilter(successColor, PorterDuff.Mode.SRC_IN)
        } else {
            tvErrorCode.visibility = View.VISIBLE
            etMail.background.setColorFilter(errorColor, PorterDuff.Mode.SRC_IN)
        }
    }
}