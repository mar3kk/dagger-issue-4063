package com.threekk.ksp.issue

import android.os.Bundle
import android.os.PersistableBundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ActivityB: ActivityA() {

    @Inject
    lateinit var bar: Bar

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        super.onResume()
    }
}
