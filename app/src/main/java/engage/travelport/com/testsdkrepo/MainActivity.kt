package engage.travelport.com.testsdkrepo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import engage.travelport.com.engage_sdk.MyLibClass

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    MyLibClass.provideLog()
  }
}
