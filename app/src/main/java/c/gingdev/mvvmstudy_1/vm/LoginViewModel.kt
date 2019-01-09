package c.gingdev.mvvmstudy_1.vm

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.android.databinding.library.baseAdapters.BR
import c.gingdev.mvvmstudy_1.model.User

class LoginViewModel: BaseObservable {

  constructor() {
    user = User("", "")
  }

  private val user: User

  private val successMessage: String = "Successfully Logined"
  private val failedMessage: String = "failed to Login"

  @Bindable
  var toastMessage: String? = null

  fun SetToastMessage(toastMessage: String) {
    this.toastMessage = toastMessage
    notifyPropertyChanged(BR.toastMessage)
  }

  fun afterEmailTextChanged(s: CharSequence) = user.setEmail(s.toString())
  fun afterPasswordTextChanged(s: CharSequence) = user.setPassword(s.toString())

  fun onLoginClicked() {
    if (user.isInputDataValid())
      SetToastMessage(successMessage)
    else
      SetToastMessage(failedMessage)
  }
}