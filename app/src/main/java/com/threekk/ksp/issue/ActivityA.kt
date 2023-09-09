package com.threekk.ksp.issue

import android.content.Context
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class ActivityA: AppCompatActivity() {

    @Inject
    lateinit var foo: Foo


    @CallSuper
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
    }
}
