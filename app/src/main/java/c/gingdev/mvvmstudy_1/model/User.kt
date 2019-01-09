package c.gingdev.mvvmstudy_1.model

import android.text.TextUtils
import android.util.Patterns

class User(private var email: String, private var password: String) {
  fun getEmail() = email
  fun getPassword() = password
  fun setEmail(email: String) { this.email = email}
  fun setPassword(password: String) { this.password = password}
  fun isInputDataValid(): Boolean = !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length > 5
}