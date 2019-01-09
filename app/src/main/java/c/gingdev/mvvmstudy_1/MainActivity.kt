package c.gingdev.mvvmstudy_1

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import c.gingdev.mvvmstudy_1.binding.BindComponent
import c.gingdev.mvvmstudy_1.databinding.ActivityMainBinding
import c.gingdev.mvvmstudy_1.vm.LoginViewModel

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    ViewModel 바인드.
    val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main, BindComponent())
    binding.vm = LoginViewModel()
    binding.executePendingBindings()
  }
}
