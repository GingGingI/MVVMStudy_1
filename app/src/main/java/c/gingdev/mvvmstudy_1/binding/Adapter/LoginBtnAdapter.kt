package c.gingdev.mvvmstudy_1.binding.Adapter

import android.databinding.BindingAdapter
import android.view.View
import android.widget.Toast

class LoginBtnAdapter {
    @BindingAdapter("toastMessage")
    fun CheckLogined(v: View, message: String?) {
        if (message != null)
            Toast.makeText(v.context, message, Toast.LENGTH_LONG).show()
    }
}