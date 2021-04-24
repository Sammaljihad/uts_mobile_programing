package sam.rdev.catatanpenjualansayur.activity.login

import sam.rdev.catatanpenjualansayur.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}