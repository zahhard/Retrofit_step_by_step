package data

import android.util.Log

class UserLocalDataSource {

    fun setUser(user: User) {
        //save in database >  userDao.save(user)
        Log.d("panjshanbe" , "save user in db")
    }
}