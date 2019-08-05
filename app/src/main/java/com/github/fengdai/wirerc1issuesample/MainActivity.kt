package com.github.fengdai.wirerc1issuesample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.fengdai.protos.Orientation

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val orientation = Orientation.EXPENSE
    findViewById<TextView>(android.R.id.text1).text = orientation.toString()
  }
}
