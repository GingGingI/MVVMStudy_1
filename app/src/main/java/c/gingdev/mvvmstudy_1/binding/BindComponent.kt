package c.gingdev.mvvmstudy_1.binding

import android.databinding.DataBindingComponent
import c.gingdev.mvvmstudy_1.binding.Adapter.LoginBtnAdapter

class BindComponent: DataBindingComponent {
  override fun getLoginBtnAdapter(): LoginBtnAdapter = LoginBtnAdapter()
}