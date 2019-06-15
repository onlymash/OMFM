package com.dekoservidoni.omfmsample

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.dekoservidoni.omfm.OneMoreFabMenu

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), OneMoreFabMenu.OptionsClick {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOptionsClick(this@MainActivity)
    }

    override fun onOptionClick(optionId: Int?) {

        val text = when(optionId) {
            R.id.option1 -> "Option 1 clicked!"
            R.id.option2 -> "Option 2 clicked!"
            R.id.option3 -> "Option 3 clicked!"
            R.id.option4 -> "Option 4 clicked!"
            else -> ""
        }

        if(text.isNotEmpty()) {
            Snackbar.make(fragment.view as View, text, Snackbar.LENGTH_SHORT)
                    .setAction("Done", null).show()
        }
    }
}
