package com.sq.common_module.common.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.sq.common_module.R
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.inVisibleView
import com.sq.common_module.common.utils.kt.setBackGroundRes
import com.sq.common_module.common.utils.kt.showView

/**
 * Created by town
 * Date :  2022/12/12
 * Time : 17:10
 * 猜成语 四种情况
 */
class GuessIdiomsRandomWidget @JvmOverloads constructor(
    context: Context, private val attrs: AttributeSet?,
    private val defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val mList = arrayListOf<String>()
    private var correctPosition = 1 //正确答案的位置

    private lateinit var mTvGuess1: AppCompatTextView
    private lateinit var mTvGuess2: AppCompatTextView
    private lateinit var mTvGuess3: AppCompatTextView
    private lateinit var mTvGuess4: AppCompatTextView
    private lateinit var mTvGuess5: AppCompatTextView
    private lateinit var mTvGuess6: AppCompatTextView
    private lateinit var mTvGuess7: AppCompatTextView
    private lateinit var mTvGuess8: AppCompatTextView
    private lateinit var mTvGuess9: AppCompatTextView
    private lateinit var mTvGuess10: AppCompatTextView
    private lateinit var mTvGuess11: AppCompatTextView
    private lateinit var mTvGuess12: AppCompatTextView
    private lateinit var mTvGuess13: AppCompatTextView
    private lateinit var mTvGuess14: AppCompatTextView
    private lateinit var mTvGuess15: AppCompatTextView
    private lateinit var mTvGuess16: AppCompatTextView
    private var mShowPosition = 0

    init {
        val view =
            LayoutInflater.from(context).inflate(R.layout.layout_new_guess_idioms_widget, this)
        mTvGuess1 = view.findViewById(R.id.tv_guess_1)
        mTvGuess2 = view.findViewById(R.id.tv_guess_2)
        mTvGuess3 = view.findViewById(R.id.tv_guess_3)
        mTvGuess4 = view.findViewById(R.id.tv_guess_4)
        mTvGuess5 = view.findViewById(R.id.tv_guess_5)
        mTvGuess6 = view.findViewById(R.id.tv_guess_6)
        mTvGuess7 = view.findViewById(R.id.tv_guess_7)
        mTvGuess8 = view.findViewById(R.id.tv_guess_8)
        mTvGuess9 = view.findViewById(R.id.tv_guess_9)
        mTvGuess10 = view.findViewById(R.id.tv_guess_10)
        mTvGuess11 = view.findViewById(R.id.tv_guess_11)
        mTvGuess12 = view.findViewById(R.id.tv_guess_12)
        mTvGuess13 = view.findViewById(R.id.tv_guess_13)
        mTvGuess14 = view.findViewById(R.id.tv_guess_14)
        mTvGuess15 = view.findViewById(R.id.tv_guess_15)
        mTvGuess16 = view.findViewById(R.id.tv_guess_16)
    }

    private var mRowList = arrayListOf<String>()
    private var mColumnList = arrayListOf<String>()

    fun showView(position: Int, list: List<String>) {
        mShowPosition = position + 1
        mRowList.clear()
        mColumnList.clear()
        list.forEachIndexed { index, s ->
            if (index == 0) {
                s.forEachIndexed { _, c ->
                    mRowList.add(c.toString())
                }
            } else {
                s.forEachIndexed { _, c ->
                    mColumnList.add(c.toString())
                }
            }
        }
        showGuessView(position + 1)
    }

    private fun showGuessView(mPosition: Int) {
        if (mPosition == 1) {
            mTvGuess1.showView()
            mTvGuess1.text = ""
            mTvGuess2.text = mRowList[1]
            mTvGuess3.text = mRowList[2]
            mTvGuess4.text = mRowList[3]
            mTvGuess5.text = mColumnList[1]
            mTvGuess9.text = mColumnList[2]
            mTvGuess13.text = mColumnList[3]
        } else mTvGuess1.inVisibleView()
        if (mPosition == 2) {
            mTvGuess6.showView()
            mTvGuess6.text = ""
            mTvGuess5.text = mRowList[0]
            mTvGuess7.text = mRowList[2]
            mTvGuess8.text = mRowList[3]
            mTvGuess2.text = mColumnList[0]
            mTvGuess10.text = mColumnList[2]
            mTvGuess14.text = mColumnList[3]
        } else mTvGuess6.inVisibleView()
        if (mPosition == 3) {
            mTvGuess11.showView()
            mTvGuess11.text = ""
            mTvGuess9.text = mRowList[0]
            mTvGuess10.text = mRowList[1]
            mTvGuess12.text = mRowList[3]
            mTvGuess3.text = mColumnList[0]
            mTvGuess7.text = mColumnList[1]
            mTvGuess15.text = mColumnList[3]

        } else mTvGuess11.inVisibleView()
        if (mPosition == 4) {
            mTvGuess16.showView()
            mTvGuess16.text = ""
            mTvGuess13.text = mRowList[0]
            mTvGuess14.text = mRowList[1]
            mTvGuess15.text = mRowList[2]

            mTvGuess4.text = mColumnList[0]
            mTvGuess8.text = mColumnList[1]
            mTvGuess12.text = mColumnList[2]
        } else mTvGuess16.inVisibleView()
        if (mPosition == 1 || mPosition == 2) {
            mTvGuess2.showView()
            mTvGuess5.showView()
        } else {
            mTvGuess2.inVisibleView()
            mTvGuess5.inVisibleView()
        }
        if (mPosition == 1 || mPosition == 3) {
            mTvGuess3.showView()
            mTvGuess9.showView()
        } else {
            mTvGuess3.inVisibleView()
            mTvGuess9.inVisibleView()
        }
        if (mPosition == 1 || mPosition == 4) {
            mTvGuess4.showView()
            mTvGuess13.showView()
        } else {
            mTvGuess4.inVisibleView()
            mTvGuess13.inVisibleView()
        }

        if (mPosition == 2 || mPosition == 3) {
            mTvGuess7.showView()
            mTvGuess10.showView()
        } else {
            mTvGuess7.inVisibleView()
            mTvGuess10.inVisibleView()
        }
        if (mPosition == 2 || mPosition == 4) {
            mTvGuess8.showView()
            mTvGuess14.showView()
        } else {
            mTvGuess8.inVisibleView()
            mTvGuess14.inVisibleView()
        }

        if (mPosition == 3 || mPosition == 4) {
            mTvGuess12.showView()
            mTvGuess15.showView()
        } else {
            mTvGuess12.inVisibleView()
            mTvGuess15.inVisibleView()
        }
        setTextDrawable(mTvGuess1, true)
        setTextDrawable(mTvGuess2, true)
        setTextDrawable(mTvGuess3, true)
        setTextDrawable(mTvGuess4, true)
        setTextDrawable(mTvGuess5, true)
        setTextDrawable(mTvGuess6, true)
        setTextDrawable(mTvGuess7, true)
        setTextDrawable(mTvGuess8, true)
        setTextDrawable(mTvGuess9, true)
        setTextDrawable(mTvGuess10, true)
        setTextDrawable(mTvGuess11, true)
        setTextDrawable(mTvGuess12, true)
        setTextDrawable(mTvGuess13, true)
        setTextDrawable(mTvGuess14, true)
        setTextDrawable(mTvGuess15, true)
        setTextDrawable(mTvGuess16, true)
    }


    fun setCorrectAnswer(s: String, isCorrect: Boolean) {
        L.i("wwb_correct", isCorrect.toString())
        when (mShowPosition) {
            1 -> {
                mTvGuess1.text = s
                if (isCorrect) {
                    setTextDrawable(mTvGuess1, false)
                    setTextDrawable(mTvGuess2, false)
                    setTextDrawable(mTvGuess3, false)
                    setTextDrawable(mTvGuess4, false)
                    setTextDrawable(mTvGuess5, false)
                    setTextDrawable(mTvGuess9, false)
                    setTextDrawable(mTvGuess13, false)
                } else {
                    mTvGuess1.setBackgroundResource(R.drawable.ic_guess_box_2)
                }
            }
            2 -> {
                mTvGuess6.text = s
                if (isCorrect) {
                    setTextDrawable(mTvGuess2, false)
                    setTextDrawable(mTvGuess5, false)
                    setTextDrawable(mTvGuess6, false)
                    setTextDrawable(mTvGuess7, false)
                    setTextDrawable(mTvGuess8, false)
                    setTextDrawable(mTvGuess10, false)
                    setTextDrawable(mTvGuess14, false)
                } else {
                    mTvGuess6.setBackgroundResource(R.drawable.ic_guess_box_2)
                }
            }
            3 -> {
                mTvGuess11.text = s
                if (isCorrect) {
                    setTextDrawable(mTvGuess3, false)
                    setTextDrawable(mTvGuess7, false)
                    setTextDrawable(mTvGuess11, false)
                    setTextDrawable(mTvGuess15, false)
                    setTextDrawable(mTvGuess9, false)
                    setTextDrawable(mTvGuess10, false)
                    setTextDrawable(mTvGuess12, false)
                } else {
                    mTvGuess11.setBackgroundResource(R.drawable.ic_guess_box_2)
                }
            }
            4 -> {
                mTvGuess16.text = s
                if (isCorrect) {
                    setTextDrawable(mTvGuess4, false)
                    setTextDrawable(mTvGuess8, false)
                    setTextDrawable(mTvGuess12, false)
                    setTextDrawable(mTvGuess16, false)
                    setTextDrawable(mTvGuess13, false)
                    setTextDrawable(mTvGuess14, false)
                    setTextDrawable(mTvGuess15, false)
                } else {
                    mTvGuess16.setBackgroundResource(R.drawable.ic_guess_box_2)
                }
            }
        }
    }


    private fun setTextDrawable(textView: AppCompatTextView, isInit: Boolean) {
        textView.setBackGroundRes(isInit, R.drawable.ic_guess_box_1, R.drawable.ic_guess_box_3)
        textView.setTextColor(if (isInit) Color.parseColor("#000000") else Color.parseColor("#FFFFFF"))
    }

}